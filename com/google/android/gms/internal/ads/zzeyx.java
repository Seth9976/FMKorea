package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

public final class zzeyx implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzeyx(zzgzg zzgzg0, zzgzg zzgzg1, zzgzg zzgzg2) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
        this.zzc = zzgzg2;
    }

    public final zzeyv zza() {
        Context context0 = (Context)this.zza.zzb();
        zzfdj zzfdj0 = (zzfdj)this.zzb.zzb();
        zzfeb zzfeb0 = (zzfeb)this.zzc.zzb();
        zzbzd zzbzd0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzgj)).booleanValue() ? zzt.zzo().zzh().zzh() : zzt.zzo().zzh().zzi();
        if(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzgz)))) > 0 && (!((Boolean)zzba.zzc().zzb(zzbbr.zzgi)).booleanValue() || zzbzd0 != null && zzbzd0.zzh())) {
            zzexz zzexz0 = new zzexz(new zzexw());
            zzfea zzfea0 = zzfeb0.zza(zzfdr.zzc, context0, zzfdj0, zzexz0);
            zzeyl zzeyl0 = new zzeyl(new zzeyk());
            zzeyh zzeyh0 = new zzeyh(zzfea0.zza, zzcan.zza);
            zzfdu zzfdu0 = zzfea0.zza.zza();
            return new zzeyb(zzeyl0, zzeyh0, zzfea0.zzb, zzfdu0.zzf, zzcan.zza);
        }
        return new zzeyk();
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        return this.zza();
    }
}

