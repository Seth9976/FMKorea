package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

public final class zzdgd implements zzcwi, zzddf {
    private final zzbxn zza;
    private final Context zzb;
    private final zzbyf zzc;
    private final View zzd;
    private String zze;
    private final zzaxo zzf;

    public zzdgd(zzbxn zzbxn0, Context context0, zzbyf zzbyf0, View view0, zzaxo zzaxo0) {
        this.zza = zzbxn0;
        this.zzb = context0;
        this.zzc = zzbyf0;
        this.zzd = view0;
        this.zzf = zzaxo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        this.zza.zzb(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvd0, String s, String s1) {
        if(this.zzc.zzu(this.zzb)) {
            try {
                String s2 = this.zzc.zza(this.zzb);
                String s3 = zzbvd0.zzc();
                int v = zzbvd0.zzb();
                this.zzc.zzo(this.zzb, s2, this.zza.zza(), s3, v);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Remote Exception to get reward item.", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        View view0 = this.zzd;
        if(view0 != null && this.zze != null) {
            Context context0 = view0.getContext();
            this.zzc.zzs(context0, this.zze);
        }
        this.zza.zzb(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddf
    public final void zzk() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddf
    public final void zzl() {
        if(this.zzf == zzaxo.zzk) {
            return;
        }
        this.zze = this.zzc.zzd(this.zzb) + (this.zzf == zzaxo.zzh ? "/Rewarded" : "/Interstitial");
    }
}

