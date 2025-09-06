package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzcot {
    private final String zza;
    private final zzbnr zzb;
    private final Executor zzc;
    private zzcoy zzd;
    private final zzbir zze;
    private final zzbir zzf;

    public zzcot(String s, zzbnr zzbnr0, Executor executor0) {
        this.zze = new zzcoq(this);
        this.zzf = new zzcos(this);
        this.zza = s;
        this.zzb = zzbnr0;
        this.zzc = executor0;
    }

    static zzcoy zza(zzcot zzcot0) {
        return zzcot0.zzd;
    }

    static Executor zzb(zzcot zzcot0) {
        return zzcot0.zzc;
    }

    public final void zzc(zzcoy zzcoy0) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcoy0;
    }

    public final void zzd(zzcfi zzcfi0) {
        zzcfi0.zzad("/updateActiveView", this.zze);
        zzcfi0.zzad("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcfi zzcfi0) {
        zzcfi0.zzau("/updateActiveView", this.zze);
        zzcfi0.zzau("/untrackActiveViewUnit", this.zzf);
    }

    static boolean zzg(zzcot zzcot0, Map map0) {
        if(map0 != null) {
            String s = (String)map0.get("hashCode");
            return !TextUtils.isEmpty(s) && s.equals(zzcot0.zza);
        }
        return false;
    }
}

