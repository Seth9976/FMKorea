package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;

public final class zzt extends zzl {
    public zzt(Activity activity0) {
        super(activity0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzl
    public final void zzl(Bundle bundle0) {
        zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzn = 4;
        this.zzb.finish();
    }
}

