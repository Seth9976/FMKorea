package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzfav extends zzbvv {
    private final zzfar zza;
    private final zzfah zzb;
    private final String zzc;
    private final zzfbs zzd;
    private final Context zze;
    private final zzcag zzf;
    private final zzaqx zzg;
    private final zzdrh zzh;
    private zzdnq zzi;
    private boolean zzj;

    public zzfav(String s, zzfar zzfar0, Context context0, zzfah zzfah0, zzfbs zzfbs0, zzcag zzcag0, zzaqx zzaqx0, zzdrh zzdrh0) {
        this.zzc = s;
        this.zza = zzfar0;
        this.zzb = zzfah0;
        this.zzd = zzfbs0;
        this.zze = context0;
        this.zzf = zzcag0;
        this.zzj = ((Boolean)zzba.zzc().zzb(zzbbr.zzaD)).booleanValue();
        this.zzg = zzaqx0;
        this.zzh = zzdrh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdnq zzdnq0 = this.zzi;
        return zzdnq0 == null ? new Bundle() : zzdnq0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final zzdn zzc() {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgF)).booleanValue()) {
            return null;
        }
        zzdnq zzdnq0 = this.zzi;
        return zzdnq0 != null ? zzdnq0.zzl() : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final zzbvt zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        return this.zzi == null ? null : this.zzi.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final String zze() {
        synchronized(this) {
            zzdnq zzdnq0 = this.zzi;
            return zzdnq0 != null && zzdnq0.zzl() != null ? zzdnq0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(zzl zzl0, zzbwd zzbwd0) {
        synchronized(this) {
            this.zzu(zzl0, zzbwd0, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(zzl zzl0, zzbwd zzbwd0) {
        synchronized(this) {
            this.zzu(zzl0, zzbwd0, 3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.zzj = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(zzdd zzdd0) {
        if(zzdd0 == null) {
            this.zzb.zzg(null);
            return;
        }
        zzfat zzfat0 = new zzfat(this, zzdd0);
        this.zzb.zzg(zzfat0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzj(zzdg zzdg0) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if(!zzdg0.zzf()) {
                this.zzh.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzb.zzi(zzdg0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvz zzbvz0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbvz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzl(zzbwk zzbwk0) {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            this.zzd.zza = zzbwk0.zza;
            this.zzd.zzb = zzbwk0.zzb;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzm(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.zzn(iObjectWrapper0, this.zzj);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            if(this.zzi == null) {
                zzcaa.zzj("Rewarded can not be shown before loaded");
                zze zze0 = zzfdb.zzd(9, null, null);
                this.zzb.zzp(zze0);
                return;
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzcv)).booleanValue()) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                this.zzg.zzc().zzn(arr_stackTraceElement);
            }
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zzi.zzh(z, activity0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        return this.zzi != null && !this.zzi.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzp(zzbwe zzbwe0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwe0);
    }

    static zzdnq zzr(zzfav zzfav0) {
        return zzfav0.zzi;
    }

    static zzfbs zzs(zzfav zzfav0) {
        return zzfav0.zzd;
    }

    static void zzt(zzfav zzfav0, zzdnq zzdnq0) {
        zzfav0.zzi = zzdnq0;
    }

    private final void zzu(zzl zzl0, zzbwd zzbwd0, int v) {
        boolean z = false;
        synchronized(this) {
            if(((Boolean)zzbdi.zzl.zze()).booleanValue() && ((Boolean)zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
                z = true;
            }
            if(this.zzf.zzc < ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzkd)))) || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.zzb.zzk(zzbwd0);
            if(zzs.zzE(this.zze) && zzl0.zzs == null) {
                zzcaa.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdb.zzd(4, null, null);
                this.zzb.zzbF(zze0);
                return;
            }
            if(this.zzi != null) {
                return;
            }
            zzfaj zzfaj0 = new zzfaj(null);
            this.zza.zzj(v);
            zzfau zzfau0 = new zzfau(this);
            this.zza.zzb(zzl0, this.zzc, zzfaj0, zzfau0);
        }
    }
}

