package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzamt;
import com.google.android.gms.internal.ads.zzbzz;
import java.util.Collections;
import java.util.Map;

final class zzbi extends zzamt {
    final byte[] zza;
    final Map zzb;
    final zzbzz zzc;

    zzbi(zzbo zzbo0, int v, String s, zzalu zzalu0, zzalt zzalt0, byte[] arr_b, Map map0, zzbzz zzbzz0) {
        this.zza = arr_b;
        this.zzb = map0;
        this.zzc = zzbzz0;
        super(v, s, zzalu0, zzalt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzalp
    public final Map zzl() {
        return this.zzb == null ? Collections.emptyMap() : this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzamt
    protected final void zzo(Object object0) {
        this.zzz(((String)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzalp
    public final byte[] zzx() {
        return this.zza == null ? null : this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzamt
    protected final void zzz(String s) {
        this.zzc.zzg(s);
        super.zzz(s);
    }
}

