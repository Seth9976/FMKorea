package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class ShareMedia implements Parcelable {
    private final Bundle f;

    ShareMedia(Parcel parcel0) {
        this.f = parcel0.readBundle();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeBundle(this.f);
    }
}

