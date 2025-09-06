package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

public final class zzcpe implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcpe(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzcoy zzcoy0 = (zzcoy)this.zza.zzb();
        zzgzb.zzb(zzcan.zza);
        Set set0 = ((JSONObject)this.zzc.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzddo(zzcoy0, zzcan.zza));
        zzgzb.zzb(set0);
        return set0;
    }
}

