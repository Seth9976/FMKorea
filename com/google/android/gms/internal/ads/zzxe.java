package com.google.android.gms.internal.ads;

public final class zzxe {
    public final zzcy zza;
    public final int[] zzb;

    public zzxe(zzcy zzcy0, int[] arr_v, int v) {
        if(arr_v.length == 0) {
            zzes.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcy0;
        this.zzb = arr_v;
    }
}

