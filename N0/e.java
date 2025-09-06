package N0;

import O0.f;
import S0.b;
import android.app.Activity;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import b1.a;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.h;
import com.facebook.internal.F;
import com.facebook.internal.t;
import com.facebook.internal.v;
import com.facebook.n;
import com.facebook.q;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e {
    static class N0.e.e implements Callable {
        private WeakReference a;

        N0.e.e(View view0) {
            this.a = new WeakReference(view0);
        }

        public String a() {
            View view0 = (View)this.a.get();
            if(view0 != null && view0.getWidth() != 0 && view0.getHeight() != 0) {
                Bitmap bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.RGB_565);
                view0.draw(new Canvas(bitmap0));
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                bitmap0.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream0);
                return Base64.encodeToString(byteArrayOutputStream0.toByteArray(), 2);
            }
            return "";
        }

        @Override
        public Object call() {
            return this.a();
        }
    }

    private final Handler a;
    private WeakReference b;
    private Timer c;
    private String d;
    private static final String e = "N0.e";
    private static e f;

    static {
    }

    public e(Activity activity0) {
        this.b = new WeakReference(activity0);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
        e.f = this;
    }

    // 去混淆评级： 低(20)
    static WeakReference a(e e0) {
        return a.d(e.class) ? null : e0.b;
    }

    // 去混淆评级： 低(20)
    static Handler b(e e0) {
        return a.d(e.class) ? null : e0.a;
    }

    // 去混淆评级： 中等(60)
    static String c() [...] // 潜在的解密器

    static void d(e e0, String s) {
        Class class0 = e.class;
        if(a.d(class0)) {
            return;
        }
        try {
            e0.l(s);
        }
        catch(Throwable throwable0) {
            a.b(throwable0, class0);
        }
    }

    // 去混淆评级： 低(20)
    static Timer e(e e0) {
        return a.d(e.class) ? null : e0.c;
    }

    static Timer f(e e0, Timer timer0) {
        if(a.d(e.class)) {
            return null;
        }
        e0.c = timer0;
        return timer0;
    }

    // 去混淆评级： 低(20)
    static String g(e e0) {
        return a.d(e.class) ? null : e0.d;
    }

    static String h(e e0, String s) {
        if(a.d(e.class)) {
            return null;
        }
        e0.d = s;
        return s;
    }

    public static GraphRequest i(String s, AccessToken accessToken0, String s1, String s2) {
        static final class d implements com.facebook.GraphRequest.e {
            // 去混淆评级： 低(20)
            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                v.h(q.j, "N0.e", "App index sent to FB!");
            }
        }

        Class class0 = e.class;
        if(a.d(class0)) {
            return null;
        }
        if(s == null) {
            return null;
        }
        try {
            GraphRequest graphRequest0 = GraphRequest.K(accessToken0, String.format(Locale.US, "%s/app_indexing", s1), null, null);
            Bundle bundle0 = graphRequest0.y();
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putString("tree", s);
            bundle0.putString("app_version", b.d());
            bundle0.putString("platform", "android");
            bundle0.putString("request_type", s2);
            if(s2.equals("app_indexing")) {
                bundle0.putString("device_session_id", "927bd7c8-7d1c-450a-a99b-efd8bfdb8bdf");
            }
            graphRequest0.Z(bundle0);
            graphRequest0.V(new d());
            return graphRequest0;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, class0);
        return null;
    }

    void j(GraphRequest graphRequest0, String s) {
        if(a.d(this)) {
            return;
        }
        if(graphRequest0 == null) {
            return;
        }
        try {
            n n0 = graphRequest0.g();
            try {
                JSONObject jSONObject0 = n0.h();
                if(jSONObject0 == null) {
                    Log.e("N0.e", "Error sending UI component tree to Facebook: " + n0.g());
                    return;
                }
                if("true".equals(jSONObject0.optString("success"))) {
                    v.h(q.j, "N0.e", "Successfully send UI component tree to server");
                    this.d = s;
                }
                if(jSONObject0.has("is_app_indexing_enabled")) {
                    N0.b.o(Boolean.valueOf(jSONObject0.getBoolean("is_app_indexing_enabled")));
                    return;
                }
                return;
            }
            catch(JSONException jSONException0) {
            }
            Log.e("N0.e", "Error decoding server response.", jSONException0);
            return;
        }
        catch(Throwable throwable0) {
        }
        a.b(throwable0, this);
    }

    public void k() {
        class N0.e.a extends TimerTask {
            final e f;

            @Override
            public void run() {
                String s1;
                FutureTask futureTask0;
                String s;
                View view0;
                try {
                    Activity activity0 = (Activity)e.a(e.this).get();
                    view0 = b.e(activity0);
                    if(activity0 == null || view0 == null) {
                        return;
                    }
                    s = activity0.getClass().getSimpleName();
                    if(!N0.b.j()) {
                        return;
                    }
                    if(t.b()) {
                        O0.e.a();
                        return;
                    }
                    futureTask0 = new FutureTask(new N0.e.e(view0));
                    e.b(e.this).post(futureTask0);
                    s1 = "";
                }
                catch(Exception exception0) {
                    Log.e("N0.e", "UI Component tree indexing failure!", exception0);
                    return;
                }
                try {
                    s1 = (String)futureTask0.get(1L, TimeUnit.SECONDS);
                    goto label_17;
                }
                catch(Exception exception1) {
                    try {
                        Log.e("N0.e", "Failed to take screenshot.", exception1);
                    label_17:
                        JSONObject jSONObject0 = new JSONObject();
                        try {
                            jSONObject0.put("screenname", s);
                            jSONObject0.put("screenshot", s1);
                            JSONArray jSONArray0 = new JSONArray();
                            jSONArray0.put(f.d(view0));
                            jSONObject0.put("view", jSONArray0);
                        }
                        catch(JSONException unused_ex) {
                            Log.e("N0.e", "Failed to create JSONObject");
                        }
                        e.d(e.this, jSONObject0.toString());
                        return;
                    }
                    catch(Exception exception0) {
                    }
                }
                Log.e("N0.e", "UI Component tree indexing failure!", exception0);
            }
        }


        class N0.e.b implements Runnable {
            final TimerTask f;
            final e g;

            N0.e.b(TimerTask timerTask0) {
                this.f = timerTask0;
                super();
            }

            @Override
            public void run() {
                if(a.d(this)) {
                    return;
                }
                try {
                    try {
                        if(e.e(e.this) != null) {
                            e.e(e.this).cancel();
                        }
                        e.h(e.this, null);
                        Timer timer0 = new Timer();
                        e.f(e.this, timer0);
                        e.e(e.this).scheduleAtFixedRate(this.f, 0L, 1000L);
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    Log.e("N0.e", "Error scheduling indexing job", exception0);
                    return;
                }
                catch(Throwable throwable0) {
                }
                a.b(throwable0, this);
            }
        }

        if(a.d(this)) {
            return;
        }
        try {
            N0.e.a e$a0 = new N0.e.a(this);
            try {
                h.m().execute(new N0.e.b(this, e$a0));
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                Log.e("N0.e", "Error scheduling indexing job", rejectedExecutionException0);
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    private void l(String s) {
        class c implements Runnable {
            final String f;
            final e g;

            c(String s) {
                this.f = s;
                super();
            }

            @Override
            public void run() {
                if(a.d(this)) {
                    return;
                }
                try {
                    String s = F.Y(this.f);
                    AccessToken accessToken0 = AccessToken.g();
                    if(s != null && s.equals(e.g(e.this))) {
                        return;
                    }
                    String s1 = h.f();
                    GraphRequest graphRequest0 = e.i(this.f, accessToken0, s1, "app_indexing");
                    e.this.j(graphRequest0, s);
                    return;
                }
                catch(Throwable throwable0) {
                }
                a.b(throwable0, this);
            }
        }

        if(a.d(this)) {
            return;
        }
        try {
            h.m().execute(new c(this, s));
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }

    public void m() {
        if(a.d(this)) {
            return;
        }
        try {
            if(((Activity)this.b.get()) == null) {
                return;
            }
            Timer timer0 = this.c;
            if(timer0 != null) {
                try {
                    timer0.cancel();
                    this.c = null;
                }
                catch(Exception exception0) {
                    Log.e("N0.e", "Error unscheduling indexing job", exception0);
                }
            }
        }
        catch(Throwable throwable0) {
            a.b(throwable0, this);
        }
    }
}

