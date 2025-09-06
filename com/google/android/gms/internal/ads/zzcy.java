package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzcy {
    public static final zzn zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;
    private static final String zze;
    private static final String zzf;
    private final zzam[] zzg;
    private int zzh;

    static {
        zzcy.zze = "0";
        zzcy.zzf = "1";
        zzcy.zza = zzcx.zza;
    }

    public zzcy(String s, zzam[] arr_zzam) {
        this.zzc = s;
        this.zzg = arr_zzam;
        this.zzb = 1;
        int v = zzcc.zzb(arr_zzam[0].zzm);
        if(v == -1) {
            v = zzcc.zzb(arr_zzam[0].zzl);
        }
        this.zzd = v;
        zzam zzam0 = arr_zzam[0];
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzcy.class == class0 && this.zzc.equals(((zzcy)object0).zzc) && Arrays.equals(this.zzg, ((zzcy)object0).zzg);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzh;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzg);
            v = (this.zzc.hashCode() + 0x20F) * 0x1F + v1;
            this.zzh = v;
        }
        return v;
    }

    public final int zza(zzam zzam0) {
        for(int v = 0; v <= 0; ++v) {
            if(zzam0 == this.zzg[v]) {
                return v;
            }
        }
        return -1;
    }

    public final zzam zzb(int v) {
        return this.zzg[v];
    }

    public final zzcy zzc(String s) {
        return new zzcy(s, this.zzg);
    }

    private static String zzd(String s) {
        return s == null || s.equals("und") ? "" : s;
    }
}

