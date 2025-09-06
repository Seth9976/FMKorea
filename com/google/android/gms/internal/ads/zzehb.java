package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

final class zzehb implements zzfya {
    final long zza;
    final String zzb;
    final zzfbe zzc;
    final zzfbi zzd;
    final zzfig zze;
    final zzfbr zzf;
    final zzehc zzg;

    zzehb(zzehc zzehc0, long v, String s, zzfbe zzfbe0, zzfbi zzfbi0, zzfig zzfig0, zzfbr zzfbr0) {
        this.zzg = zzehc0;
        this.zza = v;
        this.zzb = s;
        this.zzc = zzfbe0;
        this.zzd = zzfbi0;
        this.zze = zzfig0;
        this.zzf = zzfbr0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        Integer integer0;
        int v2;
        int v = 6;
        long v1 = this.zzg.zza.elapsedRealtime() - this.zza;
        if(throwable0 instanceof TimeoutException) {
            v2 = 2;
            integer0 = null;
        }
        else if(throwable0 instanceof zzegp) {
            v2 = 3;
            integer0 = null;
        }
        else if(throwable0 instanceof CancellationException) {
            v2 = 4;
            integer0 = null;
        }
        else if(throwable0 instanceof zzfcf) {
            v2 = 5;
            integer0 = null;
        }
        else if(throwable0 instanceof zzdve) {
            if(zzfdb.zza(throwable0).zza == 3) {
                v = 1;
            }
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbz)).booleanValue() || !(throwable0 instanceof zzedr)) {
                v2 = v;
                integer0 = null;
            }
            else {
                zze zze0 = ((zzedr)throwable0).zzb();
                if(zze0 == null) {
                    v2 = v;
                    integer0 = null;
                }
                else {
                    integer0 = zze0.zza;
                    v2 = v;
                }
            }
        }
        else {
            v2 = 6;
            integer0 = null;
        }
        zzehc.zzg(this.zzg, this.zzb, v2, v1, this.zzc.zzag, integer0);
        zzehc zzehc0 = this.zzg;
        if(zzehc0.zze) {
            zzehc0.zzb.zza(this.zzd, this.zzc, v2, (throwable0 instanceof zzedr ? ((zzedr)throwable0) : null), v1);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhY)).booleanValue()) {
            this.zzg.zzc.zzd(this.zze.zzc(this.zzf, this.zzc, this.zzc.zzo));
        }
        zze zze1 = zzfdb.zza(throwable0);
        if((zze1.zza == 0 || zze1.zza == 3) && (zze1.zzd != null && !zze1.zzd.zzc.equals("com.google.android.gms.ads"))) {
            zze1 = zzfdb.zza(new zzedr(13, zze1.zzd));
        }
        this.zzg.zzf.zze(this.zzc, v1, zze1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        long v = zzehc.zzd(this.zzg).elapsedRealtime() - this.zza;
        zzehc.zzg(this.zzg, this.zzb, 0, v, this.zzc.zzag, null);
        zzehc zzehc0 = this.zzg;
        if(zzehc.zzh(zzehc0)) {
            zzehc.zzb(zzehc0).zza(this.zzd, this.zzc, 0, null, v);
        }
        zzehc.zza(this.zzg).zzf(this.zzc, v, null);
    }
}

