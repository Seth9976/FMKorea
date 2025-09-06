package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class WrappedParcelable implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public WrappedParcelable a(Parcel parcel0) {
            return new WrappedParcelable(parcel0);
        }

        public WrappedParcelable[] b(int v) {
            return new WrappedParcelable[v];
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
    private final byte[] f;

    static {
        WrappedParcelable.CREATOR = new a();
    }

    protected WrappedParcelable(Parcel parcel0) {
        this.f = parcel0.createByteArray();
    }

    public WrappedParcelable(Parcelable parcelable0) {
        this.f = WrappedParcelable.marshallParcelable(parcelable0);
    }

    public WrappedParcelable(byte[] arr_b) {
        this.f = arr_b;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static byte[] marshallParcelable(Parcelable parcelable0) {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeParcelable(parcelable0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        return arr_b;
    }

    public Parcelable unwrap(ClassLoader classLoader0) {
        Parcel parcel0 = Parcel.obtain();
        byte[] arr_b = this.f;
        if(arr_b != null) {
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
            parcel0.recycle();
            return parcelable0;
        }
        return null;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeByteArray(this.f);
    }
}

