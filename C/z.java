package C;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.E;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class z {
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        final Object a;
        private final int b;
        private final Class c;
        protected final C d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityNodeInfo$AccessibilityAction0 = null;
            a.e = new a(1, null);
            a.f = new a(2, null);
            a.g = new a(4, null);
            a.h = new a(8, null);
            a.i = new a(16, null);
            a.j = new a(0x20, null);
            a.k = new a(0x40, null);
            a.l = new a(0x80, null);
            a.m = new a(0x100, null, b.class);
            a.n = new a(0x200, null, b.class);
            a.o = new a(0x400, null, c.class);
            a.p = new a(0x800, null, c.class);
            a.q = new a(0x1000, null);
            a.r = new a(0x2000, null);
            a.s = new a(0x4000, null);
            a.t = new a(0x8000, null);
            a.u = new a(0x10000, null);
            a.v = new a(0x20000, null, g.class);
            a.w = new a(0x40000, null);
            a.x = new a(0x80000, null);
            a.y = new a(0x100000, null);
            a.z = new a(0x200000, null, h.class);
            int v = Build.VERSION.SDK_INT;
            a.A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 0x1020036, null, null, null);
            a.B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 0x1020037, null, null, e.class);
            a.C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 0x1020038, null, null, null);
            a.D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 0x1020039, null, null, null);
            a.E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 0x102003A, null, null, null);
            a.F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 0x102003B, null, null, null);
            a.G = new a((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP), 0x1020046, null, null, null);
            a.H = new a((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN), 0x1020047, null, null, null);
            a.I = new a((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT), 0x1020048, null, null, null);
            a.J = new a((v < 29 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT), 0x1020049, null, null, null);
            a.K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 0x102003C, null, null, null);
            a.L = new a((v < 24 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS), 0x102003D, null, null, f.class);
            a.M = new a((v < 26 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW), 0x1020042, null, null, d.class);
            a.N = new a((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP), 0x1020044, null, null, null);
            a.O = new a((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP), 0x1020045, null, null, null);
            a.P = new a((v < 30 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD), 0x102004A, null, null, null);
            a.Q = new a((v < 30 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER), 0x1020054, null, null, null);
            a.R = new a((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START), 0x1020055, null, null, null);
            a.S = new a((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP), 0x1020056, null, null, null);
            a.T = new a((v < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL), 0x1020057, null, null, null);
            a.U = new a((v < 33 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS), 0x1020058, null, null, null);
            if(v >= 34) {
                accessibilityNodeInfo$AccessibilityAction0 = C.z.d.a();
            }
            a.V = new a(accessibilityNodeInfo$AccessibilityAction0, 0x102005E, null, null, null);
        }

        public a(int v, CharSequence charSequence0) {
            this(null, v, charSequence0, null, null);
        }

        public a(int v, CharSequence charSequence0, C c0) {
            this(null, v, charSequence0, c0, null);
        }

        private a(int v, CharSequence charSequence0, Class class0) {
            this(null, v, charSequence0, null, class0);
        }

        a(Object object0) {
            this(object0, 0, null, null, null);
        }

        a(Object object0, int v, CharSequence charSequence0, C c0, Class class0) {
            this.b = v;
            this.d = c0;
            this.a = object0 == null ? new AccessibilityNodeInfo.AccessibilityAction(v, charSequence0) : object0;
            this.c = class0;
        }

        public a a(CharSequence charSequence0, C c0) {
            return new a(null, this.b, charSequence0, c0, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getLabel();
        }

        public boolean d(View view0, Bundle bundle0) {
            if(this.d != null) {
                Class class0 = this.c;
                if(class0 != null) {
                    try {
                        E.a(class0.getDeclaredConstructor(null).newInstance(null));
                        throw null;
                    }
                    catch(Exception exception0) {
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (this.c == null ? "null" : this.c.getName()), exception0);
                    }
                }
                return this.d.a(view0, null);
            }
            return false;
        }

        @Override
        public boolean equals(Object object0) {
            if(!(object0 instanceof a)) {
                return false;
            }
            return this.a == null ? ((a)object0).a == null : this.a.equals(((a)object0).a);
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("AccessibilityActionCompat: ");
            String s = z.j(this.b);
            if(s.equals("ACTION_UNKNOWN") && this.c() != null) {
                s = this.c().toString();
            }
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
    }

    static abstract class C.z.b {
        public static Object a(int v, float f, float f1, float f2) {
            return new AccessibilityNodeInfo.RangeInfo(v, f, f1, f2);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo0, CharSequence charSequence0) {
            accessibilityNodeInfo0.setStateDescription(charSequence0);
        }
    }

    static abstract class C.z.c {
        public static C.z.f a(boolean z, int v, int v1, int v2, int v3, boolean z1, String s, String s1) {
            return new C.z.f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(v).setRowIndex(v1).setColumnSpan(v2).setRowSpan(v3).setSelected(z1).setRowTitle(s).setColumnTitle(s1).build());
        }

        public static z b(AccessibilityNodeInfo accessibilityNodeInfo0, int v, int v1) {
            return z.Q0(accessibilityNodeInfo0.getChild(v, v1));
        }

        public static String c(Object object0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo)object0).getColumnTitle();
        }

        public static String d(Object object0) {
            return ((AccessibilityNodeInfo.CollectionItemInfo)object0).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getExtraRenderingInfo();
        }

        public static z f(AccessibilityNodeInfo accessibilityNodeInfo0, int v) {
            return z.Q0(accessibilityNodeInfo0.getParent(v));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
            accessibilityNodeInfo0.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo0, String s) {
            accessibilityNodeInfo0.setUniqueId(s);
        }
    }

    static abstract class C.z.d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
            accessibilityNodeInfo0.getBoundsInWindow(rect0);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo0) {
            return accessibilityNodeInfo0.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
            accessibilityNodeInfo0.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo0, Rect rect0) {
            accessibilityNodeInfo0.setBoundsInWindow(rect0);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo0, CharSequence charSequence0) {
            accessibilityNodeInfo0.setContainerTitle(charSequence0);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo0, long v) {
            accessibilityNodeInfo0.setMinDurationBetweenContentChanges(Duration.ofMillis(v));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo0, View view0, boolean z) {
            accessibilityNodeInfo0.setQueryFromAppProcessEnabled(view0, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo0, boolean z) {
            accessibilityNodeInfo0.setRequestInitialAccessibilityFocus(z);
        }
    }

    public static class C.z.e {
        final Object a;

        C.z.e(Object object0) {
            this.a = object0;
        }

        public static C.z.e a(int v, int v1, boolean z) {
            return new C.z.e(AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, z));
        }

        public static C.z.e b(int v, int v1, boolean z, int v2) {
            return new C.z.e(AccessibilityNodeInfo.CollectionInfo.obtain(v, v1, z, v2));
        }
    }

    public static class C.z.f {
        final Object a;

        C.z.f(Object object0) {
            this.a = object0;
        }

        public static C.z.f a(int v, int v1, int v2, int v3, boolean z, boolean z1) {
            return new C.z.f(AccessibilityNodeInfo.CollectionItemInfo.obtain(v, v1, v2, v3, z, z1));
        }
    }

    private final AccessibilityNodeInfo a;
    public int b;
    private int c;
    private static int d;

    static {
    }

    private z(AccessibilityNodeInfo accessibilityNodeInfo0) {
        this.b = -1;
        this.c = -1;
        this.a = accessibilityNodeInfo0;
    }

    public z(Object object0) {
        this.b = -1;
        this.c = -1;
        this.a = (AccessibilityNodeInfo)object0;
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT < 30 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY") : C.z.b.b(this.a);
    }

    public void A0(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setPaneTitle(charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence0);
    }

    public CharSequence B() {
        if(this.F()) {
            List list0 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List list1 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List list2 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List list3 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence0 = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for(int v = 0; v < list0.size(); ++v) {
                ((Spannable)charSequence0).setSpan(new C.a(((int)(((Integer)list3.get(v)))), this, this.v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((int)(((Integer)list0.get(v)))), ((int)(((Integer)list1.get(v)))), ((int)(((Integer)list2.get(v)))));
            }
            return charSequence0;
        }
        return this.a.getText();
    }

    public void B0(View view0) {
        this.b = -1;
        this.a.setParent(view0);
    }

    public CharSequence C() {
        return Build.VERSION.SDK_INT < 28 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY") : this.a.getTooltipText();
    }

    public void C0(View view0, int v) {
        this.b = v;
        this.a.setParent(view0, v);
    }

    public String D() {
        return Build.VERSION.SDK_INT < 33 ? this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY") : C.z.c.g(this.a);
    }

    public void D0(CharSequence charSequence0) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence0);
    }

    public String E() {
        return this.a.getViewIdResourceName();
    }

    public void E0(boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
            return;
        }
        this.h0(1, z);
    }

    private boolean F() {
        return !this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void F0(boolean z) {
        this.a.setScrollable(z);
    }

    private int G(ClickableSpan clickableSpan0, SparseArray sparseArray0) {
        if(sparseArray0 != null) {
            for(int v = 0; v < sparseArray0.size(); ++v) {
                if(clickableSpan0.equals(((ClickableSpan)((WeakReference)sparseArray0.valueAt(v)).get()))) {
                    return sparseArray0.keyAt(v);
                }
            }
        }
        int v1 = z.d;
        z.d = v1 + 1;
        return v1;
    }

    public void G0(boolean z) {
        this.a.setSelected(z);
    }

    public boolean H() {
        return Build.VERSION.SDK_INT < 34 ? this.l(0x40) : C.z.d.f(this.a);
    }

    public void H0(boolean z) {
        if(Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
            return;
        }
        this.h0(4, z);
    }

    public boolean I() {
        return this.a.isAccessibilityFocused();
    }

    public void I0(View view0) {
        this.c = -1;
        this.a.setSource(view0);
    }

    public boolean J() {
        return this.a.isCheckable();
    }

    public void J0(View view0, int v) {
        this.c = v;
        this.a.setSource(view0, v);
    }

    public boolean K() {
        return this.a.isChecked();
    }

    public void K0(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 30) {
            C.z.b.c(this.a, charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence0);
    }

    public boolean L() {
        return this.a.isClickable();
    }

    public void L0(CharSequence charSequence0) {
        this.a.setText(charSequence0);
    }

    public boolean M() {
        return this.a.isContextClickable();
    }

    public void M0(View view0) {
        this.a.setTraversalAfter(view0);
    }

    public boolean N() {
        return this.a.isEnabled();
    }

    public void N0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public boolean O() {
        return this.a.isFocusable();
    }

    public AccessibilityNodeInfo O0() {
        return this.a;
    }

    public boolean P() {
        return this.a.isFocused();
    }

    public static z P0(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return new z(accessibilityNodeInfo0);
    }

    public boolean Q() {
        return this.l(0x4000000);
    }

    static z Q0(Object object0) {
        return object0 == null ? null : new z(object0);
    }

    public boolean R() {
        return Build.VERSION.SDK_INT < 24 ? true : this.a.isImportantForAccessibility();
    }

    public boolean S() {
        return this.a.isLongClickable();
    }

    public boolean T() {
        return this.a.isPassword();
    }

    public boolean U() {
        return this.a.isScrollable();
    }

    public boolean V() {
        return this.a.isSelected();
    }

    public boolean W() {
        return Build.VERSION.SDK_INT < 26 ? this.l(4) : this.a.isShowingHintText();
    }

    public boolean X() {
        return Build.VERSION.SDK_INT < 33 ? this.l(0x800000) : C.z.c.h(this.a);
    }

    public boolean Y() {
        return this.a.isVisibleToUser();
    }

    public static z Z() {
        return z.P0(AccessibilityNodeInfo.obtain());
    }

    public void a(int v) {
        this.a.addAction(v);
    }

    public static z a0(z z0) {
        return z.P0(AccessibilityNodeInfo.obtain(z0.a));
    }

    public void b(a z$a0) {
        this.a.addAction(((AccessibilityNodeInfo.AccessibilityAction)z$a0.a));
    }

    public static z b0(View view0) {
        return z.P0(AccessibilityNodeInfo.obtain(view0));
    }

    public void c(View view0) {
        this.a.addChild(view0);
    }

    public boolean c0(int v, Bundle bundle0) {
        return this.a.performAction(v, bundle0);
    }

    public void d(View view0, int v) {
        this.a.addChild(view0, v);
    }

    public void d0() {
    }

    private void e(ClickableSpan clickableSpan0, Spanned spanned0, int v) {
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned0.getSpanStart(clickableSpan0));
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned0.getSpanEnd(clickableSpan0));
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned0.getSpanFlags(clickableSpan0));
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(v);
    }

    public boolean e0(a z$a0) {
        return this.a.removeAction(((AccessibilityNodeInfo.AccessibilityAction)z$a0.a));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(accessibilityNodeInfo0 == null) {
            if(((z)object0).a != null) {
                return false;
            }
        }
        else if(!accessibilityNodeInfo0.equals(((z)object0).a)) {
            return false;
        }
        return this.c == ((z)object0).c ? this.b == ((z)object0).b : false;
    }

    public void f(CharSequence charSequence0, View view0) {
        if(Build.VERSION.SDK_INT < 26) {
            this.g();
            this.f0(view0);
            ClickableSpan[] arr_clickableSpan = z.r(charSequence0);
            if(arr_clickableSpan != null && arr_clickableSpan.length > 0) {
                this.v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", v.c.a);
                SparseArray sparseArray0 = this.x(view0);
                for(int v = 0; v < arr_clickableSpan.length; ++v) {
                    int v1 = this.G(arr_clickableSpan[v], sparseArray0);
                    sparseArray0.put(v1, new WeakReference(arr_clickableSpan[v]));
                    this.e(arr_clickableSpan[v], ((Spanned)charSequence0), v1);
                }
            }
        }
    }

    private void f0(View view0) {
        SparseArray sparseArray0 = this.z(view0);
        if(sparseArray0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                if(((WeakReference)sparseArray0.valueAt(v1)).get() == null) {
                    arrayList0.add(v1);
                }
            }
            for(int v = 0; v < arrayList0.size(); ++v) {
                sparseArray0.remove(((int)(((Integer)arrayList0.get(v)))));
            }
        }
    }

    private void g() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void g0(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    private List h(String s) {
        List list0 = this.a.getExtras().getIntegerArrayList(s);
        if(list0 == null) {
            list0 = new ArrayList();
            this.a.getExtras().putIntegerArrayList(s, ((ArrayList)list0));
        }
        return list0;
    }

    private void h0(int v, boolean z) {
        Bundle bundle0 = this.v();
        if(bundle0 != null) {
            int v1 = bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & ~v;
            if(!z) {
                v = 0;
            }
            bundle0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", v | v1);
        }
    }

    @Override
    public int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public List i() {
        List list0 = this.a.getActionList();
        if(list0 != null) {
            List list1 = new ArrayList();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                list1.add(new a(list0.get(v1)));
            }
            return list1;
        }
        return Collections.emptyList();
    }

    public void i0(Rect rect0) {
        this.a.setBoundsInParent(rect0);
    }

    static String j(int v) {
        switch(v) {
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 0x20: {
                return "ACTION_LONG_CLICK";
            }
            case 0x40: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 0x80: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 0x100: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 0x200: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 0x400: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 0x800: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 0x1000: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 0x2000: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 0x4000: {
                return "ACTION_COPY";
            }
            case 0x8000: {
                return "ACTION_PASTE";
            }
            case 0x10000: {
                return "ACTION_CUT";
            }
            case 0x20000: {
                return "ACTION_SET_SELECTION";
            }
            case 0x40000: {
                return "ACTION_EXPAND";
            }
            case 0x80000: {
                return "ACTION_COLLAPSE";
            }
            case 0x200000: {
                return "ACTION_SET_TEXT";
            }
            case 0x1020036: {
                return "ACTION_SHOW_ON_SCREEN";
            }
            case 0x1020037: {
                return "ACTION_SCROLL_TO_POSITION";
            }
            case 0x1020038: {
                return "ACTION_SCROLL_UP";
            }
            case 0x1020039: {
                return "ACTION_SCROLL_LEFT";
            }
            case 0x102003A: {
                return "ACTION_SCROLL_DOWN";
            }
            case 0x102003B: {
                return "ACTION_SCROLL_RIGHT";
            }
            case 0x102003C: {
                return "ACTION_CONTEXT_CLICK";
            }
            case 0x102003D: {
                return "ACTION_SET_PROGRESS";
            }
            case 0x1020042: {
                return "ACTION_MOVE_WINDOW";
            }
            case 0x1020044: {
                return "ACTION_SHOW_TOOLTIP";
            }
            case 0x1020045: {
                return "ACTION_HIDE_TOOLTIP";
            }
            case 0x1020046: {
                return "ACTION_PAGE_UP";
            }
            case 0x1020047: {
                return "ACTION_PAGE_DOWN";
            }
            case 0x1020048: {
                return "ACTION_PAGE_LEFT";
            }
            case 0x1020049: {
                return "ACTION_PAGE_RIGHT";
            }
            case 0x102004A: {
                return "ACTION_PRESS_AND_HOLD";
            }
            case 0x1020054: {
                return "ACTION_IME_ENTER";
            }
            case 0x1020055: {
                return "ACTION_DRAG_START";
            }
            case 0x1020056: {
                return "ACTION_DRAG_DROP";
            }
            case 0x1020057: {
                return "ACTION_DRAG_CANCEL";
            }
            case 0x102005E: {
                return "ACTION_SCROLL_IN_DIRECTION";
            }
            default: {
                return "ACTION_UNKNOWN";
            }
        }
    }

    public void j0(Rect rect0) {
        this.a.setBoundsInScreen(rect0);
    }

    public int k() {
        return this.a.getActions();
    }

    public void k0(boolean z) {
        this.a.setCheckable(z);
    }

    private boolean l(int v) {
        Bundle bundle0 = this.v();
        return bundle0 == null ? false : (bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & v) == v;
    }

    public void l0(boolean z) {
        this.a.setChecked(z);
    }

    public void m(Rect rect0) {
        this.a.getBoundsInParent(rect0);
    }

    public void m0(CharSequence charSequence0) {
        this.a.setClassName(charSequence0);
    }

    public void n(Rect rect0) {
        this.a.getBoundsInScreen(rect0);
    }

    public void n0(boolean z) {
        this.a.setClickable(z);
    }

    public void o(Rect rect0) {
        if(Build.VERSION.SDK_INT >= 34) {
            C.z.d.b(this.a, rect0);
            return;
        }
        Rect rect1 = (Rect)this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if(rect1 != null) {
            rect0.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
        }
    }

    public void o0(Object object0) {
        this.a.setCollectionInfo((object0 == null ? null : ((AccessibilityNodeInfo.CollectionInfo)((C.z.e)object0).a)));
    }

    public int p() {
        return this.a.getChildCount();
    }

    public void p0(Object object0) {
        this.a.setCollectionItemInfo((object0 == null ? null : ((AccessibilityNodeInfo.CollectionItemInfo)((C.z.f)object0).a)));
    }

    public CharSequence q() {
        return this.a.getClassName();
    }

    public void q0(CharSequence charSequence0) {
        this.a.setContentDescription(charSequence0);
    }

    // 去混淆评级： 低(20)
    public static ClickableSpan[] r(CharSequence charSequence0) {
        return charSequence0 instanceof Spanned ? ((ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class)) : null;
    }

    public void r0(boolean z) {
        this.a.setEnabled(z);
    }

    public CharSequence s() {
        return Build.VERSION.SDK_INT < 34 ? this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY") : C.z.d.c(this.a);
    }

    public void s0(CharSequence charSequence0) {
        this.a.setError(charSequence0);
    }

    public CharSequence t() {
        return this.a.getContentDescription();
    }

    public void t0(boolean z) {
        this.a.setFocusable(z);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        Rect rect0 = new Rect();
        this.m(rect0);
        stringBuilder0.append("; boundsInParent: " + rect0);
        this.n(rect0);
        stringBuilder0.append("; boundsInScreen: " + rect0);
        this.o(rect0);
        stringBuilder0.append("; boundsInWindow: " + rect0);
        stringBuilder0.append("; packageName: ");
        stringBuilder0.append(this.y());
        stringBuilder0.append("; className: ");
        stringBuilder0.append(this.q());
        stringBuilder0.append("; text: ");
        stringBuilder0.append(this.B());
        stringBuilder0.append("; error: ");
        stringBuilder0.append(this.u());
        stringBuilder0.append("; maxTextLength: ");
        stringBuilder0.append(this.w());
        stringBuilder0.append("; stateDescription: ");
        stringBuilder0.append(this.A());
        stringBuilder0.append("; contentDescription: ");
        stringBuilder0.append(this.t());
        stringBuilder0.append("; tooltipText: ");
        stringBuilder0.append(this.C());
        stringBuilder0.append("; viewIdResName: ");
        stringBuilder0.append(this.E());
        stringBuilder0.append("; uniqueId: ");
        stringBuilder0.append(this.D());
        stringBuilder0.append("; checkable: ");
        stringBuilder0.append(this.J());
        stringBuilder0.append("; checked: ");
        stringBuilder0.append(this.K());
        stringBuilder0.append("; focusable: ");
        stringBuilder0.append(this.O());
        stringBuilder0.append("; focused: ");
        stringBuilder0.append(this.P());
        stringBuilder0.append("; selected: ");
        stringBuilder0.append(this.V());
        stringBuilder0.append("; clickable: ");
        stringBuilder0.append(this.L());
        stringBuilder0.append("; longClickable: ");
        stringBuilder0.append(this.S());
        stringBuilder0.append("; contextClickable: ");
        stringBuilder0.append(this.M());
        stringBuilder0.append("; enabled: ");
        stringBuilder0.append(this.N());
        stringBuilder0.append("; password: ");
        stringBuilder0.append(this.T());
        stringBuilder0.append("; scrollable: " + this.U());
        stringBuilder0.append("; containerTitle: ");
        stringBuilder0.append(this.s());
        stringBuilder0.append("; granularScrollingSupported: ");
        stringBuilder0.append(this.Q());
        stringBuilder0.append("; importantForAccessibility: ");
        stringBuilder0.append(this.R());
        stringBuilder0.append("; visible: ");
        stringBuilder0.append(this.Y());
        stringBuilder0.append("; isTextSelectable: ");
        stringBuilder0.append(this.X());
        stringBuilder0.append("; accessibilityDataSensitive: ");
        stringBuilder0.append(this.H());
        stringBuilder0.append("; [");
        List list0 = this.i();
        for(int v = 0; v < list0.size(); ++v) {
            a z$a0 = (a)list0.get(v);
            String s = z.j(z$a0.b());
            if(s.equals("ACTION_UNKNOWN") && z$a0.c() != null) {
                s = z$a0.c().toString();
            }
            stringBuilder0.append(s);
            if(v != list0.size() - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public CharSequence u() {
        return this.a.getError();
    }

    public void u0(boolean z) {
        this.a.setFocused(z);
    }

    public Bundle v() {
        return this.a.getExtras();
    }

    public void v0(boolean z) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
            return;
        }
        this.h0(2, z);
    }

    public int w() {
        return this.a.getMaxTextLength();
    }

    public void w0(CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence0);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence0);
    }

    private SparseArray x(View view0) {
        SparseArray sparseArray0 = this.z(view0);
        if(sparseArray0 == null) {
            sparseArray0 = new SparseArray();
            view0.setTag(v.c.I, sparseArray0);
        }
        return sparseArray0;
    }

    public void x0(View view0) {
        this.a.setLabelFor(view0);
    }

    public CharSequence y() {
        return this.a.getPackageName();
    }

    public void y0(int v) {
        this.a.setMaxTextLength(v);
    }

    private SparseArray z(View view0) {
        return (SparseArray)view0.getTag(v.c.I);
    }

    public void z0(CharSequence charSequence0) {
        this.a.setPackageName(charSequence0);
    }
}

