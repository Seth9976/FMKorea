package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzalp;
import com.google.android.gms.internal.ads.zzals;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzame;
import com.google.android.gms.internal.ads.zzaml;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbzt;
import java.io.File;
import java.util.regex.Pattern;

public final class zzax extends zzame {
    private final Context zzc;

    private zzax(Context context0, zzamd zzamd0) {
        super(zzamd0);
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzame
    public final zzall zza(zzalp zzalp0) {
        if(zzalp0.zza() == 0 && Pattern.matches(((String)zzba.zzc().zzb(zzbbr.zzen)), zzalp0.zzk()) && zzbzt.zzs(this.zzc, 13400000)) {
            zzall zzall0 = new zzbkn(this.zzc).zza(zzalp0);
            if(zzall0 != null) {
                zze.zza(("Got gmscore asset response: " + zzalp0.zzk()));
                return zzall0;
            }
            zze.zza(("Failed to get gmscore asset response: " + zzalp0.zzk()));
        }
        return super.zza(zzalp0);
    }

    public static zzals zzb(Context context0) {
        zzax zzax0 = new zzax(context0, new zzamp());
        zzals zzals0 = new zzals(new zzaml(new File(context0.getCacheDir(), "admob_volley"), 0x1400000), zzax0, 4);
        zzals0.zzd();
        return zzals0;
    }
}

