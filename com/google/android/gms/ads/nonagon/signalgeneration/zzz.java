package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfya;

final class zzz implements zzfya {
    final zzaa zza;

    zzz(zzaa zzaa0) {
        this.zza = zzaa0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzt.zzo().zzu(throwable0, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair[] arr_pair = {new Pair("sgf_reason", throwable0.getMessage())};
        zzf.zzc(this.zza.zzr, this.zza.zzj, "sgf", arr_pair);
        zzcaa.zzh("Failed to initialize webview for loading SDKCore. ", throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzam zzam0 = (zzam)object0;
        zzcaa.zze("Initialized webview successfully for SDKCore.");
    }
}

