package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.k;
import java.util.ArrayList;
import java.util.List;
import u0.e;
import x0.m;
import x0.u;
import x0.x;

class c {
    private final Context a;
    private final int b;
    private final g c;
    private final e d;
    private static final String e;

    static {
        c.e = "WM-ConstraintsCmdHandle";
    }

    c(Context context0, int v, g g0) {
        this.a = context0;
        this.b = v;
        this.c = g0;
        this.d = new e(g0.g().q(), null);
    }

    void a() {
        List list0 = this.c.g().r().I().i();
        ConstraintProxy.a(this.a, list0);
        this.d.a(list0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        long v = System.currentTimeMillis();
        for(Object object0: list0) {
            u u0 = (u)object0;
            if(v >= u0.c() && (!u0.h() || this.d.e(u0.a))) {
                arrayList0.add(u0);
            }
        }
        for(Object object1: arrayList0) {
            m m0 = x.a(((u)object1));
            Intent intent0 = b.b(this.a, m0);
            k.e().a("WM-ConstraintsCmdHandle", "Creating a delay_met command for workSpec with id (" + ((u)object1).a + ")");
            this.c.e().a().execute(new androidx.work.impl.background.systemalarm.g.b(this.c, intent0, this.b));
        }
        this.d.d();
    }
}

