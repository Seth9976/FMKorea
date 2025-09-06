package com.google.android.gms.internal.ads;

final class zzfqq extends zzfqp {
    private final char zza;

    zzfqq(char c) {
        this.zza = c;
    }

    @Override
    public final String toString() {
        int v = this.zza;
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_c[5 - v1] = "0123456789ABCDEF".charAt(v & 15);
            v >>= 4;
        }
        return "CharMatcher.is(\'" + String.copyValueOf(arr_c) + "\')";
    }

    @Override  // com.google.android.gms.internal.ads.zzfqt
    public final boolean zzb(char c) {
        return c == this.zza;
    }
}

