package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public TimeModel a(Parcel parcel0) {
            return new TimeModel(parcel0);
        }

        public TimeModel[] b(int v) {
            return new TimeModel[v];
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
    private final c f;
    private final c g;
    final int h;
    int i;
    int j;
    int k;
    int l;

    static {
        TimeModel.CREATOR = new a();
    }

    public TimeModel(int v, int v1, int v2, int v3) {
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.h = v3;
        this.l = TimeModel.c(v);
        this.f = new c(59);
        this.g = new c((v3 == 1 ? 23 : 12));
    }

    protected TimeModel(Parcel parcel0) {
        this(parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt());
    }

    public static String a(Resources resources0, CharSequence charSequence0) {
        return TimeModel.b(resources0, charSequence0, "%02d");
    }

    public static String b(Resources resources0, CharSequence charSequence0, String s) {
        try {
            return String.format(resources0.getConfiguration().locale, s, Integer.parseInt(String.valueOf(charSequence0)));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    private static int c(int v) {
        return v < 12 ? 0 : 1;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TimeModel ? this.i == ((TimeModel)object0).i && this.j == ((TimeModel)object0).j && this.h == ((TimeModel)object0).h && this.k == ((TimeModel)object0).k : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.h, this.i, this.j, this.k});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        parcel0.writeInt(this.j);
        parcel0.writeInt(this.k);
        parcel0.writeInt(this.h);
    }
}

