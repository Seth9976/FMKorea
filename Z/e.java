package z;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class e {
    interface a {
        Cursor a(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5, CancellationSignal arg6);

        void close();
    }

    static class b implements a {
        private final ContentProviderClient a;

        b(Context context0, Uri uri0) {
            this.a = context0.getContentResolver().acquireUnstableContentProviderClient(uri0);
        }

        @Override  // z.e$a
        public Cursor a(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 == null) {
                return null;
            }
            try {
                return contentProviderClient0.query(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
            }
            catch(RemoteException remoteException0) {
                Log.w("FontsProvider", "Unable to query the content provider", remoteException0);
                return null;
            }
        }

        @Override  // z.e$a
        public void close() {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 != null) {
                contentProviderClient0.release();
            }
        }
    }

    static class c implements a {
        private final ContentProviderClient a;

        c(Context context0, Uri uri0) {
            this.a = context0.getContentResolver().acquireUnstableContentProviderClient(uri0);
        }

        @Override  // z.e$a
        public Cursor a(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1, CancellationSignal cancellationSignal0) {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 == null) {
                return null;
            }
            try {
                return contentProviderClient0.query(uri0, arr_s, s, arr_s1, s1, cancellationSignal0);
            }
            catch(RemoteException remoteException0) {
                Log.w("FontsProvider", "Unable to query the content provider", remoteException0);
                return null;
            }
        }

        @Override  // z.e$a
        public void close() {
            ContentProviderClient contentProviderClient0 = this.a;
            if(contentProviderClient0 != null) {
                contentProviderClient0.release();
            }
        }
    }

    private static final Comparator a;

    static {
        e.a = (byte[] arr_b, byte[] arr_b1) -> e.g(arr_b, arr_b1);
    }

    // 检测为 Lambda 实现
    public static int a(byte[] arr_b, byte[] arr_b1) [...]

    private static List b(Signature[] arr_signature) {
        List list0 = new ArrayList();
        for(int v = 0; v < arr_signature.length; ++v) {
            list0.add(arr_signature[v].toByteArray());
        }
        return list0;
    }

    private static boolean c(List list0, List list1) {
        if(list0.size() != list1.size()) {
            return false;
        }
        for(int v = 0; v < list0.size(); ++v) {
            if(!Arrays.equals(((byte[])list0.get(v)), ((byte[])list1.get(v)))) {
                return false;
            }
        }
        return true;
    }

    private static List d(f f0, Resources resources0) {
        return f0.b() == null ? androidx.core.content.res.e.c(resources0, f0.c()) : f0.b();
    }

    static z.h.a e(Context context0, f f0, CancellationSignal cancellationSignal0) {
        ProviderInfo providerInfo0 = e.f(context0.getPackageManager(), f0, context0.getResources());
        return providerInfo0 == null ? z.h.a.a(1, null) : z.h.a.a(0, e.h(context0, f0, providerInfo0.authority, cancellationSignal0));
    }

    static ProviderInfo f(PackageManager packageManager0, f f0, Resources resources0) {
        String s = f0.e();
        ProviderInfo providerInfo0 = packageManager0.resolveContentProvider(s, 0);
        if(providerInfo0 == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + s);
        }
        if(!providerInfo0.packageName.equals(f0.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + s + ", but package was not " + f0.f());
        }
        List list0 = e.b(packageManager0.getPackageInfo(providerInfo0.packageName, 0x40).signatures);
        Collections.sort(list0, e.a);
        List list1 = e.d(f0, resources0);
        for(int v = 0; v < list1.size(); ++v) {
            ArrayList arrayList0 = new ArrayList(((Collection)list1.get(v)));
            Collections.sort(arrayList0, e.a);
            if(e.c(list0, arrayList0)) {
                return providerInfo0;
            }
        }
        return null;
    }

    private static int g(byte[] arr_b, byte[] arr_b1) {
        if(arr_b.length != arr_b1.length) {
            return arr_b.length - arr_b1.length;
        }
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            int v2 = arr_b1[v];
            if(v1 != v2) {
                return v1 - v2;
            }
        }
        return 0;
    }

    static z.h.b[] h(Context context0, f f0, String s, CancellationSignal cancellationSignal0) {
        Cursor cursor0;
        Uri uri2;
        ArrayList arrayList2;
        ArrayList arrayList0 = new ArrayList();
        Uri uri0 = new Uri.Builder().scheme("content").authority(s).build();
        Uri uri1 = new Uri.Builder().scheme("content").authority(s).appendPath("file").build();
        a e$a0 = d.a(context0, uri0);
        try {
            cursor0 = e$a0.a(uri0, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{f0.g()}, null, cancellationSignal0);
            if(cursor0 != null && cursor0.getCount() > 0) {
                int v1 = cursor0.getColumnIndex("result_code");
                ArrayList arrayList1 = new ArrayList();
                int v2 = cursor0.getColumnIndex("_id");
                int v3 = cursor0.getColumnIndex("file_id");
                int v4 = cursor0.getColumnIndex("font_ttc_index");
                int v5 = cursor0.getColumnIndex("font_weight");
                int v6 = cursor0.getColumnIndex("font_italic");
                while(cursor0.moveToNext()) {
                    int v7 = v1 == -1 ? 0 : cursor0.getInt(v1);
                    int v8 = v4 == -1 ? 0 : cursor0.getInt(v4);
                    if(v3 == -1) {
                        arrayList2 = arrayList1;
                        uri2 = ContentUris.withAppendedId(uri0, cursor0.getLong(v2));
                    }
                    else {
                        arrayList2 = arrayList1;
                        uri2 = ContentUris.withAppendedId(uri1, cursor0.getLong(v3));
                    }
                    arrayList1 = arrayList2;
                    arrayList1.add(z.h.b.a(uri2, v8, (v5 == -1 ? 400 : cursor0.getInt(v5)), v6 != -1 && cursor0.getInt(v6) == 1, v7));
                }
                arrayList0 = arrayList1;
            }
        }
        finally {
            if(cursor0 != null) {
                cursor0.close();
            }
            e$a0.close();
        }
        return (z.h.b[])arrayList0.toArray(new z.h.b[0]);
    }
}

