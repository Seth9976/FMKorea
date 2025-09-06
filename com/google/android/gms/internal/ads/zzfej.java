package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

public final class zzfej {
    private final zzfdn zza;
    private final zzfeh zzb;
    private final zzfdj zzc;
    private final ArrayDeque zzd;
    private zzfep zze;
    private int zzf;

    public zzfej(zzfdn zzfdn0, zzfdj zzfdj0, zzfeh zzfeh0) {
        this.zzf = 1;
        this.zza = zzfdn0;
        this.zzc = zzfdj0;
        this.zzb = zzfeh0;
        this.zzd = new ArrayDeque();
        zzfdj0.zzb(new zzfee(this));
    }

    public final d zza(zzfei zzfei0) {
        synchronized(this) {
            this.zzf = 2;
            return this.zzi() ? null : this.zze.zza(zzfei0);
        }
    }

    static ArrayDeque zzb(zzfej zzfej0) {
        return zzfej0.zzd;
    }

    static void zzc(zzfej zzfej0, zzfep zzfep0) {
        zzfej0.zze = null;
    }

    static void zzd(zzfej zzfej0) {
        zzfej0.zzh();
    }

    public final void zze(zzfei zzfei0) {
        synchronized(this) {
            this.zzd.add(zzfei0);
        }
    }

    final void zzf() {
        synchronized(this) {
            this.zzf = 1;
            this.zzh();
        }
    }

    static int zzg(zzfej zzfej0) {
        return zzfej0.zzf;
    }

    private final void zzh() {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzgh)).booleanValue() && !zzt.zzo().zzh().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
            if(this.zzi()) {
                while(!this.zzd.isEmpty()) {
                    zzfei zzfei0 = (zzfei)this.zzd.pollFirst();
                    if(zzfei0 != null) {
                        if(zzfei0.zza() == null) {
                            continue;
                        }
                        zzfdx zzfdx0 = zzfei0.zza();
                        if(this.zza.zze(zzfdx0)) {
                            goto label_17;
                        }
                        continue;
                    }
                label_17:
                    zzfep zzfep0 = new zzfep(this.zza, this.zzb, zzfei0);
                    this.zze = zzfep0;
                    zzfep0.zzd(new zzfef(this, zzfei0));
                    return;
                }
            }
        }
    }

    private final boolean zzi() {
        synchronized(this) {
        }
        return this.zze == null;
    }
}

