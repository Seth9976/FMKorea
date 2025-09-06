package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class zzbbk {
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzbbk() {
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    public final List zza() {
        List list0 = new ArrayList();
        for(Object object0: this.zzb) {
            String s = (String)zzba.zzc().zzb(((zzbbj)object0));
            if(!TextUtils.isEmpty(s)) {
                list0.add(s);
            }
        }
        list0.addAll(zzbbv.zza());
        return list0;
    }

    public final List zzb() {
        List list0 = this.zza();
        for(Object object0: this.zzc) {
            String s = (String)zzba.zzc().zzb(((zzbbj)object0));
            if(!TextUtils.isEmpty(s)) {
                list0.add(s);
            }
        }
        list0.addAll(zzbbv.zzb());
        return list0;
    }

    public final void zzc(zzbbj zzbbj0) {
        this.zzb.add(zzbbj0);
    }

    public final void zzd(zzbbj zzbbj0) {
        this.zza.add(zzbbj0);
    }

    public final void zze(SharedPreferences.Editor sharedPreferences$Editor0, int v, JSONObject jSONObject0) {
        for(Object object0: this.zza) {
            zzbbj zzbbj0 = (zzbbj)object0;
            if(zzbbj0.zze() == 1) {
                zzbbj0.zzd(sharedPreferences$Editor0, zzbbj0.zza(jSONObject0));
            }
        }
        if(jSONObject0 != null) {
            sharedPreferences$Editor0.putString("flag_configuration", jSONObject0.toString());
            return;
        }
        zzcaa.zzg("Flag Json is null.");
    }
}

