package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzdlt implements zzauf {
    public final zzcfi zza;

    public zzdlt(zzcfi zzcfi0) {
        this.zza = zzcfi0;
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("isVisible", (zzaue0.zzj ? "1" : "0"));
        this.zza.zzd("onAdVisibilityChanged", hashMap0);
    }
}

