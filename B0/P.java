package B0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.preference.j;

public class p {
    private Context a;
    private SharedPreferences b;

    public p(Context context0) {
        this.a = context0;
    }

    public String a() {
        return this.b().getString("io.gonative.android.appTheme", null);
    }

    private SharedPreferences b() {
        if(this.b == null) {
            this.b = j.c(this.a);
        }
        return this.b;
    }

    public void c(String s) {
        SharedPreferences sharedPreferences0 = this.b();
        if(TextUtils.isEmpty(s)) {
            sharedPreferences0.edit().remove("io.gonative.android.appTheme").commit();
            return;
        }
        sharedPreferences0.edit().putString("io.gonative.android.appTheme", s).commit();
    }
}

