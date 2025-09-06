package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

public final class zzexc implements zzo, zzcwl, zzcwy, zzcyh, zzcyt, zzddw, zzeys {
    private final zzfdj zza;
    private final AtomicReference zzb;
    private final AtomicReference zzc;
    private final AtomicReference zzd;
    private final AtomicReference zze;
    private final AtomicReference zzf;
    private final AtomicReference zzg;
    private zzexc zzh;

    public zzexc(zzfdj zzfdj0) {
        this.zzb = new AtomicReference();
        this.zzc = new AtomicReference();
        this.zzd = new AtomicReference();
        this.zze = new AtomicReference();
        this.zzf = new AtomicReference();
        this.zzg = new AtomicReference();
        this.zzh = null;
        this.zza = zzfdj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(zze zze0) {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzbF(zze0);
            return;
        }
        zzewn zzewn0 = new zzewn(zze0);
        zzeyj.zza(this.zzb, zzewn0);
        zzewt zzewt0 = new zzewt(zze0);
        zzeyj.zza(this.zzb, zzewt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzbK();
            return;
        }
        zzeyj.zza(this.zzd, (zzexa this) -> ((zzawf)object0).zzb());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzbu();
            return;
        }
        zzeyj.zza(this.zzf, (zzews this) -> ((zzo)object0).zzbu());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzbv();
            return;
        }
        zzeyj.zza(this.zzf, (zzewv this) -> ((zzo)object0).zzbv());
        zzeyj.zza(this.zzd, (zzeww this) -> ((zzawf)object0).zzf());
        zzeyj.zza(this.zzd, (zzewx this) -> ((zzawf)object0).zze());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzbx();
            return;
        }
        zzeyj.zza(this.zzf, (zzewz this) -> ((zzo)object0).zzbx());
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzby(v);
            return;
        }
        zzewr zzewr0 = new zzewr(v);
        zzeyj.zza(this.zzf, zzewr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcyh
    public final void zzg() {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzg();
            return;
        }
        zzeyj.zza(this.zze, (zzexb this) -> ((zzcyh)object0).zzg());
    }

    @Override  // com.google.android.gms.internal.ads.zzcyt
    public final void zzh(zzs zzs0) {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzh(zzs0);
            return;
        }
        zzewq zzewq0 = new zzewq(zzs0);
        zzeyj.zza(this.zzg, zzewq0);
    }

    public static zzexc zzi(zzexc zzexc0) {
        zzexc zzexc1 = new zzexc(zzexc0.zza);
        zzexc1.zzh = zzexc0;
        return zzexc1;
    }

    public final void zzj() {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzj();
            return;
        }
        this.zza.zza();
        zzeyj.zza(this.zzc, (zzewo this) -> ((zzawc)object0).zza());
        zzeyj.zza(this.zzd, (zzewp this) -> ((zzawf)object0).zzc());
    }

    public final void zzk(zzavy zzavy0) {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzk(zzavy0);
            return;
        }
        zzewu zzewu0 = new zzewu(zzavy0);
        zzeyj.zza(this.zzb, zzewu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeys
    public final void zzl(zzeys zzeys0) {
        this.zzh = (zzexc)zzeys0;
    }

    public final void zzm(zzo zzo0) {
        this.zzf.set(zzo0);
    }

    public final void zzn(zzdg zzdg0) {
        this.zzg.set(zzdg0);
    }

    public final void zzo(zzawb zzawb0) {
        this.zzb.set(zzawb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(zze zze0) {
        zzexc zzexc0 = this.zzh;
        if(zzexc0 != null) {
            zzexc0.zzp(zze0);
            return;
        }
        zzewy zzewy0 = new zzewy(zze0);
        zzeyj.zza(this.zzd, zzewy0);
    }

    public final void zzq(zzawf zzawf0) {
        this.zzd.set(zzawf0);
    }

    @Override  // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
    }
}

