package com.google.android.gms.internal.ads;

import java.io.EOFException;

public final class zzabs {
    private final zzfb zza;

    public zzabs() {
        this.zza = new zzfb(10);
    }

    public final zzbz zza(zzabc zzabc0, zzaep zzaep0) {
        zzbz zzbz0 = null;
        int v;
        for(v = 0; true; v += v2) {
            try {
                ((zzaar)zzabc0).zzm(this.zza.zzI(), 0, 10, false);
            }
            catch(EOFException unused_ex) {
                break;
            }
            this.zza.zzG(0);
            if(this.zza.zzn() != 4801587) {
                break;
            }
            this.zza.zzH(3);
            int v1 = this.zza.zzk();
            int v2 = v1 + 10;
            if(zzbz0 == null) {
                byte[] arr_b = new byte[v2];
                System.arraycopy(this.zza.zzI(), 0, arr_b, 0, 10);
                ((zzaar)zzabc0).zzm(arr_b, 10, v1, false);
                zzbz0 = zzaer.zza(arr_b, v2, zzaep0, new zzads());
            }
            else {
                ((zzaar)zzabc0).zzl(v1, false);
            }
        }
        zzabc0.zzj();
        ((zzaar)zzabc0).zzl(v, false);
        return zzbz0;
    }
}

