package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzekx implements AppEventListener, zza, zzcwi, zzcwl, zzcwy, zzcxc, zzcxw, zzcyt, zzczd, zzddw {
    final BlockingQueue zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicBoolean zzg;
    private final AtomicBoolean zzh;
    private final AtomicBoolean zzi;
    private final zzfgo zzj;

    public zzekx(zzfgo zzfgo0) {
        this.zzb = new AtomicReference();
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzf = new AtomicReference();
        this.zzg = new AtomicBoolean(true);
        this.zzh = new AtomicBoolean(false);
        this.zzi = new AtomicBoolean(false);
        this.zza = new ArrayBlockingQueue(((int)(((Integer)zzba.zzc().zzb(zzbbr.zziw)))));
        this.zzj = zzfgo0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
            zzeyj.zza(this.zzb, (zzekp this) -> ((zzbh)object0).zzc());
        }
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        synchronized(this) {
            if(this.zzg.get()) {
                Pair pair0 = new Pair(s, s1);
                if(!this.zza.offer(pair0)) {
                    zzcaa.zze("The queue for app events is full, dropping the new event.");
                    zzfgo zzfgo0 = this.zzj;
                    if(zzfgo0 != null) {
                        zzfgn zzfgn0 = zzfgn.zzb("dae_action");
                        zzfgn0.zza("dae_name", s);
                        zzfgn0.zza("dae_data", s1);
                        zzfgo0.zzb(zzfgn0);
                        return;
                    }
                }
                return;
            }
            zzekk zzekk0 = new zzekk(s, s1);
            zzeyj.zza(this.zzc, zzekk0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        zzeyj.zza(this.zzb, (zzekw this) -> ((zzbh)object0).zzd());
        zzeyj.zza(this.zzf, (zzekf this) -> ((zzci)object0).zzc());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        zzeyj.zza(this.zzb, (zzekn this) -> ((zzbh)object0).zzh());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        zzekr zzekr0 = new zzekr(zze0);
        zzeyj.zza(this.zzb, zzekr0);
        zzeks zzeks0 = new zzeks(zze0);
        zzeyj.zza(this.zzb, zzeks0);
        zzekt zzekt0 = new zzekt(zze0);
        zzeyj.zza(this.zze, zzekt0);
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
            zzeyj.zza(this.zzb, (zzekp this) -> ((zzbh)object0).zzc());
        }
        zzeyj.zza(this.zzf, (zzekq this) -> ((zzci)object0).zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbun0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbr0) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzeyj.zza(this.zzb, (zzekh this) -> ((zzbh)object0).zzj());
        zzeyj.zza(this.zzf, (zzeki this) -> ((zzci)object0).zzf());
        zzeyj.zza(this.zzf, (zzekj this) -> ((zzci)object0).zze());
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    public final zzbh zzg() {
        synchronized(this) {
            return (zzbh)this.zzb.get();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(zzs zzs0) {
        zzekm zzekm0 = new zzekm(zzs0);
        zzeyj.zza(this.zzd, zzekm0);
    }

    public final zzcb zzi() {
        synchronized(this) {
            return (zzcb)this.zzc.get();
        }
    }

    public final void zzj(zzbh zzbh0) {
        this.zzb.set(zzbh0);
    }

    public final void zzk(zzbk zzbk0) {
        this.zze.set(zzbk0);
    }

    public final void zzl(zzdg zzdg0) {
        this.zzd.set(zzdg0);
    }

    public final void zzm(zzcb zzcb0) {
        this.zzc.set(zzcb0);
        this.zzh.set(true);
        this.zzo();
    }

    public final void zzn(zzci zzci0) {
        this.zzf.set(zzci0);
    }

    private final void zzo() {
        if(this.zzh.get() && this.zzi.get()) {
            for(Object object0: this.zza) {
                zzeko zzeko0 = new zzeko(((Pair)object0));
                zzeyj.zza(this.zzc, zzeko0);
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(zze zze0) {
        zzekl zzekl0 = new zzekl(zze0);
        zzeyj.zza(this.zzf, zzekl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        zzeyj.zza(this.zzb, (zzeke this) -> ((zzbh)object0).zzg());
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        synchronized(this) {
            zzeyj.zza(this.zzb, (zzeku this) -> ((zzbh)object0).zzi());
            zzeyj.zza(this.zze, (zzekv this) -> ((zzbk)object0).zzc());
            this.zzi.set(true);
            this.zzo();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzeyj.zza(this.zzb, (zzekg this) -> ((zzbh)object0).zzk());
    }
}

