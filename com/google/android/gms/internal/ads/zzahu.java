package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

final class zzahu extends zzahy {
    private static final byte[] zza;
    private static final byte[] zzb;
    private boolean zzc;

    static {
        zzahu.zza = new byte[]{0x4F, 0x70, 0x75, 0x73, 72, 101, 97, 100};
        zzahu.zzb = new byte[]{0x4F, 0x70, 0x75, 0x73, 84, 97, 103, 0x73};
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final long zza(zzfb zzfb0) {
        return this.zzg(zzabw.zzc(zzfb0.zzI()));
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final void zzb(boolean z) {
        super.zzb(z);
        if(z) {
            this.zzc = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzahy
    protected final boolean zzc(zzfb zzfb0, long v, zzahv zzahv0) {
        if(zzahu.zzk(zzfb0, zzahu.zza)) {
            byte[] arr_b = Arrays.copyOf(zzfb0.zzI(), zzfb0.zzd());
            int v1 = arr_b[9] & 0xFF;
            List list0 = zzabw.zzd(arr_b);
            if(zzahv0.zza != null) {
                return true;
            }
            zzak zzak0 = new zzak();
            zzak0.zzS("audio/opus");
            zzak0.zzw(v1);
            zzak0.zzT(48000);
            zzak0.zzI(list0);
            zzahv0.zza = zzak0.zzY();
            return true;
        }
        if(zzahu.zzk(zzfb0, zzahu.zzb)) {
            zzdy.zzb(zzahv0.zza);
            if(this.zzc) {
                return true;
            }
            this.zzc = true;
            zzfb0.zzH(8);
            zzbz zzbz0 = zzack.zzb(zzfud.zzk(zzack.zzc(zzfb0, false, false).zzb));
            if(zzbz0 == null) {
                return true;
            }
            zzak zzak1 = zzahv0.zza.zzb();
            zzak1.zzM(zzbz0.zzd(zzahv0.zza.zzk));
            zzahv0.zza = zzak1.zzY();
            return true;
        }
        zzdy.zzb(zzahv0.zza);
        return false;
    }

    public static boolean zzd(zzfb zzfb0) {
        return zzahu.zzk(zzfb0, zzahu.zza);
    }

    private static boolean zzk(zzfb zzfb0, byte[] arr_b) {
        if(zzfb0.zza() < 8) {
            return false;
        }
        byte[] arr_b1 = new byte[8];
        zzfb0.zzC(arr_b1, 0, 8);
        zzfb0.zzG(zzfb0.zzc());
        return Arrays.equals(arr_b1, arr_b);
    }
}

