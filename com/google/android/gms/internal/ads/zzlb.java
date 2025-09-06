package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

final class zzlb implements zzqu, zzuc {
    final zzlf zza;
    private final zzld zzb;

    public zzlb(zzlf zzlf0, zzld zzld0) {
        this.zza = zzlf0;
        super();
        this.zzb = zzld0;
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzac(int v, zzts zzts0, zzto zzto0) {
        Pair pair0 = this.zzf(0, zzts0);
        if(pair0 != null) {
            zzkz zzkz0 = new zzkz(this, pair0, zzto0);
            zzlf.zzd(this.zza).zzh(zzkz0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzad(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        Pair pair0 = this.zzf(0, zzts0);
        if(pair0 != null) {
            zzlf.zzd(this.zza).zzh(new zzky(this, pair0, zztj0, zzto0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzae(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        Pair pair0 = this.zzf(0, zzts0);
        if(pair0 != null) {
            zzkx zzkx0 = new zzkx(this, pair0, zztj0, zzto0);
            zzlf.zzd(this.zza).zzh(zzkx0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzaf(int v, zzts zzts0, zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        Pair pair0 = this.zzf(0, zzts0);
        if(pair0 != null) {
            zzkw zzkw0 = new zzkw(this, pair0, zztj0, zzto0, iOException0, z);
            zzlf.zzd(this.zza).zzh(zzkw0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzuc
    public final void zzag(int v, zzts zzts0, zztj zztj0, zzto zzto0) {
        Pair pair0 = this.zzf(0, zzts0);
        if(pair0 != null) {
            zzla zzla0 = new zzla(this, pair0, zztj0, zzto0);
            zzlf.zzd(this.zza).zzh(zzla0);
        }
    }

    private final Pair zzf(int v, zzts zzts0) {
        zzts zzts2;
        zzts zzts1 = null;
        if(zzts0 != null) {
            zzld zzld0 = this.zzb;
            for(int v1 = 0; true; ++v1) {
                zzts2 = null;
                if(v1 >= zzld0.zzc.size()) {
                    break;
                }
                if(((zzts)zzld0.zzc.get(v1)).zzd == zzts0.zzd) {
                    zzts2 = zzts0.zzc(Pair.create(zzld0.zzb, zzts0.zza));
                    break;
                }
            }
            if(zzts2 == null) {
                return null;
            }
            zzts1 = zzts2;
        }
        return Pair.create(this.zzb.zzd, zzts1);
    }
}

