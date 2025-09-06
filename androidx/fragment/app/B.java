package androidx.fragment.app;

import B.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import androidx.core.os.d;
import androidx.core.view.J;
import androidx.core.view.Y;
import androidx.core.view.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

class b extends F {
    static abstract class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.i.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class k extends l {
        private boolean c;
        private boolean d;
        private androidx.fragment.app.i.a e;

        k(e f$e0, d d0, boolean z) {
            super(f$e0, d0);
            this.d = false;
            this.c = z;
        }

        androidx.fragment.app.i.a e(Context context0) {
            if(this.d) {
                return this.e;
            }
            androidx.fragment.app.i.a i$a0 = i.b(context0, this.b().f(), this.b().e() == c.g, this.c);
            this.e = i$a0;
            this.d = true;
            return i$a0;
        }
    }

    static abstract class l {
        private final e a;
        private final d b;

        l(e f$e0, d d0) {
            this.a = f$e0;
            this.b = d0;
        }

        void a() {
            this.a.d(this.b);
        }

        e b() {
            return this.a;
        }

        d c() {
            return this.b;
        }

        boolean d() {
            c f$e$c0 = c.g(this.a.f().mView);
            c f$e$c1 = this.a.e();
            return f$e$c0 == f$e$c1 || f$e$c0 != c.g && f$e$c1 != c.g;
        }
    }

    static class m extends l {
        private final Object c;
        private final boolean d;
        private final Object e;

        m(e f$e0, d d0, boolean z, boolean z1) {
            super(f$e0, d0);
            if(f$e0.e() == c.g) {
                this.c = z ? f$e0.f().getReenterTransition() : f$e0.f().getEnterTransition();
                this.d = z ? f$e0.f().getAllowReturnTransitionOverlap() : f$e0.f().getAllowEnterTransitionOverlap();
            }
            else {
                this.c = z ? f$e0.f().getReturnTransition() : f$e0.f().getExitTransition();
                this.d = true;
            }
            if(z1) {
                if(z) {
                    this.e = f$e0.f().getSharedElementReturnTransition();
                    return;
                }
                this.e = f$e0.f().getSharedElementEnterTransition();
                return;
            }
            this.e = null;
        }

        C e() {
            C c0 = this.f(this.c);
            C c1 = this.f(this.e);
            if(c0 != null && c1 != null && c0 != c1) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
            }
            return c0 == null ? c1 : c0;
        }

        private C f(Object object0) {
            if(object0 == null) {
                return null;
            }
            C c0 = A.a;
            if(c0 != null && c0.e(object0)) {
                return c0;
            }
            C c1 = A.b;
            if(c1 == null || !c1.e(object0)) {
                throw new IllegalArgumentException("Transition " + object0 + " for fragment " + this.b().f() + " is not a valid framework Transition or AndroidX Transition");
            }
            return c1;
        }

