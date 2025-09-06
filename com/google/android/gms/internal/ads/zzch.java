package com.google.android.gms.internal.ads;

import java.util.Locale;

public final class zzch {
    public static final zzch zza;
    public static final zzn zzb;
    public final float zzc;
    public final float zzd;
    private static final String zze;
    private static final String zzf;
    private final int zzg;

    static {
        zzch.zza = new zzch(1.0f, 1.0f);
        zzch.zze = "0";
        zzch.zzf = "1";
        zzch.zzb = zzcg.zza;
    }

    public zzch(float f, float f1) {
        boolean z = false;
        zzdy.zzd(Float.compare(f, 0.0f) > 0);
        if(f1 > 0.0f) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzc = f;
        this.zzd = f1;
        this.zzg = Math.round(f * 1000.0f);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzch.class == class0 && this.zzc == ((zzch)object0).zzc && this.zzd == ((zzch)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (Float.floatToRawIntBits(this.zzc) + 0x20F) * 0x1F + Float.floatToRawIntBits(this.zzd);
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", this.zzc, this.zzd);
    }

    public final long zza(long v) {
        return v * ((long)this.zzg);
    }
}

