package g0;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k0.h.c;
import z3.k;

public class f {
    public final Context a;
    public final String b;
    public final c c;
    public final e d;
    public final List e;
    public final boolean f;
    public final d g;
    public final Executor h;
    public final Executor i;
    public final Intent j;
    public final boolean k;
    public final boolean l;
    private final Set m;
    public final String n;
    public final File o;
    public final Callable p;
    public final List q;
    public final List r;
    public final boolean s;

    public f(Context context0, String s, c h$c0, e u$e0, List list0, boolean z, d u$d0, Executor executor0, Executor executor1, Intent intent0, boolean z1, boolean z2, Set set0, String s1, File file0, Callable callable0, g0.u.f u$f0, List list1, List list2) {
        k.e(context0, "context");
        k.e(h$c0, "sqliteOpenHelperFactory");
        k.e(u$e0, "migrationContainer");
        k.e(u$d0, "journalMode");
        k.e(executor0, "queryExecutor");
        k.e(executor1, "transactionExecutor");
        k.e(list1, "typeConverters");
        k.e(list2, "autoMigrationSpecs");
        super();
        this.a = context0;
        this.b = s;
        this.c = h$c0;
        this.d = u$e0;
        this.e = list0;
        this.f = z;
        this.g = u$d0;
        this.h = executor0;
        this.i = executor1;
        this.j = intent0;
        this.k = z1;
        this.l = z2;
        this.m = set0;
        this.n = s1;
        this.o = file0;
        this.p = callable0;
        this.q = list1;
        this.r = list2;
        this.s = intent0 != null;
    }

    // 去混淆评级： 低(40)
    public boolean a(int v, int v1) {
        return v <= v1 || !this.l ? this.k && (this.m == null || !this.m.contains(v)) : false;
    }
}

