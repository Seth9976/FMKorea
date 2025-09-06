package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public class zzgyb extends zzgye implements zzanb {
    zzanc zza;
    protected final String zzb;

    public zzgyb(String s) {
        this.zzb = "moov";
    }

    @Override  // com.google.android.gms.internal.ads.zzanb
    public final String zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzanb
    public final void zzb(zzgyf zzgyf0, ByteBuffer byteBuffer0, long v, zzamy zzamy0) {
        zzgyf0.zzb();
        byteBuffer0.remaining();
        this.zzd = zzgyf0;
        this.zzf = zzgyf0.zzb();
        zzgyf0.zze(zzgyf0.zzb() + v);
        this.zzg = zzgyf0.zzb();
        this.zzc = zzamy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzanb
    public final void zzc(zzanc zzanc0) {
        this.zza = zzanc0;
    }
}

