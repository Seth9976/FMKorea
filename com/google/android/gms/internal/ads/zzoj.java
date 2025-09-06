package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

public final class zzoj {
    public static final zzoj zza;
    private static final zzfud zzb;
    private static final zzfug zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzoj.zza = new zzoj(new int[]{2}, 10);
        zzoj.zzb = zzfud.zzo(2, 5, 6);
        zzfuf zzfuf0 = new zzfuf();
        zzfuf0.zza(5, 6);
        zzfuf0.zza(17, 6);
        zzfuf0.zza(7, 6);
        zzfuf0.zza(30, 10);
        zzfuf0.zza(18, 6);
        zzfuf0.zza(6, 8);
        zzfuf0.zza(8, 8);
        zzfuf0.zza(14, 8);
        zzoj.zzc = zzfuf0.zzc();
    }

    public zzoj(int[] arr_v, int v) {
        int[] arr_v1 = Arrays.copyOf(arr_v, 1);
        this.zzd = arr_v1;
        Arrays.sort(arr_v1);
        this.zze = 10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzoj ? Arrays.equals(this.zzd, ((zzoj)object0).zzd) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzd) * 0x1F + 10;
    }

    @Override
    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.zzd) + "]";
    }

    public final Pair zza(zzam zzam0) {
        int v = 8;
        zzam0.zzm.getClass();
        int v1 = zzcc.zza(zzam0.zzm, zzam0.zzj);
        zzfug zzfug0 = zzoj.zzc;
        if(!zzfug0.containsKey(v1)) {
            return null;
        }
        if(v1 != 18) {
        label_11:
            if(v1 != 8) {
            label_17:
                if(v1 == 30 && !this.zzc(30)) {
                    v1 = 7;
                }
            }
            else if(this.zzc(8)) {
                v1 = 8;
                goto label_17;
            }
            else {
                v1 = 7;
            }
        }
        else if(!this.zzc(18)) {
            v1 = 6;
        }
        else {
            v1 = 18;
            goto label_11;
        }
        if(!this.zzc(v1)) {
            return null;
        }
        int v2 = zzam0.zzz;
        if(v2 == -1 || v1 == 18) {
            int v3 = zzam0.zzA == -1 ? 48000 : zzam0.zzA;
            if(zzfk.zza >= 29) {
                v2 = zzoi.zza(v1, v3);
            }
            else {
                Integer integer0 = (Integer)zzfug0.getOrDefault(v1, 0);
                integer0.getClass();
                v2 = (int)integer0;
            }
        }
        else if(zzam0.zzm.equals("audio/vnd.dts.uhd;profile=p2")) {
            if(v2 > 10) {
                return null;
            }
        }
        else if(v2 > 10) {
            return null;
        }
        int v4 = zzfk.zza;
        if(v4 <= 28) {
            switch(v2) {
                case 3: 
                case 4: 
                case 5: {
                    v = 6;
                    break;
                }
                case 7: {
                    break;
                }
                default: {
                    v = v2;
                }
            }
        }
        else {
            v = v2;
        }
        if(v4 <= 26 && "fugu".equals(zzfk.zzb) && v == 1) {
            v = 2;
        }
        int v5 = zzfk.zzg(v);
        return v5 == 0 ? null : Pair.create(v1, v5);
    }

    static zzfug zzb() {
        return zzoj.zzc;
    }

    public final boolean zzc(int v) {
        return Arrays.binarySearch(this.zzd, v) >= 0;
    }
}