        public Object g() {
            return this.e;
        }

        Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        boolean j() {
            return this.d;
        }
    }

    b(ViewGroup viewGroup0) {
        super(viewGroup0);
    }

    @Override  // androidx.fragment.app.F
    void f(List list0, boolean z) {
        class androidx.fragment.app.b.b implements Runnable {
            final List f;
            final e g;
            final b h;

            androidx.fragment.app.b.b(List list0, e f$e0) {
                this.f = list0;
                this.g = f$e0;
                super();
            }

            @Override
            public void run() {
                if(this.f.contains(this.g)) {
                    this.f.remove(this.g);
                    b.this.s(this.g);
                }
            }
        }

        e f$e0 = null;
        e f$e1 = null;
        for(Object object0: list0) {
            e f$e2 = (e)object0;
            c f$e$c0 = c.g(f$e2.f().mView);
            int v = a.a[f$e2.e().ordinal()];
            if(v != 1 && v != 2 && v != 3) {
                if(v != 4 || f$e$c0 == c.g) {
                    continue;
                }
                f$e1 = f$e2;
            }
            else if(f$e$c0 == c.g && f$e0 == null) {
                f$e0 = f$e2;
            }
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Executing operations from " + f$e0 + " to " + f$e1);
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list0);
        this.y(list0);
        for(Object object1: list0) {
            e f$e3 = (e)object1;
            d d0 = new d();
            f$e3.j(d0);
            arrayList0.add(new k(f$e3, d0, z));
            d d1 = new d();
            f$e3.j(d1);
            boolean z1 = false;
            if(!z) {
                if(f$e3 == f$e1) {
                    z1 = true;
                }
            }
            else if(f$e3 == f$e0) {
                z1 = true;
            }
            arrayList1.add(new m(f$e3, d1, z, z1));
            f$e3.a(new androidx.fragment.app.b.b(this, arrayList2, f$e3));
        }
        Map map0 = this.x(arrayList1, arrayList2, z, f$e0, f$e1);
        this.w(arrayList0, arrayList2, map0.containsValue(Boolean.TRUE), map0);
        for(Object object2: arrayList2) {
            this.s(((e)object2));
        }
        arrayList2.clear();
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + f$e0 + " to " + f$e1);
        }
    }

    void s(e f$e0) {
        f$e0.e().b(f$e0.f().mView);
    }

    void t(ArrayList arrayList0, View view0) {
        if(view0 instanceof ViewGroup) {
            if(!d0.a(((ViewGroup)view0))) {
                int v = ((ViewGroup)view0).getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1.getVisibility() == 0) {
                        this.t(arrayList0, view1);
                    }
                }
            }
            else if(!arrayList0.contains(view0)) {
                arrayList0.add(((ViewGroup)view0));
            }
        }
        else if(!arrayList0.contains(view0)) {
            arrayList0.add(view0);
        }
    }

    void u(Map map0, View view0) {
        String s = Y.I(view0);
        if(s != null) {
            map0.put(s, view0);
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(view1.getVisibility() == 0) {
                    this.u(map0, view1);
                }
            }
        }
    }

    void v(androidx.collection.a a0, Collection collection0) {
        Iterator iterator0 = a0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(Y.I(((View)((Map.Entry)object0).getValue())))) {
                iterator0.remove();
            }
        }
    }

    private void w(List list0, List list1, boolean z, Map map0) {
        class androidx.fragment.app.b.c extends AnimatorListenerAdapter {
            final ViewGroup a;
            final View b;
            final boolean c;
            final e d;
            final k e;
            final b f;

            androidx.fragment.app.b.c(ViewGroup viewGroup0, View view0, boolean z, e f$e0, k b$k0) {
                this.a = viewGroup0;
                this.b = view0;
                this.c = z;
                this.d = f$e0;
                this.e = b$k0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.endViewTransition(this.b);
                if(this.c) {
                    this.d.e().b(this.b);
                }
                this.e.a();
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
                }
            }
        }


        class androidx.fragment.app.b.d implements androidx.core.os.d.a {
            final Animator a;
            final e b;
            final b c;

            androidx.fragment.app.b.d(Animator animator0, e f$e0) {
                this.a = animator0;
                this.b = f$e0;
                super();
            }

            @Override  // androidx.core.os.d$a
            public void a() {
                this.a.end();
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.b + " has been canceled.");
                }
            }
        }


        class androidx.fragment.app.b.e implements Animation.AnimationListener {
            final e a;
            final ViewGroup b;
            final View c;
            final k d;
            final b e;

            androidx.fragment.app.b.e(e f$e0, ViewGroup viewGroup0, View view0, k b$k0) {
                this.a = f$e0;
                this.b = viewGroup0;
                this.c = view0;
                this.d = b$k0;
                super();
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                class androidx.fragment.app.b.e.a implements Runnable {
                    final androidx.fragment.app.b.e f;

                    @Override
                    public void run() {
                        androidx.fragment.app.b.e.this.b.endViewTransition(androidx.fragment.app.b.e.this.c);
                        androidx.fragment.app.b.e.this.d.a();
                    }
                }

                androidx.fragment.app.b.e.a b$e$a0 = new androidx.fragment.app.b.e.a(this);
                this.b.post(b$e$a0);
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
                }
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation0) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation0) {
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
                }
            }
        }


        class f implements androidx.core.os.d.a {
            final View a;
            final ViewGroup b;
            final k c;
            final e d;
            final b e;

            f(View view0, ViewGroup viewGroup0, k b$k0, e f$e0) {
                this.a = view0;
                this.b = viewGroup0;
                this.c = b$k0;
                this.d = f$e0;
                super();
            }

            @Override  // androidx.core.os.d$a
            public void a() {
                this.a.clearAnimation();
                this.b.endViewTransition(this.a);
                this.c.a();
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.d + " has been cancelled.");
                }
            }
        }

        View view2;
        e f$e1;
        ViewGroup viewGroup0 = this.m();
        Context context0 = viewGroup0.getContext();
        ArrayList arrayList0 = new ArrayList();
        boolean z1 = false;
        for(Object object0: list0) {
            k b$k0 = (k)object0;
            if(b$k0.d()) {
                b$k0.a();
            }
            else {
                androidx.fragment.app.i.a i$a0 = b$k0.e(context0);
                if(i$a0 == null) {
                    b$k0.a();
                }
                else {
                    Animator animator0 = i$a0.b;
                    if(animator0 == null) {
                        arrayList0.add(b$k0);
                    }
                    else {
                        e f$e0 = b$k0.b();
                        Fragment fragment0 = f$e0.f();
                        Object object1 = map0.get(f$e0);
                        if(Boolean.TRUE.equals(object1)) {
                            if(FragmentManager.H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragment0 + " as this Fragment was involved in a Transition.");
                            }
                            b$k0.a();
                        }
                        else {
                            boolean z2 = f$e0.e() == c.h;
                            if(z2) {
                                list1.remove(f$e0);
                            }
                            View view0 = fragment0.mView;
                            viewGroup0.startViewTransition(view0);
                            animator0.addListener(new androidx.fragment.app.b.c(this, viewGroup0, view0, z2, f$e0, b$k0));
                            animator0.setTarget(view0);
                            animator0.start();
                            if(FragmentManager.H0(2)) {
                                f$e1 = f$e0;
                                Log.v("FragmentManager", "Animator from operation " + f$e1 + " has started.");
                            }
                            else {
                                f$e1 = f$e0;
                            }
                            b$k0.c().b(new androidx.fragment.app.b.d(this, animator0, f$e1));
                            z1 = true;
                        }
                    }
                }
            }
        }
        for(Object object2: arrayList0) {
            k b$k1 = (k)object2;
            e f$e2 = b$k1.b();
            Fragment fragment1 = f$e2.f();
            if(z) {
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment1 + " as Animations cannot run alongside Transitions.");
                }
                b$k1.a();
            }
            else if(z1) {
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment1 + " as Animations cannot run alongside Animators.");
                }
                b$k1.a();
            }
            else {
                View view1 = fragment1.mView;
                Animation animation0 = (Animation)h.g(((androidx.fragment.app.i.a)h.g(b$k1.e(context0))).a);
                if(f$e2.e() == c.f) {
                    viewGroup0.startViewTransition(view1);
                    androidx.fragment.app.i.b i$b0 = new androidx.fragment.app.i.b(animation0, viewGroup0, view1);
                    view2 = view1;
                    i$b0.setAnimationListener(new androidx.fragment.app.b.e(this, f$e2, viewGroup0, view1, b$k1));
                    view2.startAnimation(i$b0);
                    if(FragmentManager.H0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + f$e2 + " has started.");
                    }
                }
                else {
                    view1.startAnimation(animation0);
                    b$k1.a();
                    view2 = view1;
                }
                b$k1.c().b(new f(this, view2, viewGroup0, b$k1, f$e2));
                z1 = false;
            }
        }
    }

    private Map x(List list0, List list1, boolean z, e f$e0, e f$e1) {
        class g implements Runnable {
            final e f;
            final e g;
            final boolean h;
            final androidx.collection.a i;
            final b j;

            g(e f$e0, e f$e1, boolean z, androidx.collection.a a0) {
                this.f = f$e0;
                this.g = f$e1;
                this.h = z;
                this.i = a0;
                super();
            }

            @Override
            public void run() {
                A.a(this.f.f(), this.g.f(), this.h, this.i, false);
            }
        }


        class androidx.fragment.app.b.h implements Runnable {
            final C f;
            final View g;
            final Rect h;
            final b i;

            androidx.fragment.app.b.h(C c0, View view0, Rect rect0) {
                this.f = c0;
                this.g = view0;
                this.h = rect0;
                super();
            }

            @Override
            public void run() {
                this.f.h(this.g, this.h);
            }
        }


        class androidx.fragment.app.b.i implements Runnable {
            final ArrayList f;
            final b g;

            androidx.fragment.app.b.i(ArrayList arrayList0) {
                this.f = arrayList0;
                super();
            }

            @Override
            public void run() {
                A.d(this.f, 4);
            }
        }


        class j implements Runnable {
            final m f;
            final e g;
            final b h;

            j(m b$m0, e f$e0) {
                this.f = b$m0;
                this.g = f$e0;
                super();
            }

            @Override
            public void run() {
                this.f.a();
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Transition for operation " + this.g + "has completed");
                }
            }
        }

        Object object14;
        Object object13;
        View view8;
        Map map3;
        Object object12;
        View view7;
        ArrayList arrayList12;
        ArrayList arrayList11;
        View view4;
        Map map1;
        e f$e5;
        C c2;
        View view2;
        Rect rect1;
        ArrayList arrayList7;
        e f$e4;
        ArrayList arrayList6;
        androidx.collection.a a3;
        e f$e2 = f$e0;
        e f$e3 = f$e1;
        Map map0 = new HashMap();
        C c0 = null;
        for(Object object0: list0) {
            m b$m0 = (m)object0;
            if(!b$m0.d()) {
                C c1 = b$m0.e();
                if(c0 == null) {
                    c0 = c1;
                }
                else {
                    if(c1 != null && c0 != c1) {
                        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b$m0.b().f() + " returned Transition " + b$m0.h() + " which uses a different Transition  type than other Fragments.");
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        if(c0 == null) {
            for(Object object1: list0) {
                map0.put(((m)object1).b(), Boolean.FALSE);
                ((m)object1).a();
            }
            return map0;
        }
        View view0 = new View(this.m().getContext());
        Rect rect0 = new Rect();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        androidx.collection.a a0 = new androidx.collection.a();
        Object object2 = null;
        View view1 = null;
        boolean z1 = false;
        for(Object object3: list0) {
            m b$m1 = (m)object3;
            if(!b$m1.i() || f$e2 == null || f$e3 == null) {
                a3 = a0;
                arrayList6 = arrayList1;
                f$e4 = f$e2;
                arrayList7 = arrayList0;
                rect1 = rect0;
                c2 = c0;
                map1 = map0;
                f$e5 = f$e3;
                view2 = view0;
            }
            else {
                Object object4 = c0.u(c0.f(b$m1.g()));
                ArrayList arrayList2 = f$e1.f().getSharedElementSourceNames();
                ArrayList arrayList3 = f$e0.f().getSharedElementSourceNames();
                Object object5 = object4;
                ArrayList arrayList4 = f$e0.f().getSharedElementTargetNames();
                for(int v = 0; v < arrayList4.size(); ++v) {
                    int v1 = arrayList2.indexOf(arrayList4.get(v));
                    if(v1 != -1) {
                        arrayList2.set(v1, ((String)arrayList3.get(v)));
                    }
                }
                ArrayList arrayList5 = f$e1.f().getSharedElementTargetNames();
                if(z) {
                    f$e0.f().getEnterTransitionCallback();
                    f$e1.f().getExitTransitionCallback();
                }
                else {
                    f$e0.f().getExitTransitionCallback();
                    f$e1.f().getEnterTransitionCallback();
                }
                int v2 = arrayList2.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    a0.put(((String)arrayList2.get(v3)), ((String)arrayList5.get(v3)));
                }
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for(Object object6: arrayList5) {
                        Log.v("FragmentManager", "Name: " + ((String)object6));
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for(Object object7: arrayList2) {
                        Log.v("FragmentManager", "Name: " + ((String)object7));
                    }
                }
                androidx.collection.a a1 = new androidx.collection.a();
                this.u(a1, f$e0.f().mView);
                a1.p(arrayList2);
                a0.p(a1.keySet());
                androidx.collection.a a2 = new androidx.collection.a();
                this.u(a2, f$e1.f().mView);
                a2.p(arrayList5);
                a2.p(a0.values());
                A.c(a0, a2);
                this.v(a1, a0.keySet());
                this.v(a2, a0.values());
                if(a0.isEmpty()) {
                    arrayList0.clear();
                    arrayList1.clear();
                    a3 = a0;
                    arrayList6 = arrayList1;
                    f$e4 = f$e2;
                    arrayList7 = arrayList0;
                    rect1 = rect0;
                    view2 = view0;
                    c2 = c0;
                    object2 = null;
                    f$e5 = f$e1;
                    map1 = map0;
                }
                else {
                    A.a(f$e1.f(), f$e0.f(), z, a1, true);
                    a3 = a0;
                    J.a(this.m(), new g(this, f$e1, f$e0, z, a2));
                    arrayList0.addAll(a1.values());
                    if(!arrayList2.isEmpty()) {
                        view1 = (View)a1.get(((String)arrayList2.get(0)));
                        c0.p(object5, view1);
                    }
                    arrayList6 = arrayList1;
                    arrayList6.addAll(a2.values());
                    if(arrayList5.isEmpty()) {
                        view4 = view0;
                    }
                    else {
                        View view3 = (View)a2.get(((String)arrayList5.get(0)));
                        if(view3 != null) {
                            J.a(this.m(), new androidx.fragment.app.b.h(this, c0, view3, rect0));
                            view4 = view0;
                            z1 = true;
                        }
                    }
                    c0.s(object5, view4, arrayList0);
                    arrayList7 = arrayList0;
                    rect1 = rect0;
                    view2 = view4;
                    c2 = c0;
                    c0.n(object5, null, null, null, null, object5, arrayList6);
                    f$e4 = f$e0;
                    map1 = map0;
                    map1.put(f$e4, Boolean.TRUE);
                    f$e5 = f$e1;
                    map1.put(f$e5, Boolean.TRUE);
                    object2 = object5;
                }
            }
            f$e2 = f$e4;
            arrayList0 = arrayList7;
            rect0 = rect1;
            map0 = map1;
            a0 = a3;
            arrayList1 = arrayList6;
            c0 = c2;
            view0 = view2;
            f$e3 = f$e5;
        }
        View view5 = view1;
        ArrayList arrayList8 = arrayList1;
        ArrayList arrayList9 = arrayList0;
        Map map2 = map0;
        e f$e6 = f$e3;
        View view6 = view0;
        ArrayList arrayList10 = new ArrayList();
        Object object8 = null;
        Object object9 = null;
        for(Object object10: list0) {
            m b$m2 = (m)object10;
            if(b$m2.d()) {
                map2.put(b$m2.b(), Boolean.FALSE);
                b$m2.a();
            }
            else {
                Object object11 = c0.f(b$m2.h());
                e f$e7 = b$m2.b();
                boolean z2 = object2 != null && (f$e7 == f$e2 || f$e7 == f$e6);
                if(object11 == null) {
                    if(!z2) {
                        map2.put(f$e7, Boolean.FALSE);
                        b$m2.a();
                    }
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList9;
                    view7 = view6;
                    object12 = object8;
                    map3 = map2;
                    view8 = view5;
                }
                else {
                    ArrayList arrayList13 = new ArrayList();
                    this.t(arrayList13, f$e7.f().mView);
                    if(z2) {
                        if(f$e7 == f$e2) {
                            arrayList13.removeAll(arrayList9);
                        }
                        else {
                            arrayList13.removeAll(arrayList8);
                        }
                    }
                    if(arrayList13.isEmpty()) {
                        c0.a(object11, view6);
                        arrayList11 = arrayList8;
                        arrayList12 = arrayList9;
                        view7 = view6;
                        object13 = object9;
                        map3 = map2;
                        object14 = object8;
                    }
                    else {
                        c0.b(object11, arrayList13);
                        view7 = view6;
                        object14 = object8;
                        arrayList12 = arrayList9;
                        object13 = object9;
                        arrayList11 = arrayList8;
                        map3 = map2;
                        c0.n(object11, object11, arrayList13, null, null, null, null);
                        if(f$e7.e() == c.h) {
                            list1.remove(f$e7);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(f$e7.f().mView);
                            c0.m(object11, f$e7.f().mView, arrayList14);
                            J.a(this.m(), new androidx.fragment.app.b.i(this, arrayList13));
                        }
                    }
                    if(f$e7.e() == c.g) {
                        arrayList10.addAll(arrayList13);
                        if(z1) {
                            c0.o(object11, rect0);
                        }
                        view8 = view5;
                    }
                    else {
                        view8 = view5;
                        c0.p(object11, view8);
                    }
                    map3.put(f$e7, Boolean.TRUE);
                    if(b$m2.j()) {
                        object9 = c0.k(object13, object11, null);
                        object12 = object14;
                    }
                    else {
                        object12 = c0.k(object14, object11, null);
                        object9 = object13;
                    }
                }
                f$e6 = f$e1;
                map2 = map3;
                object8 = object12;
                view5 = view8;
                view6 = view7;
                arrayList9 = arrayList12;
                arrayList8 = arrayList11;
            }
        }
        Object object15 = c0.j(object9, object8, object2);
        if(object15 == null) {
            return map2;
        }
        for(Object object16: list0) {
            m b$m3 = (m)object16;
            if(!b$m3.d()) {
                e f$e8 = b$m3.b();
                if(b$m3.h() == null && (object2 == null || f$e8 != f$e2 && f$e8 != f$e1)) {
                }
                else if(Y.S(this.m())) {
                    c0.q(b$m3.b().f(), object15, b$m3.c(), new j(this, b$m3, f$e8));
                }
                else {
                    if(FragmentManager.H0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + this.m() + " has not been laid out. Completing operation " + f$e8);
                    }
                    b$m3.a();
                }
            }
        }
        if(!Y.S(this.m())) {
            return map2;
        }
        A.d(arrayList10, 4);
        ArrayList arrayList15 = c0.l(arrayList8);
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for(Object object17: arrayList9) {
                Log.v("FragmentManager", "View: " + ((View)object17) + " Name: " + Y.I(((View)object17)));
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for(Object object18: arrayList8) {
                Log.v("FragmentManager", "View: " + ((View)object18) + " Name: " + Y.I(((View)object18)));
            }
        }
        c0.c(this.m(), object15);
        c0.r(this.m(), arrayList9, arrayList8, arrayList15, a0);
        A.d(arrayList10, 0);
        c0.t(object2, arrayList9, arrayList8);
        return map2;
    }

    private void y(List list0) {
        Fragment fragment0 = ((e)list0.get(list0.size() - 1)).f();
        for(Object object0: list0) {
            ((e)object0).f().mAnimationInfo.c = fragment0.mAnimationInfo.c;
            ((e)object0).f().mAnimationInfo.d = fragment0.mAnimationInfo.d;
            ((e)object0).f().mAnimationInfo.e = fragment0.mAnimationInfo.e;
            ((e)object0).f().mAnimationInfo.f = fragment0.mAnimationInfo.f;
        }
    }
}

