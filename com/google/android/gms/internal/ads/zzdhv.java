package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

final class zzdhv implements zzfya {
    final String zza;
    final zzdhx zzb;

    zzdhv(zzdhx zzdhx0, String s, boolean z) {
        this.zzb = zzdhx0;
        this.zza = "Google";
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "omid native display exp");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzdhx.zzd(this.zzb).zzT(((zzcfi)object0));
        zzcas zzcas0 = zzdhx.zzd(this.zzb).zzp();
        zzfip zzfip0 = this.zzb.zzf(this.zza, true);
        if(zzfip0 != null && zzcas0 != null) {
            zzcas0.zzc(zzfip0);
            return;
        }
        if(zzcas0 != null) {
            zzcas0.cancel(false);
        }
    }
}

