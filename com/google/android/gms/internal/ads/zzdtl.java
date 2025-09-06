package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzdtl implements zzddb {
    private final Bundle zza;

    public zzdtl() {
        this.zza = new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zza(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzb(String s, String s1) {
        synchronized(this) {
            this.zza.putInt(s, 3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzc(String s) {
        synchronized(this) {
            this.zza.putInt(s, 1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzd(String s) {
        synchronized(this) {
            this.zza.putInt(s, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzf() {
    }

    public final Bundle zzg() {
        synchronized(this) {
            return new Bundle(this.zza);
        }
    }
}

