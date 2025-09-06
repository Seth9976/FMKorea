package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.v;
import androidx.appcompat.app.E;
import androidx.core.app.q;
import androidx.core.app.r;
import androidx.core.app.s;
import androidx.core.view.w;
import androidx.core.view.z;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public abstract class FragmentManager {
    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public LaunchedFragmentInfo a(Parcel parcel0) {
                return new LaunchedFragmentInfo(parcel0);
            }

            public LaunchedFragmentInfo[] b(int v) {
                return new LaunchedFragmentInfo[v];
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
        String f;
        int g;

        static {
            LaunchedFragmentInfo.CREATOR = new a();
        }

        LaunchedFragmentInfo(Parcel parcel0) {
            this.f = parcel0.readString();
            this.g = parcel0.readInt();
        }

        LaunchedFragmentInfo(String s, int v) {
            this.f = s;
            this.g = v;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.f);
            parcel0.writeInt(this.g);
        }
    }

    class b extends v {
        final FragmentManager d;

        b(boolean z) {
            super(z);
        }

        @Override  // androidx.activity.v
        public void d() {
            FragmentManager.this.D0();
        }
    }

    class c implements z {
        final FragmentManager a;

        @Override  // androidx.core.view.z
        public boolean a(MenuItem menuItem0) {
            return FragmentManager.this.K(menuItem0);
        }

        @Override  // androidx.core.view.z
        public void b(Menu menu0) {
            FragmentManager.this.L(menu0);
        }

        @Override  // androidx.core.view.z
        public void c(Menu menu0, MenuInflater menuInflater0) {
            FragmentManager.this.D(menu0, menuInflater0);
        }

        @Override  // androidx.core.view.z
        public void d(Menu menu0) {
            FragmentManager.this.P(menu0);
        }
    }

    class d extends l {
        final FragmentManager b;

        @Override  // androidx.fragment.app.l
        public Fragment a(ClassLoader classLoader0, String s) {
            return FragmentManager.this.u0().b(FragmentManager.this.u0().g(), s, null);
        }
    }

    class e implements G {
        final FragmentManager a;

        @Override  // androidx.fragment.app.G
        public F a(ViewGroup viewGroup0) {
            return new androidx.fragment.app.b(viewGroup0);
        }
    }

    class f implements Runnable {
        final FragmentManager f;

        @Override
        public void run() {
            FragmentManager.this.b0(true);
        }
    }

    static class j extends d.a {
        @Override  // d.a
        public Intent a(Context context0, Object object0) {
            return this.d(context0, ((IntentSenderRequest)object0));
        }

        @Override  // d.a
        public Object c(int v, Intent intent0) {
            return this.e(v, intent0);
        }

        public Intent d(Context context0, IntentSenderRequest intentSenderRequest0) {
            Intent intent0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent1 = intentSenderRequest0.a();
            if(intent1 != null) {
                Bundle bundle0 = intent1.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if(bundle0 != null) {
                    intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
                    intent1.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if(intent1.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest0 = new androidx.activity.result.IntentSenderRequest.a(intentSenderRequest0.d()).b(null).c(intentSenderRequest0.c(), intentSenderRequest0.b()).a();
                    }
                }
            }
            intent0.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
            if(FragmentManager.H0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent0);
            }
            return intent0;
        }

        public ActivityResult e(int v, Intent intent0) {
            return new ActivityResult(v, intent0);
        }
    }

    public static abstract class k {
        public void a(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void b(FragmentManager fragmentManager0, Fragment fragment0, Context context0) {
        }

        public void c(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void d(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void e(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void f(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void g(FragmentManager fragmentManager0, Fragment fragment0, Context context0) {
        }

        public void h(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void i(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void j(FragmentManager fragmentManager0, Fragment fragment0, Bundle bundle0) {
        }

        public void k(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void l(FragmentManager fragmentManager0, Fragment fragment0) {
        }

        public void m(FragmentManager fragmentManager0, Fragment fragment0, View view0, Bundle bundle0) {
        }

        public void n(FragmentManager fragmentManager0, Fragment fragment0) {
        }
    }

    interface androidx.fragment.app.FragmentManager.l {
        boolean a(ArrayList arg1, ArrayList arg2);
    }

    class m implements androidx.fragment.app.FragmentManager.l {
        final String a;
        final int b;
        final int c;
        final FragmentManager d;

        m(String s, int v, int v1) {
            this.a = s;
            this.b = v;
            this.c = v1;
        }

        @Override  // androidx.fragment.app.FragmentManager$l
        public boolean a(ArrayList arrayList0, ArrayList arrayList1) {
            Fragment fragment0 = FragmentManager.this.y;
            return fragment0 == null || this.b >= 0 || this.a != null || !fragment0.getChildFragmentManager().c1() ? FragmentManager.this.f1(arrayList0, arrayList1, this.a, this.b, this.c) : false;
        }
    }

    private l A;
    private G B;
    private G C;
    private androidx.activity.result.b D;
    private androidx.activity.result.b E;
    private androidx.activity.result.b F;
    ArrayDeque G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private androidx.fragment.app.v P;
    private S.c.c Q;
    private Runnable R;
    private static boolean S = false;
    private final ArrayList a;
    private boolean b;
    private final y c;
    ArrayList d;
    private ArrayList e;
    private final n f;
    private OnBackPressedDispatcher g;
    private final v h;
    private final AtomicInteger i;
    private final Map j;
    private final Map k;
    private final Map l;
    private ArrayList m;
    private final o n;
    private final CopyOnWriteArrayList o;
    private final B.a p;
    private final B.a q;
    private final B.a r;
    private final B.a s;
    private final z t;
    int u;
    private androidx.fragment.app.m v;
    private androidx.fragment.app.j w;
    private Fragment x;
    Fragment y;
    private l z;

    static {
    }

    public FragmentManager() {
        this.a = new ArrayList();
        this.c = new y();
        this.f = new n(this);
        this.h = new b(this, false);
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap());
        this.k = Collections.synchronizedMap(new HashMap());
        this.l = Collections.synchronizedMap(new HashMap());
        this.n = new o(this);
        this.o = new CopyOnWriteArrayList();
        this.p = (Configuration configuration0) -> if(this.J0()) {
            this.A(configuration0, false);
        };
        this.q = (Integer integer0) -> if(this.J0() && ((int)integer0) == 80) {
            this.G(false);
        };
        this.r = (androidx.core.app.j j0) -> if(this.J0()) {
            this.H(j0.a(), false);
        };
        this.s = (s s0) -> if(this.J0()) {
            this.O(s0.a(), false);
        };
        this.t = new c(this);
        this.u = -1;
        this.z = null;
        this.A = new d(this);
        this.B = null;
        this.C = new e(this);
        this.G = new ArrayDeque();
        this.R = () -> {
            FragmentManager.this.a0(true);
            boolean z1 = false;
            while(FragmentManager.this.n0(FragmentManager.this.M, FragmentManager.this.N)) {
                try {
                    z1 = true;
                    FragmentManager.this.b = true;
                    FragmentManager.this.i1(FragmentManager.this.M, FragmentManager.this.N);
                }
                finally {
                    FragmentManager.this.s();
                }
            }
            FragmentManager.this.x1();
            FragmentManager.this.W();
            FragmentManager.this.c.b();
            return z1;
        };
    }

    void A(Configuration configuration0, boolean z) {
        if(z && this.v instanceof androidx.core.content.b) {
            this.v1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performConfigurationChanged(configuration0);
                if(z) {
                    fragment0.mChildFragmentManager.A(configuration0, true);
                }
            }
        }
    }

    public S.c.c A0() {
        return this.Q;
    }

    boolean B(MenuItem menuItem0) {
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.o()) {
            if(((Fragment)object0) != null && ((Fragment)object0).performContextItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    static Fragment B0(View view0) {
        Object object0 = view0.getTag(R.b.a);
        return object0 instanceof Fragment ? ((Fragment)object0) : null;
    }

    void C() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.T(1);
    }

    L C0(Fragment fragment0) {
        return this.P.n(fragment0);
    }

    boolean D(Menu menu0, MenuInflater menuInflater0) {
        if(this.u < 1) {
            return false;
        }
        ArrayList arrayList0 = null;
        boolean z = false;
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && this.L0(fragment0) && fragment0.performCreateOptionsMenu(menu0, menuInflater0)) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(fragment0);
                z = true;
            }
        }
        if(this.e != null) {
            for(int v = 0; v < this.e.size(); ++v) {
                boolean z1 = arrayList0 != null && arrayList0.contains(((Fragment)this.e.get(v)));
            }
        }
        this.e = arrayList0;
        return z;
    }

    void D0() {
        this.b0(true);
        if(this.h.g()) {
            this.c1();
            return;
        }
        this.g.k();
    }

    void E() {
        this.K = true;
        this.b0(true);
        this.Y();
        this.t();
        this.T(-1);
        androidx.fragment.app.m m0 = this.v;
        if(m0 instanceof androidx.core.content.c) {
            ((androidx.core.content.c)m0).m(this.q);
        }
        androidx.fragment.app.m m1 = this.v;
        if(m1 instanceof androidx.core.content.b) {
            ((androidx.core.content.b)m1).A(this.p);
        }
        androidx.fragment.app.m m2 = this.v;
        if(m2 instanceof q) {
            ((q)m2).o0(this.r);
        }
        androidx.fragment.app.m m3 = this.v;
        if(m3 instanceof r) {
            ((r)m3).g0(this.s);
        }
        androidx.fragment.app.m m4 = this.v;
        if(m4 instanceof w) {
            ((w)m4).k(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if(this.g != null) {
            this.h.h();
            this.g = null;
        }
        androidx.activity.result.b b0 = this.D;
        if(b0 != null) {
            b0.c();
            this.E.c();
            this.F.c();
        }
    }

    void E0(Fragment fragment0) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "hide: " + fragment0);
        }
        if(!fragment0.mHidden) {
            fragment0.mHidden = true;
            fragment0.mHiddenChanged ^= true;
            this.s1(fragment0);
        }
    }

    void F() {
        this.T(1);
    }

    void F0(Fragment fragment0) {
        if(fragment0.mAdded && this.I0(fragment0)) {
            this.H = true;
        }
    }

    void G(boolean z) {
        if(z && this.v instanceof androidx.core.content.c) {
            this.v1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performLowMemory();
                if(z) {
                    fragment0.mChildFragmentManager.G(true);
                }
            }
        }
    }

    public boolean G0() {
        return this.K;
    }

    void H(boolean z, boolean z1) {
        if(z1 && this.v instanceof q) {
            this.v1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && z1) {
                fragment0.mChildFragmentManager.H(z, true);
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean H0(int v) {
        return FragmentManager.S || Log.isLoggable("FragmentManager", v);
    }

    void I(Fragment fragment0) {
        for(Object object0: this.o) {
            ((androidx.fragment.app.w)object0).a(this, fragment0);
        }
    }

    // 去混淆评级： 低(30)
    private boolean I0(Fragment fragment0) {
        return fragment0.mHasMenu && fragment0.mMenuVisible || fragment0.mChildFragmentManager.q();
    }

    void J() {
        for(Object object0: this.c.l()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.onHiddenChanged(fragment0.isHidden());
                fragment0.mChildFragmentManager.J();
            }
        }
    }

    // 去混淆评级： 低(30)
    private boolean J0() {
        return this.x == null ? true : this.x.isAdded() && this.x.getParentFragmentManager().J0();
    }

    boolean K(MenuItem menuItem0) {
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.o()) {
            if(((Fragment)object0) != null && ((Fragment)object0).performOptionsItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    boolean K0(Fragment fragment0) {
        return fragment0 == null ? false : fragment0.isHidden();
    }

    void L(Menu menu0) {
        if(this.u < 1) {
            return;
        }
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performOptionsMenuClosed(menu0);
            }
        }
    }

    boolean L0(Fragment fragment0) {
        return fragment0 == null ? true : fragment0.isMenuVisible();
    }

    private void M(Fragment fragment0) {
        if(fragment0 != null && fragment0.equals(this.f0(fragment0.mWho))) {
            fragment0.performPrimaryNavigationFragmentChanged();
        }
    }

    boolean M0(Fragment fragment0) {
        if(fragment0 == null) {
            return true;
        }
        FragmentManager fragmentManager0 = fragment0.mFragmentManager;
        return fragment0.equals(fragmentManager0.y0()) && this.M0(fragmentManager0.x);
    }

    void N() {
        this.T(5);
    }

    boolean N0(int v) {
        return this.u >= v;
    }

    void O(boolean z, boolean z1) {
        if(z1 && this.v instanceof r) {
            this.v1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && z1) {
                fragment0.mChildFragmentManager.O(z, true);
            }
        }
    }

    // 去混淆评级： 低(20)
    public boolean O0() {
        return this.I || this.J;
    }

    boolean P(Menu menu0) {
        boolean z = false;
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && this.L0(fragment0) && fragment0.performPrepareOptionsMenu(menu0)) {
                z = true;
            }
        }
        return z;
    }

    // 检测为 Lambda 实现
    private Bundle P0() [...]

    void Q() {
        this.x1();
        this.M(this.y);
    }

    // 检测为 Lambda 实现
    private void Q0(Configuration configuration0) [...]

    void R() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.T(7);
    }

    // 检测为 Lambda 实现
    private void R0(Integer integer0) [...]

    void S() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.T(5);
    }

    // 检测为 Lambda 实现
    private void S0(androidx.core.app.j j0) [...]

    private void T(int v) {
        try {
            this.b = true;
            this.c.d(v);
            this.X0(v, false);
            for(Object object0: this.u()) {
                ((F)object0).j();
            }
        }
        finally {
            this.b = false;
        }
        this.b0(true);
    }

    // 检测为 Lambda 实现
    private void T0(s s0) [...]

    void U() {
        this.J = true;
        this.P.q(true);
        this.T(4);
    }

    void U0(Fragment fragment0, String[] arr_s, int v) {
        if(this.F != null) {
            LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new LaunchedFragmentInfo(fragment0.mWho, v);
            this.G.addLast(fragmentManager$LaunchedFragmentInfo0);
            this.F.a(arr_s);
            return;
        }
        this.v.n(fragment0, arr_s, v);
    }

    void V() {
        this.T(2);
    }

    void V0(Fragment fragment0, Intent intent0, int v, Bundle bundle0) {
        if(this.D != null) {
            LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new LaunchedFragmentInfo(fragment0.mWho, v);
            this.G.addLast(fragmentManager$LaunchedFragmentInfo0);
            if(intent0 != null && bundle0 != null) {
                intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            this.D.a(intent0);
            return;
        }
        this.v.p(fragment0, intent0, v, bundle0);
    }

    private void W() {
        if(this.L) {
            this.L = false;
            this.u1();
        }
    }

    void W0(Fragment fragment0, IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        Intent intent1;
        if(this.E != null) {
            if(bundle0 == null) {
                intent1 = intent0;
            }
            else {
                if(intent0 == null) {
                    intent1 = new Intent();
                    intent1.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                else {
                    intent1 = intent0;
                }
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle0 + " were added to fillInIntent " + intent1 + " for fragment " + fragment0);
                }
                intent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            IntentSenderRequest intentSenderRequest0 = new androidx.activity.result.IntentSenderRequest.a(intentSender0).b(intent1).c(v2, v1).a();
            LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new LaunchedFragmentInfo(fragment0.mWho, v);
            this.G.addLast(fragmentManager$LaunchedFragmentInfo0);
            if(FragmentManager.H0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment0 + "is launching an IntentSender for result ");
            }
            this.E.a(intentSenderRequest0);
            return;
        }
        this.v.q(fragment0, intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    public void X(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.c.e(s, fileDescriptor0, printWriter0, arr_s);
        ArrayList arrayList0 = this.e;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            if(v1 > 0) {
                printWriter0.print(s);
                printWriter0.println("Fragments Created Menus:");
                for(int v2 = 0; v2 < v1; ++v2) {
                    Fragment fragment0 = (Fragment)this.e.get(v2);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v2);
                    printWriter0.print(": ");
                    printWriter0.println("Fragment{1cadff37} (e454ae3b-6f12-40d8-b040-32c516bfe042)");
                }
            }
        }
        ArrayList arrayList1 = this.d;
        if(arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 > 0) {
                printWriter0.print(s);
                printWriter0.println("Back Stack:");
                for(int v4 = 0; v4 < v3; ++v4) {
                    androidx.fragment.app.a a0 = (androidx.fragment.app.a)this.d.get(v4);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v4);
                    printWriter0.print(": ");
                    printWriter0.println(a0.toString());
                    a0.s(s + "    ", printWriter0);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("Back Stack Index: " + this.i.get());
        synchronized(this.a) {
            int v6 = this.a.size();
            if(v6 > 0) {
                printWriter0.print(s);
                printWriter0.println("Pending Actions:");
                for(int v = 0; v < v6; ++v) {
                    androidx.fragment.app.FragmentManager.l fragmentManager$l0 = (androidx.fragment.app.FragmentManager.l)this.a.get(v);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v);
                    printWriter0.print(": ");
                    printWriter0.println(fragmentManager$l0);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("FragmentManager misc state:");
        printWriter0.print(s);
        printWriter0.print("  mHost=");
        printWriter0.println(this.v);
        printWriter0.print(s);
        printWriter0.print("  mContainer=");
        printWriter0.println(this.w);
        if(this.x != null) {
            printWriter0.print(s);
            printWriter0.print("  mParent=");
            printWriter0.println(this.x);
        }
        printWriter0.print(s);
        printWriter0.print("  mCurState=");
        printWriter0.print(this.u);
        printWriter0.print(" mStateSaved=");
        printWriter0.print(this.I);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.J);
        printWriter0.print(" mDestroyed=");
        printWriter0.println(this.K);
        if(this.H) {
            printWriter0.print(s);
            printWriter0.print("  mNeedMenuInvalidate=");
            printWriter0.println(this.H);
        }
    }

    void X0(int v, boolean z) {
        if(this.v == null && v != -1) {
            throw new IllegalStateException("No activity");
        }
        if(!z && v == this.u) {
            return;
        }
        this.u = v;
        this.c.t();
        this.u1();
        if(this.H) {
            androidx.fragment.app.m m0 = this.v;
            if(m0 != null && this.u == 7) {
                m0.r();
                this.H = false;
            }
        }
    }

    private void Y() {
        for(Object object0: this.u()) {
            ((F)object0).j();
        }
    }

    void Y0() {
        if(this.v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for(Object object0: this.c.o()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.noteStateNotSaved();
            }
        }
    }

    void Z(androidx.fragment.app.FragmentManager.l fragmentManager$l0, boolean z) {
        if(!z) {
            if(this.v == null) {
                throw this.K ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            this.r();
        }
        synchronized(this.a) {
            if(this.v == null) {
                if(!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(fragmentManager$l0);
            this.o1();
        }
    }

    void Z0(FragmentContainerView fragmentContainerView0) {
        for(Object object0: this.c.k()) {
            x x0 = (x)object0;
            Fragment fragment0 = x0.k();
            if(fragment0.mContainerId == fragmentContainerView0.getId() && (fragment0.mView != null && fragment0.mView.getParent() == null)) {
                fragment0.mContainer = fragmentContainerView0;
                x0.b();
            }
        }
    }

    private void a0(boolean z) {
        if(this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if(this.v == null) {
            throw this.K ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if(Looper.myLooper() != this.v.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if(!z) {
            this.r();
        }
        if(this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    void a1(x x0) {
        Fragment fragment0 = x0.k();
        if(fragment0.mDeferStart) {
            if(this.b) {
                this.L = true;
                return;
            }
            fragment0.mDeferStart = false;
            x0.m();
        }
    }

    // 检测为 Lambda 实现
    boolean b0(boolean z) [...]

    void b1(int v, int v1, boolean z) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        this.Z(new m(this, null, v, v1), z);
    }

    void c0(androidx.fragment.app.FragmentManager.l fragmentManager$l0, boolean z) {
        if(z && (this.v == null || this.K)) {
            return;
        }
        this.a0(z);
        if(fragmentManager$l0.a(this.M, this.N)) {
            try {
                this.b = true;
                this.i1(this.M, this.N);
            }
            finally {
                this.s();
            }
        }
        this.x1();
        this.W();
        this.c.b();
    }

    public boolean c1() {
        return this.e1(null, -1, 0);
    }

    private static void d0(ArrayList arrayList0, ArrayList arrayList1, int v, int v1) {
        while(v < v1) {
            androidx.fragment.app.a a0 = (androidx.fragment.app.a)arrayList0.get(v);
            if(((Boolean)arrayList1.get(v)).booleanValue()) {
                a0.q(-1);
                a0.v();
            }
            else {
                a0.q(1);
                a0.u();
            }
            ++v;
        }
    }

    public boolean d1(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        return this.e1(null, v, v1);
    }

    private void e0(ArrayList arrayList0, ArrayList arrayList1, int v, int v1) {
        boolean z = ((androidx.fragment.app.a)arrayList0.get(v)).r;
        ArrayList arrayList2 = this.O;
        if(arrayList2 == null) {
            this.O = new ArrayList();
        }
        else {
            arrayList2.clear();
        }
        this.O.addAll(this.c.o());
        Fragment fragment0 = this.y0();
        int v2 = v;
        boolean z1 = false;
        while(v2 < v1) {
            androidx.fragment.app.a a0 = (androidx.fragment.app.a)arrayList0.get(v2);
            fragment0 = ((Boolean)arrayList1.get(v2)).booleanValue() ? a0.z(this.O, fragment0) : a0.w(this.O, fragment0);
            z1 = z1 || a0.i;
            ++v2;
        }
        this.O.clear();
        if(!z && this.u >= 1) {
            for(int v3 = v; v3 < v1; ++v3) {
                for(Object object0: ((androidx.fragment.app.a)arrayList0.get(v3)).c) {
                    Fragment fragment1 = ((androidx.fragment.app.z.a)object0).b;
                    if(fragment1 != null && fragment1.mFragmentManager != null) {
                        x x0 = this.w(fragment1);
                        this.c.r(x0);
                    }
                }
            }
        }
        FragmentManager.d0(arrayList0, arrayList1, v, v1);
        boolean z2 = ((Boolean)arrayList1.get(v1 - 1)).booleanValue();
        for(int v4 = v; v4 < v1; ++v4) {
            androidx.fragment.app.a a1 = (androidx.fragment.app.a)arrayList0.get(v4);
            if(z2) {
                for(int v5 = a1.c.size() - 1; v5 >= 0; --v5) {
                    Fragment fragment2 = ((androidx.fragment.app.z.a)a1.c.get(v5)).b;
                    if(fragment2 != null) {
                        this.w(fragment2).m();
                    }
                }
            }
            else {
                for(Object object1: a1.c) {
                    Fragment fragment3 = ((androidx.fragment.app.z.a)object1).b;
                    if(fragment3 != null) {
                        this.w(fragment3).m();
                    }
                }
            }
        }
        this.X0(this.u, true);
        for(Object object2: this.v(arrayList0, v, v1)) {
            ((F)object2).r(z2);
            ((F)object2).p();
            ((F)object2).g();
        }
        while(v < v1) {
            androidx.fragment.app.a a2 = (androidx.fragment.app.a)arrayList0.get(v);
            if(((Boolean)arrayList1.get(v)).booleanValue() && a2.v >= 0) {
                a2.v = -1;
            }
            a2.y();
            ++v;
        }
        if(z1) {
            this.k1();
        }
    }

    private boolean e1(String s, int v, int v1) {
        this.b0(false);
        this.a0(true);
        if(this.y != null && v < 0 && s == null && this.y.getChildFragmentManager().c1()) {
            return true;
        }
        boolean z = this.f1(this.M, this.N, s, v, v1);
        if(z) {
            try {
                this.b = true;
                this.i1(this.M, this.N);
            }
            finally {
                this.s();
            }
        }
        this.x1();
        this.W();
        this.c.b();
        return z;
    }

    Fragment f0(String s) {
        return this.c.f(s);
    }

    boolean f1(ArrayList arrayList0, ArrayList arrayList1, String s, int v, int v1) {
        int v2 = this.g0(s, v, (v1 & 1) != 0);
        if(v2 < 0) {
            return false;
        }
        for(int v3 = this.d.size() - 1; v3 >= v2; --v3) {
            arrayList0.add(((androidx.fragment.app.a)this.d.remove(v3)));
            arrayList1.add(Boolean.TRUE);
        }
        return true;
    }

    private int g0(String s, int v, boolean z) {
        if(this.d != null && !this.d.isEmpty()) {
            if(s == null && v < 0) {
                return z ? 0 : this.d.size() - 1;
            }
            int v1;
            for(v1 = this.d.size() - 1; v1 >= 0; --v1) {
                androidx.fragment.app.a a0 = (androidx.fragment.app.a)this.d.get(v1);
                if(s != null && s.equals(a0.x()) || v >= 0 && v == a0.v) {
                    break;
                }
            }
            if(v1 < 0) {
                return v1;
            }
            if(z) {
                while(v1 > 0) {
                    androidx.fragment.app.a a1 = (androidx.fragment.app.a)this.d.get(v1 - 1);
                    if((s == null || !s.equals(a1.x())) && (v < 0 || v != a1.v)) {
                        break;
                    }
                    --v1;
                }
                return v1;
            }
            return v1 == this.d.size() - 1 ? -1 : v1 + 1;
        }
        return -1;
    }

    public void g1(k fragmentManager$k0, boolean z) {
        this.n.o(fragmentManager$k0, z);
    }

    public Fragment h0(int v) {
        return this.c.g(v);
    }

    void h1(Fragment fragment0) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "remove: " + fragment0 + " nesting=" + fragment0.mBackStackNesting);
        }
        boolean z = fragment0.isInBackStack();
        if(!fragment0.mDetached || !z) {
            this.c.u(fragment0);
            if(this.I0(fragment0)) {
                this.H = true;
            }
            fragment0.mRemoving = true;
            this.s1(fragment0);
        }
    }

    void i(androidx.fragment.app.a a0) {
        if(this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(a0);
    }

    public Fragment i0(String s) {
        return this.c.h(s);
    }

    private void i1(ArrayList arrayList0, ArrayList arrayList1) {
        if(arrayList0.isEmpty()) {
            return;
        }
        if(arrayList0.size() != arrayList1.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int v = arrayList0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((androidx.fragment.app.a)arrayList0.get(v1)).r) {
                if(v2 != v1) {
                    this.e0(arrayList0, arrayList1, v2, v1);
                }
                v2 = v1 + 1;
                if(((Boolean)arrayList1.get(v1)).booleanValue()) {
                    while(v2 < v && ((Boolean)arrayList1.get(v2)).booleanValue() && !((androidx.fragment.app.a)arrayList0.get(v2)).r) {
                        ++v2;
                    }
                }
                this.e0(arrayList0, arrayList1, v1, v2);
                v1 = v2 - 1;
            }
        }
        if(v2 != v) {
            this.e0(arrayList0, arrayList1, v2, v);
        }
    }

    x j(Fragment fragment0) {
        String s = fragment0.mPreviousWho;
        if(s != null) {
            S.c.f(fragment0, s);
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "add: " + fragment0);
        }
        x x0 = this.w(fragment0);
        fragment0.mFragmentManager = this;
        this.c.r(x0);
        if(!fragment0.mDetached) {
            this.c.a(fragment0);
            fragment0.mRemoving = false;
            if(fragment0.mView == null) {
                fragment0.mHiddenChanged = false;
            }
            if(this.I0(fragment0)) {
                this.H = true;
            }
        }
        return x0;
    }

    Fragment j0(String s) {
        return this.c.i(s);
    }

    void j1(Fragment fragment0) {
        this.P.p(fragment0);
    }

    public void k(androidx.fragment.app.w w0) {
        this.o.add(w0);
    }

    static FragmentManager k0(View view0) {
        h h0;
        Fragment fragment0 = FragmentManager.l0(view0);
        if(fragment0 != null) {
            if(!fragment0.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment0 + " that owns View " + view0 + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            return fragment0.getChildFragmentManager();
        }
        for(Context context0 = view0.getContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            h0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof h) {
                h0 = (h)context0;
                break;
            }
        }
        if(h0 == null) {
            throw new IllegalStateException("View " + view0 + " is not within a subclass of FragmentActivity.");
        }
        return h0.P0();
    }

    private void k1() {
        if(this.m != null && this.m.size() > 0) {
            E.a(this.m.get(0));
            throw null;
        }
    }

    void l(Fragment fragment0) {
        this.P.f(fragment0);
    }

    private static Fragment l0(View view0) {
        while(view0 != null) {
            Fragment fragment0 = FragmentManager.B0(view0);
            if(fragment0 != null) {
                return fragment0;
            }
            ViewParent viewParent0 = view0.getParent();
            view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        return null;
    }

    void l1(Parcelable parcelable0) {
        x x0;
        if(parcelable0 == null) {
            return;
        }
        for(Object object0: ((Bundle)parcelable0).keySet()) {
            String s = (String)object0;
            if(s.startsWith("result_")) {
                Bundle bundle0 = ((Bundle)parcelable0).getBundle(s);
                if(bundle0 != null) {
                    bundle0.setClassLoader(this.v.g().getClassLoader());
                    this.k.put(s.substring(7), bundle0);
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((Bundle)parcelable0).keySet()) {
            String s1 = (String)object1;
            if(s1.startsWith("fragment_")) {
                Bundle bundle1 = ((Bundle)parcelable0).getBundle(s1);
                if(bundle1 != null) {
                    bundle1.setClassLoader(this.v.g().getClassLoader());
                    arrayList0.add(((FragmentState)bundle1.getParcelable("state")));
                }
            }
        }
        this.c.x(arrayList0);
        FragmentManagerState fragmentManagerState0 = (FragmentManagerState)((Bundle)parcelable0).getParcelable("state");
        if(fragmentManagerState0 == null) {
            return;
        }
        this.c.v();
        for(Object object2: fragmentManagerState0.f) {
            FragmentState fragmentState0 = this.c.B(((String)object2), null);
            if(fragmentState0 != null) {
                Fragment fragment0 = this.P.j(fragmentState0.g);
                if(fragment0 == null) {
                    ClassLoader classLoader0 = this.v.g().getClassLoader();
                    l l0 = this.s0();
                    x0 = new x(this.n, this.c, classLoader0, l0, fragmentState0);
                }
                else {
                    if(FragmentManager.H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment0);
                    }
                    x0 = new x(this.n, this.c, fragment0, fragmentState0);
                }
                Fragment fragment1 = x0.k();
                fragment1.mFragmentManager = this;
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment1.mWho + "): " + fragment1);
                }
                x0.o(this.v.g().getClassLoader());
                this.c.r(x0);
                x0.t(this.u);
            }
        }
        for(Object object3: this.P.m()) {
            Fragment fragment2 = (Fragment)object3;
            if(!this.c.c(fragment2.mWho)) {
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment2 + " that was not found in the set of active Fragments " + fragmentManagerState0.f);
                }
                this.P.p(fragment2);
                fragment2.mFragmentManager = this;
                x x1 = new x(this.n, this.c, fragment2);
                x1.t(1);
                x1.m();
                fragment2.mRemoving = true;
                x1.m();
            }
        }
        this.c.w(fragmentManagerState0.g);
        if(fragmentManagerState0.h == null) {
            this.d = null;
        }
        else {
            this.d = new ArrayList(fragmentManagerState0.h.length);
            for(int v1 = 0; true; ++v1) {
                BackStackRecordState[] arr_backStackRecordState = fragmentManagerState0.h;
                if(v1 >= arr_backStackRecordState.length) {
                    break;
                }
                androidx.fragment.app.a a0 = arr_backStackRecordState[v1].b(this);
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + v1 + " (index " + a0.v + "): " + a0);
                    PrintWriter printWriter0 = new PrintWriter(new androidx.fragment.app.E("FragmentManager"));
                    a0.t("  ", printWriter0, false);
                    printWriter0.close();
                }
                this.d.add(a0);
            }
        }
        this.i.set(fragmentManagerState0.i);
        String s2 = fragmentManagerState0.j;
        if(s2 != null) {
            Fragment fragment3 = this.f0(s2);
            this.y = fragment3;
            this.M(fragment3);
        }
        ArrayList arrayList1 = fragmentManagerState0.k;
        if(arrayList1 != null) {
            for(int v = 0; v < arrayList1.size(); ++v) {
                String s3 = (String)arrayList1.get(v);
                BackStackState backStackState0 = (BackStackState)fragmentManagerState0.l.get(v);
                this.j.put(s3, backStackState0);
            }
        }
        this.G = new ArrayDeque(fragmentManagerState0.m);
    }

    int m() {
        return this.i.getAndIncrement();
    }

    private void m0() {
        for(Object object0: this.u()) {
            ((F)object0).k();
        }
    }

    static int m1(int v) {
        int v1 = 0x2002;
        int v2 = 0x1001;
        switch(v) {
            case 0x1001: {
                break;
            }
            case 0x2002: {
                return v2;
            }
            default: {
                v1 = 4100;
                v2 = 0x2005;
                if(v != 0x2005) {
                    switch(v) {
                        case 0x1003: {
                            return 0x1003;
                        }
                        case 4100: {
                            return v2;
                        }
                        default: {
                            return 0;
                        }
                    }
                }
            }
        }
        return v1;
    }

    void n(androidx.fragment.app.m m0, androidx.fragment.app.j j0, Fragment fragment0) {
        class androidx.fragment.app.FragmentManager.a implements androidx.activity.result.a {
            final FragmentManager a;

            @Override  // androidx.activity.result.a
            public void a(Object object0) {
                this.b(((Map)object0));
            }

            public void b(Map map0) {
                String[] arr_s = (String[])map0.keySet().toArray(new String[0]);
                ArrayList arrayList0 = new ArrayList(map0.values());
                int[] arr_v = new int[arrayList0.size()];
                for(int v = 0; v < arrayList0.size(); ++v) {
                    arr_v[v] = ((Boolean)arrayList0.get(v)).booleanValue() ? 0 : -1;
                }
                LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (LaunchedFragmentInfo)FragmentManager.this.G.pollFirst();
                if(fragmentManager$LaunchedFragmentInfo0 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String s = fragmentManager$LaunchedFragmentInfo0.f;
                int v1 = fragmentManager$LaunchedFragmentInfo0.g;
                Fragment fragment0 = FragmentManager.this.c.i(s);
                if(fragment0 == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + s);
                    return;
                }
                fragment0.onRequestPermissionsResult(v1, arr_s, arr_v);
            }
        }


        class g implements androidx.fragment.app.w {
            final Fragment f;
            final FragmentManager g;

            g(Fragment fragment0) {
                this.f = fragment0;
                super();
            }

            @Override  // androidx.fragment.app.w
            public void a(FragmentManager fragmentManager0, Fragment fragment0) {
            }
        }


        class androidx.fragment.app.FragmentManager.h implements androidx.activity.result.a {
            final FragmentManager a;

            @Override  // androidx.activity.result.a
            public void a(Object object0) {
                this.b(((ActivityResult)object0));
            }

            public void b(ActivityResult activityResult0) {
                LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (LaunchedFragmentInfo)FragmentManager.this.G.pollFirst();
                if(fragmentManager$LaunchedFragmentInfo0 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String s = fragmentManager$LaunchedFragmentInfo0.f;
                int v = fragmentManager$LaunchedFragmentInfo0.g;
                Fragment fragment0 = FragmentManager.this.c.i(s);
                if(fragment0 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + s);
                    return;
                }
                fragment0.onActivityResult(v, activityResult0.b(), activityResult0.a());
            }
        }


        class i implements androidx.activity.result.a {
            final FragmentManager a;

            @Override  // androidx.activity.result.a
            public void a(Object object0) {
                this.b(((ActivityResult)object0));
            }

            public void b(ActivityResult activityResult0) {
                LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (LaunchedFragmentInfo)FragmentManager.this.G.pollFirst();
                if(fragmentManager$LaunchedFragmentInfo0 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String s = fragmentManager$LaunchedFragmentInfo0.f;
                int v = fragmentManager$LaunchedFragmentInfo0.g;
                Fragment fragment0 = FragmentManager.this.c.i(s);
                if(fragment0 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + s);
                    return;
                }
                fragment0.onActivityResult(v, activityResult0.b(), activityResult0.a());
            }
        }

        if(this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = m0;
        this.w = j0;
        this.x = fragment0;
        if(fragment0 != null) {
            this.k(new g(this, fragment0));
        }
        else if(m0 instanceof androidx.fragment.app.w) {
            this.k(((androidx.fragment.app.w)m0));
        }
        if(this.x != null) {
            this.x1();
        }
        if(m0 instanceof androidx.activity.x) {
            androidx.activity.x x0 = (androidx.activity.x)m0;
            OnBackPressedDispatcher onBackPressedDispatcher0 = x0.f();
            this.g = onBackPressedDispatcher0;
            if(fragment0 != null) {
                x0 = fragment0;
            }
            onBackPressedDispatcher0.h(x0, this.h);
        }
        if(fragment0 != null) {
            this.P = fragment0.mFragmentManager.p0(fragment0);
        }
        else if(m0 instanceof M) {
            this.P = androidx.fragment.app.v.l(((M)m0).getViewModelStore());
        }
        else {
            this.P = new androidx.fragment.app.v(false);
        }
        this.P.q(this.O0());
        this.c.A(this.P);
        androidx.fragment.app.m m1 = this.v;
        if(m1 instanceof j0.d && fragment0 == null) {
            androidx.savedstate.a a0 = ((j0.d)m1).getSavedStateRegistry();
            a0.h("android:support:fragments", () -> this.n1());
            Bundle bundle0 = a0.b("android:support:fragments");
            if(bundle0 != null) {
                this.l1(bundle0);
            }
        }
        androidx.fragment.app.m m2 = this.v;
        if(m2 instanceof androidx.activity.result.c) {
            ActivityResultRegistry activityResultRegistry0 = ((androidx.activity.result.c)m2).D();
            String s = fragment0 == null ? "" : fragment0.mWho + ":";
            this.D = activityResultRegistry0.j("FragmentManager:" + s + "StartActivityForResult", new d.d(), new androidx.fragment.app.FragmentManager.h(this));
            this.E = activityResultRegistry0.j("FragmentManager:" + s + "StartIntentSenderForResult", new j(), new i(this));
            this.F = activityResultRegistry0.j("FragmentManager:" + s + "RequestPermissions", new d.b(), new androidx.fragment.app.FragmentManager.a(this));
        }
        androidx.fragment.app.m m3 = this.v;
        if(m3 instanceof androidx.core.content.b) {
            ((androidx.core.content.b)m3).t(this.p);
        }
        androidx.fragment.app.m m4 = this.v;
        if(m4 instanceof androidx.core.content.c) {
            ((androidx.core.content.c)m4).a0(this.q);
        }
        androidx.fragment.app.m m5 = this.v;
        if(m5 instanceof q) {
            ((q)m5).K(this.r);
        }
        androidx.fragment.app.m m6 = this.v;
        if(m6 instanceof r) {
            ((r)m6).B(this.s);
        }
        androidx.fragment.app.m m7 = this.v;
        if(m7 instanceof w && fragment0 == null) {
            ((w)m7).h0(this.t);
        }
    }

    private boolean n0(ArrayList arrayList0, ArrayList arrayList1) {
        boolean z;
        int v2;
        synchronized(this.a) {
            if(this.a.isEmpty()) {
                return false;
            }
            v2 = FIN.finallyOpen$NT();
            int v3 = this.a.size();
            z = false;
            for(int v = 0; v < v3; ++v) {
                z |= ((androidx.fragment.app.FragmentManager.l)this.a.get(v)).a(arrayList0, arrayList1);
            }
            FIN.finallyCodeBegin$NT(v2);
            this.a.clear();
            this.v.h().removeCallbacks(this.R);
        }
        FIN.finallyCodeEnd$NT(v2);
        return z;
    }

    Bundle n1() {
        BackStackRecordState[] arr_backStackRecordState;
        Bundle bundle0 = new Bundle();
        this.m0();
        this.Y();
        this.b0(true);
        this.I = true;
        this.P.q(true);
        ArrayList arrayList0 = this.c.y();
        ArrayList arrayList1 = this.c.m();
        if(!arrayList1.isEmpty()) {
            ArrayList arrayList2 = this.c.z();
            ArrayList arrayList3 = this.d;
            if(arrayList3 == null) {
                arr_backStackRecordState = null;
            }
            else {
                int v = arrayList3.size();
                if(v > 0) {
                    arr_backStackRecordState = new BackStackRecordState[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_backStackRecordState[v1] = new BackStackRecordState(((androidx.fragment.app.a)this.d.get(v1)));
                        if(FragmentManager.H0(2)) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + v1 + ": " + this.d.get(v1));
                        }
                    }
                }
                else {
                    arr_backStackRecordState = null;
                }
            }
            FragmentManagerState fragmentManagerState0 = new FragmentManagerState();
            fragmentManagerState0.f = arrayList0;
            fragmentManagerState0.g = arrayList2;
            fragmentManagerState0.h = arr_backStackRecordState;
            fragmentManagerState0.i = this.i.get();
            Fragment fragment0 = this.y;
            if(fragment0 != null) {
                fragmentManagerState0.j = fragment0.mWho;
            }
            fragmentManagerState0.k.addAll(this.j.keySet());
            fragmentManagerState0.l.addAll(this.j.values());
            fragmentManagerState0.m = new ArrayList(this.G);
            bundle0.putParcelable("state", fragmentManagerState0);
            for(Object object0: this.k.keySet()) {
                bundle0.putBundle("result_" + ((String)object0), ((Bundle)this.k.get(((String)object0))));
            }
            for(Object object1: arrayList1) {
                Bundle bundle1 = new Bundle();
                bundle1.putParcelable("state", ((FragmentState)object1));
                bundle0.putBundle("fragment_" + ((FragmentState)object1).g, bundle1);
            }
        }
        else if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle0;
        }
        return bundle0;
    }

    void o(Fragment fragment0) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "attach: " + fragment0);
        }
        if(fragment0.mDetached) {
            fragment0.mDetached = false;
            if(!fragment0.mAdded) {
                this.c.a(fragment0);
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment0);
                }
                if(this.I0(fragment0)) {
                    this.H = true;
                }
            }
        }
    }

    public int o0() {
        return this.d == null ? 0 : this.d.size();
    }

    void o1() {
        synchronized(this.a) {
            if(this.a.size() == 1) {
                this.v.h().removeCallbacks(this.R);
                this.v.h().post(this.R);
                this.x1();
            }
        }
    }

    public androidx.fragment.app.z p() {
        return new androidx.fragment.app.a(this);
    }

    private androidx.fragment.app.v p0(Fragment fragment0) {
        return this.P.k(fragment0);
    }

    void p1(Fragment fragment0, boolean z) {
        ViewGroup viewGroup0 = this.r0(fragment0);
        if(viewGroup0 != null && viewGroup0 instanceof FragmentContainerView) {
            ((FragmentContainerView)viewGroup0).setDrawDisappearingViewsLast(!z);
        }
    }

    boolean q() {
        boolean z = false;
        for(Object object0: this.c.l()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                z = this.I0(fragment0);
            }
            if(z) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    androidx.fragment.app.j q0() {
        return this.w;
    }

    void q1(Fragment fragment0, androidx.lifecycle.h.b h$b0) {
        if(!fragment0.equals(this.f0(fragment0.mWho)) || fragment0.mHost != null && fragment0.mFragmentManager != this) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " is not an active fragment of FragmentManager " + this);
        }
        fragment0.mMaxState = h$b0;
    }

    private void r() {
        if(this.O0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup r0(Fragment fragment0) {
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 != null) {
            return viewGroup0;
        }
        if(fragment0.mContainerId <= 0) {
            return null;
        }
        if(this.w.d()) {
            View view0 = this.w.c(fragment0.mContainerId);
            return view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        }
        return null;
    }

    void r1(Fragment fragment0) {
        if(fragment0 != null && (!fragment0.equals(this.f0(fragment0.mWho)) || fragment0.mHost != null && fragment0.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment1 = this.y;
        this.y = fragment0;
        this.M(fragment1);
        this.M(this.y);
    }

    private void s() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    public l s0() {
        l l0 = this.z;
        if(l0 != null) {
            return l0;
        }
        return this.x == null ? this.A : this.x.mFragmentManager.s0();
    }

    private void s1(Fragment fragment0) {
        ViewGroup viewGroup0 = this.r0(fragment0);
        if(viewGroup0 != null && fragment0.getEnterAnim() + fragment0.getExitAnim() + fragment0.getPopEnterAnim() + fragment0.getPopExitAnim() > 0) {
            if(viewGroup0.getTag(R.b.c) == null) {
                viewGroup0.setTag(0x7F090218, fragment0);  // id:visible_removing_fragment_view_tag
            }
            ((Fragment)viewGroup0.getTag(0x7F090218)).setPopDirection(fragment0.getPopDirection());  // id:visible_removing_fragment_view_tag
        }
    }

    private void t() {
        boolean z;
        androidx.fragment.app.m m0 = this.v;
        if(m0 instanceof M) {
            z = this.c.p().o();
        }
        else {
            z = m0.g() instanceof Activity ? !((Activity)this.v.g()).isChangingConfigurations() : true;
        }
        if(z) {
            for(Object object0: this.j.values()) {
                for(Object object1: ((BackStackState)object0).f) {
                    this.c.p().h(((String)object1));
                }
            }
        }
    }

    public List t0() {
        return this.c.o();
    }

    void t1(Fragment fragment0) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "show: " + fragment0);
        }
        if(fragment0.mHidden) {
            fragment0.mHidden = false;
            fragment0.mHiddenChanged = !fragment0.mHiddenChanged;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        Fragment fragment0 = this.x;
        if(fragment0 == null) {
            androidx.fragment.app.m m0 = this.v;
            if(m0 == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(m0.getClass().getSimpleName());
                stringBuilder0.append("{");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.v)));
                stringBuilder0.append("}");
            }
        }
        else {
            stringBuilder0.append(fragment0.getClass().getSimpleName());
            stringBuilder0.append("{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.x)));
            stringBuilder0.append("}");
        }
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }

    private Set u() {
        Set set0 = new HashSet();
        for(Object object0: this.c.k()) {
            ViewGroup viewGroup0 = ((x)object0).k().mContainer;
            if(viewGroup0 != null) {
                set0.add(F.o(viewGroup0, this.z0()));
            }
        }
        return set0;
    }

    public androidx.fragment.app.m u0() {
        return this.v;
    }

    private void u1() {
        for(Object object0: this.c.k()) {
            this.a1(((x)object0));
        }
    }

    private Set v(ArrayList arrayList0, int v, int v1) {
        Set set0 = new HashSet();
        while(v < v1) {
            for(Object object0: ((androidx.fragment.app.a)arrayList0.get(v)).c) {
                Fragment fragment0 = ((androidx.fragment.app.z.a)object0).b;
                if(fragment0 != null) {
                    ViewGroup viewGroup0 = fragment0.mContainer;
                    if(viewGroup0 != null) {
                        set0.add(F.n(viewGroup0, this));
                    }
                }
            }
            ++v;
        }
        return set0;
    }

    LayoutInflater.Factory2 v0() {
        return this.f;
    }

    private void v1(RuntimeException runtimeException0) {
        Log.e("FragmentManager", runtimeException0.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter0 = new PrintWriter(new androidx.fragment.app.E("FragmentManager"));
        androidx.fragment.app.m m0 = this.v;
        if(m0 == null) {
            try {
                this.X("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception1) {
                Log.e("FragmentManager", "Failed dumping state", exception1);
            }
        }
        else {
            try {
                m0.i("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception0) {
                Log.e("FragmentManager", "Failed dumping state", exception0);
            }
        }
        throw runtimeException0;
    }

    x w(Fragment fragment0) {
        x x0 = this.c.n(fragment0.mWho);
        if(x0 != null) {
            return x0;
        }
        x x1 = new x(this.n, this.c, fragment0);
        x1.o(this.v.g().getClassLoader());
        x1.t(this.u);
        return x1;
    }

    o w0() {
        return this.n;
    }

    public void w1(k fragmentManager$k0) {
        this.n.p(fragmentManager$k0);
    }

    void x(Fragment fragment0) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "detach: " + fragment0);
        }
        if(!fragment0.mDetached) {
            fragment0.mDetached = true;
            if(fragment0.mAdded) {
                if(FragmentManager.H0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment0);
                }
                this.c.u(fragment0);
                if(this.I0(fragment0)) {
                    this.H = true;
                }
                this.s1(fragment0);
            }
        }
    }

    Fragment x0() {
        return this.x;
    }

    private void x1() {
        boolean z = true;
        synchronized(this.a) {
            if(!this.a.isEmpty()) {
                this.h.j(true);
                return;
            }
        }
        v v1 = this.h;
        if(this.o0() <= 0 || !this.M0(this.x)) {
            z = false;
        }
        v1.j(z);
    }

    void y() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.T(4);
    }

    public Fragment y0() {
        return this.y;
    }

    void z() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.T(0);
    }

    G z0() {
        G g0 = this.B;
        if(g0 != null) {
            return g0;
        }
        return this.x == null ? this.C : this.x.mFragmentManager.z0();
    }
}

