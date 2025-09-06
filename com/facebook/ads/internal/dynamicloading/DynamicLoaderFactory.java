package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityThread;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds.InitListener;
import com.facebook.ads.AudienceNetworkAds.InitResult;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.internal.util.common.Preconditions;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Keep
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX = "audience_network.dex";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can\'t load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    public static final boolean LOAD_FROM_ASSETS = false;
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static final AtomicReference sDynamicLoader;
    private static boolean sFallbackMode;
    private static final AtomicBoolean sInitializing;
    private static boolean sUseLegacyClassLoader;

    static {
        DynamicLoaderFactory.LOAD_FROM_ASSETS = true;
        DynamicLoaderFactory.sDynamicLoader = new AtomicReference();
        DynamicLoaderFactory.sInitializing = new AtomicBoolean();
        DynamicLoaderFactory.sUseLegacyClassLoader = true;
    }

    private static InitResult createErrorInitResult(Throwable throwable0) {
        class c implements InitResult {
            final Throwable a;

            c(Throwable throwable0) {
            }

            @Override  // com.facebook.ads.AudienceNetworkAds$InitResult
            public String getMessage() {
                return DynamicLoaderFactory.createErrorMessage(this.a);
            }

            @Override  // com.facebook.ads.AudienceNetworkAds$InitResult
            public boolean isSuccess() {
                return false;
            }
        }

        return new c(throwable0);
    }

    private static String createErrorMessage(Throwable throwable0) {
        return "Can\'t load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.\n" + DynamicLoaderFactory.stackTraceToString(throwable0);
    }

    @TargetApi(26)
    private static ClassLoader createInMemoryClassLoader(Context context0) {
        InputStream inputStream0 = context0.getAssets().open("audience_network.dex");
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        inputStream0.close();
        byteArrayOutputStream0.flush();
        byteArrayOutputStream0.close();
        return a.a(ByteBuffer.wrap(byteArrayOutputStream0.toByteArray()), DynamicLoaderFactory.class.getClassLoader());
    }

    private static void doCallInitialize(Context context0, DynamicLoader dynamicLoader0, Throwable throwable0, boolean z, MultithreadedBundleWrapper multithreadedBundleWrapper0, InitListener audienceNetworkAds$InitListener0) {
        class b implements Runnable {
            final InitListener f;
            final Throwable g;

            b(InitListener audienceNetworkAds$InitListener0, Throwable throwable0) {
                this.g = throwable0;
                super();
            }

            @Override
            public void run() {
                InitResult audienceNetworkAds$InitResult0 = DynamicLoaderFactory.createErrorInitResult(this.g);
                this.f.onInitialized(audienceNetworkAds$InitResult0);
            }
        }

        if(throwable0 != null) {
            if(audienceNetworkAds$InitListener0 != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(audienceNetworkAds$InitListener0, throwable0), 100L);
                return;
            }
            Log.e("FBAudienceNetwork", "Can\'t load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.", throwable0);
            return;
        }
        if(dynamicLoader0 != null) {
            if(z) {
                dynamicLoader0.createAudienceNetworkAdsApi().onContentProviderCreated(context0);
                return;
            }
            dynamicLoader0.createAudienceNetworkAdsApi().initialize(context0, multithreadedBundleWrapper0, audienceNetworkAds$InitListener0);
        }
    }

    private static DynamicLoader doMakeLoader(Context context0, boolean z) {
        DynamicLoader dynamicLoader1;
        AtomicReference atomicReference0 = DynamicLoaderFactory.sDynamicLoader;
        DynamicLoader dynamicLoader0 = (DynamicLoader)atomicReference0.get();
        if(dynamicLoader0 == null) {
            if(DynamicLoaderFactory.LOAD_FROM_ASSETS) {
                dynamicLoader1 = (DynamicLoader)DynamicLoaderFactory.makeAdsSdkClassLoader(context0.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
                Log.d("FBAudienceNetwork", "SDK dex loading time: " + 0L);
            }
            else {
                dynamicLoader1 = (DynamicLoader)Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            }
            if(z) {
                dynamicLoader1.maybeInitInternally(context0);
            }
            atomicReference0.set(dynamicLoader1);
            return dynamicLoader1;
        }
        return dynamicLoader0;
    }

    // 去混淆评级： 低(20)
    @SuppressLint({"PrivateApi", "CatchGeneralException"})
    private static Context getApplicationContextViaReflection() {
        return ActivityThread.currentApplication();
    }

    private static File getCacheCodeDirLegacy(Context context0, File file0) {
        File file1 = new File(file0, "code_cache");
        try {
            DynamicLoaderFactory.mkdirChecked(file1);
        }
        catch(IOException unused_ex) {
            file1 = context0.getDir("code_cache", 0);
            DynamicLoaderFactory.mkdirChecked(file1);
        }
        return file1;
    }

    private static File getCodeCacheDir(Context context0, File file0) {
        return context0.getCodeCacheDir();
    }

    public static DynamicLoader getDynamicLoader() {
        return (DynamicLoader)DynamicLoaderFactory.sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file0) {
        File file1 = new File(file0, "audience_network");
        DynamicLoaderFactory.mkdirChecked(file1);
        return file1;
    }

    public static void initialize(Context context0, MultithreadedBundleWrapper multithreadedBundleWrapper0, InitListener audienceNetworkAds$InitListener0, boolean z) {
        class com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.a implements Runnable {
            final Context f;
            final boolean g;
            final MultithreadedBundleWrapper h;
            final InitListener i;

            com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.a(Context context0, boolean z, MultithreadedBundleWrapper multithreadedBundleWrapper0, InitListener audienceNetworkAds$InitListener0) {
                this.g = z;
                this.h = multithreadedBundleWrapper0;
                this.i = audienceNetworkAds$InitListener0;
                super();
            }

            @Override
            public void run() {
                DynamicLoader dynamicLoader0;
                int v;
                Throwable throwable1;
                ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f);
                Class class0 = DynamicLoaderFactory.class;
                __monitor_enter(class0);
                try {
                    throwable1 = null;
                    v = 0;
                    while(true) {
                    label_5:
                        dynamicLoader0 = DynamicLoaderFactory.doMakeLoader(this.f, false);
                        break;
                    }
                }
                catch(Throwable throwable0) {
                    try {
                        if(v == 2) {
                            if(!this.g) {
                                String s = DynamicLoaderFactory.createErrorMessage(throwable0);
                                DexLoadErrorReporter.reportDexLoadingIssue(this.f, s, 0.1);
                                DynamicLoaderFactory.setFallbackMode(true);
                            }
                            throwable1 = throwable0;
                        }
                        else {
                            SystemClock.sleep(200L);
                        }
                        ++v;
                        goto label_5;
                    }
                    catch(Throwable throwable2) {
                        __monitor_exit(class0);
                        throw throwable2;
                    }
                }
                __monitor_exit(class0);
                DynamicLoaderFactory.doCallInitialize(this.f, dynamicLoader0, throwable1, this.g, this.h, this.i);
                DynamicLoaderFactory.sInitializing.set(false);
            }
        }

        if(z || !DynamicLoaderFactory.sInitializing.getAndSet(true)) {
            new Thread(new com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.a(context0, z, multithreadedBundleWrapper0, audienceNetworkAds$InitListener0)).start();
        }
    }

    public static boolean isFallbackMode() {
        synchronized(DynamicLoaderFactory.class) {
        }
        return DynamicLoaderFactory.sFallbackMode;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return DynamicLoaderFactory.createInMemoryClassLoader(context0);
        }
        if(DynamicLoaderFactory.sUseLegacyClassLoader) {
            return DynamicLoaderFactory.makeLegacyAdsSdkClassLoader(context0);
        }
        File file0 = DynamicLoaderFactory.getSecondaryDir(DynamicLoaderFactory.getCodeCacheDir(context0, new File(context0.getApplicationInfo().dataDir)));
        String s = file0.getPath() + "/" + "audience_network.dex";
        InputStream inputStream0 = context0.getAssets().open("audience_network.dex");
        FileOutputStream fileOutputStream0 = new FileOutputStream(s);
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            fileOutputStream0.write(arr_b, 0, v);
        }
        inputStream0.close();
        fileOutputStream0.flush();
        fileOutputStream0.close();
        File file1 = new File(file0.getPath() + "/" + "optimized");
        DynamicLoaderFactory.mkdirChecked(file1);
        return new DexClassLoader(s, file1.getPath(), null, context0.getClassLoader());
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context0) {
        String s = context0.getFilesDir().getPath() + "/" + "audience_network.dex";
        InputStream inputStream0 = context0.getAssets().open("audience_network.dex");
        FileOutputStream fileOutputStream0 = new FileOutputStream(s);
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) > 0) {
            fileOutputStream0.write(arr_b, 0, v);
        }
        inputStream0.close();
        fileOutputStream0.flush();
        fileOutputStream0.close();
        return new DexClassLoader(s, context0.getDir("optimized", 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
    }

    public static DynamicLoader makeLoader(Context context0) {
        synchronized(DynamicLoaderFactory.class) {
            return DynamicLoaderFactory.makeLoader(context0, true);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static DynamicLoader makeLoader(Context context0, boolean z) {
        synchronized(DynamicLoaderFactory.class) {
            Preconditions.checkNotNull(context0, "Context can not be null.");
            try {
                return DynamicLoaderFactory.doMakeLoader(context0, z);
            }
            catch(Throwable throwable0) {
                Log.e("FBAudienceNetwork", "Can\'t load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.", throwable0);
                DexLoadErrorReporter.reportDexLoadingIssue(context0, DynamicLoaderFactory.createErrorMessage(throwable0), 0.1);
                DynamicLoader dynamicLoader1 = DynamicLoaderFallback.makeFallbackLoader();
                DynamicLoaderFactory.sDynamicLoader.set(dynamicLoader1);
                DynamicLoaderFactory.sFallbackMode = true;
                return dynamicLoader1;
            }
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static DynamicLoader makeLoaderUnsafe() {
        synchronized(DynamicLoaderFactory.class) {
            AtomicReference atomicReference0 = DynamicLoaderFactory.sDynamicLoader;
            if(atomicReference0.get() == null) {
                Context context0 = DynamicLoaderFactory.getApplicationContextViaReflection();
                if(context0 == null) {
                    throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
                }
                return DynamicLoaderFactory.makeLoader(context0, true);
            }
            return (DynamicLoader)atomicReference0.get();
        }
    }

    private static void mkdirChecked(File file0) {
        file0.mkdir();
        if(!file0.isDirectory()) {
            File file1 = file0.getParentFile();
            String s = file1 == null ? "Failed to create dir " + file0.getPath() + ". Parent file is null." : "Failed to create dir " + file0.getPath() + ". parent file is a dir " + file1.isDirectory() + ", a file " + file1.isFile() + ", exists " + file1.exists() + ", readable " + file1.canRead() + ", writable " + file1.canWrite();
            Log.e("FBAudienceNetwork", s);
            throw new IOException("Failed to create directory " + file0.getPath() + ", detailed message: " + s);
        }
    }

    public static void setFallbackMode(boolean z) {
        synchronized(DynamicLoaderFactory.class) {
            if(z) {
                DynamicLoader dynamicLoader0 = DynamicLoaderFallback.makeFallbackLoader();
                DynamicLoaderFactory.sDynamicLoader.set(dynamicLoader0);
                DynamicLoaderFactory.sFallbackMode = true;
            }
            else {
                DynamicLoaderFactory.sDynamicLoader.set(null);
                DynamicLoaderFactory.sFallbackMode = false;
            }
        }
    }

    public static void setUseLegacyClassLoader(boolean z) {
        DynamicLoaderFactory.sUseLegacyClassLoader = z;
    }

    private static String stackTraceToString(Throwable throwable0) {
        return Log.getStackTraceString(throwable0);
    }
}

