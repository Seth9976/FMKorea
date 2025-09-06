package com.google.android.gms.internal.ads;

import Z1.d;
import android.net.Uri.Builder;
import android.view.InputEvent;

public final class zzcnu implements zzfxl {
    public final zzcob zza;
    public final Uri.Builder zzb;
    public final String zzc;
    public final InputEvent zzd;

    public zzcnu(zzcob zzcob0, Uri.Builder uri$Builder0, String s, InputEvent inputEvent0) {
        this.zza = zzcob0;
        this.zzb = uri$Builder0;
        this.zzc = s;
        this.zzd = inputEvent0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, ((Integer)object0));
    }
}

