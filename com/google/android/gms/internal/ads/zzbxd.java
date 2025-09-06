package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzbxd implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final zzg zzc;
    private final zzbyf zzd;
    private String zze;
    private int zzf;

    zzbxd(Context context0, zzg zzg0, zzbyf zzbyf0) {
        this.zze = "-1";
        this.zzf = -1;
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context0);
        this.zzc = zzg0;
        this.zza = context0;
        this.zzd = zzbyf0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzay)).booleanValue()) {
            if(zzbxc.zza(s, "gad_has_consent_for_cookies")) {
                int v = sharedPreferences0.getInt("gad_has_consent_for_cookies", -1);
                if(v != this.zzc.zzb()) {
                    this.zzb();
                }
                this.zzc.zzE(v);
                return;
            }
            if(zzbxc.zza(s, "IABTCF_gdprApplies") || zzbxc.zza(s, "IABTCF_TCString") || zzbxc.zza(s, "IABTCF_PurposeConsents")) {
                String s1 = sharedPreferences0.getString(s, "-1");
                if(s1 != null && !s1.equals(this.zzc.zzn(s))) {
                    this.zzb();
                }
                this.zzc.zzF(s, s1);
            }
        }
        else {
            String s2 = sharedPreferences0.getString("IABTCF_PurposeConsents", "-1");
            int v1 = sharedPreferences0.getInt("gad_has_consent_for_cookies", -1);
            switch(String.valueOf(s)) {
                case "IABTCF_PurposeConsents": {
                    if(!s2.equals("-1") && !this.zze.equals(s2)) {
                        this.zze = s2;
                        this.zzc(s2, v1);
                        return;
                    }
                    break;
                }
                case "gad_has_consent_for_cookies": {
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzaw)).booleanValue() && v1 != -1 && this.zzf != v1) {
                        this.zzf = v1;
                        this.zzc(s2, v1);
                        return;
                    }
                    break;
                }
            }
        }
    }

    final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        this.onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzay)).booleanValue()) {
            this.onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            this.onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
            return;
        }
        this.onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }

    private final void zzb() {
        this.zzc.zzH(true);
        new Bundle();
        throw null;
    }

    private final void zzc(String s, int v) {
        boolean z = true;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzaw)).booleanValue()) {
            if(!s.isEmpty() && s.charAt(0) == 49) {
                z = false;
            }
        }
        else if(v != 0 && !s.isEmpty() && (s.charAt(0) == 49 || s.equals("-1"))) {
            z = false;
        }
        this.zzc.zzH(z);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && z) {
            Context context0 = this.zza;
            if(context0 != null) {
                context0.deleteDatabase("OfflineUpload.db");
            }
        }
    }
}

