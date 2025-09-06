package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfca;
import java.util.Map;

public final class zzf {
    public static String zza(String s) {
        if(TextUtils.isEmpty(s)) {
            return "unspecified";
        }
        switch(s) {
            case "requester_type_0": {
                return "0";
            }
            case "requester_type_1": {
                return "1";
            }
            case "requester_type_2": {
                return "2";
            }
            case "requester_type_3": {
                return "3";
            }
            case "requester_type_4": {
                return "4";
            }
            case "requester_type_5": {
                return "5";
            }
            case "requester_type_6": {
                return "6";
            }
            case "requester_type_7": {
                return "7";
            }
            case "requester_type_8": {
                return "8";
            }
            default: {
                return s;
            }
        }
    }

    public static String zzb(zzl zzl0) {
        return zzl0.zzc == null ? "unspecified" : zzl0.zzc.getString("query_info_type");
    }

    public static void zzc(zzdrm zzdrm0, zzdrc zzdrc0, String s, Pair[] arr_pair) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgS)).booleanValue()) {
            return;
        }
        zze zze0 = () -> {
            Map map0 = zzdrc0 == null ? zzdrm0.zzc() : zzdrc0.zza();
            zzf.zzf(map0, "action", s);
            for(int v = 0; v < arr_pair.length; ++v) {
                Pair pair0 = arr_pair[v];
                zzf.zzf(map0, ((String)pair0.first), ((String)pair0.second));
            }
            zzdrm0.zze(map0);
        };
        zzcan.zza.execute(zze0);
    }

    // 检测为 Lambda 实现
    static void zzd(zzdrm zzdrm0, zzdrc zzdrc0, String s, Pair[] arr_pair) [...]

    public static int zze(zzfca zzfca0) {
        if(zzfca0.zzq) {
            return 2;
        }
        zzl zzl0 = zzfca0.zzd;
        zzc zzc0 = zzl0.zzs;
        if(zzc0 == null && zzl0.zzx == null) {
            return 1;
        }
        if(zzc0 != null && zzl0.zzx != null) {
            return 5;
        }
        return zzc0 == null ? 4 : 3;
    }

    private static void zzf(Map map0, String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            map0.put(s, s1);
        }
    }
}

