package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

public final class zzdhh implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdhh(zzgzg zzgzg0, zzgzg zzgzg1) {
        this.zza = zzgzg0;
        this.zzb = zzgzg1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Context context0 = (Context)this.zza.zzb();
        zzfbe zzfbe0 = ((zzcsu)this.zzb).zza();
        return new zzddq(context0, new HashSet(), zzfbe0);
    }
}

