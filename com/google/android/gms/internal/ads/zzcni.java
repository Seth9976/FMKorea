package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Map;

public final class zzcni implements zzcms {
    private final Context zza;
    private final zzg zzb;

    public zzcni(Context context0) {
        this.zzb = zzt.zzo().zzh();
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        if(map0.isEmpty()) {
            return;
        }
        String s = (String)map0.get("gad_idless");
        if(s != null) {
            boolean z = Boolean.parseBoolean(s);
            this.zzb.zzH(z);
            if(z) {
                Context context0 = this.zza;
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue()) {
                    context0.deleteDatabase("OfflineUpload.db");
                }
                try {
                    zzfoi zzfoi0 = zzfoi.zzj(context0);
                    zzfoj zzfoj0 = zzfoj.zzi(context0);
                    zzfoi0.zzk();
                    zzfoi0.zzl();
                    zzfoj0.zzj();
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzcL)).booleanValue()) {
                        zzfoj0.zzk();
                    }
                    if(((Boolean)zzba.zzc().zzb(zzbbr.zzcM)).booleanValue()) {
                        zzfoj0.zzl();
                    }
                    goto label_22;
                }
                catch(IOException iOException0) {
                }
                zzt.zzo().zzu(iOException0, "clearStorageOnIdlessMode");
            }
        }
    label_22:
        map0.remove("gad_idless");
        Bundle bundle0 = new Bundle();
        for(Object object0: map0.entrySet()) {
            bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        zzt.zzn().zzr(bundle0);
    }
}

