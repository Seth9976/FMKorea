package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzfxm extends zzfxo {
    zzfxm(zzfty zzfty0, boolean z) {
        super(zzfty0, z);
        this.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxo
    public final Object zzG(List list0) {
        ArrayList arrayList0 = zzfur.zza(list0.size());
        for(Object object0: list0) {
            zzfxn zzfxn0 = (zzfxn)object0;
            arrayList0.add((zzfxn0 == null ? null : zzfxn0.zza));
        }
        return Collections.unmodifiableList(arrayList0);
    }
}

