package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzcoy implements zzo, zzauf, zzcxc, zzcxd {
    private final zzcot zza;
    private final zzcou zzb;
    private final Set zzc;
    private final zzbnu zzd;
    private final Executor zze;
    private final Clock zzf;
    private final AtomicBoolean zzg;
    private final zzcox zzh;
    private boolean zzi;
    private WeakReference zzj;

    public zzcoy(zzbnr zzbnr0, zzcou zzcou0, Executor executor0, zzcot zzcot0, Clock clock0) {
        this.zzc = new HashSet();
        this.zzg = new AtomicBoolean(false);
        this.zzh = new zzcox();
        this.zzi = false;
        this.zzj = new WeakReference(this);
        this.zza = zzcot0;
        this.zzd = zzbnr0.zza("google.afma.activeView.handleUpdate", zzbnf.zza, zzbnf.zza);
        this.zzb = zzcou0;
        this.zze = executor0;
        this.zzf = clock0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        synchronized(this) {
            this.zzh.zzb = false;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context0) {
        synchronized(this) {
            this.zzh.zze = "u";
            this.zzg();
            this.zzk();
            this.zzi = true;
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        synchronized(this) {
            this.zzh.zzb = true;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context0) {
        synchronized(this) {
            this.zzh.zzb = true;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context0) {
        synchronized(this) {
            this.zzh.zzb = false;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        synchronized(this) {
            this.zzh.zza = zzaue0.zzj;
            this.zzh.zzf = zzaue0;
            this.zzg();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
    }

    public final void zzg() {
        synchronized(this) {
            if(this.zzj.get() != null) {
                if(!this.zzi && this.zzg.get()) {
                    try {
                        this.zzh.zzd = this.zzf.elapsedRealtime();
                        JSONObject jSONObject0 = this.zzb.zza(this.zzh);
                        for(Object object0: this.zzc) {
                            zzcow zzcow0 = new zzcow(((zzcfi)object0), jSONObject0);
                            this.zze.execute(zzcow0);
                        }
                        zzcaq.zzb(this.zzd.zzb(jSONObject0), "ActiveViewListener.callActiveViewJs");
                        return;
                    }
                    catch(Exception exception0) {
                    }
                    zze.zzb("Failed to call ActiveViewJS", exception0);
                    return;
                }
                return;
            }
            this.zzj();
        }
    }

    public final void zzh(zzcfi zzcfi0) {
        synchronized(this) {
            this.zzc.add(zzcfi0);
            this.zza.zzd(zzcfi0);
        }
    }

    public final void zzi(Object object0) {
        this.zzj = new WeakReference(object0);
    }

    public final void zzj() {
        synchronized(this) {
            this.zzk();
            this.zzi = true;
        }
    }

    private final void zzk() {
        for(Object object0: this.zzc) {
            this.zza.zzf(((zzcfi)object0));
        }
        this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        synchronized(this) {
            if(this.zzg.compareAndSet(false, true)) {
                this.zza.zzc(this);
                this.zzg();
            }
        }
    }
}

