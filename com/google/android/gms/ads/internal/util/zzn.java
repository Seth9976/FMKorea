package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbcq;
import com.google.android.gms.internal.ads.zzbcs;
import com.google.android.gms.internal.ads.zzgzh;

final class zzn implements zzbcq {
    final zzbcs zza;
    final Context zzb;
    final Uri zzc;

    zzn(zzs zzs0, zzbcs zzbcs0, Context context0, Uri uri0) {
        this.zza = zzbcs0;
        this.zzb = context0;
        this.zzc = uri0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbcq
    public final void zza() {
        d d0 = new androidx.browser.customtabs.d.d(this.zza.zza()).a();
        String s = zzgzh.zza(this.zzb);
        d0.a.setPackage(s);
        d0.a(this.zzb, this.zzc);
        this.zza.zzf(((Activity)this.zzb));
    }
}

