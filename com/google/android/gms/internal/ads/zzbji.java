package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzbji implements zzbir {
    private final zzbjh zza;

    public zzbji(zzbjh zzbjh0) {
        this.zza = zzbjh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzbvp zzbvp0;
        String s = (String)map0.get("action");
        if("grant".equals(s)) {
            try {
                zzbvp0 = null;
                int v = Integer.parseInt(((String)map0.get("amount")));
                String s1 = (String)map0.get("type");
                if(!TextUtils.isEmpty(s1)) {
                    zzbvp0 = new zzbvp(s1, v);
                }
            }
            catch(NumberFormatException numberFormatException0) {
                zzcaa.zzk("Unable to parse reward amount.", numberFormatException0);
            }
            this.zza.zza(zzbvp0);
            return;
        }
        if("video_start".equals(s)) {
            this.zza.zzc();
            return;
        }
        if("video_complete".equals(s)) {
            this.zza.zzb();
        }
    }

    public static void zzb(zzcfi zzcfi0, zzbjh zzbjh0) {
        zzcfi0.zzad("/reward", new zzbji(zzbjh0));
    }
}

