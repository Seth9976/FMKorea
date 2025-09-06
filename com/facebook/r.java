package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.G;
import org.json.JSONException;
import org.json.JSONObject;

final class r {
    private final SharedPreferences a;

    r() {
        this.a = h.e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
    }

    void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    Profile b() {
        String s = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if(s != null) {
            try {
                return new Profile(new JSONObject(s));
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    void c(Profile profile0) {
        G.i(profile0, "profile");
        JSONObject jSONObject0 = profile0.e();
        if(jSONObject0 != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject0.toString()).apply();
        }
    }
}

