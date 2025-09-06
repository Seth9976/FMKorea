package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.a;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;

public final class zzdfz implements zzo, zzcxc, zzcxw {
    zzfip zza;
    private final Context zzb;
    private final zzcfi zzc;
    private final zzfbe zzd;
    private final zzcag zze;
    private final zzaxo zzf;

    public zzdfz(Context context0, zzcfi zzcfi0, zzfbe zzfbe0, zzcag zzcag0, zzaxo zzaxo0) {
        this.zzb = context0;
        this.zzc = zzcfi0;
        this.zzd = zzfbe0;
        this.zze = zzcag0;
        this.zzf = zzaxo0;
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
        if(this.zza != null && this.zzc != null && !((Boolean)zzba.zzc().zzb(zzbbr.zzeW)).booleanValue()) {
            a a0 = new a();
            this.zzc.zzd("onSdkImpression", a0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        this.zza = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if(this.zza != null && this.zzc != null && ((Boolean)zzba.zzc().zzb(zzbbr.zzeW)).booleanValue()) {
            a a0 = new a();
            this.zzc.zzd("onSdkImpression", a0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzedi zzedi0;
        zzedh zzedh0;
        if((this.zzf == zzaxo.zzh || this.zzf == zzaxo.zzd || this.zzf == zzaxo.zzk) && this.zzd.zzU && this.zzc != null && zzt.zzA().zzj(this.zzb)) {
            String s = this.zze.zzb + "." + this.zze.zzc;
            String s1 = this.zzd.zzW.zza();
            if(this.zzd.zzW.zzb() == 1) {
                zzedh0 = zzedh.zzc;
                zzedi0 = zzedi.zzb;
            }
            else {
                zzedi0 = this.zzd.zzZ == 2 ? zzedi.zzd : zzedi.zza;
                zzedh0 = zzedh.zza;
            }
            zzfip zzfip0 = zzt.zzA().zza(s, this.zzc.zzG(), "", "javascript", s1, zzedi0, zzedh0, this.zzd.zzam);
            this.zza = zzfip0;
            if(zzfip0 != null) {
                zzt.zzA().zzh(this.zza, ((View)this.zzc));
                this.zzc.zzap(this.zza);
                zzt.zzA().zzi(this.zza);
                a a0 = new a();
                this.zzc.zzd("onSdkLoaded", a0);
            }
        }
    }
}

