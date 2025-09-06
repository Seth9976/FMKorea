package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzexk extends zzbt implements zzo, zzavs {
    protected zzcpw zza;
    private final zzchd zzb;
    private final Context zzc;
    private AtomicBoolean zzd;
    private final String zze;
    private final zzexe zzf;
    private final zzexc zzg;
    private final zzcag zzh;
    private final zzdrh zzi;
    private long zzj;
    private zzcpk zzk;

    public zzexk(zzchd zzchd0, Context context0, String s, zzexe zzexe0, zzexc zzexc0, zzcag zzcag0, zzdrh zzdrh0) {
        this.zzd = new AtomicBoolean();
        this.zzj = -1L;
        this.zzb = zzchd0;
        this.zzc = context0;
        this.zze = s;
        this.zzf = zzexe0;
        this.zzg = zzexc0;
        this.zzh = zzcag0;
        this.zzi = zzdrh0;
        zzexc0.zzm(this);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbe0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbh0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzby0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(zzq zzq0) {
        synchronized(this) {
            Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcb0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzawb zzawb0) {
        this.zzg.zzo(zzawb0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzw0) {
        this.zzf.zzl(zzw0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzci0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzdu0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbsl zzbsl0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbcp zzbcp0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdg0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbso zzbso0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvj zzbvj0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzfl0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() {
        synchronized(this) {
            return this.zzf.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzavs
    public final void zza() {
        this.zzq(3);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(zzl zzl0) {
        synchronized(this) {
            boolean z = ((Boolean)zzbdi.zzd.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue();
            if(this.zzh.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzkd)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzE(this.zzc) && zzl0.zzs == null) {
                zzcaa.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdb.zzd(4, null, null);
                this.zzg.zzbF(zze0);
                return false;
            }
            if(this.zzY()) {
                return false;
            }
            this.zzd = new AtomicBoolean();
            zzexi zzexi0 = new zzexi(this);
            zzexj zzexj0 = new zzexj(this);
            return this.zzf.zzb(zzl0, this.zze, zzexi0, zzexj0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcf0) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        synchronized(this) {
            if(this.zza == null) {
                return;
            }
            this.zzj = zzt.zzB().elapsedRealtime();
            int v1 = this.zza.zza();
            if(v1 <= 0) {
                return;
            }
            zzcpk zzcpk0 = new zzcpk(this.zzb.zzC(), zzt.zzB());
            this.zzk = zzcpk0;
            zzcpk0.zzd(v1, () -> this.zzb.zzB().execute(() -> this.zzq(5)));
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
        synchronized(this) {
            zzcpw zzcpw0 = this.zza;
            if(zzcpw0 != null) {
                zzcpw0.zze(zzt.zzB().elapsedRealtime() - this.zzj, 1);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        if(v == 0) {
            throw null;
        }
        if(v - 1 != 0) {
            switch(v - 1) {
                case 1: {
                    this.zzq(4);
                    return;
                }
                case 2: {
                    this.zzq(3);
                    return;
                }
                default: {
                    this.zzq(6);
                    return;
                }
            }
        }
        this.zzq(2);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzq zzg() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdn zzk() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final zzdq zzl() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    // 检测为 Lambda 实现
    final void zzo() [...]

    // 检测为 Lambda 实现
    public final void zzp() [...]

    private final void zzq(int v) {
        synchronized(this) {
            if(this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcpk zzcpk0 = this.zzk;
                if(zzcpk0 != null) {
                    zzt.zzb().zze(zzcpk0);
                }
                long v2 = -1L;
                if(this.zza != null) {
                    if(this.zzj != -1L) {
                        v2 = zzt.zzB().elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(v2, v);
                }
                this.zzx();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        synchronized(this) {
        }
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzs() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final String zzt() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzcpw zzcpw0 = this.zza;
            if(zzcpw0 != null) {
                zzcpw0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzl zzl0, zzbk zzbk0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
        }
    }
}

