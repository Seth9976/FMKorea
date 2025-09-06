package co.median.android;

import B0.D;
import B0.E;
import B0.H0;
import B0.L;
import B0.M0;
import B0.M;
import B0.Q0;
import B0.Q;
import B0.R0;
import B0.r0;
import B0.r;
import B0.z;
import I0.a;
import I0.g;
import I0.j;
import I0.l;
import I0.v;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.security.KeyChain;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceResponse;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.activity.result.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URISyntaxException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class u {
    static class k extends AsyncTask {
        private Activity a;
        private ClientCertRequest b;

        public k(Activity activity0, ClientCertRequest clientCertRequest0) {
            this.a = activity0;
            this.b = clientCertRequest0;
        }

        protected Pair a(String[] arr_s) {
            String s = arr_s[0];
            try {
                return new Pair(KeyChain.getPrivateKey(this.a, s), KeyChain.getCertificateChain(this.a, s));
            }
            catch(Exception exception0) {
                g.a().c("co.median.android.u", "Error getting private key for alias " + s, exception0);
                return null;
            }
        }

        protected void b(Pair pair0) {
            if(pair0 != null) {
                Object object0 = pair0.first;
                int v = 0;
                Object object1 = pair0.second;
                if(object1 != null) {
                    v = 1;
                }
                if((v & (object0 == null ? 0 : 1)) != 0) {
                    this.b.proceed(((PrivateKey)object0), ((X509Certificate[])object1));
                    return;
                }
            }
            this.b.ignore();
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.a(((String[])arr_object));
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.b(((Pair)object0));
        }
    }

    private MainActivity a;
    private String b;
    private String c;
    private String d;
    private String e;
    private L f;
    private Handler g;
    private x h;
    private boolean i;
    private boolean j;
    private double k;
    private String l;
    private boolean m;
    private final String n;
    private final String o;
    private boolean p;
    private final b q;
    private ValueCallback r;
    private static final String s = "co.median.android.u";

    static {
    }

    u(MainActivity mainActivity0) {
        class co.median.android.u.b implements r {
            final u a;

            @Override  // B0.r
            public void a(Uri uri0) {
                if(u.this.r != null) {
                    u.this.r.onReceiveValue(new Uri[]{uri0});
                    u.this.r = null;
                }
            }

            @Override  // B0.r
            public void onFailure(Exception exception0) {
                Log.e("co.median.android.u", "onFailure: ", exception0);
                u.this.m();
            }
        }

        this.g = new Handler();
        this.h = x.f;
        this.i = false;
        this.j = false;
        this.l = "";
        this.m = false;
        this.p = false;
        this.a = mainActivity0;
        this.f = new L();
        if(this.a.o2() != null) {
            this.a.o2().k(this);
        }
        a a0 = a.V(this.a);
        if(a0.W != null) {
            this.b = "median_profile_picker.parseJson(eval(" + l.f(a0.W) + "))";
            this.c = "gonative_profile_picker.parseJson(eval(" + l.f(a0.W) + "))";
        }
        if(this.a.getIntent().getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
            this.j = true;
        }
        this.k = a0.A;
        this.n = ((GoNativeApplication)this.a.getApplication()).d();
        this.o = ((GoNativeApplication)this.a.getApplication()).e();
        this.p = ((GoNativeApplication)this.a.getApplication()).k();
        this.q = this.a.I0(new z(), (E e0) -> if(e0.c()) {
            if(e0.b()) {
                Uri[] arr_uri = e0.a();
                Objects.requireNonNull(arr_uri);
                r0.b(this.a, arr_uri[0], new co.median.android.u.b(this));
                return;
            }
            ValueCallback valueCallback0 = this.r;
            if(valueCallback0 != null) {
                valueCallback0.onReceiveValue(e0.a());
                this.r = null;
            }
        }
        else {
            this.m();
        });
    }

    // 检测为 Lambda 实现
    private void A(WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0, D d0, String[] arr_s, int[] arr_v) [...]

    // 检测为 Lambda 实现
    private void B(E e0) [...]

    // 检测为 Lambda 实现
    private void C() [...]

    // 检测为 Lambda 实现
    private void D(ClientCertRequest clientCertRequest0, String s) [...]

    // 检测为 Lambda 实现
    private static void E(j j0) [...]

    // 检测为 Lambda 实现
    private void F(String s) [...]

    // 检测为 Lambda 实现
    private void G() [...]

    public void H(ValueCallback valueCallback0, WebChromeClient.FileChooserParams webChromeClient$FileChooserParams0) {
        this.r = valueCallback0;
        D d0 = new D(webChromeClient$FileChooserParams0);
        if(!webChromeClient$FileChooserParams0.isCaptureEnabled() && !d0.h()) {
            this.q.a(d0);
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(v.b(this.a, "android.permission.CAMERA")) {
            d0.p(true);
        }
        else {
            arrayList0.add("android.permission.CAMERA");
        }
        v.a(this.a, "android.permission.WRITE_EXTERNAL_STORAGE");
        a.V(this.a).x4.e();
        d0.o(true);
        if(!arrayList0.isEmpty()) {
            this.a.j2(((String[])arrayList0.toArray(new String[0])), (String[] arr_s, int[] arr_v) -> for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                int v1 = arr_v[v];
                if(Objects.equals(s, "android.permission.CAMERA")) {
                    if(v1 == -1) {
                        if(webChromeClient$FileChooserParams0.isCaptureEnabled()) {
                            Toast.makeText(this.a, 0x7F12012F, 0).show();  // string:upload_camera_permission_denied "Camera permission denied"
                            this.m();
                            return;
                        }
                        d0.p(false);
                    }
                    else if(v1 == 0) {
                        d0.p(true);
                    }
                }
                if(Objects.equals(s, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if(v1 == -1) {
                        d0.o(false);
                    }
                    else if(v1 == 0) {
                        d0.o(true);
                    }
                }
                this.q.a(d0);
            });
            return;
        }
        this.q.a(d0);
    }

    protected void I() {
        this.g.removeCallbacksAndMessages(null);
        this.h = x.i;
    }

    public void J(j j0, Message message0, Message message1) {
        message1.sendToTarget();
    }

    public void K(String s) {
        if(this.l.equals(s)) {
            return;
        }
        this.t();
    }

    public void L(j j0, String s) {
        class h implements Runnable {
            final u f;

            @Override
            public void run() {
                CookieManager.getInstance().flush();
            }
        }

        if(this.l.equals(s)) {
            this.l = "";
            return;
        }
        if(this.a.o2() != null) {
            this.a.o2().g();
        }
        Log.d("co.median.android.u", "onpagefinished " + s);
        this.h = x.i;
        this.R(s);
        a a0 = a.V(this.a);
        if(s != null) {
            ArrayList arrayList0 = a0.j0;
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    if(((Pattern)object0).matcher(s).matches()) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        this.t();
        this.v();
        this.a.X2();
        this.a.runOnUiThread(() -> this.a.b3());
        H0.a().d(s);
        if(this.x(Uri.parse(s))) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new h(this));
        }
        if(a0.D) {
            this.u(this.d);
        }
        boolean z = true;
        if(a0.Q != null) {
            if(this.i) {
                this.a.j3();
            }
            this.i = l.n(s, a0.m1) || l.n(s, a0.p1);
        }
        String s1 = a0.E3;
        if(s1 != null) {
            j0.a(s1);
        }
        String s2 = this.b;
        if(s2 != null) {
            j0.a(s2);
        }
        String s3 = this.c;
        if(s3 != null) {
            j0.a(s3);
        }
        this.a.Q1(s);
        MainActivity mainActivity0 = this.a;
        String s4 = mainActivity0.m0;
        if(s4 != null) {
            mainActivity0.m0 = null;
            mainActivity0.a(s4);
        }
        X.a.b(this.a).d(new Intent("io.gonative.android.webview.finished"));
        String s5 = this.d;
        if(s5 != null) {
            z = l.a(s5, this.a);
        }
        if(z) {
            this.Q("median_device_info");
            this.Q("gonative_device_info");
        }
        ((GoNativeApplication)this.a.getApplication()).q.v(this.a, z);
    }

    public void M(String s) {
        if(s.equals(this.f.c())) {
            this.a.p2();
            this.f.g(null);
            return;
        }
        try {
            if(this.a.g2().j(s)) {
                return;
            }
        }
        catch(Exception unused_ex) {
        }
        if(this.a.o2() != null) {
            this.a.o2().h();
        }
        this.h = x.h;
        this.g.removeCallbacksAndMessages(null);
        this.f.f(s);
        H0.a().d(s);
        Uri uri0 = Uri.parse(s);
        if(a.V(this.a).Q != null && this.x(uri0)) {
            this.a.j3();
        }
        this.a.e3();
        this.a.R1(s);
        X.a.b(this.a).d(new Intent("io.gonative.android.webview.started"));
        if("file:///android_asset/offline.html".equals(s)) {
            this.a.W1();
        }
        else {
            this.a.P2();
        }
        this.m = false;
    }

    public void N(String s, ClientCertRequest clientCertRequest0) {
        Uri.parse(s);
        M0 m00 = (String s) -> {
            if(s == null) {
                clientCertRequest0.ignore();
                return;
            }
            new k(this.a, clientCertRequest0).execute(new String[]{s});
        };
        KeyChain.choosePrivateKeyAlias(this.a, m00, clientCertRequest0.getKeyTypes(), clientCertRequest0.getPrincipals(), clientCertRequest0.getHost(), clientCertRequest0.getPort(), null);
    }

    public void O(j j0, int v, String s, String s1) {
        class i implements Runnable {
            final j f;
            final u g;

            i(j j0) {
                this.f = j0;
                super();
            }

            @Override
            public void run() {
                this.f.reload();
            }
        }


        class co.median.android.u.j implements Runnable {
            final u f;

            @Override
            public void run() {
                u.this.a.b3();
            }
        }

        if(s != null && s.contains("net::ERR_CACHE_MISS")) {
            this.a.runOnUiThread(new i(this, j0));
            return;
        }
        if(a.V(this.a).a0 && ((this.h == x.h || this.h == x.g) && (this.a.v2() || v == -2 && s1 != null && j0.getUrl() != null && s1.equals(j0.getUrl())))) {
            this.a.runOnUiThread(() -> {
                j0.stopLoading();
                j0.e("file:///android_asset/offline.html");
            });
            return;
        }
        this.a.runOnUiThread(new co.median.android.u.j(this));
    }

    public void P(SslError sslError0, String s) {
        int v1;
        int v = sslError0.getPrimaryError();
        switch(v) {
            case 1: {
                v1 = 0x7F120129;  // string:ssl_error_expired "SSL certificate has expired"
                break;
            }
            case 0: 
            case 2: {
                v1 = 0x7F120128;  // string:ssl_error_cert "Invalid SSL certificate"
                break;
            }
            default: {
                v1 = v == 3 || v == 4 ? 0x7F120128 : 0x7F12012A;  // string:ssl_error_cert "Invalid SSL certificate"
            }
        }
        if(a.V(this.a).C) {
            Toast.makeText(this.a, v1, 1).show();
        }
        String s1 = this.a.getString(v1) + " - Error url: " + sslError0.getUrl() + " - Source page: " + s;
        g.a().d("co.median.android.u", s1, new Exception(s1), 2);
    }

    private void Q(String s) {
        Map map0 = Q.b(this.a);
        map0.put("isFirstLaunch", Boolean.valueOf(this.p));
        String s1 = l.b(s, new JSONObject(map0));
        this.a.a(s1);
    }

    public void R(String s) {
        this.d = s;
        ((GoNativeApplication)this.a.getApplication()).q.A(s);
    }

    public boolean S(j j0, String s) {
        return this.T(j0, s, false, false);
    }

    public boolean T(j j0, String s, boolean z, boolean z1) {
        class co.median.android.u.g implements Runnable {
            final j f;
            final u g;

            co.median.android.u.g(j j0) {
                this.f = j0;
                super();
            }

            @Override
            public void run() {
                a a0 = a.V(u.this.a);
                String s = this.f.getUrl();
                if(a0.a0 && !"file:///android_asset/offline.html".equals(s)) {
                    this.f.e("file:///android_asset/offline.html");
                }
            }
        }

        if(s == null) {
            return false;
        }
        if(s.startsWith("data:") && this.y(s)) {
            Log.d("co.median.android.u", "shouldOverrideUrlLoading: Detected 1x1 pixel tracking image. Allowing WebView to load. URL: " + s);
            return false;
        }
        if(this.U(j0, s, false)) {
            if(this.j) {
                this.a.finish();
            }
            if(z1) {
                this.l = s;
                this.h = x.i;
                this.g.removeCallbacksAndMessages(null);
                this.a.b3();
            }
            return true;
        }
        this.j = false;
        this.f.f(s);
        this.a.s2();
        this.h = x.g;
        if(!Double.isNaN(this.k) && !Double.isInfinite(this.k) && this.k > 0.0) {
            this.g.postDelayed(new co.median.android.u.g(this, j0), ((long)(this.k * 1000.0)));
        }
        return false;
    }

    public boolean U(j j0, String s, boolean z) {
        class c implements Runnable {
            final String f;
            final u g;

            c(String s) {
                this.f = s;
                super();
            }

            @Override
            public void run() {
                u.this.a.J2(this.f);
            }
        }


        class d implements Runnable {
            final j f;
            final String g;
            final u h;

            d(j j0, String s) {
                this.f = j0;
                this.g = s;
                super();
            }

            @Override
            public void run() {
                u.this.a.h3(this.f, true, false);
                u.this.a.Q1(this.g);
            }
        }


        class e implements Runnable {
            final j f;
            final String g;
            final u h;

            e(j j0, String s) {
                this.f = j0;
                this.g = s;
                super();
            }

            @Override
            public void run() {
                u.this.a.h3(this.f, true, false);
                u.this.a.Q1(this.g);
            }
        }


        class f implements Runnable {
            final j f;
            final String g;
            final u h;

            f(j j0, String s) {
                this.f = j0;
                this.g = s;
                super();
            }

            @Override
            public void run() {
                u.this.a.h3(this.f, true, false);
                u.this.a.Q1(this.g);
            }
        }

        Intent intent1;
        if(s == null) {
            return false;
        }
        if(s.startsWith("file:///android_asset/")) {
            return false;
        }
        if(s.startsWith("blob:")) {
            return false;
        }
        j0.setCheckLoginSignup(true);
        Uri uri0 = Uri.parse(s);
        if(uri0.getScheme() != null && uri0.getScheme().equals("gonative-bridge")) {
            if(z) {
                return true;
            }
            try {
                JSONArray jSONArray0 = new JSONArray(uri0.getQueryParameter("json"));
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                    if(jSONObject0 != null) {
                        String s1 = jSONObject0.optString("command");
                        if(!s1.isEmpty()) {
                            if(!s1.equals("pop")) {
                                if(s1.equals("clearPools")) {
                                    X.a.b(this.a).d(new Intent("io.gonative.android.webview.clearPools"));
                                }
                            }
                            else if(this.a.w2()) {
                                this.a.finish();
                            }
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            return true;
        }
        a a0 = a.V(this.a);
        if(("median".equals(uri0.getScheme()) || "gonative".equals(uri0.getScheme())) && (this.d != null && !l.a(this.d, this.a))) {
            g.a().b("co.median.android.u", "URL not authorized for native bridge: " + this.d);
            return true;
        }
        if(!"median".equals(uri0.getScheme()) && !"gonative".equals(uri0.getScheme())) {
            if(a0.X() != null) {
                String s2 = (String)a0.X().get(s);
                if(s2 == null) {
                    s2 = (String)a0.X().get("*");
                }
                if(s2 != null && !s2.equals(s)) {
                    if(z) {
                        return true;
                    }
                    this.a.runOnUiThread(new c(this, s2));
                    return true;
                }
            }
            Intent intent0 = null;
            if(!this.x(uri0)) {
                if(z) {
                    return true;
                }
                if(a0.X.d(uri0.toString()).equals("appbrowser")) {
                    this.a.M2(uri0);
                }
                else {
                    Log.d("co.median.android.u", "processing dynamic link: " + uri0);
                    try {
                        try {
                            if("intent".equals(uri0.getScheme())) {
                                goto label_60;
                            }
                            else if(!"http".equals(uri0.getScheme()) && !"https".equals(uri0.getScheme())) {
                                intent1 = new Intent("android.intent.action.VIEW", uri0);
                                goto label_52;
                            }
                            else {
                                goto label_58;
                            }
                            goto label_75;
                        }
                        catch(ActivityNotFoundException activityNotFoundException0) {
                            goto label_66;
                        }
                        try {
                        label_52:
                            this.a.startActivity(intent1);
                            goto label_75;
                        }
                        catch(ActivityNotFoundException activityNotFoundException1) {
                        }
                    }
                    catch(URISyntaxException uRISyntaxException0) {
                        goto label_74;
                    }
                    intent0 = intent1;
                    activityNotFoundException0 = activityNotFoundException1;
                    goto label_66;
                    try {
                    label_58:
                        this.a.N2(uri0);
                        goto label_75;
                    label_60:
                        intent0 = Intent.parseUri(uri0.toString(), 1);
                        this.a.startActivity(intent0);
                        goto label_75;
                    }
                    catch(ActivityNotFoundException activityNotFoundException0) {
                    }
                    catch(URISyntaxException uRISyntaxException0) {
                        goto label_74;
                    }
                label_66:
                    if(intent0 != null) {
                        String s3 = intent0.getStringExtra("browser_fallback_url");
                        if(TextUtils.isEmpty(s3)) {
                            Toast.makeText(this.a, 0x7F120025, 1).show();  // string:app_not_installed "App is not installed"
                            g.a().d("co.median.android.u", "App is not installed", activityNotFoundException0, 2);
                            goto label_75;
                        label_74:
                            g.a().c("co.median.android.u", uRISyntaxException0.getMessage(), uRISyntaxException0);
                        }
                        else {
                            this.a.J2(s3);
                        }
                    }
                }
            label_75:
                if("app_links".equals(this.a.f2()) && this.s() == null) {
                    this.a.J2(a0.U());
                }
                return true;
            }
            if(!this.a.x2()) {
                this.a.h(-1.0f);
                this.a.F(false);
            }
            if(a0.H) {
                co.median.android.l l0 = this.a.e2();
                if(l0.g(this.a.X1())) {
                    l0.l(this.a.X1(), false);
                }
                else if(a0.I > 0 && l0.f() > 1 && l0.f() >= a0.I && this.a.L2(s)) {
                    return true;
                }
            }
            int v1 = this.a.n2();
            int v2 = this.a.n3(s);
            if(v1 >= 0 && v2 >= 0) {
                if(v2 > v1) {
                    if(z) {
                        return true;
                    }
                    Intent intent2 = new Intent(this.a.getBaseContext(), MainActivity.class);
                    intent2.putExtra("isRoot", false);
                    intent2.putExtra("url", s);
                    intent2.putExtra("parentUrlLevel", v1);
                    intent2.putExtra("postLoadJavascript", this.a.m0);
                    if(a0.H) {
                        intent2.putExtra("ignoreInterceptMaxWindows", true);
                    }
                    this.a.startActivityForResult(intent2, 400);
                    this.a.m0 = null;
                    this.a.n0 = null;
                    return true;
                }
                if(v2 < v1 && v2 <= this.a.i2()) {
                    if(z) {
                        return true;
                    }
                    Intent intent3 = new Intent();
                    intent3.putExtra("url", s);
                    intent3.putExtra("urlLevel", v2);
                    intent3.putExtra("postLoadJavascript", this.a.m0);
                    this.a.setResult(-1, intent3);
                    this.a.finish();
                    return true;
                }
            }
            if(v2 >= 0) {
                this.a.W2(v2);
            }
            if(!z) {
                this.a.runOnUiThread(() -> this.a.Z2(s, false));
            }
            Q0 q00 = ((GoNativeApplication)this.a.getApplication()).h();
            Pair pair0 = q00.u(s);
            j j1 = (j)pair0.first;
            R0 r00 = (R0)pair0.second;
            if(z && j1 != null) {
                return true;
            }
            if(j1 != null && r00 == R0.f) {
                this.a.runOnUiThread(new d(this, j1, s));
                q00.n(j1);
                X.a.b(this.a).d(new Intent("io.gonative.android.webview.finished"));
                return true;
            }
            if(j1 != null && r00 == R0.h) {
                this.a.runOnUiThread(new e(this, j1, s));
                return true;
            }
            if(j1 != null && r00 == R0.g && !l.n(s, this.d)) {
                this.a.runOnUiThread(new f(this, j1, s));
                return true;
            }
            if(this.a.J) {
                q00.n(j0);
                this.a.J = false;
            }
            return false;
        }
        ((GoNativeApplication)this.a.getApplication()).q.g(this.a, uri0);
        return true;
    }

    public void V() {
        this.a.runOnUiThread(() -> this.a.d3());
    }

    // 去混淆评级： 低(20)
    static String l() [...] // 潜在的解密器

    public void m() {
        ValueCallback valueCallback0 = this.r;
        if(valueCallback0 != null) {
            valueCallback0.onReceiveValue(null);
            this.r = null;
        }
    }

    public void n() {
        Handler handler0 = this.g;
        if(handler0 == null && this.h != x.g) {
            return;
        }
        handler0.removeCallbacksAndMessages(null);
        this.V();
    }

    // 去混淆评级： 低(40)
    private String o() {
        return "(function() {var parent = document.getElementsByTagName(\'head\').item(0);var style = document.createElement(\'style\');style.type = \'text/css\';style.id = \'median-custom-css\';style.innerHTML = window.atob(\'" + this.n + "\');parent.appendChild(style);return document.getElementById(\'" + "median-custom-css" + "\') !== null;})()";
    }

    private void p(Message message0, boolean z) {
        ((GoNativeApplication)this.a.getApplication()).p(message0);
        Intent intent0 = new Intent(this.a.getBaseContext(), MainActivity.class);
        intent0.putExtra("isRoot", false);
        intent0.putExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", true);
        if(z) {
            intent0.putExtra("ignoreInterceptMaxWindows", true);
        }
        this.a.startActivityForResult(intent0, 400);
    }

    public void q(WebView webView0, Message message0) {
        class co.median.android.u.a extends WebViewClient {
            final u a;

            @Override  // android.webkit.WebViewClient
            public void onPageFinished(WebView webView0, String s) {
                if(!u.this.a.L2(s)) {
                    Intent intent0 = new Intent(u.this.a.getBaseContext(), MainActivity.class);
                    intent0.putExtra("isRoot", false);
                    intent0.putExtra("url", s);
                    intent0.putExtra("ignoreInterceptMaxWindows", true);
                    u.this.a.startActivityForResult(intent0, 400);
                }
            }
        }

        a a0 = a.V(this.a);
        if(a0.H && a0.I > 0 && this.a.e2().f() >= a0.I) {
            WebView webView1 = new WebView(webView0.getContext());
            ((WebView.WebViewTransport)message0.obj).setWebView(webView1);
            message0.sendToTarget();
            webView1.setWebViewClient(new co.median.android.u.a(this));
            return;
        }
        this.p(message0, a0.H);
    }

    public void r(j j0, String s, boolean z) {
        if(this.a.o2() != null) {
            this.a.o2().i(s);
        }
        if(this.h == x.g) {
            this.h = x.h;
            this.g.removeCallbacksAndMessages(null);
        }
        if(!z && !s.equals("file:///android_asset/offline.html")) {
            this.a.N1(s);
        }
    }

    public String s() {
        return this.d;
    }

    private void t() {
        if(!TextUtils.isEmpty(this.n) && !this.m) {
            try {
                this.a.R2(this.o(), (String s) -> {
                    if(Boolean.parseBoolean(s)) {
                        this.m = true;
                        Log.d("co.median.android.u", "Custom CSS Injection Success");
                        return;
                    }
                    Log.d("co.median.android.u", "Custom CSS Injection Failed");
                });
            }
            catch(Exception exception0) {
                g.a().c("co.median.android.u", "Error injecting customCSS via javascript", exception0);
            }
        }
    }

    private void u(String s) {
        if(!l.a(s, this.a)) {
            return;
        }
        try {
            if(this.e == null) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                M.b(new BufferedInputStream(this.a.getAssets().open("GoNativeJSBridgeLibrary.js")), byteArrayOutputStream0);
                this.e = byteArrayOutputStream0.toString();
            }
            this.a.a(this.e);
            ((GoNativeApplication)this.a.getApplication()).q.h(this.a);
            this.a.a("function median_do_callback(functionName) { \n    if (typeof window[functionName] !== \'function\') return; \n \n    try { \n        var callbackFunction = window[functionName]; \nreturn callbackFunction(); \n    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(\'median_library_ready\');");
            this.a.a("function median_do_callback(functionName) { \n    if (typeof window[functionName] !== \'function\') return; \n \n    try { \n        var callbackFunction = window[functionName]; \nreturn callbackFunction(); \n    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(\'gonative_library_ready\');");
            Log.d("co.median.android.u", "GoNative JSBridgeLibrary Injection Success");
            return;
        }
        catch(Exception exception0) {
        }
        Log.d("co.median.android.u", "GoNative JSBridgeLibrary Injection Error:- " + exception0.getMessage());
    }

    private void v() {
        if(TextUtils.isEmpty(this.o)) {
            return;
        }
        try {
            this.a.a("javascript:(function() {var parent = document.getElementsByTagName(\'head\').item(0);var script = document.createElement(\'script\');script.type = \'text/javascript\';script.innerHTML = window.atob(\'" + this.o + "\');parent.appendChild(script)})()");
            Log.d("co.median.android.u", "Custom JS Injection Success");
        }
        catch(Exception exception0) {
            g.a().c("co.median.android.u", "Error injecting customJS via javascript", exception0);
        }
    }

    public WebResourceResponse w(m m0, String s) {
        return this.f.d(this.a, m0, s, this.d);
    }

    private boolean x(Uri uri0) {
        String s = uri0.getScheme();
        if(s != null && (s.equalsIgnoreCase("http") || s.equalsIgnoreCase("https"))) {
            a a0 = a.V(this.a);
            I0.u u0 = a0.X;
            String s1 = uri0.toString();
            if(!u0.f()) {
                return u0.d(s1).equals("internal");
            }
            String s2 = uri0.getHost();
            return s2 != null && (s2.equals(a0.f) || s2.endsWith("." + a0.f));
        }
        return false;
    }

    private boolean y(String s) {
        if(s != null && s.startsWith("data:image/")) {
            try {
                byte[] arr_b = Base64.decode(s.substring(s.indexOf(",") + 1).trim(), 0);
                if(arr_b.length < 10) {
                    return false;
                }
                if(s.startsWith("data:image/gif")) {
                    String s1 = new String(arr_b, 0, 6, "US-ASCII");
                    return s1.equals("GIF87a") || s1.equals("GIF89a") ? (arr_b[6] & 0xFF | (arr_b[7] & 0xFF) << 8) == 1 && ((arr_b[9] & 0xFF) << 8 | arr_b[8] & 0xFF) == 1 : false;
                }
                if(s.startsWith("data:image/png")) {
                    return arr_b.length >= 24 ? ((arr_b[16] & 0xFF) << 24 | (arr_b[17] & 0xFF) << 16 | (arr_b[18] & 0xFF) << 8 | arr_b[19] & 0xFF) == 1 && ((arr_b[21] & 0xFF) << 16 | (arr_b[20] & 0xFF) << 24 | (arr_b[22] & 0xFF) << 8 | arr_b[23] & 0xFF) == 1 : false;
                }
                if(s.startsWith("data:image/jpeg")) {
                    for(int v = 2; v < arr_b.length && (arr_b[v] & 0xFF) == 0xFF; v += ((arr_b[v + 2] & 0xFF) << 8 | arr_b[v + 3] & 0xFF) + 2) {
                        switch(arr_b[v + 1] & 0xFF) {
                            case 0xC0: 
                            case 0xC2: {
                                return (arr_b[v + 8] & 0xFF | (arr_b[v + 7] & 0xFF) << 8) == 1 && ((arr_b[v + 5] & 0xFF) << 8 | arr_b[v + 6] & 0xFF) == 1;
                            }
                        }
                    }
                }
                return false;
            }
            catch(Exception unused_ex) {
            }
        }
        return false;
    }

    // 检测为 Lambda 实现
    private void z(String s) [...]
}

