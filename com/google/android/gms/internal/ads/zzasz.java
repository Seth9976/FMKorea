package com.google.android.gms.internal.ads;

public final class zzasz extends zzatm {
    private static volatile String zzi;
    private static final Object zzj;

    static {
        zzasz.zzj = new Object();
    }

    public zzasz(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "hMVcCX1S6+m7rVEDNdCHhVgXRFILMOQ9RgLSmTdPHeNgAU8CbmBsymKBuqLQcQaU", "3PwoDnm3HnsskB+3ZnJHoZ7BzV0InxUqaAwJBlSwKFs=", zzanv0, v, 1);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        this.zze.zzB("E");
        if(zzasz.zzi == null) {
            synchronized(zzasz.zzj) {
                if(zzasz.zzi == null) {
                    zzasz.zzi = (String)this.zzf.invoke(null, null);
                }
            }
        }
        synchronized(this.zze) {
            this.zze.zzB(zzasz.zzi);
        }
    }
}

