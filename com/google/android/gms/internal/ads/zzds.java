package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class zzds implements zzdr {
    protected zzdp zzb;
    protected zzdp zzc;
    private zzdp zzd;
    private zzdp zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzds() {
        this.zzf = zzdr.zza;
        this.zzg = zzdr.zza;
        this.zzd = zzdp.zza;
        this.zze = zzdp.zza;
        this.zzb = zzdp.zza;
        this.zzc = zzdp.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final zzdp zza(zzdp zzdp0) {
        this.zzd = zzdp0;
        this.zze = this.zzi(zzdp0);
        return this.zzg() ? this.zze : zzdp.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer0 = this.zzg;
        this.zzg = zzdr.zza;
        return byteBuffer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zzc() {
        this.zzg = zzdr.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        this.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zzd() {
        this.zzh = true;
        this.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zzf() {
        this.zzc();
        this.zzf = zzdr.zza;
        this.zzd = zzdp.zza;
        this.zze = zzdp.zza;
        this.zzb = zzdp.zza;
        this.zzc = zzdp.zza;
        this.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public boolean zzg() {
        return this.zze != zzdp.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzdr
    public boolean zzh() {
        return this.zzh && this.zzg == zzdr.zza;
    }

    protected zzdp zzi(zzdp zzdp0) {
        throw null;
    }

    protected final ByteBuffer zzj(int v) {
        if(this.zzf.capacity() < v) {
            this.zzf = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
        }
        else {
            this.zzf.clear();
        }
        this.zzg = this.zzf;
        return this.zzf;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    protected final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}

