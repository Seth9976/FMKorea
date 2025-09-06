package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class zzaqq implements zzaqt {
    volatile long zza;
    private static zzaqq zzb;
    private final Context zzc;
    private final zzfmr zzd;
    private final zzfmy zze;
    private final zzfna zzf;
    private final zzars zzg;
    private final zzflc zzh;
    private final Executor zzi;
    private final zzfmx zzj;
    private final CountDownLatch zzk;
    private final zzash zzl;
    private final zzarz zzm;
    private final zzarq zzn;
    private final Object zzo;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;

    zzaqq(Context context0, zzflc zzflc0, zzfmr zzfmr0, zzfmy zzfmy0, zzfna zzfna0, zzars zzars0, Executor executor0, zzfkx zzfkx0, int v, zzash zzash0, zzarz zzarz0, zzarq zzarq0) {
        this.zza = 0L;
        this.zzo = new Object();
        this.zzc = context0;
        this.zzh = zzflc0;
        this.zzd = zzfmr0;
        this.zze = zzfmy0;
        this.zzf = zzfna0;
        this.zzg = zzars0;
        this.zzi = executor0;
        this.zzr = v;
        this.zzl = zzash0;
        this.zzm = zzarz0;
        this.zzn = zzarq0;
        this.zzq = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzaqo(this, zzfkx0);
    }

    public static zzaqq zza(String s, Context context0, boolean z, boolean z1) {
        synchronized(zzaqq.class) {
            return zzaqq.zzb(s, context0, Executors.newCachedThreadPool(), z, z1);
        }
    }

    @Deprecated
    public static zzaqq zzb(String s, Context context0, Executor executor0, boolean z, boolean z1) {
        synchronized(zzaqq.class) {
            if(zzaqq.zzb == null) {
                zzfld zzfld0 = zzfle.zza();
                zzfld0.zza(s);
                zzfld0.zzc(z);
                zzfle zzfle0 = zzfld0.zzd();
                zzflc zzflc0 = zzflc.zza(context0, executor0, z1);
                zzarb zzarb0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzde)).booleanValue() ? zzarb.zzc(context0) : null;
                zzash zzash0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzdf)).booleanValue() ? zzash.zzd(context0, executor0) : null;
                zzarz zzarz0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzct)).booleanValue() ? new zzarz() : null;
                zzarq zzarq0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzcv)).booleanValue() ? new zzarq() : null;
                zzflv zzflv0 = zzflv.zze(context0, executor0, zzflc0, zzfle0);
                zzarr zzarr0 = new zzarr(context0);
                zzars zzars0 = new zzars(zzfle0, zzflv0, new zzasf(context0, zzarr0), zzarr0, zzarb0, zzash0, zzarz0, zzarq0);
                int v1 = zzfme.zzb(context0, zzflc0);
                zzfkx zzfkx0 = new zzfkx();
                zzaqq zzaqq0 = new zzaqq(context0, zzflc0, new zzfmr(context0, v1), new zzfmy(context0, v1, new zzaqn(zzflc0), ((Boolean)zzba.zzc().zzb(zzbbr.zzcc)).booleanValue()), new zzfna(context0, zzars0, zzflc0, zzfkx0), zzars0, executor0, zzfkx0, v1, zzash0, zzarz0, zzarq0);
                zzaqq.zzb = zzaqq0;
                zzaqq0.zzm();
                zzaqq.zzb.zzp();
            }
            return zzaqq.zzb;
        }
    }

    static zzflc zzc(zzaqq zzaqq0) {
        return zzaqq0.zzh;
    }

    static Object zzd(zzaqq zzaqq0) {
        return zzaqq0.zzo;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zze(Context context0, String s, View view0) {
        return this.zzf(context0, s, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzf(Context context0, String s, View view0, Activity activity0) {
        this.zzs();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzi();
        }
        this.zzp();
        zzflf zzflf0 = this.zzf.zza();
        if(zzflf0 != null) {
            String s1 = zzflf0.zza(context0, null, s, view0, activity0);
            this.zzh.zzf(5000, 0L, s1, null);
            return s1;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzg(Context context0) {
        this.zzs();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzj();
        }
        this.zzp();
        zzflf zzflf0 = this.zzf.zza();
        if(zzflf0 != null) {
            String s = zzflf0.zzc(context0, null);
            this.zzh.zzf(5001, 0L, s, null);
            return s;
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final String zzh(Context context0, View view0, Activity activity0) {
        this.zzs();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzct)).booleanValue()) {
            this.zzm.zzk(context0, view0);
        }
        this.zzp();
        zzflf zzflf0 = this.zzf.zza();
        if(zzflf0 != null) {
            String s = zzflf0.zzb(context0, null, view0, activity0);
            this.zzh.zzf(5002, 0L, s, null);
            return s;
        }
        return "";
    }

    static void zzi(zzaqq zzaqq0, boolean z) {
        zzaqq0.zzp = z;
    }

    static void zzj(zzaqq zzaqq0) {
        String s1;
        String s;
        long v = System.currentTimeMillis();
        if(zzaqq0.zzt(1) == null) {
            s1 = null;
            s = null;
        }
        else {
            s = "";
            s1 = "";
        }
        try {
            byte[] arr_b = zzflm.zza(zzaqq0.zzc, 1, zzaqq0.zzr, s1, s, "1", zzaqq0.zzh).zzb;
            if(arr_b == null) {
                zzaqq0.zzh.zzd(5009, System.currentTimeMillis() - v);
            }
            else if(arr_b.length == 0) {
                zzaqq0.zzh.zzd(5009, System.currentTimeMillis() - v);
            }
            else {
                try {
                    zzatr.zzc(zzgqi.zzv(arr_b, 0, arr_b.length), zzgrc.zza());
                }
                catch(NullPointerException unused_ex) {
                    zzaqq0.zzh.zzd(2030, System.currentTimeMillis() - v);
                    return;
                }
                zzaqq0.zzh.zzd(5010, System.currentTimeMillis() - v);
            }
        }
        catch(zzgsc zzgsc0) {
            zzaqq0.zzh.zzc(4002, System.currentTimeMillis() - v, zzgsc0);
        }
        finally {
            zzaqq0.zzk.countDown();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzk(MotionEvent motionEvent0) {
        zzflf zzflf0 = this.zzf.zza();
        if(zzflf0 != null) {
            try {
                zzflf0.zzd(null, motionEvent0);
            }
            catch(zzfmz zzfmz0) {
                this.zzh.zzc(zzfmz0.zza(), -1L, zzfmz0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzl(int v, int v1, int v2) {
    }

    final void zzm() {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            zzfmq zzfmq0 = this.zzt(1);
            if(zzfmq0 != null) {
                if(this.zzf.zzc(zzfmq0)) {
                    this.zzq = true;
                    this.zzk.countDown();
                    return;
                }
                return;
            }
            this.zzh.zzd(0xFAD, System.currentTimeMillis() - v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzn(StackTraceElement[] arr_stackTraceElement) {
        zzarq zzarq0 = this.zzn;
        if(zzarq0 != null) {
            zzarq0.zzb(Arrays.asList(arr_stackTraceElement));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaqt
    public final void zzo(View view0) {
        this.zzg.zzd(view0);
    }

    public final void zzp() {
        if(!this.zzp) {
            Object object0 = this.zzo;
            synchronized(object0) {
                if(!this.zzp) {
                    if(System.currentTimeMillis() / 1000L - this.zza < 3600L) {
                        return;
                    }
                    zzfmq zzfmq0 = this.zzf.zzb();
                    if((zzfmq0 == null || zzfmq0.zzd(3600L)) && zzfme.zza(this.zzr)) {
                        zzaqp zzaqp0 = new zzaqp(this);
                        this.zzi.execute(zzaqp0);
                    }
                }
            }
        }
    }

    static boolean zzq(zzaqq zzaqq0) {
        return zzaqq0.zzp;
    }

    public final boolean zzr() {
        synchronized(this) {
        }
        return this.zzq;
    }

    private final void zzs() {
        zzash zzash0 = this.zzl;
        if(zzash0 != null) {
            zzash0.zzh();
        }
    }

    private final zzfmq zzt(int v) {
        if(!zzfme.zza(this.zzr)) {
            return null;
        }
        return ((Boolean)zzba.zzc().zzb(zzbbr.zzca)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
    }
}

