package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

public final class zzbyh {
    static Uri zza(String s, String s1, String s2) {
        int v = s.indexOf("&adurl");
        if(v == -1) {
            v = s.indexOf("?adurl");
        }
        return v == -1 ? Uri.parse(s).buildUpon().appendQueryParameter(s1, s2).build() : Uri.parse((s.substring(0, v + 1) + s1 + "=" + s2 + "&" + s.substring(v + 1)));
    }

    public static String zzb(Uri uri0, Context context0) {
        if(!zzt.zzn().zzu(context0)) {
            return uri0.toString();
        }
        String s = zzt.zzn().zza(context0);
        if(s == null) {
            return uri0.toString();
        }
        String s1 = (String)zzba.zzc().zzb(zzbbr.zzaf);
        String s2 = uri0.toString();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzae)).booleanValue() && s2.contains(s1)) {
            zzt.zzn().zzm(context0, s);
            return zzbyh.zzd(s2, context0).replace(s1, s);
        }
        if(!TextUtils.isEmpty(uri0.getQueryParameter("fbs_aeid"))) {
            return s2;
        }
        String s3 = zzbyh.zza(zzbyh.zzd(s2, context0), "fbs_aeid", s).toString();
        zzt.zzn().zzm(context0, s);
        return s3;
    }

    public static String zzc(String s, Context context0, boolean z) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzam)).booleanValue() && !z) {
            return s;
        }
        if(zzt.zzn().zzu(context0) && !TextUtils.isEmpty(s)) {
            String s1 = zzt.zzn().zza(context0);
            if(s1 == null) {
                return s;
            }
            String s2 = (String)zzba.zzc().zzb(zzbbr.zzaf);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzae)).booleanValue() && s.contains(s2)) {
                if(zzt.zzp().zzg(s)) {
                    zzt.zzn().zzm(context0, s1);
                    return zzbyh.zzd(s, context0).replace(s2, s1);
                }
                if(zzt.zzp().zzh(s)) {
                    zzt.zzn().zzn(context0, s1);
                    return zzbyh.zzd(s, context0).replace(s2, s1);
                }
            }
            else if(!s.contains("fbs_aeid")) {
                if(zzt.zzp().zzg(s)) {
                    zzt.zzn().zzm(context0, s1);
                    return zzbyh.zza(zzbyh.zzd(s, context0), "fbs_aeid", s1).toString();
                }
                if(zzt.zzp().zzh(s)) {
                    zzt.zzn().zzn(context0, s1);
                    return zzbyh.zza(zzbyh.zzd(s, context0), "fbs_aeid", s1).toString();
                }
            }
        }
        return s;
    }

    private static String zzd(String s, Context context0) {
        String s1 = zzt.zzn().zze(context0);
        String s2 = zzt.zzn().zzc(context0);
        if(!s.contains("gmp_app_id") && !TextUtils.isEmpty(s1)) {
            s = zzbyh.zza(s, "gmp_app_id", s1).toString();
        }
        return s.contains("fbs_aiid") || TextUtils.isEmpty(s2) ? s : zzbyh.zza(s, "fbs_aiid", s2).toString();
    }
}

