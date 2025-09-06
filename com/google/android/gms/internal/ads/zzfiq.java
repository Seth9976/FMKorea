package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzfiq {
    private final zzfiy zza;
    private final zzfiy zzb;
    private final zzfiu zzc;
    private final zzfix zzd;

    private zzfiq(zzfiu zzfiu0, zzfix zzfix0, zzfiy zzfiy0, zzfiy zzfiy1, boolean z) {
        this.zzc = zzfiu0;
        this.zzd = zzfix0;
        this.zza = zzfiy0;
        if(zzfiy1 == null) {
            this.zzb = zzfiy.zzc;
            return;
        }
        this.zzb = zzfiy1;
    }

    public static zzfiq zza(zzfiu zzfiu0, zzfix zzfix0, zzfiy zzfiy0, zzfiy zzfiy1, boolean z) {
        zzfke.zzb(zzfix0, "ImpressionType is null");
        zzfke.zzb(zzfiy0, "Impression owner is null");
        if(zzfiy0 == zzfiy.zzc) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if(zzfiu0 == zzfiu.zza && zzfiy0 == zzfiy.zza) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if(zzfix0 == zzfix.zza && zzfiy0 == zzfiy.zza) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfiq(zzfiu0, zzfix0, zzfiy0, zzfiy1, true);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject0 = new JSONObject();
        zzfjz.zze(jSONObject0, "impressionOwner", this.zza);
        zzfjz.zze(jSONObject0, "mediaEventsOwner", this.zzb);
        zzfjz.zze(jSONObject0, "creativeType", this.zzc);
        zzfjz.zze(jSONObject0, "impressionType", this.zzd);
        zzfjz.zze(jSONObject0, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject0;
    }
}

