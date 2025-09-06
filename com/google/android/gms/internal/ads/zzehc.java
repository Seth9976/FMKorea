package com.google.android.gms.internal.ads;

import Z1.d;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzehc {
    private final Clock zza;
    private final zzehd zzb;
    private final zzfik zzc;
    private final List zzd;
    private final boolean zze;
    private final zzeds zzf;

    public zzehc(Clock clock0, zzehd zzehd0, zzeds zzeds0, zzfik zzfik0) {
        this.zzd = Collections.synchronizedList(new ArrayList());
        this.zza = clock0;
        this.zzb = zzehd0;
        this.zze = ((Boolean)zzba.zzc().zzb(zzbbr.zzgK)).booleanValue();
        this.zzf = zzeds0;
        this.zzc = zzfik0;
    }

    final d zze(zzfbr zzfbr0, zzfbe zzfbe0, d d0, zzfig zzfig0) {
        zzfbi zzfbi0 = zzfbr0.zzb.zzb;
        long v = this.zza.elapsedRealtime();
        String s = zzfbe0.zzx;
        if(s != null) {
            zzfye.zzr(d0, new zzehb(this, v, s, zzfbe0, zzfbi0, zzfig0, zzfbr0), zzcan.zzf);
        }
        return d0;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }

    static void zzg(zzehc zzehc0, String s, int v, long v1, String s1, Integer integer0) {
        String s2 = TextUtils.isEmpty(s1) ? s + "." + v + "." + v1 : s + "." + v + "." + v1 + "." + s1;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbz)).booleanValue() && integer0 != null && !TextUtils.isEmpty(s1)) {
            s2 = s2 + "." + integer0;
        }
        zzehc0.zzd.add(s2);
    }
}

