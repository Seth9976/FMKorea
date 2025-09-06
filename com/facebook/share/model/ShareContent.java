package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent implements Parcelable {
    private final Uri f;
    private final List g;
    private final String h;
    private final String i;
    private final String j;
    private final ShareHashtag k;

    protected ShareContent(Parcel parcel0) {
        this.f = (Uri)parcel0.readParcelable(Uri.class.getClassLoader());
        this.g = this.c(parcel0);
        this.h = parcel0.readString();
        this.i = parcel0.readString();
        this.j = parcel0.readString();
        this.k = new b().c(parcel0).b();
    }

    public Uri a() {
        return this.f;
    }

    public ShareHashtag b() {
        return this.k;
    }

    private List c(Parcel parcel0) {
        ArrayList arrayList0 = new ArrayList();
        parcel0.readStringList(arrayList0);
        return arrayList0.size() == 0 ? null : Collections.unmodifiableList(arrayList0);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.f, 0);
        parcel0.writeStringList(this.g);
        parcel0.writeString(this.h);
        parcel0.writeString(this.i);
        parcel0.writeString(this.j);
        parcel0.writeParcelable(this.k, 0);
    }
}

