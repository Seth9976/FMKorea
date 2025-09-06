package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class zzaho extends zzahy {
    private zzabo zza;
    private zzahn zzb;

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfb0) {
        if(zzaho.zzd(zzfb0.zzI())) {
            int v = (zzfb0.zzI()[2] & 0xFF) >> 4;
            switch(v) {
                case 6: {
                    zzfb0.zzH(4);
                    zzfb0.zzv();
                    break;
                }
                case 7: {
                    v = 7;
                    zzfb0.zzH(4);
                    zzfb0.zzv();
                }
            }
            int v1 = zzabk.zza(zzfb0, v);
            zzfb0.zzG(0);
            return (long)v1;
        }
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if(z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final boolean zzc(zzfb zzfb0, long v, zzahv zzahv0) {
        byte[] arr_b = zzfb0.zzI();
        zzabo zzabo0 = this.zza;
        if(zzabo0 == null) {
            zzabo zzabo1 = new zzabo(arr_b, 17);
            this.zza = zzabo1;
            zzahv0.zza = zzabo1.zzc(Arrays.copyOfRange(arr_b, 9, zzfb0.zzd()), null);
            return true;
        }
        if((arr_b[0] & 0x7F) == 3) {
            zzabn zzabn0 = zzabl.zzb(zzfb0);
            zzabo zzabo2 = zzabo0.zzf(zzabn0);
            this.zza = zzabo2;
            this.zzb = new zzahn(zzabo2, zzabn0);
            return true;
        }
        if(zzaho.zzd(arr_b)) {
            zzahn zzahn0 = this.zzb;
            if(zzahn0 != null) {
                zzahn0.zza(v);
                zzahv0.zzb = this.zzb;
            }
            zzahv0.zza.getClass();
            return false;
        }
        return true;
    }

    private static boolean zzd(byte[] arr_b) {
        return arr_b[0] == -1;
    }
}

