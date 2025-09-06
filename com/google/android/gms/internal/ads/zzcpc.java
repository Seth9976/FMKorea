package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcpc implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcpc(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzcag zzcag0 = ((zzchv)this.zza).zza();
        Object object0 = this.zzb.zzb();
        Object object1 = this.zzc.zzb();
        return new zzaub("50972773-4fb8-4b79-a832-dbbaa83a5df2", zzcag0, ((String)object1), ((JSONObject)object0), false, "native".equals(((String)object1)));
    }
}

