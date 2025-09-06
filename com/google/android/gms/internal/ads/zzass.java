package com.google.android.gms.internal.ads;

public final class zzass extends zzatm {
    private final zzarz zzi;

    public zzass(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, zzarz zzarz0) {
        super(zzary0, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", zzanv0, v, 85);
        this.zzi = zzarz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        long[] arr_v = (long[])this.zzf.invoke(null, this.zzi.zzd(), this.zzi.zzh(), this.zzi.zzb(), this.zzi.zzf());
        synchronized(this.zze) {
            this.zze.zzv(arr_v[0]);
            this.zze.zzu(arr_v[1]);
        }
    }
}

