package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

final class zzars implements zzfnb {
    private final zzfle zza;
    private final zzflv zzb;
    private final zzasf zzc;
    private final zzarr zzd;
    private final zzarb zze;
    private final zzash zzf;
    private final zzarz zzg;
    private final zzarq zzh;

    zzars(zzfle zzfle0, zzflv zzflv0, zzasf zzasf0, zzarr zzarr0, zzarb zzarb0, zzash zzash0, zzarz zzarz0, zzarq zzarq0) {
        this.zza = zzfle0;
        this.zzb = zzflv0;
        this.zzc = zzasf0;
        this.zzd = zzarr0;
        this.zze = zzarb0;
        this.zzf = zzash0;
        this.zzg = zzarz0;
        this.zzh = zzarq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnb
    public final Map zza() {
        Map map0 = this.zze();
        map0.put("lts", this.zzc.zza());
        return map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnb
    public final Map zzb() {
        Map map0 = this.zze();
        zzaos zzaos0 = this.zzb.zza();
        map0.put("gai", Boolean.valueOf(this.zza.zzd()));
        map0.put("did", "");
        map0.put("dst", ((int)(zzaos0.zzal() - 1)));
        map0.put("doo", Boolean.valueOf(zzaos0.zzai()));
        zzarb zzarb0 = this.zze;
        if(zzarb0 != null) {
            map0.put("nt", zzarb0.zza());
        }
        zzash zzash0 = this.zzf;
        if(zzash0 != null) {
            map0.put("vs", zzash0.zzc());
            map0.put("vf", this.zzf.zzb());
        }
        return map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnb
    public final Map zzc() {
        Map map0 = this.zze();
        zzarq zzarq0 = this.zzh;
        if(zzarq0 != null) {
            map0.put("vst", zzarq0.zza());
        }
        return map0;
    }

    final void zzd(View view0) {
        this.zzc.zzd(view0);
    }

    private final Map zze() {
        Map map0 = new HashMap();
        this.zzb.zzb();
        map0.put("v", this.zza.zzb());
        map0.put("gms", Boolean.valueOf(this.zza.zzc()));
        map0.put("int", "");
        map0.put("up", Boolean.valueOf(this.zzd.zza()));
        map0.put("t", new Throwable());
        zzarz zzarz0 = this.zzg;
        if(zzarz0 != null) {
            map0.put("tcq", zzarz0.zzc());
            map0.put("tpq", this.zzg.zzg());
            map0.put("tcv", this.zzg.zzd());
            map0.put("tpv", this.zzg.zzh());
            map0.put("tchv", this.zzg.zzb());
            map0.put("tphv", this.zzg.zzf());
            map0.put("tcc", this.zzg.zza());
            map0.put("tpc", this.zzg.zze());
        }
        return map0;
    }
}

