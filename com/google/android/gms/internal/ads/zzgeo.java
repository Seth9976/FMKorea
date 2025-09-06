package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class zzgeo extends zzgfv {
    final zzgep zza;

    zzgeo(zzgep zzgep0, Class class0) {
        this.zza = zzgep0;
        super(class0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zza(zzgta zzgta0) {
        zzgof zzgof0 = (zzgof)zzgta0;
        zzgob zzgob0 = zzgoc.zzc();
        zzgob0.zzb(0);
        zzgob0.zza(zzgqi.zzv(new byte[]{61, -37, 110, 24, -18, 75, 35, -45, 82, 0x7B, 99, -106, 6, 0x77, 41, (byte)0x8A, -53, 0x40, (byte)0x83, (byte)0x83, -12, 89, -40, -74, -49, 4, 15, (byte)0x8D, -87, 36, 29, -6}, 0, 0x20));
        return (zzgoc)zzgob0.zzal();
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final zzgta zzb(zzgqi zzgqi0) {
        return zzgof.zze(zzgqi0, zzgrc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("XCHACHA20_POLY1305", new zzgfu(zzgof.zzd(), 1));
        hashMap0.put("XCHACHA20_POLY1305_RAW", new zzgfu(zzgof.zzd(), 3));
        return Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgfv
    public final void zzd(zzgta zzgta0) {
        zzgof zzgof0 = (zzgof)zzgta0;
    }
}

