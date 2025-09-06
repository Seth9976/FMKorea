package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareLinkContent extends ShareContent {
    static final class a implements Parcelable.Creator {
        public ShareLinkContent a(Parcel parcel0) {
            return new ShareLinkContent(parcel0);
        }

        public ShareLinkContent[] b(int v) {
            return new ShareLinkContent[v];
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
    private final String l;
    private final String m;
    private final Uri n;
    private final String o;

    static {
        ShareLinkContent.CREATOR = new a();
    }

    ShareLinkContent(Parcel parcel0) {
        super(parcel0);
        this.l = parcel0.readString();
        this.m = parcel0.readString();
        this.n = (Uri)parcel0.readParcelable(Uri.class.getClassLoader());
        this.o = parcel0.readString();
    }

    public String d() {
        return this.o;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.facebook.share.model.ShareContent
    public void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeString(this.l);
        parcel0.writeString(this.m);
        parcel0.writeParcelable(this.n, 0);
        parcel0.writeString(this.o);
    }
}

