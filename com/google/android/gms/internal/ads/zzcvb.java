package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;

public final class zzcvb implements zzfqw {
    public final Context zza;
    public final zzcag zzb;
    public final zzfca zzc;

    public zzcvb(Context context0, zzcag zzcag0, zzfca zzfca0) {
        this.zza = context0;
        this.zzb = zzcag0;
        this.zzc = zzfca0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfqw
    public final Object apply(Object object0) {
        zzas zzas0 = new zzas(this.zza);
        zzas0.zzp(((zzfbe)object0).zzC);
        zzas0.zzq(((zzfbe)object0).zzD.toString());
        zzas0.zzo(this.zzb.zza);
        zzas0.zzn(this.zzc.zzf);
        return zzas0;
    }
}

