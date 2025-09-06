package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

class zzhw extends zzhx {
    protected final byte[] zzb;

    zzhw(byte[] arr_b) {
        arr_b.getClass();
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzhm)) {
            return false;
        }
        if(this.zzb() != ((zzhm)object0).zzb()) {
            return false;
        }
        if(this.zzb() == 0) {
            return true;
        }
        if(object0 instanceof zzhw) {
            int v = this.zza();
            int v1 = ((zzhw)object0).zza();
            return v == 0 || v1 == 0 || v == v1 ? this.zza(((zzhw)object0), 0, this.zzb()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    public byte zza(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    public final zzhm zza(int v, int v1) {
        int v2 = zzhm.zza(0, v1, this.zzb());
        return v2 == 0 ? zzhm.zza : new zzhq(this.zzb, this.zze(), v2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    protected final String zza(Charset charset0) {
        int v = this.zzb();
        return new String(this.zzb, this.zze(), v, charset0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    final void zza(zzhn zzhn0) {
        int v = this.zzb();
        zzhn0.zza(this.zzb, this.zze(), v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhx
    final boolean zza(zzhm zzhm0, int v, int v1) {
        if(v1 > zzhm0.zzb()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.zzb());
        }
        if(v1 > zzhm0.zzb()) {
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + v1 + ", " + zzhm0.zzb());
        }
        if(zzhm0 instanceof zzhw) {
            byte[] arr_b = this.zzb;
            byte[] arr_b1 = ((zzhw)zzhm0).zzb;
            int v2 = this.zze();
            int v3 = this.zze();
            for(int v4 = ((zzhw)zzhm0).zze(); v3 < v2 + v1; ++v4) {
                if(arr_b[v3] != arr_b1[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        return zzhm0.zza(0, v1).equals(this.zza(0, v1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    byte zzb(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    public int zzb() {
        return this.zzb.length;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    protected final int zzb(int v, int v1, int v2) {
        return zziz.zza(v, this.zzb, this.zze(), v2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhm
    public final boolean zzd() {
        int v = this.zze();
        int v1 = this.zzb();
        return zzmh.zzc(this.zzb, v, v1 + v);
    }

    protected int zze() {
        return 0;
    }
}

