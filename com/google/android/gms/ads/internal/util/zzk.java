package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbzs;

public final class zzk implements zzbzs {
    public final Context zza;
    public final String zzb;

    public zzk(Context context0, String s) {
        this.zza = context0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbzs
    public final boolean zza(String s) {
        zzs.zzI(this.zza, this.zzb, s);
        return true;
    }
}

