package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzasc extends zzaph {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;

    public zzasc() {
    }

    public zzasc(String s) {
        HashMap hashMap0 = zzaph.zza(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Long)hashMap0.get(1);
            this.zzc = (Long)hashMap0.get(2);
            this.zzd = (Long)hashMap0.get(3);
            this.zze = (Long)hashMap0.get(4);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaph
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        hashMap0.put(2, this.zzc);
        hashMap0.put(3, this.zzd);
        hashMap0.put(4, this.zze);
        return hashMap0;
    }
}

