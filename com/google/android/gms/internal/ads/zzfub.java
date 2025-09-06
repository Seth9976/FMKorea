package com.google.android.gms.internal.ads;

final class zzfub extends zzfsd {
    private final zzfud zza;

    zzfub(zzfud zzfud0, int v) {
        super(zzfud0.size(), v);
        this.zza = zzfud0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfsd
    protected final Object zza(int v) {
        return this.zza.get(v);
    }
}

