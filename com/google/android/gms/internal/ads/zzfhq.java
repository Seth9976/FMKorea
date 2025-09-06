package com.google.android.gms.internal.ads;

import Z1.d;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

public final class zzfhq {
    public static void zza(d d0, zzfhr zzfhr0, zzfhg zzfhg0) {
        zzfhq.zzg(d0, zzfhr0, zzfhg0, false);
    }

    public static void zzb(d d0, zzfhr zzfhr0, zzfhg zzfhg0) {
        zzfhq.zzg(d0, zzfhr0, zzfhg0, true);
    }

    public static void zzc(d d0, zzfhr zzfhr0, zzfhg zzfhg0) {
        if(!((Boolean)zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        zzfye.zzr(zzfxv.zzu(d0), new zzfhp(zzfhr0, zzfhg0), zzcan.zzf);
    }

    public static void zzd(d d0, zzfhg zzfhg0) {
        if(!((Boolean)zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        zzfye.zzr(zzfxv.zzu(d0), new zzfhn(zzfhg0), zzcan.zzf);
    }

    // 去混淆评级： 低(20)
    public static boolean zze(String s) {
        return TextUtils.isEmpty(s) ? false : Pattern.matches(((String)zzba.zzc().zzb(zzbbr.zzit)), s);
    }

    public static int zzf(zzfca zzfca0) {
        switch(zzf.zze(zzfca0) - 1) {
            case 0: 
            case 1: {
                return 7;
            }
            default: {
                return 23;
            }
        }
    }

    private static void zzg(d d0, zzfhr zzfhr0, zzfhg zzfhg0, boolean z) {
        if(!((Boolean)zzbdd.zzc.zze()).booleanValue()) {
            return;
        }
        zzfye.zzr(zzfxv.zzu(d0), new zzfho(zzfhr0, zzfhg0, z), zzcan.zzf);
    }
}

