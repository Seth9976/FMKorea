package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

public final class zzatb extends zzatm {
    public zzatb(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "gcg2RhRsG0R6zuf6iT0eSF6U6iabmBM/me4U4ELIi5QicHmCf/u4OJEW9LFUXGGL", "I5l5b06e/m6OPcJVryww5aceHDWuWNMRDm4mYVrBvJQ=", zzanv0, v, 73);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        try {
            int v = 1;
            boolean z = ((Boolean)this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzanv zzanv0 = this.zze;
            if(z) {
                v = 2;
            }
            zzanv0.zzaf(v);
        }
        catch(InvocationTargetException unused_ex) {
            this.zze.zzaf(3);
        }
    }
}

