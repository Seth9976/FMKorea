package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

final class zzcnf implements zzcms {
    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjw)).booleanValue() && !map0.isEmpty()) {
            String s = (String)map0.get("is_topics_ad_personalization_allowed");
            if(!TextUtils.isEmpty(s)) {
                zzt.zzo().zzh().zzI(Boolean.parseBoolean(s));
            }
        }
    }
}

