package com.google.android.material.navigation;

import S1.g;
import S1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.appcompat.widget.c0;
import androidx.core.view.Y;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.drawable.d;
import com.google.android.material.internal.q;
import z1.k;

public abstract class NavigationBarView extends FrameLayout {
    static class SavedState extends AbsSavedState {
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
        Bundle h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            this.b(parcel0, classLoader0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void b(Parcel parcel0, ClassLoader classLoader0) {
            this.h = parcel0.readBundle(classLoader0);
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeBundle(this.h);
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(MenuItem arg1);
    }

    private final e f;
    private final f g;
    private final NavigationBarPresenter h;
    private MenuInflater i;
    private c j;

    public NavigationBarView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        class com.google.android.material.navigation.NavigationBarView.a implements androidx.appcompat.view.menu.e.a {
            final NavigationBarView f;

            @Override  // androidx.appcompat.view.menu.e$a
            public boolean a(androidx.appcompat.view.menu.e e0, MenuItem menuItem0) {
                NavigationBarView.a(NavigationBarView.this);
                return NavigationBarView.b(NavigationBarView.this) != null && !NavigationBarView.b(NavigationBarView.this).a(menuItem0);
            }

            @Override  // androidx.appcompat.view.menu.e$a
            public void b(androidx.appcompat.view.menu.e e0) {
            }
        }

        super(V1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        NavigationBarPresenter navigationBarPresenter0 = new NavigationBarPresenter();
        this.h = navigationBarPresenter0;
        Context context1 = this.getContext();
        c0 c00 = q.j(context1, attributeSet0, k.b5, v, v1, new int[]{k.o5, k.m5});
        e e0 = new e(context1, this.getClass(), this.getMaxItemCount());
        this.f = e0;
        f f0 = this.c(context1);
        this.g = f0;
        navigationBarPresenter0.j(f0);
        navigationBarPresenter0.a(1);
        f0.setPresenter(navigationBarPresenter0);
        e0.b(navigationBarPresenter0);
        navigationBarPresenter0.h(this.getContext(), e0);
        if(c00.s(k.i5)) {
            f0.setIconTintList(c00.c(6));
        }
        else {
            f0.setIconTintList(f0.e(0x1010038));
        }
        int v2 = this.getResources().getDimensionPixelSize(z1.c.n0);
        this.setItemIconSize(c00.f(k.h5, v2));
        if(c00.s(12)) {
            this.setItemTextAppearanceInactive(c00.n(12, 0));
        }
        if(c00.s(10)) {
            this.setItemTextAppearanceActive(c00.n(10, 0));
        }
        this.setItemTextAppearanceActiveBoldEnabled(c00.a(k.n5, true));
        if(c00.s(k.p5)) {
            this.setItemTextColor(c00.c(13));
        }
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = d.f(drawable0);
        if(drawable0 == null || colorStateList0 != null) {
            g g0 = new g(S1.k.e(context1, attributeSet0, v, v1).m());
            if(colorStateList0 != null) {
                g0.V(colorStateList0);
            }
            g0.K(context1);
            Y.s0(this, g0);
        }
        if(c00.s(k.k5)) {
            this.setItemPaddingTop(c00.f(8, 0));
        }
        if(c00.s(k.j5)) {
            this.setItemPaddingBottom(c00.f(7, 0));
        }
        if(c00.s(k.c5)) {
            this.setActiveIndicatorLabelPadding(c00.f(0, 0));
        }
        if(c00.s(k.e5)) {
            this.setElevation(((float)c00.f(2, 0)));
        }
        ColorStateList colorStateList1 = P1.c.b(context1, c00, k.d5);
        androidx.core.graphics.drawable.a.o(this.getBackground().mutate(), colorStateList1);
        this.setLabelVisibilityMode(c00.l(k.q5, -1));
        int v3 = c00.n(k.g5, 0);
        if(v3 == 0) {
            this.setItemRippleColor(P1.c.b(context1, c00, k.l5));
        }
        else {
            f0.setItemBackgroundRes(v3);
        }
        int v4 = c00.n(k.f5, 0);
        if(v4 != 0) {
            this.setItemActiveIndicatorEnabled(true);
            TypedArray typedArray0 = context1.obtainStyledAttributes(v4, k.V4);
            this.setItemActiveIndicatorWidth(typedArray0.getDimensionPixelSize(k.X4, 0));
            this.setItemActiveIndicatorHeight(typedArray0.getDimensionPixelSize(k.W4, 0));
            this.setItemActiveIndicatorMarginHorizontal(typedArray0.getDimensionPixelOffset(k.Z4, 0));
            this.setItemActiveIndicatorColor(P1.c.a(context1, typedArray0, k.Y4));
            this.setItemActiveIndicatorShapeAppearance(S1.k.b(context1, typedArray0.getResourceId(k.a5, 0), 0).m());
            typedArray0.recycle();
        }
        if(c00.s(k.r5)) {
            this.d(c00.n(15, 0));
        }
        c00.x();
        this.addView(f0);
        e0.W(new com.google.android.material.navigation.NavigationBarView.a(this));
    }

    static b a(NavigationBarView navigationBarView0) {
        navigationBarView0.getClass();
        return null;
    }

    static c b(NavigationBarView navigationBarView0) {
        return navigationBarView0.j;
    }

    protected abstract f c(Context arg1);

    public void d(int v) {
        this.h.m(true);
        this.getMenuInflater().inflate(v, this.f);
        this.h.m(false);
        this.h.c(true);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.g.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.g.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.g.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.g.getItemActiveIndicatorMarginHorizontal();
    }

    public S1.k getItemActiveIndicatorShapeAppearance() {
        return this.g.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.g.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.g.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.g.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.g.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.g.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.g.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.g.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f;
    }

    private MenuInflater getMenuInflater() {
        if(this.i == null) {
            this.i = new androidx.appcompat.view.g(this.getContext());
        }
        return this.i;
    }

    public androidx.appcompat.view.menu.k getMenuView() {
        return this.g;
    }

    public NavigationBarPresenter getPresenter() {
        return this.h;
    }

    public int getSelectedItemId() {
        return this.g.getSelectedItemId();
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.f.T(((SavedState)parcelable0).h);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        Bundle bundle0 = new Bundle();
        parcelable0.h = bundle0;
        this.f.V(bundle0);
        return parcelable0;
    }

    public void setActiveIndicatorLabelPadding(int v) {
        this.g.setActiveIndicatorLabelPadding(v);
    }

    @Override  // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h.d(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList0) {
        this.g.setItemActiveIndicatorColor(colorStateList0);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.g.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int v) {
        this.g.setItemActiveIndicatorHeight(v);
    }

