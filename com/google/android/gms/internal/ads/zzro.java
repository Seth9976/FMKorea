package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzro extends zzht {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzro() {
        super(2, 0);
        this.zzh = 0x20;
    }

    @Override  // com.google.android.gms.internal.ads.zzht
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzm() {
        return this.zzg;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final void zzo(int v) {
        this.zzh = v;
    }

    public final boolean zzp(zzht zzht0) {
        zzdy.zzd(!zzht0.zzd(0x40000000));
        zzdy.zzd(!zzht0.zzd(0x10000000));
        zzdy.zzd(!zzht0.zzd(4));
        if(!this.zzq() || this.zzg < this.zzh && zzht0.zzd(0x80000000) == this.zzd(0x80000000) && (zzht0.zzb == null || (this.zzb == null || this.zzb.position() + zzht0.zzb.remaining() <= 3072000))) {
            int v = this.zzg;
            this.zzg = v + 1;
            if(v == 0) {
                this.zzd = zzht0.zzd;
                if(zzht0.zzd(1)) {
                    this.zzc(1);
                }
            }
            if(zzht0.zzd(0x80000000)) {
                this.zzc(0x80000000);
            }
            ByteBuffer byteBuffer0 = zzht0.zzb;
            if(byteBuffer0 != null) {
                this.zzj(byteBuffer0.remaining());
                this.zzb.put(byteBuffer0);
            }
            this.zzf = zzht0.zzd;
            return true;
        }
        return false;
    }

    public final boolean zzq() {
        return this.zzg > 0;
    }
}

