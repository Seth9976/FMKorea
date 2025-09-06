package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class ShareHashtag implements Parcelable {
    static final class a implements Parcelable.Creator {
        public ShareHashtag a(Parcel parcel0) {
            return new ShareHashtag(parcel0);
        }

        public ShareHashtag[] b(int v) {
            return new ShareHashtag[v];
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

    public static class b {
        private String a;

        public ShareHashtag b() {
            return new ShareHashtag(this, null);
        }

        b c(Parcel parcel0) {
            return this.d(((ShareHashtag)parcel0.readParcelable(ShareHashtag.class.getClassLoader())));
        }

        public b d(ShareHashtag shareHashtag0) {
            return shareHashtag0 == null ? this : this.e(shareHashtag0.a());
        }

        public b e(String s) {
            this.a = s;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final String f;

    static {
        ShareHashtag.CREATOR = new a();
    }

    ShareHashtag(Parcel parcel0) {
        this.f = parcel0.readString();
    }

    private ShareHashtag(b shareHashtag$b0) {
        this.f = shareHashtag$b0.a;
    }

    ShareHashtag(b shareHashtag$b0, a shareHashtag$a0) {
        this(shareHashtag$b0);
    }

    public String a() {
        return this.f;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.f);
    }
}

