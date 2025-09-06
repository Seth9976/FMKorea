package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzddw;

public final class zzm {
    public static final void zza(Context context0, AdOverlayInfoParcel adOverlayInfoParcel0, boolean z) {
        if(adOverlayInfoParcel0.zzk == 4 && adOverlayInfoParcel0.zzc == null) {
            zza zza0 = adOverlayInfoParcel0.zzb;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
            zzddw zzddw0 = adOverlayInfoParcel0.zzu;
            if(zzddw0 != null) {
                zzddw0.zzbK();
            }
            Activity activity0 = adOverlayInfoParcel0.zzd.zzi();
            if(adOverlayInfoParcel0.zza != null && adOverlayInfoParcel0.zza.zzj && activity0 != null) {
                context0 = activity0;
            }
            com.google.android.gms.ads.internal.overlay.zza.zzb(context0, adOverlayInfoParcel0.zza, adOverlayInfoParcel0.zzi, (adOverlayInfoParcel0.zza == null ? null : adOverlayInfoParcel0.zza.zzi));
            return;
        }
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.ads.AdActivity");
        intent0.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel0.zzm.zzd);
        intent0.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle0 = new Bundle(1);
        bundle0.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel0);
        intent0.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle0);
        if(!(context0 instanceof Activity)) {
            intent0.addFlags(0x10000000);
        }
        zzs.zzQ(context0, intent0);
    }
}

