package com.google.android.gms.internal.ads;

public class zzgsg {
    protected volatile zzgta zza;
    private static final zzgrc zzb;
    private volatile zzgqi zzc;

    static {
        zzgsg.zzb = zzgrc.zza;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzgsg)) {
            return false;
        }
        zzgta zzgta0 = this.zza;
        zzgta zzgta1 = ((zzgsg)object0).zza;
        if(zzgta0 == null && zzgta1 == null) {
            return this.zzb().equals(((zzgsg)object0).zzb());
        }
        if(zzgta0 != null && zzgta1 != null) {
            return zzgta0.equals(zzgta1);
        }
        if(zzgta0 != null) {
            ((zzgsg)object0).zzc(zzgta0.zzbf());
            return zzgta0.equals(((zzgsg)object0).zza);
        }
        this.zzc(zzgta1.zzbf());
        return this.zza.equals(zzgta1);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.zzc != null) {
            return ((zzgqe)this.zzc).zza.length;
        }
        return this.zza == null ? 0 : this.zza.zzaz();
    }

    public final zzgqi zzb() {
        if(this.zzc != null) {
            return this.zzc;
        }
        synchronized(this) {
            if(this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza == null ? zzgqi.zzb : this.zza.zzau();
            return this.zzc;
        }
    }

    protected final void zzc(zzgta zzgta0) {
        if(this.zza != null) {
            return;
        }
        synchronized(this) {
            if(this.zza == null) {
                this.zza = zzgta0;
                this.zzc = zzgqi.zzb;
            }
        }
    }
}

