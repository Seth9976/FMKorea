package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzanf extends zzgya {
    ByteBuffer zza;

    public zzanf(String s) {
        super(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzgya
    public final void zzf(ByteBuffer byteBuffer0) {
        this.zza = byteBuffer0;
        byteBuffer0.position(byteBuffer0.position() + byteBuffer0.remaining());
    }
}

