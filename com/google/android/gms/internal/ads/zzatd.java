package com.google.android.gms.internal.ads;

public final class zzatd extends zzatm {
    private final boolean zzi;

    public zzatd(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "geU/I/uTOXqxXXxxH3B6ynfHIlx2RWpE/VU5AsRbtoXFRkvhLNXNLZCaFDUfdv6y", "1ZhioNexfONxLbr8oNixHPTbX/qv3RsJiyYoeeb0m+g=", zzanv0, v, 61);
        this.zzi = zzary0.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        long v = (long)(((Long)this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))));
        synchronized(this.zze) {
            this.zze.zzE(v);
        }
    }
}

