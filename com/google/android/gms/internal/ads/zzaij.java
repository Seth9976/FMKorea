package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class zzaij implements zzabb {
    public static final zzabi zza;
    private final zzaik zzb;
    private final zzfb zzc;
    private final zzfb zzd;
    private final zzfa zze;
    private zzabe zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzaij.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzaij(0)};
    }

    public zzaij() {
        this(0);
    }

    public zzaij(int v) {
        this.zzb = new zzaik(true, null);
        this.zzc = new zzfb(0x800);
        this.zzh = -1L;
        zzfb zzfb0 = new zzfb(10);
        this.zzd = zzfb0;
        byte[] arr_b = zzfb0.zzI();
        this.zze = new zzfa(arr_b, arr_b.length);
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzdy.zzb(this.zzf);
        int v = zzabc0.zza(this.zzc.zzI(), 0, 0x800);
        if(!this.zzj) {
            this.zzf.zzN(new zzabz(0x8000000000000001L, 0L));
            this.zzj = true;
        }
        if(v == -1) {
            return -1;
        }
        this.zzc.zzG(0);
        this.zzc.zzF(v);
        if(!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzf = zzabe0;
        zzaka zzaka0 = new zzaka(0x80000000, 0, 1);
        this.zzb.zzb(zzabe0, zzaka0);
        zzabe0.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        int v = 0;
        while(true) {
            ((zzaar)zzabc0).zzm(this.zzd.zzI(), 0, 10, false);
            this.zzd.zzG(0);
            if(this.zzd.zzn() != 4801587) {
                break;
            }
            this.zzd.zzH(3);
            int v1 = this.zzd.zzk();
            v += v1 + 10;
            ((zzaar)zzabc0).zzl(v1, false);
        }
        zzabc0.zzj();
        ((zzaar)zzabc0).zzl(v, false);
        if(this.zzh == -1L) {
            this.zzh = (long)v;
        }
        int v2 = 0;
        int v3 = 0;
        int v4 = v;
        do {
            ((zzaar)zzabc0).zzm(this.zzd.zzI(), 0, 2, false);
            this.zzd.zzG(0);
            if(zzaik.zzf(this.zzd.zzp())) {
                ++v2;
                if(v2 >= 4 && v3 > 0xBC) {
                    return true;
                }
                ((zzaar)zzabc0).zzm(this.zzd.zzI(), 0, 4, false);
                this.zze.zzj(14);
                int v5 = this.zze.zzd(13);
                if(v5 <= 6) {
                    ++v4;
                    zzabc0.zzj();
                    ((zzaar)zzabc0).zzl(v4, false);
                    v2 = 0;
                    v3 = 0;
                }
                else {
                    ((zzaar)zzabc0).zzl(v5 - 6, false);
                    v3 += v5;
                }
            }
            else {
                ++v4;
                zzabc0.zzj();
                ((zzaar)zzabc0).zzl(v4, false);
                v2 = 0;
                v3 = 0;
            }
        }
        while(v4 - v < 0x2000);
        return false;
    }
}

