package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzgd extends zzgc {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzgd(byte[] arr_b) {
        boolean z = false;
        super(false);
        if(arr_b.length > 0) {
            z = true;
        }
        zzdy.zzd(z);
        this.zza = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        int v2 = this.zzd;
        if(v2 == 0) {
            return -1;
        }
        int v3 = Math.min(v1, v2);
        System.arraycopy(this.zza, this.zzc, arr_b, v, v3);
        this.zzc += v3;
        this.zzd -= v3;
        this.zzg(v3);
        return v3;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        this.zzb = zzgn0.zza;
        this.zzi(zzgn0);
        long v = zzgn0.zzf;
        if(v > ((long)this.zza.length)) {
            throw new zzgj(2008);
        }
        this.zzc = (int)v;
        int v1 = this.zza.length - ((int)v);
        this.zzd = v1;
        long v2 = zzgn0.zzg;
        if(v2 != -1L) {
            this.zzd = (int)Math.min(v1, v2);
        }
        this.zze = true;
        this.zzj(zzgn0);
        return zzgn0.zzg == -1L ? ((long)this.zzd) : zzgn0.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        if(this.zze) {
            this.zze = false;
            this.zzh();
        }
        this.zzb = null;
    }
}

