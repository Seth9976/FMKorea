package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzeoz implements zzesj {
    private final Context zza;
    private final zzfyo zzb;

    zzeoz(Context context0, zzfyo zzfyo0) {
        this.zza = context0;
        this.zzb = zzfyo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 18;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzeow zzeow0 = () -> {
            String s = "";
            String s1 = ((Boolean)zzba.zzc().zzb(zzbbr.zzfU)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "") : "";
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfW)).booleanValue()) {
                s = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
            }
            Context context0 = this.zza;
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzfV)).booleanValue()) {
                return new zzeoy(s1, s, null, null);
            }
            SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(context0);
            Bundle bundle0 = new Bundle();
            if(sharedPreferences0.contains("IABConsent_CMPPresent")) {
                bundle0.putBoolean("IABConsent_CMPPresent", sharedPreferences0.getBoolean("IABConsent_CMPPresent", false));
            }
            for(int v = 0; v < 4; ++v) {
                String s2 = new String[]{"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"}[v];
                if(sharedPreferences0.contains(s2)) {
                    bundle0.putString(s2, sharedPreferences0.getString(s2, null));
                }
            }
            return new zzeoy(s1, s, bundle0, null);
        };
        return this.zzb.zzb(zzeow0);
    }

    // 检测为 Lambda 实现
    final zzeoy zzc() [...]
}

