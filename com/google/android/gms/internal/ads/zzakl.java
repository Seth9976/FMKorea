package com.google.android.gms.internal.ads;

import android.util.Pair;

final class zzakl {
    public static Pair zza(zzabc zzabc0) {
        zzabc0.zzj();
        zzakk zzakk0 = zzakl.zzd(1684108385, zzabc0, new zzfb(8));
        ((zzaar)zzabc0).zzo(8, false);
        return Pair.create(zzabc0.zzf(), zzakk0.zzb);
    }

    public static zzakj zzb(zzabc zzabc0) {
        byte[] arr_b1;
        zzfb zzfb0 = new zzfb(16);
        zzakk zzakk0 = zzakl.zzd(0x666D7420, zzabc0, zzfb0);
        zzdy.zzf(Long.compare(zzakk0.zzb, 16L) >= 0);
        ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, 16, false);
        zzfb0.zzG(0);
        int v = zzfb0.zzj();
        int v1 = zzfb0.zzj();
        int v2 = zzfb0.zzi();
        int v3 = zzfb0.zzi();
        int v4 = zzfb0.zzj();
        int v5 = zzfb0.zzj();
        int v6 = ((int)zzakk0.zzb) - 16;
        if(v6 > 0) {
            byte[] arr_b = new byte[v6];
            ((zzaar)zzabc0).zzm(arr_b, 0, v6, false);
            arr_b1 = arr_b;
        }
        else {
            arr_b1 = zzfk.zzf;
        }
        ((zzaar)zzabc0).zzo(((int)(zzabc0.zze() - zzabc0.zzf())), false);
        return new zzakj(v, v1, v2, v3, v4, v5, arr_b1);
    }

    public static boolean zzc(zzabc zzabc0) {
        zzfb zzfb0 = new zzfb(8);
        switch(zzakk.zza(zzabc0, zzfb0).zza) {
            case 1380333108: 
            case 1380533830: {
                ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, 4, false);
                zzfb0.zzG(0);
                int v = zzfb0.zzf();
                if(v != 0x57415645) {
                    zzes.zzc("WavHeaderReader", "Unsupported form type: " + v);
                    return false;
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static zzakk zzd(int v, zzabc zzabc0, zzfb zzfb0) {
        zzakk zzakk0 = zzakk.zza(zzabc0, zzfb0);
        int v1;
        while((v1 = zzakk0.zza) != v) {
            zzes.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + v1);
            long v2 = zzakk0.zzb + 8L;
            if(v2 > 0x7FFFFFFFL) {
                throw zzcd.zzc(("Chunk is too large (~2GB+) to skip; id: " + zzakk0.zza));
            }
            ((zzaar)zzabc0).zzo(((int)v2), false);
            zzakk0 = zzakk.zza(zzabc0, zzfb0);
        }
        return zzakk0;
    }
}

