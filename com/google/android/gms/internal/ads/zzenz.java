package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzenz implements zzesi {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;

    public zzenz(int v, boolean z, boolean z1, int v1, int v2, int v3, int v4, int v5, float f, boolean z2) {
        this.zza = v;
        this.zzb = z;
        this.zzc = z1;
        this.zzd = v1;
        this.zze = v2;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = v5;
        this.zzi = f;
        this.zzj = z2;
    }

    @Override  // com.google.android.gms.internal.ads.zzesi
    public final void zzj(Object object0) {
        ((Bundle)object0).putInt("am", this.zza);
        ((Bundle)object0).putBoolean("ma", this.zzb);
        ((Bundle)object0).putBoolean("sp", this.zzc);
        ((Bundle)object0).putInt("muv", this.zzd);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjS)).booleanValue()) {
            ((Bundle)object0).putInt("muv_min", this.zze);
            ((Bundle)object0).putInt("muv_max", this.zzf);
        }
        ((Bundle)object0).putInt("rm", this.zzg);
        ((Bundle)object0).putInt("riv", this.zzh);
        ((Bundle)object0).putFloat("android_app_volume", this.zzi);
        ((Bundle)object0).putBoolean("android_app_muted", this.zzj);
    }
}

