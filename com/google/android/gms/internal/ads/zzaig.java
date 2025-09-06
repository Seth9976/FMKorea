package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzaig implements zzabb {
    public static final zzabi zza;
    private final zzaih zzb;
    private final zzfb zzc;
    private boolean zzd;

    static {
        zzaig.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzaig()};
    }

    public zzaig() {
        this.zzb = new zzaih(null);
        this.zzc = new zzfb(0x4000);
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        int v = zzabc0.zza(this.zzc.zzI(), 0, 0x4000);
        if(v == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(v);
        if(!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        zzaka zzaka0 = new zzaka(0x80000000, 0, 1);
        this.zzb.zzb(zzabe0, zzaka0);
        zzabe0.zzC();
        zzabe0.zzN(new zzabz(0x8000000000000001L, 0L));
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        int v6;
        zzfb zzfb0 = new zzfb(10);
        int v = 0;
        while(true) {
            ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, 10, false);
            zzfb0.zzG(0);
            if(zzfb0.zzn() != 4801587) {
                break;
            }
            zzfb0.zzH(3);
            int v1 = zzfb0.zzk();
            v += v1 + 10;
            ((zzaar)zzabc0).zzl(v1, false);
        }
        zzabc0.zzj();
        ((zzaar)zzabc0).zzl(v, false);
        int v2 = 0;
        int v3 = v;
        while(true) {
            int v4 = 7;
            ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, 7, false);
            zzfb0.zzG(0);
            int v5 = zzfb0.zzp();
            if(v5 != 0xAC40 && v5 != 44097) {
                zzabc0.zzj();
                ++v3;
                if(v3 - v < 0x2000) {
                    ((zzaar)zzabc0).zzl(v3, false);
                    v2 = 0;
                    continue;
                }
                return false;
            }
            ++v2;
            if(v2 >= 4) {
                return true;
            }
            byte[] arr_b = zzfb0.zzI();
            if(arr_b.length < 7) {
                v6 = -1;
            }
            else {
                int v7 = arr_b[3] & 0xFF | (arr_b[2] & 0xFF) << 8;
                if(v7 == 0xFFFF) {
                    v7 = (arr_b[4] & 0xFF) << 16 | (arr_b[5] & 0xFF) << 8 | arr_b[6] & 0xFF;
                }
                else {
                    v4 = 4;
                }
                if(v5 == 44097) {
                    v4 += 2;
                }
                v6 = v7 + v4;
            }
            if(v6 == -1) {
                return false;
            }
            ((zzaar)zzabc0).zzl(v6 - 7, false);
        }
    }
}

