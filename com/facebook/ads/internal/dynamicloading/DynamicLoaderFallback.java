package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView.AdViewLoadConfigBuilder;
import com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder;
import com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder;
import com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
class DynamicLoaderFallback {
    static class c {
        class a implements InvocationHandler {
            final c a;

            @Override
            public Object invoke(Object object0, Method method0, Object[] arr_object) {
                if(!"toString".equals(method0.getName())) {
                    c.this.a = method0;
                }
                return null;
            }
        }

        private Method a;
        private final InvocationHandler b;

        private c() {
            this.b = new a(this);
        }

        c(com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.a dynamicLoaderFallback$a0) {
        }

        Method b() {
            return this.a;
        }

        public Object c(Class class0) {
            return class0.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{class0}, this.b));
        }
    }

    private static final WeakHashMap sApiProxyToAdListenersMap;

    static {
        DynamicLoaderFallback.sApiProxyToAdListenersMap = new WeakHashMap();
    }

    private static boolean equalsMethodParams(Method method0, Method method1) {
        return Arrays.equals(method0.getParameterTypes(), method1.getParameterTypes());
    }

    // 去混淆评级： 低(30)
    private static boolean equalsMethods(Method method0, Method method1) {
        return method0 != null && method1 != null && method0.getDeclaringClass().equals(method1.getDeclaringClass()) && method0.getName().equals(method1.getName()) && DynamicLoaderFallback.equalsMethodParams(method0, method1);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    static DynamicLoader makeFallbackLoader() {
        class com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.a implements InvocationHandler {
            final List a;
            final Map b;
            final List c;
            final List d;
            final Map e;
            final List f;
            final List g;
            final Method h;
            final Method i;

            com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.a(List list0, Map map0, List list1, List list2, Map map1, List list3, List list4, Method method0, Method method1) {
                this.b = map0;
                this.c = list1;
                this.d = list2;
                this.e = map1;
                this.f = list3;
                this.g = list4;
                this.h = method0;
                this.i = method1;
                super();
            }

            @Override
            public Object invoke(Object object0, Method method0, Object[] arr_object) {
                Object object3;
                if(method0.getReturnType().isPrimitive()) {
                    if(method0.getReturnType().equals(Void.TYPE)) {
                        for(Object object1: this.a) {
                            if(DynamicLoaderFallback.equalsMethods(method0, ((Method)object1)) && DynamicLoaderFallback.reportError(object0, this.b)) {
                                break;
                            }
                        }
                        for(Object object2: this.c) {
                            if(DynamicLoaderFallback.equalsMethods(method0, ((Method)object2)) && DynamicLoaderFallback.reportError(object0, this.b)) {
                                break;
                            }
                        }
                        return null;
                    }
                    return Array.get(Array.newInstance(method0.getReturnType(), 1), 0);
                }
                if(method0.getReturnType().equals(String.class)) {
                    return "";
                }
                if(method0.getReturnType().equals(object0.getClass().getInterfaces()[0])) {
                    object3 = object0;
                }
                else {
                    Class[] arr_class = {method0.getReturnType()};
                    object3 = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), arr_class, this);
                }
                for(Object object4: this.d) {
                    if(DynamicLoaderFallback.equalsMethods(method0, ((Method)object4))) {
                        DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.e.get(object0), ((AdListener)arr_object[0]));
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                for(Object object5: this.f) {
                    if(DynamicLoaderFallback.equalsMethods(method0, ((Method)object5))) {
                        this.e.put(object3, object0);
                    }
                }
                for(Object object6: this.g) {
                    if(DynamicLoaderFallback.equalsMethods(method0, ((Method)object6))) {
                        for(int v = 0; v < arr_object.length; ++v) {
                            Object object7 = arr_object[v];
                            if(object7 instanceof Ad) {
                                this.b.put(object3, ((Ad)object7));
                            }
                        }
                    }
                }
                if(DynamicLoaderFallback.equalsMethods(method0, this.h)) {
                    this.b.put(arr_object[1], ((Ad)arr_object[0]));
                }
                if(DynamicLoaderFallback.equalsMethods(method0, this.i)) {
                    this.b.put(arr_object[1], ((Ad)arr_object[0]));
                }
                return object3;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        c dynamicLoaderFallback$c0 = new c(null);
        Class class0 = DynamicLoader.class;
        DynamicLoader dynamicLoader0 = (DynamicLoader)dynamicLoaderFallback$c0.c(class0);
        dynamicLoader0.createInterstitialAd(null, null, null);
        arrayList4.add(dynamicLoaderFallback$c0.b());
        dynamicLoader0.createRewardedVideoAd(null, null, null);
        arrayList4.add(dynamicLoaderFallback$c0.b());
        dynamicLoader0.createAdViewApi(null, null, null, null, null);
        arrayList4.add(dynamicLoaderFallback$c0.b());
        try {
            dynamicLoader0.createAdViewApi(null, null, null, null, null);
        }
        catch(Exception unused_ex) {
        }
        arrayList4.add(dynamicLoaderFallback$c0.b());
        dynamicLoader0.createNativeAdApi(null, null);
        dynamicLoader0.createNativeBannerAdApi(null, null);
        NativeAdBaseApi nativeAdBaseApi0 = (NativeAdBaseApi)dynamicLoaderFallback$c0.c(NativeAdBaseApi.class);
        nativeAdBaseApi0.loadAd();
        arrayList0.add(dynamicLoaderFallback$c0.b());
        nativeAdBaseApi0.loadAd(null);
        arrayList1.add(dynamicLoaderFallback$c0.b());
        nativeAdBaseApi0.buildLoadAdConfig(null);
        arrayList3.add(dynamicLoaderFallback$c0.b());
        InterstitialAdApi interstitialAdApi0 = (InterstitialAdApi)dynamicLoaderFallback$c0.c(InterstitialAdApi.class);
        interstitialAdApi0.loadAd();
        arrayList0.add(dynamicLoaderFallback$c0.b());
        interstitialAdApi0.loadAd(null);
        arrayList1.add(dynamicLoaderFallback$c0.b());
        interstitialAdApi0.buildLoadAdConfig();
        arrayList3.add(dynamicLoaderFallback$c0.b());
        RewardedVideoAdApi rewardedVideoAdApi0 = (RewardedVideoAdApi)dynamicLoaderFallback$c0.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi0.loadAd();
        arrayList0.add(dynamicLoaderFallback$c0.b());
        rewardedVideoAdApi0.loadAd(null);
        arrayList1.add(dynamicLoaderFallback$c0.b());
        rewardedVideoAdApi0.buildLoadAdConfig();
        arrayList3.add(dynamicLoaderFallback$c0.b());
        AdViewApi adViewApi0 = (AdViewApi)dynamicLoaderFallback$c0.c(AdViewApi.class);
        adViewApi0.loadAd();
        arrayList0.add(dynamicLoaderFallback$c0.b());
        adViewApi0.loadAd(null);
        arrayList1.add(dynamicLoaderFallback$c0.b());
        adViewApi0.buildLoadAdConfig();
        arrayList3.add(dynamicLoaderFallback$c0.b());
        ((AdViewLoadConfigBuilder)dynamicLoaderFallback$c0.c(AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList2.add(dynamicLoaderFallback$c0.b());
        ((NativeAdLoadConfigBuilder)dynamicLoaderFallback$c0.c(NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList2.add(dynamicLoaderFallback$c0.b());
        ((InterstitialAdLoadConfigBuilder)dynamicLoaderFallback$c0.c(InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList2.add(dynamicLoaderFallback$c0.b());
        ((RewardedVideoAdLoadConfigBuilder)dynamicLoaderFallback$c0.c(RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList2.add(dynamicLoaderFallback$c0.b());
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.a dynamicLoaderFallback$a0 = new com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.a(arrayList0, hashMap0, arrayList1, arrayList2, hashMap1, arrayList3, arrayList4, dynamicLoaderFallback$c0.b(), dynamicLoaderFallback$c0.b());
        return (DynamicLoader)Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{class0}, dynamicLoaderFallback$a0);
    }

    private static boolean reportError(Object object0, Map map0) {
        class b implements Runnable {
            final AdListener f;
            final Ad g;

            b(AdListener adListener0, Ad ad0) {
                this.g = ad0;
                super();
            }

            @Override
            public void run() {
                AdError adError0 = new AdError(-1, "Can\'t load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.");
                this.f.onError(this.g, adError0);
            }
        }

        if(object0 == null) {
            return false;
        }
        AdListener adListener0 = (AdListener)DynamicLoaderFallback.sApiProxyToAdListenersMap.get(object0);
        Ad ad0 = (Ad)map0.get(object0);
        if(adListener0 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new b(adListener0, ad0), 500L);
            return true;
        }
        return false;
    }
}

