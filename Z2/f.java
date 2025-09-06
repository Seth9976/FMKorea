package z2;

import B2.b;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d2.F;
import d2.c;
import d2.e;
import d2.r;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import org.json.JSONArray;
import org.json.JSONObject;

public class f implements i, j {
    private final b a;
    private final Context b;
    private final b c;
    private final Set d;
    private final Executor e;

    f(b b0, Set set0, Executor executor0, b b1, Context context0) {
        this.a = b0;
        this.d = set0;
        this.e = executor0;
        this.c = b1;
        this.b = context0;
    }

    private f(Context context0, String s, Set set0, b b0, Executor executor0) {
        this(() -> f.j(context0, s), set0, executor0, b0, context0);
    }

    @Override  // z2.i
    public Task a() {
        if(!v.a(this.b)) {
            return Tasks.forResult("");
        }
        d d0 = () -> this.i();
        return Tasks.call(this.e, d0);
    }

    @Override  // z2.j
    public a b(String s) {
        synchronized(this) {
            q q0 = (q)this.a.get();
            if(q0.i(System.currentTimeMillis())) {
                q0.g();
                return a.i;
            }
            return a.g;
        }
    }

    // 检测为 Lambda 实现
    public static String c(f f0) [...]

    // 检测为 Lambda 实现
    public static q d(Context context0, String s) [...]

    // 检测为 Lambda 实现
    public static f e(F f0, e e0) [...]

    // 检测为 Lambda 实现
    public static Void f(f f0) [...]

    public static c g() {
        F f0 = F.a(c2.a.class, Executor.class);
        return c.f(f.class, new Class[]{i.class, j.class}).b(r.k(Context.class)).b(r.k(a2.e.class)).b(r.n(g.class)).b(r.m(J2.i.class)).b(r.j(f0)).f((e e0) -> f.h(f0, e0)).d();
    }

    private static f h(F f0, e e0) {
        return new f(((Context)e0.a(Context.class)), ((a2.e)e0.a(a2.e.class)).n(), e0.d(g.class), e0.c(J2.i.class), ((Executor)e0.g(f0)));
    }

    private String i() {
        synchronized(this) {
            q q0 = (q)this.a.get();
            List list0 = q0.c();
            q0.b();
            JSONArray jSONArray0 = new JSONArray();
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                z2.r r0 = (z2.r)list0.get(v1);
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("agent", r0.c());
                jSONObject0.put("dates", new JSONArray(r0.b()));
                jSONArray0.put(jSONObject0);
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("heartbeats", jSONArray0);
            jSONObject1.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream0 = new Base64OutputStream(byteArrayOutputStream0, 11);
            try(GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(base64OutputStream0)) {
                gZIPOutputStream0.write(jSONObject1.toString().getBytes("UTF-8"));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(base64OutputStream0, throwable0);
                throw throwable0;
            }
            base64OutputStream0.close();
            return byteArrayOutputStream0.toString("UTF-8");
        }
    }

    private static q j(Context context0, String s) {
        return new q(context0, s);
    }

    private Void k() {
        synchronized(this) {
            ((q)this.a.get()).k(System.currentTimeMillis(), ((J2.i)this.c.get()).a());
            return null;
        }
    }

    public Task l() {
        if(this.d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if(!v.a(this.b)) {
            return Tasks.forResult(null);
        }
        z2.e e0 = () -> this.k();
        return Tasks.call(this.e, e0);
    }
}

