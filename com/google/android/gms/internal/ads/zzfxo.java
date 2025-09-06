package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

abstract class zzfxo extends zzfxd {
    private List zza;

    zzfxo(zzfty zzfty0, boolean z) {
        super(zzfty0, z, true);
        List list0 = zzfty0.isEmpty() ? Collections.emptyList() : zzfur.zza(zzfty0.size());
        for(int v = 0; v < zzfty0.size(); ++v) {
            list0.add(null);
        }
        this.zza = list0;
    }

    abstract Object zzG(List arg1);

    @Override  // com.google.android.gms.internal.ads.zzfxd
    final void zzf(int v, Object object0) {
        List list0 = this.zza;
        if(list0 != null) {
            list0.set(v, new zzfxn(object0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    final void zzu() {
        List list0 = this.zza;
        if(list0 != null) {
            this.zzc(this.zzG(list0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfxd
    final void zzy(int v) {
        super.zzy(v);
        this.zza = null;
    }
}

