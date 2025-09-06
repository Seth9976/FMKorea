package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class DateValidatorPointForward implements DateValidator {
    class a implements Parcelable.Creator {
        a() {
            super();
        }

        public DateValidatorPointForward a(Parcel parcel0) {
            return new DateValidatorPointForward(parcel0.readLong(), null);
        }

        public DateValidatorPointForward[] b(int v) {
            return new DateValidatorPointForward[v];
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
    private final long f;

    static {
        DateValidatorPointForward.CREATOR = new a();
    }

    private DateValidatorPointForward(long v) {
        this.f = v;
    }

    DateValidatorPointForward(long v, a dateValidatorPointForward$a0) {
        this(v);
    }

    public static DateValidatorPointForward a(long v) {
        return new DateValidatorPointForward(v);
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
        return object0 instanceof DateValidatorPointForward ? this.f == ((DateValidatorPointForward)object0).f : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f});
    }

    @Override  // com.google.android.material.datepicker.CalendarConstraints$DateValidator
    public boolean t(long v) {
        return v >= this.f;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.f);
    }
}

