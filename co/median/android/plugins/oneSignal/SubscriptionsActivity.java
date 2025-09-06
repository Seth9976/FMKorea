package co.median.android.plugins.oneSignal;

import G0.l;
import G0.m;
import G0.n;
import G0.o;
import G0.q;
import I0.k;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;
import androidx.preference.h;
import androidx.preference.j;
import com.onesignal.I1;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class SubscriptionsActivity extends d {
    public static class a extends h {
        private co.median.android.plugins.oneSignal.a o;

        // 检测为 Lambda 实现
        private static boolean D(String s, Preference preference0, Object object0) [...]

        public void E(co.median.android.plugins.oneSignal.a a0) {
            this.o = a0;
        }

        @Override  // androidx.preference.h
        public void onCreate(Bundle bundle0) {
            super.onCreate(bundle0);
            androidx.fragment.app.h h0 = this.getActivity();
            if(h0 == null) {
                return;
            }
            SharedPreferences sharedPreferences0 = j.c(h0);
            SharedPreferences.Editor sharedPreferences$Editor0 = null;
            for(Object object0: sharedPreferences0.getAll().keySet()) {
                String s = (String)object0;
                if(s.startsWith("oneSignalTag:")) {
                    if(sharedPreferences$Editor0 == null) {
                        sharedPreferences$Editor0 = sharedPreferences0.edit();
                    }
                    sharedPreferences$Editor0.remove(s);
                }
            }
            if(sharedPreferences$Editor0 != null) {
                sharedPreferences$Editor0.apply();
            }
            PreferenceScreen preferenceScreen0 = this.p().a(h0);
            co.median.android.plugins.oneSignal.a a0 = this.o;
            if(a0 != null) {
                for(Object object1: a0.a) {
                    PreferenceCategory preferenceCategory0 = new PreferenceCategory(h0);
                    preferenceCategory0.B0(((b)object1).a);
                    preferenceScreen0.H0(preferenceCategory0);
                    for(Object object2: ((b)object1).b) {
                        String s1 = ((co.median.android.plugins.oneSignal.a.a)object2).a;
                        CheckBoxPreference checkBoxPreference0 = new CheckBoxPreference(h0);
                        checkBoxPreference0.B0(((co.median.android.plugins.oneSignal.a.a)object2).b);
                        checkBoxPreference0.I0(((co.median.android.plugins.oneSignal.a.a)object2).c);
                        checkBoxPreference0.s0("oneSignalTag:" + s1);
                        checkBoxPreference0.v0((Preference preference0, Object object0) -> {
                            if(object0 instanceof Boolean && ((Boolean)object0).booleanValue()) {
                                I1.S1(s1, "1");
                                return true;
                            }
                            I1.J(s1);
                            return true;
                        });
                        preferenceCategory0.H0(checkBoxPreference0);
                    }
                }
            }
            this.A(preferenceScreen0);
        }

        @Override  // androidx.preference.h
        public void u(Bundle bundle0, String s) {
        }
    }

    private final ExecutorService G;
    private final Handler H;
    private ProgressBar I;
    private static final String J = "co.median.android.plugins.oneSignal.SubscriptionsActivity";

    static {
    }

    public SubscriptionsActivity() {
        this.G = Executors.newSingleThreadExecutor();
        this.H = new Handler(Looper.getMainLooper());
    }

    @Override  // androidx.fragment.app.h
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(m.a);
        this.I = (ProgressBar)this.findViewById(l.a);
        if(this.a1() != null) {
            this.a1().s(true);
        }
        try {
            String s = I0.a.V(this).B1;
            if(s != null && !s.isEmpty()) {
                this.w1(new URL(s));
                return;
            }
            this.r1("Error retrieving tag list", null);
            return;
        }
        catch(Exception exception0) {
        }
        this.r1("Error retrieving tag list", exception0);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(menuItem0.getItemId() == 0x102002C) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private void r1(String s, Exception exception0) {
        if(exception0 != null) {
            Log.e("co.median.android.plugins.oneSignal.SubscriptionsActivity", exception0.getMessage(), exception0);
        }
        n n0 = () -> {
            Toast.makeText(this, s, 1).show();
            this.finish();
        };
        this.H.post(n0);
    }

    // 检测为 Lambda 实现
    private void s1(String s) [...]

    // 检测为 Lambda 实现
    private void t1(co.median.android.plugins.oneSignal.a a0) [...]

    // 检测为 Lambda 实现
    private void u1(co.median.android.plugins.oneSignal.a a0, JSONObject jSONObject0) [...]

    // 检测为 Lambda 实现
    private void v1(URL uRL0) [...]

    private void w1(URL uRL0) {
        o o0 = () -> {
            try {
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection0.setRequestMethod("GET");
                httpURLConnection0.setInstanceFollowRedirects(true);
                httpURLConnection0.connect();
                int v = httpURLConnection0.getResponseCode();
                if(httpURLConnection0.getResponseCode() == 200) {
                    ByteArrayOutputStream byteArrayOutputStream0 = httpURLConnection0.getContentLength() <= 0 ? new ByteArrayOutputStream() : new ByteArrayOutputStream(httpURLConnection0.getContentLength());
                    BufferedInputStream bufferedInputStream0 = new BufferedInputStream(httpURLConnection0.getInputStream());
                    k.b(bufferedInputStream0, byteArrayOutputStream0);
                    bufferedInputStream0.close();
                    byteArrayOutputStream0.close();
                    co.median.android.plugins.oneSignal.a a0 = co.median.android.plugins.oneSignal.a.a(byteArrayOutputStream0.toString());
                    if(a0 == null) {
                        this.r1("Error parsing JSON", new Exception("Error parsing JSON from " + uRL0));
                        return;
                    }
                    I1.G0((JSONObject jSONObject0) -> {
                        if(jSONObject0 != null) {
                            for(Object object0: a0.a) {
                                for(Object object1: ((b)object0).b) {
                                    co.median.android.plugins.oneSignal.a.a a$a0 = (co.median.android.plugins.oneSignal.a.a)object1;
                                    if(a$a0.a != null && jSONObject0.has(a$a0.a)) {
                                        a$a0.c = true;
                                    }
                                }
                            }
                        }
                        q q0 = () -> {
                            this.I.setVisibility(8);
                            a subscriptionsActivity$a0 = new a();
                            subscriptionsActivity$a0.E(a0);
                            this.P0().p().n(l.b, subscriptionsActivity$a0).g();
                        };
                        this.H.post(q0);
                    });
                    return;
                }
                if(v != 301 && v != 302 && v != 303 && v != 307) {
                    this.r1("Error retrieving tag list, responseCode: " + v, new Exception("Got status " + httpURLConnection0.getResponseCode() + " when downloading " + uRL0));
                    return;
                }
                String s = httpURLConnection0.getHeaderField("Location");
                try {
                    new URL(s);
                }
                catch(MalformedURLException unused_ex) {
                    s = new URL(new URL(uRL0.toString()), s).toString();
                }
                this.w1(new URL(s));
                return;
            }
            catch(Exception exception0) {
            }
            this.r1("Error retrieving tag list", exception0);
        };
        this.G.execute(o0);
    }
}

