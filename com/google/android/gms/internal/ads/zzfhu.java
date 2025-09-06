package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class zzfhu implements Runnable {
    public static final Object zza;
    public static Boolean zzb;
    private static final Object zzc;
    private static final Object zzd;
    private final Context zze;
    private final zzcag zzf;
    private final zzfhz zzg;
    private String zzh;
    private int zzi;
    private final zzdoz zzj;
    private final List zzk;
    private boolean zzl;
    private final zzead zzm;
    private final zzbuz zzn;

    static {
        zzfhu.zza = new Object();
        zzfhu.zzc = new Object();
        zzfhu.zzd = new Object();
    }

    public zzfhu(Context context0, zzcag zzcag0, zzdoz zzdoz0, zzead zzead0, zzbuz zzbuz0) {
        this.zzg = zzfic.zzc();
        this.zzh = "";
        this.zzl = false;
        this.zze = context0;
        this.zzf = zzcag0;
        this.zzj = zzdoz0;
        this.zzm = zzead0;
        this.zzn = zzbuz0;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziv)).booleanValue()) {
            this.zzk = zzs.zzd();
            return;
        }
        this.zzk = zzfud.zzl();
    }

    @Override
    public final void run() {
        byte[] arr_b;
        if(!zzfhu.zza()) {
            return;
        }
        Object object0 = zzfhu.zzc;
        synchronized(object0) {
            if(this.zzg.zza() == 0) {
                return;
            }
        }
        try {
            synchronized(object0) {
                arr_b = ((zzfic)this.zzg.zzal()).zzax();
                this.zzg.zzc();
            }
            zzeaa zzeaa0 = new zzeaa(((String)zzba.zzc().zzb(zzbbr.zzip)), 60000, new HashMap(), arr_b, "application/x-protobuf", false);
            String s = this.zzf.zza;
            int v2 = Binder.getCallingUid();
            new zzeac(this.zze, s, this.zzn, v2).zzb(zzeaa0);
        }
        catch(Exception exception0) {
            if(exception0 instanceof zzdve && ((zzdve)exception0).zza() == 3) {
                return;
            }
            zzt.zzo().zzt(exception0, "CuiMonitor.sendCuiPing");
        }
    }

    public static boolean zza() {
        synchronized(zzfhu.zza) {
            if(zzfhu.zzb == null) {
                zzfhu.zzb = ((Boolean)zzbdd.zzb.zze()).booleanValue() ? Boolean.valueOf(Math.random() < ((double)(((Double)zzbdd.zza.zze())))) : Boolean.FALSE;
            }
        }
        return zzfhu.zzb.booleanValue();
    }

    public final void zzb(zzfhk zzfhk0) {
        zzfht zzfht0 = () -> {
            Object object0 = zzfhu.zzd;
            __monitor_enter(object0);
            int v = FIN.finallyOpen$NT();
            if(this.zzl) {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(object0);
                FIN.finallyCodeEnd$NT(v);
            }
            else {
                this.zzl = true;
                if(zzfhu.zza()) {
                    this.zzh = zzs.zzn(this.zze);
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int v1 = (int)(((Integer)zzba.zzc().zzb(zzbbr.zziq)));
                    zzcan.zzd.scheduleAtFixedRate(this, ((long)v1), ((long)v1), TimeUnit.MILLISECONDS);
                }
                FIN.finallyExec$NT(v);
            }
            if(!zzfhu.zza()) {
                return;
            }
            if(zzfhk0 == null) {
                return;
            }
            synchronized(zzfhu.zzc) {
                if(this.zzg.zza() >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzir))))) {
                    return;
                }
                zzfhw zzfhw0 = zzfhx.zza();
                zzfhw0.zzt(zzfhk0.zzl());
                zzfhw0.zzp(zzfhk0.zzk());
                zzfhw0.zzg(zzfhk0.zzb());
                zzfhw0.zzv(3);
                zzfhw0.zzm(this.zzf.zza);
                zzfhw0.zzb(this.zzh);
                zzfhw0.zzk(Build.VERSION.RELEASE);
                zzfhw0.zzq(Build.VERSION.SDK_INT);
                zzfhw0.zzu(zzfhk0.zzn());
                zzfhw0.zzj(zzfhk0.zza());
                zzfhw0.zze(((long)this.zzi));
                zzfhw0.zzs(zzfhk0.zzm());
                zzfhw0.zzc(zzfhk0.zzd());
                zzfhw0.zzf(zzfhk0.zzf());
                zzfhw0.zzh(zzfhk0.zzg());
                zzfhw0.zzi(this.zzj.zzc(zzfhk0.zzg()));
                zzfhw0.zzl(zzfhk0.zzh());
                zzfhw0.zzd(zzfhk0.zze());
                zzfhw0.zzr(zzfhk0.zzj());
                zzfhw0.zzn(zzfhk0.zzi());
                zzfhw0.zzo(zzfhk0.zzc());
                if(((Boolean)zzba.zzc().zzb(zzbbr.zziv)).booleanValue()) {
                    zzfhw0.zza(this.zzk);
                }
                zzfia zzfia0 = zzfib.zza();
                zzfia0.zza(zzfhw0);
                this.zzg.zzb(zzfia0);
            }
        };
        zzcan.zza.zza(zzfht0);
    }

    // 检测为 Lambda 实现
    final void zzc(zzfhk zzfhk0) [...]
}

