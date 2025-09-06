package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class zzwb implements zzxf {
    protected final zzcy zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzam[] zzd;
    private int zze;

    public zzwb(zzcy zzcy0, int[] arr_v, int v) {
        zzdy.zzf(arr_v.length > 0);
        zzcy0.getClass();
        this.zza = zzcy0;
        this.zzb = arr_v.length;
        this.zzd = new zzam[arr_v.length];
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            this.zzd[v2] = zzcy0.zzb(arr_v[v2]);
        }
        Arrays.sort(this.zzd, zzwa.zza);
        this.zzc = new int[this.zzb];
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            this.zzc[v1] = zzcy0.zza(this.zzd[v1]);
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.zza == ((zzwb)object0).zza && Arrays.equals(this.zzc, ((zzwb)object0).zzc);
    }

    @Override
    public final int hashCode() {
        int v = this.zze;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zzc);
            v = System.identityHashCode(this.zza) * 0x1F + v1;
            this.zze = v;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final int zza(int v) {
        return this.zzc[0];
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final int zzb(int v) {
        for(int v1 = 0; v1 < this.zzb; ++v1) {
            if(this.zzc[v1] == v) {
                return v1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final int zzc() {
        return this.zzc.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final zzam zzd(int v) {
        return this.zzd[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzxj
    public final zzcy zze() {
        return this.zza;
    }
}

