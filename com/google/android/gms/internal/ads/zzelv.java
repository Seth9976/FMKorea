package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import androidx.core.content.a;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzelv implements zzesj {
    private final Context zza;

    zzelv(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzcF)).booleanValue()) {
            return a.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0 ? zzfye.zzh(new zzelw(true)) : zzfye.zzh(new zzelw(false));
        }
        return zzfye.zzh(null);
    }
}

