package com.google.android.gms.internal.ads;

public final class zztc implements zzvl {
    protected final zzvl[] zza;

    public zztc(zzvl[] arr_zzvl) {
        this.zza = arr_zzvl;
    }

    @Override  // com.google.android.gms.internal.ads.zzvl
    public final long zzb() {
        zzvl[] arr_zzvl = this.zza;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < arr_zzvl.length; ++v) {
            long v2 = arr_zzvl[v].zzb();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzvl
    public final long zzc() {
        zzvl[] arr_zzvl = this.zza;
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < arr_zzvl.length; ++v) {
            long v2 = arr_zzvl[v].zzc();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzvl
    public final void zzm(long v) {
        zzvl[] arr_zzvl = this.zza;
        for(int v1 = 0; v1 < arr_zzvl.length; ++v1) {
            arr_zzvl[v1].zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzvl
    public final boolean zzo(long v) {
        boolean z = false;
        do {
            long v1 = this.zzc();
            if(v1 == 0x8000000000000000L) {
                break;
            }
            zzvl[] arr_zzvl = this.zza;
            boolean z1 = false;
            for(int v2 = 0; v2 < arr_zzvl.length; ++v2) {
                zzvl zzvl0 = arr_zzvl[v2];
                long v3 = zzvl0.zzc();
                if(v3 == v1 || v3 != 0x8000000000000000L && v3 <= v) {
                    z1 |= zzvl0.zzo(v);
                }
            }
            z |= z1;
        }
        while(z1);
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzvl
    public final boolean zzp() {
        zzvl[] arr_zzvl = this.zza;
        for(int v = 0; v < arr_zzvl.length; ++v) {
            if(arr_zzvl[v].zzp()) {
                return true;
            }
        }
        return false;
    }
}

