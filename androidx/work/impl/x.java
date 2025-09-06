package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.k;
import androidx.work.n;
import androidx.work.s;
import androidx.work.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import y0.c;

public class x extends s {
    private final F a;
    private final String b;
    private final e c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private boolean h;
    private n i;
    private static final String j;

    static {
        x.j = "WM-WorkContinuationImpl";
    }

    public x(F f0, String s, e e0, List list0) {
        this(f0, s, e0, list0, null);
    }

    public x(F f0, String s, e e0, List list0, List list1) {
        this.a = f0;
        this.b = s;
        this.c = e0;
        this.d = list0;
        this.g = list1;
        this.e = new ArrayList(list0.size());
        this.f = new ArrayList();
        if(list1 != null) {
            for(Object object0: list1) {
                this.f.addAll(((x)object0).f);
            }
        }
        for(int v = 0; v < list0.size(); ++v) {
            String s1 = ((v)list0.get(v)).b();
            this.e.add(s1);
            this.f.add(s1);
        }
    }

    public x(F f0, List list0) {
        this(f0, null, e.g, list0, null);
    }

    public n a() {
        if(!this.h) {
            c c0 = new c(this);
            this.a.s().c(c0);
            this.i = c0.d();
            return this.i;
        }
        k.e().k("WM-WorkContinuationImpl", "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        return this.i;
    }

    public e b() {
        return this.c;
    }

    public List c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List e() {
        return this.g;
    }

    public List f() {
        return this.d;
    }

    public F g() {
        return this.a;
    }

    public boolean h() {
        return x.i(this, new HashSet());
    }

    private static boolean i(x x0, Set set0) {
        set0.addAll(x0.c());
        Set set1 = x.l(x0);
        for(Object object0: set0) {
            if(set1.contains(((String)object0))) {
                return true;
            }
            if(false) {
                break;
            }
        }
        List list0 = x0.e();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object1: list0) {
                if(x.i(((x)object1), set0)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        set0.removeAll(x0.c());
        return false;
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }

    public static Set l(x x0) {
        Set set0 = new HashSet();
        List list0 = x0.e();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                set0.addAll(((x)object0).c());
            }
        }
        return set0;
    }
}

