package co.median.android;

import B0.G0;
import B0.Q0;
import B0.u0;
import I0.d;
import I0.g;
import I0.k;
import Z.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Message;
import android.util.Base64;
import android.widget.Toast;
import androidx.preference.j;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GoNativeApplication extends b {
    class a extends d {
        final GoNativeApplication e;

        a(Context context0) {
            super(context0);
        }

        @Override  // I0.d
        protected List e() {
            if(GoNativeApplication.this.o == null) {
                ArrayList arrayList0 = new u0(GoNativeApplication.this).a();
                GoNativeApplication.this.o = arrayList0;
            }
            return GoNativeApplication.this.o;
        }
    }

    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private o j;
    private r k;
    private Q0 l;
    private Message m;
    private l n;
    private List o;
    private boolean p;
    public final d q;
    private boolean r;
    private String s;
    private String t;
    private static final String u = "GoNativeApplication";

    static {
    }

    public GoNativeApplication() {
        this.f = "customCSS.css";
        this.g = "customJS.js";
        this.h = "androidCustomCSS.css";
        this.i = "androidCustomJS.js";
        this.p = false;
        this.q = new a(this, this);
        this.r = false;
    }

    public Map c() {
        return this.q.b();
    }

    public String d() {
        return this.s;
    }

    public String e() {
        return this.t;
    }

    public o f() {
        return this.j;
    }

    public r g() {
        return this.k;
    }

    public Q0 h() {
        return this.l;
    }

    public Message i() {
        return this.m;
    }

    public l j() {
        return this.n;
    }

    public boolean k() {
        return this.p;
    }

    private void l(I0.a a0) {
        if(!a0.C0 && !a0.D0) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(a0.C0) {
            arrayList0.add("customCSS.css");
        }
        if(a0.D0) {
            arrayList0.add("androidCustomCSS.css");
        }
        if(arrayList0.size() == 0) {
            return;
        }
        try {
            this.s = Base64.encodeToString(this.n(arrayList0).getBytes(StandardCharsets.UTF_8), 2);
        }
        catch(Exception exception0) {
            g.a().c("GoNativeApplication", "Error loading custom CSS files", exception0);
        }
    }

    private void m(I0.a a0) {
        if(!a0.E0 && !a0.F0) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        if(a0.E0) {
            arrayList0.add("customJS.js");
        }
        if(a0.F0) {
            arrayList0.add("androidCustomJS.js");
        }
        if(arrayList0.size() == 0) {
            return;
        }
        try {
            this.t = Base64.encodeToString(this.n(arrayList0).getBytes(StandardCharsets.UTF_8), 2);
        }
        catch(Exception exception0) {
            g.a().c("GoNativeApplication", "Error loading custom JS files", exception0);
        }
    }

    private String n(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: list0) {
            String s = (String)object0;
            try {
                k.b(new BufferedInputStream(this.getAssets().open(s)), byteArrayOutputStream0);
                stringBuilder0.append(byteArrayOutputStream0);
                byteArrayOutputStream0.reset();
            }
            catch(IOException iOException0) {
                g.a().c("GoNativeApplication", "Error reading " + s, iOException0);
            }
        }
        k.a(byteArrayOutputStream0);
        return stringBuilder0.toString();
    }

    public void o(boolean z) {
        this.r = z;
    }

    @Override  // android.app.Application
    public void onCreate() {
        super.onCreate();
        if(Build.VERSION.SDK_INT >= 0x1F) {
            this.q();
        }
        androidx.appcompat.app.g.K(true);
        this.q.r(this);
        I0.a a0 = I0.a.V(this);
        if(a0.c != null) {
            Toast.makeText(this, "Invalid appConfig json", 1).show();
            g.a().c("GoNativeApplication", "AppConfig error", a0.c);
        }
        this.j = new o(this);
        if(a0.c2 != null) {
            r r0 = new r(this);
            this.k = r0;
            r0.e(a0.c2);
        }
        w.d(this);
        this.l = new Q0();
        this.n = new l();
        this.l(a0);
        this.m(a0);
        SharedPreferences sharedPreferences0 = j.c(this);
        if(!sharedPreferences0.getBoolean("hasLaunched", false)) {
            this.p = true;
            sharedPreferences0.edit().putBoolean("hasLaunched", true).apply();
        }
    }

    @Override  // android.app.Application
    public void onTrimMemory(int v) {
        super.onTrimMemory(v);
        if(v == 20) {
            this.o(true);
        }
    }

    public void p(Message message0) {
        this.m = message0;
    }

    private void q() {
        String s = G0.a(this);
        if(G0.e(this)) {
            return;
        }
        G0.g(this, s);
        G0.c(this);
    }
}

