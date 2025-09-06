package com.google.android.gms.internal.ads;

public final class zzati extends zzatm {
    public zzati(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "1OxyLDHu2cwu0U7XKtDO3q+DghLeQ8xcTgpGCDWDuEeCcfs+HPxSt8kldIfiq1K0", "Ee4p/yPQz67p3LoSNbpt1G8K9rDuoWxBYT8E4CbWyr8=", zzanv0, v, 0x30);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        this.zze.zzag(3);
        boolean z = ((Boolean)this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized(this.zze) {
            if(z) {
                this.zze.zzag(2);
            }
            else {
                this.zze.zzag(1);
            }
        }
    }
}

