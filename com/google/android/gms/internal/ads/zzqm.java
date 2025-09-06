package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzqm extends zzds {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzqm() {
        this.zzf = zzfk.zzf;
        this.zzg = zzfk.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer0) {
        int v6;
        while(byteBuffer0.hasRemaining() && !this.zzn()) {
            switch(this.zzh) {
                case 0: {
                    int v2 = byteBuffer0.limit();
                    byteBuffer0.limit(Math.min(v2, byteBuffer0.position() + this.zzf.length));
                    int v3 = byteBuffer0.limit();
                    do {
                        v3 -= 2;
                        if(v3 < byteBuffer0.position()) {
                            goto label_20;
                        }
                    }
                    while(Math.abs(byteBuffer0.getShort(v3)) <= 0x400);
                    int v4 = v3 / this.zzd * this.zzd + this.zzd;
                    goto label_21;
                label_20:
                    v4 = byteBuffer0.position();
                label_21:
                    if(v4 == byteBuffer0.position()) {
                        this.zzh = 1;
                    }
                    else {
                        byteBuffer0.limit(v4);
                        int v5 = byteBuffer0.remaining();
                        this.zzj(v5).put(byteBuffer0).flip();
                        if(v5 > 0) {
                            this.zzk = true;
                        }
                    }
                    byteBuffer0.limit(v2);
                    continue;
                }
                case 1: {
                    v6 = byteBuffer0.limit();
                    int v7 = this.zzr(byteBuffer0);
                    int v8 = v7 - byteBuffer0.position();
                    byte[] arr_b = this.zzf;
                    int v9 = this.zzi;
                    int v10 = arr_b.length - v9;
                    if(v7 < v6 && v8 < v10) {
                        this.zzs(arr_b, v9);
                        this.zzi = 0;
                        this.zzh = 0;
                        continue;
                    }
                    int v11 = Math.min(v8, v10);
                    byteBuffer0.limit(byteBuffer0.position() + v11);
                    byteBuffer0.get(this.zzf, this.zzi, v11);
                    int v12 = this.zzi + v11;
                    this.zzi = v12;
                    byte[] arr_b1 = this.zzf;
                    if(v12 == arr_b1.length) {
                        if(this.zzk) {
                            this.zzs(arr_b1, this.zzj);
                            int v13 = this.zzi;
                            this.zzl += (long)((v13 - (this.zzj + this.zzj)) / this.zzd);
                            v12 = v13;
                        }
                        else {
                            this.zzl += (long)((v12 - this.zzj) / this.zzd);
                        }
                        this.zzt(byteBuffer0, this.zzf, v12);
                        this.zzi = 0;
                        this.zzh = 2;
                    }
                    break;
                }
                default: {
                    int v = byteBuffer0.limit();
                    int v1 = this.zzr(byteBuffer0);
                    byteBuffer0.limit(v1);
                    this.zzl += (long)(byteBuffer0.remaining() / this.zzd);
                    this.zzt(byteBuffer0, this.zzg, this.zzj);
                    if(v1 >= v) {
                        continue;
                    }
                    this.zzs(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer0.limit(v);
                    continue;
                }
            }
            byteBuffer0.limit(v6);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    public final boolean zzg() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdp0) {
        if(zzdp0.zzd != 2) {
            throw new zzdq("Unhandled input format:", zzdp0);
        }
        return this.zze ? zzdp0 : zzdp.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    protected final void zzk() {
        if(this.zze) {
            this.zzd = this.zzb.zze;
            int v = this.zzq(150000L) * this.zzd;
            if(this.zzf.length != v) {
                this.zzf = new byte[v];
            }
            int v1 = this.zzq(20000L) * this.zzd;
            this.zzj = v1;
            if(this.zzg.length != v1) {
                this.zzg = new byte[v1];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    protected final void zzl() {
        int v = this.zzi;
        if(v > 0) {
            this.zzs(this.zzf, v);
        }
        if(!this.zzk) {
            this.zzl += (long)(this.zzj / this.zzd);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    protected final void zzm() {
        this.zze = false;
        this.zzj = 0;
        this.zzf = zzfk.zzf;
        this.zzg = zzfk.zzf;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z) {
        this.zze = z;
    }

    private final int zzq(long v) {
        return (int)(v * ((long)this.zzb.zzb) / 1000000L);
    }

    private final int zzr(ByteBuffer byteBuffer0) {
        for(int v = byteBuffer0.position(); v < byteBuffer0.limit(); v += 2) {
            if(Math.abs(byteBuffer0.getShort(v)) > 0x400) {
                return this.zzd * (v / this.zzd);
            }
        }
        return byteBuffer0.limit();
    }

    private final void zzs(byte[] arr_b, int v) {
        this.zzj(v).put(arr_b, 0, v).flip();
        if(v > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer0, byte[] arr_b, int v) {
        int v1 = Math.min(byteBuffer0.remaining(), this.zzj);
        int v2 = this.zzj - v1;
        System.arraycopy(arr_b, v - v2, this.zzg, 0, v2);
        byteBuffer0.position(byteBuffer0.limit() - v1);
        byteBuffer0.get(this.zzg, v2, v1);
    }
}

