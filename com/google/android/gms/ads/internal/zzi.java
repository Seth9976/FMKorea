package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzfme;
import com.google.android.gms.internal.ads.zzfmy;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

public final class zzi implements zzaqt, Runnable {
    protected boolean zza;
    final CountDownLatch zzb;
    private final List zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzflc zzi;
    private Context zzj;
    private final Context zzk;
    private zzcag zzl;
    private final zzcag zzm;
    private final boolean zzn;
    private int zzo;

    public zzi(Context context0, zzcag zzcag0) {
        this.zzc = new Vector();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzb = new CountDownLatch(1);
        this.zzj = context0;
        this.zzk = context0;
        this.zzl = zzcag0;
        this.zzm = zzcag0;
        ExecutorService executorService0 = Executors.newCachedThreadPool();
        this.zzh = executorService0;
        boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zzcf)).booleanValue();
        this.zzn = z;
        this.zzi = zzflc.zza(context0, executorService0, z);
        this.zzf = ((Boolean)zzba.zzc().zzb(zzbbr.zzcb)).booleanValue();
        this.zzg = ((Boolean)zzba.zzc().zzb(zzbbr.zzcg)).booleanValue();
        this.zzo = ((Boolean)zzba.zzc().zzb(zzbbr.zzce)).booleanValue() ? 2 : 1;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzdi)).booleanValue()) {
            this.zza = this.zzc();
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdb)).booleanValue()) {
            zzcan.zza.execute(this);
            return;
        }
        if(zzbzt.zzu()) {
            zzcan.zza.execute(this);
            return;
        }
        this.run();
    }

    @Override
    public final void run() {
        long v1;
        try {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdi)).booleanValue()) {
                this.zza = this.zzc();
            }
            boolean z = this.zzl.zzd;
            boolean z1 = !((Boolean)zzba.zzc().zzb(zzbbr.zzaU)).booleanValue() && z;
            if(this.zzi() == 1) {
                this.zzp(z1);
                if(this.zzo == 2) {
                    zzg zzg0 = () -> {
                        long v;
                        try {
                            v = System.currentTimeMillis();
                            zzaqq.zza(this.zzm.zza, zzi.zzq(this.zzk), z1, this.zzn).zzp();
                        }
                        catch(NullPointerException nullPointerException0) {
                            this.zzi.zzc(2027, System.currentTimeMillis() - v, nullPointerException0);
                        }
                    };
                    this.zzh.execute(zzg0);
                }
            }
            else {
                try {
                    v1 = System.currentTimeMillis();
                    zzaqq zzaqq0 = zzaqq.zza(this.zzl.zza, zzi.zzq(this.zzj), z1, this.zzn);
                    this.zze.set(zzaqq0);
                    if(this.zzg && !zzaqq0.zzr()) {
                        this.zzo = 1;
                        this.zzp(z1);
                    }
                }
                catch(NullPointerException nullPointerException0) {
                    this.zzo = 1;
                    this.zzp(z1);
                    this.zzi.zzc(0x7EF, System.currentTimeMillis() - v1, nullPointerException0);
                }
            }
        }
        finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    static zzflc zza(zzi zzi0) {
        return zzi0.zzi;
    }

    // 检测为 Lambda 实现
    final void zzb(boolean z) [...]

    protected final boolean zzc() {
        Context context0 = this.zzj;
        zzh zzh0 = new zzh(this);
        return new zzfmy(this.zzj, zzfme.zzb(context0, this.zzi), zzh0, ((Boolean)zzba.zzc().zzb(zzbbr.zzcc)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        }
        catch(InterruptedException interruptedException0) {
            zzcaa.zzk("Interrupted during GADSignals creation.", interruptedException0);
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context0, String s, View view0) {
        return this.zzf(context0, s, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context0, String s, View view0, Activity activity0) {
        if(this.zzd()) {
            zzaqt zzaqt0 = this.zzj();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjG)).booleanValue()) {
                zzs.zzG(view0, 4, null);
            }
            if(zzaqt0 != null) {
                this.zzm();
                return zzaqt0.zzf(zzi.zzq(context0), s, view0, activity0);
            }
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context0) {
        if(this.zzd()) {
            zzaqt zzaqt0 = this.zzj();
            if(zzaqt0 != null) {
                this.zzm();
                return zzaqt0.zzg(zzi.zzq(context0));
            }
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context0, View view0, Activity activity0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjF)).booleanValue()) {
            if(this.zzd()) {
                zzaqt zzaqt0 = this.zzj();
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzjG)).booleanValue()) {
                    zzs.zzG(view0, 2, null);
                }
                return zzaqt0 == null ? "" : zzaqt0.zzh(context0, view0, activity0);
            }
            return "";
        }
        zzaqt zzaqt1 = this.zzj();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjG)).booleanValue()) {
            zzs.zzG(view0, 2, null);
        }
        return zzaqt1 == null ? "" : zzaqt1.zzh(context0, view0, activity0);
    }

    // 去混淆评级： 低(20)
    protected final int zzi() {
        return !this.zzf || this.zza ? this.zzo : 1;
    }

    private final zzaqt zzj() {
        return this.zzi() == 2 ? ((zzaqt)this.zze.get()) : ((zzaqt)this.zzd.get());
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzk(MotionEvent motionEvent0) {
        zzaqt zzaqt0 = this.zzj();
        if(zzaqt0 != null) {
            this.zzm();
            zzaqt0.zzk(motionEvent0);
            return;
        }
        this.zzc.add(new Object[]{motionEvent0});
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzl(int v, int v1, int v2) {
        zzaqt zzaqt0 = this.zzj();
        if(zzaqt0 != null) {
            this.zzm();
            zzaqt0.zzl(v, v1, v2);
            return;
        }
        this.zzc.add(new Object[]{v, v1, v2});
    }

    private final void zzm() {
        zzaqt zzaqt0 = this.zzj();
        if(!this.zzc.isEmpty() && zzaqt0 != null) {
            for(Object object0: this.zzc) {
                Object[] arr_object = (Object[])object0;
                int v = arr_object.length;
                if(v == 1) {
                    zzaqt0.zzk(((MotionEvent)arr_object[0]));
                }
                else if(v == 3) {
                    zzaqt0.zzl(((int)(((Integer)arr_object[0]))), ((int)(((Integer)arr_object[1]))), ((int)(((Integer)arr_object[2]))));
                }
            }
            this.zzc.clear();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] arr_stackTraceElement) {
        if(this.zzd()) {
            zzaqt zzaqt0 = this.zzj();
            if(zzaqt0 != null) {
                zzaqt0.zzn(arr_stackTraceElement);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzo(View view0) {
        zzaqt zzaqt0 = this.zzj();
        if(zzaqt0 != null) {
            zzaqt0.zzo(view0);
        }
    }

    private final void zzp(boolean z) {
        zzaqw zzaqw0 = zzaqw.zzu(this.zzl.zza, zzi.zzq(this.zzj), z, this.zzo);
        this.zzd.set(zzaqw0);
    }

    private static final Context zzq(Context context0) {
        Context context1 = context0.getApplicationContext();
        return context1 == null ? context0 : context1;
    }
}

