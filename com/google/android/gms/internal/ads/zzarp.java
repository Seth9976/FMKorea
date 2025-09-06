package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzarp extends zzaph {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzarp() {
    }

    public zzarp(String s) {
        HashMap hashMap0 = zzaph.zza(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Boolean)hashMap0.get(1);
            this.zzc = (Boolean)hashMap0.get(2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaph
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        hashMap0.put(2, this.zzc);
        return hashMap0;
    }
}

