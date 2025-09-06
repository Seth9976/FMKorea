package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

public final class zzatc extends zzatm {
    private List zzi;
    private final Context zzj;

    public zzatc(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, Context context0) {
        super(zzary0, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", zzanv0, v, 0x1F);
        this.zzi = null;
        this.zzj = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        this.zze.zzW(-1L);
        this.zze.zzS(-1L);
        Context context0 = this.zzj == null ? this.zzb.zzb() : this.zzj;
        if(this.zzi == null) {
            this.zzi = (List)this.zzf.invoke(null, context0);
        }
        if(this.zzi != null && this.zzi.size() == 2) {
            synchronized(this.zze) {
                long v1 = (long)(((Long)this.zzi.get(0)));
                this.zze.zzW(v1);
                long v2 = (long)(((Long)this.zzi.get(1)));
                this.zze.zzS(v2);
            }
        }
    }
}

