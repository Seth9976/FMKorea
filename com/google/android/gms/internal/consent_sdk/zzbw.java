package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

public final class zzbw extends WebView {
    private final Handler zza;
    private final zzcc zzb;
    private boolean zzc;

    public zzbw(zzby zzby0, Handler handler0, zzcc zzcc0) {
        super(zzby0);
        this.zzc = false;
        this.zza = handler0;
        this.zzb = zzcc0;
    }

    static zzcc zza(zzbw zzbw0) {
        return zzbw0.zzb;
    }

    static void zzb(zzbw zzbw0, boolean z) {
        zzbw0.zzc = true;
    }

    public final void zzc(String s, String s1) {
        zzbt zzbt0 = new zzbt(this, s + "(" + s1 + ");");
        this.zza.post(zzbt0);
    }

    static boolean zzd(zzbw zzbw0) {
        return zzbw0.zzc;
    }

    static boolean zze(zzbw zzbw0, String s) {
        return s != null && s.startsWith("consent://");
    }
}

