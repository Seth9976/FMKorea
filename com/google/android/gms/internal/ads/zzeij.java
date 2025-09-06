package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzeij implements zzedt {
    private final Context zza;
    private final Executor zzb;
    private final zzdnv zzc;

    public zzeij(Context context0, Executor executor0, zzdnv zzdnv0) {
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = zzdnv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdns zzdns0 = new zzdns(new zzeif(zzedq0));
        zzdnr zzdnr0 = this.zzc.zze(zzcst0, zzdns0);
        zzdnr0.zzd().zzo(new zzcns(((zzfcw)zzedq0.zzb)), this.zzb);
        zzcxp zzcxp0 = zzdnr0.zze();
        zzcwg zzcwg0 = zzdnr0.zzb();
        zzeii zzeii0 = new zzeii(this, zzdnr0.zza(), zzcwg0, zzcxp0, zzdnr0.zzg());
        ((zzefk)zzedq0.zzc).zzc(zzeii0);
        return zzdnr0.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        if(!((zzfcw)zzedq0.zzb).zzC()) {
            zzeih zzeih0 = new zzeih(this, zzfbr0, zzfbe0, zzedq0);
            ((zzefk)zzedq0.zzc).zzd(zzeih0);
            ((zzfcw)zzedq0.zzb).zzh(this.zza, zzfbr0.zza.zza.zzd, null, ((zzbvo)zzedq0.zzc), zzfbe0.zzw.toString());
            return;
        }
        zzeij.zze(zzfbr0, zzfbe0, zzedq0);
    }

    static Executor zzc(zzeij zzeij0) {
        return zzeij0.zzb;
    }

    static void zzd(zzeij zzeij0, zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzeij.zze(zzfbr0, zzfbe0, zzedq0);
    }

    private static final void zze(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        try {
            ((zzfcw)zzedq0.zzb).zzk(zzfbr0.zza.zza.zzd, zzfbe0.zzw.toString());
        }
        catch(Exception exception0) {
            zzcaa.zzk(("Fail to load ad from adapter " + zzedq0.zza), exception0);
        }
    }
}

