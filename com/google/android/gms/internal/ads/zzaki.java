package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.util.Map;

public final class zzaki implements zzabb {
    public static final zzabi zza;
    private zzabe zzb;
    private zzace zzc;
    private int zzd;
    private long zze;
    private zzakg zzf;
    private int zzg;
    private long zzh;

    static {
        zzaki.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzaki()};
    }

    public zzaki() {
        this.zzd = 0;
        this.zze = -1L;
        this.zzg = -1;
        this.zzh = -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        int v6;
        long v = -1L;
        zzdy.zzb(this.zzc);
        boolean z = true;
        switch(this.zzd) {
            case 0: {
                zzdy.zzf(zzabc0.zzf() == 0L);
                int v3 = this.zzg;
                if(v3 != -1) {
                    ((zzaar)zzabc0).zzo(v3, false);
                    this.zzd = 4;
                    return 0;
                }
                if(!zzakl.zzc(zzabc0)) {
                    throw zzcd.zza("Unsupported or unrecognized wav file type.", null);
                }
                ((zzaar)zzabc0).zzo(((int)(zzabc0.zze() - zzabc0.zzf())), false);
                this.zzd = 1;
                return 0;
            }
            case 1: {
                zzfb zzfb0 = new zzfb(8);
                zzakk zzakk0 = zzakk.zza(zzabc0, zzfb0);
                if(zzakk0.zza == 0x64733634) {
                    ((zzaar)zzabc0).zzl(8, false);
                    zzfb0.zzG(0);
                    ((zzaar)zzabc0).zzm(zzfb0.zzI(), 0, 8, false);
                    v = zzfb0.zzq();
                    ((zzaar)zzabc0).zzo(((int)zzakk0.zzb) + 8, false);
                }
                else {
                    zzabc0.zzj();
                }
                this.zze = v;
                this.zzd = 2;
                return 0;
            }
            case 2: {
                zzakj zzakj0 = zzakl.zzb(zzabc0);
                int v4 = zzakj0.zza;
                if(v4 == 17) {
                    this.zzf = new zzakf(this.zzb, this.zzc, zzakj0);
                }
                else {
                    switch(v4) {
                        case 6: {
                            this.zzf = new zzakh(this.zzb, this.zzc, zzakj0, "audio/g711-alaw", -1);
                            break;
                        }
                        case 7: {
                            this.zzf = new zzakh(this.zzb, this.zzc, zzakj0, "audio/g711-mlaw", -1);
                            break;
                        }
                        default: {
                            int v5 = zzakj0.zze;
                            switch(v4) {
                                case 1: {
                                    v6 = zzfk.zzk(v5);
                                    break;
                                }
                                case 3: {
                                    v6 = v5 == 0x20 ? 4 : 0;
                                    break;
                                }
                                default: {
                                    v6 = v4 == 0xFFFE ? zzfk.zzk(v5) : 0;
                                }
                            }
                            if(v6 == 0) {
                                throw zzcd.zzc(("Unsupported WAV format type: " + v4));
                            }
                            this.zzf = new zzakh(this.zzb, this.zzc, zzakj0, "audio/raw", v6);
                            break;
                        }
                    }
                }
                this.zzd = 3;
                return 0;
            }
            case 3: {
                Pair pair0 = zzakl.zza(zzabc0);
                this.zzg = ((Long)pair0.first).intValue();
                long v7 = (long)(((Long)pair0.second));
                long v8 = this.zze;
                if(v8 != -1L && v7 == 0xFFFFFFFFL) {
                    v7 = v8;
                }
                long v9 = ((long)this.zzg) + v7;
                this.zzh = v9;
                long v10 = zzabc0.zzd();
                if(v10 != -1L && v9 > v10) {
                    zzes.zzf("WavExtractor", "Data exceeds input length: " + v9 + ", " + v10);
                    this.zzh = v10;
                    v9 = v10;
                }
                zzakg zzakg1 = this.zzf;
                zzakg1.getClass();
                zzakg1.zza(this.zzg, v9);
                this.zzd = 4;
                return 0;
            }
            default: {
                if(this.zzh == -1L) {
                    z = false;
                }
                zzdy.zzf(z);
                long v1 = this.zzh;
                long v2 = zzabc0.zzf();
                zzakg zzakg0 = this.zzf;
                zzakg0.getClass();
                return zzakg0.zzc(zzabc0, v1 - v2) ? -1 : 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzb = zzabe0;
        this.zzc = zzabe0.zzv(0, 1);
        zzabe0.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        this.zzd = v == 0L ? 0 : 4;
        zzakg zzakg0 = this.zzf;
        if(zzakg0 != null) {
            zzakg0.zzb(v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        return zzakl.zzc(zzabc0);
    }
}

