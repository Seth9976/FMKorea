package com.google.android.material.internal;

import C.z;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.o;
import androidx.core.view.Y;
import androidx.customview.view.AbsSavedState;

public class CheckableImageButton extends o implements Checkable {
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
        boolean h;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.b(parcel0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void b(Parcel parcel0) {
            this.h = parcel0.readInt() == 1;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.h));
        }
    }

    private boolean i;
    private boolean j;
    private boolean k;
    private static final int[] l;

    static {
        CheckableImageButton.l = new int[]{0x10100A0};
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, e.a.C);
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0, int v) {
        class com.google.android.material.internal.CheckableImageButton.a extends androidx.core.view.a {
            final CheckableImageButton d;

            @Override  // androidx.core.view.a
            public void f(View view0, AccessibilityEvent accessibilityEvent0) {
                super.f(view0, accessibilityEvent0);
                accessibilityEvent0.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override  // androidx.core.view.a
            public void g(View view0, z z0) {
                super.g(view0, z0);
                z0.k0(CheckableImageButton.this.a());
                z0.l0(CheckableImageButton.this.isChecked());
            }
        }

        super(context0, attributeSet0, v);
        this.j = true;
        this.k = true;
        Y.o0(this, new com.google.android.material.internal.CheckableImageButton.a(this));
    }

    public boolean a() {
        return this.j;
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.i;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public int[] onCreateDrawableState(int v) {
        return this.i ? View.mergeDrawableStates(super.onCreateDrawableState(v + CheckableImageButton.l.length), CheckableImageButton.l) : super.onCreateDrawableState(v);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setChecked(((SavedState)parcelable0).h);
    }

    @Override  // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.h = this.i;
        return parcelable0;
    }

    public void setCheckable(boolean z) {
        if(this.j != z) {
            this.j = z;
            this.sendAccessibilityEvent(0);
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.j && this.i != z) {
            this.i = z;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setPressable(boolean z) {
        this.k = z;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        if(this.k) {
            super.setPressed(z);
        }
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.setChecked(!this.i);
    }
}

