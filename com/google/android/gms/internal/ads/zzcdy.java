package com.google.android.gms.internal.ads;

public final class zzcdy extends zzcdu {
    public zzcdy(zzccj zzccj0) {
        super(zzccj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzt(String s) {
        String s1 = zzbzt.zze(s);
        zzccj zzccj0 = (zzccj)this.zzc.get();
        if(zzccj0 != null && s1 != null) {
            zzccj0.zzt(s1, this);
        }
        zzcaa.zzj("VideoStreamNoopCache is doing nothing.");
        this.zzg(s, s1, "noop", "Noop cache is a noop.");
        return false;
    }
}

