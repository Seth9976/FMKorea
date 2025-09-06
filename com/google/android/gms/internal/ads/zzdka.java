package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

final class zzdka implements zzfya {
    final zzdkb zza;

    zzdka(zzdkb zzdkb0) {
        this.zza = zzdkb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "omid native display exp");
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        this.zzc(((List)object0));
    }

    public final void zzc(List list0) {
        try {
            zzcfi zzcfi0 = (zzcfi)list0.get(0);
            zzdkb.zza(this.zza, zzcfi0);
        }
        catch(IndexOutOfBoundsException | ClassCastException indexOutOfBoundsException0) {
            zzt.zzo().zzu(indexOutOfBoundsException0, "omid native display exp");
        }
    }
}

