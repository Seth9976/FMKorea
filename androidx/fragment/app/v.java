package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.H;
import androidx.lifecycle.I.b;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class v extends H {
    class a implements b {
        a() {
            super();
        }

        @Override  // androidx.lifecycle.I$b
        public H a(Class class0) {
            return new v(true);
        }

        @Override  // androidx.lifecycle.I$b
        public H b(Class class0, W.a a0) {
            return J.b(this, class0, a0);
        }
    }

    private final HashMap d;
    private final HashMap e;
    private final HashMap f;
    private final boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private static final b k;

    static {
        v.k = new a();
    }

    v(boolean z) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = false;
        this.i = false;
        this.j = false;
        this.g = z;
    }

    @Override  // androidx.lifecycle.H
    protected void d() {
        if(FragmentManager.H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return v.class == class0 && (this.d.equals(((v)object0).d) && this.e.equals(((v)object0).e) && this.f.equals(((v)object0).f));
        }
        return false;
    }

    void f(Fragment fragment0) {
        if(this.j) {
            if(FragmentManager.H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if(this.d.containsKey(fragment0.mWho)) {
            return;
        }
        this.d.put(fragment0.mWho, fragment0);
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment0);
        }
    }

    void g(Fragment fragment0) {
        if(FragmentManager.H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment0);
        }
        this.i(fragment0.mWho);
    }

    void h(String s) {
        if(FragmentManager.H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + s);
        }
        this.i(s);
    }

    @Override
    public int hashCode() {
        return (this.d.hashCode() * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    private void i(String s) {
        v v0 = (v)this.e.get(s);
        if(v0 != null) {
            v0.d();
            this.e.remove(s);
        }
        L l0 = (L)this.f.get(s);
        if(l0 != null) {
            l0.a();
            this.f.remove(s);
        }
    }

    Fragment j(String s) {
        return (Fragment)this.d.get(s);
    }

    v k(Fragment fragment0) {
        v v0 = (v)this.e.get(fragment0.mWho);
        if(v0 == null) {
            v0 = new v(this.g);
            this.e.put(fragment0.mWho, v0);
        }
        return v0;
    }

    static v l(L l0) {
        return (v)new I(l0, v.k).a(v.class);
    }

    Collection m() {
        return new ArrayList(this.d.values());
    }

    L n(Fragment fragment0) {
        L l0 = (L)this.f.get(fragment0.mWho);
        if(l0 == null) {
            l0 = new L();
            this.f.put(fragment0.mWho, l0);
        }
        return l0;
    }

    boolean o() {
        return this.h;
    }

    void p(Fragment fragment0) {
        if(this.j) {
            if(FragmentManager.H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if(this.d.remove(fragment0.mWho) != null && FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment0);
        }
    }

    void q(boolean z) {
        this.j = z;
    }

    boolean r(Fragment fragment0) {
        if(!this.d.containsKey(fragment0.mWho)) {
            return true;
        }
        return this.g ? this.h : !this.i;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} Fragments (");
        Iterator iterator0 = this.d.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") Child Non Config (");
        Iterator iterator1 = this.e.keySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            stringBuilder0.append(((String)object1));
            if(iterator1.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") ViewModelStores (");
        Iterator iterator2 = this.f.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            stringBuilder0.append(((String)object2));
            if(iterator2.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

