package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzdu implements zzdr {
    private int zzb;
    private float zzc;
    private float zzd;
    private zzdp zze;
    private zzdp zzf;
    private zzdp zzg;
    private zzdp zzh;
    private boolean zzi;
    private zzdt zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdu() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdp.zza;
        this.zzf = zzdp.zza;
        this.zzg = zzdp.zza;
        this.zzh = zzdp.zza;
        this.zzk = zzdr.zza;
        this.zzl = zzdr.zza.asShortBuffer();
        this.zzm = zzdr.zza;
        this.zzb = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdp0) {
        if(zzdp0.zzd != 2) {
            throw new zzdq("Unhandled input format:", zzdp0);
        }
        this.zze = zzdp0;
        zzdp zzdp1 = new zzdp((this.zzb == -1 ? zzdp0.zzb : this.zzb), zzdp0.zzc, 2);
        this.zzf = zzdp1;
        this.zzi = true;
        return zzdp1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final ByteBuffer zzb() {
        zzdt zzdt0 = this.zzj;
        if(zzdt0 != null) {
            int v = zzdt0.zza();
            if(v > 0) {
                if(this.zzk.capacity() < v) {
                    ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
                    this.zzk = byteBuffer0;
                    this.zzl = byteBuffer0.asShortBuffer();
                }
                else {
                    this.zzk.clear();
                    this.zzl.clear();
                }
                zzdt0.zzd(this.zzl);
                this.zzo += (long)v;
                this.zzk.limit(v);
                this.zzm = this.zzk;
            }
        }
        ByteBuffer byteBuffer1 = this.zzm;
        this.zzm = zzdr.zza;
        return byteBuffer1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        if(this.zzg()) {
            zzdp zzdp0 = this.zze;
            this.zzg = zzdp0;
            zzdp zzdp1 = this.zzf;
            this.zzh = zzdp1;
            if(this.zzi) {
                this.zzj = new zzdt(zzdp0.zzb, zzdp0.zzc, this.zzc, this.zzd, zzdp1.zzb);
            }
            else {
                zzdt zzdt0 = this.zzj;
                if(zzdt0 != null) {
                    zzdt0.zzc();
                }
            }
        }
        this.zzm = zzdr.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        zzdt zzdt0 = this.zzj;
        if(zzdt0 != null) {
            zzdt0.zze();
        }
        this.zzp = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer0) {
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        zzdt zzdt0 = this.zzj;
        zzdt0.getClass();
        ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
        int v = byteBuffer0.remaining();
        this.zzn += (long)v;
        zzdt0.zzf(shortBuffer0);
        byteBuffer0.position(byteBuffer0.position() + v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdp.zza;
        this.zzf = zzdp.zza;
        this.zzg = zzdp.zza;
        this.zzh = zzdp.zza;
        this.zzk = zzdr.zza;
        this.zzl = zzdr.zza.asShortBuffer();
        this.zzm = zzdr.zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final boolean zzg() {
        return this.zzf.zzb != -1 && (Float.compare(Math.abs(this.zzc - 1.0f), 0.0001f) >= 0 || Math.abs(this.zzd - 1.0f) >= 0.0001f || this.zzf.zzb != this.zze.zzb);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzdr
    public final boolean zzh() {
        return this.zzp && (this.zzj == null || this.zzj.zza() == 0);
    }

    public final long zzi(long v) {
        long v1 = this.zzo;
        if(v1 >= 0x400L) {
            long v2 = this.zzn;
            zzdt zzdt0 = this.zzj;
            zzdt0.getClass();
            long v3 = v2 - ((long)zzdt0.zzb());
            int v4 = this.zzh.zzb;
            int v5 = this.zzg.zzb;
            return v4 == v5 ? zzfk.zzq(v, v3, v1) : zzfk.zzq(v, v3 * ((long)v4), v1 * ((long)v5));
        }
        return (long)(((double)this.zzc) * ((double)v));
    }

    public final void zzj(float f) {
        if(this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if(this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}

