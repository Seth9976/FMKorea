package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.i;
import m3.o;
import z3.g;
import z3.k;

public final class w {
    static final class a extends e {
        @Override  // com.facebook.internal.w$e
        public String c() {
            return null;
        }

        @Override  // com.facebook.internal.w$e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void e() [...] // Inlined contents
    }

    static final class b extends e {
        public static final class com.facebook.internal.w.b.a {
            private com.facebook.internal.w.b.a() {
            }

            public com.facebook.internal.w.b.a(g g0) {
            }
        }

        public static final com.facebook.internal.w.b.a b;

        static {
            b.b = new com.facebook.internal.w.b.a(null);
        }

        @Override  // com.facebook.internal.w$e
        public String c() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override  // com.facebook.internal.w$e
        public String d() {
            return "com.facebook.lite";
        }
    }

    static final class c extends e {
        @Override  // com.facebook.internal.w$e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override  // com.facebook.internal.w$e
        public String d() {
            return "com.facebook.katana";
        }
    }

    static final class d extends e {
        @Override  // com.facebook.internal.w$e
        public String c() {
            return null;
        }

        @Override  // com.facebook.internal.w$e
        public String d() {
            return "com.facebook.orca";
        }

        public Void e() [...] // Inlined contents
    }

    public static abstract class e {
        private TreeSet a;

        public final void a(boolean z) {
            synchronized(this) {
                if(z || (this.a == null || this.a.isEmpty())) {
                    this.a = w.a(w.g, this);
                }
            }
        }

        public final TreeSet b() {
            if(this.a == null || this.a.isEmpty()) {
                this.a(false);
            }
            return this.a;
        }

        public abstract String c();

        public abstract String d();
    }

    public static final class f {
        public static final class com.facebook.internal.w.f.a {
            private com.facebook.internal.w.f.a() {
            }

            public com.facebook.internal.w.f.a(g g0) {
            }

            public final f a(e w$e0, int v) {
                f w$f0 = new f(null);
                w$f0.a = w$e0;
                w$f0.b = v;
                return w$f0;
            }

            public final f b() {
                f w$f0 = new f(null);
                w$f0.b = -1;
                return w$f0;
            }
        }

        private e a;
        private int b;
        public static final com.facebook.internal.w.f.a c;

        static {
            f.c = new com.facebook.internal.w.f.a(null);
        }

        private f() {
        }

        public f(g g0) {
        }

        public final int c() {
            return this.b;
        }
    }

    static final class com.facebook.internal.w.g extends e {
        @Override  // com.facebook.internal.w$e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override  // com.facebook.internal.w$e
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    private static final String a;
    private static final List b;
    private static final List c;
    private static final Map d;
    private static final AtomicBoolean e;
    private static final Integer[] f;
    public static final w g;

    static {
        w w0 = new w();
        w.g = w0;
        k.d("com.facebook.internal.w", "NativeProtocol::class.java.name");
        w.a = "com.facebook.internal.w";
        w.b = w0.f();
        w.c = w0.e();
        w.d = w0.d();
        w.e = new AtomicBoolean(false);
        w.f = new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 0x133060D};
    }

