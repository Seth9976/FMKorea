package com.google.android.gms.internal.ads;

import java.util.List;

final class zzcom implements zzfya {
    final String zza;
    final zzcon zzb;

    zzcom(zzcon zzcon0, String s) {
        this.zzb = zzcon0;
        this.zza = s;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        List list0 = zzcon.zzk(this.zzb).zzd(zzcon.zzi(this.zzb), zzcon.zzh(this.zzb), false, this.zza, null, zzcon.zzh(this.zzb).zzd);
        zzcon.zzj(this.zzb).zza(list0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        List list0 = zzcon.zzk(this.zzb).zzd(zzcon.zzi(this.zzb), zzcon.zzh(this.zzb), false, this.zza, ((String)object0), zzcon.zzh(this.zzb).zzd);
        zzcon.zzj(this.zzb).zza(list0);
    }
}

