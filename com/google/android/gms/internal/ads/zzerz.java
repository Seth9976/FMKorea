package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzerz implements zzesi {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    zzerz(boolean z, boolean z1, String s, boolean z2, int v, int v1, int v2, String s1) {
        this.zza = z;
        this.zzb = z1;
        this.zzc = s;
        this.zzd = z2;
        this.zze = v;
        this.zzf = v1;
        this.zzg = v2;
        this.zzh = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putString("js", this.zzc);
        ((Bundle)object0).putBoolean("is_nonagon", true);
        ((Bundle)object0).putString("extra_caps", ((String)zzba.zzc().zzb(zzbbr.zzdx)));
        ((Bundle)object0).putInt("target_api", this.zze);
        ((Bundle)object0).putInt("dv", this.zzf);
        ((Bundle)object0).putInt("lv", this.zzg);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzfN)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            ((Bundle)object0).putString("ev", this.zzh);
        }
        Bundle bundle0 = zzfcm.zza(((Bundle)object0), "sdk_env");
        bundle0.putBoolean("mf", ((Boolean)zzbdk.zza.zze()).booleanValue());
        bundle0.putBoolean("instant_app", this.zza);
        bundle0.putBoolean("lite", this.zzb);
        bundle0.putBoolean("is_privileged_process", this.zzd);
        ((Bundle)object0).putBundle("sdk_env", bundle0);
        Bundle bundle1 = zzfcm.zza(bundle0, "build_meta");
        bundle1.putString("cl", "559203513");
        bundle1.putString("rapid_rc", "dev");
        bundle1.putString("rapid_rollup", "HEAD");
        bundle0.putBundle("build_meta", bundle1);
    }
}

