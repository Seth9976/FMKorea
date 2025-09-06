package com.onesignal;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

class v2 extends b {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            a.a = arr_v;
            try {
                arr_v[m.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class com.onesignal.v2.b {
        final v2 a;

    }

    class k {
        final v2 a;

        private m a(JSONObject jSONObject0) {
            m v2$m0;
            try {
                v2$m0 = m.i;
                if(jSONObject0.has("displayLocation") && !jSONObject0.get("displayLocation").equals("")) {
                    return m.valueOf(jSONObject0.optString("displayLocation", "FULL_SCREEN").toUpperCase());
                }
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
            return v2$m0;
        }

        private boolean b(JSONObject jSONObject0) {
            try {
                return jSONObject0.getBoolean("dragToDismissDisabled");
            }
            catch(JSONException unused_ex) {
                return false;
            }
        }

        private int c(JSONObject jSONObject0) {
            try {
                JSONObject jSONObject1 = jSONObject0.getJSONObject("pageMetaData");
                return v2.this.C(v2.this.d, jSONObject1);
            }
            catch(JSONException unused_ex) {
                return -1;
            }
        }

        private void d(JSONObject jSONObject0) {
            JSONObject jSONObject1 = jSONObject0.getJSONObject("body");
            String s = jSONObject1.optString("id", null);
            boolean z = jSONObject1.getBoolean("close");
            v2.this.j = z;
            if(v2.this.e.k) {
                I1.m0().e0(v2.this.e, jSONObject1);
            }
            else if(s != null) {
                I1.m0().d0(v2.this.e, jSONObject1);
            }
            if(v2.this.j) {
                v2.this.w(null);
            }
        }

        private void e(JSONObject jSONObject0) {
            I1.m0().k0(v2.this.e, jSONObject0);
        }

        private void f(JSONObject jSONObject0) {
            m v2$m0 = this.a(jSONObject0);
            int v = v2$m0 == m.i ? -1 : this.c(jSONObject0);
            boolean z = this.b(jSONObject0);
            v2.this.f.i(v2$m0);
            v2.this.f.j(v);
            v2.this.v(z);
        }

        @JavascriptInterface
        public void postMessage(String s) {
            try {
                I1.p1(C.k, "OSJavaScriptInterface:postMessage: " + s);
                JSONObject jSONObject0 = new JSONObject(s);
                switch(jSONObject0.getString("type")) {
                    case "action_taken": {
                        if(!v2.this.c.O()) {
                            this.d(jSONObject0);
                            return;
                        }
                        return;
                    }
                    case "page_change": {
                        this.e(jSONObject0);
                        return;
                    }
                    case "rendering_complete": {
                        this.f(jSONObject0);
                        return;
                    }
                    case "resize": {
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            catch(JSONException jSONException0) {
            }
            jSONException0.printStackTrace();
        }
    }

    interface l {
        void onComplete();
    }

    static enum m {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        boolean b() {
            switch(a.a[this.ordinal()]) {
                case 1: 
                case 2: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    private final Object a;
    private E1 b;
    private E c;
    private Activity d;
    private E0 e;
    private B0 f;
    private String g;
    private Integer h;
    private boolean i;
    private boolean j;
    private static final String k = "com.onesignal.v2";
    private static final int l;
    protected static v2 m;

    static {
        v2.l = D1.b(24);
        v2.m = null;
    }

    protected v2(E0 e00, Activity activity0, B0 b00) {
        this.a = new com.onesignal.v2.b(this);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.e = e00;
        this.d = activity0;
        this.f = b00;
    }

    // 去混淆评级： 低(20)
    private int A(Activity activity0) {
        return this.f.g() ? D1.e(activity0) : D1.e(activity0) - v2.l * 2;
    }

    private static void B(Activity activity0, E0 e00, B0 b00) {
        class e implements Runnable {
            final v2 f;
            final Activity g;
            final String h;
            final B0 i;

            e(Activity activity0, String s, B0 b00) {
                this.g = activity0;
                this.h = s;
                this.i = b00;
                super();
            }

            @Override
            public void run() {
                try {
                    v2.this.H(this.g, this.h, this.i.g());
                }
                catch(Exception exception0) {
                    if(exception0.getMessage() == null || !exception0.getMessage().contains("No WebView installed")) {
                        throw exception0;
                    }
                    I1.b(C.h, "Error setting up WebView: ", exception0);
                }
            }
        }

        if(b00.g()) {
            v2.E(b00, activity0);
        }
        try {
            String s = Base64.encodeToString(b00.a().getBytes("UTF-8"), 2);
            v2 v20 = new v2(e00, activity0, b00);
            v2.m = v20;
            OSUtils.S(new e(v20, activity0, s, b00));
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            I1.b(C.h, "Catch on initInAppMessage: ", unsupportedEncodingException0);
            unsupportedEncodingException0.printStackTrace();
        }
    }

    private int C(Activity activity0, JSONObject jSONObject0) {
        try {
            int v = D1.b(jSONObject0.getJSONObject("rect").getInt("height"));
            C i1$C0 = C.k;
            I1.p1(i1$C0, "getPageHeightData:pxHeight: " + v);
            int v1 = this.A(activity0);
            if(v > v1) {
                I1.a(i1$C0, "getPageHeightData:pxHeight is over screen max: " + v1);
                return v1;
            }
            return v;
        }
        catch(JSONException jSONException0) {
            I1.b(C.h, "pageRectToViewHeight could not get page height", jSONException0);
            return -1;
        }
    }

    private void D() {
        com.onesignal.a a0 = com.onesignal.b.b();
        if(a0 != null) {
            a0.r("com.onesignal.v2" + this.e.a);
        }
    }

    private static void E(B0 b00, Activity activity0) {
        int[] arr_v = D1.c(activity0);
        b00.h(b00.a() + String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", ((int)arr_v[0]), ((int)arr_v[1]), ((int)arr_v[2]), ((int)arr_v[3]))));
    }

    private void F(E e0) {
        synchronized(this.a) {
            this.c = e0;
        }
    }

    private void G(Activity activity0) {
        this.b.layout(0, 0, this.z(activity0), this.A(activity0));
    }

    private void H(Activity activity0, String s, boolean z) {
        class h implements Runnable {
            final Activity f;
            final String g;
            final v2 h;

            h(Activity activity0, String s) {
                this.f = activity0;
                this.g = s;
                super();
            }

            @Override
            public void run() {
                v2.e(v2.this, this.f);
                v2.s(v2.this).loadData(this.g, "text/html; charset=utf-8", "base64");
            }
        }

        v2.y();
        E1 e10 = new E1(activity0);
        this.b = e10;
        e10.setOverScrollMode(2);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setHorizontalScrollBarEnabled(false);
        this.b.getSettings().setJavaScriptEnabled(true);
        this.b.addJavascriptInterface(new k(this), "OSAndroid");
        if(z) {
            this.b.setSystemUiVisibility(0xC02);
            if(Build.VERSION.SDK_INT >= 30) {
                this.b.setFitsSystemWindows(false);
            }
        }
        D1.a(activity0, new h(this, activity0, s));
    }

    static void I(E0 e00, B0 b00) {
        class c implements l {
            final Activity a;
            final E0 b;
            final B0 c;

            c(Activity activity0, E0 e00, B0 b00) {
                this.b = e00;
                this.c = b00;
                super();
            }

            @Override  // com.onesignal.v2$l
            public void onComplete() {
                v2.m = null;
                v2.c(this.a, this.b, this.c);
            }
        }


        class d implements Runnable {
            final E0 f;
            final B0 g;

            d(E0 e00, B0 b00) {
                this.g = b00;
                super();
            }

            @Override
            public void run() {
                v2.I(this.f, this.g);
            }
        }

        Activity activity0 = I1.Z();
        I1.p1(C.k, "in app message showMessageContent on currentActivity: " + activity0);
        if(activity0 != null) {
            v2 v20 = v2.m;
            if(v20 != null && e00.k) {
                v20.w(new c(activity0, e00, b00));
                return;
            }
            v2.B(activity0, e00, b00);
            return;
        }
        Looper.prepare();
        new Handler().postDelayed(new d(e00, b00), 200L);
    }

    private void J(Integer integer0) {
        synchronized(this.a) {
            if(this.c == null) {
                I1.a(C.i, "No messageView found to update a with a new height.");
                return;
            }
            I1.a(C.k, "In app message, showing first one with height: " + integer0);
            this.c.U(this.b);
            if(integer0 != null) {
                this.h = integer0;
                this.c.Z(((int)integer0));
            }
            this.c.X(this.d);
            this.c.B();
        }
    }

    private void K() {
        class f implements Runnable {
            final v2 f;

            @Override
            public void run() {
                int[] arr_v = D1.c(v2.n(v2.this));
                v2.s(v2.this).evaluateJavascript(String.format("setSafeAreaInsets(%s)", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", ((int)arr_v[0]), ((int)arr_v[1]), ((int)arr_v[2]), ((int)arr_v[3]))), null);
            }
        }

        OSUtils.S(new f(this));
    }

    @Override  // com.onesignal.a$b
    void a(Activity activity0) {
        String s = this.g;
        this.d = activity0;
        this.g = activity0.getLocalClassName();
        I1.a(C.k, "In app message activity available currentActivityName: " + this.g + " lastActivityName: " + s);
        if(s == null) {
            this.J(null);
            return;
        }
        if(s.equals(this.g)) {
            this.u();
        }
        else if(!this.j) {
            E e0 = this.c;
            if(e0 != null) {
                e0.P();
            }
            this.J(this.h);
        }
    }

    @Override  // com.onesignal.a$b
    void b(Activity activity0) {
        I1.a(C.k, "In app message activity stopped, cleaning views, currentActivityName: " + this.g + "\nactivity: " + this.d + "\nmessageView: " + this.c);
        if(this.c != null && activity0.getLocalClassName().equals(this.g)) {
            this.c.P();
        }
    }

    static void c(Activity activity0, E0 e00, B0 b00) {
        v2.B(activity0, e00, b00);
    }

    private void t(WebView webView0) {
    }

    private void u() {
        class g implements Runnable {
            final v2 f;

            @Override
            public void run() {
                class com.onesignal.v2.g.a implements ValueCallback {
                    final g a;

                    public void a(String s) {
                        try {
                            JSONObject jSONObject0 = new JSONObject(s);
                            Integer integer0 = v2.this.C(v2.this.d, jSONObject0);
                            v2.this.J(integer0);
                        }
                        catch(JSONException jSONException0) {
                            jSONException0.printStackTrace();
                        }
                    }

                    @Override  // android.webkit.ValueCallback
                    public void onReceiveValue(Object object0) {
                        this.a(((String)object0));
                    }
                }

                v2.this.G(v2.this.d);
                if(v2.this.f.g()) {
                    v2.this.K();
                }
                com.onesignal.v2.g.a v2$g$a0 = new com.onesignal.v2.g.a(this);
                v2.this.b.evaluateJavascript("getPageMetaData()", v2$g$a0);
            }
        }

        E e0 = this.c;
        if(e0 == null) {
            return;
        }
        if(e0.M() == m.i && !this.f.g()) {
            this.J(null);
            return;
        }
        I1.a(C.k, "In app message new activity, calculate height and show ");
        D1.a(this.d, new g(this));
    }

    private void v(boolean z) {
        class i implements j {
            final v2 a;

            @Override  // com.onesignal.E$j
            public void a() {
                I1.m0().b0(v2.this.e);
                v2.this.D();
            }

            @Override  // com.onesignal.E$j
            public void b() {
                I1.m0().h0(v2.this.e);
            }

            @Override  // com.onesignal.E$j
            public void c() {
                I1.m0().i0(v2.this.e);
            }
        }

        this.h = this.f.d();
        this.F(new E(this.b, this.f, z));
        this.c.R(new i(this));
        com.onesignal.a a0 = com.onesignal.b.b();
        if(a0 != null) {
            a0.c("com.onesignal.v2" + this.e.a, this);
        }
    }

    protected void w(l v2$l0) {
        class com.onesignal.v2.j implements l {
            final l a;
            final v2 b;

            com.onesignal.v2.j(l v2$l0) {
                this.a = v2$l0;
                super();
            }

            @Override  // com.onesignal.v2$l
            public void onComplete() {
                v2.this.i = false;
                v2.this.F(null);
                l v2$l0 = this.a;
                if(v2$l0 != null) {
                    v2$l0.onComplete();
                }
            }
        }

        E e0 = this.c;
        if(e0 != null && !this.i) {
            if(this.e != null && e0 != null) {
                I1.m0().i0(this.e);
            }
            this.c.K(new com.onesignal.v2.j(this, v2$l0));
            this.i = true;
            return;
        }
        if(v2$l0 != null) {
            v2$l0.onComplete();
        }
    }

    static void x() {
        I1.p1(C.k, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + v2.m);
        v2 v20 = v2.m;
        if(v20 != null) {
            v20.w(null);
        }
    }

    // 去混淆评级： 低(30)
    private static void y() {
    }

    // 去混淆评级： 低(20)
    private int z(Activity activity0) {
        return this.f.g() ? D1.d(activity0) : D1.h(activity0) - v2.l * 2;
    }
}

