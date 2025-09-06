package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public class zzht extends zzhn {
    public final zzhq zza;
    public ByteBuffer zzb;
    public boolean zzc;
    public long zzd;
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzbq.zzb("media3.decoder");
    }

    public zzht(int v, int v1) {
        this.zza = new zzhq();
        this.zzf = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzhn
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
        ByteBuffer byteBuffer1 = this.zze;
        if(byteBuffer1 != null) {
            byteBuffer1.clear();
        }
        this.zzc = false;
    }

    public final void zzj(int v) {
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 == null) {
            this.zzb = this.zzm(v);
            return;
        }
        int v1 = byteBuffer0.position();
        int v2 = v + v1;
        if(byteBuffer0.capacity() >= v2) {
            this.zzb = byteBuffer0;
            return;
        }
        ByteBuffer byteBuffer1 = this.zzm(v2);
        byteBuffer1.order(byteBuffer0.order());
        if(v1 > 0) {
            byteBuffer0.flip();
            byteBuffer1.put(byteBuffer0);
        }
        this.zzb = byteBuffer1;
    }

    public final void zzk() {
        ByteBuffer byteBuffer0 = this.zzb;
        if(byteBuffer0 != null) {
            byteBuffer0.flip();
        }
        ByteBuffer byteBuffer1 = this.zze;
        if(byteBuffer1 != null) {
            byteBuffer1.flip();
        }
    }

    public final boolean zzl() {
        return this.zzd(0x40000000);
    }

    private final ByteBuffer zzm(int v) {
        int v1 = this.zzf;
        if(v1 == 1) {
            return ByteBuffer.allocate(v);
        }
        if(v1 != 2) {
            throw new zzhs((this.zzb == null ? 0 : this.zzb.capacity()), v);
        }
        return ByteBuffer.allocateDirect(v);
    }
}

