package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbku;
import java.util.ArrayList;
import java.util.List;

final class zzei extends zzbku {
    final zzej zza;

    zzei(zzej zzej0, zzeh zzeh0) {
        this.zza = zzej0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbkv
    public final void zzb(List list0) {
        ArrayList arrayList0;
        synchronized(zzej.zzg(this.zza)) {
            zzej.zzk(this.zza, false);
            zzej.zzj(this.zza, true);
            arrayList0 = new ArrayList(zzej.zzi(this.zza));
            zzej.zzi(this.zza).clear();
        }
        InitializationStatus initializationStatus0 = zzej.zzd(list0);
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((OnInitializationCompleteListener)arrayList0.get(v1)).onInitializationComplete(initializationStatus0);
        }
    }
}

