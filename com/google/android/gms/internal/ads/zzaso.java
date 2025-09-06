package com.google.android.gms.internal.ads;

public final class zzaso extends zzatm {
    private static volatile Long zzi;
    private static final Object zzj;

    static {
        zzaso.zzj = new Object();
    }

    public zzaso(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "ttuIHg/yfWDxJlotLoMLf9WBnVTbWFFKY03C8KHR8FAhIQHccw4LaDLJatYkpo23", "xLOAO7msIR4UFUyldUn5stL2wwbLdISu2CSlTLg4f6Q=", zzanv0, v, 44);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(zzaso.zzi == null) {
            Object object0 = zzaso.zzj;
            synchronized(object0) {
                if(zzaso.zzi == null) {
                    zzaso.zzi = (Long)this.zzf.invoke(null, null);
                }
            }
        }
        synchronized(this.zze) {
            this.zze.zzo(((long)zzaso.zzi));
        }
    }
}

