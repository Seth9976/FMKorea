package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class o {
    private final Long a;
    private final TimeZone b;
    private static final o c;

    static {
        o.c = new o(null, null);
    }

    private o(Long long0, TimeZone timeZone0) {
        this.a = long0;
        this.b = timeZone0;
    }

    Calendar a() {
        return this.b(this.b);
    }

    Calendar b(TimeZone timeZone0) {
        Calendar calendar0 = timeZone0 == null ? Calendar.getInstance() : Calendar.getInstance(timeZone0);
        Long long0 = this.a;
        if(long0 != null) {
            calendar0.setTimeInMillis(((long)long0));
        }
        return calendar0;
    }

    static o c() {
        return o.c;
    }
}

