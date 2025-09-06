package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzart extends zzaph {
    public Long zza;
    public Long zzb;

    public zzart() {
    }

    public zzart(String s) {
        HashMap hashMap0 = zzaph.zza(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Long)hashMap0.get(1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaph
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        return hashMap0;
    }
}

