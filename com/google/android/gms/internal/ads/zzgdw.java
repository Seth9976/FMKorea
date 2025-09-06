package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgdw extends zzgfv {
    final zzgdx zza;

    zzgdw(zzgdx zzgdx0, Class class0) {
        this.zza = zzgdx0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzgma zzgma0 = (zzgma)zzgta0;
        zzglw zzglw0 = zzglx.zzc();
        zzglw0.zzb(0);
        zzglw0.zza(zzgqi.zzv(new byte[]{46, -67, -53, 25, (byte)0x84, -56, 0x73, -58, 4, -55, 97, 98, -14, 73, 49, -87, -61, 109, 0x79, -99, -16, -107, -21, -91, 58, 20, (byte)0xA0, -70, -30, 0x40, -52, -90}, 0, 0x20));
        return (zzglx)zzglw0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgma.zzd(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("CHACHA20_POLY1305", new zzgfu(zzgma.zzc(), 1));
        hashMap0.put("CHACHA20_POLY1305_RAW", new zzgfu(zzgma.zzc(), 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        zzgma zzgma0 = (zzgma)zzgta0;
    }
}

