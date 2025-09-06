package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzajw implements zzabb {
    public static final zzabi zza;
    private final List zzb;
    private final zzfb zzc;
    private final SparseIntArray zzd;
    private final zzajz zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzajs zzi;
    private zzajr zzj;
    private zzabe zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    static {
        zzajw.zza = (Uri uri0, Map map0) -> new zzabb[]{new zzajw(0)};
    }

    public zzajw() {
        this(0);
    }

    public zzajw(int v) {
        this(1, new zzfi(0L), new zzail(0), 112800);
    }

    public zzajw(int v, zzfi zzfi0, zzajz zzajz0, int v1) {
        this.zze = zzajz0;
        this.zzb = Collections.singletonList(zzfi0);
        this.zzc = new zzfb(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        this.zzg = sparseBooleanArray0;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray0 = new SparseArray();
        this.zzf = sparseArray0;
        this.zzd = new SparseIntArray();
        this.zzi = new zzajs(112800);
        this.zzk = zzabe.zza;
        this.zzq = -1;
        sparseBooleanArray0.clear();
        sparseArray0.clear();
        SparseArray sparseArray1 = new SparseArray();
        int v2 = sparseArray1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = sparseArray1.keyAt(v3);
            zzakb zzakb0 = (zzakb)sparseArray1.valueAt(v3);
            this.zzf.put(v4, zzakb0);
        }
        zzajo zzajo0 = new zzajo(new zzaju(this));
        this.zzf.put(0, zzajo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final int zza(zzabc zzabc0, zzabx zzabx0) {
        zzfb zzfb1;
        long v = zzabc0.zzd();
        if(this.zzm) {
            if(v != -1L) {
                zzajs zzajs0 = this.zzi;
                if(!zzajs0.zzd()) {
                    return zzajs0.zza(zzabc0, zzabx0, this.zzq);
                }
            }
            if(!this.zzn) {
                this.zzn = true;
                zzajs zzajs1 = this.zzi;
                if(zzajs1.zzb() == 0x8000000000000001L) {
                    this.zzk.zzN(new zzabz(zzajs1.zzb(), 0L));
                }
                else {
                    zzajr zzajr0 = new zzajr(zzajs1.zzc(), zzajs1.zzb(), v, this.zzq, 112800);
                    this.zzj = zzajr0;
                    this.zzk.zzN(zzajr0.zzb());
                }
            }
            if(this.zzo) {
                this.zzo = false;
                this.zzc(0L, 0L);
                if(zzabc0.zzf() != 0L) {
                    zzabx0.zza = 0L;
                    return 1;
                }
            }
            zzajr zzajr1 = this.zzj;
            if(zzajr1 != null && zzajr1.zze()) {
                return zzajr1.zza(zzabc0, zzabx0);
            }
        }
        zzfb zzfb0 = this.zzc;
        byte[] arr_b = zzfb0.zzI();
        if(9400 - zzfb0.zzc() < 0xBC) {
            int v1 = zzfb0.zza();
            if(v1 > 0) {
                System.arraycopy(arr_b, zzfb0.zzc(), arr_b, 0, v1);
            }
            this.zzc.zzE(arr_b, v1);
        }
        while(true) {
            zzfb1 = this.zzc;
            if(zzfb1.zza() >= 0xBC) {
                break;
            }
            int v2 = zzfb1.zzd();
            int v3 = zzabc0.zza(arr_b, v2, 9400 - v2);
            if(v3 == -1) {
                for(int v4 = 0; v4 < this.zzf.size(); ++v4) {
                    zzakb zzakb0 = (zzakb)this.zzf.valueAt(v4);
                    if(zzakb0 instanceof zzajf) {
                        zzakb0.zza(new zzfb(), 1);
                    }
                }
                return -1;
            }
            this.zzc.zzF(v2 + v3);
        }
        int v5 = zzfb1.zzc();
        int v6 = zzfb1.zzd();
        int v7 = zzakc.zza(zzfb1.zzI(), v5, v6);
        this.zzc.zzG(v7);
        if(v7 + 0xBC > v6) {
            this.zzp += v7 - v5;
        }
        else {
            this.zzp = 0;
        }
        zzfb zzfb2 = this.zzc;
        int v8 = zzfb2.zzd();
        if(v7 + 0xBC > v8) {
            return 0;
        }
        int v9 = zzfb2.zzf();
        if((0x800000 & v9) != 0) {
            this.zzc.zzG(v7 + 0xBC);
            return 0;
        }
        int v10 = (0x400000 & v9) == 0 ? 0 : 1;
        int v11 = v9 >> 8 & 0x1FFF;
        zzakb zzakb1 = (v9 & 16) == 0 ? null : ((zzakb)this.zzf.get(v11));
        if(zzakb1 == null) {
            this.zzc.zzG(v7 + 0xBC);
            return 0;
        }
        int v12 = this.zzd.get(v11, (v9 & 15) - 1);
        this.zzd.put(v11, v9 & 15);
        if(v12 == (v9 & 15)) {
            this.zzc.zzG(v7 + 0xBC);
            return 0;
        }
        if((v9 & 15) != (v12 + 1 & 15)) {
            zzakb1.zzc();
        }
        if((v9 & 0x20) != 0) {
            int v13 = this.zzc.zzl();
            v10 |= ((this.zzc.zzl() & 0x40) == 0 ? 0 : 2);
            this.zzc.zzH(v13 - 1);
        }
        boolean z = this.zzm;
        if(!z && this.zzh.get(v11, false)) {
        label_85:
            if(this.zzm && v != -1L) {
                this.zzo = true;
            }
        }
        else {
            this.zzc.zzF(v7 + 0xBC);
            zzakb1.zza(this.zzc, v10);
            this.zzc.zzF(v8);
            if(!z) {
                goto label_85;
            }
        }
        this.zzc.zzG(v7 + 0xBC);
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzb(zzabe zzabe0) {
        this.zzk = zzabe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final void zzc(long v, long v1) {
        int v2 = this.zzb.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            zzfi zzfi0 = (zzfi)this.zzb.get(v3);
            if(zzfi0.zze() == 0x8000000000000001L) {
                zzfi0.zzf(v1);
            }
            else {
                long v4 = zzfi0.zzc();
                if(v4 != 0x8000000000000001L && v4 != 0L && v4 != v1) {
                    zzfi0.zzf(v1);
                }
            }
        }
        if(v1 != 0L) {
            zzajr zzajr0 = this.zzj;
            if(zzajr0 != null) {
                zzajr0.zzd(v1);
            }
        }
        this.zzc.zzD(0);
        this.zzd.clear();
        for(int v5 = 0; v5 < this.zzf.size(); ++v5) {
            ((zzakb)this.zzf.valueAt(v5)).zzc();
        }
        this.zzp = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzabb
    public final boolean zzd(zzabc zzabc0) {
        byte[] arr_b = this.zzc.zzI();
        ((zzaar)zzabc0).zzm(arr_b, 0, 940, false);
        int v = 0;
    label_3:
        while(v < 0xBC) {
            int v1 = 0;
            while(v1 < 5) {
                if(arr_b[v1 * 0xBC + v] == 71) {
                    ++v1;
                    continue;
                }
                ++v;
                continue label_3;
            }
            ((zzaar)zzabc0).zzo(v, false);
            return true;
        }
        return false;
    }

    static void zzn(zzajw zzajw0, boolean z) {
        zzajw0.zzm = true;
    }
}

