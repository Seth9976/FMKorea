package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzekb extends zzbm {
    private final zzeli zza;

    public zzekb(Context context0, zzchd zzchd0, zzfby zzfby0, zzdin zzdin0, zzbh zzbh0) {
        zzelk zzelk0 = new zzelk(zzdin0, zzchd0.zzy());
        zzelk0.zze(zzbh0);
        this.zza = new zzeli(new zzelu(zzchd0, context0, zzelk0, zzfby0), zzfby0.zzI());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        synchronized(this) {
            return this.zza.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        synchronized(this) {
            return this.zza.zzb();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzl0) {
        this.zza.zzd(zzl0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzl0, int v) {
        synchronized(this) {
            this.zza.zzd(zzl0, v);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        synchronized(this) {
            return this.zza.zze();
        }
    }
}

