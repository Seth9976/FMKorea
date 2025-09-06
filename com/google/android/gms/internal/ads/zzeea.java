package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzj;

final class zzeea implements zzdfy {
    private final zzcag zza;
    private final d zzb;
    private final zzfbe zzc;
    private final zzcfi zzd;
    private final zzfca zze;
    private final zzbit zzf;
    private final boolean zzg;
    private final zzecs zzh;

    zzeea(zzcag zzcag0, d d0, zzfbe zzfbe0, zzcfi zzcfi0, zzfca zzfca0, boolean z, zzbit zzbit0, zzecs zzecs0) {
        this.zza = zzcag0;
        this.zzb = d0;
        this.zzc = zzfbe0;
        this.zzd = zzcfi0;
        this.zze = zzfca0;
        this.zzg = z;
        this.zzf = zzbit0;
        this.zzh = zzecs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        zzcpn zzcpn0 = (zzcpn)zzfye.zzq(this.zzb);
        this.zzd.zzan(true);
        zzj zzj0 = new zzj((this.zzg ? this.zzf.zze(true) : true), true, (this.zzg ? this.zzf.zzd() : false), (this.zzg ? this.zzf.zza() : 0.0f), -1, z, this.zzc.zzP, false);
        if(zzcwv0 != null) {
            zzcwv0.zzf();
        }
        zzdfn zzdfn0 = zzcpn0.zzg();
        zzcfi zzcfi0 = this.zzd;
        int v = this.zzc.zzR;
        if(v == -1) {
            zzw zzw0 = this.zze.zzj;
            if(zzw0 == null) {
                zzcaa.zze("Error setting app open orientation; no targeting orientation available.");
                v = this.zzc.zzR;
            }
            else {
                int v1 = zzw0.zza;
                if(v1 == 1) {
                    v = 7;
                }
                else if(v1 == 2) {
                    v = 6;
                }
                else {
                    zzcaa.zze("Error setting app open orientation; no targeting orientation available.");
                    v = this.zzc.zzR;
                }
            }
        }
        zzm.zza(context0, new AdOverlayInfoParcel(null, zzdfn0, null, zzcfi0, v, this.zza, this.zzc.zzC, zzj0, this.zzc.zzt.zzb, this.zzc.zzt.zza, this.zze.zzf, zzcwv0, (this.zzc.zzaj ? this.zzh : null)), true);
    }
}

