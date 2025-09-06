package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

final class zzcol implements zzfya {
    final zzcon zza;

    zzcol(zzcon zzcon0) {
        this.zza = zzcon0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        List list0 = zzcon.zzk(this.zza).zzd(zzcon.zzi(this.zza), zzcon.zzh(this.zza), false, "", ((String)object0), zzcon.zzh(this.zza).zzc);
        zzcon.zzj(this.zza).zzc(list0, (zzt.zzo().zzx(zzcon.zzg(this.zza)) ? 2 : 1));
    }
}

