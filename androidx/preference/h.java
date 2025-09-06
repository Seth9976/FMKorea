package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.B;
import androidx.recyclerview.widget.RecyclerView.g;
import androidx.recyclerview.widget.RecyclerView.n;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.y;
import androidx.recyclerview.widget.RecyclerView;

public abstract class h extends Fragment implements a, androidx.preference.j.a, b, c {
    class androidx.preference.h.a extends Handler {
        final h a;

        androidx.preference.h.a(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            if(message0.what == 1) {
                h.this.m();
            }
        }
    }

    class androidx.preference.h.b implements Runnable {
        final h f;

        @Override
        public void run() {
            RecyclerView recyclerView0 = h.this.h;
            recyclerView0.focusableViewAvailable(recyclerView0);
        }
    }

    class androidx.preference.h.c extends n {
        private Drawable a;
        private int b;
        private boolean c;
        final h d;

        androidx.preference.h.c() {
            this.c = true;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$n
        public void e(Rect rect0, View view0, RecyclerView recyclerView0, y recyclerView$y0) {
            if(this.m(view0, recyclerView0)) {
                rect0.bottom = this.b;
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$n
        public void i(Canvas canvas0, RecyclerView recyclerView0, y recyclerView$y0) {
            if(this.a == null) {
                return;
            }
            int v = recyclerView0.getChildCount();
            int v1 = recyclerView0.getWidth();
            for(int v2 = 0; v2 < v; ++v2) {
                View view0 = recyclerView0.getChildAt(v2);
                if(this.m(view0, recyclerView0)) {
                    int v3 = (int)view0.getY();
                    int v4 = view0.getHeight();
                    this.a.setBounds(0, v3 + v4, v1, this.b + (v3 + v4));
                    this.a.draw(canvas0);
                }
            }
        }

        public void j(boolean z) {
            this.c = z;
        }

        public void k(Drawable drawable0) {
            this.b = drawable0 == null ? 0 : drawable0.getIntrinsicHeight();
            this.a = drawable0;
            h.this.h.t0();
        }

        public void l(int v) {
            this.b = v;
            h.this.h.t0();
        }

        private boolean m(View view0, RecyclerView recyclerView0) {
            B recyclerView$B0 = recyclerView0.f0(view0);
            if(recyclerView$B0 instanceof l && ((l)recyclerView$B0).O()) {
                boolean z = this.c;
                int v = recyclerView0.indexOfChild(view0);
                if(v < recyclerView0.getChildCount() - 1) {
                    B recyclerView$B1 = recyclerView0.f0(recyclerView0.getChildAt(v + 1));
                    return recyclerView$B1 instanceof l && ((l)recyclerView$B1).N();
                }
                return z;
            }
            return false;
        }
    }

    private final androidx.preference.h.c f;
    private j g;
    RecyclerView h;
    private boolean i;
    private boolean j;
    private int k;
    private Runnable l;
    private final Handler m;
    private final Runnable n;

    public h() {
        this.f = new androidx.preference.h.c(this);
        this.k = p.c;
        this.m = new androidx.preference.h.a(this, Looper.getMainLooper());
        this.n = new androidx.preference.h.b(this);
    }

    public void A(PreferenceScreen preferenceScreen0) {
        if(this.g.q(preferenceScreen0) && preferenceScreen0 != null) {
            this.i = true;
            if(this.j) {
                this.x();
            }
        }
    }

    private void B() {
        this.o().setAdapter(null);
        PreferenceScreen preferenceScreen0 = this.q();
        if(preferenceScreen0 != null) {
            preferenceScreen0.W();
        }
    }

    @Override  // androidx.preference.DialogPreference$a
    public Preference a(CharSequence charSequence0) {
        return this.g == null ? null : this.g.b(charSequence0);
    }

    @Override  // androidx.preference.j$a
    public void b(Preference preference0) {
        androidx.preference.a a0;
        for(Fragment fragment0 = this; fragment0 != null; fragment0 = fragment0.getParentFragment()) {
        }
        if(this.getParentFragmentManager().i0("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if(preference0 instanceof EditTextPreference) {
            a0 = androidx.preference.a.y(preference0.s());
        }
        else if(preference0 instanceof ListPreference) {
            a0 = androidx.preference.c.x(preference0.s());
        }
        else if(preference0 instanceof MultiSelectListPreference) {
            a0 = d.x(preference0.s());
        }
        else {
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference0.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        a0.setTargetFragment(this, 0);
        a0.show(this.getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    @Override  // androidx.preference.j$b
    public void c(PreferenceScreen preferenceScreen0) {
        for(Fragment fragment0 = this; fragment0 != null; fragment0 = fragment0.getParentFragment()) {
        }
    }

    @Override  // androidx.preference.j$c
    public boolean d(Preference preference0) {
        if(preference0.p() != null) {
            for(Fragment fragment0 = this; fragment0 != null; fragment0 = fragment0.getParentFragment()) {
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            FragmentManager fragmentManager0 = this.getParentFragmentManager();
            Bundle bundle0 = preference0.n();
            Fragment fragment1 = fragmentManager0.s0().a(this.requireActivity().getClassLoader(), preference0.p());
            fragment1.setArguments(bundle0);
            fragment1.setTargetFragment(this, 0);
            fragmentManager0.p().n(((View)this.requireView().getParent()).getId(), fragment1).f(null).g();
            return true;
        }
        return false;
    }

    void m() {
        PreferenceScreen preferenceScreen0 = this.q();
        if(preferenceScreen0 != null) {
            this.o().setAdapter(this.s(preferenceScreen0));
            preferenceScreen0.Q();
        }
    }

    public Fragment n() [...] // Inlined contents

    public final RecyclerView o() {
        return this.h;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        TypedValue typedValue0 = new TypedValue();
        this.requireContext().getTheme().resolveAttribute(m.i, typedValue0, true);
        int v = typedValue0.resourceId == 0 ? r.a : typedValue0.resourceId;
        this.requireContext().getTheme().applyStyle(v, false);
        j j0 = new j(this.requireContext());
        this.g = j0;
        j0.o(this);
        this.u(bundle0, (this.getArguments() == null ? null : this.getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT")));
    }

    @Override  // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        TypedArray typedArray0 = this.requireContext().obtainStyledAttributes(null, s.v0, m.f, 0);
        this.k = typedArray0.getResourceId(s.w0, this.k);
        Drawable drawable0 = typedArray0.getDrawable(s.x0);
        int v = typedArray0.getDimensionPixelSize(s.y0, -1);
        boolean z = typedArray0.getBoolean(s.z0, true);
        typedArray0.recycle();
        LayoutInflater layoutInflater1 = layoutInflater0.cloneInContext(this.requireContext());
        View view0 = layoutInflater1.inflate(this.k, viewGroup0, false);
        View view1 = view0.findViewById(0x102003F);
        if(!(view1 instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute \'android.R.id.list_container\' that is not a ViewGroup class");
        }
        RecyclerView recyclerView0 = this.v(layoutInflater1, ((ViewGroup)view1), bundle0);
        if(recyclerView0 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.h = recyclerView0;
        recyclerView0.h(this.f);
        this.y(drawable0);
        if(v != -1) {
            this.z(v);
        }
        this.f.j(z);
        if(this.h.getParent() == null) {
            ((ViewGroup)view1).addView(this.h);
        }
        this.m.post(this.n);
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.m.removeCallbacks(this.n);
        this.m.removeMessages(1);
        if(this.i) {
            this.B();
        }
        this.h = null;
        super.onDestroyView();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        PreferenceScreen preferenceScreen0 = this.q();
        if(preferenceScreen0 != null) {
            Bundle bundle1 = new Bundle();
            preferenceScreen0.o0(bundle1);
            bundle0.putBundle("android:preferences", bundle1);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.g.p(this);
        this.g.n(this);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.g.p(null);
        this.g.n(null);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(View view0, Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:preferences");
            if(bundle1 != null) {
                PreferenceScreen preferenceScreen0 = this.q();
                if(preferenceScreen0 != null) {
                    preferenceScreen0.n0(bundle1);
                }
            }
        }
        if(this.i) {
            this.m();
            Runnable runnable0 = this.l;
            if(runnable0 != null) {
                runnable0.run();
                this.l = null;
            }
        }
        this.j = true;
    }

    public j p() {
        return this.g;
    }

    public PreferenceScreen q() {
        return this.g.l();
    }

    protected void r() {
    }

    protected g s(PreferenceScreen preferenceScreen0) {
        return new i(preferenceScreen0);
    }

    public o t() {
        return new LinearLayoutManager(this.requireContext());
    }

    public abstract void u(Bundle arg1, String arg2);

    public RecyclerView v(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(this.requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            RecyclerView recyclerView0 = (RecyclerView)viewGroup0.findViewById(androidx.preference.o.b);
            if(recyclerView0 != null) {
                return recyclerView0;
            }
        }
        RecyclerView recyclerView1 = (RecyclerView)layoutInflater0.inflate(p.d, viewGroup0, false);
        recyclerView1.setLayoutManager(this.t());
        recyclerView1.setAccessibilityDelegateCompat(new k(recyclerView1));
        return recyclerView1;
    }

    protected void w() {
    }

    private void x() {
        if(this.m.hasMessages(1)) {
            return;
        }
        this.m.obtainMessage(1).sendToTarget();
    }

    public void y(Drawable drawable0) {
        this.f.k(drawable0);
    }

    public void z(int v) {
        this.f.l(v);
    }
}

