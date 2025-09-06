package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;

public class j {
    public interface a {
        void b(Preference arg1);
    }

    public interface b {
        void c(PreferenceScreen arg1);
    }

    public interface c {
        boolean d(Preference arg1);
    }

    public static abstract class d {
    }

    private final Context a;
    private long b;
    private SharedPreferences c;
    private SharedPreferences.Editor d;
    private boolean e;
    private String f;
    private int g;
    private int h;
    private PreferenceScreen i;
    private c j;
    private a k;
    private b l;

    public j(Context context0) {
        this.b = 0L;
        this.h = 0;
        this.a = context0;
        this.r(j.e(context0));
    }

    public PreferenceScreen a(Context context0) {
        PreferenceScreen preferenceScreen0 = new PreferenceScreen(context0, null);
        preferenceScreen0.R(this);
        return preferenceScreen0;
    }

    public Preference b(CharSequence charSequence0) {
        return this.i == null ? null : this.i.I0(charSequence0);
    }

    public static SharedPreferences c(Context context0) {
        return context0.getSharedPreferences(j.e(context0), 0);
    }

    private static int d() [...] // Inlined contents

    // 去混淆评级： 低(20)
    private static String e(Context context0) {
        return "com.fmkorea.m.fmk_preferences";
    }

    SharedPreferences.Editor f() {
        if(this.e) {
            if(this.d == null) {
                this.d = this.m().edit();
            }
            return this.d;
        }
        return this.m().edit();
    }

    long g() {
        long v;
        synchronized(this) {
            v = this.b;
            this.b = v + 1L;
        }
        return v;
    }

    public b h() {
        return this.l;
    }

    public c i() {
        return this.j;
    }

    public d j() [...] // Inlined contents

    public f k() [...] // Inlined contents

    public PreferenceScreen l() {
        return this.i;
    }

    public SharedPreferences m() {
        if(this.c == null) {
            this.c = (this.h == 1 ? androidx.core.content.a.createDeviceProtectedStorageContext(this.a) : this.a).getSharedPreferences(this.f, this.g);
        }
        return this.c;
    }

    public void n(a j$a0) {
        this.k = j$a0;
    }

    public void o(b j$b0) {
        this.l = j$b0;
    }

    public void p(c j$c0) {
        this.j = j$c0;
    }

    public boolean q(PreferenceScreen preferenceScreen0) {
        PreferenceScreen preferenceScreen1 = this.i;
        if(preferenceScreen0 != preferenceScreen1) {
            if(preferenceScreen1 != null) {
                preferenceScreen1.W();
            }
            this.i = preferenceScreen0;
            return true;
        }
        return false;
    }

    public void r(String s) {
        this.f = s;
        this.c = null;
    }

    boolean s() {
        return !this.e;
    }

    public void t(Preference preference0) {
        a j$a0 = this.k;
        if(j$a0 != null) {
            j$a0.b(preference0);
        }
    }
}

