package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

final class zzpj extends zzds {
    private int[] zzd;
    private int[] zze;

    @Override  // com.google.android.gms.internal.ads.zzdr
    public final void zze(ByteBuffer byteBuffer0) {
        int[] arr_v = this.zze;
        arr_v.getClass();
        int v = byteBuffer0.position();
        int v1 = byteBuffer0.limit();
        ByteBuffer byteBuffer1 = this.zzj((v1 - v) / this.zzb.zze * this.zzc.zze);
        while(v < v1) {
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                byteBuffer1.putShort(byteBuffer0.getShort(v + arr_v[v2] * 2));
            }
            v += this.zzb.zze;
        }
        byteBuffer0.position(v1);
        byteBuffer1.flip();
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    public final zzdp zzi(zzdp zzdp0) {
        int[] arr_v = this.zzd;
        if(arr_v == null) {
            return zzdp.zza;
        }
        if(zzdp0.zzd != 2) {
            throw new zzdq("Unhandled input format:", zzdp0);
        }
        int v = zzdp0.zzc == arr_v.length ? 0 : 1;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 >= zzdp0.zzc) {
                throw new zzdq("Unhandled input format:", zzdp0);
            }
            v |= (v2 == v1 ? 0 : 1);
        }
        return v == 0 ? zzdp.zza : new zzdp(zzdp0.zzb, arr_v.length, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    protected final void zzk() {
        this.zze = this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzds
    protected final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] arr_v) {
        this.zzd = arr_v;
    }
}

