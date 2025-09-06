package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

final class zzbhz implements zzbir {
    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        zzcfi zzcfi0 = (zzcfi)object0;
        if(TextUtils.isEmpty(((CharSequence)map0.get("appId")))) {
            zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfpl zzfpl0 = zzfpm.zzj();
        zzfpl0.zzb(((String)map0.get("appId")));
        zzfpl0.zzh(zzcfi0.getWidth());
        zzfpl0.zzg(zzcfi0.zzF().getWindowToken());
        if(!map0.containsKey("gravityX") || !map0.containsKey("gravityY")) {
            zzfpl0.zzd(81);
        }
        else {
            int v = Integer.parseInt(((String)map0.get("gravityY")));
            zzfpl0.zzd(Integer.parseInt(((String)map0.get("gravityX"))) | v);
        }
        if(map0.containsKey("verticalMargin")) {
            zzfpl0.zze(Float.parseFloat(((String)map0.get("verticalMargin"))));
        }
        else {
            zzfpl0.zze(0.02f);
        }
        if(map0.containsKey("enifd")) {
            zzfpl0.zza(((String)map0.get("enifd")));
        }
        try {
            zzt.zzj().zzj(zzcfi0, zzfpl0.zzi());
        }
        catch(NullPointerException nullPointerException0) {
            zzt.zzo().zzu(nullPointerException0, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}

