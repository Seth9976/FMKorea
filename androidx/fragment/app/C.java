package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.k;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.n;
import androidx.lifecycle.t;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    class a implements Runnable {
        final c f;

        @Override
        public void run() {
            c.this.mOnDismissListener.onDismiss(c.this.mDialog);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        final c f;

        @Override  // android.content.DialogInterface$OnCancelListener
        public void onCancel(DialogInterface dialogInterface0) {
            if(c.this.mDialog != null) {
                c.this.onCancel(c.this.mDialog);
            }
        }
    }

    class androidx.fragment.app.c.c implements DialogInterface.OnDismissListener {
        final c f;

        @Override  // android.content.DialogInterface$OnDismissListener
        public void onDismiss(DialogInterface dialogInterface0) {
            if(c.this.mDialog != null) {
                c.this.onDismiss(c.this.mDialog);
            }
        }
    }

    class d implements t {
        final c a;

        @Override  // androidx.lifecycle.t
        public void a(Object object0) {
            this.b(((n)object0));
        }

        public void b(n n0) {
            if(n0 != null && c.this.mShowsDialog) {
                View view0 = c.this.requireView();
                if(view0.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if(c.this.mDialog != null) {
                    if(FragmentManager.H0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + c.this.mDialog);
                    }
                    c.this.mDialog.setContentView(view0);
                }
            }
        }
    }

    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private t mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public c() {
        this.mDismissRunnable = new a(this);
        this.mOnCancelListener = new b(this);
        this.mOnDismissListener = new androidx.fragment.app.c.c(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new d(this);
        this.mDialogCreated = false;
    }

    @Override  // androidx.fragment.app.Fragment
    j createFragmentContainer() {
        class e extends j {
            final j f;
            final c g;

            e(j j0) {
                this.f = j0;
                super();
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.fragment.app.j
            public View c(int v) {
                return this.f.d() ? this.f.c(v) : c.this.onFindViewById(v);
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.fragment.app.j
            public boolean d() {
                return this.f.d() || c.this.onHasView();
            }
        }

        return new e(this, super.createFragmentContainer());
    }

    public void dismiss() {
        this.m(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        this.m(true, false, false);
    }

    public void dismissNow() {
        this.m(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    private void m(boolean z, boolean z1, boolean z2) {
        if(this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            dialog0.setOnDismissListener(null);
            this.mDialog.dismiss();
            if(!z1) {
                if(Looper.myLooper() == this.mHandler.getLooper()) {
                    this.onDismiss(this.mDialog);
                }
                else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if(this.mBackStackId >= 0) {
            if(z2) {
                this.getParentFragmentManager().d1(this.mBackStackId, 1);
            }
            else {
                this.getParentFragmentManager().b1(this.mBackStackId, 1, z);
            }
            this.mBackStackId = -1;
            return;
        }
        z z3 = this.getParentFragmentManager().p();
        z3.p(true);
        z3.m(this);
        if(z2) {
            z3.i();
            return;
        }
        if(z) {
            z3.h();
            return;
        }
        z3.g();
    }

    private void n(Bundle bundle0) {
        if(!this.mShowsDialog) {
            return;
        }
        if(!this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialog0 = this.onCreateDialog(bundle0);
                this.mDialog = dialog0;
                if(this.mShowsDialog) {
                    this.setupDialog(dialog0, this.mStyle);
                    Context context0 = this.getContext();
                    if(context0 instanceof Activity) {
                        this.mDialog.setOwnerActivity(((Activity)context0));
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                }
                else {
                    this.mDialog = null;
                }
            }
            finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onAttach(Context context0) {
        super.onAttach(context0);
        this.getViewLifecycleOwnerLiveData().e(this.mObserver);
        if(!this.mShownByMe) {
            this.mDismissed = false;
        }
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public void onCancel(DialogInterface dialogInterface0) {
    }

    @Override  // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if(bundle0 != null) {
            this.mStyle = bundle0.getInt("android:style", 0);
            this.mTheme = bundle0.getInt("android:theme", 0);
            this.mCancelable = bundle0.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle0.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle0.getInt("android:backStackId", -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle0) {
        if(FragmentManager.H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new k(this.requireContext(), this.getTheme());
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            this.mViewDestroyed = true;
            dialog0.setOnDismissListener(null);
            this.mDialog.dismiss();
            if(!this.mDismissed) {
                this.onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if(!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        this.getViewLifecycleOwnerLiveData().i(this.mObserver);
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface0) {
        if(!this.mViewDestroyed) {
            if(FragmentManager.H0(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            this.m(true, true, false);
        }
    }

    View onFindViewById(int v) {
        return this.mDialog == null ? null : this.mDialog.findViewById(v);
    }

    @Override  // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        LayoutInflater layoutInflater0 = super.onGetLayoutInflater(bundle0);
        if(this.mShowsDialog && !this.mCreatingDialog) {
            this.n(bundle0);
            if(FragmentManager.H0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            return this.mDialog == null ? layoutInflater0 : layoutInflater0.cloneInContext(this.mDialog.getContext());
        }
        if(FragmentManager.H0(2)) {
            if(!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + ("getting layout inflater for DialogFragment " + this));
                return layoutInflater0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + ("getting layout inflater for DialogFragment " + this));
        }
        return layoutInflater0;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            Bundle bundle1 = dialog0.onSaveInstanceState();
            bundle1.putBoolean("android:dialogShowing", false);
            bundle0.putBundle("android:savedDialogState", bundle1);
        }
        int v = this.mStyle;
        if(v != 0) {
            bundle0.putInt("android:style", v);
        }
        int v1 = this.mTheme;
        if(v1 != 0) {
            bundle0.putInt("android:theme", v1);
        }
        if(!this.mCancelable) {
            bundle0.putBoolean("android:cancelable", false);
        }
        if(!this.mShowsDialog) {
            bundle0.putBoolean("android:showsDialog", false);
        }
        int v2 = this.mBackStackId;
        if(v2 != -1) {
            bundle0.putInt("android:backStackId", v2);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            this.mViewDestroyed = false;
            dialog0.show();
            View view0 = this.mDialog.getWindow().getDecorView();
            N.a(view0, this);
            O.a(view0, this);
            j0.e.a(view0, this);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            dialog0.hide();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(this.mDialog != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.mDialog.onRestoreInstanceState(bundle1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    void performCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        super.performCreateView(layoutInflater0, viewGroup0, bundle0);
        if(this.mView == null && this.mDialog != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("android:savedDialogState");
            if(bundle1 != null) {
                this.mDialog.onRestoreInstanceState(bundle1);
            }
        }
    }

    public final Dialog requireDialog() {
        Dialog dialog0 = this.getDialog();
        if(dialog0 == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        return dialog0;
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog0 = this.mDialog;
        if(dialog0 != null) {
            dialog0.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int v, int v1) {
        if(FragmentManager.H0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + v + ", " + v1);
        }
        this.mStyle = v;
        if(v == 2 || v == 3) {
            this.mTheme = 0x1030059;
        }
        if(v1 != 0) {
            this.mTheme = v1;
        }
    }

    public void setupDialog(Dialog dialog0, int v) {
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                Window window0 = dialog0.getWindow();
                if(window0 != null) {
                    window0.addFlags(24);
                }
                break;
            }
            default: {
                return;
            }
        }
        dialog0.requestWindowFeature(1);
    }

    public int show(z z0, String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        z0.d(this, s);
        this.mViewDestroyed = false;
        int v = z0.g();
        this.mBackStackId = v;
        return v;
    }

    public void show(FragmentManager fragmentManager0, String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        z z0 = fragmentManager0.p();
        z0.p(true);
        z0.d(this, s);
        z0.g();
    }

    public void showNow(FragmentManager fragmentManager0, String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        z z0 = fragmentManager0.p();
        z0.p(true);
        z0.d(this, s);
        z0.i();
    }
}

