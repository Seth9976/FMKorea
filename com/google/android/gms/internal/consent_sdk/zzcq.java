package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

public final class zzcq {
    public static zzco zza(Context context0, String s) {
        String s1;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String[] arr_s = s.split("/", -1);
        if(arr_s.length == 1) {
            s1 = arr_s[0];
            return TextUtils.isEmpty("com.fmkorea.m.fmk_preferences") || TextUtils.isEmpty(s1) ? null : new zzco("com.fmkorea.m.fmk_preferences", s1);
        }
        if(arr_s.length == 2) {
            String s2 = arr_s[0];
            s1 = arr_s[1];
            return TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1) ? null : new zzco(s2, s1);
        }
        return null;
    }

    public static void zzb(Context context0, Set set0) {
        zzcp zzcp0 = new zzcp(context0);
        for(Object object0: set0) {
            String s = (String)object0;
            zzco zzco0 = zzcq.zza(context0, s);
            if(zzco0 == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: " + s);
            }
            else {
                zzcp0.zzd(zzco0.zza).remove(zzco0.zzb);
            }
        }
        zzcp0.zzb();
    }
}

