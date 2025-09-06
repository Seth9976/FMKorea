package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

public final class zzegj implements zzedt {
    private final Context zza;
    private final zzdgm zzb;
    private final Executor zzc;

    public zzegj(Context context0, zzdgm zzdgm0, Executor executor0) {
        this.zza = context0;
        this.zzb = zzdgm0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzdic zzdic0;
        zzboq zzboq0 = ((zzfcw)zzedq0.zzb).zzD();
        zzbor zzbor0 = ((zzfcw)zzedq0.zzb).zzE();
        zzbou zzbou0 = ((zzfcw)zzedq0.zzb).zzd();
        if(zzbou0 != null && zzegj.zzc(zzfbr0, 6)) {
            zzdic0 = zzdic.zzt(zzbou0);
        }
        else {
            if(zzboq0 != null && zzegj.zzc(zzfbr0, 6)) {
                zzdic0 = zzdic.zzai(zzboq0);
                goto label_17;
            }
            if(zzboq0 != null && zzegj.zzc(zzfbr0, 2)) {
                zzdic0 = zzdic.zzag(zzboq0);
                goto label_17;
            }
            if(zzbor0 != null && zzegj.zzc(zzfbr0, 6)) {
                zzdic0 = zzdic.zzaj(zzbor0);
            }
            else if(zzbor0 != null && zzegj.zzc(zzfbr0, 1)) {
                zzdic0 = zzdic.zzah(zzbor0);
            }
            else {
                throw new zzehf(1, "No native ad mappers");
            }
        }
    label_17:
        String s = Integer.toString(zzdic0.zzc());
        if(!zzfbr0.zza.zza.zzg.contains(s)) {
            throw new zzehf(1, "No corresponding native ad listener");
        }
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdio zzdio0 = new zzdio(zzdic0);
        zzdkf zzdkf0 = new zzdkf(zzbor0, zzboq0, zzbou0);
        zzdie zzdie0 = this.zzb.zze(zzcst0, zzdio0, zzdkf0);
        zzeiu zzeiu0 = zzdie0.zzj();
        ((zzefj)zzedq0.zzc).zzc(zzeiu0);
        zzdie0.zzd().zzo(new zzcns(((zzfcw)zzedq0.zzb)), this.zzc);
        return zzdie0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        String s = zzbu.zzl(zzfbe0.zzt);
        ((zzfcw)zzedq0.zzb).zzp(this.zza, zzfbr0.zza.zza.zzd, zzfbe0.zzw.toString(), s, ((zzbol)zzedq0.zzc), zzfbr0.zza.zza.zzi, zzfbr0.zza.zza.zzg);
    }

    private static final boolean zzc(zzfbr zzfbr0, int v) {
        return zzfbr0.zza.zza.zzg.contains(Integer.toString(v));
    }
}

