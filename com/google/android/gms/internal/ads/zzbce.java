package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class zzbce extends zzbcf {
    @Override  // com.google.android.gms.internal.ads.zzbcf
    public final String zza(String s, String s1) {
        String s2 = zzbce.zzb(s);
        String s3 = zzbce.zzb(s1);
        if(TextUtils.isEmpty(s2)) {
            return s3;
        }
        return TextUtils.isEmpty(s3) ? s2 : s2 + "," + s3;
    }

    private static final String zzb(String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        int v = s.length();
        int v1;
        for(v1 = 0; v1 < s.length() && s.charAt(v1) == 44; ++v1) {
        }
        while(v > 0 && s.charAt(v - 1) == 44) {
            --v;
        }
        if(v < v1) {
            return null;
        }
        if(v1 == 0) {
            return v == s.length() ? s : s.substring(0, v);
        }
        return s.substring(v1, v);
    }
}

