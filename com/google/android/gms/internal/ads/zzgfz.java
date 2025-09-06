package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzgfz extends zzgah {
    private final zzghd zza;

    public zzgfz(zzghd zzghd0) {
        this.zza = zzghd0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzgfz)) {
            return false;
        }
        zzghd zzghd0 = ((zzgfz)object0).zza;
        return this.zza.zzc().zzf().equals(zzghd0.zzc().zzf()) && this.zza.zzc().zzh().equals(zzghd0.zzc().zzh()) && this.zza.zzc().zzg().equals(zzghd0.zzc().zzg());
    }

    @Override
    public final int hashCode() {
        zzgpo zzgpo0 = this.zza.zzd();
        return Arrays.hashCode(new Object[]{this.zza.zzc(), zzgpo0});
    }

    @Override
    public final String toString() {
        String s = this.zza.zzc().zzh();
        switch(this.zza.zzc().zzf().ordinal()) {
            case 1: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "TINK");
            }
            case 2: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "LEGACY");
            }
            case 3: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "RAW");
            }
            case 4: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "CRUNCHY");
            }
            default: {
                return String.format("(typeUrl=%s, outputPrefixType=%s)", s, "UNKNOWN");
            }
        }
    }

    public final zzghd zza() {
        return this.zza;
    }
}

