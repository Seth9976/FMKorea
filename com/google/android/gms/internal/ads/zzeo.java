package com.google.android.gms.internal.ads;

final class zzeo {
    public final Object zza;
    private zzaf zzb;
    private boolean zzc;
    private boolean zzd;

    public zzeo(Object object0) {
        this.zza = object0;
        this.zzb = new zzaf();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzeo.class == class0 ? this.zza.equals(((zzeo)object0).zza) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int v, zzem zzem0) {
        if(!this.zzd) {
            if(v != -1) {
                this.zzb.zza(v);
            }
            this.zzc = true;
            zzem0.zza(this.zza);
        }
    }

    public final void zzb(zzen zzen0) {
        if(!this.zzd && this.zzc) {
            zzah zzah0 = this.zzb.zzb();
            this.zzb = new zzaf();
            this.zzc = false;
            zzen0.zza(this.zza, zzah0);
        }
    }

    public final void zzc(zzen zzen0) {
        this.zzd = true;
        if(this.zzc) {
            this.zzc = false;
            zzah zzah0 = this.zzb.zzb();
            zzen0.zza(this.zza, zzah0);
        }
    }
}

