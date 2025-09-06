package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzddw;

public final class zzy extends zzbsb {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzy(Activity activity0, AdOverlayInfoParcel adOverlayInfoParcel0) {
        this.zzc = false;
        this.zzd = false;
        this.zze = false;
        this.zza = adOverlayInfoParcel0;
        this.zzb = activity0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final boolean zzG() {
        return false;
    }

    private final void zzb() {
        synchronized(this) {
            if(!this.zzd) {
                zzo zzo0 = this.zza.zzc;
                if(zzo0 != null) {
                    zzo0.zzby(4);
                }
                this.zzd = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzh(int v, int v1, Intent intent0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzi() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzk(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzl(Bundle bundle0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzix)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zza;
        if(adOverlayInfoParcel0 == null) {
            this.zzb.finish();
            return;
        }
        if(z) {
            this.zzb.finish();
            return;
        }
        if(bundle0 == null) {
            zza zza0 = adOverlayInfoParcel0.zzb;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
            zzddw zzddw0 = this.zza.zzu;
            if(zzddw0 != null) {
                zzddw0.zzbK();
            }
            if(this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)) {
                zzo zzo0 = this.zza.zzc;
                if(zzo0 != null) {
                    zzo0.zzbv();
                }
            }
        }
        if(!com.google.android.gms.ads.internal.overlay.zza.zzb(this.zzb, this.zza.zza, this.zza.zzi, this.zza.zza.zzi)) {
            this.zzb.finish();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzm() {
        if(this.zzb.isFinishing()) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzo() {
        zzo zzo0 = this.zza.zzc;
        if(zzo0 != null) {
            zzo0.zzbo();
        }
        if(this.zzb.isFinishing()) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzp(int v, String[] arr_s, int[] arr_v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzr() {
        if(this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzo0 = this.zza.zzc;
        if(zzo0 != null) {
            zzo0.zzbL();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzs(Bundle bundle0) {
        bundle0.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzt() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzu() {
        if(this.zzb.isFinishing()) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzv() {
        zzo zzo0 = this.zza.zzc;
        if(zzo0 != null) {
            zzo0.zzbx();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzx() {
        this.zze = true;
    }
}

