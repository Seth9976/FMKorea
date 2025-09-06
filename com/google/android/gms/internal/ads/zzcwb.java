package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

public final class zzcwb extends zzdm {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeds zzh;
    private final Bundle zzi;

    public zzcwb(zzfbe zzfbe0, String s, zzeds zzeds0, zzfbi zzfbi0, String s1) {
        String s2 = null;
        this.zzb = zzfbe0 == null ? null : zzfbe0.zzac;
        this.zzc = s1;
        this.zzd = zzfbi0 == null ? null : zzfbi0.zzb;
        if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
            try {
                s2 = zzfbe0.zzw.getString("class_name");
            }
            catch(JSONException unused_ex) {
            }
        }
        if(s2 != null) {
            s = s2;
        }
        this.zza = s;
        this.zze = zzeds0.zzc();
        this.zzh = zzeds0;
        this.zzf = zzt.zzB().currentTimeMillis() / 1000L;
        this.zzi = !((Boolean)zzba.zzc().zzb(zzbbr.zzgI)).booleanValue() || zzfbi0 == null ? new Bundle() : zzfbi0.zzj;
        this.zzg = !((Boolean)zzba.zzc().zzb(zzbbr.zziQ)).booleanValue() || zzfbi0 == null || TextUtils.isEmpty(zzfbi0.zzh) ? "" : zzfbi0.zzh;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        return this.zzh == null ? null : this.zzh.zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}

