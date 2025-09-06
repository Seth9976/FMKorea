package com.google.android.gms.internal.ads;

public final class zzasn extends zzatm {
    public zzasn(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "ZHFOx+FjaOsul7gEkIcfA8auDnyRWXmT0qbiHVEO6U1RLulNSOFK3tPEgm+pvQxr", "RSyr2AK130nKbepDTsaNV0Uv17TWUb4O6ebIiV3GgVs=", zzanv0, v, 5);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        this.zze.zzm(-1L);
        this.zze.zzl(-1L);
        int[] arr_v = (int[])this.zzf.invoke(null, this.zzb.zzb());
        synchronized(this.zze) {
            this.zze.zzm(((long)arr_v[0]));
            this.zze.zzl(((long)arr_v[1]));
            int v1 = arr_v[2];
            if(v1 != 0x80000000) {
                this.zze.zzk(((long)v1));
            }
        }
    }
}

