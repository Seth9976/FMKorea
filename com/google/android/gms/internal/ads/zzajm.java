package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;

public final class zzajm implements zzabb {
    public static final zzabi zza;
    private final zzfi zzb;
    private final SparseArray zzc;
    private final zzfb zzd;
    private final zzajj zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private zzaji zzj;
    private zzabe zzk;
    private boolean zzl;

    static {
        zzajm.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzajm()};
    }

    public zzajm() {
        zzfi zzfi0 = new zzfi(0L);
        super();
        this.zzb = zzfi0;
        this.zzd = new zzfb(0x1000);
        this.zzc = new SparseArray();
        this.zze = new zzajj();
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzaie zzaie1;
        zzdy.zzb(this.zzk);
        long v = zzabc0.zzd();
        int v1 = Long.compare(v, -1L);
        if(v1 != 0) {
            zzajj zzajj0 = this.zze;
            if(!zzajj0.zze()) {
                return zzajj0.zza(zzabc0, zzabx0);
            }
        }
        if(!this.zzl) {
            this.zzl = true;
            zzajj zzajj1 = this.zze;
            if(zzajj1.zzb() == 0x8000000000000001L) {
                this.zzk.zzN(new zzabz(zzajj1.zzb(), 0L));
            }
            else {
                zzaji zzaji0 = new zzaji(zzajj1.zzd(), zzajj1.zzb(), v);
                this.zzj = zzaji0;
                this.zzk.zzN(zzaji0.zzb());
            }
        }
        zzaji zzaji1 = this.zzj;
        if(zzaji1 != null && zzaji1.zze()) {
            return zzaji1.zza(zzabc0, zzabx0);
        }
        zzabc0.zzj();
        long v2 = v1 == 0 ? -1L : v - zzabc0.zze();
        if(Long.compare(v2, -1L) != 0 && v2 < 4L) {
            return -1;
        }
        if(!zzabc0.zzm(this.zzd.zzI(), 0, 4, true)) {
            return -1;
        }
        this.zzd.zzG(0);
        int v3 = this.zzd.zzf();
        if(v3 == 441) {
            return -1;
        }
        switch(v3) {
            case 442: {
                ((zzaar)zzabc0).zzm(this.zzd.zzI(), 0, 10, false);
                this.zzd.zzG(9);
                ((zzaar)zzabc0).zzo((this.zzd.zzl() & 7) + 14, false);
                return 0;
            }
            case 443: {
                ((zzaar)zzabc0).zzm(this.zzd.zzI(), 0, 2, false);
                this.zzd.zzG(0);
                ((zzaar)zzabc0).zzo(this.zzd.zzp() + 6, false);
                return 0;
            }
            default: {
                if(v3 >> 8 != 1) {
                    ((zzaar)zzabc0).zzo(1, false);
                    return 0;
                }
                zzaie zzaie0 = null;
                zzajl zzajl0 = (zzajl)this.zzc.get(v3 & 0xFF);
                if(!this.zzf) {
                    if(zzajl0 == null) {
                        if((v3 & 0xFF) == 0xBD) {
                            zzaie1 = new zzaie(null);
                            this.zzg = true;
                            this.zzi = zzabc0.zzf();
                            zzaie0 = zzaie1;
                        }
                        else if((v3 & 0xE0) == 0xC0) {
                            zzaie1 = new zzajc(null);
                            this.zzg = true;
                            this.zzi = zzabc0.zzf();
                            zzaie0 = zzaie1;
                        }
                        else if((v3 & 0xF0) == 0xE0) {
                            zzaie1 = new zzaiq(null);
                            this.zzh = true;
                            this.zzi = zzabc0.zzf();
                            zzaie0 = zzaie1;
                        }
                        if(zzaie0 != null) {
                            zzaka zzaka0 = new zzaka(0x80000000, v3 & 0xFF, 0x100);
                            zzaie0.zzb(this.zzk, zzaka0);
                            zzajl0 = new zzajl(zzaie0, this.zzb);
                            this.zzc.put(v3 & 0xFF, zzajl0);
                        }
                    }
                    long v4 = !this.zzg || !this.zzh ? 0x100000L : this.zzi + 0x2000L;
                    if(zzabc0.zzf() > v4) {
                        this.zzf = true;
                        this.zzk.zzC();
                    }
                }
                ((zzaar)zzabc0).zzm(this.zzd.zzI(), 0, 2, false);
                this.zzd.zzG(0);
                int v5 = this.zzd.zzp();
                if(zzajl0 == null) {
                    ((zzaar)zzabc0).zzo(v5 + 6, false);
                    return 0;
                }
                this.zzd.zzD(v5 + 6);
                ((zzaar)zzabc0).zzn(this.zzd.zzI(), 0, v5 + 6, false);
                this.zzd.zzG(6);
                zzajl0.zza(this.zzd);
                this.zzd.zzF(this.zzd.zzb());
                return 0;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzk = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        zzfi zzfi0 = this.zzb;
        if(zzfi0.zze() == 0x8000000000000001L) {
            zzfi0.zzf(v1);
        }
        else {
            long v2 = zzfi0.zzc();
            if(v2 != 0x8000000000000001L && v2 != 0L && v2 != v1) {
                zzfi0.zzf(v1);
            }
        }
        zzaji zzaji0 = this.zzj;
        if(zzaji0 != null) {
            zzaji0.zzd(v1);
        }
        for(int v3 = 0; v3 < this.zzc.size(); ++v3) {
            ((zzajl)this.zzc.valueAt(v3)).zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        byte[] arr_b = new byte[14];
        ((zzaar)zzabc0).zzm(arr_b, 0, 14, false);
        if(((arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF) != 442) {
            return false;
        }
        if((arr_b[4] & 0xC4) != 68) {
            return false;
        }
        if((arr_b[6] & 4) != 4) {
            return false;
        }
        if((arr_b[8] & 4) != 4) {
            return false;
        }
        if((arr_b[9] & 1) != 1) {
            return false;
        }
        if((arr_b[12] & 3) != 3) {
            return false;
        }
        ((zzaar)zzabc0).zzl(arr_b[13] & 7, false);
        ((zzaar)zzabc0).zzm(arr_b, 0, 3, false);
        return ((arr_b[0] & 0xFF) << 16 | (arr_b[1] & 0xFF) << 8 | arr_b[2] & 0xFF) == 1;
    }
}

