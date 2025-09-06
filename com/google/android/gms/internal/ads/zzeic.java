package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;

final class zzeic implements zzdfy {
    private final Context zza;
    private final zzdom zzb;
    private final zzfca zzc;
    private final zzcag zzd;
    private final zzfbe zze;
    private final d zzf;
    private final zzcfi zzg;
    private final zzbit zzh;
    private final boolean zzi;
    private final zzecs zzj;

    zzeic(Context context0, zzdom zzdom0, zzfca zzfca0, zzcag zzcag0, zzfbe zzfbe0, d d0, zzcfi zzcfi0, zzbit zzbit0, boolean z, zzecs zzecs0) {
        this.zza = context0;
        this.zzb = zzdom0;
        this.zzc = zzfca0;
        this.zzd = zzcag0;
        this.zze = zzfbe0;
        this.zzf = d0;
        this.zzg = zzcfi0;
        this.zzh = zzbit0;
        this.zzi = z;
        this.zzj = zzecs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        zzcfi zzcfi0;
        zzecs zzecs0;
        zzdnr zzdnr0 = (zzdnr)zzfye.zzq(this.zzf);
        try {
            zzfbe zzfbe0 = this.zze;
            zzecs0 = null;
            if(!this.zzg.zzaB()) {
                zzcfi0 = this.zzg;
            }
            else if(!((Boolean)zzba.zzc().zzb(zzbbr.zzaK)).booleanValue()) {
                zzcfi0 = this.zzg;
            }
            else {
                zzcfi zzcfi1 = this.zzb.zza(this.zzc.zze, null, null);
                zzbji.zzb(zzcfi1, zzdnr0.zzg());
                zzdoq zzdoq0 = new zzdoq();
                zzdoq0.zza(this.zza, ((View)zzcfi1));
                zzdnr0.zzl().zzi(zzcfi1, true, (this.zzi ? this.zzh : null));
                zzcfi1.zzN().zzA(new zzeia(zzdoq0, zzcfi1));
                zzcfi1.zzN().zzG(new zzeib(zzcfi1));
                zzcfi1.zzab(zzfbe0.zzt.zzb, zzfbe0.zzt.zza, null);
                zzcfi0 = zzcfi1;
            }
        }
        catch(zzcft zzcft0) {
            zzcaa.zzh("", zzcft0);
            return;
        }
        zzcfi0.zzan(true);
        boolean z1 = false;
        boolean z2 = this.zzi ? this.zzh.zze(false) : false;
        boolean z3 = zzs.zzF(this.zza);
        boolean z4 = this.zzi;
        if(z4) {
            z1 = this.zzh.zzd();
        }
        zzj zzj0 = new zzj(z2, z3, z1, (z4 ? this.zzh.zza() : 0.0f), -1, z, this.zze.zzP, this.zze.zzQ);
        if(zzcwv0 != null) {
            zzcwv0.zzf();
        }
        zzdfn zzdfn0 = zzdnr0.zzh();
        int v = this.zze.zzR;
        zzcag zzcag0 = this.zzd;
        String s = this.zze.zzC;
        String s1 = this.zze.zzt.zzb;
        String s2 = this.zze.zzt.zza;
        String s3 = this.zzc.zzf;
        if(this.zze.zzaj) {
            zzecs0 = this.zzj;
        }
        zzm.zza(context0, new AdOverlayInfoParcel(null, zzdfn0, null, zzcfi0, v, zzcag0, s, zzj0, s1, s2, s3, zzcwv0, zzecs0), true);
    }
}

