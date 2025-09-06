package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class y {
    private final ArrayList a;
    private final HashMap b;
    private final HashMap c;
    private v d;

    y() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    void A(v v0) {
        this.d = v0;
    }

    FragmentState B(String s, FragmentState fragmentState0) {
        return fragmentState0 == null ? ((FragmentState)this.c.remove(s)) : ((FragmentState)this.c.put(s, fragmentState0));
    }

    void a(Fragment fragment0) {
        if(this.a.contains(fragment0)) {
            throw new IllegalStateException("Fragment already added: " + fragment0);
        }
        synchronized(this.a) {
            this.a.add(fragment0);
        }
        fragment0.mAdded = true;
    }

    void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String s) {
        return this.b.get(s) != null;
    }

    void d(int v) {
        for(Object object0: this.b.values()) {
            x x0 = (x)object0;
            if(x0 != null) {
                x0.t(v);
            }
        }
    }

    void e(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(!this.b.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Active Fragments:");
            for(Object object0: this.b.values()) {
                x x0 = (x)object0;
                printWriter0.print(s);
                if(x0 == null) {
                    printWriter0.println("null");
                }
                else {
                    Fragment fragment0 = x0.k();
                    printWriter0.println(fragment0);
                    fragment0.dump(s + "    ", fileDescriptor0, printWriter0, arr_s);
                }
            }
        }
        int v = this.a.size();
        if(v > 0) {
            printWriter0.print(s);
            printWriter0.println("Added Fragments:");
            for(int v1 = 0; v1 < v; ++v1) {
                Fragment fragment1 = (Fragment)this.a.get(v1);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.println("Fragment{1def25fd} (4beace8b-91c7-48f1-b717-1d7878036385)");
            }
        }
    }

    Fragment f(String s) {
        x x0 = (x)this.b.get(s);
        return x0 == null ? null : x0.k();
    }

    Fragment g(int v) {
        for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
            Fragment fragment0 = (Fragment)this.a.get(v1);
            if(fragment0 != null && fragment0.mFragmentId == v) {
                return fragment0;
            }
        }
        for(Object object0: this.b.values()) {
            x x0 = (x)object0;
            if(x0 != null) {
                Fragment fragment1 = x0.k();
                if(fragment1.mFragmentId == v) {
                    return fragment1;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    Fragment h(String s) {
        if(s != null) {
            for(int v = this.a.size() - 1; v >= 0; --v) {
                Fragment fragment0 = (Fragment)this.a.get(v);
                if(fragment0 != null && s.equals(fragment0.mTag)) {
                    return fragment0;
                }
            }
        }
        if(s != null) {
            for(Object object0: this.b.values()) {
                x x0 = (x)object0;
                if(x0 != null) {
                    Fragment fragment1 = x0.k();
                    if(s.equals(fragment1.mTag)) {
                        return fragment1;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    Fragment i(String s) {
        for(Object object0: this.b.values()) {
            x x0 = (x)object0;
            if(x0 != null) {
                Fragment fragment0 = x0.k().findFragmentByWho(s);
                if(fragment0 != null) {
                    return fragment0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    int j(Fragment fragment0) {
        View view1;
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 == null) {
            return -1;
        }
        int v = this.a.indexOf(fragment0);
        for(int v1 = v - 1; v1 >= 0; --v1) {
            Fragment fragment1 = (Fragment)this.a.get(v1);
            if(fragment1.mContainer == viewGroup0) {
                View view0 = fragment1.mView;
                if(view0 != null) {
                    return viewGroup0.indexOfChild(view0) + 1;
                }
            }
        }
    alab1:
        while(true) {
            do {
                ++v;
                if(v >= this.a.size()) {
                    break alab1;
                }
                Fragment fragment2 = (Fragment)this.a.get(v);
                if(fragment2.mContainer != viewGroup0) {
                    continue alab1;
                }
                view1 = fragment2.mView;
            }
            while(view1 == null);
            return viewGroup0.indexOfChild(view1);
        }
        return -1;
    }

    List k() {
        List list0 = new ArrayList();
        for(Object object0: this.b.values()) {
            x x0 = (x)object0;
            if(x0 != null) {
                ((ArrayList)list0).add(x0);
            }
        }
        return list0;
    }

    List l() {
        List list0 = new ArrayList();
        for(Object object0: this.b.values()) {
            x x0 = (x)object0;
            if(x0 == null) {
                ((ArrayList)list0).add(null);
            }
            else {
                ((ArrayList)list0).add(x0.k());
            }
        }
        return list0;
    }

    ArrayList m() {
        return new ArrayList(this.c.values());
    }

    x n(String s) {
        return (x)this.b.get(s);
    }

    List o() {
        if(this.a.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList0 = this.a;
        return new ArrayList(this.a);
    }

    v p() {
        return this.d;
    }

    FragmentState q(String s) {
        return (FragmentState)this.c.get(s);
    }

    void r(x x0) {
        Fragment fragment0 = x0.k();
        if(this.c(fragment0.mWho)) {
            return;
        }
        this.b.put(fragment0.mWho, x0);
        if(fragment0.mRetainInstanceChangedWhileDetached) {
            if(fragment0.mRetainInstance) {
                this.d.f(fragment0);
            }
            else {
                this.d.p(fragment0);
            }
            fragment0.mRetainInstanceChangedWhileDetached = false;
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment0);
        }
    }

    void s(x x0) {
        Fragment fragment0 = x0.k();
        if(fragment0.mRetainInstance) {
            this.d.p(fragment0);
        }
        if(((x)this.b.put(fragment0.mWho, null)) == null) {
            return;
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment0);
        }
    }

    void t() {
        for(Object object0: this.a) {
            x x0 = (x)this.b.get(((Fragment)object0).mWho);
            if(x0 != null) {
                x0.m();
            }
        }
        for(Object object1: this.b.values()) {
            x x1 = (x)object1;
            if(x1 != null) {
                x1.m();
                Fragment fragment0 = x1.k();
                if(fragment0.mRemoving && !fragment0.isInBackStack()) {
                    if(fragment0.mBeingSaved && !this.c.containsKey(fragment0.mWho)) {
                        x1.r();
                    }
                    this.s(x1);
                }
            }
        }
    }

    void u(Fragment fragment0) {
        synchronized(this.a) {
            this.a.remove(fragment0);
        }
        fragment0.mAdded = false;
    }

    void v() {
        this.b.clear();
    }

    void w(List list0) {
        this.a.clear();
        if(list0 != null) {
            for(Object object0: list0) {
                String s = (String)object0;
                Fragment fragment0 = this.f(s);
                if(fragment0 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + s + ")");
                }
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + s + "): " + fragment0);
                }
                this.a(fragment0);
            }
        }
    }

    void x(ArrayList arrayList0) {
        this.c.clear();
        for(Object object0: arrayList0) {
            this.c.put(((FragmentState)object0).g, ((FragmentState)object0));
        }
    }

    ArrayList y() {
        ArrayList arrayList0 = new ArrayList(this.b.size());
        for(Object object0: this.b.values()) {
            x x0 = (x)object0;
            if(x0 != null) {
                Fragment fragment0 = x0.k();
                x0.r();
                arrayList0.add(fragment0.mWho);
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment0 + ": " + fragment0.mSavedFragmentState);
                }
            }
        }
        return arrayList0;
    }

    ArrayList z() {
        synchronized(this.a) {
            if(this.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList1 = new ArrayList(this.a.size());
            for(Object object0: this.a) {
                Fragment fragment0 = (Fragment)object0;
                arrayList1.add(fragment0.mWho);
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment0.mWho + "): " + fragment0);
                }
            }
            return arrayList1;
        }
    }
}

