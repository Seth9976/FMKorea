package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

public final class zzdjd implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    public zzdjd(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2, zzgzg zzgzg3, zzgzg zzgzg4, zzgzg zzgzg5, zzgzg zzgzg6, zzgzg zzgzg7, zzgzg zzgzg8) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
        this.zzd = zzgzg3;
        this.zze = zzgzg4;
        this.zzf = zzgzg5;
        this.zzg = zzgzg6;
        this.zzh = zzgzg7;
        this.zzi = zzgzg8;
    }

    public final zzdjc zza() {
        zzg zzg0 = ((zzchh)this.zza).zza();
        zzfca zzfca0 = ((zzcvz)this.zzb).zza();
        Object object0 = this.zzc.zzb();
        zzdic zzdic0 = ((zzdiv)this.zzd).zza();
        Object object1 = this.zze.zzb();
        Object object2 = this.zzf.zzb();
        Object object3 = this.zzg.zzb();
        zzgzb.zzb(zzcan.zza);
        Object object4 = this.zzi.zzb();
        return new zzdjc(zzg0, zzfca0, ((zzdih)object0), zzdic0, ((zzdjo)object1), ((zzdjw)object2), ((Executor)object3), zzcan.zza, ((zzdhz)object4));
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

