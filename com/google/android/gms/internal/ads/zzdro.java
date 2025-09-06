package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class zzdro {
    protected final String zza;
    protected final Map zzb;
    protected final Executor zzc;
    protected final zzcaf zzd;
    protected final boolean zze;
    private final zzfgy zzf;
    private final boolean zzg;
    private final boolean zzh;

    protected zzdro(Executor executor0, zzcaf zzcaf0, zzfgy zzfgy0) {
        this.zza = "https://csi.gstatic.com/csi";
        this.zzb = new HashMap();
        this.zzc = executor0;
        this.zzd = zzcaf0;
        this.zze = ((Boolean)zzba.zzc().zzb(zzbbr.zzbU)).booleanValue();
        this.zzf = zzfgy0;
        this.zzg = ((Boolean)zzba.zzc().zzb(zzbbr.zzbX)).booleanValue();
        this.zzh = ((Boolean)zzba.zzc().zzb(zzbbr.zzgT)).booleanValue();
    }

    private final void zza(Map map0, boolean z) {
        if(!map0.isEmpty()) {
            String s = this.zzf.zza(map0);
            zze.zza(s);
            boolean z1 = Boolean.parseBoolean(((String)map0.get("scar")));
            if(this.zze && (!z || this.zzg) && (!z1 || this.zzh)) {
                zzdrn zzdrn0 = new zzdrn(this, s);
                this.zzc.execute(zzdrn0);
            }
            return;
        }
        zzcaa.zze("Empty paramMap.");
    }

    protected final String zzb(Map map0) {
        return this.zzf.zza(map0);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zzb);
    }

    public final void zzd(Map map0) {
        this.zza(map0, true);
    }

    public final void zze(Map map0) {
        this.zza(map0, false);
    }
}

