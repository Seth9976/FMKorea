package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdbc extends zzdbs implements zzbhj {
    public zzdbc(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbhj
    public final void zzb(String s, String s1) {
        synchronized(this) {
            this.zzt(new zzdbb(s, s1));
        }
    }
}

