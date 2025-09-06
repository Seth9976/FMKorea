package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

final class zzcqf extends zzcqc {
    private final Context zzc;
    private final View zzd;
    private final zzcfi zze;
    private final zzfbf zzf;
    private final zzcsc zzg;
    private final zzdin zzh;
    private final zzddy zzi;
    private final zzgyn zzj;
    private final Executor zzk;
    private zzq zzl;

    zzcqf(zzcsd zzcsd0, Context context0, zzfbf zzfbf0, View view0, zzcfi zzcfi0, zzcsc zzcsc0, zzdin zzdin0, zzddy zzddy0, zzgyn zzgyn0, Executor executor0) {
        super(zzcsd0);
        this.zzc = context0;
        this.zzd = view0;
        this.zze = zzcfi0;
        this.zzf = zzfbf0;
        this.zzg = zzcsc0;
        this.zzh = zzdin0;
        this.zzi = zzddy0;
        this.zzj = zzgyn0;
        this.zzk = executor0;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final int zza() {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() || !this.zzb.zzah || ((Boolean)zzba.zzc().zzb(zzbbr.zzhy)).booleanValue() ? this.zza.zzb.zzb.zzc : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final View zzc() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final zzdq zzd() {
        try {
            return this.zzg.zza();
        }
        catch(zzfcf unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zze() {
        zzq zzq0 = this.zzl;
        if(zzq0 != null) {
            return zzfce.zzb(zzq0);
        }
        zzfbe zzfbe0 = this.zzb;
        if(zzfbe0.zzad) {
            for(Object object0: zzfbe0.zza) {
                if(((String)object0) != null && ((String)object0).contains("FirstParty")) {
                    return (zzfbf)this.zzb.zzs.get(0);
                }
                if(false) {
                    break;
                }
            }
            return new zzfbf(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return (zzfbf)this.zzb.zzs.get(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final zzfbf zzf() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final void zzg() {
        this.zzi.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcqc
    public final void zzh(ViewGroup viewGroup0, zzq zzq0) {
        if(viewGroup0 != null) {
            zzcfi zzcfi0 = this.zze;
            if(zzcfi0 != null) {
                zzcfi0.zzag(zzcgx.zzc(zzq0));
                viewGroup0.setMinimumHeight(zzq0.zzc);
                viewGroup0.setMinimumWidth(zzq0.zzf);
                this.zzl = zzq0;
            }
        }
    }

    // 检测为 Lambda 实现
    public static void zzi(zzcqf zzcqf0) [...]

    @Override  // com.google.android.gms.internal.ads.zzcse
    public final void zzj() {
        zzcqe zzcqe0 = () -> {
            zzdin zzdin0 = this.zzh;
            if(zzdin0.zze() == null) {
                return;
            }
            try {
                zzdin0.zze().zze(((zzbu)this.zzj.zzb()), ObjectWrapper.wrap(this.zzc));
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("RemoteException when notifyAdLoad is called", remoteException0);
            }
        };
        this.zzk.execute(zzcqe0);
        super.zzj();
    }
}

