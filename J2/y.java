package j2;

import C2.e;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import g2.f;
import java.util.Locale;
import java.util.regex.Pattern;

public class y implements z {
    private final A a;
    private final Context b;
    private final String c;
    private final e d;
    private final u e;
    private a f;
    private static final Pattern g;
    private static final String h;

    static {
        y.g = Pattern.compile("[^\\p{Alnum}]");
        y.h = "\\Q/\\E";
    }

    public y(Context context0, String s, e e0, u u0) {
        if(context0 == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if(s == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context0;
        this.c = s;
        this.d = e0;
        this.e = u0;
        this.a = new A();
    }

    @Override  // j2.z
    public a a() {
        synchronized(this) {
            if(!this.n()) {
                return this.f;
            }
            f.f().i("Determining Crashlytics installation ID...");
            SharedPreferences sharedPreferences0 = i.s(this.b);
            String s = sharedPreferences0.getString("firebase.installation.id", null);
            f.f().i("Cached Firebase Installation ID: " + s);
            if(this.e.d()) {
                String s1 = this.d();
                f.f().i("Fetched Firebase Installation ID: " + s1);
                if(s1 == null) {
                    s1 = s == null ? "SYN_dc398257-e53e-4907-88e9-c0dc2244d377" : s;
                }
                this.f = s1.equals(s) ? a.a(this.l(sharedPreferences0), s1) : a.a(this.b(s1, sharedPreferences0), s1);
            }
            else if(y.k(s)) {
                this.f = a.b(this.l(sharedPreferences0));
            }
            else {
                this.f = a.b(this.b("SYN_dc398257-e53e-4907-88e9-c0dc2244d377", sharedPreferences0));
            }
            f.f().i("Install IDs: " + this.f);
            return this.f;
        }
    }

    private String b(String s, SharedPreferences sharedPreferences0) {
        synchronized(this) {
            f.f().i("Created new Crashlytics installation ID: 2691c3b661e640808d122414a95d1085 for FID: " + s);
            sharedPreferences0.edit().putString("crashlytics.installation.id", "2691c3b661e640808d122414a95d1085").putString("firebase.installation.id", s).apply();
            return "2691c3b661e640808d122414a95d1085";
        }
    }

    // 去混淆评级： 低(40)
    static String c() [...] // 潜在的解密器

    public String d() {
        Task task0 = this.d.getId();
        try {
            return (String)V.f(task0);
        }
        catch(Exception exception0) {
            f.f().l("Failed to retrieve Firebase Installation ID.", exception0);
            return null;
        }
    }

    private static String e(String s) [...] // 潜在的解密器

    public String f() {
        return this.c;
    }

    public String g() {
        return this.a.a(this.b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", this.m(Build.MANUFACTURER), this.m(Build.MODEL));
    }

    public String i() {
        return this.m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return this.m(Build.VERSION.RELEASE);
    }

    static boolean k(String s) {
        return s != null && s.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getString("crashlytics.installation.id", null);
    }

    // 去混淆评级： 低(20)
    private String m(String s) {
        return s.replaceAll("\\Q/\\E", "");
    }

    // 去混淆评级： 低(20)
    private boolean n() {
        return this.f == null || this.f.d() == null && this.e.d();
    }
}

