package com.google.android.gms.internal.ads;

import Z1.d;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import y0.o;

public final class zzbzj {
    private final Object zza;
    private final zzj zzb;
    private final zzbzn zzc;
    private boolean zzd;
    private Context zze;
    private zzcag zzf;
    private String zzg;
    private zzbbz zzh;
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final zzbzi zzk;
    private final Object zzl;
    private d zzm;
    private final AtomicBoolean zzn;

    public zzbzj() {
        this.zza = new Object();
        zzj zzj0 = new zzj();
        this.zzb = zzj0;
        this.zzc = new zzbzn(zzay.zzd(), zzj0);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new zzbzi(null);
        this.zzl = new Object();
        this.zzn = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzj.get();
    }

    static Context zzb(zzbzj zzbzj0) {
        return zzbzj0.zze;
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if(this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjN)).booleanValue()) {
                return zzcae.zza(this.zze).getResources();
            }
            zzcae.zza(this.zze).getResources();
            return null;
        }
        catch(zzcad zzcad0) {
        }
        zzcaa.zzk("Cannot load resource from dynamite apk or local jar", zzcad0);
        return null;
    }

    static zzbbz zze(zzbzj zzbzj0) {
        return zzbzj0.zzh;
    }

    public final zzbbz zzf() {
        synchronized(this.zza) {
        }
        return this.zzh;
    }

    public final zzbzn zzg() {
        return this.zzc;
    }

    public final zzg zzh() {
        synchronized(this.zza) {
        }
        return this.zzb;
    }

    static zzcag zzi(zzbzj zzbzj0) {
        return zzbzj0.zzf;
    }

    public final d zzj() {
        if(this.zze != null && !((Boolean)zzba.zzc().zzb(zzbbr.zzcx)).booleanValue()) {
            Object object0 = this.zzl;
            synchronized(object0) {
                d d0 = this.zzm;
                if(d0 != null) {
                    return d0;
                }
                zzbze zzbze0 = () -> {
                    PackageInfo packageInfo0;
                    Context context0 = zzbvb.zza(this.zze);
                    ArrayList arrayList0 = new ArrayList();
                    try {
                        packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(context0.getApplicationInfo().packageName, 0x1000);
                        if(packageInfo0.requestedPermissions != null && packageInfo0.requestedPermissionsFlags != null) {
                            goto label_4;
                        }
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                    return arrayList0;
                label_4:
                    for(int v = 0; true; ++v) {
                        String[] arr_s = packageInfo0.requestedPermissions;
                        if(v >= arr_s.length) {
                            break;
                        }
                        if((packageInfo0.requestedPermissionsFlags[v] & 2) != 0) {
                            arrayList0.add(arr_s[v]);
                        }
                    }
                    return arrayList0;
                };
                d d1 = zzcan.zza.zzb(zzbze0);
                this.zzm = d1;
                return d1;
            }
        }
        return zzfye.zzh(new ArrayList());
    }

    public final Boolean zzk() {
        synchronized(this.zza) {
        }
        return this.zzi;
    }

    static Object zzl(zzbzj zzbzj0) {
        return zzbzj0.zza;
    }

    public final String zzm() {
        return this.zzg;
    }

    // 检测为 Lambda 实现
    final ArrayList zzn() [...]

    static AtomicBoolean zzo(zzbzj zzbzj0) {
        return zzbzj0.zzn;
    }

    public final void zzp() {
        this.zzk.zza();
    }

    public final void zzq() {
        this.zzj.decrementAndGet();
    }

    public final void zzr() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzs(Context context0, zzcag zzcag0) {
        zzbbz zzbbz0;
        synchronized(this.zza) {
            if(!this.zzd) {
                this.zze = context0.getApplicationContext();
                this.zzf = zzcag0;
                zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbtf.zzb(this.zze, this.zzf);
                if(((Boolean)zzbde.zzc.zze()).booleanValue()) {
                    zzbbz0 = new zzbbz();
                }
                else {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbbz0 = null;
                }
                this.zzh = zzbbz0;
                if(zzbbz0 != null) {
                    zzcaq.zza(new zzbzf(this).zzb(), "AppState.registerCsiReporter");
                }
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzib)).booleanValue()) {
                    o.a(((ConnectivityManager)context0.getSystemService("connectivity")), new zzbzg(this));
                }
                this.zzd = true;
                this.zzj();
            }
        }
        zzt.zzp().zzc(context0, zzcag0.zza);
    }

    public final void zzt(Throwable throwable0, String s) {
        zzbtf.zzb(this.zze, this.zzf).zzg(throwable0, s, ((Double)zzbds.zzg.zze()).floatValue());
    }

    public final void zzu(Throwable throwable0, String s) {
        zzbtf.zzb(this.zze, this.zzf).zzf(throwable0, s);
    }

    public final void zzv(Boolean boolean0) {
        synchronized(this.zza) {
            this.zzi = boolean0;
        }
    }

    public final void zzw(String s) {
        this.zzg = s;
    }

    public final boolean zzx(Context context0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzib)).booleanValue()) {
            return this.zzn.get();
        }
        NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }
}

