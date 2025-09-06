package com.google.android.gms.internal.ads;

import java.util.Collections;

final class zzade extends zzadj {
    private static final int[] zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;

    static {
        zzade.zzb = new int[]{5512, 11025, 22050, 44100};
    }

    public zzade(zzace zzace0) {
        super(zzace0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadj
    protected final boolean zza(zzfb zzfb0) {
        if(!this.zzc) {
            int v = zzfb0.zzl();
            this.zze = v >> 4;
            if(v >> 4 == 2) {
                int v1 = zzade.zzb[v >> 2 & 3];
                zzak zzak0 = new zzak();
                zzak0.zzS("audio/mpeg");
                zzak0.zzw(1);
                zzak0.zzT(v1);
                zzam zzam0 = zzak0.zzY();
                this.zza.zzk(zzam0);
                this.zzd = true;
            }
            else {
                switch(v >> 4) {
                    case 7: 
                    case 8: {
                        zzak zzak1 = new zzak();
                        zzak1.zzS((v >> 4 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw"));
                        zzak1.zzw(1);
                        zzak1.zzT(8000);
                        zzam zzam1 = zzak1.zzY();
                        this.zza.zzk(zzam1);
                        this.zzd = true;
                        break;
                    }
                    case 10: {
                        break;
                    }
                    default: {
                        throw new zzadi("Audio format not supported: " + (v >> 4));
                    }
                }
            }
            this.zzc = true;
            return true;
        }
        zzfb0.zzH(1);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzadj
    protected final boolean zzb(zzfb zzfb0, long v) {
        if(this.zze == 2) {
            int v1 = zzfb0.zza();
            this.zza.zzq(zzfb0, v1);
            this.zza.zzs(v, 1, v1, 0, null);
            return true;
        }
        int v2 = zzfb0.zzl();
        if(v2 == 0 && !this.zzd) {
            int v3 = zzfb0.zza();
            byte[] arr_b = new byte[v3];
            zzfb0.zzC(arr_b, 0, v3);
            zzzy zzzy0 = zzzz.zza(arr_b);
            zzak zzak0 = new zzak();
            zzak0.zzS("audio/mp4a-latm");
            zzak0.zzx(zzzy0.zzc);
            zzak0.zzw(zzzy0.zzb);
            zzak0.zzT(zzzy0.zza);
            zzak0.zzI(Collections.singletonList(arr_b));
            zzam zzam0 = zzak0.zzY();
            this.zza.zzk(zzam0);
            this.zzd = true;
            return false;
        }
        if(this.zze == 10 && v2 != 1) {
            return false;
        }
        int v4 = zzfb0.zza();
        this.zza.zzq(zzfb0, v4);
        this.zza.zzs(v, 1, v4, 0, null);
        return true;
    }
}

