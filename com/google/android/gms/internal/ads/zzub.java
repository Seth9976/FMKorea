package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzub {
    public final int zza;
    public final zzts zzb;
    private final CopyOnWriteArrayList zzc;

    public zzub() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzub(CopyOnWriteArrayList copyOnWriteArrayList0, int v, zzts zzts0) {
        this.zzc = copyOnWriteArrayList0;
        this.zza = 0;
        this.zzb = zzts0;
    }

    public final zzub zza(int v, zzts zzts0) {
        return new zzub(this.zzc, 0, zzts0);
    }

    public final void zzb(Handler handler0, zzuc zzuc0) {
        zzua zzua0 = new zzua(handler0, zzuc0);
        this.zzc.add(zzua0);
    }

    public final void zzc(zzto zzto0) {
        for(Object object0: this.zzc) {
            zztv zztv0 = new zztv(this, ((zzua)object0).zzb, zzto0);
            zzfk.zzG(((zzua)object0).zza, zztv0);
        }
    }

    public final void zzd(zztj zztj0, zzto zzto0) {
        for(Object object0: this.zzc) {
            zztw zztw0 = new zztw(this, ((zzua)object0).zzb, zztj0, zzto0);
            zzfk.zzG(((zzua)object0).zza, zztw0);
        }
    }

    public final void zze(zztj zztj0, zzto zzto0) {
        for(Object object0: this.zzc) {
            zztz zztz0 = new zztz(this, ((zzua)object0).zzb, zztj0, zzto0);
            zzfk.zzG(((zzua)object0).zza, zztz0);
        }
    }

    public final void zzf(zztj zztj0, zzto zzto0, IOException iOException0, boolean z) {
        for(Object object0: this.zzc) {
            zztx zztx0 = new zztx(this, ((zzua)object0).zzb, zztj0, zzto0, iOException0, z);
            zzfk.zzG(((zzua)object0).zza, zztx0);
        }
    }

    public final void zzg(zztj zztj0, zzto zzto0) {
        for(Object object0: this.zzc) {
            zzty zzty0 = new zzty(this, ((zzua)object0).zzb, zztj0, zzto0);
            zzfk.zzG(((zzua)object0).zza, zzty0);
        }
    }

    public final void zzh(zzuc zzuc0) {
        for(Object object0: this.zzc) {
            zzua zzua0 = (zzua)object0;
            if(zzua0.zzb == zzuc0) {
                this.zzc.remove(zzua0);
            }
        }
    }
}

