package com.google.android.gms.internal.ads;

public final class zzate extends zzatm {
    private final StackTraceElement[] zzi;

    public zzate(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, StackTraceElement[] arr_stackTraceElement) {
        super(zzary0, "fxU2A2MjpZ4aJWGzXeMNURilSCaKosw3oXImrqnhSVmXB+tMi32JakdNlHCV3t0c", "+EF+l1eHEjuR445L5ETgD58eDQCcfhCypNm97kN1L/4=", zzanv0, v, 45);
        this.zzi = arr_stackTraceElement;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        int v = 1;
        StackTraceElement[] arr_stackTraceElement = this.zzi;
        if(arr_stackTraceElement != null) {
            zzarp zzarp0 = new zzarp(((String)this.zzf.invoke(null, arr_stackTraceElement)));
            synchronized(this.zze) {
                this.zze.zzF(((long)zzarp0.zza));
                if(zzarp0.zzb.booleanValue()) {
                    zzanv zzanv1 = this.zze;
                    if(!zzarp0.zzc.booleanValue()) {
                        v = 2;
                    }
                    zzanv1.zzac(v);
                }
                else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}

