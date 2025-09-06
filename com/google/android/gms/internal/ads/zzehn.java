package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzehn implements zzedt {
    private final Context zza;
    private final Executor zzb;
    private final zzdnv zzc;

    public zzehn(Context context0, Executor executor0, zzdnv zzdnv0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzdnv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdns zzdns0 = new zzdns(new zzehm(zzedq0));
        zzdnr zzdnr0 = this.zzc.zze(zzcst0, zzdns0);
        zzdnr0.zzd().zzo(new zzcns(((zzfcw)zzedq0.zzb)), this.zzb);
        zzeht zzeht0 = zzdnr0.zzm();
        ((zzefj)zzedq0.zzc).zzc(zzeht0);
        return zzdnr0.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            zzfca zzfca0 = zzfbr0.zza.zza;
            if(zzfca0.zzo.zza == 3) {
                ((zzfcw)zzedq0.zzb).zzr(this.zza, zzfca0.zzd, zzfbe0.zzw.toString(), ((zzbol)zzedq0.zzc));
                return;
            }
            ((zzfcw)zzedq0.zzb).zzq(this.zza, zzfca0.zzd, zzfbe0.zzw.toString(), ((zzbol)zzedq0.zzc));
            return;
        }
        catch(Exception exception0) {
        }
        zzcaa.zzk(("Fail to load ad from adapter " + zzedq0.zza), exception0);
    }
}

