package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzdcz extends zzdbs implements zzddb {
    public zzdcz(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zza(String s) {
        this.zzt(new zzdcy("MalformedJson"));
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzb(String s, String s1) {
        this.zzt(new zzdcw(s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzc(String s) {
        this.zzt(new zzdcv(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzd(String s) {
        this.zzt(new zzdcx(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zze() {
        this.zzt((zzdcu this) -> ((zzddb)object0).zze());
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzf() {
        this.zzt((zzdct this) -> ((zzddb)object0).zzf());
    }
}

