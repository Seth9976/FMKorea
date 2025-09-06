package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

final class zzbih implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcfi zzcfi0 = (zzcfi)object0;
        String s = (String)map0.get("args");
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            SharedPreferences.Editor sharedPreferences$Editor0 = PreferenceManager.getDefaultSharedPreferences(zzcfi0.getContext()).edit();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                sharedPreferences$Editor0.remove(jSONArray0.getString(v));
            }
            sharedPreferences$Editor0.apply();
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzt.zzo().zzu(jSONException0, "GMSG clear local storage keys handler");
    }
}

