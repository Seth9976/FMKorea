package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcas;
import java.util.Map;

public final class zzbn extends zzalp {
    private final zzcas zza;
    private final zzbzz zzb;

    public zzbn(String s, Map map0, zzcas zzcas0) {
        super(0, s, new zzbm(zzcas0));
        this.zza = zzcas0;
        zzbzz zzbzz0 = new zzbzz(null);
        this.zzb = zzbzz0;
        zzbzz0.zzd(s, "GET", null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzalp
    protected final zzalv zzh(zzall zzall0) {
        return zzalv.zzb(zzall0, zzamm.zzb(zzall0));
    }

    @Override  // com.google.android.gms.internal.ads.zzalp
    protected final void zzo(Object object0) {
        this.zzb.zzf(((zzall)object0).zzc, ((zzall)object0).zza);
        zzbzz zzbzz0 = this.zzb;
        byte[] arr_b = ((zzall)object0).zzb;
        if(zzbzz.zzk() && arr_b != null) {
            zzbzz0.zzh(arr_b);
        }
        this.zza.zzc(((zzall)object0));
    }
}

