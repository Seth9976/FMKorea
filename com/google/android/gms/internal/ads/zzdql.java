package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class zzdql implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;

    public zzdql(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Set set0;
        String s = (String)this.zza.zzb();
        Context context0 = ((zzchj)this.zzb).zza();
        zzfyo zzfyo0 = zzcan.zza;
        zzgzb.zzb(zzfyo0);
        Map map0 = ((zzgyx)this.zzd).zzd();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeL)).booleanValue()) {
            zzaxe zzaxe0 = new zzaxe(new zzaxk(context0));
            zzaxe0.zzb(new zzdqm(s));
            set0 = Collections.singleton(new zzddo(new zzdqo(zzaxe0, map0), zzfyo0));
        }
        else {
            set0 = Collections.emptySet();
        }
        zzgzb.zzb(set0);
        return set0;
    }
}

