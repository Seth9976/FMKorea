package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.internal.F;
import com.facebook.internal.G;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    static class e {
        public String a;
        public int b;
        public Long c;
        public String d;

        private e() {
        }

        e(a b$a0) {
        }
    }

    private final X.a a;
    private final com.facebook.a b;
    private AccessToken c;
    private AtomicBoolean d;
    private Date e;
    private static volatile b f;

    b(X.a a0, com.facebook.a a1) {
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
        G.i(a0, "localBroadcastManager");
        G.i(a1, "accessTokenCache");
        this.a = a0;
        this.b = a1;
    }

    private static GraphRequest c(AccessToken accessToken0, com.facebook.GraphRequest.e graphRequest$e0) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("grant_type", "fb_extend_sso_token");
        bundle0.putString("client_id", accessToken0.f());
        return new GraphRequest(accessToken0, "oauth/access_token", bundle0, o.f, graphRequest$e0);
    }

    private static GraphRequest d(AccessToken accessToken0, com.facebook.GraphRequest.e graphRequest$e0) {
        return new GraphRequest(accessToken0, "me/permissions", new Bundle(), o.f, graphRequest$e0);
    }

    void e() {
        this.l(this.c, this.c);
    }

    void f() {
        if(!this.p()) {
            return;
        }
        this.j(null);
    }

    AccessToken g() {
        return this.c;
    }

    static b h() {
        if(b.f == null) {
            Class class0 = b.class;
            synchronized(class0) {
                if(b.f == null) {
                    b.f = new b(X.a.b(h.e()), new com.facebook.a());
                }
            }
        }
        return b.f;
    }

    boolean i() {
        AccessToken accessToken0 = this.b.f();
        if(accessToken0 != null) {
            this.n(accessToken0, false);
            return true;
        }
        return false;
    }

    void j(com.facebook.AccessToken.b accessToken$b0) {
        class a implements Runnable {
            final b f;

            a(com.facebook.AccessToken.b accessToken$b0) {
            }

            @Override
            public void run() {
                if(b1.a.d(this)) {
                    return;
                }
                try {
                    b.this.k(null);
                }
                catch(Throwable throwable0) {
                    b1.a.b(throwable0, this);
                }
            }
        }

        if(Looper.getMainLooper().equals(Looper.myLooper())) {
            this.k(accessToken$b0);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new a(this, accessToken$b0));
    }

    private void k(com.facebook.AccessToken.b accessToken$b0) {
        class com.facebook.b.b implements com.facebook.GraphRequest.e {
            final AtomicBoolean a;
            final Set b;
            final Set c;
            final Set d;
            final b e;

            com.facebook.b.b(AtomicBoolean atomicBoolean0, Set set0, Set set1, Set set2) {
                this.a = atomicBoolean0;
                this.b = set0;
                this.c = set1;
                this.d = set2;
                super();
            }

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                JSONObject jSONObject0 = n0.h();
                if(jSONObject0 == null) {
                    return;
                }
                JSONArray jSONArray0 = jSONObject0.optJSONArray("data");
                if(jSONArray0 == null) {
                    return;
                }
                this.a.set(true);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
                    if(jSONObject1 != null) {
                        String s = jSONObject1.optString("permission");
                        String s1 = jSONObject1.optString("status");
                        if(!F.P(s) && !F.P(s1)) {
                            String s2 = s1.toLowerCase(Locale.US);
                            if(s2.equals("granted")) {
                                this.b.add(s);
                            }
                            else if(s2.equals("declined")) {
                                this.c.add(s);
                            }
                            else if(s2.equals("expired")) {
                                this.d.add(s);
                            }
                            else {
                                Log.w("AccessTokenManager", "Unexpected status: " + s2);
                            }
                        }
                    }
                }
            }
        }


        class c implements com.facebook.GraphRequest.e {
            final e a;
            final b b;

            c(e b$e0) {
                this.a = b$e0;
                super();
            }

            @Override  // com.facebook.GraphRequest$e
            public void a(n n0) {
                JSONObject jSONObject0 = n0.h();
                if(jSONObject0 == null) {
                    return;
                }
                this.a.a = jSONObject0.optString("access_token");
                this.a.b = jSONObject0.optInt("expires_at");
                this.a.c = jSONObject0.optLong("data_access_expiration_time");
                this.a.d = jSONObject0.optString("graph_domain", null);
            }
        }


        class d implements com.facebook.m.a {
            final AccessToken a;
            final AtomicBoolean b;
            final e c;
            final Set d;
            final Set e;
            final Set f;
            final b g;

            d(AccessToken accessToken0, com.facebook.AccessToken.b accessToken$b0, AtomicBoolean atomicBoolean0, e b$e0, Set set0, Set set1, Set set2) {
                this.a = accessToken0;
                this.b = atomicBoolean0;
                this.c = b$e0;
                this.d = set0;
                this.e = set1;
                this.f = set2;
                super();
            }

            @Override  // com.facebook.m$a
            public void a(m m0) {
                try {
                    if(b.h().g() != null && b.h().g().r() == this.a.r()) {
                        if(!this.b.get() && (this.c.a == null && this.c.b == 0)) {
                            return;
                        }
                        String s = this.c.a == null ? this.a.q() : this.c.a;
                        Set set0 = this.b.get() ? this.d : this.a.n();
                        Set set1 = this.b.get() ? this.e : this.a.i();
                        Set set2 = this.b.get() ? this.f : this.a.j();
                        AccessToken accessToken0 = new AccessToken(s, this.a.f(), this.a.r(), set0, set1, set2, this.a.p(), (this.c.b == 0 ? this.a.k() : new Date(((long)this.c.b) * 1000L)), new Date(), (this.c.c == null ? this.a.h() : new Date(1000L * ((long)this.c.c))), this.c.d);
                        b.h().m(accessToken0);
                    }
                }
                finally {
                    b.this.d.set(false);
                }
            }
        }

        AccessToken accessToken0 = this.c;
        if(accessToken0 == null) {
            if(accessToken$b0 != null) {
                accessToken$b0.a(new com.facebook.e("No current access token to refresh"));
            }
            return;
        }
        if(!this.d.compareAndSet(false, true)) {
            if(accessToken$b0 != null) {
                accessToken$b0.a(new com.facebook.e("Refresh already in progress"));
            }
            return;
        }
        this.e = new Date();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        e b$e0 = new e(null);
        m m0 = new m(new GraphRequest[]{b.d(accessToken0, new com.facebook.b.b(this, atomicBoolean0, hashSet0, hashSet1, hashSet2)), b.c(accessToken0, new c(this, b$e0))});
        m0.d(new d(this, accessToken0, accessToken$b0, atomicBoolean0, b$e0, hashSet0, hashSet1, hashSet2));
        m0.i();
    }

    private void l(AccessToken accessToken0, AccessToken accessToken1) {
        Intent intent0 = new Intent(h.e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent0.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent0.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken0);
        intent0.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken1);
        this.a.d(intent0);
    }

    void m(AccessToken accessToken0) {
        this.n(accessToken0, true);
    }

    private void n(AccessToken accessToken0, boolean z) {
        AccessToken accessToken1 = this.c;
        this.c = accessToken0;
        this.d.set(false);
        this.e = new Date(0L);
        if(z) {
            if(accessToken0 == null) {
                this.b.a();
                F.f(h.e());
            }
            else {
                this.b.g(accessToken0);
            }
        }
        if(!F.a(accessToken1, accessToken0)) {
            this.l(accessToken1, accessToken0);
            this.o();
        }
    }

    private void o() {
        Context context0 = h.e();
        AccessToken accessToken0 = AccessToken.g();
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        if(AccessToken.s() && accessToken0.k() != null && alarmManager0 != null) {
            Intent intent0 = new Intent(context0, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent0.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent0, 0);
            try {
                alarmManager0.set(1, accessToken0.k().getTime(), pendingIntent0);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    private boolean p() {
        if(this.c == null) {
            return false;
        }
        long v = new Date().getTime();
        return this.c.p().b() && v - this.e.getTime() > 3600000L && v - this.c.m().getTime() > 86400000L;
    }
}

