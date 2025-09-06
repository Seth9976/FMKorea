package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

public final class zzcby {
    private final Context zza;
    private final zzccj zzb;
    private final ViewGroup zzc;
    private zzcbx zzd;

    public zzcby(Context context0, ViewGroup viewGroup0, zzcfi zzcfi0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zza = context0;
        this.zzc = viewGroup0;
        this.zzb = zzcfi0;
        this.zzd = null;
    }

    public final zzcbx zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        return this.zzd == null ? null : this.zzd.zzl();
    }

    public final void zzc(int v, int v1, int v2, int v3) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbx zzcbx0 = this.zzd;
        if(zzcbx0 != null) {
            zzcbx0.zzF(v, v1, v2, v3);
        }
    }

    public final void zzd(int v, int v1, int v2, int v3, int v4, boolean z, zzcci zzcci0) {
        if(this.zzd != null) {
            return;
        }
        zzbcb.zza(this.zzb.zzm().zza(), this.zzb.zzk(), new String[]{"vpr2"});
        zzbcj zzbcj0 = this.zzb.zzm().zza();
        zzcbx zzcbx0 = new zzcbx(this.zza, this.zzb, v4, z, zzbcj0, zzcci0);
        this.zzd = zzcbx0;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        this.zzc.addView(zzcbx0, 0, viewGroup$LayoutParams0);
        this.zzd.zzF(v, v1, v2, v3);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbx zzcbx0 = this.zzd;
        if(zzcbx0 != null) {
            zzcbx0.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbx zzcbx0 = this.zzd;
        if(zzcbx0 != null) {
            zzcbx0.zzu();
        }
    }

    public final void zzg(int v) {
        zzcbx zzcbx0 = this.zzd;
        if(zzcbx0 != null) {
            zzcbx0.zzC(v);
        }
    }
}

