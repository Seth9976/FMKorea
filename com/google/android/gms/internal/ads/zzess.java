package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class zzess implements zzesi {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzess(String s, int v, int v1, int v2, boolean z, int v3) {
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = z;
        this.zzf = v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        boolean z = TextUtils.isEmpty(this.zza);
        boolean z1 = true;
        zzfcm.zzf(((Bundle)object0), "carrier", this.zza, !z);
        int v = this.zzb;
        if(v == -2) {
            z1 = false;
        }
        zzfcm.zze(((Bundle)object0), "cnt", v, z1);
        ((Bundle)object0).putInt("gnt", this.zzc);
        ((Bundle)object0).putInt("pt", this.zzd);
        Bundle bundle0 = zzfcm.zza(((Bundle)object0), "device");
        ((Bundle)object0).putBundle("device", bundle0);
        Bundle bundle1 = zzfcm.zza(bundle0, "network");
        bundle0.putBundle("network", bundle1);
        bundle1.putInt("active_network_state", this.zzf);
        bundle1.putBoolean("active_network_metered", this.zze);
    }
}

