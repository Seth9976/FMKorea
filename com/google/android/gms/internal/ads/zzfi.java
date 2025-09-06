package com.google.android.gms.internal.ads;

public final class zzfi {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd;

    public zzfi(long v) {
        this.zzd = new ThreadLocal();
        this.zzf(0L);
    }

    public final long zza(long v) {
        synchronized(this) {
            if(!this.zzg()) {
                long v2 = this.zza;
                if(v2 == 0x7FFFFFFFFFFFFFFEL) {
                    Long long0 = (Long)this.zzd.get();
                    if(long0 == null) {
                        throw null;
                    }
                    v2 = (long)long0;
                }
                this.zzb = v2 - v;
                this.notifyAll();
            }
            this.zzc = v;
            return v + this.zzb;
        }
    }

    public final long zzb(long v) {
        synchronized(this) {
            return v == 0x8000000000000001L ? 0x8000000000000001L : this.zza(v * 1000000L / 90000L);
        }
    }

    public final long zzc() {
        synchronized(this) {
            long v = this.zza;
            if(v != 0x7FFFFFFFFFFFFFFFL && v != 0x7FFFFFFFFFFFFFFEL) {
                return v;
            }
        }
        return 0x8000000000000001L;
    }

    public final long zzd() {
        synchronized(this) {
            long v1 = this.zzc;
            return v1 == 0x8000000000000001L ? this.zzc() : v1 + this.zzb;
        }
    }

    public final long zze() {
        synchronized(this) {
        }
        return this.zzb;
    }

    public final void zzf(long v) {
        synchronized(this) {
            this.zza = v;
            this.zzb = Long.compare(v, 0x7FFFFFFFFFFFFFFFL) == 0 ? 0L : 0x8000000000000001L;
            this.zzc = 0x8000000000000001L;
        }
    }

    public final boolean zzg() {
        synchronized(this) {
        }
        return Long.compare(this.zzb, 0x8000000000000001L) != 0;
    }
}

