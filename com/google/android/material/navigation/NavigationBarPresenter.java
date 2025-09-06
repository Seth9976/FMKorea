package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import com.google.android.material.badge.b;
import com.google.android.material.internal.ParcelableSparseArray;

public class NavigationBarPresenter implements j {
    static class SavedState implements Parcelable {
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
        int f;
        ParcelableSparseArray g;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.f = parcel0.readInt();
            this.g = (ParcelableSparseArray)parcel0.readParcelable(this.getClass().getClassLoader());
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.f);
            parcel0.writeParcelable(this.g, 0);
        }
    }

    private e f;
    private f g;
    private boolean h;
    private int i;

    public NavigationBarPresenter() {
        this.h = false;
    }

    public void a(int v) {
        this.i = v;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void b(e e0, boolean z) {
    }

    @Override  // androidx.appcompat.view.menu.j
    public void c(boolean z) {
        if(this.h) {
            return;
        }
        if(z) {
            this.g.d();
            return;
        }
        this.g.m();
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean e(e e0, g g0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean f(e e0, g g0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public int getId() {
        return this.i;
    }

    @Override  // androidx.appcompat.view.menu.j
    public void h(Context context0, e e0) {
        this.f = e0;
        this.g.b(e0);
    }

    @Override  // androidx.appcompat.view.menu.j
    public void i(Parcelable parcelable0) {
        if(parcelable0 instanceof SavedState) {
            this.g.l(((SavedState)parcelable0).f);
            SparseArray sparseArray0 = b.b(this.g.getContext(), ((SavedState)parcelable0).g);
            this.g.k(sparseArray0);
        }
    }

    public void j(f f0) {
        this.g = f0;
    }

    @Override  // androidx.appcompat.view.menu.j
    public boolean k(m m0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.j
    public Parcelable l() {
        Parcelable parcelable0 = new SavedState();
        parcelable0.f = this.g.getSelectedItemId();
        parcelable0.g = b.c(this.g.getBadgeDrawables());
        return parcelable0;
    }

    public void m(boolean z) {
        this.h = z;
    }
}

