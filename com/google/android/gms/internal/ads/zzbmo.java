package com.google.android.gms.internal.ads;

public final class zzbmo extends zzcaz {
    private final Object zza;
    private final zzbmt zzb;
    private boolean zzc;

    public zzbmo(zzbmt zzbmt0) {
        this.zza = new Object();
        this.zzb = zzbmt0;
    }

    static zzbmt zza(zzbmo zzbmo0) {
        return zzbmo0.zzb;
    }

    public final void zzb() {
        synchronized(this.zza) {
            if(this.zzc) {
                return;
            }
            this.zzc = true;
            this.zzi(new zzbml(this), new zzcav());
            this.zzi(new zzbmm(this), new zzbmn(this));
        }
    }
}

