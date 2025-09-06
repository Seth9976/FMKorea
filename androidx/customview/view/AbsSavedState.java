package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    class a implements Parcelable.ClassLoaderCreator {
        a() {
            super();
        }

        public AbsSavedState a(Parcel parcel0) {
            return this.b(parcel0, null);
        }

        public AbsSavedState b(Parcel parcel0, ClassLoader classLoader0) {
            if(parcel0.readParcelable(classLoader0) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return AbsSavedState.g;
        }

        public AbsSavedState[] c(int v) {
            return new AbsSavedState[v];
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
    private final Parcelable f;
    public static final AbsSavedState g;

    static {
        AbsSavedState.g = new AbsSavedState() {
            {
                super(null);
            }
        };
        AbsSavedState.CREATOR = new a();
    }

    private AbsSavedState() {
        this.f = null;
    }

    protected AbsSavedState(Parcel parcel0, ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = AbsSavedState.g;
        }
        this.f = parcelable0;
    }

    protected AbsSavedState(Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == AbsSavedState.g) {
            parcelable0 = null;
        }
        this.f = parcelable0;
    }

    AbsSavedState(androidx.customview.view.AbsSavedState.1 absSavedState$10) {
    }

    public final Parcelable a() {
        return this.f;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.f, v);
    }
}

