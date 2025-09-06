package com.google.android.gms.internal.ads;

public final class zzct {
    public static final zzn zza;
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private static final String zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final String zzl;
    private zzd zzm;

    static {
        zzct.zzh = "0";
        zzct.zzi = "1";
        zzct.zzj = "2";
        zzct.zzk = "3";
        zzct.zzl = "4";
        zzct.zza = zzcs.zza;
    }

    public zzct() {
        this.zzm = zzd.zza;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzct.class.equals(class0) && zzfk.zzD(this.zzb, ((zzct)object0).zzb) && zzfk.zzD(this.zzc, ((zzct)object0).zzc) && this.zzd == ((zzct)object0).zzd && this.zze == ((zzct)object0).zze && this.zzg == ((zzct)object0).zzg && zzfk.zzD(this.zzm, ((zzct)object0).zzm);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.zzb == null ? 0 : this.zzb.hashCode();
        Object object0 = this.zzc;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (((((v1 + 0xD9) * 0x1F + v) * 0x1F + this.zzd) * 0x1F + ((int)(this.zze ^ this.zze >>> 0x20))) * 961 + this.zzg) * 0x1F + this.zzm.hashCode();
    }

    public final int zza(int v) {
        return this.zzm.zza(v).zzc;
    }

    public final int zzb() [...] // Inlined contents

    public final int zzc(long v) [...] // Inlined contents

    public final int zzd(long v) {
        return -1;
    }

    public final int zze(int v) {
        return this.zzm.zza(v).zza(-1);
    }

    public final int zzf(int v, int v1) {
        return this.zzm.zza(v).zza(v1);
    }

    public final int zzg() [...] // Inlined contents

    public final long zzh(int v, int v1) {
        zzc zzc0 = this.zzm.zza(v);
        return zzc0.zzc == -1 ? 0x8000000000000001L : zzc0.zzf[v1];
    }

    public final long zzi(int v) {
        return 0L;
    }

    public final long zzj() [...] // Inlined contents

    public final long zzk(int v) {
        return 0L;
    }

    public final zzct zzl(Object object0, Object object1, int v, long v1, long v2, zzd zzd0, boolean z) {
        this.zzb = object0;
        this.zzc = object1;
        this.zzd = v;
        this.zze = v1;
        this.zzf = 0L;
        this.zzm = zzd0;
        this.zzg = z;
        return this;
    }

    public final boolean zzm(int v) {
        return false;
    }

    public final boolean zzn(int v) {
        return false;
    }
}

