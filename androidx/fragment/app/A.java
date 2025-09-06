package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends z implements l {
    final FragmentManager t;
    boolean u;
    int v;
    boolean w;

    a(FragmentManager fragmentManager0) {
        super(fragmentManager0.s0(), (fragmentManager0.u0() == null ? null : fragmentManager0.u0().g().getClassLoader()));
        this.v = -1;
        this.w = false;
        this.t = fragmentManager0;
    }

    @Override  // androidx.fragment.app.FragmentManager$l
    public boolean a(ArrayList arrayList0, ArrayList arrayList1) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList0.add(this);
        arrayList1.add(Boolean.FALSE);
        if(this.i) {
            this.t.i(this);
        }
        return true;
    }

    @Override  // androidx.fragment.app.z
    public int g() {
        return this.r(false);
    }

    @Override  // androidx.fragment.app.z
    public int h() {
        return this.r(true);
    }

    @Override  // androidx.fragment.app.z
    public void i() {
        this.k();
        this.t.c0(this, false);
    }

    @Override  // androidx.fragment.app.z
    public void j() {
        this.k();
        this.t.c0(this, true);
    }

    @Override  // androidx.fragment.app.z
    void l(int v, Fragment fragment0, String s, int v1) {
        super.l(v, fragment0, s, v1);
        fragment0.mFragmentManager = this.t;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.z
    public z m(Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment Fragment{52384d12} (f3078c36-d7e6-443b-af1d-62133ad140a0) is already attached to a FragmentManager.");
        }
        return super.m(fragment0);
    }

    void q(int v) {
        if(!this.i) {
            return;
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + v);
        }
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)this.c.get(v2);
            Fragment fragment0 = z$a0.b;
            if(fragment0 != null) {
                fragment0.mBackStackNesting += v;
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + z$a0.b + " to " + z$a0.b.mBackStackNesting);
                }
            }
        }
    }

    int r(boolean z) {
        if(this.u) {
            throw new IllegalStateException("commit already called");
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter0 = new PrintWriter(new E("FragmentManager"));
            this.s("  ", printWriter0);
            printWriter0.close();
        }
        this.u = true;
        this.v = this.i ? this.t.m() : -1;
        this.t.Z(this, z);
        return this.v;
    }

    public void s(String s, PrintWriter printWriter0) {
        this.t(s, printWriter0, true);
    }

    public void t(String s, PrintWriter printWriter0, boolean z) {
        String s1;
        if(z) {
            printWriter0.print(s);
            printWriter0.print("mName=");
            printWriter0.print(this.k);
            printWriter0.print(" mIndex=");
            printWriter0.print(this.v);
            printWriter0.print(" mCommitted=");
            printWriter0.println(this.u);
            if(this.h != 0) {
                printWriter0.print(s);
                printWriter0.print("mTransition=#");
                printWriter0.print(Integer.toHexString(this.h));
            }
            if(this.d != 0 || this.e != 0) {
                printWriter0.print(s);
                printWriter0.print("mEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.d));
                printWriter0.print(" mExitAnim=#");
                printWriter0.println(Integer.toHexString(this.e));
            }
            if(this.f != 0 || this.g != 0) {
                printWriter0.print(s);
                printWriter0.print("mPopEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.f));
                printWriter0.print(" mPopExitAnim=#");
                printWriter0.println(Integer.toHexString(this.g));
            }
            if(this.l != 0 || this.m != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbTitleRes=#");
                printWriter0.print(Integer.toHexString(this.l));
                printWriter0.print(" mBreadCrumbTitleText=");
                printWriter0.println(this.m);
            }
            if(this.n != 0 || this.o != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbShortTitleRes=#");
                printWriter0.print(Integer.toHexString(this.n));
                printWriter0.print(" mBreadCrumbShortTitleText=");
                printWriter0.println(this.o);
            }
        }
        if(!this.c.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Operations:");
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)this.c.get(v1);
                switch(z$a0.a) {
                    case 0: {
                        s1 = "NULL";
                        break;
                    }
                    case 1: {
                        s1 = "ADD";
                        break;
                    }
                    case 2: {
                        s1 = "REPLACE";
                        break;
                    }
                    case 3: {
                        s1 = "REMOVE";
                        break;
                    }
                    case 4: {
                        s1 = "HIDE";
                        break;
                    }
                    case 5: {
                        s1 = "SHOW";
                        break;
                    }
                    case 6: {
                        s1 = "DETACH";
                        break;
                    }
                    case 7: {
                        s1 = "ATTACH";
                        break;
                    }
                    case 8: {
                        s1 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        s1 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 10: {
                        s1 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    default: {
                        s1 = "cmd=" + z$a0.a;
                    }
                }
                printWriter0.print(s);
                printWriter0.print("  Op #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.print(s1);
                printWriter0.print(" ");
                printWriter0.println(z$a0.b);
                if(z) {
                    if(z$a0.d != 0 || z$a0.e != 0) {
                        printWriter0.print(s);
                        printWriter0.print("enterAnim=#");
                        printWriter0.print(Integer.toHexString(z$a0.d));
                        printWriter0.print(" exitAnim=#");
                        printWriter0.println(Integer.toHexString(z$a0.e));
                    }
                    if(z$a0.f != 0 || z$a0.g != 0) {
                        printWriter0.print(s);
                        printWriter0.print("popEnterAnim=#");
                        printWriter0.print(Integer.toHexString(z$a0.f));
                        printWriter0.print(" popExitAnim=#");
                        printWriter0.println(Integer.toHexString(z$a0.g));
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.v >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.v);
        }
        if(this.k != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.k);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    void u() {
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)this.c.get(v1);
            Fragment fragment0 = z$a0.b;
            if(fragment0 != null) {
                fragment0.mBeingSaved = this.w;
                fragment0.setPopDirection(false);
                fragment0.setNextTransition(this.h);
                fragment0.setSharedElementNames(this.p, this.q);
            }
            switch(z$a0.a) {
                case 1: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.p1(fragment0, false);
                    this.t.j(fragment0);
                    break;
                }
                case 3: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.h1(fragment0);
                    break;
                }
                case 4: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.E0(fragment0);
                    break;
                }
                case 5: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.p1(fragment0, false);
                    this.t.t1(fragment0);
                    break;
                }
                case 6: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.x(fragment0);
                    break;
                }
                case 7: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.p1(fragment0, false);
                    this.t.o(fragment0);
                    break;
                }
                case 8: {
                    this.t.r1(fragment0);
                    break;
                }
                case 9: {
                    this.t.r1(null);
                    break;
                }
                case 10: {
                    this.t.q1(fragment0, z$a0.i);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + z$a0.a);
                }
            }
        }
    }

    void v() {
        for(int v = this.c.size() - 1; v >= 0; --v) {
            androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)this.c.get(v);
            Fragment fragment0 = z$a0.b;
            if(fragment0 != null) {
                fragment0.mBeingSaved = this.w;
                fragment0.setPopDirection(true);
                fragment0.setNextTransition(FragmentManager.m1(this.h));
                fragment0.setSharedElementNames(this.q, this.p);
            }
            switch(z$a0.a) {
                case 1: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.p1(fragment0, true);
                    this.t.h1(fragment0);
                    break;
                }
                case 3: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.j(fragment0);
                    break;
                }
                case 4: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.t1(fragment0);
                    break;
                }
                case 5: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.p1(fragment0, true);
                    this.t.E0(fragment0);
                    break;
                }
                case 6: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.o(fragment0);
                    break;
                }
                case 7: {
                    fragment0.setAnimations(z$a0.d, z$a0.e, z$a0.f, z$a0.g);
                    this.t.p1(fragment0, true);
                    this.t.x(fragment0);
                    break;
                }
                case 8: {
                    this.t.r1(null);
                    break;
                }
                case 9: {
                    this.t.r1(fragment0);
                    break;
                }
                case 10: {
                    this.t.q1(fragment0, z$a0.h);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + z$a0.a);
                }
            }
        }
    }

    Fragment w(ArrayList arrayList0, Fragment fragment0) {
        for(int v = 0; v < this.c.size(); ++v) {
            androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)this.c.get(v);
            int v1 = z$a0.a;
            if(v1 == 1) {
                arrayList0.add(z$a0.b);
            }
            else {
                switch(v1) {
                    case 2: {
                        Fragment fragment1 = z$a0.b;
                        int v2 = fragment1.mContainerId;
                        int v3 = arrayList0.size() - 1;
                        boolean z = false;
                        while(v3 >= 0) {
                            Fragment fragment2 = (Fragment)arrayList0.get(v3);
                            if(fragment2.mContainerId == v2) {
                                if(fragment2 == fragment1) {
                                    z = true;
                                }
                                else {
                                    if(fragment2 == fragment0) {
                                        this.c.add(v, new androidx.fragment.app.z.a(9, fragment2, true));
                                        ++v;
                                        fragment0 = null;
                                    }
                                    androidx.fragment.app.z.a z$a1 = new androidx.fragment.app.z.a(3, fragment2, true);
                                    z$a1.d = z$a0.d;
                                    z$a1.f = z$a0.f;
                                    z$a1.e = z$a0.e;
                                    z$a1.g = z$a0.g;
                                    this.c.add(v, z$a1);
                                    arrayList0.remove(fragment2);
                                    ++v;
                                }
                            }
                            --v3;
                        }
                        if(z) {
                            this.c.remove(v);
                            --v;
                        }
                        else {
                            z$a0.a = 1;
                            z$a0.c = true;
                            arrayList0.add(fragment1);
                        }
                        break;
                    }
                    case 3: 
                    case 6: {
                        arrayList0.remove(z$a0.b);
                        Fragment fragment3 = z$a0.b;
                        if(fragment3 == fragment0) {
                            this.c.add(v, new androidx.fragment.app.z.a(9, fragment3));
                            ++v;
                            fragment0 = null;
                        }
                        break;
                    }
                    case 7: {
                        arrayList0.add(z$a0.b);
                        break;
                    }
                    case 8: {
                        this.c.add(v, new androidx.fragment.app.z.a(9, fragment0, true));
                        z$a0.c = true;
                        ++v;
                        fragment0 = z$a0.b;
                    }
                }
            }
        }
        return fragment0;
    }

    public String x() {
        return this.k;
    }

    public void y() {
        if(this.s != null) {
            for(int v = 0; v < this.s.size(); ++v) {
                ((Runnable)this.s.get(v)).run();
            }
            this.s = null;
        }
    }

    Fragment z(ArrayList arrayList0, Fragment fragment0) {
        for(int v = this.c.size() - 1; v >= 0; --v) {
            androidx.fragment.app.z.a z$a0 = (androidx.fragment.app.z.a)this.c.get(v);
            switch(z$a0.a) {
                case 3: 
                case 6: {
                    arrayList0.add(z$a0.b);
                    break;
                }
                case 1: 
                case 7: {
                    arrayList0.remove(z$a0.b);
                    break;
                }
                case 8: {
                    fragment0 = null;
                    break;
                }
                case 9: {
                    fragment0 = z$a0.b;
                    break;
                }
                case 10: {
                    z$a0.i = z$a0.h;
                }
            }
        }
        return fragment0;
    }
}

