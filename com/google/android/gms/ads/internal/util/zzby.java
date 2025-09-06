package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaf;

public final class zzby extends zzb {
    private final zzcaf zza;
    private final String zzb;

    public zzby(Context context0, String s, String s1) {
        String s2 = zzt.zzp().zzc(context0, s);
        super();
        this.zza = new zzcaf(s2);
        this.zzb = s1;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}

