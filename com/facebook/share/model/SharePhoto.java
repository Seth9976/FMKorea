package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class SharePhoto extends ShareMedia {
    static final class a implements Parcelable.Creator {
        public SharePhoto a(Parcel parcel0) {
            return new SharePhoto(parcel0);
        }

        public SharePhoto[] b(int v) {
            return new SharePhoto[v];
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
    private final Bitmap g;
    private final Uri h;
    private final boolean i;
    private final String j;

    static {
        SharePhoto.CREATOR = new a();
    }

    SharePhoto(Parcel parcel0) {
        super(parcel0);
        this.g = (Bitmap)parcel0.readParcelable(Bitmap.class.getClassLoader());
        this.h = (Uri)parcel0.readParcelable(Uri.class.getClassLoader());
        this.i = parcel0.readByte() != 0;
        this.j = parcel0.readString();
    }

    public Uri a() {
        return this.h;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.share.model.ShareMedia
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeParcelable(this.g, 0);
        parcel0.writeParcelable(this.h, 0);
        parcel0.writeByte(((byte)this.i));
        parcel0.writeString(this.j);
    }
}

