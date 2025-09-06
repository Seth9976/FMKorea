package q2;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j2.O;
import j2.t;
import j2.u;
import j2.v;
import j2.y;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class f implements i {
    private final Context a;
    private final j b;
    private final g c;
    private final t d;
    private final a e;
    private final k f;
    private final u g;
    private final AtomicReference h;
    private final AtomicReference i;

    f(Context context0, j j0, t t0, g g0, a a0, k k0, u u0) {
        AtomicReference atomicReference0 = new AtomicReference();
        this.h = atomicReference0;
        this.i = new AtomicReference(new TaskCompletionSource());
        this.a = context0;
        this.b = j0;
        this.d = t0;
        this.c = g0;
        this.e = a0;
        this.f = k0;
        this.g = u0;
        atomicReference0.set(b.b(t0));
    }

    @Override  // q2.i
    public Task a() {
        return ((TaskCompletionSource)this.i.get()).getTask();
    }

    @Override  // q2.i
    public d b() {
        return (d)this.h.get();
    }

    boolean k() {
        return !this.n().equals(this.b.f);
    }

    public static f l(Context context0, String s, y y0, n2.b b0, String s1, String s2, o2.f f0, u u0) {
        String s3 = y0.g();
        O o0 = new O();
        g g0 = new g(o0);
        a a0 = new a(f0);
        c c0 = new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", s), b0);
        return new f(context0, new j(s, y0.h(), y0.i(), y0.j(), y0, j2.i.h(new String[]{j2.i.o(context0), s, s2, s1}), s2, s1, v.b(s3).f()), o0, g0, a0, c0, u0);
    }

    private d m(e e0) {
        d d1;
        d d0 = null;
        try {
            if(!e.g.equals(e0)) {
                JSONObject jSONObject0 = this.e.b();
                if(jSONObject0 == null) {
                    g2.f.f().b("No cached settings data found.");
                    return null;
                }
                d1 = this.c.b(jSONObject0);
                if(d1 == null) {
                    g2.f.f().e("Failed to parse cached settings data.", null);
                    return null;
                }
                this.q(jSONObject0, "Loaded cached settings: ");
                long v = this.d.a();
                if(!e.h.equals(e0) && d1.a(v)) {
                    g2.f.f().i("Cached settings have expired.");
                    return null;
                }
                goto label_17;
            }
        }
        catch(Exception exception0) {
            g2.f.f().e("Failed to get cached settings", exception0);
        }
        return d0;
        try {
        label_17:
            g2.f.f().i("Returning cached settings.");
            return d1;
        }
        catch(Exception exception0) {
            d0 = d1;
        }
        g2.f.f().e("Failed to get cached settings", exception0);
        return d0;
    }

    private String n() {
        return j2.i.s(this.a).getString("existing_instance_identifier", "");
    }

    public Task o(Executor executor0) {
        return this.p(e.f, executor0);
    }

    public Task p(e e0, Executor executor0) {
        class q2.f.a implements SuccessContinuation {
            final f a;

            public Task a(Void void0) {
                JSONObject jSONObject0 = f.this.f.a(f.this.b, true);
                if(jSONObject0 != null) {
                    d d0 = f.this.c.b(jSONObject0);
                    f.this.e.c(d0.c, jSONObject0);
                    f.this.q(jSONObject0, "Loaded settings: ");
                    j j0 = f.this.b;
                    f.this.r(j0.f);
                    f.this.h.set(d0);
                    ((TaskCompletionSource)f.this.i.get()).trySetResult(d0);
                }
                return Tasks.forResult(null);
            }

            @Override  // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object object0) {
                return this.a(((Void)object0));
            }
        }

        if(!this.k()) {
            d d0 = this.m(e0);
            if(d0 != null) {
                this.h.set(d0);
                ((TaskCompletionSource)this.i.get()).trySetResult(d0);
                return Tasks.forResult(null);
            }
        }
        d d1 = this.m(e.h);
        if(d1 != null) {
            this.h.set(d1);
            ((TaskCompletionSource)this.i.get()).trySetResult(d1);
        }
        return this.g.j(executor0).onSuccessTask(executor0, new q2.f.a(this));
    }

    private void q(JSONObject jSONObject0, String s) {
        g2.f.f().b(s + jSONObject0.toString());
    }

    private boolean r(String s) {
        SharedPreferences.Editor sharedPreferences$Editor0 = j2.i.s(this.a).edit();
        sharedPreferences$Editor0.putString("existing_instance_identifier", s);
        sharedPreferences$Editor0.apply();
        return true;
    }
}

