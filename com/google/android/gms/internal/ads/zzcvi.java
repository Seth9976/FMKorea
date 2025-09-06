package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

final class zzcvi implements zzcxd, zzcxw {
    private final Context zza;
    private final zzfbe zzb;
    private final zzbsh zzc;

    public zzcvi(Context context0, zzfbe zzfbe0, zzbsh zzbsh0) {
        this.zza = context0;
        this.zzb = zzfbe0;
        this.zzc = zzbsh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzbsi zzbsi0 = this.zzb.zzae;
        if(zzbsi0 != null && zzbsi0.zza) {
            ArrayList arrayList0 = new ArrayList();
            if(!this.zzb.zzae.zzb.isEmpty()) {
                arrayList0.add(this.zzb.zzae.zzb);
            }
        }
    }
}

