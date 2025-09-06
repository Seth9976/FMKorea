package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;

public final class zzaut extends zzca {
    private final AppEventListener zza;

    public zzaut(AppEventListener appEventListener0) {
        this.zza = appEventListener0;
    }

    public final AppEventListener zzb() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String s, String s1) {
        this.zza.onAppEvent(s, s1);
    }
}

