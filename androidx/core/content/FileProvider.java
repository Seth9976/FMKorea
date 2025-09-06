package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    static abstract class a {
        static File[] a(Context context0) {
            return context0.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri arg1);

        Uri b(File arg1);
    }

    static class c implements b {
        private final String a;
        private final HashMap b;

        c(String s) {
            this.b = new HashMap();
            this.a = s;
        }

        @Override  // androidx.core.content.FileProvider$b
        public File a(Uri uri0) {
            File file2;
            String s = uri0.getEncodedPath();
            int v = s.indexOf(0x2F, 1);
            String s1 = Uri.decode(s.substring(1, v));
            String s2 = Uri.decode(s.substring(v + 1));
            File file0 = (File)this.b.get(s1);
            if(file0 == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri0);
            }
            File file1 = new File(file0, s2);
            try {
                file2 = file1.getCanonicalFile();
            }
            catch(IOException unused_ex) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file1);
            }
            if(!this.d(file2.getPath(), file0.getPath())) {
                throw new SecurityException("Resolved path jumped beyond configured root");
            }
            return file2;
        }

        @Override  // androidx.core.content.FileProvider$b
        public Uri b(File file0) {
            String s;
            try {
                s = file0.getCanonicalPath();
            }
            catch(IOException unused_ex) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file0);
            }
            Map.Entry map$Entry0 = null;
            for(Object object0: this.b.entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                String s1 = ((File)map$Entry1.getValue()).getPath();
                if(this.d(s, s1) && (map$Entry0 == null || s1.length() > ((File)map$Entry0.getValue()).getPath().length())) {
                    map$Entry0 = map$Entry1;
                }
            }
            if(map$Entry0 == null) {
                throw new IllegalArgumentException("Failed to find configured root that contains " + s);
            }
            String s2 = ((File)map$Entry0.getValue()).getPath();
            return s2.endsWith("/") ? new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(((String)map$Entry0.getKey())) + '/' + Uri.encode(s.substring(s2.length()), "/")).build() : new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(((String)map$Entry0.getKey())) + '/' + Uri.encode(s.substring(s2.length() + 1), "/")).build();
        }

        void c(String s, File file0) {
            File file1;
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                file1 = file0.getCanonicalFile();
            }
            catch(IOException iOException0) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file0, iOException0);
            }
            this.b.put(s, file1);
        }

        private boolean d(String s, String s1) {
            String s2 = FileProvider.k(s);
            String s3 = FileProvider.k(s1);
            return s2.equals(s3) || s2.startsWith(s3 + '/');
        }
    }

    private final Object f;
    private String g;
    private b h;
    private final int i;
    private static final String[] j;
    private static final File k;
    private static final HashMap l;

    static {
        FileProvider.j = new String[]{"_display_name", "_size"};
        FileProvider.k = new File("/");
        FileProvider.l = new HashMap();
    }

    public FileProvider() {
        this(0);
    }

    protected FileProvider(int v) {
        this.f = new Object();
        this.i = v;
    }

    @Override  // android.content.ContentProvider
    public void attachInfo(Context context0, ProviderInfo providerInfo0) {
        super.attachInfo(context0, providerInfo0);
        if(providerInfo0.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if(!providerInfo0.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String s = providerInfo0.authority.split(";")[0];
        synchronized(this.f) {
            this.g = s;
        }
        synchronized(FileProvider.l) {
            FileProvider.l.remove(s);
        }
    }

    private static File b(File file0, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s != null) {
                file0 = new File(file0, s);
            }
        }
        return file0;
    }

    private static Object[] c(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[v];
        System.arraycopy(arr_object, 0, arr_object1, 0, v);
        return arr_object1;
    }

    private static String[] d(String[] arr_s, int v) {
        String[] arr_s1 = new String[v];
        System.arraycopy(arr_s, 0, arr_s1, 0, v);
        return arr_s1;
    }

    @Override  // android.content.ContentProvider
    public int delete(Uri uri0, String s, String[] arr_s) {
        return this.f().a(uri0).delete();
    }

    static XmlResourceParser e(Context context0, String s, ProviderInfo providerInfo0, int v) {
        if(providerInfo0 == null) {
            throw new IllegalArgumentException("Couldn\'t find meta-data for provider with authority " + s);
        }
        if(providerInfo0.metaData == null && v != 0) {
            Bundle bundle0 = new Bundle(1);
            providerInfo0.metaData = bundle0;
            bundle0.putInt("android.support.FILE_PROVIDER_PATHS", v);
        }
        XmlResourceParser xmlResourceParser0 = providerInfo0.loadXmlMetaData(context0.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if(xmlResourceParser0 == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        return xmlResourceParser0;
    }

    private b f() {
        synchronized(this.f) {
            B.c.d(this.g, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            if(this.h == null) {
                this.h = FileProvider.g(this.getContext(), this.g, this.i);
            }
            return this.h;
        }
    }

    private static b g(Context context0, String s, int v) {
        HashMap hashMap0 = FileProvider.l;
        synchronized(hashMap0) {
            b fileProvider$b0 = (b)hashMap0.get(s);
            if(fileProvider$b0 == null) {
                try {
                    fileProvider$b0 = FileProvider.j(context0, s, v);
                }
                catch(IOException iOException0) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", iOException0);
                }
                catch(XmlPullParserException xmlPullParserException0) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", xmlPullParserException0);
                }
                hashMap0.put(s, fileProvider$b0);
            }
            return fileProvider$b0;
        }
    }

    @Override  // android.content.ContentProvider
    public String getType(Uri uri0) {
        File file0 = this.f().a(uri0);
        int v = file0.getName().lastIndexOf(46);
        if(v >= 0) {
            String s = file0.getName().substring(v + 1);
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
            return s1 == null ? "application/octet-stream" : s1;
        }
        return "application/octet-stream";
    }

    @Override  // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri0) {
        return "application/octet-stream";
    }

    public static Uri h(Context context0, String s, File file0) {
        return FileProvider.g(context0, s, 0).b(file0);
    }

    private static int i(String s) {
        if("r".equals(s)) {
            return 0x10000000;
        }
        if(!"w".equals(s) && !"wt".equals(s)) {
            if("wa".equals(s)) {
                return 0x2A000000;
            }
            if("rw".equals(s)) {
                return 0x38000000;
            }
            if(!"rwt".equals(s)) {
                throw new IllegalArgumentException("Invalid mode: " + s);
            }
            return 0x3C000000;
        }
        return 0x2C000000;
    }

    @Override  // android.content.ContentProvider
    public Uri insert(Uri uri0, ContentValues contentValues0) {
        throw new UnsupportedOperationException("No external inserts");
    }

    private static b j(Context context0, String s, int v) {
        b fileProvider$b0 = new c(s);
        XmlResourceParser xmlResourceParser0 = FileProvider.e(context0, s, context0.getPackageManager().resolveContentProvider(s, 0x80), v);
    alab1:
        while(true) {
            switch(xmlResourceParser0.next()) {
                case 1: {
                    break alab1;
                }
                case 2: {
                    String s1 = xmlResourceParser0.getName();
                    File file0 = null;
                    String s2 = xmlResourceParser0.getAttributeValue(null, "name");
                    String s3 = xmlResourceParser0.getAttributeValue(null, "path");
                    if("root-path".equals(s1)) {
                        file0 = FileProvider.k;
                    }
                    else if("files-path".equals(s1)) {
                        file0 = context0.getFilesDir();
                    }
                    else if("cache-path".equals(s1)) {
                        file0 = context0.getCacheDir();
                    }
                    else if("external-path".equals(s1)) {
                        file0 = Environment.getExternalStorageDirectory();
                    }
                    else if("external-files-path".equals(s1)) {
                        File[] arr_file = androidx.core.content.a.getExternalFilesDirs(context0, null);
                        if(arr_file.length > 0) {
                            file0 = arr_file[0];
                        }
                    }
                    else if("external-cache-path".equals(s1)) {
                        File[] arr_file1 = androidx.core.content.a.getExternalCacheDirs(context0);
                        if(arr_file1.length > 0) {
                            file0 = arr_file1[0];
                        }
                    }
                    else if("external-media-path".equals(s1)) {
                        File[] arr_file2 = a.a(context0);
                        if(arr_file2.length > 0) {
                            file0 = arr_file2[0];
                        }
                    }
                    if(file0 == null) {
                        break;
                    }
                    ((c)fileProvider$b0).c(s2, FileProvider.b(file0, new String[]{s3}));
                }
            }
        }
        return fileProvider$b0;
    }

    private static String k(String s) {
        return s.length() <= 0 || s.charAt(s.length() - 1) != 0x2F ? s : s.substring(0, s.length() - 1);
    }

    @Override  // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override  // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri0, String s) {
        return ParcelFileDescriptor.open(this.f().a(uri0), FileProvider.i(s));
    }

    @Override  // android.content.ContentProvider
    public Cursor query(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        File file0 = this.f().a(uri0);
        String s2 = uri0.getQueryParameter("displayName");
        if(arr_s == null) {
            arr_s = FileProvider.j;
        }
        String[] arr_s2 = new String[arr_s.length];
        Object[] arr_object = new Object[arr_s.length];
        int v1 = 0;
        for(int v = 0; v < arr_s.length; ++v) {
            String s3 = arr_s[v];
            if("_display_name".equals(s3)) {
                arr_s2[v1] = "_display_name";
                arr_object[v1] = s2 == null ? file0.getName() : s2;
                ++v1;
            }
            else if("_size".equals(s3)) {
                arr_s2[v1] = "_size";
                arr_object[v1] = file0.length();
                ++v1;
            }
        }
        String[] arr_s3 = FileProvider.d(arr_s2, v1);
        Object[] arr_object1 = FileProvider.c(arr_object, v1);
        Cursor cursor0 = new MatrixCursor(arr_s3, 1);
        ((MatrixCursor)cursor0).addRow(arr_object1);
        return cursor0;
    }

    @Override  // android.content.ContentProvider
    public int update(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        throw new UnsupportedOperationException("No external updates");
    }
}

