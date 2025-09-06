package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzgyi extends zzgyl {
    final Logger zza;

    public zzgyi(String s) {
        this.zza = Logger.getLogger(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzgyl
    public final void zza(String s) {
        this.zza.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", s);
    }
}

