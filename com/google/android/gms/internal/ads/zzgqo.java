package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class zzgqo extends zzgqq {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    zzgqo(InputStream inputStream0, int v, zzgqn zzgqn0) {
        super(null);
        this.zzl = 0x7FFFFFFF;
        this.zze = inputStream0;
        this.zzf = new byte[0x1000];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final void zzA(int v) {
        this.zzl = v;
        this.zzK();
    }

    public final void zzB(int v) {
        int v11;
        long v8;
        int v1 = this.zzi;
        int v2 = this.zzg - v1;
        if(v <= v2 && v >= 0) {
            this.zzi = v1 + v;
            return;
        }
        if(v < 0) {
            throw zzgsc.zzf();
        }
        int v3 = this.zzk;
        int v4 = v3 + v1;
        int v5 = this.zzl;
        if(v4 + v <= v5) {
            this.zzk = v4;
            this.zzg = 0;
            this.zzi = 0;
            try {
                while(v2 < v) {
                    try {
                        long v7 = (long)(v - v2);
                        v8 = this.zze.skip(v7);
                        int v9 = Long.compare(v8, 0L);
                    }
                    catch(zzgsc zzgsc0) {
                        zzgsc0.zzk();
                        throw zzgsc0;
                    }
                    if(v9 < 0 || v8 > v7) {
                        throw new IllegalStateException(this.zze.getClass() + "#skip returned invalid result: " + v8 + "\nThe InputStream implementation is buggy.");
                    }
                    if(v9 == 0) {
                        break;
                    }
                    v2 += (int)v8;
                }
            }
            finally {
                this.zzk += v2;
                this.zzK();
            }
            if(v2 < v) {
                int v10 = this.zzg - this.zzi;
                this.zzi = this.zzg;
                this.zzL(1);
                while(true) {
                    v11 = v - v10;
                    int v12 = this.zzg;
                    if(v11 <= v12) {
                        break;
                    }
                    v10 += v12;
                    this.zzi = v12;
                    this.zzL(1);
                }
                this.zzi = v11;
            }
            return;
        }
        this.zzB(v5 - v3 - v1);
        throw zzgsc.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzC() {
        return this.zzi == this.zzg && !this.zzM(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzD() {
        return this.zzr() != 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final boolean zzE(int v) {
        int v1 = 0;
        switch(v & 7) {
            case 0: {
                if(this.zzg - this.zzi >= 10) {
                    while(v1 < 10) {
                        int v3 = this.zzi;
                        this.zzi = v3 + 1;
                        if(this.zzf[v3] >= 0) {
                            return true;
                        }
                        ++v1;
                    }
                    throw zzgsc.zze();
                }
                else {
                    while(true) {
                        if(v1 >= 10) {
                            throw zzgsc.zze();
                        }
                        if(this.zza() >= 0) {
                            break;
                        }
                        ++v1;
                    }
                }
                return true;
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

    private final List zzJ(int v) {
        List list0 = new ArrayList();
        while(v > 0) {
            int v1 = Math.min(v, 0x1000);
            byte[] arr_b = new byte[v1];
            for(int v2 = 0; v2 < v1; v2 += v3) {
                int v3 = this.zze.read(arr_b, v2, v1 - v2);
                if(v3 == -1) {
                    throw zzgsc.zzj();
                }
                this.zzk += v3;
            }
            v -= v1;
            list0.add(arr_b);
        }
        return list0;
    }

    private final void zzK() {
        int v = this.zzg + this.zzh;
        this.zzg = v;
        int v1 = this.zzk + v;
        int v2 = this.zzl;
        if(v1 > v2) {
            int v3 = v1 - v2;
            this.zzh = v3;
            this.zzg = v - v3;
            return;
        }
        this.zzh = 0;
    }

    private final void zzL(int v) {
        if(!this.zzM(v)) {
            throw v <= 0x7FFFFFFF - this.zzk - this.zzi ? zzgsc.zzj() : zzgsc.zzi();
        }
    }

    private final boolean zzM(int v) {
        int v4;
        int v1 = this.zzi;
        int v2 = this.zzg;
        if(v1 + v <= v2) {
            throw new IllegalStateException("refillBuffer() called when " + v + " bytes were already available in buffer");
        }
        int v3 = this.zzk;
        if(v > 0x7FFFFFFF - v3 - v1) {
            return false;
        }
        if(v3 + v1 + v > this.zzl) {
            return false;
        }
        if(v1 > 0) {
            if(v2 > v1) {
                System.arraycopy(this.zzf, v1, this.zzf, 0, v2 - v1);
            }
            v3 = this.zzk + v1;
            this.zzk = v3;
            v2 = this.zzg - v1;
            this.zzg = v2;
            this.zzi = 0;
        }
        try {
            v4 = this.zze.read(this.zzf, v2, Math.min(0x1000 - v2, 0x7FFFFFFF - v3 - v2));
        }
        catch(zzgsc zzgsc0) {
            zzgsc0.zzk();
            throw zzgsc0;
        }
        if(v4 == 0 || v4 < -1 || v4 > 0x1000) {
            throw new IllegalStateException(this.zze.getClass() + "#read(byte[]) returned invalid result: " + v4 + "\nThe InputStream implementation is buggy.");
        }
        if(v4 > 0) {
            this.zzg += v4;
            this.zzK();
            return this.zzg < v ? this.zzM(v) : true;
        }
        return false;
    }

    private final byte[] zzN(int v, boolean z) {
        byte[] arr_b = this.zzO(v);
        if(arr_b != null) {
            return arr_b;
        }
        int v1 = this.zzi;
        int v2 = this.zzg - v1;
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        List list0 = this.zzJ(v - v2);
        byte[] arr_b1 = new byte[v];
        System.arraycopy(this.zzf, v1, arr_b1, 0, v2);
        for(Object object0: list0) {
            System.arraycopy(((byte[])object0), 0, arr_b1, v2, ((byte[])object0).length);
            v2 += ((byte[])object0).length;
        }
        return arr_b1;
    }

    private final byte[] zzO(int v) {
        int v7;
        if(v == 0) {
            return zzgsa.zzd;
        }
        if(v < 0) {
            throw zzgsc.zzf();
        }
        int v1 = this.zzk;
        int v2 = this.zzi;
        int v3 = v1 + v2 + v;
        if(v3 - 0x7FFFFFFF > 0) {
            throw zzgsc.zzi();
        }
        int v4 = this.zzl;
        if(v3 <= v4) {
            int v5 = this.zzg - v2;
            int v6 = v - v5;
            if(v6 >= 0x1000) {
                try {
                    if(v6 > this.zze.available()) {
                        return null;
                    }
                }
                catch(zzgsc zzgsc0) {
                    zzgsc0.zzk();
                    throw zzgsc0;
                }
            }
            byte[] arr_b = new byte[v];
            System.arraycopy(this.zzf, this.zzi, arr_b, 0, v5);
            this.zzk += this.zzg;
            this.zzi = 0;
            this.zzg = 0;
            while(v5 < v) {
                try {
                    v7 = this.zze.read(arr_b, v5, v - v5);
                }
                catch(zzgsc zzgsc1) {
                    zzgsc1.zzk();
                    throw zzgsc1;
                }
                if(v7 == -1) {
                    throw zzgsc.zzj();
                }
                this.zzk += v7;
                v5 += v7;
            }
            return arr_b;
        }
        this.zzB(v4 - v1 - v2);
        throw zzgsc.zzj();
    }

    public final byte zza() {
        if(this.zzi == this.zzg) {
            this.zzL(1);
        }
        int v = this.zzi;
        this.zzi = v + 1;
        return this.zzf[v];
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
        return this.zzk + this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final int zze(int v) {
        if(v < 0) {
            throw zzgsc.zzf();
        }
        int v1 = this.zzl;
        int v2 = v + (this.zzk + this.zzi);
        if(v2 > v1) {
            throw zzgsc.zzj();
        }
        this.zzl = v2;
        this.zzK();
        return v1;
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
        int v = this.zzi;
        if(this.zzg - v < 4) {
            this.zzL(4);
            v = this.zzi;
        }
        this.zzi = v + 4;
        return (this.zzf[v + 3] & 0xFF) << 24 | ((this.zzf[v + 1] & 0xFF) << 8 | this.zzf[v] & 0xFF | (this.zzf[v + 2] & 0xFF) << 16);
    }

    public final int zzj() {
        int v5;
        int v = this.zzi;
        int v1 = this.zzg;
        if(v1 != v) {
            byte[] arr_b = this.zzf;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzi = v + 1;
                return v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = v4 ^ 0xFFFFFF80;
                    this.zzi = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = v7 ^ 0x3F80;
                    v3 = v6;
                    this.zzi = v3;
                    return v5;
                }
                int v8 = v + 4;
                int v9 = v7 ^ arr_b[v6] << 21;
                if(v9 < 0) {
                    v5 = 0xFFE03F80 ^ v9;
                    v3 = v8;
                    this.zzi = v3;
                    return v5;
                }
                v6 = v + 5;
                int v10 = arr_b[v8];
                int v11 = v9 ^ v10 << 28 ^ 0xFE03F80;
                if(v10 >= 0) {
                    v3 = v6;
                    this.zzi = v3;
                    return v11;
                }
                v8 = v + 6;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzi = v3;
                    return v11;
                }
                v6 = v + 7;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzi = v3;
                    return v11;
                }
                v8 = v + 8;
                if(arr_b[v6] >= 0) {
                    v3 = v8;
                    this.zzi = v3;
                    return v11;
                }
                v6 = v + 9;
                if(arr_b[v8] >= 0) {
                    v3 = v6;
                    this.zzi = v3;
                    return v11;
                }
                else if(arr_b[v6] >= 0) {
                    v3 = v + 10;
                    this.zzi = v3;
                    return v11;
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
            this.zzj = 0;
            return 0;
        }
        int v = this.zzj();
        this.zzj = v;
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
        int v = this.zzi;
        if(this.zzg - v < 8) {
            this.zzL(8);
            v = this.zzi;
        }
        this.zzi = v + 8;
        return (((long)this.zzf[v + 7]) & 0xFFL) << 56 | (((long)this.zzf[v]) & 0xFFL | (((long)this.zzf[v + 1]) & 0xFFL) << 8 | (((long)this.zzf[v + 2]) & 0xFFL) << 16 | (((long)this.zzf[v + 3]) & 0xFFL) << 24 | (((long)this.zzf[v + 4]) & 0xFFL) << 0x20 | (((long)this.zzf[v + 5]) & 0xFFL) << 40 | (((long)this.zzf[v + 6]) & 0xFFL) << 0x30);
    }

    public final long zzr() {
        long v11;
        long v5;
        int v = this.zzi;
        int v1 = this.zzg;
        if(v1 != v) {
            byte[] arr_b = this.zzf;
            int v2 = arr_b[v];
            if(v2 >= 0) {
                this.zzi = v + 1;
                return (long)v2;
            }
            if(v1 - (v + 1) >= 9) {
                int v3 = v + 2;
                int v4 = arr_b[v + 1] << 7 ^ v2;
                if(v4 < 0) {
                    v5 = (long)(v4 ^ 0xFFFFFF80);
                    this.zzi = v3;
                    return v5;
                }
                int v6 = v + 3;
                int v7 = arr_b[v3] << 14 ^ v4;
                if(v7 >= 0) {
                    v5 = (long)(v7 ^ 0x3F80);
                    v3 = v6;
                    this.zzi = v3;
                    return v5;
                }
                int v8 = v7 ^ arr_b[v6] << 21;
                if(v8 < 0) {
                    v3 = v + 4;
                    v5 = (long)(0xFFE03F80 ^ v8);
                    this.zzi = v3;
                    return v5;
                }
                v6 = v + 5;
                long v9 = ((long)arr_b[v + 4]) << 28 ^ ((long)v8);
                if(v9 >= 0L) {
                    v5 = v9 ^ 0xFE03F80L;
                    v3 = v6;
                    this.zzi = v3;
                    return v5;
                }
                v3 = v + 6;
                long v10 = ((long)arr_b[v6]) << 35 ^ v9;
                if(v10 < 0L) {
                    v11 = 0xFFFFFFF80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzi = v3;
                    return v5;
                }
                int v12 = v + 7;
                long v13 = v10 ^ ((long)arr_b[v3]) << 42;
                if(v13 >= 0L) {
                    v5 = v13 ^ 0x3F80FE03F80L;
                    v3 = v12;
                    this.zzi = v3;
                    return v5;
                }
                v3 = v + 8;
                v10 = v13 ^ ((long)arr_b[v12]) << 49;
                if(v10 < 0L) {
                    v11 = 0xFFFE03F80FE03F80L;
                    v5 = v10 ^ v11;
                    this.zzi = v3;
                    return v5;
                }
                v12 = v + 9;
                long v14 = v10 ^ ((long)arr_b[v3]) << 56 ^ 0xFE03F80FE03F80L;
                if(v14 >= 0L) {
                    v3 = v12;
                    this.zzi = v3;
                    return v14;
                }
                v3 = v + 10;
                if(((long)arr_b[v12]) >= 0L) {
                    this.zzi = v3;
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
        int v1 = this.zzi;
        if(v <= this.zzg - v1 && v > 0) {
            zzgqi zzgqi0 = zzgqi.zzv(this.zzf, v1, v);
            this.zzi += v;
            return zzgqi0;
        }
        if(v != 0) {
            byte[] arr_b = this.zzO(v);
            if(arr_b != null) {
                return zzgqi.zzv(arr_b, 0, arr_b.length);
            }
            int v2 = this.zzi;
            int v3 = this.zzg - v2;
            this.zzk += this.zzg;
            this.zzi = 0;
            this.zzg = 0;
            List list0 = this.zzJ(v - v3);
            byte[] arr_b1 = new byte[v];
            System.arraycopy(this.zzf, v2, arr_b1, 0, v3);
            for(Object object0: list0) {
                System.arraycopy(((byte[])object0), 0, arr_b1, v3, ((byte[])object0).length);
                v3 += ((byte[])object0).length;
            }
            return new zzgqe(arr_b1);
        }
        return zzgqi.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final String zzx() {
        int v = this.zzj();
        if(v > 0) {
            int v1 = this.zzi;
            if(v <= this.zzg - v1) {
                String s = new String(this.zzf, v1, v, zzgsa.zzb);
                this.zzi += v;
                return s;
            }
        }
        if(v == 0) {
            return "";
        }
        if(v <= this.zzg) {
            this.zzL(v);
            String s1 = new String(this.zzf, this.zzi, v, zzgsa.zzb);
            this.zzi += v;
            return s1;
        }
        return new String(this.zzN(v, false), zzgsa.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final String zzy() {
        int v = this.zzj();
        int v1 = this.zzi;
        int v2 = this.zzg;
        if(v <= v2 - v1 && v > 0) {
            this.zzi = v1 + v;
            return zzguz.zzh(this.zzf, v1, v);
        }
        if(v == 0) {
            return "";
        }
        if(v <= v2) {
            this.zzL(v);
            this.zzi = v;
            return zzguz.zzh(this.zzf, v1, v);
        }
        return zzguz.zzh(this.zzN(v, false), v1, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqq
    public final void zzz(int v) {
        if(this.zzj != v) {
            throw zzgsc.zzb();
        }
    }
}