    public void setItemActiveIndicatorMarginHorizontal(int v) {
        this.g.setItemActiveIndicatorMarginHorizontal(v);
    }

    public void setItemActiveIndicatorShapeAppearance(S1.k k0) {
        this.g.setItemActiveIndicatorShapeAppearance(k0);
    }

    public void setItemActiveIndicatorWidth(int v) {
        this.g.setItemActiveIndicatorWidth(v);
    }

    public void setItemBackground(Drawable drawable0) {
        this.g.setItemBackground(drawable0);
    }

    public void setItemBackgroundResource(int v) {
        this.g.setItemBackgroundRes(v);
    }

    public void setItemIconSize(int v) {
        this.g.setItemIconSize(v);
    }

    public void setItemIconSizeRes(int v) {
        this.setItemIconSize(this.getResources().getDimensionPixelSize(v));
    }

    public void setItemIconTintList(ColorStateList colorStateList0) {
        this.g.setIconTintList(colorStateList0);
    }

    public void setItemPaddingBottom(int v) {
        this.g.setItemPaddingBottom(v);
    }

    public void setItemPaddingTop(int v) {
        this.g.setItemPaddingTop(v);
    }

    public void setItemRippleColor(ColorStateList colorStateList0) {
        this.g.setItemRippleColor(colorStateList0);
    }

    public void setItemTextAppearanceActive(int v) {
        this.g.setItemTextAppearanceActive(v);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.g.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int v) {
        this.g.setItemTextAppearanceInactive(v);
    }

    public void setItemTextColor(ColorStateList colorStateList0) {
        this.g.setItemTextColor(colorStateList0);
    }

    public void setLabelVisibilityMode(int v) {
        if(this.g.getLabelVisibilityMode() != v) {
            this.g.setLabelVisibilityMode(v);
            this.h.c(false);
        }
    }

    public void setOnItemReselectedListener(b navigationBarView$b0) {
    }

    public void setOnItemSelectedListener(c navigationBarView$c0) {
        this.j = navigationBarView$c0;
    }

    public void setSelectedItemId(int v) {
        MenuItem menuItem0 = this.f.findItem(v);
        if(menuItem0 != null && !this.f.P(menuItem0, this.h, 0)) {
            menuItem0.setChecked(true);
        }
    }
}

