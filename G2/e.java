package g2;

import android.content.Context;
import j2.i;
import java.io.IOException;
import java.io.InputStream;

public class e {
    static abstract class a {
    }

    class b {
        private final String a;
        private final String b;
        final e c;

        private b() {
            int v = i.r(e0.a, "com.google.firebase.crashlytics.unity_version", "string");
            if(v != 0) {
                this.a = "Unity";
                String s = e0.a.getResources().getString(v);
                this.b = s;
                f.f().i("Unity Editor version is: " + s);
                return;
            }
            if(e0.c("flutter_assets/NOTICES.Z")) {
                this.a = "Flutter";
                this.b = null;
                f.f().i("Development platform is: Flutter");
                return;
            }
            this.a = null;
            this.b = null;
        }

        b(a e$a0) {
        }

        static String a(b e$b0) {
            return e$b0.a;
        }

        static String b(b e$b0) {
            return e$b0.b;
        }
    }

    private final Context a;
    private b b;

    public e(Context context0) {
        this.a = context0;
        this.b = null;
    }

    private boolean c(String s) {
        if(this.a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStream0 = this.a.getAssets().open(s);
            if(inputStream0 != null) {
                inputStream0.close();
            }
            return true;
        }
        catch(IOException unused_ex) {
            return false;
        }
    }

    public String d() {
        return b.a(this.f());
    }

    public String e() {
        return b.b(this.f());
    }

    private b f() {
        if(this.b == null) {
            this.b = new b(this, null);
        }
        return this.b;
    }
}

