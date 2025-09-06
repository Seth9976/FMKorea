package com.google.android.gms.internal.ads;

public final class zzath extends zzatm {
    private static volatile Long zzi;
    private static final Object zzj;

    static {
        zzath.zzj = new Object();
    }

    public zzath(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "pfTqFlR1an7kDUBzP8CmJZynZFAzKap0OWhefexY5E+9LoDEPq/g9ouqCw4/+GOX", "y+BEEb1lYOUGwTehZ9VIg/2gibmtEOjDZzKXHhs5BV0=", zzanv0, v, 33);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(zzath.zzi == null) {
            Object object0 = zzath.zzj;
            synchronized(object0) {
                if(zzath.zzi == null) {
                    zzath.zzi = (Long)this.zzf.invoke(null, null);
                }
            }
        }
        synchronized(this.zze) {
            this.zze.zzV(((long)zzath.zzi));
        }
    }
}

