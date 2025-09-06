package com.google.android.gms.internal.ads;

final class zzaji extends zzaan {
    public zzaji(zzfi zzfi0, long v, long v1) {
        super(new zzaai(), new zzajh(zzfi0, null), v, 0L, v + 1L, 0L, v1, 0xBCL, 1000);
    }

    static int zzh(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }
}

