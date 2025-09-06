package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

public final class zzcmu implements zzcms {
    private final zzg zza;

    public zzcmu(zzg zzg0) {
        this.zza = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcms
    public final void zza(Map map0) {
        boolean z = Boolean.parseBoolean(((String)map0.get("content_url_opted_out")));
        this.zza.zzx(z);
    }
}

