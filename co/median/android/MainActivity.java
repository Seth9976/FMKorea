package co.median.android;

import A.s;
import B0.B0;
import B0.G0;
import B0.H0;
import B0.Q;
import B0.S;
import B0.T0;
import B0.V;
import B0.e0;
import B0.e;
import B0.n0;
import B0.p0;
import B0.p;
import B0.q0;
import B0.s0;
import B0.v0;
import B0.z0;
import I0.a.a;
import I0.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView.HitTestResult;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.d;
import co.median.android.widget.MedianProgressView;
import co.median.android.widget.SwipeHistoryNavigationLayout;
import co.median.android.widget.WebViewContainerView;
import co.median.android.widget.b.j;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.File;
import java.net.CookieHandler;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends d implements h, j, Observer {
    static abstract class b {
        static final int[] a;

        static {
            int[] arr_v = new int[a.values().length];
            b.a = arr_v;
            try {
                arr_v[a.f.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[a.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[a.h.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    class c implements Runnable {
        final MainActivity f;

        // 检测为 Lambda 实现
        private void b() [...]

        @Override
        public void run() {
            q q0 = () -> MainActivity.this.S1();
            MainActivity.this.runOnUiThread(q0);
            MainActivity.this.X.postDelayed(MainActivity.this.b0, 100L);
        }
    }

    class l extends BroadcastReceiver {
        final MainActivity a;

        private l() {
        }

        l(q0 q00) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            MainActivity.this.Q2();
            if(MainActivity.this.s0 != null) {
                MainActivity.this.S2(MainActivity.this.s0);
            }
        }
    }

    public interface m {
        void a(String[] arg1, int[] arg2);
    }

    class n {
        String[] a;
        m b;
        final MainActivity c;

        n(String[] arr_s, m mainActivity$m0) {
            this.a = arr_s;
            this.b = mainActivity$m0;
        }
    }

    public class o {
        final MainActivity a;

        // 检测为 Lambda 实现
        private void lambda$onReadyState$0(String s) [...]

        @JavascriptInterface
        public void onReadyState(String s) {
            p0 p00 = () -> MainActivity.this.T1(s);
            MainActivity.this.runOnUiThread(p00);
        }
    }

    private boolean A0;
    private boolean B0;
    private s C0;
    private String D0;
    private s0 E0;
    private String F0;
    private boolean G;
    private String G0;
    private WebViewContainerView H;
    private t H0;
    private I0.j I;
    private boolean I0;
    boolean J;
    private B0 J0;
    private Stack K;
    private static final String K0 = "co.median.android.MainActivity";
    private View L;
    public static final int L0;
    private String M;
    private MedianProgressView N;
    private MySwipeRefreshLayout O;
    private SwipeHistoryNavigationLayout P;
    private RelativeLayout Q;
    private ConnectivityManager R;
    private co.median.android.s S;
    private e T;
    private z0 U;
    private boolean V;
    private boolean W;
    private Handler X;
    private float Y;
    private boolean Z;
    private String a0;
    private final Runnable b0;
    private co.median.android.d c0;
    private g d0;
    private co.median.android.o e0;
    private r f0;
    private l g0;
    private V h0;
    private BroadcastReceiver i0;
    private BroadcastReceiver j0;
    private BroadcastReceiver k0;
    private boolean l0;
    protected String m0;
    protected String n0;
    private Stack o0;
    private co.median.android.n p0;
    private ArrayList q0;
    private ArrayList r0;
    private String s0;
    private String t0;
    private PhoneStateListener u0;
    private SignalStrength v0;
    private boolean w0;
    private androidx.activity.result.b x0;
    private androidx.activity.result.b y0;
    private String z0;

    static {
    }

    public MainActivity() {
        this.G = false;
        this.J = false;
        this.K = new Stack();
        this.R = null;
        this.W = false;
        this.X = new Handler();
        this.Y = 0.0f;
        this.Z = false;
        this.b0 = new c(this);
        this.l0 = false;
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.w0 = false;
        this.z0 = "";
        this.A0 = false;
        this.I0 = false;
    }

    // 检测为 Lambda 实现
    private void A2(String s, I0.d d0) [...]

    // 检测为 Lambda 实现
    private void B2(GoNativeApplication goNativeApplication0, s s0) [...]

    @Override  // I0.h
    public void C() {
        if(!this.e2().h(this.a0)) {
            this.finish();
        }
    }

    // 检测为 Lambda 实现
    private boolean C2() [...]

    // 检测为 Lambda 实现
    private void D2(Boolean boolean0) [...]

    // 检测为 Lambda 实现
    private void E2(ActivityResult activityResult0) [...]

    @Override  // I0.h
    public void F(boolean z) {
        this.w0 = z;
    }

    // 检测为 Lambda 实现
    private boolean F2() [...]

    @Override  // I0.h
    public void G(boolean z) {
        if(z) {
            B0.o.h(this);
            return;
        }
        B0.o.c(this);
    }

    // 检测为 Lambda 实现
    private void G2(String s, co.median.android.l l0) [...]

    @Override  // I0.h
    public void H(String s) {
        if(this.h0 != null && !TextUtils.isEmpty(s)) {
            this.a(I0.l.b(s, this.h0.c()));
        }
    }

    // 检测为 Lambda 实现
    private void H2(String s) [...]

    @Override  // I0.h
    public void I(String s) {
        if(!s.isEmpty()) {
            this.setTitle(s);
            return;
        }
        this.setTitle(0x7F120024);  // string:app_name "에펨코리아"
    }

    private void I2() {
        class co.median.android.MainActivity.j extends PhoneStateListener {
            final MainActivity a;

            @Override  // android.telephony.PhoneStateListener
            public void onSignalStrengthsChanged(SignalStrength signalStrength0) {
                MainActivity.this.v0 = signalStrength0;
                MainActivity.this.T2();
                if(MainActivity.this.s0 != null) {
                    String s = MainActivity.this.s0;
                    MainActivity.this.S2(s);
                }
            }
        }

        if(this.u0 != null) {
            return;
        }
        this.u0 = new co.median.android.MainActivity.j(this);
        try {
            TelephonyManager telephonyManager0 = (TelephonyManager)this.getSystemService("phone");
            if(telephonyManager0 == null) {
                I0.g.a().b("co.median.android.MainActivity", "Error getting system telephony manager");
                return;
            }
            telephonyManager0.listen(this.u0, 0x100);
            return;
        }
        catch(Exception exception0) {
        }
        I0.g.a().c("co.median.android.MainActivity", "Error listening for signal strength", exception0);
    }

    @Override  // I0.h
    public void J() {
        String s = this.I.getUrl();
        if(s != null && s.equals("file:///android_asset/offline.html")) {
            if(this.I.canGoBack()) {
                this.g2().i();
            }
            else {
                String s1 = this.M;
                if(s1 != null) {
                    this.I.loadUrl(s1);
                }
            }
            this.j3();
            return;
        }
        this.m0 = this.n0;
        this.I.loadUrl(s);
    }

    public void J2(String s) {
        t t0 = this.H0;
        if(t0 != null) {
            t0.c(s);
        }
    }

    public void K2() {
        this.I.stopLoading();
        this.Z();
        this.k3(false);
        this.e0.g();
        this.I.loadUrl(I0.a.V(this).U());
    }

    @Override  // I0.h
    public Map L(JSONArray jSONArray0) {
        return v0.a(this, jSONArray0);
    }

    public boolean L2(String s) {
        I0.a a0 = I0.a.V(this);
        co.median.android.l l0 = this.e2();
        if(a0.J && I0.l.m(s, a0.U())) {
            this.V = true;
            l0.j(this.a0);
            l0.o(this.a0, -1, -1);
            this.t2();
            e e0 = this.T;
            if(e0 != null) {
                e0.y(this.V);
                this.T.w(s, true);
            }
            z0 z00 = this.U;
            if(z00 != null) {
                z00.n(this.V);
                this.U.p(a0.L);
                this.U.r();
            }
            l0.l(this.a0, true);
            Intent intent0 = new Intent("io.gonative.android.MainActivity.Extra.BROADCAST_RECEIVER_ACTION_WEBVIEW_LIMIT_REACHED");
            intent0.putExtra("newRootUrl", s);
            X.a.b(this).d(intent0);
            l0.m(() -> {
                this.I.loadUrl(s);
                l0.m(null);
            });
            return true;
        }
        String s1 = l0.c();
        Intent intent1 = new Intent("io.gonative.android.MainActivity.Extra.BROADCAST_RECEIVER_ACTION_WEBVIEW_LIMIT_REACHED");
        intent1.putExtra("excessWindowId", s1);
        X.a.b(this).d(intent1);
        l0.i(s1);
        return false;
    }

    public void M2(Uri uri0) {
        if(uri0 == null) {
            return;
        }
        try {
            androidx.browser.customtabs.a a0 = new androidx.browser.customtabs.a.a().c(androidx.core.content.a.getColor(this, 0x7F060037)).b(androidx.core.content.a.getColor(this, 0x7F06033B)).a();  // color:colorPrimary
            androidx.browser.customtabs.d d0 = new androidx.browser.customtabs.d.d().c(a0).a();
            d0.a.setData(uri0);
            this.y0.a(d0.a);
        }
        catch(Exception exception0) {
            if(exception0 instanceof ActivityNotFoundException) {
                Toast.makeText(this, 0x7F120025, 1).show();  // string:app_not_installed "App is not installed"
                I0.g.a().d("co.median.android.MainActivity", "App is not installed", exception0, 2);
                return;
            }
            I0.g.a().c("co.median.android.MainActivity", "openAppBrowser: launchError - uri: " + uri0, exception0);
        }
    }

    @Override  // I0.h
    public void N(String s) {
        if(s.isEmpty()) {
            return;
        }
        ((ClipboardManager)this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy", s));
    }

    public void N1(String s) {
        if(s == null) {
            return;
        }
        if(this.K.isEmpty() || !((String)this.K.peek()).equals(s)) {
            this.K.push(s);
        }
        this.Q1(s);
        this.c3(0.3);
    }

    public void N2(Uri uri0) {
        if(uri0 == null) {
            return;
        }
        try {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            intent0.addFlags(0x10000000);
            if(this.u2(uri0)) {
                intent0.setPackage(this.Z1());
            }
            this.startActivity(intent0);
            return;
        label_9:
            if(exception0 instanceof ActivityNotFoundException) {
                goto label_10;
            }
            goto label_13;
        }
        catch(Exception exception0) {
            goto label_9;
        }
    label_10:
        Toast.makeText(this, 0x7F120025, 1).show();  // string:app_not_installed "App is not installed"
        I0.g.a().d("co.median.android.MainActivity", "App is not installed", exception0, 2);
        return;
    label_13:
        I0.g.a().c("co.median.android.MainActivity", "openExternalBrowser: launchError - uri: " + uri0, exception0);
    }

    @Override  // I0.h
    public void O() {
        this.I.clearCache(true);
    }

    public boolean O1() {
        return this.I == null ? false : this.I.canGoBack();
    }

    // 检测为 Lambda 实现
    private void O2() [...]

    @Override  // I0.h
    public void P() {
        this.S.i();
    }

    private boolean P1() {
        return this.I.canGoForward();
    }

    public void P2() {
        if(this.O != null) {
            I0.a a0 = I0.a.V(this);
            this.O.setEnabled(a0.E);
        }
    }

    @Override  // I0.h
    public void Q(String s) {
        V v0 = this.h0;
        if(v0 == null) {
            return;
        }
        v0.e(s);
    }

    public void Q1(String s) {
        if(s.equals(this.c0.u())) {
            return;
        }
        e e0 = this.T;
        if(e0 != null) {
            e0.w(s, true);
        }
        co.median.android.s s1 = this.S;
        if(s1 != null) {
            s1.h(s);
        }
        e e1 = this.T;
        if(e1 != null) {
            e1.m(s);
        }
        r r0 = this.f0;
        if(r0 != null) {
            r0.d(s);
        }
        z0 z00 = this.U;
        if(z00 != null) {
            z00.d(s);
        }
    }

    private void Q2() {
        I0.j j0 = this.I;
        if(j0 == null) {
            return;
        }
        if(j0.getProgress() < 100) {
            return;
        }
        String s = this.I.getUrl();
        if(s != null && !s.equals("file:///android_asset/offline.html")) {
            return;
        }
        if(this.K.isEmpty()) {
            return;
        }
        if(this.v2()) {
            return;
        }
        this.J2(((String)this.K.pop()));
    }

    @Override  // I0.h
    public void R(int v) {
        B0 b00 = this.J0;
        if(b00 != null) {
            b00.i(v);
        }
    }

    public void R1(String s) {
        co.median.android.s s1 = this.S;
        if(s1 != null) {
            s1.g(s);
        }
        z0 z00 = this.U;
        if(z00 != null) {
            z00.d(s);
            this.U.e(s);
        }
    }

    public void R2(String s, ValueCallback valueCallback0) {
        if(s == null) {
            return;
        }
        if(valueCallback0 != null) {
            this.I.d(s, valueCallback0);
            return;
        }
        this.I.a(s);
    }

    @Override  // I0.h
    public void S(String s) {
        if(!TextUtils.isEmpty(s)) {
            HashMap hashMap0 = new HashMap();
            ClipboardManager clipboardManager0 = (ClipboardManager)this.getSystemService("clipboard");
            if(clipboardManager0.hasPrimaryClip()) {
                CharSequence charSequence0 = clipboardManager0.getPrimaryClip().getItemAt(0).getText();
                if(charSequence0 == null) {
                    hashMap0.put("error", "Clipboard item is not a string.");
                }
                else {
                    hashMap0.put("data", charSequence0.toString());
                }
            }
            else {
                hashMap0.put("error", "No Clipboard item available.");
            }
            this.a(I0.l.b(s, new JSONObject(hashMap0)));
        }
    }

    public void S1() {
        I0.j j0 = this.I;
        if(j0 != null) {
            j0.a("if (median_status_checker && typeof median_status_checker.onReadyState === \'function\') median_status_checker.onReadyState(document.readyState);");
        }
    }

    private void S2(String s) {
        NetworkInfo networkInfo0 = this.R.getActiveNetworkInfo();
        boolean z = networkInfo0 != null && networkInfo0.isConnected();
        String s1 = networkInfo0 == null ? "DISCONNECTED" : networkInfo0.getTypeName();
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("connected", z);
            jSONObject0.put("type", s1);
            if(this.v0 != null) {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("cdmaDbm", this.v0.getCdmaDbm());
                jSONObject1.put("cdmaEcio", this.v0.getCdmaEcio());
                jSONObject1.put("evdoDbm", this.v0.getEvdoDbm());
                jSONObject1.put("evdoEcio", this.v0.getEvdoEcio());
                jSONObject1.put("evdoSnr", this.v0.getEvdoSnr());
                jSONObject1.put("gsmBitErrorRate", this.v0.getGsmBitErrorRate());
                jSONObject1.put("gsmSignalStrength", this.v0.getGsmSignalStrength());
                jSONObject1.put("level", this.v0.getLevel());
                jSONObject0.put("cellSignalStrength", jSONObject1);
            }
            this.a(I0.l.b(s, jSONObject0));
            return;
        }
        catch(JSONException jSONException0) {
        }
        I0.g.a().c("co.median.android.MainActivity", "JSON error sending connectivity", jSONException0);
    }

    @Override  // I0.h
    public void T(String s) {
        Intent intent0 = new Intent(this, LaunchActivity.class);
        intent0.setFlags(0x34000000);
        if(s != null && !s.isEmpty()) {
            intent0.putExtra("targetUrl", s);
        }
        this.startActivity(intent0);
    }

    private void T1(String s) {
        double f = I0.a.V(this).M0;
        if(s.equals("loading") || Double.isNaN(f) && s.equals("interactive")) {
            this.l0 = true;
        }
        else if(!Double.isNaN(f) && s.equals("interactive") || this.l0 && s.equals("complete")) {
            if(s.equals("interactive")) {
                this.c3(f);
            }
            else {
                this.b3();
            }
            if(this.B0) {
                this.f3();
            }
        }
        if(s.equals("complete") || s.equals("interactive")) {
            this.V1();
        }
    }

    // 检测为 Lambda 实现
    private void T2() [...]

    @Override  // I0.h
    public void U(String s) {
        class k implements Runnable {
            final MainActivity f;

            @Override
            public void run() {
                MainActivity.this.T2();
            }
        }

        if(s == null) {
            return;
        }
        this.t0 = s;
        if(this.u0 != null) {
            this.S2(s);
            return;
        }
        this.I2();
        new Handler().postDelayed(() -> {
            String s = MainActivity.this.t0;
            if(s == null) {
                return;
            }
            MainActivity.this.S2(s);
            MainActivity.this.t0 = null;
        }, 500L);
    }

    public void U1() {
        this.U.f();
    }

    private void U2(a a$a0) {
        switch(a$a0) {
            case 1: {
                this.setRequestedOrientation(-1);
                return;
            }
            case 2: {
                this.setRequestedOrientation(1);
                return;
            }
            case 3: {
                this.setRequestedOrientation(6);
            }
        }
    }

    @Override  // I0.h
    public void V(int v) {
        B0 b00 = this.J0;
        if(b00 != null) {
            b00.g(v);
        }
    }

    // 检测为 Lambda 实现
    private void V1() [...]

    private void V2() {
        I0.a a0 = I0.a.V(this);
        a a$a0 = a0.t;
        if(a$a0 != null) {
            this.U2(a$a0);
            return;
        }
        if(this.getResources().getBoolean(0x7F050006)) {  // bool:isTablet
            a a$a1 = a0.v;
            if(a$a1 != null) {
                this.U2(a$a1);
                return;
            }
        }
        else {
            a a$a2 = a0.u;
            if(a$a2 != null) {
                this.U2(a$a2);
                return;
            }
        }
        if(!a0.x) {
            this.U2(a.f);
        }
    }

    public void W1() {
        MySwipeRefreshLayout mySwipeRefreshLayout0 = this.O;
        if(mySwipeRefreshLayout0 != null) {
            mySwipeRefreshLayout0.setEnabled(true);
        }
    }

    public void W2(int v) {
        this.e2().n(this.a0, v);
    }

    @Override  // I0.h
    public void X(int v) {
        co.median.android.s s0 = this.S;
        if(s0 == null) {
            return;
        }
        s0.p(v, false);
    }

    public String X1() {
        return this.a0;
    }

    public void X2() {
        this.I.a(String.format("document.documentElement.setAttribute(\'data-color-scheme-option\', \'%s\');", this.F0));
    }

    @Override  // I0.h
    public void Y(String s) {
        s0 s00 = this.E0;
        if(s00 != null) {
            s00.e(s);
        }
    }

    private int Y1(Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeValue(bundle0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        return arr_b.length;
    }

    public void Y2(String s) {
        this.Z2(s, true);
    }

    @Override  // I0.h
    public void Z() {
        CookieManager cookieManager0 = CookieManager.getInstance();
        cookieManager0.removeAllCookies((Boolean boolean0) -> Log.d("co.median.android.MainActivity", "clearWebviewCookies: onReceiveValue callback: " + boolean0));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new n0(cookieManager0));
    }

    private String Z1() {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
        ResolveInfo resolveInfo0 = this.getPackageManager().resolveActivity(intent0, 0x10000);
        if(resolveInfo0 != null) {
            return resolveInfo0.activityInfo == null ? null : resolveInfo0.activityInfo.packageName;
        }
        return null;
    }

    public void Z2(String s, boolean z) {
        e e0 = this.T;
        if(e0 == null) {
            return;
        }
        e0.w(s, z);
    }

    @Override  // I0.h
    public void a(String s) {
        this.R2(s, null);
    }

    public s0 a2() {
        return this.E0;
    }

    private void a3(String s) {
        if(!r0.c.a("FORCE_DARK")) {
            Log.d("co.median.android.MainActivity", "Dark mode feature is not supported");
            return;
        }
        if(this.I.getSettings() == null) {
            return;
        }
        if("dark".equals(s)) {
            r0.a.b(this.I.getSettings(), 2);
        }
        else if("light".equals(s)) {
            r0.a.b(this.I.getSettings(), 0);
        }
        else {
            switch(this.getResources().getConfiguration().uiMode & 0x30) {
                case 0: 
                case 16: {
                    r0.a.b(this.I.getSettings(), 0);
                    break;
                }
                case 0x20: {
                    r0.a.b(this.I.getSettings(), 2);
                }
            }
            if(r0.c.a("FORCE_DARK_STRATEGY")) {
                r0.a.c(this.I.getSettings(), 1);
            }
        }
        this.X2();
    }

    @Override  // I0.h
    public void b(JSONObject jSONObject0, int v) {
        co.median.android.s s0 = this.S;
        if(s0 == null) {
            return;
        }
        s0.s(jSONObject0, v);
    }

    @Override  // I0.h
    public void b0(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Uri uri0 = Uri.parse(s);
        if("internal".equals(s1)) {
            this.J2(s);
            return;
        }
        if("external".equals(s1)) {
            this.N2(uri0);
            return;
        }
        if("appbrowser".equals(s1)) {
            this.M2(uri0);
            return;
        }
        I0.a a0 = I0.a.V(this);
        if(a0.H && a0.I > 0 && this.e2().f() >= a0.I && this.L2(s)) {
            return;
        }
        Intent intent0 = new Intent(this, MainActivity.class);
        intent0.putExtra("isRoot", false);
        intent0.putExtra("url", s);
        intent0.putExtra("ignoreInterceptMaxWindows", true);
        this.startActivityForResult(intent0, 400);
    }

    public co.median.android.d b2() {
        return this.c0;
    }

    // 检测为 Lambda 实现
    public void b3() [...]

    @Override  // co.median.android.widget.b$j
    public void c0() {
        this.J();
        this.g3(true, 1000);
    }

    public g c2() {
        return this.d0;
    }

    private void c3(double f) {
        if(((long)f) > 0L) {
            this.X.postDelayed(() -> {
                this.Z = false;
                this.l0 = false;
                if(!this.W) {
                    this.N.d();
                    return;
                }
                this.W = false;
                this.L.animate().alpha(0.0f).setDuration(300L).setStartDelay(150L);
                this.N.b();
            }, ((long)(((int)(((long)f) * 0x408F400000000000L)))));
            return;
        }
        this.b3();
    }

    @Override  // I0.h
    public I0.j d() {
        return this.I;
    }

    @Override  // I0.h
    public void d0(String s) {
        B0 b00 = this.J0;
        if(b00 != null) {
            b00.l(s);
        }
    }

    public RelativeLayout d2() {
        return this.Q;
    }

    public void d3() {
        this.Z = false;
        this.W = false;
        this.l0 = false;
        this.f3();
        this.L.setAlpha(0.0f);
        this.N.d();
    }

    @Override  // I0.h
    public void e(boolean z) {
        z0 z00 = this.U;
        if(z00 != null) {
            z00.l(z);
        }
    }

    @Override  // I0.h
    public void e0(JSONObject jSONObject0) {
        if(this.f0 == null) {
            return;
        }
        if(jSONObject0 != null) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject("customData");
            if(jSONObject1 == null) {
                try {
                    jSONObject1 = new JSONObject(jSONObject0.optString("customData"));
                }
                catch(JSONException jSONException0) {
                    I0.g.a().c("co.median.android.MainActivity", "GoNative Registration JSONException:- " + jSONException0.getMessage(), jSONException0);
                }
            }
            if(jSONObject1 != null) {
                this.f0.h(jSONObject1);
            }
        }
        this.f0.g();
    }

    public co.median.android.l e2() {
        return ((GoNativeApplication)this.getApplication()).j();
    }

    public void e3() {
        this.b0.run();
    }

    @Override  // I0.h
    public void f0(boolean z) {
        int v2;
        androidx.appcompat.app.a a0 = this.a1();
        View view0 = this.getWindow().getDecorView();
        int v = view0.getSystemUiVisibility();
        int v1 = Build.VERSION.SDK_INT;
        if(z) {
            v2 = v | 0x1A07;
            if(a0 != null) {
                a0.k();
            }
        }
        else {
            v2 = v & 0xFFFFE5F8;
            if(a0 != null && I0.a.V(this).L0) {
                a0.y();
            }
            this.I.clearFocus();
        }
        if(v1 >= 0x1F) {
            B0 b00 = this.J0;
            if(b00 != null) {
                b00.d(z);
            }
        }
        else {
            view0.setSystemUiVisibility(v2);
        }
        if(z && I0.a.V(this).t != a.h) {
            this.setRequestedOrientation(4);
            return;
        }
        this.V2();
    }

    public String f2() {
        return this.D0;
    }

    private void f3() {
        this.X.removeCallbacks(this.b0);
    }

    @Override  // I0.h
    public void g(int v) {
        B0 b00 = this.J0;
        if(b00 != null) {
            b00.h(v);
        }
    }

    public co.median.android.m g2() {
        return (co.median.android.m)this.I;
    }

    private void g3(boolean z, int v) {
        class co.median.android.MainActivity.h implements Runnable {
            final MainActivity f;

            @Override
            public void run() {
                MainActivity.this.O.setRefreshing(false);
            }
        }

        if(z && I0.a.V(this).j1) {
            new Handler().postDelayed(new co.median.android.MainActivity.h(this), ((long)v));
            return;
        }
        this.O.setRefreshing(false);
    }

    @Override  // I0.h
    public void h(float f) {
        WindowManager.LayoutParams windowManager$LayoutParams0 = this.getWindow().getAttributes();
        windowManager$LayoutParams0.screenBrightness = f;
        this.getWindow().setAttributes(windowManager$LayoutParams0);
    }

    public co.median.android.n h2() {
        return this.p0;
    }

    public void h3(I0.j j0, boolean z, boolean z1) {
        this.H.b(this, this.V);
        ((View)j0).scrollTo(0, 0);
        View view0 = (View)this.I;
        if(!z1) {
            Bundle bundle0 = new Bundle();
            this.I.b(bundle0);
            this.o0.add(bundle0);
        }
        if(j0 != view0) {
            ViewParent viewParent0 = j0.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(((View)j0));
            }
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            int v = viewGroup0.indexOfChild(view0);
            viewGroup0.removeView(view0);
            viewGroup0.addView(((View)j0), v);
            ((View)j0).setLayoutParams(view0.getLayoutParams());
            w.a(((co.median.android.m)view0));
            if(!this.J) {
                ((I0.j)view0).destroy();
            }
        }
        this.J = z;
        this.I = j0;
        String s = this.m0;
        if(s != null) {
            this.a(s);
            this.m0 = null;
        }
    }

    @Override  // I0.h
    public void i(boolean z) {
        if(this.J0 == null) {
            return;
        }
        I0.a.V(this).U0 = z;
        this.J0.f();
    }

    @Override  // I0.h
    public void i0() {
        this.p0.h();
    }

    public int i2() {
        return this.e2().d(this.a0);
    }

    public String i3(String s) {
        ArrayList arrayList0 = I0.a.V(this).V;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                HashMap hashMap0 = (HashMap)object0;
                Pattern pattern0 = (Pattern)hashMap0.get("regex");
                if(pattern0 != null && pattern0.matcher(s).matches() && hashMap0.containsKey("title")) {
                    return (String)hashMap0.get("title");
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Override  // I0.h
    public void j(String s, JSONObject jSONObject0) {
        s0 s00 = this.E0;
        if(s00 != null) {
            s00.b(s, jSONObject0);
        }
    }

    @Override  // I0.h
    public void j0(boolean z, int v) {
        if(z) {
            this.getWindow().addFlags(v);
            return;
        }
        this.getWindow().clearFlags(v);
    }

    public void j2(String[] arr_s, m mainActivity$m0) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(androidx.core.content.a.checkSelfPermission(this, arr_s[v]) != 0) {
                if(mainActivity$m0 != null) {
                    this.q0.add(new n(this, arr_s, mainActivity$m0));
                }
                androidx.core.app.b.e(this, arr_s, 0xC7);
                return;
            }
        }
        if(mainActivity$m0 != null) {
            int[] arr_v = new int[arr_s.length];
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                arr_v[v1] = 0;
            }
            mainActivity$m0.a(arr_s, arr_v);
        }
    }

    public void j3() {
        this.e0.g();
    }

    @Override  // I0.h
    public void k0(boolean z) {
        WebViewContainerView webViewContainerView0 = this.H;
        if(webViewContainerView0 == null) {
            return;
        }
        if(z) {
            this.registerForContextMenu(webViewContainerView0);
            return;
        }
        this.unregisterForContextMenu(webViewContainerView0);
    }

    public o k2() {
        return new o(this);
    }

    private void k3(boolean z) {
        z0 z00 = this.U;
        if(z00 == null) {
            return;
        }
        try {
            if(z) {
                z00.s("loggedIn");
                return;
            }
            z00.s("default");
            return;
        }
        catch(Exception exception0) {
        }
        I0.g.a().c("co.median.android.MainActivity", exception0.getMessage(), exception0);
    }

    @Override  // I0.h
    public void l(String s, String s1, boolean z, boolean z1, String s2) {
        this.c0.p(s, s1, z, z1, s2);
    }

    @Override  // I0.h
    public void l0(Map map0) {
        JSONObject jSONObject0 = S.b(map0);
        String s = (String)map0.get("callback");
        if(s != null && !s.isEmpty()) {
            String s1 = I0.l.b(s, jSONObject0);
            new Handler(this.getMainLooper()).post(() -> this.a(s1));
        }
    }

    public co.median.android.s l2() {
        return this.S;
    }

    public void l3() {
        if(I0.a.V(this).Z) {
            this.setTitle(this.I.getTitle());
        }
    }

    @Override  // I0.h
    public void m0(String s) {
        class co.median.android.MainActivity.a implements Runnable {
            final String f;
            final MainActivity g;

            co.median.android.MainActivity.a(String s) {
                this.f = s;
                super();
            }

            @Override
            public void run() {
                MainActivity.this.S2(this.f);
            }
        }

        this.s0 = s;
        this.I2();
        new Handler().postDelayed(new co.median.android.MainActivity.a(this, s), 500L);
    }

    private String m2(Intent intent0) {
        if(intent0 == null) {
            return null;
        }
        String s = intent0.getStringExtra("targetUrl");
        if(s != null && !s.isEmpty()) {
            return s;
        }
        if("android.intent.action.VIEW".equals(intent0.getAction())) {
            Uri uri0 = intent0.getData();
            if(uri0 != null && (uri0.getScheme().endsWith(".http") || uri0.getScheme().endsWith(".https"))) {
                Uri.Builder uri$Builder0 = uri0.buildUpon();
                if(uri0.getScheme().endsWith(".https")) {
                    uri$Builder0.scheme("https");
                    return uri$Builder0.build().toString();
                }
                if(uri0.getScheme().endsWith(".http")) {
                    uri$Builder0.scheme("http");
                }
                return uri$Builder0.build().toString();
            }
            return intent0.getDataString();
        }
        return null;
    }

    private boolean m3(String s, String s1) {
        if(s != null && s1 != null) {
            if(s.endsWith("/")) {
                s = s.substring(0, s.length() - 1);
            }
            if(s1.endsWith("/")) {
                s1 = s1.substring(0, s1.length() - 1);
            }
            if(s.startsWith("http://")) {
                s = "https://" + s.substring(7);
            }
            return s.equals(s1);
        }
        return false;
    }

    @Override  // I0.h
    public void n0(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        new p(this).c(s);
        this.F0 = s;
        this.A0 = true;
        if(Build.VERSION.SDK_INT >= 0x1F) {
            G0.g(this, s);
        }
        else {
            G0.f(s);
        }
        this.X2();
    }

    public int n2() {
        return this.e2().e(this.a0);
    }

    public int n3(String s) {
        ArrayList arrayList0 = I0.a.V(this).T;
        if(arrayList0 != null) {
            for(int v = 0; v < arrayList0.size(); ++v) {
                if(((Pattern)arrayList0.get(v)).matcher(s).matches()) {
                    return (int)(((Integer)I0.a.V(this).U.get(v)));
                }
            }
        }
        return -1;
    }

    public t o2() {
        return this.H0;
    }

    private void o3() {
    }

    @Override  // androidx.fragment.app.h
    protected void onActivityResult(int v, int v1, Intent intent0) {
        boolean z;
        String s;
        super.onActivityResult(v, v1, intent0);
        ((GoNativeApplication)this.getApplication()).q.n(this, v, v1, intent0);
        if(intent0 != null && intent0.getBooleanExtra("exit", false)) {
            this.finish();
        }
        if(intent0 == null) {
            s = null;
            z = false;
        }
        else {
            s = intent0.getStringExtra("url");
            z = intent0.getBooleanExtra("success", false);
        }
        if(v == 300 && v1 == -1) {
            if(s == null) {
                this.I.setCheckLoginSignup(false);
                this.I.loadUrl(I0.a.V(this).U());
            }
            else {
                this.J2(s);
            }
            if(I0.a.V(this).L) {
                this.k3(z);
            }
        }
        if(v == 400 && v1 == -1 && s != null) {
            int v2 = intent0.getIntExtra("urlLevel", -1);
            int v3 = this.e2().d(this.a0);
            if(v2 != -1 && v3 != -1 && v2 <= v3) {
                this.setResult(-1, intent0);
                this.finish();
                return;
            }
            this.m0 = intent0.getStringExtra("postLoadJavascript");
            this.J2(s);
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override  // androidx.appcompat.app.d
    public void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        GoNativeApplication goNativeApplication0 = (GoNativeApplication)this.getApplication();
        if(this.U != null && I0.a.V(this).L) {
            this.U.q(configuration0);
        }
        goNativeApplication0.q.s(this);
    }

    @Override  // android.app.Activity
    public boolean onContextItemSelected(MenuItem menuItem0) {
        int v = menuItem0.getItemId();
        if(v == 1) {
            this.N(this.G0);
            return true;
        }
        if(v == 2) {
            this.N2(Uri.parse(this.G0));
            return true;
        }
        return super.onContextItemSelected(menuItem0);
    }

    @Override  // android.app.Activity
    public void onContextMenuClosed(Menu menu0) {
        super.onContextMenuClosed(menu0);
        this.G0 = "";
    }

    @Override  // androidx.fragment.app.h
    protected void onCreate(Bundle bundle0) {
        class co.median.android.MainActivity.d implements co.median.android.widget.SwipeHistoryNavigationLayout.a {
            final I0.a a;
            final MainActivity b;

            co.median.android.MainActivity.d(I0.a a0) {
                this.a = a0;
                super();
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public void a() {
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public void b() {
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public String c() {
                return "";
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean d() {
                if(this.a.F && MainActivity.this.P1()) {
                    MainActivity.this.q2();
                    return true;
                }
                return false;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean e() {
                return MainActivity.this.I.getMaxHorizontalScroll() <= 0 || MainActivity.this.I.getScrollX() >= MainActivity.this.I.getMaxHorizontalScroll() ? MainActivity.this.P1() : false;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean f() {
                if(this.a.F && MainActivity.this.O1()) {
                    MainActivity.this.p2();
                    return true;
                }
                return false;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean g() {
                return this.a.F;
            }

            @Override  // co.median.android.widget.SwipeHistoryNavigationLayout$a
            public boolean h() {
                return MainActivity.this.I.getMaxHorizontalScroll() <= 0 || MainActivity.this.I.getScrollX() <= 0 ? MainActivity.this.O1() : false;
            }
        }


        class co.median.android.MainActivity.e extends BroadcastReceiver {
            final MainActivity a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if("io.gonative.android.AppConfig.processedNavigationTitles".equals(intent0.getAction())) {
                    String s = MainActivity.this.I.getUrl();
                    if(s == null) {
                        return;
                    }
                    String s1 = MainActivity.this.i3(s);
                    if(s1 != null) {
                        MainActivity.this.setTitle(s1);
                        return;
                    }
                    MainActivity.this.Y2(s);
                }
            }
        }


        class f extends BroadcastReceiver {
            final MainActivity a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if("io.gonative.android.AppConfig.processedNavigationLevels".equals(intent0.getAction())) {
                    String s = MainActivity.this.I.getUrl();
                    if(s == null) {
                        return;
                    }
                    int v = MainActivity.this.n3(s);
                    MainActivity.this.W2(v);
                }
            }
        }


        class co.median.android.MainActivity.g extends BroadcastReceiver {
            final MainActivity a;

            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                if("io.gonative.android.MainActivity.Extra.BROADCAST_RECEIVER_ACTION_WEBVIEW_LIMIT_REACHED".equals(intent0.getAction())) {
                    String s = intent0.getStringExtra("excessWindowId");
                    if(!TextUtils.isEmpty(s)) {
                        if(s.equals(MainActivity.this.a0)) {
                            MainActivity.this.finish();
                        }
                        return;
                    }
                    if(!MainActivity.this.e2().h(MainActivity.this.a0)) {
                        MainActivity.this.finish();
                    }
                }
            }
        }

        String s2;
        boolean z2;
        I0.a a0 = I0.a.V(this);
        GoNativeApplication goNativeApplication0 = (GoNativeApplication)this.getApplication();
        co.median.android.l l0 = goNativeApplication0.j();
        boolean z = true;
        this.V = this.getIntent().getBooleanExtra("isRoot", true);
        this.D0 = TextUtils.isEmpty(this.getIntent().getStringExtra("source")) ? "default" : this.D0;
        if(this.V) {
            A.g g0 = A.g.c(this);
            boolean z1 = bundle0 != null && bundle0.getBoolean("configurationChanged", false);
            if(!a0.h1.c() || z1) {
                g0.d(() -> !this.B0);
                new Handler(Looper.getMainLooper()).postDelayed(() -> {
                    this.B0 = true;
                    this.f3();
                    if(this.I0) {
                        this.O2();
                    }
                }, 7000L);
            }
            else {
                g0.e((s s0) -> {
                    this.C0 = s0;
                    e0 e00 = new e0(this);
                    goNativeApplication0.q.a(this, s0, e00);
                    new Handler(Looper.getMainLooper()).postDelayed(() -> {
                        class i extends AnimatorListenerAdapter {
                            final MainActivity a;

                            @Override  // android.animation.AnimatorListenerAdapter
                            public void onAnimationEnd(Animator animator0) {
                                if(MainActivity.this.C0 != null) {
                                    MainActivity.this.C0.b();
                                    MainActivity.this.C0 = null;
                                }
                                I0.a a0 = I0.a.V(MainActivity.this);
                                MainActivity.this.d0(a0.V0);
                                I0.a a1 = I0.a.V(MainActivity.this);
                                MainActivity.this.p(a1.W0);
                            }
                        }

                        s s0 = this.C0;
                        if(s0 != null) {
                            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(s0.a(), View.ALPHA, new float[]{1.0f, 0.0f});
                            objectAnimator0.setInterpolator(new AccelerateInterpolator());
                            objectAnimator0.setDuration(100L);
                            objectAnimator0.addListener(new i(this));
                            objectAnimator0.start();
                        }
                    }, 7000L);
                });
            }
        }
        B0 b00 = new B0(this);
        this.J0 = b00;
        b00.b();
        if(a0.w) {
            this.getWindow().addFlags(0x80);
        }
        this.Y = a0.Y0;
        this.F0 = G0.a(this);
        if(Build.VERSION.SDK_INT <= 30) {
            if((bundle0 == null ? false : bundle0.getBoolean("ignoreThemeSetup", false))) {
                Log.d("co.median.android.MainActivity", "onCreate: configuration change from setupAppTheme(), ignoring theme setup");
            }
            else {
                G0.f(this.F0);
            }
        }
        super.onCreate(bundle0);
        this.a0 = "d91e2a7e-dbcb-416b-8c9f-a2ad1b0b3b28";
        int v = this.getIntent().getIntExtra("urlLevel", -1);
        int v1 = this.getIntent().getIntExtra("parentUrlLevel", -1);
        if(bundle0 != null) {
            this.a0 = bundle0.getString("activityId", this.a0);
            this.V = bundle0.getBoolean("isRoot", this.V);
            v = bundle0.getInt("urlLevel", v);
            v1 = bundle0.getInt("parentUrlLevel", v1);
        }
        l0.a(this.a0, this.V);
        l0.o(this.a0, v, v1);
        if(a0.H) {
            l0.l(this.a0, this.getIntent().getBooleanExtra("ignoreInterceptMaxWindows", false));
        }
        if(this.V) {
            this.t2();
        }
        this.e0 = goNativeApplication0.f();
        this.d0 = new g(this);
        this.c0 = new co.median.android.d(this);
        this.E0 = new s0(this);
        this.x0 = this.I0(new d.c(), (Boolean boolean0) -> this.u(this.z0, false));
        this.y0 = this.I0(new d.d(), (ActivityResult activityResult0) -> this.a("function median_do_callback(functionName) { \n    if (typeof window[functionName] !== \'function\') return; \n \n    try { \n        var callbackFunction = window[functionName]; \nreturn callbackFunction(); \n    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(\'median_appbrowser_closed\');"));
        this.p0 = new co.median.android.n(this);
        goNativeApplication0.h().p(this);
        this.R = (ConnectivityManager)this.getSystemService("connectivity");
        this.setContentView(0x7F0C001C);  // layout:activity_median
        goNativeApplication0.q.j(this, this.V);
        ViewGroup viewGroup0 = (ViewGroup)this.findViewById(0x1020002);
        this.J0.j(viewGroup0);
        if(a0.x) {
            this.f0(true);
        }
        this.V2();
        this.Q = (RelativeLayout)this.findViewById(0x7F0900D2);  // id:fullscreen
        MySwipeRefreshLayout mySwipeRefreshLayout0 = (MySwipeRefreshLayout)this.findViewById(0x7F0901D6);  // id:swipe_refresh
        this.O = mySwipeRefreshLayout0;
        mySwipeRefreshLayout0.setEnabled(a0.E);
        this.O.setOnRefreshListener(this);
        this.O.setCanChildScrollUpCallback(() -> this.I.getWebViewScrollY() > 10);
        if(a0.a0()) {
            a0.F = false;
        }
        SwipeHistoryNavigationLayout swipeHistoryNavigationLayout0 = (SwipeHistoryNavigationLayout)this.findViewById(0x7F0901D5);  // id:swipe_history_nav
        this.P = swipeHistoryNavigationLayout0;
        swipeHistoryNavigationLayout0.setEnabled(a0.F);
        this.P.setSwipeNavListener(new co.median.android.MainActivity.d(this, a0));
        this.O.setColorSchemeColors(new int[]{androidx.core.content.a.getColor(this, 0x7F060321)});  // color:pull_to_refresh_color
        this.P.setActiveColor(androidx.core.content.a.getColor(this, 0x7F060321));  // color:pull_to_refresh_color
        this.O.setProgressBackgroundColorSchemeColor(androidx.core.content.a.getColor(this, 0x7F06032F));  // color:swipe_nav_background
        this.P.setBackgroundColor(androidx.core.content.a.getColor(this, 0x7F06032F));  // color:swipe_nav_background
        this.N = (MedianProgressView)this.findViewById(0x7F090185);  // id:progress
        goNativeApplication0.q.f(this);
        this.N.e();
        CookieHandler.setDefault(new T0());
        String s = this.getIntent().getStringExtra("postLoadJavascript");
        this.m0 = s;
        this.n0 = s;
        this.o0 = new Stack();
        co.median.android.s s1 = new co.median.android.s(this, ((BottomNavigationView)this.findViewById(0x7F090061)));  // id:bottom_navigation
        this.S = s1;
        s1.t(false);
        e e0 = new e(this);
        this.T = e0;
        e0.y(this.V);
        z0 z00 = new z0(this);
        this.U = z00;
        z00.n(this.V);
        if(!a0.L0 && !a0.L) {
            androidx.appcompat.app.a a1 = this.a1();
            Objects.requireNonNull(a1);
            a1.k();
        }
        this.L = this.findViewById(0x7F09021A);  // id:webviewOverlay
        WebViewContainerView webViewContainerView0 = (WebViewContainerView)this.findViewById(0x7F090219);  // id:webviewContainer
        this.H = webViewContainerView0;
        this.I = webViewContainerView0.getWebview();
        this.H0 = new t(this, !a0.D);
        this.H.b(this, this.V);
        this.a3(this.F0);
        if(bundle0 == null) {
            z2 = false;
        }
        else {
            Bundle bundle1 = bundle0.getBundle("webViewState");
            if(bundle1 == null) {
                z2 = false;
            }
            else {
                this.I.f(bundle1);
                z2 = true;
            }
            int v2 = bundle0.getInt("scrollX", 0);
            int v3 = bundle0.getInt("scrollY", 0);
            this.I.scrollTo(v2, v3);
        }
        if(!z2 || TextUtils.isEmpty(this.I.getUrl())) {
            Intent intent0 = this.getIntent();
            String s3 = this.m2(intent0);
            if(s3 == null && this.V) {
                s3 = a0.U();
            }
            if(s3 == null) {
                s3 = intent0.getStringExtra("url");
            }
            if(s3 == null) {
                if(!intent0.getBooleanExtra("io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN", false)) {
                    I0.g.a().b("co.median.android.MainActivity", "No url specified for MainActivity");
                }
                s2 = null;
            }
            else {
                Map map0 = goNativeApplication0.q.d(this, this.V);
                if(map0 == null || map0.isEmpty()) {
                    s2 = s3;
                }
                else {
                    Uri.Builder uri$Builder0 = Uri.parse(s3).buildUpon();
                    for(Object object0: map0.entrySet()) {
                        uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                    }
                    s2 = uri$Builder0.build().toString();
                }
                this.M = s2;
                this.I.loadUrl(s2);
            }
        }
        else {
            s2 = this.I.getUrl();
        }
        this.T.w(s2, true);
        z0 z01 = this.U;
        if(!this.V || !a0.L) {
            z = false;
        }
        z01.p(z);
        this.h0 = new V(this, viewGroup0);
        this.i0 = new co.median.android.MainActivity.e(this);
        X.a.b(this).c(this.i0, new IntentFilter("io.gonative.android.AppConfig.processedNavigationTitles"));
        this.j0 = new f(this);
        X.a.b(this).c(this.j0, new IntentFilter("io.gonative.android.AppConfig.processedNavigationLevels"));
        this.k0 = new co.median.android.MainActivity.g(this);
        X.a.b(this).c(this.k0, new IntentFilter("io.gonative.android.MainActivity.Extra.BROADCAST_RECEIVER_ACTION_WEBVIEW_LIMIT_REACHED"));
        if(a0.Y3) {
            this.O2();
        }
        this.k0(a0.r1.a());
    }

    @Override  // android.app.Activity
    public void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        super.onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
        WebView.HitTestResult webView$HitTestResult0 = this.I.getHitTestResult();
        String s = webView$HitTestResult0.getExtra();
        int v = webView$HitTestResult0.getType();
        if(!TextUtils.isEmpty(s) && v == 7) {
            this.G0 = s;
            contextMenu0.clear();
            contextMenu0.setHeaderTitle(this.G0);
            K0.e e0 = I0.a.V(this).r1;
            if(e0 != null && e0.a() && e0.b().b()) {
                if(e0.b().a()) {
                    contextMenu0.add(0, 1, 0, 0x7F12001C);  // string:action_copy "Copy to clipboard"
                }
                if(e0.b().c()) {
                    contextMenu0.add(0, 2, 0, 0x7F12001D);  // string:action_open_browser "Open in browser"
                }
            }
        }
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F0E0000, menu0);  // mipmap:ic_launcher
        e e0 = this.T;
        if(e0 != null) {
            e0.g(menu0);
        }
        return true;
    }

    @Override  // androidx.appcompat.app.d
    protected void onDestroy() {
        super.onDestroy();
        GoNativeApplication goNativeApplication0 = (GoNativeApplication)this.getApplication();
        goNativeApplication0.q.k(this);
        goNativeApplication0.j().i(this.a0);
        co.median.android.d d0 = this.c0;
        if(d0 != null) {
            d0.K();
        }
        I0.j j0 = this.I;
        if(j0 != null) {
            j0.stopLoading();
            ViewGroup viewGroup0 = (ViewGroup)this.I.getParent();
            if(viewGroup0 != null) {
                viewGroup0.removeView(((View)this.I));
            }
            if(!this.J) {
                this.I.destroy();
            }
        }
        this.e0.deleteObserver(this);
        if(this.i0 != null) {
            X.a.b(this).e(this.i0);
        }
        if(this.j0 != null) {
            X.a.b(this).e(this.j0);
        }
        if(this.k0 != null) {
            X.a.b(this).e(this.k0);
        }
        co.median.android.s s0 = this.S;
        if(s0 != null) {
            s0.u();
        }
        if(goNativeApplication0.h() != null) {
            goNativeApplication0.h().s(this);
        }
    }

    @Override  // androidx.appcompat.app.d
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(v == 4) {
            if(I0.a.V(this).b0) {
                return true;
            }
            if(this.I.c()) {
                return true;
            }
            if(this.U != null && this.U.i()) {
                this.U.f();
                return true;
            }
            if(this.O1()) {
                this.p2();
                return true;
            }
            if(!this.o0.isEmpty()) {
                Bundle bundle0 = (Bundle)this.o0.pop();
                co.median.android.m m0 = new co.median.android.m(this);
                m0.f(bundle0);
                this.h3(m0, false, true);
                return true;
            }
        }
        return ((GoNativeApplication)this.getApplication()).q.u(v, keyEvent0) ? true : super.onKeyDown(v, keyEvent0);
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        String s = this.m2(intent0);
        if(s != null && !s.isEmpty()) {
            if(this.I.getUrl().isEmpty()) {
                this.J2(s);
                this.M = s;
                return;
            }
            if(!this.m3(s, this.I.getUrl())) {
                this.H0.d(s, true);
            }
            return;
        }
        Log.w("co.median.android.MainActivity", "Received intent without url");
        ((GoNativeApplication)this.getApplication()).q.l(this, intent0);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(this.U != null && this.U.j(menuItem0)) {
            return true;
        }
        if(menuItem0.getItemId() == 0x102002C) {
            if(this.T != null && this.T.l()) {
                return true;
            }
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.h
    protected void onPause() {
        super.onPause();
        GoNativeApplication goNativeApplication0 = (GoNativeApplication)this.getApplication();
        goNativeApplication0.q.m(this);
        this.G = true;
        this.f3();
        if(this.I != null && goNativeApplication0.q.z()) {
            this.I.onPause();
        }
        l mainActivity$l0 = this.g0;
        if(mainActivity$l0 != null) {
            this.unregisterReceiver(mainActivity$l0);
        }
        CookieManager.getInstance().flush();
    }

    @Override  // androidx.appcompat.app.d
    protected void onPostCreate(Bundle bundle0) {
        super.onPostCreate(bundle0);
        ((GoNativeApplication)this.getApplication()).q.w(this, bundle0, this.V);
        z0 z00 = this.U;
        if(z00 != null) {
            z00.r();
        }
    }

    @Override  // androidx.fragment.app.h
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        super.onRequestPermissionsResult(v, arr_s, arr_v);
        ((GoNativeApplication)this.getApplication()).q.x(this, v, arr_s, arr_v);
        if(v == 0xC7) {
            Iterator iterator0 = this.q0.iterator();
        label_4:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                n mainActivity$n0 = (n)object0;
                if(mainActivity$n0.a.length == arr_s.length) {
                    int v1 = 0;
                    while(true) {
                        String[] arr_s1 = mainActivity$n0.a;
                        if(v1 >= arr_s1.length || v1 >= arr_s.length) {
                            break;
                        }
                        if(!arr_s1[v1].equals(arr_s[v1])) {
                            continue label_4;
                        }
                        ++v1;
                    }
                    m mainActivity$m0 = mainActivity$n0.b;
                    if(mainActivity$m0 != null) {
                        mainActivity$m0.a(arr_s, arr_v);
                    }
                    iterator0.remove();
                }
            }
            if(this.q0.size() == 0 && this.r0.size() > 0) {
                Iterator iterator1 = this.r0.iterator();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    this.startActivity(((Intent)object1));
                    iterator1.remove();
                }
            }
        }
    }

    @Override  // androidx.fragment.app.h
    protected void onResume() {
        super.onResume();
        this.e2().k(this.a0);
        GoNativeApplication goNativeApplication0 = (GoNativeApplication)this.getApplication();
        goNativeApplication0.o(false);
        goNativeApplication0.q.o(this);
        I0.j j0 = this.I;
        if(j0 != null) {
            j0.onResume();
        }
        I0.a a0 = I0.a.V(this);
        if(this.G) {
            this.G = false;
            if(a0.D) {
                this.a("function median_do_callback(functionName) { \n    if (typeof window[functionName] !== \'function\') return; \n \n    try { \n        var callbackFunction = window[functionName]; \nreturn callbackFunction(); \n    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(\'median_app_resumed\');");
                this.a("function median_do_callback(functionName) { \n    if (typeof window[functionName] !== \'function\') return; \n \n    try { \n        var callbackFunction = window[functionName]; \nreturn callbackFunction(); \n    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(\'gonative_app_resumed\');");
            }
            else {
                this.a("function median_do_callback(functionName) { \n    if (typeof window[functionName] !== \'function\') return; \n \n    try { \n        var callbackFunction = window[functionName]; \nreturn callbackFunction(); \n    } catch (ignored) { \n \n    } \n} \nmedian_do_callback(\'_median_app_resumed\');");
            }
        }
        this.Q2();
        l mainActivity$l0 = new l(this, null);
        this.g0 = mainActivity$l0;
        this.registerReceiver(mainActivity$l0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.e0.g();
        this.c0.D();
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(Bundle bundle0) {
        bundle0.putBoolean("configurationChanged", true);
        if(this.I != null) {
            Bundle bundle1 = new Bundle();
            this.I.b(bundle1);
            bundle0.putBundle("webViewState", bundle1);
            bundle0.putString("activityId", this.a0);
            bundle0.putBoolean("isRoot", this.e2().h(this.a0));
            bundle0.putInt("urlLevel", this.e2().e(this.a0));
            bundle0.putInt("parentUrlLevel", this.e2().d(this.a0));
            bundle0.putInt("scrollX", this.I.getWebViewScrollX());
            bundle0.putInt("scrollY", this.I.getWebViewScrollY());
        }
        if(this.A0) {
            bundle0.putBoolean("ignoreThemeSetup", true);
        }
        if(this.Y1(bundle0) > 0x7D000) {
            bundle0.clear();
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // androidx.appcompat.app.d
    protected void onStart() {
        super.onStart();
        ((GoNativeApplication)this.getApplication()).q.p(this);
        if(I0.a.V(this).s1.c()) {
            B0.o.d(this);
        }
    }

    @Override  // androidx.appcompat.app.d
    protected void onStop() {
        super.onStop();
        ((GoNativeApplication)this.getApplication()).q.q(this);
        if(this.V && I0.a.V(this).r) {
            this.I.clearCache(true);
        }
    }

    @Override  // I0.h
    public void p(String s) {
        B0 b00 = this.J0;
        if(b00 != null) {
            b00.m(s);
        }
    }

    public void p2() {
        if(this.I == null) {
            return;
        }
        this.I.goBack();
    }

    @Override  // I0.h
    public boolean q() {
        return this.p0.g();
    }

    private void q2() {
        this.I.goForward();
    }

    public void r2(String s) {
        if(s.isEmpty()) {
            return;
        }
        this.runOnUiThread(() -> try {
            ((GoNativeApplication)this.getApplication()).q.g(this, new JSONObject(s));
        }
        catch(JSONException unused_ex) {
            ((GoNativeApplication)this.getApplication()).q.g(this, Uri.parse(s));
        });
    }

    @Override  // I0.h
    public void s(boolean z) {
        if(this.J0 == null) {
            return;
        }
        I0.a.V(this).T0 = z;
        this.J0.f();
    }

    public void s2() {
        ((GoNativeApplication)this.getApplication()).q.t(this);
        if(I0.a.V(this).j1) {
            return;
        }
        this.W = true;
        this.N.f();
        if(this.Z) {
            this.L.setAlpha(1.0f);
        }
        else {
            this.L.setAlpha(1.0f - this.Y);
        }
        this.c3(10.0);
    }

    @Override  // android.app.Activity
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        e e0 = this.T;
        if(e0 != null) {
            e0.v(charSequence0);
        }
    }

    private void t2() {
        File file0 = new File(this.getCacheDir(), "webviewDatabase");
        if(file0.mkdirs()) {
            Log.v("co.median.android.MainActivity", "databasePath " + file0.toString() + " exists");
        }
        H0.a().c(this);
        new co.median.android.a(this).b();
        this.f0 = ((GoNativeApplication)this.getApplication()).g();
    }

    @Override  // I0.h
    public void u(String s, boolean z) {
        if(z) {
            this.z0 = s;
            this.x0.a("android.permission.READ_PHONE_STATE");
            return;
        }
        Map map0 = Q.b(this);
        map0.put("isFirstLaunch", Boolean.valueOf(((GoNativeApplication)this.getApplication()).k()));
        map0.putAll(((GoNativeApplication)this.getApplication()).q.c(this));
        this.a(I0.l.b(s, new JSONObject(map0)));
    }

    private boolean u2(Uri uri0) {
        if(uri0 == null) {
            return false;
        }
        ArrayList arrayList0 = I0.a.V(this).k0;
        return arrayList0 == null || arrayList0.isEmpty() ? false : arrayList0.contains(uri0.getHost());
    }

    @Override
    public void update(Observable observable0, Object object0) {
        if(observable0 instanceof co.median.android.o) {
            this.k3(((co.median.android.o)observable0).h());
        }
    }

    @Override  // I0.h
    public void v() {
        this.s0 = null;
    }

    public boolean v2() {
        NetworkInfo networkInfo0 = this.R.getActiveNetworkInfo();
        return networkInfo0 == null || !networkInfo0.isConnected();
    }

    @Override  // I0.h
    public void w(String s, String s1) {
        String s2 = this.I.getUrl();
        if(TextUtils.isEmpty(s)) {
            s = s2;
        }
        else {
            try {
                URI uRI0 = new URI(s);
                if(!uRI0.isAbsolute()) {
                    s = new URI(s2).resolve(uRI0).toString();
                }
            }
            catch(URISyntaxException unused_ex) {
            }
        }
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(!TextUtils.isEmpty(s1)) {
            s = s1 + "\r\n" + s;
        }
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType("text/plain");
        intent0.putExtra("android.intent.extra.TEXT", s);
        this.startActivity(Intent.createChooser(intent0, "Share"));
    }

    public boolean w2() {
        return !this.V;
    }

    @Override  // I0.h
    public Map x() {
        return Q.b(this);
    }

    public boolean x2() {
        return this.w0;
    }

    @Override  // I0.h
    public void y() {
        I0.a a0 = I0.a.V(this);
        this.F0 = a0.I0;
        this.n0(a0.I0);
    }

    public boolean y2() {
        return this.a0.equals(this.e2().b());
    }

    @Override  // I0.h
    public void z(String s) {
        s0 s00 = this.E0;
        if(s00 != null) {
            s00.d(s);
        }
    }

    // 检测为 Lambda 实现
    private static void z2(Boolean boolean0) [...]
}

