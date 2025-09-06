package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;

public final class zzfjg extends zzfjj {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjg zzb;

    static {
        zzfjg.zzb = new zzfjg();
    }

    public static zzfjg zza() {
        return zzfjg.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzfjj
    public final void zzb(boolean z) {
        for(Object object0: zzfjh.zza().zzc()) {
            zzfju zzfju0 = ((zzfit)object0).zzg();
            if(zzfju0.zzl()) {
                zzfjn.zza().zzb(zzfju0.zza(), "setState", new Object[]{(z ? "foregrounded" : "backgrounded")});
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfjj
    public final boolean zzc() {
        for(Object object0: zzfjh.zza().zzb()) {
            View view0 = ((zzfit)object0).zzf();
            if(view0 != null && view0.hasWindowFocus()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

