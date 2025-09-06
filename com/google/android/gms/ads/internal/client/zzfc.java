package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzbwk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

public final class zzfc extends zzbvv {
    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final zzdn zzc() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final zzbvt zzd() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final String zze() {
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(zzl zzl0, zzbwd zzbwd0) {
        zzfc.zzr(zzbwd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(zzl zzl0, zzbwd zzbwd0) {
        zzfc.zzr(zzbwd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(zzdd zzdd0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzj(zzdg zzdg0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvz zzbvz0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzl(zzbwk zzbwk0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzm(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final boolean zzo() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvw
    public final void zzp(zzbwe zzbwe0) {
    }

    private static void zzr(zzbwd zzbwd0) {
        zzcaa.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzfb zzfb0 = new zzfb(zzbwd0);
        zzbzt.zza.post(zzfb0);
    }
}

