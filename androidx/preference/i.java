package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.Y;
import androidx.recyclerview.widget.RecyclerView.B;
import androidx.recyclerview.widget.RecyclerView.g;
import java.util.ArrayList;
import java.util.List;

public class i extends g implements b {
    class a implements Runnable {
        final i f;

        @Override
        public void run() {
            i.this.E();
        }
    }

    static class c {
        int a;
        int b;
        String c;

        c(Preference preference0) {
            this.c = preference0.getClass().getName();
            this.a = preference0.t();
            this.b = preference0.G();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object object0) {
            return object0 instanceof c ? this.a == ((c)object0).a && this.b == ((c)object0).b && TextUtils.equals(this.c, ((c)object0).c) : false;
        }

        @Override
        public int hashCode() {
            return ((this.a + 0x20F) * 0x1F + this.b) * 0x1F + this.c.hashCode();
        }
    }

    private final PreferenceGroup c;
    private List d;
    private List e;
    private final List f;
    private final Handler g;
    private final Runnable h;

    public i(PreferenceGroup preferenceGroup0) {
        this.h = () -> {
            for(Object object0: i.this.d) {
                ((Preference)object0).u0(null);
            }
            ArrayList arrayList0 = new ArrayList(i.this.d.size());
            i.this.d = arrayList0;
            i.this.z(arrayList0, i.this.c);
            i.this.e = i.this.y(i.this.c);
            boolean z = i.this.c.B() == null;
            i.this.j();
            for(Object object1: i.this.d) {
                ((Preference)object1).g();
            }
        };
        this.c = preferenceGroup0;
        this.g = new Handler(Looper.getMainLooper());
        preferenceGroup0.u0(this);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        if(preferenceGroup0 instanceof PreferenceScreen) {
            this.v(((PreferenceScreen)preferenceGroup0).S0());
        }
        else {
            this.v(true);
        }
        this.E();
    }

    public Preference A(int v) {
        return v < 0 || v >= this.e() ? null : ((Preference)this.e.get(v));
    }

    private boolean B(PreferenceGroup preferenceGroup0) {
        return preferenceGroup0.J0() != 0x7FFFFFFF;
    }

    public void C(l l0, int v) {
        Preference preference0 = this.A(v);
        l0.P();
        preference0.T(l0);
    }

    public l D(ViewGroup viewGroup0, int v) {
        c i$c0 = (c)this.f.get(v);
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        TypedArray typedArray0 = viewGroup0.getContext().obtainStyledAttributes(null, s.a);
        Drawable drawable0 = typedArray0.getDrawable(s.b);
        if(drawable0 == null) {
            drawable0 = f.a.b(viewGroup0.getContext(), 0x1080062);
        }
        typedArray0.recycle();
        View view0 = layoutInflater0.inflate(i$c0.a, viewGroup0, false);
        if(view0.getBackground() == null) {
            Y.s0(view0, drawable0);
        }
        ViewGroup viewGroup1 = (ViewGroup)view0.findViewById(0x1020018);
        if(viewGroup1 != null) {
            int v1 = i$c0.b;
            if(v1 != 0) {
                layoutInflater0.inflate(v1, viewGroup1);
                return new l(view0);
            }
            viewGroup1.setVisibility(8);
        }
        return new l(view0);
    }

    // 检测为 Lambda 实现
    void E() [...]

    @Override  // androidx.preference.Preference$b
    public void a(Preference preference0) {
        this.g.removeCallbacks(this.h);
        this.g.post(this.h);
    }

    @Override  // androidx.preference.Preference$b
    public void b(Preference preference0) {
        int v = this.e.indexOf(preference0);
        if(v != -1) {
            this.k(v, preference0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public int e() {
        return this.e.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public long f(int v) {
        return this.i() ? this.A(v).q() : -1L;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public int g(int v) {
        c i$c0 = new c(this.A(v));
        int v1 = this.f.indexOf(i$c0);
        if(v1 != -1) {
            return v1;
        }
        this.f.add(i$c0);
        return this.f.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public void m(B recyclerView$B0, int v) {
        this.C(((l)recyclerView$B0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$g
    public B o(ViewGroup viewGroup0, int v) {
        return this.D(viewGroup0, v);
    }

    private androidx.preference.b x(PreferenceGroup preferenceGroup0, List list0) {
        class androidx.preference.i.b implements d {
            final PreferenceGroup a;
            final i b;

            androidx.preference.i.b(PreferenceGroup preferenceGroup0) {
                this.a = preferenceGroup0;
                super();
            }

            @Override  // androidx.preference.Preference$d
            public boolean a(Preference preference0) {
                this.a.P0(0x7FFFFFFF);
                i.this.a(preference0);
                return true;
            }
        }

        androidx.preference.b b0 = new androidx.preference.b(preferenceGroup0.m(), list0, preferenceGroup0.q());
        b0.w0(new androidx.preference.i.b(this, preferenceGroup0));
        return b0;
    }

    private List y(PreferenceGroup preferenceGroup0) {
        List list0 = new ArrayList();
        ArrayList arrayList0 = new ArrayList();
        int v = preferenceGroup0.M0();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Preference preference0 = preferenceGroup0.L0(v1);
            if(preference0.M()) {
                if(!this.B(preferenceGroup0) || v2 < preferenceGroup0.J0()) {
                    list0.add(preference0);
                }
                else {
                    arrayList0.add(preference0);
                }
                if(!(preference0 instanceof PreferenceGroup)) {
                    ++v2;
                }
                else if(((PreferenceGroup)preference0).N0()) {
                    if(this.B(preferenceGroup0) && this.B(((PreferenceGroup)preference0))) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                    for(Object object0: this.y(((PreferenceGroup)preference0))) {
                        Preference preference1 = (Preference)object0;
                        if(!this.B(preferenceGroup0) || v2 < preferenceGroup0.J0()) {
                            list0.add(preference1);
                        }
                        else {
                            arrayList0.add(preference1);
                        }
                        ++v2;
                    }
                }
            }
        }
        if(this.B(preferenceGroup0) && v2 > preferenceGroup0.J0()) {
            list0.add(this.x(preferenceGroup0, arrayList0));
        }
        return list0;
    }

    private void z(List list0, PreferenceGroup preferenceGroup0) {
        preferenceGroup0.R0();
        int v = preferenceGroup0.M0();
        for(int v1 = 0; v1 < v; ++v1) {
            Preference preference0 = preferenceGroup0.L0(v1);
            list0.add(preference0);
            c i$c0 = new c(preference0);
            if(!this.f.contains(i$c0)) {
                this.f.add(i$c0);
            }
            if(preference0 instanceof PreferenceGroup && ((PreferenceGroup)preference0).N0()) {
                this.z(list0, ((PreferenceGroup)preference0));
            }
            preference0.u0(this);
        }
    }
}

