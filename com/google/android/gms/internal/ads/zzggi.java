package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class zzggi {
    private static final zzggi zza;
    private final AtomicReference zzb;

    static {
        try {
            zzggi zzggi0 = new zzggi();
            zzggi0.zzf(new zzgfq(zzgfy.class, zzghc.class, zzggh.zza));
            zzggi.zza = zzggi0;
        }
        catch(Exception exception0) {
            throw new zzghp(exception0);
        }
    }

    public zzggi() {
        this.zzb = new AtomicReference(new zzgho(new zzghi(), null));
    }

    public final zzfzp zza(zzghc zzghc0, zzgas zzgas0) {
        return !((zzgho)this.zzb.get()).zzh(zzghc0) ? new zzgfy(zzghc0, zzgas0) : ((zzgho)this.zzb.get()).zza(zzghc0, zzgas0);
    }

    public final zzgah zzb(zzghh zzghh0) {
        return ((zzgho)this.zzb.get()).zzb(zzghh0);
    }

    public static zzggi zzc() {
        return zzggi.zza;
    }

    public final zzghh zzd(zzgah zzgah0, Class class0) {
        return ((zzgho)this.zzb.get()).zzc(zzgah0, class0);
    }

    public final void zze(zzgfp zzgfp0) {
        synchronized(this) {
            zzghi zzghi0 = new zzghi(((zzgho)this.zzb.get()));
            zzghi0.zza(zzgfp0);
            zzgho zzgho0 = new zzgho(zzghi0, null);
            this.zzb.set(zzgho0);
        }
    }

    public final void zzf(zzgft zzgft0) {
        synchronized(this) {
            zzghi zzghi0 = new zzghi(((zzgho)this.zzb.get()));
            zzghi0.zzb(zzgft0);
            zzgho zzgho0 = new zzgho(zzghi0, null);
            this.zzb.set(zzgho0);
        }
    }

    public final void zzg(zzggm zzggm0) {
        synchronized(this) {
            zzghi zzghi0 = new zzghi(((zzgho)this.zzb.get()));
            zzghi0.zzc(zzggm0);
            zzgho zzgho0 = new zzgho(zzghi0, null);
            this.zzb.set(zzgho0);
        }
    }

    public final void zzh(zzggq zzggq0) {
        synchronized(this) {
            zzghi zzghi0 = new zzghi(((zzgho)this.zzb.get()));
            zzghi0.zzd(zzggq0);
            zzgho zzgho0 = new zzgho(zzghi0, null);
            this.zzb.set(zzgho0);
        }
    }

    public final boolean zzi(zzghh zzghh0) {
        return ((zzgho)this.zzb.get()).zzi(zzghh0);
    }
}

