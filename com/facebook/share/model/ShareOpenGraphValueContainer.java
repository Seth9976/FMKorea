package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer implements Parcelable {
    public static abstract class a {
        private Bundle a;

        public a() {
            this.a = new Bundle();
        }

        public a b(String s, String s1) {
            this.a.putString(s, s1);
            return this;
        }

        public a c(ShareOpenGraphValueContainer shareOpenGraphValueContainer0) {
            if(shareOpenGraphValueContainer0 != null) {
                this.a.putAll(shareOpenGraphValueContainer0.b());
            }
            return this;
        }
    }

    private final Bundle f;

    ShareOpenGraphValueContainer(Parcel parcel0) {
        this.f = parcel0.readBundle(a.class.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(a shareOpenGraphValueContainer$a0) {
        this.f = (Bundle)shareOpenGraphValueContainer$a0.a.clone();
    }

    public Object a(String s) {
        return this.f.get(s);
    }

    public Bundle b() {
        return (Bundle)this.f.clone();
    }

    public String c(String s) {
        return this.f.getString(s);
    }

    public Set d() {
        return this.f.keySet();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeBundle(this.f);
    }
}

