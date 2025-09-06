package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.B;
import androidx.lifecycle.E;
import androidx.lifecycle.L;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.g;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import j0.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, M, g, n, d {
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState b(Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        final Bundle f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0, ClassLoader classLoader0) {
            Bundle bundle0 = parcel0.readBundle();
            this.f = bundle0;
            if(classLoader0 != null && bundle0 != null) {
                bundle0.setClassLoader(classLoader0);
            }
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeBundle(this.f);
        }
    }

    class b implements Runnable {
        final Fragment f;

        @Override
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class c extends m {
        final Fragment a;

        c() {
            super(null);
        }

        @Override  // androidx.fragment.app.Fragment$m
        void a() {
            Fragment.this.mSavedStateRegistryController.c();
            B.c(Fragment.this);
        }
    }

    static class j {
        View a;
        boolean b;
        int c;
        int d;
        int e;
        int f;
        int g;
        ArrayList h;
        ArrayList i;
        Object j;
        Object k;
        Object l;
        Object m;
        Object n;
        Object o;
        Boolean p;
        Boolean q;
        float r;
        View s;
        boolean t;

        j() {
            this.j = null;
            this.k = Fragment.USE_DEFAULT_TRANSITION;
            this.l = null;
            this.m = Fragment.USE_DEFAULT_TRANSITION;
            this.n = null;
            this.o = Fragment.USE_DEFAULT_TRANSITION;
            this.r = 1.0f;
            this.s = null;
        }
    }

    static abstract class k {
        static void a(View view0) {
            view0.cancelPendingInputEvents();
        }
    }

    public static class l extends RuntimeException {
        public l(String s, Exception exception0) {
            super(s, exception0);
        }
    }

    static abstract class m {
        private m() {
        }

        m(b fragment$b0) {
        }

        abstract void a();
    }

    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.I.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.m mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    o mLifecycleRegistry;
    androidx.lifecycle.h.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    j0.c mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    D mViewLifecycleOwner;
    s mViewLifecycleOwnerLiveData;
    String mWho;

    static {
        Fragment.USE_DEFAULT_TRANSITION = new Object();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = "520c1a5e-67e1-481c-917f-b9d8d3734af2";
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new u();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = () -> {
            class androidx.fragment.app.Fragment.d implements Runnable {
                final Fragment f;

                @Override
                public void run() {
                    Fragment.this.callStartTransitionListener(false);
                }
            }

            if(Fragment.this.mAnimationInfo != null && Fragment.this.e().t) {
                if(Fragment.this.mHost == null) {
                    Fragment.this.e().t = false;
                    return;
                }
                if(Looper.myLooper() != Fragment.this.mHost.h().getLooper()) {
                    Fragment.this.mHost.h().postAtFrontOfQueue(() -> {
                        class e implements Runnable {
                            final F f;
                            final Fragment g;

                            e(F f0) {
                                this.f = f0;
                                super();
                            }

                            @Override
                            public void run() {
                                this.f.g();
                            }
                        }

                        j fragment$j0 = Fragment.this.mAnimationInfo;
                        if(fragment$j0 != null) {
                            fragment$j0.t = false;
                        }
                        if(Fragment.this.mView != null) {
                            ViewGroup viewGroup0 = Fragment.this.mContainer;
                            if(viewGroup0 != null) {
                                FragmentManager fragmentManager0 = Fragment.this.mFragmentManager;
                                if(fragmentManager0 != null) {
                                    F f0 = F.n(viewGroup0, fragmentManager0);
                                    f0.p();
                                    if(false) {
                                        Fragment.this.mHost.h().post(new e(Fragment.this, f0));
                                        return;
                                    }
                                    f0.g();
                                }
                            }
                        }
                    });
                    return;
                }
                Fragment.this.callStartTransitionListener(true);
            }
        };
        this.mMaxState = androidx.lifecycle.h.b.j;
        this.mViewLifecycleOwnerLiveData = new s();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new c(this);
        this.i();
    }

    // 检测为 Lambda 实现
    void callStartTransitionListener(boolean z) [...]

    androidx.fragment.app.j createFragmentContainer() {
        class f extends androidx.fragment.app.j {
            final Fragment f;

            @Override  // androidx.fragment.app.j
            public View c(int v) {
                View view0 = Fragment.this.mView;
                if(view0 == null) {
                    throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
                }
                return view0.findViewById(v);
            }

            @Override  // androidx.fragment.app.j
            public boolean d() {
                return Fragment.this.mView != null;
            }
        }

        return new f(this);
    }

    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mFragmentId=#");
        printWriter0.print(Integer.toHexString(this.mFragmentId));
        printWriter0.print(" mContainerId=#");
        printWriter0.print(Integer.toHexString(this.mContainerId));
        printWriter0.print(" mTag=");
        printWriter0.println(this.mTag);
        printWriter0.print(s);
        printWriter0.print("mState=");
        printWriter0.print(this.mState);
        printWriter0.print(" mWho=");
        printWriter0.print(this.mWho);
        printWriter0.print(" mBackStackNesting=");
        printWriter0.println(this.mBackStackNesting);
        printWriter0.print(s);
        printWriter0.print("mAdded=");
        printWriter0.print(this.mAdded);
        printWriter0.print(" mRemoving=");
        printWriter0.print(this.mRemoving);
        printWriter0.print(" mFromLayout=");
        printWriter0.print(this.mFromLayout);
        printWriter0.print(" mInLayout=");
        printWriter0.println(this.mInLayout);
        printWriter0.print(s);
        printWriter0.print("mHidden=");
        printWriter0.print(this.mHidden);
        printWriter0.print(" mDetached=");
        printWriter0.print(this.mDetached);
        printWriter0.print(" mMenuVisible=");
        printWriter0.print(this.mMenuVisible);
        printWriter0.print(" mHasMenu=");
        printWriter0.println(this.mHasMenu);
        printWriter0.print(s);
        printWriter0.print("mRetainInstance=");
        printWriter0.print(this.mRetainInstance);
        printWriter0.print(" mUserVisibleHint=");
        printWriter0.println(this.mUserVisibleHint);
        if(this.mFragmentManager != null) {
            printWriter0.print(s);
            printWriter0.print("mFragmentManager=");
            printWriter0.println(this.mFragmentManager);
        }
        if(this.mHost != null) {
            printWriter0.print(s);
            printWriter0.print("mHost=");
            printWriter0.println(this.mHost);
        }
        if(this.mParentFragment != null) {
            printWriter0.print(s);
            printWriter0.print("mParentFragment=");
            printWriter0.println(this.mParentFragment);
        }
        if(this.mArguments != null) {
            printWriter0.print(s);
            printWriter0.print("mArguments=");
            printWriter0.println(this.mArguments);
        }
        if(this.mSavedFragmentState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedFragmentState=");
            printWriter0.println(this.mSavedFragmentState);
        }
        if(this.mSavedViewState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewState=");
            printWriter0.println(this.mSavedViewState);
        }
        if(this.mSavedViewRegistryState != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewRegistryState=");
            printWriter0.println(this.mSavedViewRegistryState);
        }
        Fragment fragment0 = this.h(false);
        if(fragment0 != null) {
            printWriter0.print(s);
            printWriter0.print("mTarget=");
            printWriter0.print(fragment0);
            printWriter0.print(" mTargetRequestCode=");
            printWriter0.println(this.mTargetRequestCode);
        }
        printWriter0.print(s);
        printWriter0.print("mPopDirection=");
        printWriter0.println(this.getPopDirection());
        if(this.getEnterAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getEnterAnim=");
            printWriter0.println(this.getEnterAnim());
        }
        if(this.getExitAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getExitAnim=");
            printWriter0.println(this.getExitAnim());
        }
        if(this.getPopEnterAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopEnterAnim=");
            printWriter0.println(this.getPopEnterAnim());
        }
        if(this.getPopExitAnim() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopExitAnim=");
            printWriter0.println(this.getPopExitAnim());
        }
        if(this.mContainer != null) {
            printWriter0.print(s);
            printWriter0.print("mContainer=");
            printWriter0.println(this.mContainer);
        }
        if(this.mView != null) {
            printWriter0.print(s);
            printWriter0.print("mView=");
            printWriter0.println(this.mView);
        }
        if(this.getAnimatingAway() != null) {
            printWriter0.print(s);
            printWriter0.print("mAnimatingAway=");
            printWriter0.println(this.getAnimatingAway());
        }
        if(this.getContext() != null) {
            androidx.loader.app.a.b(this).a(s, fileDescriptor0, printWriter0, arr_s);
        }
        printWriter0.print(s);
        printWriter0.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.X(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    private j e() {
        if(this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    @Override
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    // 去混淆评级： 低(20)
    Fragment findFragmentByWho(String s) {
        return s.equals(this.mWho) ? this : this.mChildFragmentManager.j0(s);
    }

    private int g() {
        return this.mMaxState == androidx.lifecycle.h.b.g || this.mParentFragment == null ? this.mMaxState.ordinal() : Math.min(this.mMaxState.ordinal(), this.mParentFragment.g());
    }

    String generateActivityResultKey() [...] // 潜在的解密器

    public final h getActivity() {
        return this.mHost == null ? null : ((h)this.mHost.e());
    }

    public boolean getAllowEnterTransitionOverlap() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 != null) {
            return fragment$j0.q == null ? true : fragment$j0.q.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 != null) {
            return fragment$j0.p == null ? true : fragment$j0.p.booleanValue();
        }
        return true;
    }

    View getAnimatingAway() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
        }
        return this.mChildFragmentManager;
    }

    public Context getContext() {
        return this.mHost == null ? null : this.mHost.g();
    }

    @Override  // androidx.lifecycle.g
    public W.a getDefaultViewModelCreationExtras() {
        Application application0;
        for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof Application) {
                application0 = (Application)context0;
                break;
            }
        }
        if(application0 == null && FragmentManager.H0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        W.a a0 = new W.d();
        if(application0 != null) {
            ((W.d)a0).c(androidx.lifecycle.I.a.g, application0);
        }
        ((W.d)a0).c(B.a, this);
        ((W.d)a0).c(B.b, this);
        if(this.getArguments() != null) {
            ((W.d)a0).c(B.c, this.getArguments());
        }
        return a0;
    }

    public androidx.lifecycle.I.b getDefaultViewModelProviderFactory() {
        Application application0;
        if(this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.mDefaultFactory == null) {
            for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if(context0 instanceof Application) {
                    application0 = (Application)context0;
                    break;
                }
            }
            if(application0 == null && FragmentManager.H0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new E(application0, this, this.getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.c;
    }

    public Object getEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.j;
    }

    androidx.core.app.u getEnterTransitionCallback() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 == null) {
            return null;
        }
        fragment$j0.getClass();
        return null;
    }

    int getExitAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.d;
    }

    public Object getExitTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.l;
    }

    androidx.core.app.u getExitTransitionCallback() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 == null) {
            return null;
        }
        fragment$j0.getClass();
        return null;
    }

    View getFocusedView() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.s;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        return this.mHost == null ? null : this.mHost.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.mLayoutInflater == null ? this.performGetLayoutInflater(null) : this.mLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle0) {
        androidx.fragment.app.m m0 = this.mHost;
        if(m0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflater0 = m0.l();
        androidx.core.view.u.a(layoutInflater0, this.mChildFragmentManager.v0());
        return layoutInflater0;
    }

    @Override  // androidx.lifecycle.n
    public androidx.lifecycle.h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 == null) {
            throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
        }
        return fragmentManager0;
    }

    boolean getPopDirection() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.b;
    }

    int getPopEnterAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.e;
    }

    int getPopExitAnim() {
        return this.mAnimationInfo == null ? 0 : this.mAnimationInfo.f;
    }

    float getPostOnViewCreatedAlpha() {
        return this.mAnimationInfo == null ? 1.0f : this.mAnimationInfo.r;
    }

    public Object getReenterTransition() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 == null) {
            return null;
        }
        return fragment$j0.m == Fragment.USE_DEFAULT_TRANSITION ? this.getExitTransition() : fragment$j0.m;
    }

    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        S.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 == null) {
            return null;
        }
        return fragment$j0.k == Fragment.USE_DEFAULT_TRANSITION ? this.getEnterTransition() : fragment$j0.k;
    }

    @Override  // j0.d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        return this.mAnimationInfo == null ? null : this.mAnimationInfo.n;
    }

    public Object getSharedElementReturnTransition() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 == null) {
            return null;
        }
        return fragment$j0.o == Fragment.USE_DEFAULT_TRANSITION ? this.getSharedElementEnterTransition() : fragment$j0.o;
    }

    ArrayList getSharedElementSourceNames() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 != null) {
            ArrayList arrayList0 = fragment$j0.h;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    ArrayList getSharedElementTargetNames() {
        j fragment$j0 = this.mAnimationInfo;
        if(fragment$j0 != null) {
            ArrayList arrayList0 = fragment$j0.i;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    public final String getString(int v) {
        return this.getResources().getString(v);
    }

    public final String getString(int v, Object[] arr_object) {
        return this.getResources().getString(v, arr_object);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return this.h(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        S.c.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int v) {
        return this.getResources().getText(v);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public n getViewLifecycleOwner() {
        n n0 = this.mViewLifecycleOwner;
        if(n0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        return n0;
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override  // androidx.lifecycle.M
    public L getViewModelStore() {
        if(this.mFragmentManager == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.g() == androidx.lifecycle.h.b.g.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        return this.mFragmentManager.C0(this);
    }

    private Fragment h(boolean z) {
        if(z) {
            S.c.j(this);
        }
        Fragment fragment0 = this.mTarget;
        if(fragment0 != null) {
            return fragment0;
        }
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 != null) {
            return this.mTargetWho == null ? null : fragmentManager0.f0(this.mTargetWho);
        }
        return null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    private void i() {
        this.mLifecycleRegistry = new o(this);
        this.mSavedStateRegistryController = j0.c.a(this);
        this.mDefaultFactory = null;
        if(!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            this.k(this.mSavedStateAttachListener);
        }
    }

    void initState() {
        this.i();
        this.mPreviousWho = this.mWho;
        this.mWho = "b51e53e7-cea7-48e7-ad39-856410a471bb";
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new u();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    @Deprecated
    public static Fragment instantiate(Context context0, String s) {
        return Fragment.instantiate(context0, s, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context0, String s, Bundle bundle0) {
        try {
            Fragment fragment0 = (Fragment)androidx.fragment.app.l.d(context0.getClassLoader(), s).getConstructor(null).newInstance(null);
            if(bundle0 != null) {
                bundle0.setClassLoader(fragment0.getClass().getClassLoader());
                fragment0.setArguments(bundle0);
                return fragment0;
            }
            return fragment0;
        }
        catch(InstantiationException instantiationException0) {
            throw new l("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new l("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new l("Unable to instantiate fragment " + s + ": could not find Fragment constructor", noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new l("Unable to instantiate fragment " + s + ": calling Fragment constructor caused an exception", invocationTargetException0);
        }
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    // 去混淆评级： 低(30)
    public final boolean isHidden() {
        return this.mHidden || this.mFragmentManager != null && this.mFragmentManager.K0(this.mParentFragment);
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    // 去混淆评级： 低(30)
    public final boolean isMenuVisible() {
        return this.mMenuVisible && (this.mFragmentManager == null || this.mFragmentManager.L0(this.mParentFragment));
    }

    boolean isPostponed() {
        return this.mAnimationInfo == null ? false : this.mAnimationInfo.t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        return this.mFragmentManager == null ? false : this.mFragmentManager.O0();
    }

    // 去混淆评级： 低(20)
    public final boolean isVisible() {
        return this.isAdded() && !this.isHidden() && (this.mView != null && this.mView.getWindowToken() != null && this.mView.getVisibility() == 0);
    }

    private androidx.activity.result.b j(d.a a0, m.a a1, androidx.activity.result.a a2) {
        class androidx.fragment.app.Fragment.a extends androidx.activity.result.b {
            final AtomicReference a;
            final d.a b;
            final Fragment c;

            androidx.fragment.app.Fragment.a(AtomicReference atomicReference0, d.a a0) {
                this.a = atomicReference0;
                this.b = a0;
                super();
            }

            @Override  // androidx.activity.result.b
            public void b(Object object0, androidx.core.app.c c0) {
                androidx.activity.result.b b0 = (androidx.activity.result.b)this.a.get();
                if(b0 == null) {
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
                b0.b(object0, c0);
            }

            @Override  // androidx.activity.result.b
            public void c() {
                androidx.activity.result.b b0 = (androidx.activity.result.b)this.a.getAndSet(null);
                if(b0 != null) {
                    b0.c();
                }
            }
        }


        class i extends m {
            final m.a a;
            final AtomicReference b;
            final d.a c;
            final androidx.activity.result.a d;
            final Fragment e;

            i(m.a a0, AtomicReference atomicReference0, d.a a1, androidx.activity.result.a a2) {
                this.a = a0;
                this.b = atomicReference0;
                this.c = a1;
                this.d = a2;
                super(null);
            }

            @Override  // androidx.fragment.app.Fragment$m
            void a() {
                androidx.activity.result.b b0 = ((ActivityResultRegistry)this.a.apply(null)).i("fragment_4634c923-8ece-448f-a24d-3454f10c067f_rq#0", Fragment.this, this.c, this.d);
                this.b.set(b0);
            }
        }

        if(this.mState > 1) {
            throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.k(new i(this, a1, atomicReference0, a0, a2));
        return new androidx.fragment.app.Fragment.a(this, atomicReference0, a0);
    }

    private void k(m fragment$m0) {
        if(this.mState >= 0) {
            fragment$m0.a();
            return;
        }
        this.mOnPreAttachedListeners.add(fragment$m0);
    }

    private void l() {
        if(FragmentManager.H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if(this.mView != null) {
            this.restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.Y0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle0) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int v, int v1, Intent intent0) {
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + v + " resultCode: " + v1 + " data: " + intent0);
        }
    }

    @Deprecated
    public void onAttach(Activity activity0) {
        this.mCalled = true;
    }

    public void onAttach(Context context0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.e();
        if(activity0 != null) {
            this.mCalled = false;
            this.onAttach(activity0);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem0) [...] // Inlined contents

    public void onCreate(Bundle bundle0) {
        this.mCalled = true;
        this.restoreChildFragmentState(bundle0);
        if(!this.mChildFragmentManager.N0(1)) {
            this.mChildFragmentManager.C();
        }
    }

    public Animation onCreateAnimation(int v, boolean z, int v1) [...] // Inlined contents

    public Animator onCreateAnimator(int v, boolean z, int v1) [...] // Inlined contents

    @Override  // android.view.View$OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.requireActivity().onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
    }

    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return this.mContentLayoutId == 0 ? null : layoutInflater0.inflate(this.mContentLayoutId, viewGroup0, false);
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        return this.getLayoutInflater(bundle0);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity0, AttributeSet attributeSet0, Bundle bundle0) {
        this.mCalled = true;
    }

    public void onInflate(Context context0, AttributeSet attributeSet0, Bundle bundle0) {
        this.mCalled = true;
        Activity activity0 = this.mHost == null ? null : this.mHost.e();
        if(activity0 != null) {
            this.mCalled = false;
            this.onInflate(activity0, attributeSet0, bundle0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem0) [...] // Inlined contents

    @Deprecated
    public void onOptionsMenuClosed(Menu menu0) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu0) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle0) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view0, Bundle bundle0) {
    }

    public void onViewStateRestored(Bundle bundle0) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle0) {
        this.mChildFragmentManager.Y0();
        this.mState = 3;
        this.mCalled = false;
        this.onActivityCreated(bundle0);
        throw new H("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    void performAttach() {
        for(Object object0: this.mOnPreAttachedListeners) {
            ((m)object0).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.n(this.mHost, this.createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        this.onAttach(this.mHost.g());
        if(!this.mCalled) {
            throw new H("Fragment " + this + " did not call through to super.onAttach()");
        }
        this.mFragmentManager.I(this);
        this.mChildFragmentManager.z();
    }

    void performConfigurationChanged(Configuration configuration0) {
        this.onConfigurationChanged(configuration0);
    }

    boolean performContextItemSelected(MenuItem menuItem0) {
        return this.mHidden ? false : this.mChildFragmentManager.B(menuItem0);
    }

    void performCreate(Bundle bundle0) {
        this.mChildFragmentManager.Y0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.l() {
            final Fragment f;

            @Override  // androidx.lifecycle.l
            public void c(n n0, androidx.lifecycle.h.a h$a0) {
                if(h$a0 == androidx.lifecycle.h.a.ON_STOP) {
                    View view0 = Fragment.this.mView;
                    if(view0 != null) {
                        k.a(view0);
                    }
                }
            }
        });
        this.mSavedStateRegistryController.d(bundle0);
        this.onCreate(bundle0);
        this.mIsCreated = true;
        throw new H("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            return z | this.mChildFragmentManager.D(menu0, menuInflater0);
        }
        return false;
    }

    void performCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.mChildFragmentManager.Y0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new D(this, this.getViewModelStore());
        View view0 = this.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.mView = view0;
        if(view0 != null) {
            this.mViewLifecycleOwner.b();
            N.a(this.mView, this.mViewLifecycleOwner);
            O.a(this.mView, this.mViewLifecycleOwner);
            j0.e.a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
            return;
        }
        if(this.mViewLifecycleOwner.c()) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    void performDestroy() {
        this.mChildFragmentManager.E();
        this.mLifecycleRegistry.h(androidx.lifecycle.h.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        throw new H("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.F();
        if(this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().f(androidx.lifecycle.h.b.h)) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.h.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if(!this.mCalled) {
            throw new H("Fragment " + this + " did not call through to super.onDestroyView()");
        }
        androidx.loader.app.a.b(this).c();
        this.mPerformedCreateView = false;
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        this.onDetach();
        this.mLayoutInflater = null;
        throw new H("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = this.onGetLayoutInflater(bundle0);
        this.mLayoutInflater = layoutInflater0;
        return layoutInflater0;
    }

    void performLowMemory() {
        this.onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z) {
    }

    boolean performOptionsItemSelected(MenuItem menuItem0) {
        return this.mHidden ? false : this.mChildFragmentManager.K(menuItem0);
    }

    void performOptionsMenuClosed(Menu menu0) {
        if(!this.mHidden) {
            this.mChildFragmentManager.L(menu0);
        }
    }

    void performPause() {
        this.mChildFragmentManager.N();
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.h.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.h(androidx.lifecycle.h.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        this.onPause();
        if(!this.mCalled) {
            throw new H("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void performPictureInPictureModeChanged(boolean z) {
    }

    boolean performPrepareOptionsMenu(Menu menu0) {
        boolean z = false;
        if(!this.mHidden) {
            if(this.mHasMenu && this.mMenuVisible) {
                z = true;
            }
            return z | this.mChildFragmentManager.P(menu0);
        }
        return false;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean z = this.mFragmentManager.M0(this);
        if(this.mIsPrimaryNavigationFragment == null || this.mIsPrimaryNavigationFragment.booleanValue() != z) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(z);
            this.mChildFragmentManager.Q();
        }
    }

    void performResume() {
        this.mChildFragmentManager.Y0();
        this.mChildFragmentManager.b0(true);
        this.mState = 7;
        this.mCalled = false;
        this.onResume();
        throw new H("Fragment " + this + " did not call through to super.onResume()");
    }

    void performSaveInstanceState(Bundle bundle0) {
        this.onSaveInstanceState(bundle0);
        this.mSavedStateRegistryController.e(bundle0);
        Bundle bundle1 = this.mChildFragmentManager.n1();
        if(bundle1 != null) {
            bundle0.putParcelable("android:support:fragments", bundle1);
        }
    }

    void performStart() {
        this.mChildFragmentManager.Y0();
        this.mChildFragmentManager.b0(true);
        this.mState = 5;
        this.mCalled = false;
        this.onStart();
        throw new H("Fragment " + this + " did not call through to super.onStart()");
    }

    void performStop() {
        this.mChildFragmentManager.U();
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.h.a.ON_STOP);
        }
        this.mLifecycleRegistry.h(androidx.lifecycle.h.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        this.onStop();
        if(!this.mCalled) {
            throw new H("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void performViewCreated() {
        this.onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.V();
    }

    public void postponeEnterTransition() {
        this.e().t = true;
    }

    public final void postponeEnterTransition(long v, TimeUnit timeUnit0) {
        this.e().t = true;
        FragmentManager fragmentManager0 = this.mFragmentManager;
        Handler handler0 = fragmentManager0 == null ? new Handler(Looper.getMainLooper()) : fragmentManager0.u0().h();
        handler0.removeCallbacks(this.mPostponedDurationRunnable);
        handler0.postDelayed(this.mPostponedDurationRunnable, timeUnit0.toMillis(v));
    }

    public final androidx.activity.result.b registerForActivityResult(d.a a0, ActivityResultRegistry activityResultRegistry0, androidx.activity.result.a a1) {
        class androidx.fragment.app.Fragment.h implements m.a {
            final ActivityResultRegistry a;
            final Fragment b;

            androidx.fragment.app.Fragment.h(ActivityResultRegistry activityResultRegistry0) {
                this.a = activityResultRegistry0;
                super();
            }

            public ActivityResultRegistry a(Void void0) {
                return this.a;
            }

            @Override  // m.a
            public Object apply(Object object0) {
                return this.a(((Void)object0));
            }
        }

        return this.j(a0, new androidx.fragment.app.Fragment.h(this, activityResultRegistry0), a1);
    }

    public final androidx.activity.result.b registerForActivityResult(d.a a0, androidx.activity.result.a a1) {
        class androidx.fragment.app.Fragment.g implements m.a {
            final Fragment a;

            public ActivityResultRegistry a(Void void0) {
                androidx.fragment.app.m m0 = Fragment.this.mHost;
                return m0 instanceof androidx.activity.result.c ? ((androidx.activity.result.c)m0).D() : Fragment.this.requireActivity().D();
            }

            @Override  // m.a
            public Object apply(Object object0) {
                return this.a(((Void)object0));
            }
        }

        return this.j(a0, new androidx.fragment.app.Fragment.g(this), a1);
    }

    public void registerForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] arr_s, int v) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.getParentFragmentManager().U0(this, arr_s, v);
    }

    public final h requireActivity() {
        h h0 = this.getActivity();
        if(h0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
        }
        return h0;
    }

    public final Bundle requireArguments() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        return bundle0;
    }

    public final Context requireContext() {
        Context context0 = this.getContext();
        if(context0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a context.");
        }
        return context0;
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return this.getParentFragmentManager();
    }

    public final Object requireHost() {
        Object object0 = this.getHost();
        if(object0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to a host.");
        }
        return object0;
    }

    public final Fragment requireParentFragment() {
        Fragment fragment0 = this.getParentFragment();
        if(fragment0 == null) {
            throw this.getContext() == null ? new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host") : new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + this.getContext());
        }
        return fragment0;
    }

    public final View requireView() {
        View view0 = this.getView();
        if(view0 == null) {
            throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
        return view0;
    }

    void restoreChildFragmentState(Bundle bundle0) {
        if(bundle0 != null) {
            Parcelable parcelable0 = bundle0.getParcelable("android:support:fragments");
            if(parcelable0 != null) {
                this.mChildFragmentManager.l1(parcelable0);
                this.mChildFragmentManager.C();
            }
        }
    }

    final void restoreViewState(Bundle bundle0) {
        SparseArray sparseArray0 = this.mSavedViewState;
        if(sparseArray0 != null) {
            this.mView.restoreHierarchyState(sparseArray0);
            this.mSavedViewState = null;
        }
        if(this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        this.onViewStateRestored(bundle0);
        if(!this.mCalled) {
            throw new H("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
        if(this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.h.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.e().q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.e().p = Boolean.valueOf(z);
    }

    void setAnimations(int v, int v1, int v2, int v3) {
        if(this.mAnimationInfo == null && v == 0 && v1 == 0 && v2 == 0 && v3 == 0) {
            return;
        }
        this.e().c = v;
        this.e().d = v1;
        this.e().e = v2;
        this.e().f = v3;
    }

    public void setArguments(Bundle bundle0) {
        if(this.mFragmentManager != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle0;
    }

    public void setEnterSharedElementCallback(androidx.core.app.u u0) {
        this.e().getClass();
    }

    public void setEnterTransition(Object object0) {
        this.e().j = object0;
    }

    public void setExitSharedElementCallback(androidx.core.app.u u0) {
        this.e().getClass();
    }

    public void setExitTransition(Object object0) {
        this.e().l = object0;
    }

    void setFocusedView(View view0) {
        this.e().s = view0;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if(this.mHasMenu != z) {
            this.mHasMenu = z;
            if(this.isAdded() && !this.isHidden()) {
                this.mHost.r();
            }
        }
    }

    public void setInitialSavedState(SavedState fragment$SavedState0) {
        Bundle bundle0;
        if(this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if(fragment$SavedState0 == null) {
            bundle0 = null;
        }
        else {
            bundle0 = fragment$SavedState0.f;
            if(bundle0 == null) {
                bundle0 = null;
            }
        }
        this.mSavedFragmentState = bundle0;
    }

    public void setMenuVisibility(boolean z) {
        if(this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if(this.mHasMenu && this.isAdded() && !this.isHidden()) {
                this.mHost.r();
            }
        }
    }

    void setNextTransition(int v) {
        if(this.mAnimationInfo == null && v == 0) {
            return;
        }
        this.e();
        this.mAnimationInfo.g = v;
    }

    void setPopDirection(boolean z) {
        if(this.mAnimationInfo == null) {
            return;
        }
        this.e().b = z;
    }

    void setPostOnViewCreatedAlpha(float f) {
        this.e().r = f;
    }

    public void setReenterTransition(Object object0) {
        this.e().m = object0;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        S.c.k(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager0 = this.mFragmentManager;
        if(fragmentManager0 != null) {
            if(z) {
                fragmentManager0.l(this);
                return;
            }
            fragmentManager0.j1(this);
            return;
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object object0) {
        this.e().k = object0;
    }

    public void setSharedElementEnterTransition(Object object0) {
        this.e().n = object0;
    }

    void setSharedElementNames(ArrayList arrayList0, ArrayList arrayList1) {
        this.e();
        this.mAnimationInfo.h = arrayList0;
        this.mAnimationInfo.i = arrayList1;
    }

    public void setSharedElementReturnTransition(Object object0) {
        this.e().o = object0;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment0, int v) {
        if(fragment0 != null) {
            S.c.l(this, fragment0, v);
        }
        FragmentManager fragmentManager0 = fragment0 == null ? null : fragment0.mFragmentManager;
        if(this.mFragmentManager != null && fragmentManager0 != null && this.mFragmentManager != fragmentManager0) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " must share the same FragmentManager to be set as a target fragment");
        }
        for(Fragment fragment1 = fragment0; fragment1 != null; fragment1 = fragment1.h(false)) {
            if(fragment1.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment0 + " as the target of " + this + " would create a target cycle");
            }
        }
        if(fragment0 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        }
        else if(this.mFragmentManager == null || fragment0.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment0;
        }
        else {
            this.mTargetWho = fragment0.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = v;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        S.c.m(this, z);
        if(!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && this.isAdded() && this.mIsCreated) {
            this.mFragmentManager.a1(this.mFragmentManager.w(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if(this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String s) {
        return this.mHost == null ? false : this.mHost.o(s);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent0) {
        this.startActivity(intent0, null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent0, Bundle bundle0) {
        androidx.fragment.app.m m0 = this.mHost;
        if(m0 == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        m0.p(this, intent0, -1, bundle0);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent0, int v) {
        this.startActivityForResult(intent0, v, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent0, int v, Bundle bundle0) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.getParentFragmentManager().V0(this, intent0, v, bundle0);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        if(this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if(FragmentManager.H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + v + " IntentSender: " + intentSender0 + " fillInIntent: " + intent0 + " options: " + bundle0);
        }
        this.getParentFragmentManager().W0(this, intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    // 检测为 Lambda 实现
    public void startPostponedEnterTransition() [...]

    @Override
    public String toString() [...] // 潜在的解密器

    public void unregisterForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(null);
    }
}

