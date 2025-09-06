package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public FragmentManagerState a(Parcel parcel0) {
            return new FragmentManagerState(parcel0);
        }

        public FragmentManagerState[] b(int v) {
            return new FragmentManagerState[v];
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
    ArrayList f;
    ArrayList g;
    BackStackRecordState[] h;
    int i;
    String j;
    ArrayList k;
    ArrayList l;
    ArrayList m;

    static {
        FragmentManagerState.CREATOR = new a();
    }

    public FragmentManagerState() {
        this.j = null;
        this.k = new ArrayList();
        this.l = new ArrayList();
    }

    public FragmentManagerState(Parcel parcel0) {
        this.j = null;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.f = parcel0.createStringArrayList();
        this.g = parcel0.createStringArrayList();
        this.h = (BackStackRecordState[])parcel0.createTypedArray(BackStackRecordState.CREATOR);
        this.i = parcel0.readInt();
        this.j = parcel0.readString();
        this.k = parcel0.createStringArrayList();
        this.l = parcel0.createTypedArrayList(BackStackState.CREATOR);
        this.m = parcel0.createTypedArrayList(LaunchedFragmentInfo.CREATOR);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringList(this.f);
        parcel0.writeStringList(this.g);
        parcel0.writeTypedArray(this.h, v);
        parcel0.writeInt(this.i);
        parcel0.writeString(this.j);
        parcel0.writeStringList(this.k);
        parcel0.writeTypedList(this.l);
        parcel0.writeTypedList(this.m);
    }
}

