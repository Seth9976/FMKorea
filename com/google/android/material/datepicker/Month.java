package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Parcelable, Comparable {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public Month a(Parcel parcel0) {
            return Month.f(parcel0.readInt(), parcel0.readInt());
        }

        public Month[] b(int v) {
            return new Month[v];
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
    private final Calendar f;
    final int g;
    final int h;
    final int i;
    final int j;
    final long k;
    private String l;

    static {
        Month.CREATOR = new a();
    }

    private Month(Calendar calendar0) {
        calendar0.set(5, 1);
        Calendar calendar1 = u.c(calendar0);
        this.f = calendar1;
        this.g = calendar1.get(2);
        this.h = calendar1.get(1);
        this.i = calendar1.getMaximum(7);
        this.j = calendar1.getActualMaximum(5);
        this.k = calendar1.getTimeInMillis();
    }

    public int b(Month month0) {
        return this.f.compareTo(month0.f);
    }

    @Override
    public int compareTo(Object object0) {
        return this.b(((Month)object0));
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
        return object0 instanceof Month ? this.g == ((Month)object0).g && this.h == ((Month)object0).h : false;
    }

    static Month f(int v, int v1) {
        Calendar calendar0 = u.k();
        calendar0.set(1, v);
        calendar0.set(2, v1);
        return new Month(calendar0);
    }

    static Month g(long v) {
        Calendar calendar0 = u.k();
        calendar0.setTimeInMillis(v);
        return new Month(calendar0);
    }

    static Month h() {
        return new Month(u.i());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.g, this.h});
    }

    int i(int v) {
        int v1 = this.f.get(7);
        if(v <= 0) {
            v = this.f.getFirstDayOfWeek();
        }
        int v2 = v1 - v;
        return v2 >= 0 ? v2 : v2 + this.i;
    }

    long j(int v) {
        Calendar calendar0 = u.c(this.f);
        calendar0.set(5, v);
        return calendar0.getTimeInMillis();
    }

    int k(long v) {
        Calendar calendar0 = u.c(this.f);
        calendar0.setTimeInMillis(v);
        return calendar0.get(5);
    }

    String l() {
        if(this.l == null) {
            this.l = d.f(this.f.getTimeInMillis());
        }
        return this.l;
    }

    long m() {
        return this.f.getTimeInMillis();
    }

    Month n(int v) {
        Calendar calendar0 = u.c(this.f);
        calendar0.add(2, v);
        return new Month(calendar0);
    }

    int o(Month month0) {
        if(!(this.f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month0.h - this.h) * 12 + (month0.g - this.g);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.h);
        parcel0.writeInt(this.g);
    }
}

