package androidx.fragment.app;

import S.c;
import android.view.ViewGroup;
import androidx.lifecycle.h.b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class z {
    static final class a {
        int a;
        Fragment b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        b h;
        b i;

        a() {
        }

        a(int v, Fragment fragment0) {
            this.a = v;
            this.b = fragment0;
            this.c = false;
            this.h = b.j;
            this.i = b.j;
        }

        a(int v, Fragment fragment0, boolean z) {
            this.a = v;
            this.b = fragment0;
            this.c = z;
            this.h = b.j;
            this.i = b.j;
        }
    }

    private final l a;
    private final ClassLoader b;
    ArrayList c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList p;
    ArrayList q;
    boolean r;
    ArrayList s;

    z(l l0, ClassLoader classLoader0) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = l0;
        this.b = classLoader0;
    }

    public z b(int v, Fragment fragment0, String s) {
        this.l(v, fragment0, s, 1);
        return this;
    }

    z c(ViewGroup viewGroup0, Fragment fragment0, String s) {
        fragment0.mContainer = viewGroup0;
        return this.b(viewGroup0.getId(), fragment0, s);
    }

    public z d(Fragment fragment0, String s) {
        this.l(0, fragment0, s, 1);
        return this;
    }

    void e(a z$a0) {
        this.c.add(z$a0);
        z$a0.d = this.d;
        z$a0.e = this.e;
        z$a0.f = this.f;
        z$a0.g = this.g;
    }

    public z f(String s) {
        if(!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.k = s;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public z k() {
        if(this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    void l(int v, Fragment fragment0, String s, int v1) {
        String s1 = fragment0.mPreviousWho;
        if(s1 != null) {
            c.f(fragment0, s1);
        }
        Class class0 = fragment0.getClass();
        int v2 = class0.getModifiers();
        if(class0.isAnonymousClass() || !Modifier.isPublic(v2) || class0.isMemberClass() && !Modifier.isStatic(v2)) {
            throw new IllegalStateException("Fragment " + class0.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if(s != null) {
            if(fragment0.mTag != null && !s.equals(fragment0.mTag)) {
                throw new IllegalStateException("Can\'t change tag of fragment " + fragment0 + ": was " + fragment0.mTag + " now " + s);
            }
            fragment0.mTag = s;
        }
        switch(v) {
            case -1: {
                throw new IllegalArgumentException("Can\'t add fragment " + fragment0 + " with tag " + s + " to container view with no id");
            label_13:
                if(fragment0.mFragmentId != 0 && fragment0.mFragmentId != v) {
                    throw new IllegalStateException("Can\'t change container ID of fragment " + fragment0 + ": was " + fragment0.mFragmentId + " now " + v);
                }
                fragment0.mFragmentId = v;
                fragment0.mContainerId = v;
                break;
            }
            case 0: {
                break;
            }
            default: {
                goto label_13;
            }
        }
        this.e(new a(v1, fragment0));
    }

    public z m(Fragment fragment0) {
        this.e(new a(3, fragment0));
        return this;
    }

    public z n(int v, Fragment fragment0) {
        return this.o(v, fragment0, null);
    }

    public z o(int v, Fragment fragment0, String s) {
        if(v == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        this.l(v, fragment0, s, 2);
        return this;
    }

    public z p(boolean z) {
        this.r = z;
        return this;
    }
}

