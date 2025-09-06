package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzaag {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzaag(List list0, int v, int v1, int v2, int v3, int v4, int v5, float f, String s) {
        this.zza = list0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = v4;
        this.zzg = v5;
        this.zzh = f;
        this.zzi = s;
    }

    public static zzaag zza(zzfb zzfb0) {
        int v10;
        int v9;
        int v8;
        float f;
        int v7;
        int v6;
        String s;
        try {
            zzfb0.zzH(4);
            int v = zzfb0.zzl();
            int v1 = (v & 3) + 1;
            if(v1 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList0 = new ArrayList();
            int v2 = zzfb0.zzl();
            for(int v3 = 0; v3 < (v2 & 0x1F); ++v3) {
                arrayList0.add(zzaag.zzb(zzfb0));
            }
            int v4 = zzfb0.zzl();
            for(int v5 = 0; v5 < v4; ++v5) {
                arrayList0.add(zzaag.zzb(zzfb0));
            }
            if((v2 & 0x1F) > 0) {
                byte[] arr_b = (byte[])arrayList0.get(0);
                zzfx zzfx0 = zzfy.zze(((byte[])arrayList0.get(0)), (v & 3) + 2, arr_b.length);
                s = zzea.zza(zzfx0.zza, zzfx0.zzb, zzfx0.zzc);
                v6 = zzfx0.zzi;
                v7 = zzfx0.zzj;
                f = zzfx0.zzg;
                v8 = zzfx0.zze;
                v9 = zzfx0.zzf;
                v10 = zzfx0.zzh;
            }
            else {
                v8 = -1;
                v9 = -1;
                v10 = -1;
                v6 = -1;
                v7 = -1;
                s = null;
                f = 1.0f;
            }
            return new zzaag(arrayList0, v1, v8, v9, v10, v6, v7, f, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw zzcd.zza("Error parsing AVC config", arrayIndexOutOfBoundsException0);
    }

    private static byte[] zzb(zzfb zzfb0) {
        int v = zzfb0.zzp();
        zzfb0.zzH(v);
        return zzea.zzc(zzfb0.zzI(), zzfb0.zzc(), v);
    }
}

