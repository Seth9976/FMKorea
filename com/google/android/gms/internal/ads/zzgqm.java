package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

final class zzgqm extends zzgqq {
    private final Iterable zze;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    zzgqm(Iterable iterable0, int v, boolean z, zzgql zzgql0) {
        super(null);
        this.zzj = 0x7FFFFFFF;
        this.zzh = v;
        this.zze = iterable0;
        this.zzf = iterable0.iterator();
        this.zzl = 0;
        if(v == 0) {
            this.zzg = zzgsa.zze;
            this.zzm = 0L;
            this.zzn = 0L;
            this.zzo = 0L;
            return;
        }
        this.zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final void zzA(int v) {
        this.zzj = v;
        this.zzM();
    }

    public final void zzB(int v) {
        if(v < 0 || ((long)v) > ((long)(this.zzh - this.zzl)) - this.zzm + this.zzn) {
            throw v >= 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        while(v > 0) {
            if(this.zzo - this.zzm == 0L) {
                this.zzK();
            }
            int v1 = Math.min(v, ((int)(this.zzo - this.zzm)));
            v -= v1;
            this.zzm += (long)v1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzC() {
        return ((long)this.zzl) + this.zzm - this.zzn == ((long)this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzD() {
        return this.zzr() != 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzE(int v) {
        switch(v & 7) {
            case 0: {
                for(int v1 = 0; v1 < 10; ++v1) {
                    if(this.zza() >= 0) {
                        return true;
                    }
                }
                throw zzgsc.zze();
            }
            case 1: {
                this.zzB(8);
                return true;
            }
            default: {
                if((v & 7) != 2) {
                    switch(v & 7) {
                        case 3: {
                            do {
                                int v2 = this.zzm();
                            }
                            while(v2 != 0 && this.zzE(v2));
                            this.zzz(v >>> 3 << 3 | 4);
                            return true;
                        }
                        case 4: {
                            return false;
                        }
                        default: {
                            if((v & 7) != 5) {
                                throw zzgsc.zza();
                            }
                            this.zzB(4);
                            return true;
                        }
                    }
                }
                this.zzB(this.zzj());
                return true;
            }
        }
    }

    private final int zzJ() {
        return (int)(((long)(this.zzh - this.zzl)) - this.zzm + this.zzn);
    }

    private final void zzK() {
        if(!this.zzf.hasNext()) {
            throw zzgsc.zzj();
        }
        this.zzN();
    }

    private final void zzL(byte[] arr_b, int v, int v1) {
        if(v1 <= this.zzJ()) {
            int v2 = v1;
            while(v2 > 0) {
                if(this.zzo - this.zzm == 0L) {
                    this.zzK();
                }
                int v3 = Math.min(v2, ((int)(this.zzo - this.zzm)));
                zzguu.zzo(this.zzm, arr_b, v1 - v2, v3);
                v2 -= v3;
                this.zzm += (long)v3;
            }
            return;
        }
        if(v1 > 0) {
            throw zzgsc.zzj();
        }
    }

    private final void zzM() {
        int v = this.zzh + this.zzi;
        this.zzh = v;
        int v1 = this.zzj;
        if(v > v1) {
            int v2 = v - v1;
            this.zzi = v2;
            this.zzh = v - v2;
            return;
        }
        this.zzi = 0;
    }

    private final void zzN() {
        Object object0 = this.zzf.next();
        this.zzg = (ByteBuffer)object0;
        this.zzl += (int)(this.zzm - this.zzn);
        long v = (long)((ByteBuffer)object0).position();
        this.zzm = v;
        this.zzn = v;
        this.zzo = (long)this.zzg.limit();
        long v1 = zzguu.zze(this.zzg);
        this.zzm += v1;
        this.zzn += v1;
        this.zzo += v1;
    }

    public final byte zza() {
        if(this.zzo - this.zzm == 0L) {
            this.zzK();
        }
        long v = this.zzm;
        this.zzm = v + 1L;
        return zzguu.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final double zzb() {
        return Double.longBitsToDouble(this.zzq());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final float zzc() {
        return Float.intBitsToFloat(this.zzi());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzd() {
        return (int)(((long)this.zzl) + this.zzm - this.zzn);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zze(int v) {
        if(v < 0) {
            throw zzgsc.zzf();
        }
        int v1 = v + this.zzd();
        int v2 = this.zzj;
        if(v1 > v2) {
            throw zzgsc.zzj();
        }
        this.zzj = v1;
        this.zzM();
        return v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzf() {
        return this.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzg() {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzh() {
        return this.zzj();
    }

    public final int zzi() {
        long v = this.zzm;
        if(this.zzo - v >= 4L) {
            this.zzm = v + 4L;
            return zzguu.zza(v) & 0xFF | (zzguu.zza(v + 1L) & 0xFF) << 8 | (zzguu.zza(v + 2L) & 0xFF) << 16 | (zzguu.zza(v + 3L) & 0xFF) << 24;
        }
        return this.zza() & 0xFF | (this.zza() & 0xFF) << 8 | (this.zza() & 0xFF) << 16 | (this.zza() & 0xFF) << 24;
    }

    public final int zzj() {
        int v4;
        long v = this.zzm;
        if(this.zzo != v) {
            int v1 = zzguu.zza(v);
            if(v1 >= 0) {
                ++this.zzm;
                return v1;
            }
            if(this.zzo - this.zzm >= 10L) {
                long v2 = v + 2L;
                int v3 = zzguu.zza(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = v3 ^ 0xFFFFFF80;
                    this.zzm = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = zzguu.zza(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = v6 ^ 0x3F80;
                    v2 = v5;
                    this.zzm = v2;
                    return v4;
                }
                long v7 = v + 4L;
                int v8 = v6 ^ zzguu.zza(v5) << 21;
                if(v8 < 0) {
                    v4 = 0xFFE03F80 ^ v8;
                    v2 = v7;
                    this.zzm = v2;
                    return v4;
                }
                v5 = v + 5L;
                int v9 = zzguu.zza(v7);
                int v10 = v8 ^ v9 << 28 ^ 0xFE03F80;
                if(v9 >= 0) {
                    v2 = v5;
                    this.zzm = v2;
                    return v10;
                }
                v7 = v + 6L;
                if(zzguu.zza(v5) >= 0) {
                    v2 = v7;
                    this.zzm = v2;
                    return v10;
                }
                v5 = v + 7L;
                if(zzguu.zza(v7) >= 0) {
                    v2 = v5;
                    this.zzm = v2;
                    return v10;
                }
                v7 = v + 8L;
                if(zzguu.zza(v5) >= 0) {
                    v2 = v7;
                    this.zzm = v2;
                    return v10;
                }
                v5 = v + 9L;
                if(zzguu.zza(v7) >= 0) {
                    v2 = v5;
                    this.zzm = v2;
                    return v10;
                }
                else if(zzguu.zza(v5) >= 0) {
                    v2 = v + 10L;
                    this.zzm = v2;
                    return v10;
                }
            }
        }
        return (int)this.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzk() {
        return this.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzl() {
        return zzgqq.zzF(this.zzj());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzm() {
        if(this.zzC()) {
            this.zzk = 0;
            return 0;
        }
        int v = this.zzj();
        this.zzk = v;
        if(v >>> 3 == 0) {
            throw zzgsc.zzc();
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zzn() {
        return this.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzo() {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzp() {
        return this.zzr();
    }

    public final long zzq() {
        long v = this.zzm;
        if(Long.compare(this.zzo - v, 8L) >= 0) {
            this.zzm = v + 8L;
            long v1 = ((long)zzguu.zza(v)) & 0xFFL;
            long v2 = (((long)zzguu.zza(v + 1L)) & 0xFFL) << 8;
            long v3 = (((long)zzguu.zza(v + 2L)) & 0xFFL) << 16;
            long v4 = (((long)zzguu.zza(v + 3L)) & 0xFFL) << 24;
            return (((long)zzguu.zza(v + 4L)) & 0xFFL) << 0x20 | (v1 | v2 | v3 | v4) | (((long)zzguu.zza(v + 5L)) & 0xFFL) << 40 | (((long)zzguu.zza(v + 6L)) & 0xFFL) << 0x30 | (((long)zzguu.zza(v + 7L)) & 0xFFL) << 56;
        }
        return ((long)this.zza()) & 0xFFL | (((long)this.zza()) & 0xFFL) << 8 | (((long)this.zza()) & 0xFFL) << 16 | (((long)this.zza()) & 0xFFL) << 24 | (((long)this.zza()) & 0xFFL) << 0x20 | (((long)this.zza()) & 0xFFL) << 40 | (((long)this.zza()) & 0xFFL) << 0x30 | (((long)this.zza()) & 0xFFL) << 56;
    }

    public final long zzr() {
        long v11;
        long v4;
        long v = this.zzm;
        if(this.zzo != v) {
            int v1 = zzguu.zza(v);
            if(v1 >= 0) {
                ++this.zzm;
                return (long)v1;
            }
            if(this.zzo - this.zzm >= 10L) {
                long v2 = v + 2L;
                int v3 = zzguu.zza(v + 1L) << 7 ^ v1;
                if(v3 < 0) {
                    v4 = (long)(v3 ^ 0xFFFFFF80);
                    this.zzm = v2;
                    return v4;
                }
                long v5 = v + 3L;
                int v6 = zzguu.zza(v2) << 14 ^ v3;
                if(v6 >= 0) {
                    v4 = (long)(v6 ^ 0x3F80);
                    v2 = v5;
                    this.zzm = v2;
                    return v4;
                }
                int v7 = v6 ^ zzguu.zza(v5) << 21;
                if(v7 < 0) {
                    v4 = (long)(0xFFE03F80 ^ v7);
                    v2 = v + 4L;
                    this.zzm = v2;
                    return v4;
                }
                v5 = v + 5L;
                long v8 = ((long)zzguu.zza(v + 4L)) << 28 ^ ((long)v7);
                if(v8 >= 0L) {
                    v4 = 0xFE03F80L ^ v8;
                    v2 = v5;
                    this.zzm = v2;
                    return v4;
                }
                long v9 = v + 6L;
                long v10 = v8 ^ ((long)zzguu.zza(v5)) << 35;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v4 = v11 ^ v10;
                    v2 = v9;
                    this.zzm = v2;
                    return v4;
                }
                long v12 = v + 7L;
                long v13 = v10 ^ ((long)zzguu.zza(v9)) << 42;
                if(v13 >= 0L) {
                    v4 = 0x3F80FE03F80L ^ v13;
                    v2 = v12;
                    this.zzm = v2;
                    return v4;
                }
                v9 = v + 8L;
                v10 = v13 ^ ((long)zzguu.zza(v12)) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v4 = v11 ^ v10;
                    v2 = v9;
                    this.zzm = v2;
                    return v4;
                }
                v12 = v + 9L;
                long v14 = v10 ^ ((long)zzguu.zza(v9)) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v2 = v12;
                    this.zzm = v2;
                    return v14;
                }
                else if(((long)zzguu.zza(v12)) >= 0L) {
                    v2 = v + 10L;
                    this.zzm = v2;
                    return v14;
                }
            }
        }
        return this.zzs();
    }

    final long zzs() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = this.zza();
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw zzgsc.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzt() {
        return this.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzu() {
        return zzgqq.zzG(this.zzr());
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final long zzv() {
        return this.zzr();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final zzgqi zzw() {
        int v = this.zzj();
        if(v > 0) {
            long v1 = this.zzm;
            if(((long)v) <= this.zzo - v1) {
                byte[] arr_b = new byte[v];
                zzguu.zzo(v1, arr_b, 0L, v);
                this.zzm += (long)v;
                return new zzgqe(arr_b);
            }
        }
        if(v > 0 && v <= this.zzJ()) {
            byte[] arr_b1 = new byte[v];
            this.zzL(arr_b1, 0, v);
            return new zzgqe(arr_b1);
        }
        if(v != 0) {
            throw v >= 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        return zzgqi.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final String zzx() {
        int v = this.zzj();
        if(v > 0) {
            long v1 = this.zzm;
            if(((long)v) <= this.zzo - v1) {
                byte[] arr_b = new byte[v];
                zzguu.zzo(v1, arr_b, 0L, v);
                this.zzm += (long)v;
                return new String(arr_b, zzgsa.zzb);
            }
        }
        if(v > 0 && v <= this.zzJ()) {
            byte[] arr_b1 = new byte[v];
            this.zzL(arr_b1, 0, v);
            return new String(arr_b1, zzgsa.zzb);
        }
        if(v != 0) {
            throw v >= 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final String zzy() {
        int v = this.zzj();
        if(v > 0) {
            long v1 = this.zzm;
            if(((long)v) <= this.zzo - v1) {
                String s = zzguz.zzg(this.zzg, ((int)(v1 - this.zzn)), v);
                this.zzm += (long)v;
                return s;
            }
        }
        if(v >= 0 && v <= this.zzJ()) {
            byte[] arr_b = new byte[v];
            this.zzL(arr_b, 0, v);
            return zzguz.zzh(arr_b, 0, v);
        }
        if(v != 0) {
            throw v > 0 ? zzgsc.zzj() : zzgsc.zzf();
        }
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final void zzz(int v) {
        if(this.zzk != v) {
            throw zzgsc.zzb();
        }
    }
}

