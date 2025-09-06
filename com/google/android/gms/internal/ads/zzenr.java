package com.google.android.gms.internal.ads;

import Z1.d;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzenr implements zzesj {
    private static final Object zza;
    private final String zzb;
    private final String zzc;
    private final zzctv zzd;
    private final zzfdh zze;
    private final zzfca zzf;
    private final zzg zzg;
    private final zzdrc zzh;

    static {
        zzenr.zza = new Object();
    }

    public zzenr(String s, String s1, zzctv zzctv0, zzfdh zzfdh0, zzfca zzfca0, zzdrc zzdrc0) {
        this.zzb = s;
        this.zzc = s1;
        this.zzd = zzctv0;
        this.zze = zzfdh0;
        this.zzf = zzfca0;
        this.zzg = zzt.zzo().zzh();
        this.zzh = zzdrc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 12;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        Bundle bundle0 = new Bundle();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhq)).booleanValue()) {
            this.zzh.zza().put("seq_num", this.zzb);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzfu)).booleanValue()) {
            this.zzd.zzk(this.zzf.zzd);
            bundle0.putAll(this.zze.zzb());
        }
        return zzfye.zzh((Bundle bundle1) -> {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzfu)).booleanValue()) {
                bundle1.putBundle("quality_signals", bundle0);
            }
            else if(((Boolean)zzba.zzc().zzb(zzbbr.zzft)).booleanValue()) {
                synchronized(zzenr.zza) {
                    this.zzd.zzk(this.zzf.zzd);
                    bundle1.putBundle("quality_signals", this.zze.zzb());
                }
            }
            else {
                this.zzd.zzk(this.zzf.zzd);
                bundle1.putBundle("quality_signals", this.zze.zzb());
            }
            bundle1.putString("seq_num", this.zzb);
            if(!this.zzg.zzQ()) {
                bundle1.putString("session_id", this.zzc);
            }
            bundle1.putBoolean("client_purpose_one", !this.zzg.zzQ());
        });
    }

    // 检测为 Lambda 实现
    final void zzc(Bundle bundle0, Bundle bundle1) [...]
}

