package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

final class zzakt extends zzaku {
    private final byte[] zza;

    public zzakt(X509Certificate x509Certificate0, byte[] arr_b) {
        super(x509Certificate0);
        this.zza = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzaku
    public final byte[] getEncoded() {
        return this.zza;
    }
}

