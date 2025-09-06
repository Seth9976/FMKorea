package com.google.android.gms.internal.ads;

public final class zzasu extends zzatm {
    private static volatile Long zzi;
    private static final Object zzj;

    static {
        zzasu.zzj = new Object();
    }

    public zzasu(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "1eWk7vHD3Ee+FybzKEoWLH07Pvdxo5flYR768ntLvpJZNSFjE7xgNzi+al9tiZC4", "w5tjCRfZfXWJzckDvIkXwf5aGJEVejLzfxhnwyqJH5E=", zzanv0, v, 22);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(zzasu.zzi == null) {
            Object object0 = zzasu.zzj;
            synchronized(object0) {
                if(zzasu.zzi == null) {
                    zzasu.zzi = (Long)this.zzf.invoke(null, null);
                }
            }
        }
        synchronized(this.zze) {
            this.zze.zzy(((long)zzasu.zzi));
        }
    }
}

