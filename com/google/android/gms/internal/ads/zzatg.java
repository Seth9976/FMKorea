package com.google.android.gms.internal.ads;

public final class zzatg extends zzatm {
    private final zzasf zzi;
    private long zzj;

    public zzatg(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, zzasf zzasf0) {
        super(zzary0, "nIX5dAPvXYWFIvHlyxyLt0TnZ91UnAjFxZwf2qcoWSGcs+p5B5p88VCOzepPfMpE", "qUEdP6yfmpdCkPVqoE8EyrX/MPjGh4YKRo5g3kOeMoc=", zzanv0, v, 53);
        this.zzi = zzasf0;
        if(zzasf0 != null) {
            this.zzj = zzasf0.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(this.zzi != null) {
            long v = (long)(((Long)this.zzf.invoke(null, this.zzj)));
            this.zze.zzP(v);
        }
    }
}

