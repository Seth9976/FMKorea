package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;

final class zzefp implements zzdfy {
    private final Context zza;
    private final zzcag zzb;
    private final d zzc;
    private final zzfbe zzd;
    private final zzcfi zze;
    private final zzfca zzf;
    private final zzbit zzg;
    private final boolean zzh;
    private final zzecs zzi;

    zzefp(Context context0, zzcag zzcag0, d d0, zzfbe zzfbe0, zzcfi zzcfi0, zzfca zzfca0, boolean z, zzbit zzbit0, zzecs zzecs0) {
        this.zza = context0;
        this.zzb = zzcag0;
        this.zzc = d0;
        this.zzd = zzfbe0;
        this.zze = zzcfi0;
        this.zzf = zzfca0;
        this.zzg = zzbit0;
        this.zzh = z;
        this.zzi = zzecs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        zzdeq zzdeq0 = (zzdeq)zzfye.zzq(this.zzc);
        this.zze.zzan(true);
        boolean z1 = false;
        boolean z2 = this.zzh ? this.zzg.zze(false) : false;
        boolean z3 = zzs.zzF(this.zza);
        boolean z4 = this.zzh;
        if(z4) {
            z1 = this.zzg.zzd();
        }
        zzj zzj0 = new zzj(z2, z3, z1, (z4 ? this.zzg.zza() : 0.0f), -1, z, this.zzd.zzP, false);
        if(zzcwv0 != null) {
            zzcwv0.zzf();
        }
        zzm.zza(context0, new AdOverlayInfoParcel(null, zzdeq0.zzh(), null, this.zze, this.zzd.zzR, this.zzb, this.zzd.zzC, zzj0, this.zzd.zzt.zzb, this.zzd.zzt.zza, this.zzf.zzf, zzcwv0, (this.zzd.zzaj ? this.zzi : null)), true);
    }
}

