package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzcde implements zzgyf {
    private final ByteBuffer zza;

    zzcde(ByteBuffer byteBuffer0) {
        this.zza = byteBuffer0.duplicate();
    }

    @Override
    public final void close() {
    }

    @Override  // com.google.android.gms.internal.ads.zzgyf
    public final int zza(ByteBuffer byteBuffer0) {
        if(this.zza.remaining() == 0 && byteBuffer0.remaining() > 0) {
            return -1;
        }
        int v = Math.min(byteBuffer0.remaining(), this.zza.remaining());
        byte[] arr_b = new byte[v];
        this.zza.get(arr_b);
        byteBuffer0.put(arr_b);
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgyf
    public final long zzb() {
        return (long)this.zza.position();
    }

    @Override  // com.google.android.gms.internal.ads.zzgyf
    public final long zzc() {
        return (long)this.zza.limit();
    }

    @Override  // com.google.android.gms.internal.ads.zzgyf
    public final ByteBuffer zzd(long v, long v1) {
        this.zza.position(((int)v));
        ByteBuffer byteBuffer0 = this.zza.slice();
        byteBuffer0.limit(((int)v1));
        this.zza.position(this.zza.position());
        return byteBuffer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgyf
    public final void zze(long v) {
        this.zza.position(((int)v));
    }
}

