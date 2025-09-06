package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.a;
import com.google.android.gms.ads.internal.zzt;

public final class zzcrr implements zzcxc, zzcxw {
    private final Context zza;
    private final zzcfi zzb;
    private final zzfbe zzc;
    private final zzcag zzd;
    private zzfip zze;
    private boolean zzf;

    public zzcrr(Context context0, zzcfi zzcfi0, zzfbe zzfbe0, zzcag zzcag0) {
        this.zza = context0;
        this.zzb = zzcfi0;
        this.zzc = zzfbe0;
        this.zzd = zzcag0;
    }

    private final void zza() {
        zzedi zzedi0;
        zzedh zzedh0;
        __monitor_enter(this);
        if(!this.zzc.zzU) {
            __monitor_exit(this);
            return;
        }
        if(this.zzb == null) {
            __monitor_exit(this);
            return;
        }
        try {
            if(zzt.zzA().zzj(this.zza)) {
                String s = this.zzd.zzb + "." + this.zzd.zzc;
                String s1 = this.zzc.zzW.zza();
                if(this.zzc.zzW.zzb() == 1) {
                    zzedh0 = zzedh.zzc;
                    zzedi0 = zzedi.zzb;
                }
                else {
                    zzedh0 = zzedh.zza;
                    zzedi0 = this.zzc.zzf == 1 ? zzedi.zzc : zzedi.zza;
                }
                zzfip zzfip0 = zzt.zzA().zza(s, this.zzb.zzG(), "", "javascript", s1, zzedi0, zzedh0, this.zzc.zzam);
                this.zze = zzfip0;
                zzcfi zzcfi0 = this.zzb;
                if(zzfip0 != null) {
                    zzt.zzA().zzh(this.zze, ((View)zzcfi0));
                    this.zzb.zzap(this.zze);
                    zzt.zzA().zzi(this.zze);
                    this.zzf = true;
                    a a0 = new a();
                    this.zzb.zzd("onSdkLoaded", a0);
                    goto label_30;
                }
                goto label_32;
            }
            goto label_34;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
    label_30:
        __monitor_exit(this);
        return;
    label_32:
        __monitor_exit(this);
        return;
    label_34:
        __monitor_exit(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        synchronized(this) {
            if(!this.zzf) {
                this.zza();
            }
            if(this.zzc.zzU && this.zze != null) {
                zzcfi zzcfi0 = this.zzb;
                if(zzcfi0 != null) {
                    zzcfi0.zzd("onSdkImpression", new a());
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        synchronized(this) {
            if(this.zzf) {
                return;
            }
            this.zza();
        }
    }
}

