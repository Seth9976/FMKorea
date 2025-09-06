package com.google.android.gms.internal.ads;

public final class zzahh {
    public final boolean zza;
    public final String zzb;
    public final zzacd zzc;
    public final int zzd;
    public final byte[] zze;

    public zzahh(boolean z, String s, int v, byte[] arr_b, int v1, int v2, byte[] arr_b1) {
        int v3 = 1;
        zzdy.zzd(((boolean)((v == 0 ? 1 : 0) ^ (arr_b1 == null ? 1 : 0))));
        this.zza = z;
        this.zzb = s;
        this.zzd = v;
        this.zze = arr_b1;
        if(s != null) {
            switch(s) {
                case "cbc1": 
                case "cbcs": {
                    v3 = 2;
                    break;
                }
                case "cenc": 
                case "cens": {
                    break;
                }
                default: {
                    zzes.zzf("TrackEncryptionBox", "Unsupported protection scheme type \'" + s + "\'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.zzc = new zzacd(v3, arr_b, v1, v2);
    }
}

