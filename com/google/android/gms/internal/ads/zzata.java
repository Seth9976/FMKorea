package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

public final class zzata extends zzatm {
    public zzata(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1) {
        super(zzary0, "zmLnsak1Fo/LHy30EeWswBCxcOoFKuH08l3DkSTUgzb476o6nI+C8ZUC+d8tLJwZ", "sK9i540XcONymgaiZVMKYXr1VbNcwMhjwo2LFhhSCFg=", zzanv0, v, 3);
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        Boolean boolean0 = (Boolean)zzba.zzc().zzb(zzbbr.zzcw);
        boolean0.booleanValue();
        zzare zzare0 = new zzare(((String)this.zzf.invoke(null, this.zzb.zzb(), boolean0)));
        synchronized(this.zze) {
            this.zze.zzj(zzare0.zza);
            this.zze.zzC(zzare0.zzb);
        }
    }
}

