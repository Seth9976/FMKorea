package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer {
    static final class a implements Parcelable.Creator {
        public ShareOpenGraphObject a(Parcel parcel0) {
            return new ShareOpenGraphObject(parcel0);
        }

        public ShareOpenGraphObject[] b(int v) {
            return new ShareOpenGraphObject[v];
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

    static {
        ShareOpenGraphObject.CREATOR = new a();
    }

    ShareOpenGraphObject(Parcel parcel0) {
        super(parcel0);
    }
}