    public static final TreeSet a(w w0, e w$e0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            return w0.o(w$e0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public static final List b(w w0) {
        return b1.a.d(w.class) ? null : w.b;
    }

    // 去混淆评级： 低(20)
    public static final AtomicBoolean c(w w0) {
        return b1.a.d(w.class) ? null : w.e;
    }

    private final Map d() {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            Map map0 = new HashMap();
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new d());
            map0.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", w.b);
            map0.put("com.facebook.platform.action.request.FEED_DIALOG", w.b);
            map0.put("com.facebook.platform.action.request.LIKE_DIALOG", w.b);
            map0.put("com.facebook.platform.action.request.APPINVITES_DIALOG", w.b);
            map0.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList0);
            map0.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList0);
            map0.put("com.facebook.platform.action.request.CAMERA_EFFECT", w.c);
            map0.put("com.facebook.platform.action.request.SHARE_STORY", w.b);
            return map0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }

    private final List e() {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            List list0 = o.g(new e[]{new a()});
            ((ArrayList)list0).addAll(this.f());
            return list0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }

    private final List f() {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            return o.g(new e[]{new c(), new com.facebook.internal.w.g()});
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }

    private final Uri g(e w$e0) {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            Uri uri0 = Uri.parse(("content://" + w$e0.d() + ".provider.PlatformProvider/versions"));
            k.d(uri0, "Uri.parse(CONTENT_SCHEME…ATFORM_PROVIDER_VERSIONS)");
            return uri0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
    }

    public static final int h(TreeSet treeSet0, int v, int[] arr_v) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return 0;
        }
        try {
            k.e(arr_v, "versionSpec");
            if(treeSet0 == null) {
                return -1;
            }
            int v1 = arr_v.length - 1;
            int v2 = -1;
            Iterator iterator0 = treeSet0.descendingIterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                k.d(((Integer)object0), "fbAppVersion");
                v2 = Math.max(v2, ((int)(((Integer)object0))));
                while(v1 >= 0 && arr_v[v1] > ((int)(((Integer)object0)))) {
                    --v1;
                }
                if(v1 < 0) {
                    return -1;
                }
                if(arr_v[v1] == ((int)(((Integer)object0)))) {
                    return v1 % 2 == 0 ? Math.min(v2, v) : -1;
                }
                if(false) {
                    break;
                }
            }
            return -1;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return 0;
    }

    public static final Bundle i(com.facebook.e e0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        if(e0 == null) {
            return null;
        }
        try {
            Bundle bundle0 = new Bundle();
            bundle0.putString("error_description", e0.toString());
            if(e0 instanceof com.facebook.g) {
                bundle0.putString("error_type", "UserCanceled");
                return bundle0;
            }
            return bundle0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    public static final Intent j(Context context0, String s, Collection collection0, String s1, boolean z, boolean z1, com.facebook.login.b b0, String s2, String s3) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(context0, "context");
            k.e(s, "applicationId");
            k.e(collection0, "permissions");
            k.e(s1, "e2e");
            k.e(b0, "defaultAudience");
            k.e(s2, "clientState");
            k.e(s3, "authType");
            b w$b0 = new b();
            return w.y(context0, w.g.k(w$b0, s, collection0, s1, z1, b0, s2, s3, false), w$b0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    private final Intent k(e w$e0, String s, Collection collection0, String s1, boolean z, com.facebook.login.b b0, String s2, String s3, boolean z1) {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            String s4 = w$e0.c();
            if(s4 != null) {
                Intent intent0 = new Intent().setClassName(w$e0.d(), s4).putExtra("client_id", s);
                k.d(intent0, "Intent()\n            .se…PP_ID_KEY, applicationId)");
                intent0.putExtra("facebook_sdk_version", "9.1.1");
                if(!F.Q(collection0)) {
                    intent0.putExtra("scope", TextUtils.join(",", collection0));
                }
                if(!F.P(s1)) {
                    intent0.putExtra("e2e", s1);
                }
                intent0.putExtra("state", s2);
                intent0.putExtra("response_type", "token,signed_request,graph_domain");
                intent0.putExtra("return_scopes", "true");
                if(z) {
                    intent0.putExtra("default_audience", b0.b());
                }
                intent0.putExtra("legacy_override", "v9.0");
                intent0.putExtra("auth_type", s3);
                if(z1) {
                    intent0.putExtra("fail_on_logged_out", true);
                }
                return intent0;
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, this);
        return null;
    }

    public static final Intent l(Context context0) {
        Intent intent0;
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(context0, "context");
            Iterator iterator0 = w.b.iterator();
            do {
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object0 = iterator0.next();
                intent0 = w.z(context0, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((e)object0).d()).addCategory("android.intent.category.DEFAULT"), ((e)object0));
            }
            while(intent0 == null);
            return intent0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    public static final Intent m(Intent intent0, Bundle bundle0, com.facebook.e e0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(intent0, "requestIntent");
            UUID uUID0 = w.p(intent0);
            if(uUID0 != null) {
                Intent intent1 = new Intent();
                intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", w.v(intent0));
                Bundle bundle1 = new Bundle();
                bundle1.putString("action_id", uUID0.toString());
                if(e0 != null) {
                    bundle1.putBundle("error", w.i(e0));
                }
                intent1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle1);
                if(bundle0 != null) {
                    intent1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle0);
                }
                return intent1;
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    public static final List n(Context context0, String s, Collection collection0, String s1, boolean z, boolean z1, com.facebook.login.b b0, String s2, String s3, boolean z2) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(s, "applicationId");
            k.e(collection0, "permissions");
            k.e(s1, "e2e");
            k.e(b0, "defaultAudience");
            k.e(s2, "clientState");
            k.e(s3, "authType");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: w.b) {
                Intent intent0 = w.g.k(((e)object0), s, collection0, s1, z1, b0, s2, s3, z2);
                if(intent0 != null) {
                    arrayList0.add(intent0);
                }
            }
            return arrayList0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return null;
        }
    }

    private final TreeSet o(e w$e0) {
        Cursor cursor1;
        Cursor cursor0;
        ProviderInfo providerInfo0;
        Uri uri0;
        ContentResolver contentResolver0;
        TreeSet treeSet0;
        if(b1.a.d(this)) {
            return null;
        }
        try {
            treeSet0 = new TreeSet();
            Context context0 = h.e();
            k.d(context0, "appContext");
            contentResolver0 = context0.getContentResolver();
            uri0 = this.g(w$e0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
            return null;
        }
        try {
            Context context1 = h.e();
            k.d(context1, "FacebookSdk.getApplicationContext()");
            PackageManager packageManager0 = context1.getPackageManager();
            String s = w$e0.d() + ".provider.PlatformProvider";
            try {
                providerInfo0 = packageManager0.resolveContentProvider(s, 0);
            }
            catch(RuntimeException runtimeException0) {
                Log.e("com.facebook.internal.w", "Failed to query content resolver.", runtimeException0);
                providerInfo0 = null;
            }
            if(providerInfo0 == null) {
                goto label_39;
            }
            else {
                try {
                    cursor0 = contentResolver0.query(uri0, new String[]{"version"}, null, null, null);
                    goto label_29;
                }
                catch(NullPointerException unused_ex) {
                    Log.e("com.facebook.internal.w", "Failed to query content resolver.");
                }
                catch(SecurityException unused_ex) {
                    Log.e("com.facebook.internal.w", "Failed to query content resolver.");
                }
                catch(IllegalArgumentException unused_ex) {
                    Log.e("com.facebook.internal.w", "Failed to query content resolver.");
                }
                cursor0 = null;
                goto label_29;
            }
            goto label_40;
        }
        catch(Throwable throwable1) {
            cursor1 = null;
            goto label_36;
        }
    label_29:
        if(cursor0 == null) {
            goto label_40;
        }
        else {
            try {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        goto label_40;
                    }
                    treeSet0.add(cursor0.getInt(cursor0.getColumnIndex("version")));
                }
            }
            catch(Throwable throwable2) {
                cursor1 = cursor0;
                throwable1 = throwable2;
            }
            try {
            label_36:
                if(cursor1 != null) {
                    cursor1.close();
                }
                throw throwable1;
            label_39:
                cursor0 = null;
            label_40:
                if(cursor0 != null) {
                    cursor0.close();
                    return treeSet0;
                }
                return treeSet0;
            }
            catch(Throwable throwable0) {
            }
        }
        b1.a.b(throwable0, this);
        return null;
    }

    public static final UUID p(Intent intent0) {
        String s;
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        if(intent0 == null) {
            return null;
        }
        try {
            if(w.w(w.v(intent0))) {
                Bundle bundle0 = intent0.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                s = bundle0 == null ? null : bundle0.getString("action_id");
            }
            else {
                s = intent0.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if(s != null) {
                try {
                    return UUID.fromString(s);
                }
                catch(IllegalArgumentException unused_ex) {
                    return null;
                }
                goto label_16;
            }
            return null;
        }
        catch(Throwable throwable0) {
        }
    label_16:
        b1.a.b(throwable0, class0);
        return null;
    }

    public static final com.facebook.e q(Bundle bundle0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        if(bundle0 == null) {
            return null;
        }
        try {
            String s = bundle0.getString("error_type");
            if(s == null) {
                s = bundle0.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String s1 = bundle0.getString("error_description");
            if(s1 == null) {
                s1 = bundle0.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return s != null && G3.h.n(s, "UserCanceled", true) ? new com.facebook.g(s1) : new com.facebook.e(s1);
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    private final f r(List list0, int[] arr_v) {
        if(b1.a.d(this)) {
            return null;
        }
        try {
            w.x();
            if(list0 == null) {
                return f.c.b();
            }
            for(Object object0: list0) {
                e w$e0 = (e)object0;
                int v = w.h(w$e0.b(), w.t(), arr_v);
                if(v != -1) {
                    return f.c.a(w$e0, v);
                }
                if(false) {
                    break;
                }
            }
            return f.c.b();
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, this);
        return null;
    }

    public static final int s(int v) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return 0;
        }
        try {
            return w.g.r(w.b, new int[]{v}).c();
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return 0;
        }
    }

    public static final int t() {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return 0;
        }
        try {
            return (int)w.f[0];
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return 0;
        }
    }

    public static final Bundle u(Intent intent0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(intent0, "intent");
            return w.w(w.v(intent0)) ? intent0.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS") : intent0.getExtras();
        }
        catch(Throwable throwable0) {
        }
        b1.a.b(throwable0, class0);
        return null;
    }

    public static final int v(Intent intent0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return 0;
        }
        try {
            k.e(intent0, "intent");
            return intent0.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
            return 0;
        }
    }

    public static final boolean w(int v) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return false;
        }
        try {
            if(i.k(w.f, v) && v >= 20140701) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
        return false;
    }

    public static final void x() {
        static final class com.facebook.internal.w.h implements Runnable {
            public static final com.facebook.internal.w.h f;

            static {
                com.facebook.internal.w.h.f = new com.facebook.internal.w.h();
            }

            @Override
            public final void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    if(b1.a.d(this)) {
                        return;
                    }
                    goto label_4;
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                    return;
                }
                return;
                try {
                label_4:
                    for(Object object0: w.b(w.g)) {
                        ((e)object0).a(true);
                    }
                    return;
                }
                catch(Throwable throwable1) {
                }
                finally {
                    w.c(w.g).set(false);
                }
                try {
                    b1.a.b(throwable1, this);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return;
        }
        try {
            if(!w.e.compareAndSet(false, true)) {
                return;
            }
            h.m().execute(com.facebook.internal.w.h.f);
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
    }

    public static final Intent y(Context context0, Intent intent0, e w$e0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(context0, "context");
            if(intent0 == null) {
                return null;
            }
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent0, 0);
            if(resolveInfo0 == null) {
                return null;
            }
            String s = resolveInfo0.activityInfo.packageName;
            k.d(s, "resolveInfo.activityInfo.packageName");
            return !j.a(context0, s) ? null : intent0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
        return null;
    }

    public static final Intent z(Context context0, Intent intent0, e w$e0) {
        Class class0 = w.class;
        if(b1.a.d(class0)) {
            return null;
        }
        try {
            k.e(context0, "context");
            if(intent0 == null) {
                return null;
            }
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent0, 0);
            if(resolveInfo0 == null) {
                return null;
            }
            String s = resolveInfo0.serviceInfo.packageName;
            k.d(s, "resolveInfo.serviceInfo.packageName");
            return !j.a(context0, s) ? null : intent0;
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, class0);
        }
        return null;
    }
}

