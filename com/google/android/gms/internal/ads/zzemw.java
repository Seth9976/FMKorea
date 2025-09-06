package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzemw implements zzesj {
    private final zzfyo zza;
    private final zzdpc zzb;
    private final zzdtj zzc;
    private final zzemy zzd;

    public zzemw(zzfyo zzfyo0, zzdpc zzdpc0, zzdtj zzdtj0, zzemy zzemy0) {
        this.zza = zzfyo0;
        this.zzb = zzdpc0;
        this.zzc = zzdtj0;
        this.zzd = zzemy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzbbj zzbbj0 = zzbbr.zzku;
        if(((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() && this.zzd.zza() != null) {
            zzemx zzemx0 = this.zzd.zza();
            zzemx0.getClass();
            return zzfye.zzh(zzemx0);
        }
        if(!zzfrx.zzd(((String)zzba.zzc().zzb(zzbbr.zzbo))) && (((Boolean)zzba.zzc().zzb(zzbbj0)).booleanValue() || !this.zzd.zzd() && this.zzc.zzt())) {
            this.zzd.zzc(true);
            zzemv zzemv0 = () -> {
                Bundle bundle1;
                zzfcw zzfcw0;
                List list0 = Arrays.asList(((String)zzba.zzc().zzb(zzbbr.zzbo)).split(";"));
                Bundle bundle0 = new Bundle();
                for(Object object0: list0) {
                    String s = (String)object0;
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        zzfcw0 = this.zzb.zzc(s, jSONObject0);
                        zzfcw0.zzC();
                        bundle1 = new Bundle();
                        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzku)).booleanValue() || this.zzc.zzt()) {
                            goto label_11;
                        }
                        goto label_14;
                    }
                    catch(zzfcf unused_ex) {
                        continue;
                    }
                    try {
                    label_11:
                        zzbqq zzbqq0 = zzfcw0.zzf();
                        if(zzbqq0 != null) {
                            bundle1.putString("sdk_version", zzbqq0.toString());
                        }
                    }
                    catch(zzfcf unused_ex) {
                    }
                    try {
                    label_14:
                        zzbqq zzbqq1 = zzfcw0.zze();
                        if(zzbqq1 != null) {
                            bundle1.putString("adapter_version", zzbqq1.toString());
                        }
                    }
                    catch(zzfcf unused_ex) {
                    }
                    try {
                        bundle0.putBundle(s, bundle1);
                    }
                    catch(zzfcf unused_ex) {
                    }
                }
                zzemx zzemx0 = new zzemx(bundle0);
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzku)).booleanValue()) {
                    this.zzd.zzb(zzemx0);
                }
                return zzemx0;
            };
            return this.zza.zzb(zzemv0);
        }
        return zzfye.zzh(new zzemx(new Bundle()));
    }

    // 检测为 Lambda 实现
    final zzemx zzc() [...]
}

