package com.google.android.gms.internal.ads;

final class zzuf implements zzxf {
    private final zzxf zza;
    private final zzcy zzb;

    public zzuf(zzxf zzxf0, zzcy zzcy0) {
        this.zza = zzxf0;
        this.zzb = zzcy0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzuf ? this.zza.equals(((zzuf)object0).zza) && this.zzb.equals(((zzuf)object0).zzb) : false;
    }

    @Override
    public final int hashCode() {
        return (this.zzb.hashCode() + 0x20F) * 0x1F + this.zza.hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final int zza(int v) {
        return this.zza.zza(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final int zzb(int v) {
        return this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final zzam zzd(int v) {
        return this.zza.zzd(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final zzcy zze() {
        return this.zzb;
    }
}

