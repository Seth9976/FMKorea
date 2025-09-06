package com.google.android.gms.internal.ads;

import java.io.EOFException;

public final class zzabf {
    public static int zza(zzabc zzabc0, byte[] arr_b, int v, int v1) {
        int v2;
        for(v2 = 0; v2 < v1; v2 += v3) {
            int v3 = zzabc0.zzb(arr_b, v + v2, v1 - v2);
            if(v3 == -1) {
                break;
            }
        }
        return v2;
    }

    public static void zzb(boolean z, String s) {
        if(!z) {
            throw zzcd.zza(s, null);
        }
    }

    public static boolean zzc(zzabc zzabc0, byte[] arr_b, int v, int v1, boolean z) {
        try {
            return zzabc0.zzm(arr_b, 0, v1, z);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw eOFException0;
            }
            return false;
        }
    }

    public static boolean zzd(zzabc zzabc0, byte[] arr_b, int v, int v1) {
        try {
            ((zzaar)zzabc0).zzn(arr_b, v, v1, false);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }

    public static boolean zze(zzabc zzabc0, int v) {
        try {
            ((zzaar)zzabc0).zzo(v, false);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }
}

