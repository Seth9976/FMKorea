package com.onesignal;

import android.app.Activity;
import android.os.Build.VERSION;
import java.util.HashSet;
import java.util.Set;
import l3.h;
import l3.i;
import y3.a;
import z3.k;
import z3.l;

public final class o0 implements c {
    static final class b extends l implements a {
        public static final b g;

        static {
            b.g = new b();
        }

        b() {
            super(0);
        }

        @Override  // y3.a
        public Object a() {
            return this.b();
        }

        public final Boolean b() {
            return Build.VERSION.SDK_INT <= 0x20 || OSUtils.o(I1.b) <= 0x20 ? false : true;
        }
    }

    public static final o0 a;
    private static final Set b;
    private static boolean c;
    private static final h d;

    static {
        o0 o00 = new o0();
        o0.a = o00;
        o0.b = new HashSet();
        PermissionsActivity.e("NOTIFICATION", o00);
        o0.d = i.a(b.g);
    }

    @Override  // com.onesignal.PermissionsActivity$c
    public void a() {
        I1.A1();
        this.e(true);
    }

    @Override  // com.onesignal.PermissionsActivity$c
    public void b(boolean z) {
        if(!(z ? this.j() : false)) {
            this.e(false);
        }
    }

    private final void e(boolean z) {
        for(Object object0: o0.b) {
            ((M)object0).a(z);
        }
        o0.b.clear();
    }

    private final boolean f() {
        return ((Boolean)o0.d.getValue()).booleanValue();
    }

    private final boolean g() {
        return OSUtils.a(I1.b);
    }

    public final void h() {
        if(!o0.c) {
            return;
        }
        o0.c = false;
        this.e(this.g());
    }

    public final void i(boolean z, M i1$M0) {
        if(i1$M0 != null) {
            o0.b.add(i1$M0);
        }
        if(this.g()) {
            this.e(true);
            return;
        }
        if(!this.f()) {
            if(z) {
                this.j();
                return;
            }
            this.e(false);
            return;
        }
        PermissionsActivity.i(z, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", o0.class);
    }

    private final boolean j() {
        public static final class com.onesignal.o0.a implements com.onesignal.e.a {
            final Activity a;

            com.onesignal.o0.a(Activity activity0) {
                this.a = activity0;
                super();
            }

            @Override  // com.onesignal.e$a
            public void a() {
                Q.a.a(this.a);
                o0.c = true;
            }

            @Override  // com.onesignal.e$a
            public void b() {
                o0.a.e(false);
            }
        }

        Activity activity0 = I1.Z();
        if(activity0 == null) {
            return false;
        }
        String s = activity0.getString(h2.e);
        k.d(s, "activity.getString(R.str…ermission_name_for_title)");
        String s1 = activity0.getString(h2.f);
        k.d(s1, "activity.getString(R.str…mission_settings_message)");
        com.onesignal.o0.a o0$a0 = new com.onesignal.o0.a(activity0);
        e.a.c(activity0, s, s1, o0$a0);
        return true;
    }
}

