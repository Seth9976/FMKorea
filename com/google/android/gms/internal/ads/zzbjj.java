package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;

public final class zzbjj implements zzbir {
    private final Context zza;

    public zzbjj(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        if(map0.containsKey("text") && !TextUtils.isEmpty(((CharSequence)map0.get("text")))) {
            zze.zza(("Opening Share Sheet with text: " + ((String)map0.get("text"))));
            Intent intent0 = new Intent();
            intent0.setAction("android.intent.action.SEND");
            intent0.setType("text/plain");
            intent0.putExtra("android.intent.extra.TEXT", ((String)map0.get("text")));
            if(map0.containsKey("title")) {
                intent0.putExtra("android.intent.extra.TITLE", ((String)map0.get("title")));
            }
            try {
                zzs.zzQ(this.zza, intent0);
            }
            catch(RuntimeException runtimeException0) {
                zzcaa.zzk("Failed to open Share Sheet", runtimeException0);
                zzt.zzo().zzu(runtimeException0, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}

