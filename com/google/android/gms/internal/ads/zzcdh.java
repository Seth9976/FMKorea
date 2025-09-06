package com.google.android.gms.internal.ads;

final class zzcdh extends zzamx {
    static final zzcdh zzb;

    static {
        zzcdh.zzb = new zzcdh();
    }

    @Override  // com.google.android.gms.internal.ads.zzamx
    public final zzanb zza(String s, byte[] arr_b, String s1) {
        if("moov".equals(s)) {
            return new zzand();
        }
        return "mvhd".equals(s) ? new zzane() : new zzanf(s);
    }
}

