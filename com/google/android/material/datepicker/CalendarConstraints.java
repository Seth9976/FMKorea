package com.google.android.material.datepicker;

import B.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class CalendarConstraints implements Parcelable {
    public interface DateValidator extends Parcelable {
        boolean t(long arg1);
    }

    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public CalendarConstraints a(Parcel parcel0) {
            Parcelable parcelable0 = parcel0.readParcelable(Month.class.getClassLoader());
            Parcelable parcelable1 = parcel0.readParcelable(Month.class.getClassLoader());
            Parcelable parcelable2 = parcel0.readParcelable(Month.class.getClassLoader());
            return new CalendarConstraints(((Month)parcelable0), ((Month)parcelable1), ((DateValidator)parcel0.readParcelable(DateValidator.class.getClassLoader())), ((Month)parcelable2), parcel0.readInt(), null);
        }

        public CalendarConstraints[] b(int v) {
            return new CalendarConstraints[v];
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

    public static final class b {
        private long a;
        private long b;
        private Long c;
        private int d;
        private DateValidator e;
        static final long f;
        static final long g;

        static {
            b.f = u.a(Month.f(1900, 0).k);
            b.g = u.a(Month.f(2100, 11).k);
        }

        b(CalendarConstraints calendarConstraints0) {
            this.a = b.f;
            this.b = b.g;
            this.e = DateValidatorPointForward.a(0x8000000000000000L);
            this.a = calendarConstraints0.f.k;
            this.b = calendarConstraints0.g.k;
            this.c = calendarConstraints0.i.k;
            this.d = calendarConstraints0.j;
            this.e = calendarConstraints0.h;
        }

        public CalendarConstraints a() {
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            Month month0 = Month.g(this.a);
            Month month1 = Month.g(this.b);
            Parcelable parcelable0 = bundle0.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            return this.c == null ? new CalendarConstraints(month0, month1, ((DateValidator)parcelable0), null, this.d, null) : new CalendarConstraints(month0, month1, ((DateValidator)parcelable0), Month.g(((long)this.c)), this.d, null);
        }

        public b b(long v) {
            this.c = v;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final Month f;
    private final Month g;
    private final DateValidator h;
    private Month i;
    private final int j;
    private final int k;
    private final int l;

    static {
        CalendarConstraints.CREATOR = new a();
    }

    private CalendarConstraints(Month month0, Month month1, DateValidator calendarConstraints$DateValidator0, Month month2, int v) {
        Objects.requireNonNull(month0, "start cannot be null");
        Objects.requireNonNull(month1, "end cannot be null");
        Objects.requireNonNull(calendarConstraints$DateValidator0, "validator cannot be null");
        this.f = month0;
        this.g = month1;
        this.i = month2;
        this.j = v;
        this.h = calendarConstraints$DateValidator0;
        if(month2 != null && month0.b(month2) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if(month2 != null && month2.b(month1) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if(v < 0 || v > u.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.l = month0.o(month1) + 1;
        this.k = month1.h - month0.h + 1;
    }

    CalendarConstraints(Month month0, Month month1, DateValidator calendarConstraints$DateValidator0, Month month2, int v, a calendarConstraints$a0) {
        this(month0, month1, calendarConstraints$DateValidator0, month2, v);
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
        return object0 instanceof CalendarConstraints ? this.f.equals(((CalendarConstraints)object0).f) && this.g.equals(((CalendarConstraints)object0).g) && c.a(this.i, ((CalendarConstraints)object0).i) && this.j == ((CalendarConstraints)object0).j && this.h.equals(((CalendarConstraints)object0).h) : false;
    }

    public DateValidator f() {
        return this.h;
    }

    Month g() {
        return this.g;
    }

    int h() {
        return this.j;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.i, this.j, this.h});
    }

    int i() {
        return this.l;
    }

    Month j() {
        return this.i;
    }

    Month k() {
        return this.f;
    }

    int l() {
        return this.k;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.f, 0);
        parcel0.writeParcelable(this.g, 0);
        parcel0.writeParcelable(this.i, 0);
        parcel0.writeParcelable(this.h, 0);
        parcel0.writeInt(this.j);
    }
}

