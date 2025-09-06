package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcon implements zza, zzcwi, zzcwy, zzcxc, zzcxw {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfbr zze;
    private final zzfbe zzf;
    private final zzfig zzg;
    private final zzfck zzh;
    private final zzaqx zzi;
    private final zzbct zzj;
    private final zzfhr zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcvk zzn;
    private boolean zzo;
    private final AtomicBoolean zzp;
    private final zzbcv zzq;

    zzcon(Context context0, Executor executor0, Executor executor1, ScheduledExecutorService scheduledExecutorService0, zzfbr zzfbr0, zzfbe zzfbe0, zzfig zzfig0, zzfck zzfck0, View view0, zzcfi zzcfi0, zzaqx zzaqx0, zzbct zzbct0, zzbcv zzbcv0, zzfhr zzfhr0, zzcvk zzcvk0) {
        this.zzp = new AtomicBoolean();
        this.zza = context0;
        this.zzb = executor0;
        this.zzc = executor1;
        this.zzd = scheduledExecutorService0;
        this.zze = zzfbr0;
        this.zzf = zzfbe0;
        this.zzg = zzfig0;
        this.zzh = zzfck0;
        this.zzi = zzaqx0;
        this.zzl = new WeakReference(view0);
        this.zzm = new WeakReference(zzcfi0);
        this.zzj = zzbct0;
        this.zzq = zzbcv0;
        this.zzk = zzfhr0;
        this.zzn = zzcvk0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if((!((Boolean)zzba.zzc().zzb(zzbbr.zzao)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean)zzbdj.zzd.zze()).booleanValue()) {
            zzfye.zzr(zzfye.zze(zzfxv.zzu(this.zzj.zza()), Throwable.class, zzcoh.zza, zzcan.zzf), new zzcol(this), this.zzb);
            return;
        }
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzc);
        int v = zzt.zzo().zzx(this.zza) ? 2 : 1;
        this.zzh.zzc(list0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
        List list0 = this.zzg.zze(this.zzf, this.zzf.zzi, zzbvd0);
        this.zzh.zza(list0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzj);
        this.zzh.zza(list0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        List list0 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzh);
        this.zzh.zza(list0);
    }

    static Context zzg(zzcon zzcon0) {
        return zzcon0.zza;
    }

    static zzfbe zzh(zzcon zzcon0) {
        return zzcon0.zzf;
    }

    static zzfbr zzi(zzcon zzcon0) {
        return zzcon0.zze;
    }

    static zzfck zzj(zzcon zzcon0) {
        return zzcon0.zzh;
    }

    static zzfig zzk(zzcon zzcon0) {
        return zzcon0.zzg;
    }

    // 检测为 Lambda 实现
    public static void zzl(zzcon zzcon0) [...]

    // 检测为 Lambda 实现
    final void zzm() [...]

    // 检测为 Lambda 实现
    final void zzn(int v, int v1) [...]

    // 检测为 Lambda 实现
    final void zzo(int v, int v1) [...]

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(zze zze0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbs)).booleanValue()) {
            List list0 = zzfig.zzf(2, zze0.zza, this.zzf.zzp);
            List list1 = this.zzg.zzc(this.zze, this.zzf, list0);
            this.zzh.zza(list1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if(!this.zzp.compareAndSet(false, true)) {
            return;
        }
        int v = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzdu)));
        if(v > 0) {
            this.zzt(v, ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzdv)))));
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdt)).booleanValue()) {
            zzcoj zzcoj0 = () -> {
                zzcok zzcok0 = () -> this.zzs();
                this.zzb.execute(zzcok0);
            };
            this.zzc.execute(zzcoj0);
            return;
        }
        this.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        synchronized(this) {
            if(this.zzo) {
                ArrayList arrayList0 = new ArrayList(this.zzf.zzd);
                arrayList0.addAll(this.zzf.zzg);
                List list0 = this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList0);
                this.zzh.zza(list0);
            }
            else {
                List list1 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzn);
                this.zzh.zza(list1);
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzdq)).booleanValue()) {
                    zzcvk zzcvk0 = this.zzn;
                    if(zzcvk0 != null) {
                        String s = zzcvk0.zza().zzf();
                        List list2 = zzfig.zzg(zzcvk0.zzb().zzn, s);
                        List list3 = this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), list2);
                        this.zzh.zza(list3);
                    }
                }
                List list4 = this.zzg.zzc(this.zze, this.zzf, this.zzf.zzg);
                this.zzh.zza(list4);
            }
            this.zzo = true;
        }
    }

    private final void zzs() {
        String s;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzks)).booleanValue()) {
            List list0 = this.zzf.zzd;
            if(list0 == null || list0.isEmpty()) {
                return;
            }
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdl)).booleanValue()) {
            View view0 = (View)this.zzl.get();
            s = this.zzi.zzc().zzh(this.zza, view0, null);
        }
        else {
            s = null;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzao)).booleanValue() && this.zze.zzb.zzb.zzg || !((Boolean)zzbdj.zzh.zze()).booleanValue()) {
            List list1 = this.zzg.zzd(this.zze, this.zzf, false, s, null, this.zzf.zzd);
            this.zzh.zza(list1);
            return;
        }
        if(((Boolean)zzbdj.zzg.zze()).booleanValue() && (this.zzf.zzb == 1 || this.zzf.zzb == 2 || this.zzf.zzb == 5)) {
            zzcfi zzcfi0 = (zzcfi)this.zzm.get();
        }
        zzfye.zzr(((zzfxv)zzfye.zzo(zzfxv.zzu(zzfye.zzh(null)), ((long)(((Long)zzba.zzc().zzb(zzbbr.zzaT)))), TimeUnit.MILLISECONDS, this.zzd)), new zzcom(this, s), this.zzb);
    }

    private final void zzt(int v, int v1) {
        if(v > 0) {
            View view0 = (View)this.zzl.get();
            if(view0 == null || view0.getHeight() == 0 || view0.getWidth() == 0) {
                zzcog zzcog0 = () -> {
                    zzcoi zzcoi0 = () -> this.zzt(v - 1, v1);
                    this.zzb.execute(zzcoi0);
                };
                this.zzd.schedule(zzcog0, ((long)v1), TimeUnit.MILLISECONDS);
                return;
            }
        }
        this.zzs();
    }
}

