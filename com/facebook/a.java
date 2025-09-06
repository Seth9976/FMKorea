package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.G;
import org.json.JSONException;
import org.json.JSONObject;

class a {
    static class com.facebook.a.a {
        public p a() {
            return new p(h.e());
        }
    }

    private final SharedPreferences a;
    private final com.facebook.a.a b;
    private p c;

    public a() {
        this(h.e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new com.facebook.a.a());
    }

    a(SharedPreferences sharedPreferences0, com.facebook.a.a a$a0) {
        this.a = sharedPreferences0;
        this.b = a$a0;
    }

    public void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
    }

    private AccessToken b() {
        String s = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if(s != null) {
            try {
                return AccessToken.c(new JSONObject(s));
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    private AccessToken c() {
        Bundle bundle0 = this.d().h();
        return bundle0 == null || !p.g(bundle0) ? null : AccessToken.d(bundle0);
    }

    private p d() {
        if(this.c == null) {
            synchronized(this) {
                if(this.c == null) {
                    this.c = this.b.a();
                }
            }
        }
        return this.c;
    }

    private boolean e() {
        return this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    // 去混淆评级： 中等(50)
    public AccessToken f() {
        return this.e() ? this.b() : null;
    }

    public void g(AccessToken accessToken0) {
        G.i(accessToken0, "accessToken");
        try {
            JSONObject jSONObject0 = accessToken0.x();
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", jSONObject0.toString()).apply();
        }
        catch(JSONException unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    private boolean h() [...] // 潜在的解密器
}

