package com.google.android.gms.internal.ads;

import Z1.d;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

public final class zzdkb implements zzcxc {
    private final zzdic zza;
    private final zzdih zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkb(zzdic zzdic0, zzdih zzdih0, Executor executor0, Executor executor1) {
        this.zza = zzdic0;
        this.zzb = zzdih0;
        this.zzc = executor0;
        this.zzd = executor1;
    }

    static void zza(zzdkb zzdkb0, zzcfi zzcfi0) {
        zzdkb0.zzb(zzcfi0);
    }

    private final void zzb(zzcfi zzcfi0) {
        zzdjz zzdjz0 = new zzdjz(zzcfi0);
        this.zzc.execute(zzdjz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if(!this.zzb.zzd()) {
            return;
        }
        zzfip zzfip0 = this.zza.zzu();
        if(zzfip0 == null && this.zza.zzw() != null && ((Boolean)zzba.zzc().zzb(zzbbr.zzeX)).booleanValue()) {
            d d0 = this.zza.zzw();
            zzcas zzcas0 = this.zza.zzp();
            if(d0 != null && zzcas0 != null) {
                zzfye.zzr(zzfye.zzl(new d[]{d0, zzcas0}), new zzdka(this), this.zzd);
            }
            return;
        }
        if(zzfip0 == null) {
            return;
        }
        zzcfi zzcfi0 = this.zza.zzr();
        zzcfi zzcfi1 = this.zza.zzs();
        if(zzcfi0 == null) {
            zzcfi0 = zzcfi1 == null ? null : zzcfi1;
        }
        if(zzcfi0 != null) {
            this.zzb(zzcfi0);
        }
    }
}

