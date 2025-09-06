package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public BackStackState a(Parcel parcel0) {
            return new BackStackState(parcel0);
        }

        public BackStackState[] b(int v) {
            return new BackStackState[v];
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
    final List f;
    final List g;

    static {
        BackStackState.CREATOR = new a();
    }

    BackStackState(Parcel parcel0) {
        this.f = parcel0.createStringArrayList();
        this.g = parcel0.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeStringList(this.f);
        parcel0.writeTypedList(this.g);
    }
}

