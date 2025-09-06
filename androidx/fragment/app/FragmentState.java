package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.lifecycle.h.b;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public FragmentState a(Parcel parcel0) {
            return new FragmentState(parcel0);
        }

        public FragmentState[] b(int v) {
            return new FragmentState[v];
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
    final String f;
    final String g;
    final boolean h;
    final int i;
    final int j;
    final String k;
    final boolean l;
    final boolean m;
    final boolean n;
    final Bundle o;
    final boolean p;
    final int q;
    Bundle r;

    static {
        FragmentState.CREATOR = new a();
    }

    FragmentState(Parcel parcel0) {
        this.f = parcel0.readString();
        this.g = parcel0.readString();
        boolean z = false;
        this.h = parcel0.readInt() != 0;
        this.i = parcel0.readInt();
        this.j = parcel0.readInt();
        this.k = parcel0.readString();
        this.l = parcel0.readInt() != 0;
        this.m = parcel0.readInt() != 0;
        this.n = parcel0.readInt() != 0;
        this.o = parcel0.readBundle();
        if(parcel0.readInt() != 0) {
            z = true;
        }
        this.p = z;
        this.r = parcel0.readBundle();
        this.q = parcel0.readInt();
    }

    FragmentState(Fragment fragment0) {
        this.f = fragment0.getClass().getName();
        this.g = fragment0.mWho;
        this.h = fragment0.mFromLayout;
        this.i = fragment0.mFragmentId;
        this.j = fragment0.mContainerId;
        this.k = fragment0.mTag;
        this.l = fragment0.mRetainInstance;
        this.m = fragment0.mRemoving;
        this.n = fragment0.mDetached;
        this.o = fragment0.mArguments;
        this.p = fragment0.mHidden;
        this.q = fragment0.mMaxState.ordinal();
    }

    Fragment a(l l0, ClassLoader classLoader0) {
        Fragment fragment0 = l0.a(classLoader0, this.f);
        Bundle bundle0 = this.o;
        if(bundle0 != null) {
            bundle0.setClassLoader(classLoader0);
        }
        fragment0.setArguments(this.o);
        fragment0.mWho = this.g;
        fragment0.mFromLayout = this.h;
        fragment0.mRestored = true;
        fragment0.mFragmentId = this.i;
        fragment0.mContainerId = this.j;
        fragment0.mTag = this.k;
        fragment0.mRetainInstance = this.l;
        fragment0.mRemoving = this.m;
        fragment0.mDetached = this.n;
        fragment0.mHidden = this.p;
        b[] arr_h$b = b.values();
        fragment0.mMaxState = arr_h$b[this.q];
        Bundle bundle1 = this.r;
        if(bundle1 != null) {
            fragment0.mSavedFragmentState = bundle1;
            return fragment0;
        }
        fragment0.mSavedFragmentState = new Bundle();
        return fragment0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentState{");
        stringBuilder0.append(this.f);
        stringBuilder0.append(" (");
        stringBuilder0.append(this.g);
        stringBuilder0.append(")}:");
        if(this.h) {
            stringBuilder0.append(" fromLayout");
        }
        if(this.j != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(this.j));
        }
        if(this.k != null && !this.k.isEmpty()) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(this.k);
        }
        if(this.l) {
            stringBuilder0.append(" retainInstance");
        }
        if(this.m) {
            stringBuilder0.append(" removing");
        }
        if(this.n) {
            stringBuilder0.append(" detached");
        }
        if(this.p) {
            stringBuilder0.append(" hidden");
        }
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.f);
        parcel0.writeString(this.g);
        parcel0.writeInt(((int)this.h));
        parcel0.writeInt(this.i);
        parcel0.writeInt(this.j);
        parcel0.writeString(this.k);
        parcel0.writeInt(((int)this.l));
        parcel0.writeInt(((int)this.m));
        parcel0.writeInt(((int)this.n));
        parcel0.writeBundle(this.o);
        parcel0.writeInt(((int)this.p));
        parcel0.writeBundle(this.r);
        parcel0.writeInt(this.q);
    }
}

