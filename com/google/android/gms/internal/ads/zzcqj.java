package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

public class zzcqj {
    private final zzcsc zza;
    private final View zzb;
    private final zzfbf zzc;
    private final zzcfi zzd;

    public zzcqj(View view0, zzcfi zzcfi0, zzcsc zzcsc0, zzfbf zzfbf0) {
        this.zzb = view0;
        this.zzd = zzcfi0;
        this.zza = zzcsc0;
        this.zzc = zzfbf0;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcfi zzb() {
        return this.zzd;
    }

    public final zzcsc zzc() {
        return this.zza;
    }

    public zzcxu zzd(Set set0) {
        return new zzcxu(set0);
    }

    public final zzfbf zze() {
        return this.zzc;
    }

    public static final zzddo zzf(Context context0, zzcag zzcag0, zzfbe zzfbe0, zzfca zzfca0) {
        return new zzddo(new zzcqh(context0, zzcag0, zzfbe0, zzfca0), zzcan.zzf);
    }

    public static final Set zzg(zzcrt zzcrt0) {
        return Collections.singleton(new zzddo(zzcrt0, zzcan.zzf));
    }

    public static final zzddo zzh(zzcrr zzcrr0) {
        return new zzddo(zzcrr0, zzcan.zze);
    }
}

