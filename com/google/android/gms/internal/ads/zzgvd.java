package com.google.android.gms.internal.ads;

final class zzgvd implements zzgru {
    static final zzgru zza;

    static {
        zzgvd.zza = new zzgvd();
    }

    @Override  // com.google.android.gms.internal.ads.zzgru
    public final boolean zza(int v) {
        if(v != 0 && v != 1 && (v != 2 && v != 0x7CF)) {
            switch(v) {
                case 1000: 
                case 1001: 
                case 1002: 
                case 1003: 
                case 1004: 
                case 1005: 
                case 1006: 
                case 1007: 
                case 0x3F0: 
                case 1009: {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }
}

