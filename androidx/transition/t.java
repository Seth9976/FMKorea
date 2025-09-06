package androidx.transition;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public abstract class t {
    static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
        k f;
        ViewGroup g;

        a(k k0, ViewGroup viewGroup0) {
            this.f = k0;
            this.g = viewGroup0;
        }

        private void a() {
            this.g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.g.removeOnAttachStateChangeListener(this);
        }

        @Override  // android.view.ViewTreeObserver$OnPreDrawListener
        public boolean onPreDraw() {
            class androidx.transition.t.a.a extends s {
                final androidx.collection.a a;
                final a b;

                androidx.transition.t.a.a(androidx.collection.a a0) {
                    this.a = a0;
                    super();
                }

                @Override  // androidx.transition.k$f
                public void d(k k0) {
                    ((ArrayList)this.a.get(a.this.g)).remove(k0);
                    k0.U(this);
                }
            }

            this.a();
            if(!t.c.remove(this.g)) {
                return true;
            }
            androidx.collection.a a0 = t.b();
            ArrayList arrayList0 = (ArrayList)a0.get(this.g);
            ArrayList arrayList1 = null;
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                a0.put(this.g, arrayList0);
            }
            else if(arrayList0.size() > 0) {
                arrayList1 = new ArrayList(arrayList0);
            }
            arrayList0.add(this.f);
            this.f.b(new androidx.transition.t.a.a(this, a0));
            this.f.m(this.g, false);
            if(arrayList1 != null) {
                for(Object object0: arrayList1) {
                    ((k)object0).W(this.g);
                }
            }
            this.f.T(this.g);
            return true;
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view0) {
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view0) {
            this.a();
            t.c.remove(this.g);
            ArrayList arrayList0 = (ArrayList)t.b().get(this.g);
            if(arrayList0 != null && arrayList0.size() > 0) {
                for(Object object0: arrayList0) {
                    ((k)object0).W(this.g);
                }
            }
            this.f.n(true);
        }
    }

    private static k a;
    private static ThreadLocal b;
    static ArrayList c;

    static {
        t.a = new androidx.transition.a();
        t.b = new ThreadLocal();
        t.c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup0, k k0) {
        if(!t.c.contains(viewGroup0) && viewGroup0.isLaidOut()) {
            t.c.add(viewGroup0);
            if(k0 == null) {
                k0 = t.a;
            }
            k k1 = k0.o();
            t.d(viewGroup0, k1);
            j.b(viewGroup0, null);
            t.c(viewGroup0, k1);
        }
    }

    static androidx.collection.a b() {
        WeakReference weakReference0 = (WeakReference)t.b.get();
        if(weakReference0 != null) {
            androidx.collection.a a0 = (androidx.collection.a)weakReference0.get();
            if(a0 != null) {
                return a0;
            }
        }
        androidx.collection.a a1 = new androidx.collection.a();
        WeakReference weakReference1 = new WeakReference(a1);
        t.b.set(weakReference1);
        return a1;
    }

    private static void c(ViewGroup viewGroup0, k k0) {
        if(k0 != null && viewGroup0 != null) {
            a t$a0 = new a(k0, viewGroup0);
            viewGroup0.addOnAttachStateChangeListener(t$a0);
            viewGroup0.getViewTreeObserver().addOnPreDrawListener(t$a0);
        }
    }

    private static void d(ViewGroup viewGroup0, k k0) {
        ArrayList arrayList0 = (ArrayList)t.b().get(viewGroup0);
        if(arrayList0 != null && arrayList0.size() > 0) {
            for(Object object0: arrayList0) {
                ((k)object0).S(viewGroup0);
            }
        }
        if(k0 != null) {
            k0.m(viewGroup0, true);
        }
        j.a(viewGroup0);
    }
}

