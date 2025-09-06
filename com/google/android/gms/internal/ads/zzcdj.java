package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzcdj implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzccj zzccj0 = (zzccj)object0;
        zzcge zzcge0 = zzccj0.zzq();
        try {
            if(zzcge0 == null) {
                zzcge zzcge1 = new zzcge(zzccj0, Float.parseFloat(((String)map0.get("duration"))), "1".equals(map0.get("customControlsAllowed")), "1".equals(map0.get("clickToExpandAllowed")));
                zzccj0.zzC(zzcge1);
                zzcge0 = zzcge1;
            }
            float f = Float.parseFloat(((String)map0.get("duration")));
            boolean z = "1".equals(map0.get("muted"));
            float f1 = Float.parseFloat(((String)map0.get("currentTime")));
            int v = Integer.parseInt(((String)map0.get("playbackState")));
            int v1 = v < 0 || v > 3 ? 0 : v;
            String s = (String)map0.get("aspectRatio");
            float f2 = TextUtils.isEmpty(s) ? 0.0f : Float.parseFloat(s);
            if(zzcaa.zzm(3)) {
                zzcaa.zze(("Video Meta GMSG: currentTime : " + f1 + " , duration : " + f + " , isMuted : " + z + " , playbackState : " + v1 + " , aspectRatio : " + s));
            }
            zzcge0.zzc(f1, f, v1, z, f2);
            return;
        }
        catch(NullPointerException | NumberFormatException nullPointerException0) {
        }
        zzcaa.zzh("Unable to parse videoMeta message.", nullPointerException0);
        zzt.zzo().zzu(nullPointerException0, "VideoMetaGmsgHandler.onGmsg");
    }
}

