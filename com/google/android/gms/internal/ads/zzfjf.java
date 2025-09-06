package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;

public final class zzfjf implements zzfji {
    protected final zzfkd zza;
    private static final zzfjf zzb;
    private Date zzc;
    private boolean zzd;
    private final zzfjj zze;
    private boolean zzf;

    static {
        zzfjf.zzb = new zzfjf(new zzfjj());
    }

    private zzfjf(zzfjj zzfjj0) {
        this.zza = new zzfkd();
        this.zze = zzfjj0;
    }

    public static zzfjf zza() {
        return zzfjf.zzb;
    }

    public final Date zzb() {
        return this.zzc == null ? null : ((Date)this.zzc.clone());
    }

    @Override  // com.google.android.gms.internal.ads.zzfji
    public final void zzc(boolean z) {
        if(!this.zzf && z) {
            Date date0 = new Date();
            if(this.zzc == null || date0.after(this.zzc)) {
                this.zzc = date0;
                if(this.zzd) {
                    for(Object object0: zzfjh.zza().zzb()) {
                        ((zzfit)object0).zzg().zze(this.zzb());
                    }
                }
            }
        }
        this.zzf = z;
    }

    public final void zzd(Context context0) {
        if(!this.zzd) {
            this.zze.zzd(context0);
            this.zze.zze(this);
            this.zze.zzf();
            this.zzf = this.zze.zza;
            this.zzd = true;
        }
    }
}

