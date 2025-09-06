package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.b.a;
import androidx.privacysandbox.ads.adservices.topics.b;

public final class zzedl {
    private final Context zza;

    zzedl(Context context0) {
        this.zza = context0;
    }

    public final d zza(boolean z) {
        b b0 = new a().b("com.google.android.gms.ads").c(z).a();
        d0.a a0 = d0.a.a(this.zza);
        return a0 == null ? zzfye.zzg(new IllegalStateException()) : a0.b(b0);
    }
}

