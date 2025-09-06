package com.google.android.gms.internal.ads;

import Z1.d;
import android.net.Uri.Builder;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzcnx implements zzfxl {
    public final Uri.Builder zza;

    public zzcnx(Uri.Builder uri$Builder0) {
        this.zza = uri$Builder0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxl
    public final d zza(Object object0) {
        String s = (String)zzba.zzc().zzb(zzbbr.zzjr);
        this.zza.appendQueryParameter(s, "12");
        return zzfye.zzh(this.zza.toString());
    }
}

