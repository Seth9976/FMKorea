package y0;

import android.os.Build.VERSION;
import androidx.work.c;
import androidx.work.d.a;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import x0.u;
import z3.k;

public abstract class d {
    public static final u a(u u0) {
        k.e(u0, "workSpec");
        c c0 = u0.j;
        String s = u0.c;
        Class class0 = ConstraintTrackingWorker.class;
        if(!k.a(s, "androidx.work.impl.workers.ConstraintTrackingWorker") && (c0.f() || c0.i())) {
            androidx.work.d d0 = new a().c(u0.e).h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", s).a();
            k.d(d0, "Builder().putAll(workSpe…ame)\n            .build()");
            String s1 = class0.getName();
            k.d(s1, "name");
            return u.e(u0, null, null, s1, null, d0, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0xFFFEB, null);
        }
        return u0;
    }

    public static final u b(List list0, u u0) {
        k.e(list0, "schedulers");
        k.e(u0, "workSpec");
        return Build.VERSION.SDK_INT >= 26 ? u0 : d.a(u0);
    }
}

