package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

public final class zzack {
    public static int zza(int v) {
        int v1;
        for(v1 = 0; v > 0; ++v1) {
            v >>>= 1;
        }
        return v1;
    }

    public static zzbz zzb(List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < list0.size(); ++v) {
            String s = (String)list0.get(v);
            String[] arr_s = s.split("=", 2);
            if(arr_s.length != 2) {
                zzes.zzf("VorbisUtil", "Failed to parse Vorbis comment: " + s);
            }
            else if(arr_s[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList0.add(zzadx.zzb(new zzfb(Base64.decode(arr_s[1], 0))));
                }
                catch(RuntimeException runtimeException0) {
                    zzes.zzg("VorbisUtil", "Failed to parse vorbis picture", runtimeException0);
                }
            }
            else {
                arrayList0.add(new zzafk(arr_s[0], arr_s[1]));
            }
        }
        return arrayList0.isEmpty() ? null : new zzbz(arrayList0);
    }

    public static zzach zzc(zzfb zzfb0, boolean z, boolean z1) {
        if(z) {
            zzack.zzd(3, zzfb0, false);
        }
        String s = zzfb0.zzy(((int)zzfb0.zzr()), zzfqu.zzc);
        long v1 = zzfb0.zzr();
        String[] arr_s = new String[((int)v1)];
        int v2 = s.length() + 15;
        for(int v = 0; ((long)v) < v1; ++v) {
            String s1 = zzfb0.zzy(((int)zzfb0.zzr()), zzfqu.zzc);
            arr_s[v] = s1;
            v2 = v2 + 4 + s1.length();
        }
        if(z1 && (zzfb0.zzl() & 1) == 0) {
            throw zzcd.zza("framing bit expected to be set", null);
        }
        return new zzach(s, arr_s, v2 + 1);
    }

    public static boolean zzd(int v, zzfb zzfb0, boolean z) {
        if(zzfb0.zza() < 7) {
            if(!z) {
                throw zzcd.zza(("too short header: " + zzfb0.zza()), null);
            }
            return false;
        }
        if(zzfb0.zzl() != v) {
            if(!z) {
                throw zzcd.zza(("expected header type " + Integer.toHexString(v)), null);
            }
            return false;
        }
        if(zzfb0.zzl() == 0x76 && zzfb0.zzl() == 0x6F && zzfb0.zzl() == 0x72 && zzfb0.zzl() == 98 && zzfb0.zzl() == 105 && zzfb0.zzl() == 0x73) {
            return true;
        }
        if(!z) {
            throw zzcd.zza("expected characters \'vorbis\'", null);
        }
        return false;
    }
}

