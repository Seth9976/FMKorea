package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgtm extends zzgqa {
    final zzgtq zza;
    zzgqc zzb;
    final zzgts zzc;

    zzgtm(zzgts zzgts0) {
        this.zzc = zzgts0;
        super();
        this.zza = new zzgtq(zzgts0, null);
        this.zzb = this.zzb();
    }

    @Override
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqc
    public final byte zza() {
        zzgqc zzgqc0 = this.zzb;
        if(zzgqc0 == null) {
            throw new NoSuchElementException();
        }
        byte b = zzgqc0.zza();
        if(!this.zzb.hasNext()) {
            this.zzb = this.zzb();
        }
        return b;
    }

    // 去混淆评级： 低(20)
    private final zzgqc zzb() {
        return this.zza.hasNext() ? this.zza.zza().zzs() : null;
    }
}

