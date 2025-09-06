package androidx.preference;

import C.z;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.res.k;
import androidx.core.view.Y;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference implements Comparable {
    public static class BaseSavedState extends AbsSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public BaseSavedState a(Parcel parcel0) {
                return new BaseSavedState(parcel0);
            }

            public BaseSavedState[] b(int v) {
                return new BaseSavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;

        static {
            BaseSavedState.CREATOR = new a();
        }

        public BaseSavedState(Parcel parcel0) {
            super(parcel0);
        }

        public BaseSavedState(Parcelable parcelable0) {
            super(parcelable0);
        }
    }

    class androidx.preference.Preference.a implements View.OnClickListener {
        final Preference f;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            Preference.this.f0(view0);
        }
    }

    interface b {
        void a(Preference arg1);

        void b(Preference arg1);
    }

    public interface c {
        boolean a(Preference arg1, Object arg2);
    }

    public interface d {
        boolean a(Preference arg1);
    }

    static class e implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
        private final Preference f;

        e(Preference preference0) {
            this.f = preference0;
        }

        @Override  // android.view.View$OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
            CharSequence charSequence0 = this.f.D();
            if(this.f.I() && !TextUtils.isEmpty(charSequence0)) {
                contextMenu0.setHeaderTitle(charSequence0);
                contextMenu0.add(0, 0, 0, q.a).setOnMenuItemClickListener(this);
            }
        }

        @Override  // android.view.MenuItem$OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem0) {
            ClipboardManager clipboardManager0 = (ClipboardManager)this.f.m().getSystemService("clipboard");
            CharSequence charSequence0 = this.f.D();
            clipboardManager0.setPrimaryClip(ClipData.newPlainText("Preference", charSequence0));
            String s = this.f.m().getString(q.d, new Object[]{charSequence0});
            Toast.makeText(this.f.m(), s, 0).show();
            return true;
        }
    }

    public interface f {
        CharSequence a(Preference arg1);
    }

    private Object A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private b N;
    private List O;
    private PreferenceGroup P;
    private boolean Q;
    private boolean R;
    private e S;
    private f T;
    private final View.OnClickListener U;
    private final Context f;
    private j g;
    private long h;
    private boolean i;
    private c j;
    private d k;
    private int l;
    private int m;
    private CharSequence n;
    private CharSequence o;
    private int p;
    private Drawable q;
    private String r;
    private Intent s;
    private String t;
    private Bundle u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String z;

    public Preference(Context context0) {
        this(context0, null);
    }

    public Preference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.h, 0x101008E));
    }

    public Preference(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public Preference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this.l = 0x7FFFFFFF;
        this.m = 0;
        this.v = true;
        this.w = true;
        this.y = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = true;
        this.H = true;
        this.K = true;
        this.L = p.b;
        this.U = (View view0) -> Preference.this.e0();
        this.f = context0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, s.J, v, v1);
        this.p = k.n(typedArray0, s.h0, s.K, 0);
        this.r = k.o(typedArray0, s.k0, s.Q);
        this.n = k.p(typedArray0, s.s0, s.O);
        this.o = k.p(typedArray0, s.r0, s.R);
        this.l = k.d(typedArray0, s.m0, s.S, 0x7FFFFFFF);
        this.t = k.o(typedArray0, s.g0, s.X);
        this.L = k.n(typedArray0, s.l0, s.N, p.b);
        this.M = k.n(typedArray0, s.t0, s.T, 0);
        this.v = k.b(typedArray0, s.f0, s.M, true);
        this.w = k.b(typedArray0, s.o0, s.P, true);
        this.y = k.b(typedArray0, s.n0, s.L, true);
        this.z = k.o(typedArray0, s.d0, s.U);
        this.E = k.b(typedArray0, s.a0, s.a0, this.w);
        this.F = k.b(typedArray0, s.b0, s.b0, this.w);
        if(typedArray0.hasValue(s.c0)) {
            this.A = this.X(typedArray0, 18);
        }
        else if(typedArray0.hasValue(s.V)) {
            this.A = this.X(typedArray0, 11);
        }
        this.K = k.b(typedArray0, s.p0, s.W, true);
        boolean z = typedArray0.hasValue(s.q0);
        this.G = z;
        if(z) {
            this.H = k.b(typedArray0, 0x20, s.Y, true);
        }
        this.I = k.b(typedArray0, s.i0, s.Z, false);
        this.D = k.b(typedArray0, s.j0, s.j0, true);
        this.J = k.b(typedArray0, s.e0, s.e0, false);
        typedArray0.recycle();
    }

    public androidx.preference.f A() {
        return null;
    }

    public void A0(int v) {
        this.B0(this.f.getString(v));
    }

    public j B() {
        return this.g;
    }

    public void B0(CharSequence charSequence0) {
        if(!TextUtils.equals(charSequence0, this.n)) {
            this.n = charSequence0;
            this.N();
        }
    }

    public SharedPreferences C() {
        return this.g == null ? null : this.g.m();
    }

    public boolean C0() {
        return !this.J();
    }

    public CharSequence D() {
        return this.E() == null ? this.o : this.E().a(this);
    }

    // 去混淆评级： 低(20)
    protected boolean D0() {
        return this.g != null && this.K() && this.H();
    }

    public final f E() {
        return this.T;
    }

    private void E0(SharedPreferences.Editor sharedPreferences$Editor0) {
        if(this.g.s()) {
            sharedPreferences$Editor0.apply();
        }
    }

    public CharSequence F() {
        return this.n;
    }

    private void F0() {
        String s = this.z;
        if(s != null) {
            Preference preference0 = this.l(s);
            if(preference0 != null) {
                preference0.G0(this);
            }
        }
    }

    public final int G() {
        return this.M;
    }

    private void G0(Preference preference0) {
        List list0 = this.O;
        if(list0 != null) {
            list0.remove(preference0);
        }
    }

    public boolean H() {
        return !TextUtils.isEmpty(this.r);
    }

    public boolean I() {
        return this.J;
    }

    // 去混淆评级： 低(30)
    public boolean J() {
        return this.v && this.B && this.C;
    }

    public boolean K() {
        return this.y;
    }

    public boolean L() {
        return this.w;
    }

    public final boolean M() {
        return this.D;
    }

    protected void N() {
        b preference$b0 = this.N;
        if(preference$b0 != null) {
            preference$b0.b(this);
        }
    }

    public void O(boolean z) {
        List list0 = this.O;
        if(list0 == null) {
            return;
        }
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Preference)list0.get(v1)).V(this, z);
        }
    }

    protected void P() {
        b preference$b0 = this.N;
        if(preference$b0 != null) {
            preference$b0.a(this);
        }
    }

    public void Q() {
        this.k0();
    }

    protected void R(j j0) {
        this.g = j0;
        if(!this.i) {
            this.h = j0.g();
        }
        this.k();
    }

    protected void S(j j0, long v) {
        try {
            this.h = v;
            this.i = true;
            this.R(j0);
            this.i = false;
        }
        catch(Throwable throwable0) {
            this.i = false;
            throw throwable0;
        }
    }

    public void T(l l0) {
        Integer integer0;
        View view0 = l0.a;
        view0.setOnClickListener(this.U);
        view0.setId(this.m);
        TextView textView0 = (TextView)l0.M(0x1020010);
        int v = 8;
        if(textView0 == null) {
            integer0 = null;
        }
        else {
            CharSequence charSequence0 = this.D();
            if(TextUtils.isEmpty(charSequence0)) {
                textView0.setVisibility(8);
                integer0 = null;
            }
            else {
                textView0.setText(charSequence0);
                textView0.setVisibility(0);
                integer0 = textView0.getCurrentTextColor();
            }
        }
        TextView textView1 = (TextView)l0.M(0x1020016);
        if(textView1 != null) {
            CharSequence charSequence1 = this.F();
            if(TextUtils.isEmpty(charSequence1)) {
                textView1.setVisibility(8);
            }
            else {
                textView1.setText(charSequence1);
                textView1.setVisibility(0);
                if(this.G) {
                    textView1.setSingleLine(this.H);
                }
                if(!this.L() && this.J() && integer0 != null) {
                    textView1.setTextColor(((int)integer0));
                }
            }
        }
        ImageView imageView0 = (ImageView)l0.M(0x1020006);
        if(imageView0 != null) {
            int v1 = this.p;
            if(v1 != 0 || this.q != null) {
                if(this.q == null) {
                    this.q = f.a.b(this.f, v1);
                }
                Drawable drawable0 = this.q;
                if(drawable0 != null) {
                    imageView0.setImageDrawable(drawable0);
                }
            }
            if(this.q == null) {
                imageView0.setVisibility((this.I ? 4 : 8));
            }
            else {
                imageView0.setVisibility(0);
            }
        }
        View view1 = l0.M(o.a);
        if(view1 == null) {
            view1 = l0.M(0x102003E);
        }
        if(view1 != null) {
            if(this.q == null) {
                if(this.I) {
                    v = 4;
                }
                view1.setVisibility(v);
            }
            else {
                view1.setVisibility(0);
            }
        }
        if(this.K) {
            this.p0(view0, this.J());
        }
        else {
            this.p0(view0, true);
        }
        boolean z = this.L();
        view0.setFocusable(z);
        view0.setClickable(z);
        l0.Q(this.E);
        l0.R(this.F);
        boolean z1 = this.I();
        if(z1 && this.S == null) {
            this.S = new e(this);
        }
        view0.setOnCreateContextMenuListener((z1 ? this.S : null));
        view0.setLongClickable(z1);
        if(z1 && !z) {
            Y.s0(view0, null);
        }
    }

    protected void U() {
    }

    public void V(Preference preference0, boolean z) {
        if(this.B == z) {
            this.B = !z;
            this.O(this.C0());
            this.N();
        }
    }

    public void W() {
        this.F0();
        this.Q = true;
    }

    protected Object X(TypedArray typedArray0, int v) {
        return null;
    }

    public void Y(z z0) {
    }

    public void Z(Preference preference0, boolean z) {
        if(this.C == z) {
            this.C = !z;
            this.O(this.C0());
            this.N();
        }
    }

    protected void a0(Parcelable parcelable0) {
        this.R = true;
        if(parcelable0 != AbsSavedState.EMPTY_STATE && parcelable0 != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    void b(PreferenceGroup preferenceGroup0) {
        if(preferenceGroup0 != null && this.P != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.P = preferenceGroup0;
    }

    protected Parcelable b0() {
        this.R = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void c0(Object object0) {
    }

    @Override
    public int compareTo(Object object0) {
        return this.h(((Preference)object0));
    }

    protected void d0(boolean z, Object object0) {
        this.c0(object0);
    }

    public void e0() {
        if(this.J() && this.L()) {
            this.U();
            if(this.k != null && this.k.a(this)) {
                return;
            }
            j j0 = this.B();
            if(j0 != null) {
                androidx.preference.j.c j$c0 = j0.i();
                if(j$c0 != null && j$c0.d(this)) {
                    return;
                }
            }
            if(this.s != null) {
                this.m().startActivity(this.s);
            }
        }
    }

    public boolean f(Object object0) {
        return this.j == null || this.j.a(this, object0);
    }

    // 检测为 Lambda 实现
    protected void f0(View view0) [...]

    final void g() {
        this.Q = false;
    }

    protected boolean g0(boolean z) {
        if(!this.D0()) {
            return false;
        }
        if(z == this.w(!z)) {
            return true;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.g.f();
        sharedPreferences$Editor0.putBoolean(this.r, z);
        this.E0(sharedPreferences$Editor0);
        return true;
    }

    public int h(Preference preference0) {
        int v = this.l;
        int v1 = preference0.l;
        if(v != v1) {
            return v - v1;
        }
        CharSequence charSequence0 = this.n;
        CharSequence charSequence1 = preference0.n;
        if(charSequence0 == charSequence1) {
            return 0;
        }
        if(charSequence0 == null) {
            return 1;
        }
        return charSequence1 == null ? -1 : charSequence0.toString().compareToIgnoreCase(preference0.n.toString());
    }

    protected boolean h0(int v) {
        if(!this.D0()) {
            return false;
        }
        if(v == this.x(~v)) {
            return true;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.g.f();
        sharedPreferences$Editor0.putInt(this.r, v);
        this.E0(sharedPreferences$Editor0);
        return true;
    }

    void i(Bundle bundle0) {
        if(this.H()) {
            Parcelable parcelable0 = bundle0.getParcelable(this.r);
            if(parcelable0 != null) {
                this.R = false;
                this.a0(parcelable0);
                if(!this.R) {
                    throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
                }
            }
        }
    }

    protected boolean i0(String s) {
        if(!this.D0()) {
            return false;
        }
        if(TextUtils.equals(s, this.y(null))) {
            return true;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.g.f();
        sharedPreferences$Editor0.putString(this.r, s);
        this.E0(sharedPreferences$Editor0);
        return true;
    }

    void j(Bundle bundle0) {
        if(this.H()) {
            this.R = false;
            Parcelable parcelable0 = this.b0();
            if(!this.R) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if(parcelable0 != null) {
                bundle0.putParcelable(this.r, parcelable0);
            }
        }
    }

    public boolean j0(Set set0) {
        if(!this.D0()) {
            return false;
        }
        if(set0.equals(this.z(null))) {
            return true;
        }
        SharedPreferences.Editor sharedPreferences$Editor0 = this.g.f();
        sharedPreferences$Editor0.putStringSet(this.r, set0);
        this.E0(sharedPreferences$Editor0);
        return true;
    }

    private void k() {
        if(this.D0() && this.C().contains(this.r)) {
            this.d0(true, null);
            return;
        }
        Object object0 = this.A;
        if(object0 != null) {
            this.d0(false, object0);
        }
    }

    private void k0() {
        if(TextUtils.isEmpty(this.z)) {
            return;
        }
        Preference preference0 = this.l(this.z);
        if(preference0 == null) {
            throw new IllegalStateException("Dependency \"" + this.z + "\" not found for preference \"" + this.r + "\" (title: \"" + this.n + "\"");
        }
        preference0.l0(this);
    }

    protected Preference l(String s) {
        return this.g == null ? null : this.g.b(s);
    }

    private void l0(Preference preference0) {
        if(this.O == null) {
            this.O = new ArrayList();
        }
        this.O.add(preference0);
        preference0.V(this, this.C0());
    }

    public Context m() {
        return this.f;
    }

    void m0() {
        if(TextUtils.isEmpty(this.r)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.x = true;
    }

    public Bundle n() {
        if(this.u == null) {
            this.u = new Bundle();
        }
        return this.u;
    }

    public void n0(Bundle bundle0) {
        this.i(bundle0);
    }

    StringBuilder o() {
        StringBuilder stringBuilder0 = new StringBuilder();
        CharSequence charSequence0 = this.F();
        if(!TextUtils.isEmpty(charSequence0)) {
            stringBuilder0.append(charSequence0);
            stringBuilder0.append(' ');
        }
        CharSequence charSequence1 = this.D();
        if(!TextUtils.isEmpty(charSequence1)) {
            stringBuilder0.append(charSequence1);
            stringBuilder0.append(' ');
        }
        if(stringBuilder0.length() > 0) {
            stringBuilder0.setLength(stringBuilder0.length() - 1);
        }
        return stringBuilder0;
    }

    public void o0(Bundle bundle0) {
        this.j(bundle0);
    }

    public String p() {
        return this.t;
    }

    private void p0(View view0, boolean z) {
        view0.setEnabled(z);
        if(view0 instanceof ViewGroup) {
            for(int v = ((ViewGroup)view0).getChildCount() - 1; v >= 0; --v) {
                this.p0(((ViewGroup)view0).getChildAt(v), z);
            }
        }
    }

    long q() {
        return this.h;
    }

    public void q0(int v) {
        this.r0(f.a.b(this.f, v));
        this.p = v;
    }

    public Intent r() {
        return this.s;
    }

    public void r0(Drawable drawable0) {
        if(this.q != drawable0) {
            this.q = drawable0;
            this.p = 0;
            this.N();
        }
    }

    public String s() {
        return this.r;
    }

    public void s0(String s) {
        this.r = s;
        if(this.x && !this.H()) {
            this.m0();
        }
    }

    public final int t() {
        return this.L;
    }

    public void t0(int v) {
        this.L = v;
    }

    @Override
    public String toString() {
        return this.o().toString();
    }

    public int u() {
        return this.l;
    }

    final void u0(b preference$b0) {
        this.N = preference$b0;
    }

    public PreferenceGroup v() {
        return this.P;
    }

    public void v0(c preference$c0) {
        this.j = preference$c0;
    }

    protected boolean w(boolean z) {
        return this.D0() ? this.g.m().getBoolean(this.r, z) : z;
    }

    public void w0(d preference$d0) {
        this.k = preference$d0;
    }

    protected int x(int v) {
        return this.D0() ? this.g.m().getInt(this.r, v) : v;
    }

    public void x0(int v) {
        if(v != this.l) {
            this.l = v;
            this.P();
        }
    }

    protected String y(String s) {
        return this.D0() ? this.g.m().getString(this.r, s) : s;
    }

    public void y0(CharSequence charSequence0) {
        if(this.E() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if(!TextUtils.equals(this.o, charSequence0)) {
            this.o = charSequence0;
            this.N();
        }
    }

    public Set z(Set set0) {
        return this.D0() ? this.g.m().getStringSet(this.r, set0) : set0;
    }

    public final void z0(f preference$f0) {
        this.T = preference$f0;
        this.N();
    }
}

