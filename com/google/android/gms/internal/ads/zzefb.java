package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;

public final class zzefb implements zzdfy {
    public final zzcas zza;

    public zzefb(zzcas zzcas0) {
        this.zza = zzcas0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdfy
    public final void zza(boolean z, Context context0, zzcwv zzcwv0) {
        try {
            zzm.zza(context0, ((AdOverlayInfoParcel)this.zza.get()), true);
        }
        catch(Exception unused_ex) {
        }
    }
}

