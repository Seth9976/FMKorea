package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import e.j;

public class AppCompatSpinner extends Spinner {
    static class SavedState extends View.BaseSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
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
        boolean f;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.f = parcel0.readByte() != 0;
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeByte(((byte)this.f));
        }
    }

    static abstract class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter0, Resources.Theme resources$Theme0) {
            if(!B.c.a(themedSpinnerAdapter0.getDropDownViewTheme(), resources$Theme0)) {
                themedSpinnerAdapter0.setDropDownViewTheme(resources$Theme0);
            }
        }
    }

    class d implements DialogInterface.OnClickListener, g {
        androidx.appcompat.app.c f;
        private ListAdapter g;
        private CharSequence h;
        final AppCompatSpinner i;

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public boolean a() {
            return this.f == null ? false : this.f.isShowing();
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public int b() {
            return 0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void d(int v) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void dismiss() {
            androidx.appcompat.app.c c0 = this.f;
            if(c0 != null) {
                c0.dismiss();
                this.f = null;
            }
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public CharSequence e() {
            return this.h;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public Drawable g() {
            return null;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void h(CharSequence charSequence0) {
            this.h = charSequence0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void i(Drawable drawable0) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void k(int v) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void l(int v) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void m(int v, int v1) {
            if(this.g == null) {
                return;
            }
            androidx.appcompat.app.c.a c$a0 = new androidx.appcompat.app.c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence0 = this.h;
            if(charSequence0 != null) {
                c$a0.q(charSequence0);
            }
            androidx.appcompat.app.c c0 = c$a0.n(this.g, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f = c0;
            ListView listView0 = c0.k();
            listView0.setTextDirection(v);
            listView0.setTextAlignment(v1);
            this.f.show();
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public int n() {
            return 0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void o(ListAdapter listAdapter0) {
            this.g = listAdapter0;
        }

        @Override  // android.content.DialogInterface$OnClickListener
        public void onClick(DialogInterface dialogInterface0, int v) {
            AppCompatSpinner.this.setSelection(v);
            if(AppCompatSpinner.this.getOnItemClickListener() != null) {
                long v1 = this.g.getItemId(v);
                AppCompatSpinner.this.performItemClick(null, v, v1);
            }
            this.dismiss();
        }
    }

    static class e implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter f;
        private ListAdapter g;

        public e(SpinnerAdapter spinnerAdapter0, Resources.Theme resources$Theme0) {
            this.f = spinnerAdapter0;
            if(spinnerAdapter0 instanceof ListAdapter) {
                this.g = (ListAdapter)spinnerAdapter0;
            }
            if(resources$Theme0 != null && spinnerAdapter0 instanceof ThemedSpinnerAdapter) {
                c.a(((ThemedSpinnerAdapter)spinnerAdapter0), resources$Theme0);
            }
        }

        @Override  // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return this.g == null ? true : this.g.areAllItemsEnabled();
        }

        @Override  // android.widget.Adapter
        public int getCount() {
            return this.f == null ? 0 : this.f.getCount();
        }

        @Override  // android.widget.SpinnerAdapter
        public View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
            return this.f == null ? null : this.f.getDropDownView(v, view0, viewGroup0);
        }

        @Override  // android.widget.Adapter
        public Object getItem(int v) {
            return this.f == null ? null : this.f.getItem(v);
        }

        @Override  // android.widget.Adapter
        public long getItemId(int v) {
            return this.f == null ? -1L : this.f.getItemId(v);
        }

        @Override  // android.widget.Adapter
        public int getItemViewType(int v) {
            return 0;
        }

        @Override  // android.widget.Adapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            return this.getDropDownView(v, view0, viewGroup0);
        }

        @Override  // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override  // android.widget.Adapter
        public boolean hasStableIds() {
            return this.f != null && this.f.hasStableIds();
        }

        @Override  // android.widget.Adapter
        public boolean isEmpty() {
            return this.getCount() == 0;
        }

        @Override  // android.widget.ListAdapter
        public boolean isEnabled(int v) {
            return this.g == null ? true : this.g.isEnabled(v);
        }

        @Override  // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver0) {
            SpinnerAdapter spinnerAdapter0 = this.f;
            if(spinnerAdapter0 != null) {
                spinnerAdapter0.registerDataSetObserver(dataSetObserver0);
            }
        }

        @Override  // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
            SpinnerAdapter spinnerAdapter0 = this.f;
            if(spinnerAdapter0 != null) {
                spinnerAdapter0.unregisterDataSetObserver(dataSetObserver0);
            }
        }
    }

    class f extends P implements g {
        private CharSequence O;
        ListAdapter P;
        private final Rect Q;
        private int R;
        final AppCompatSpinner S;

        public f(Context context0, AttributeSet attributeSet0, int v) {
            class androidx.appcompat.widget.AppCompatSpinner.f.a implements AdapterView.OnItemClickListener {
                final AppCompatSpinner f;
                final f g;

                androidx.appcompat.widget.AppCompatSpinner.f.a(AppCompatSpinner appCompatSpinner0) {
                    this.f = appCompatSpinner0;
                    super();
                }

                @Override  // android.widget.AdapterView$OnItemClickListener
                public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                    AppCompatSpinner.this.setSelection(v);
                    if(AppCompatSpinner.this.getOnItemClickListener() != null) {
                        long v2 = f.this.P.getItemId(v);
                        AppCompatSpinner.this.performItemClick(view0, v, v2);
                    }
                    f.this.dismiss();
                }
            }

            super(context0, attributeSet0, v);
            this.Q = new Rect();
            this.C(appCompatSpinner0);
            this.I(true);
            this.O(0);
            this.K(new androidx.appcompat.widget.AppCompatSpinner.f.a(this, appCompatSpinner0));
        }

        void S() {
            int v;
            Drawable drawable0 = this.g();
            if(drawable0 == null) {
                AppCompatSpinner.this.m.right = 0;
                AppCompatSpinner.this.m.left = 0;
                v = 0;
            }
            else {
                drawable0.getPadding(AppCompatSpinner.this.m);
                v = n0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.m.right : -AppCompatSpinner.this.m.left;
            }
            int v1 = AppCompatSpinner.this.getPaddingLeft();
            int v2 = AppCompatSpinner.this.getPaddingRight();
            int v3 = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner0 = AppCompatSpinner.this;
            int v4 = appCompatSpinner0.l;
            if(v4 == -2) {
                int v5 = appCompatSpinner0.a(((SpinnerAdapter)this.P), this.g());
                int v6 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.m.left - AppCompatSpinner.this.m.right;
                if(v5 > v6) {
                    v5 = v6;
                }
                this.E(Math.max(v5, v3 - v1 - v2));
            }
            else if(v4 == -1) {
                this.E(v3 - v1 - v2);
            }
            else {
                this.E(v4);
            }
            this.d((n0.b(AppCompatSpinner.this) ? v + (v3 - v2 - this.y() - this.T()) : v + (v1 + this.T())));
        }

        public int T() {
            return this.R;
        }

        // 去混淆评级： 低(20)
        boolean U(View view0) {
            return view0.isAttachedToWindow() && view0.getGlobalVisibleRect(this.Q);
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public CharSequence e() {
            return this.O;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void h(CharSequence charSequence0) {
            this.O = charSequence0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void l(int v) {
            this.R = v;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$g
        public void m(int v, int v1) {
            class b implements ViewTreeObserver.OnGlobalLayoutListener {
                final f f;

                @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if(!f.this.U(AppCompatSpinner.this)) {
                        f.this.dismiss();
                        return;
                    }
                    f.this.S();
                    f.this.super.show();
                }
            }


            class androidx.appcompat.widget.AppCompatSpinner.f.c implements PopupWindow.OnDismissListener {
                final ViewTreeObserver.OnGlobalLayoutListener f;
                final f g;

                androidx.appcompat.widget.AppCompatSpinner.f.c(ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
                    this.f = viewTreeObserver$OnGlobalLayoutListener0;
                    super();
                }

                @Override  // android.widget.PopupWindow$OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver0 = AppCompatSpinner.this.getViewTreeObserver();
                    if(viewTreeObserver0 != null) {
                        viewTreeObserver0.removeGlobalOnLayoutListener(this.f);
                    }
                }
            }

            boolean z = this.a();
            this.S();
            this.H(2);
            super.show();
            ListView listView0 = this.j();
            listView0.setChoiceMode(1);
            listView0.setTextDirection(v);
            listView0.setTextAlignment(v1);
            this.P(AppCompatSpinner.this.getSelectedItemPosition());
            if(z) {
                return;
            }
            ViewTreeObserver viewTreeObserver0 = AppCompatSpinner.this.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                b appCompatSpinner$f$b0 = new b(this);
                viewTreeObserver0.addOnGlobalLayoutListener(appCompatSpinner$f$b0);
                this.J(new androidx.appcompat.widget.AppCompatSpinner.f.c(this, appCompatSpinner$f$b0));
            }
        }

        @Override  // androidx.appcompat.widget.P, androidx.appcompat.widget.AppCompatSpinner$g
        public void o(ListAdapter listAdapter0) {
            super.o(listAdapter0);
            this.P = listAdapter0;
        }
    }

    interface g {
        boolean a();

        int b();

        void d(int arg1);

        void dismiss();

        CharSequence e();

        Drawable g();

        void h(CharSequence arg1);

        void i(Drawable arg1);

        void k(int arg1);

        void l(int arg1);

        void m(int arg1, int arg2);

        int n();

        void o(ListAdapter arg1);
    }

    private final androidx.appcompat.widget.d f;
    private final Context g;
    private O h;
    private SpinnerAdapter i;
    private final boolean j;
    private g k;
    int l;
    final Rect m;
    private static final int[] n;

    static {
        AppCompatSpinner.n = new int[]{0x10102F1};
    }

    public AppCompatSpinner(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.K);
    }

    public AppCompatSpinner(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, -1);
    }

    public AppCompatSpinner(Context context0, AttributeSet attributeSet0, int v, int v1) {
        this(context0, attributeSet0, v, v1, null);
    }

    public AppCompatSpinner(Context context0, AttributeSet attributeSet0, int v, int v1, Resources.Theme resources$Theme0) {
        class androidx.appcompat.widget.AppCompatSpinner.a extends O {
            final f o;
            final AppCompatSpinner p;

            androidx.appcompat.widget.AppCompatSpinner.a(View view0, f appCompatSpinner$f0) {
                this.o = appCompatSpinner$f0;
                super(view0);
            }

            @Override  // androidx.appcompat.widget.O
            public j.e b() {
                return this.o;
            }

            @Override  // androidx.appcompat.widget.O
            public boolean c() {
                if(!AppCompatSpinner.this.getInternalPopup().a()) {
                    AppCompatSpinner.this.b();
                }
                return true;
            }
        }

        super(context0, attributeSet0, v);
        TypedArray typedArray1;
        this.m = new Rect();
        Y.a(this, this.getContext());
        c0 c00 = c0.v(context0, attributeSet0, j.F2, v, 0);
        this.f = new androidx.appcompat.widget.d(this);
        if(resources$Theme0 == null) {
            int v2 = c00.n(j.K2, 0);
            this.g = v2 == 0 ? context0 : new androidx.appcompat.view.d(context0, v2);
        }
        else {
            this.g = new androidx.appcompat.view.d(context0, resources$Theme0);
        }
        TypedArray typedArray0 = null;
        if(v1 == -1) {
            try {
                typedArray1 = null;
                typedArray1 = context0.obtainStyledAttributes(attributeSet0, AppCompatSpinner.n, v, 0);
                goto label_20;
            }
            catch(Exception exception0) {
                goto label_24;
            }
            catch(Throwable throwable0) {
            }
            goto label_29;
            try {
                try {
                label_20:
                    if(typedArray1.hasValue(0)) {
                        v1 = typedArray1.getInt(0, 0);
                        goto label_32;
                    }
                    else {
                        goto label_34;
                    }
                }
                catch(Exception exception0) {
                label_24:
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception0);
                    if(typedArray1 != null) {
                        goto label_32;
                    }
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                typedArray0 = typedArray1;
            }
        label_29:
            if(typedArray0 != null) {
                typedArray0.recycle();
            }
            throw throwable0;
        label_32:
            typedArray1.recycle();
            goto label_35;
        label_34:
            typedArray1.recycle();
        }
    label_35:
        switch(v1) {
            case 0: {
                d appCompatSpinner$d0 = new d(this);
                this.k = appCompatSpinner$d0;
                appCompatSpinner$d0.h(c00.o(j.I2));
                break;
            }
            case 1: {
                f appCompatSpinner$f0 = new f(this, this.g, attributeSet0, v);
                c0 c01 = c0.v(this.g, attributeSet0, j.F2, v, 0);
                this.l = c01.m(j.J2, -2);
                appCompatSpinner$f0.i(c01.g(j.H2));
                appCompatSpinner$f0.h(c00.o(j.I2));
                c01.x();
                this.k = appCompatSpinner$f0;
                this.h = new androidx.appcompat.widget.AppCompatSpinner.a(this, this, appCompatSpinner$f0);
            }
        }
        CharSequence[] arr_charSequence = c00.q(j.G2);
        if(arr_charSequence != null) {
            ArrayAdapter arrayAdapter0 = new ArrayAdapter(context0, 0x1090008, arr_charSequence);
            arrayAdapter0.setDropDownViewResource(e.g.t);
            this.setAdapter(arrayAdapter0);
        }
        c00.x();
        this.j = true;
        SpinnerAdapter spinnerAdapter0 = this.i;
        if(spinnerAdapter0 != null) {
            this.setAdapter(spinnerAdapter0);
            this.i = null;
        }
        this.f.e(attributeSet0, v);
    }

    int a(SpinnerAdapter spinnerAdapter0, Drawable drawable0) {
        int v = 0;
        if(spinnerAdapter0 == null) {
            return 0;
        }
        int v1 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        int v3 = Math.max(0, this.getSelectedItemPosition());
        int v4 = Math.min(spinnerAdapter0.getCount(), v3 + 15);
        int v5 = Math.max(0, v4 - 15);
        View view0 = null;
        int v6 = 0;
        while(v5 < v4) {
            int v7 = spinnerAdapter0.getItemViewType(v5);
            if(v7 != v) {
                view0 = null;
                v = v7;
            }
            view0 = spinnerAdapter0.getView(v5, view0, this);
            if(view0.getLayoutParams() == null) {
                view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view0.measure(v1, v2);
            v6 = Math.max(v6, view0.getMeasuredWidth());
            ++v5;
        }
        if(drawable0 != null) {
            drawable0.getPadding(this.m);
            return v6 + (this.m.left + this.m.right);
        }
        return v6;
    }

    void b() {
        this.k.m(this.getTextDirection(), this.getTextAlignment());
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d d0 = this.f;
        if(d0 != null) {
            d0.b();
        }
    }

    @Override  // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g appCompatSpinner$g0 = this.k;
        return appCompatSpinner$g0 == null ? super.getDropDownHorizontalOffset() : appCompatSpinner$g0.b();
    }

    @Override  // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g appCompatSpinner$g0 = this.k;
        return appCompatSpinner$g0 == null ? super.getDropDownVerticalOffset() : appCompatSpinner$g0.n();
    }

    @Override  // android.widget.Spinner
    public int getDropDownWidth() {
        return this.k == null ? super.getDropDownWidth() : this.l;
    }

    final g getInternalPopup() {
        return this.k;
    }

    @Override  // android.widget.Spinner
    public Drawable getPopupBackground() {
        g appCompatSpinner$g0 = this.k;
        return appCompatSpinner$g0 == null ? super.getPopupBackground() : appCompatSpinner$g0.g();
    }

    @Override  // android.widget.Spinner
    public Context getPopupContext() {
        return this.g;
    }

    @Override  // android.widget.Spinner
    public CharSequence getPrompt() {
        g appCompatSpinner$g0 = this.k;
        return appCompatSpinner$g0 == null ? super.getPrompt() : appCompatSpinner$g0.e();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f == null ? null : this.f.c();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.f == null ? null : this.f.d();
    }

    @Override  // android.widget.Spinner
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.k != null && this.k.a()) {
            this.k.dismiss();
        }
    }

    @Override  // android.widget.Spinner
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.k != null && View.MeasureSpec.getMode(v) == 0x80000000) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.Spinner
    public void onRestoreInstanceState(Parcelable parcelable0) {
        class androidx.appcompat.widget.AppCompatSpinner.b implements ViewTreeObserver.OnGlobalLayoutListener {
            final AppCompatSpinner f;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                if(!AppCompatSpinner.this.getInternalPopup().a()) {
                    AppCompatSpinner.this.b();
                }
                ViewTreeObserver viewTreeObserver0 = AppCompatSpinner.this.getViewTreeObserver();
                if(viewTreeObserver0 != null) {
                    viewTreeObserver0.removeOnGlobalLayoutListener(this);
                }
            }
        }

        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        if(((SavedState)parcelable0).f) {
            ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.addOnGlobalLayoutListener(new androidx.appcompat.widget.AppCompatSpinner.b(this));
            }
        }
    }

    @Override  // android.widget.Spinner
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.f = this.k != null && this.k.a();
        return parcelable0;
    }

    @Override  // android.widget.Spinner
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.h == null || !this.h.onTouch(this, motionEvent0) ? super.onTouchEvent(motionEvent0) : true;
    }

    @Override  // android.widget.Spinner
    public boolean performClick() {
        g appCompatSpinner$g0 = this.k;
        if(appCompatSpinner$g0 != null) {
            if(!appCompatSpinner$g0.a()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }

    @Override  // android.widget.Spinner
    public void setAdapter(Adapter adapter0) {
        this.setAdapter(((SpinnerAdapter)adapter0));
    }

    @Override  // android.widget.Spinner
    public void setAdapter(SpinnerAdapter spinnerAdapter0) {
        if(!this.j) {
            this.i = spinnerAdapter0;
            return;
        }
        super.setAdapter(spinnerAdapter0);
        if(this.k != null) {
            Context context0 = this.g == null ? this.getContext() : this.g;
            this.k.o(new e(spinnerAdapter0, context0.getTheme()));
        }
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        androidx.appcompat.widget.d d0 = this.f;
        if(d0 != null) {
            d0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        androidx.appcompat.widget.d d0 = this.f;
        if(d0 != null) {
            d0.g(v);
        }
    }

    @Override  // android.widget.Spinner
    public void setDropDownHorizontalOffset(int v) {
        g appCompatSpinner$g0 = this.k;
        if(appCompatSpinner$g0 != null) {
            appCompatSpinner$g0.l(v);
            this.k.d(v);
            return;
        }
        super.setDropDownHorizontalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownVerticalOffset(int v) {
        g appCompatSpinner$g0 = this.k;
        if(appCompatSpinner$g0 != null) {
            appCompatSpinner$g0.k(v);
            return;
        }
        super.setDropDownVerticalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownWidth(int v) {
        if(this.k != null) {
            this.l = v;
            return;
        }
        super.setDropDownWidth(v);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable0) {
        g appCompatSpinner$g0 = this.k;
        if(appCompatSpinner$g0 != null) {
            appCompatSpinner$g0.i(drawable0);
            return;
        }
        super.setPopupBackgroundDrawable(drawable0);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundResource(int v) {
        this.setPopupBackgroundDrawable(f.a.b(this.getPopupContext(), v));
    }

    @Override  // android.widget.Spinner
    public void setPrompt(CharSequence charSequence0) {
        g appCompatSpinner$g0 = this.k;
        if(appCompatSpinner$g0 != null) {
            appCompatSpinner$g0.h(charSequence0);
            return;
        }
        super.setPrompt(charSequence0);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        androidx.appcompat.widget.d d0 = this.f;
        if(d0 != null) {
            d0.i(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        androidx.appcompat.widget.d d0 = this.f;
        if(d0 != null) {
            d0.j(porterDuff$Mode0);
        }
    }
}

