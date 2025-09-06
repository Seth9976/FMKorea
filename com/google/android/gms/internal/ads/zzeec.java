package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzeec implements zzedt {
    private final Context zza;
    private final zzcpq zzb;
    private final Executor zzc;

    zzeec(Context context0, zzcpq zzcpq0, Executor executor0) {
        this.zza = context0;
        this.zzb = zzcpq0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final Object zza(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        zzcst zzcst0 = new zzcst(zzfbr0, zzfbe0, zzedq0.zza);
        zzdet zzdet0 = new zzdet(new zzeeb(zzedq0), null);
        zzcpo zzcpo0 = new zzcpo(zzfbe0.zzab);
        zzcpn zzcpn0 = this.zzb.zza(zzcst0, zzdet0, zzcpo0);
        zzcpn0.zzd().zzo(new zzcns(((zzfcw)zzedq0.zzb)), this.zzc);
        zzeiu zzeiu0 = zzcpn0.zzj();
        ((zzefj)zzedq0.zzc).zzc(zzeiu0);
        return zzcpn0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbr0, zzfbe zzfbe0, zzedq zzedq0) {
        ((zzfcw)zzedq0.zzb).zzl(this.zza, zzfbr0.zza.zza.zzd, zzfbe0.zzw.toString(), ((zzbol)zzedq0.zzc));
    }
}

