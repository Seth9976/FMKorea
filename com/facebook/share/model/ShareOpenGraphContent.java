package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareOpenGraphContent extends ShareContent {
    static final class a implements Parcelable.Creator {
        public ShareOpenGraphContent a(Parcel parcel0) {
            return new ShareOpenGraphContent(parcel0);
        }

        public ShareOpenGraphContent[] b(int v) {
            return new ShareOpenGraphContent[v];
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
    private final ShareOpenGraphAction l;
    private final String m;

    static {
        ShareOpenGraphContent.CREATOR = new a();
    }

    ShareOpenGraphContent(Parcel parcel0) {
        super(parcel0);
        this.l = new b().e(parcel0).d();
        this.m = parcel0.readString();
    }

    public ShareOpenGraphAction d() {
        return this.l;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.share.model.ShareContent
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.l, 0);
        parcel0.writeString(this.m);
    }
}

