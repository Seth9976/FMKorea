package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

final class zzgts extends zzgqi {
    static final int[] zza;
    private final int zzc;
    private final zzgqi zzd;
    private final zzgqi zze;
    private final int zzf;
    private final int zzg;

    static {
        zzgts.zza = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 0x90, 0xE9, 377, 610, 987, 0x63D, 0xA18, 0x1055, 6765, 10946, 0x452F, 0x6FF1, 0xB520, 75025, 0x1DA31, 0x2FF42, 0x4D973, 0x7D8B5, 832040, 0x148ADD, 0x213D05, 0x35C7E2, 0x5704E7, 0x8CCCC9, 0xE3D1B0, 0x1709E79, 0x2547029, 0x3C50EA2, 102334155, 165580141, 0xFF80C38, 0x19D699A5, 701408733, 1134903170, 0x6D73E55F, 0x7FFFFFFF};
    }

    private zzgts(zzgqi zzgqi0, zzgqi zzgqi1) {
        this.zzd = zzgqi0;
        this.zze = zzgqi1;
        int v = zzgqi0.zzd();
        this.zzf = v;
        this.zzc = v + zzgqi1.zzd();
        this.zzg = Math.max(zzgqi0.zzf(), zzgqi1.zzf()) + 1;
    }

    zzgts(zzgqi zzgqi0, zzgqi zzgqi1, zzgtr zzgtr0) {
        this(zzgqi0, zzgqi1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgqi)) {
            return false;
        }
        int v = ((zzgqi)object0).zzd();
        if(this.zzc != v) {
            return false;
        }
        if(this.zzc == 0) {
            return true;
        }
        int v1 = this.zzr();
        int v2 = ((zzgqi)object0).zzr();
        if(v1 != 0 && v2 != 0 && v1 != v2) {
            return false;
        }
        zzgtq zzgtq0 = new zzgtq(this, null);
        zzgqd zzgqd0 = zzgtq0.zza();
        zzgtq zzgtq1 = new zzgtq(((zzgqi)object0), null);
        zzgqd zzgqd1 = zzgtq1.zza();
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(true) {
            int v6 = zzgqd0.zzd() - v3;
            int v7 = zzgqd1.zzd() - v4;
            int v8 = Math.min(v6, v7);
            if(!(v3 == 0 ? zzgqd0.zzg(zzgqd1, v4, v8) : zzgqd1.zzg(zzgqd0, v3, v8))) {
                return false;
            }
            v5 += v8;
            int v9 = this.zzc;
            if(v5 >= v9) {
                if(v5 != v9) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if(v8 == v6) {
                zzgqd0 = zzgtq0.zza();
                v3 = 0;
            }
            else {
                v3 += v8;
            }
            if(v8 == v7) {
                zzgqd1 = zzgtq1.zza();
                v4 = 0;
            }
            else {
                v4 += v8;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final Iterator iterator() {
        return new zzgtm(this);
    }

    static zzgqi zzB(zzgts zzgts0) {
        return zzgts0.zze;
    }

    static zzgqi zzC(zzgqi zzgqi0, zzgqi zzgqi1) {
        if(zzgqi1.zzd() == 0) {
            return zzgqi0;
        }
        if(zzgqi0.zzd() == 0) {
            return zzgqi1;
        }
        int v = zzgqi0.zzd() + zzgqi1.zzd();
        if(v < 0x80) {
            return zzgts.zzD(zzgqi0, zzgqi1);
        }
        if(zzgqi0 instanceof zzgts) {
            if(((zzgts)zzgqi0).zze.zzd() + zzgqi1.zzd() < 0x80) {
                zzgqi zzgqi2 = zzgts.zzD(((zzgts)zzgqi0).zze, zzgqi1);
                return new zzgts(((zzgts)zzgqi0).zzd, zzgqi2);
            }
            if(((zzgts)zzgqi0).zzd.zzf() > ((zzgts)zzgqi0).zze.zzf()) {
                int v1 = zzgqi1.zzf();
                if(((zzgts)zzgqi0).zzg > v1) {
                    zzgts zzgts0 = new zzgts(((zzgts)zzgqi0).zze, zzgqi1);
                    return new zzgts(((zzgts)zzgqi0).zzd, zzgts0);
                }
            }
        }
        return v >= zzgts.zzc(Math.max(zzgqi0.zzf(), zzgqi1.zzf()) + 1) ? new zzgts(zzgqi0, zzgqi1) : zzgto.zza(new zzgto(null), zzgqi0, zzgqi1);
    }

    private static zzgqi zzD(zzgqi zzgqi0, zzgqi zzgqi1) {
        int v = zzgqi0.zzd();
        int v1 = zzgqi1.zzd();
        byte[] arr_b = new byte[v + v1];
        zzgqi0.zzz(arr_b, 0, 0, v);
        zzgqi1.zzz(arr_b, 0, v, v1);
        return new zzgqe(arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final byte zza(int v) {
        zzgqi.zzy(v, this.zzc);
        return this.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    final byte zzb(int v) {
        return v >= this.zzf ? this.zze.zzb(v - this.zzf) : this.zzd.zzb(v);
    }

    static int zzc(int v) {
        return v < 0x2F ? zzgts.zza[v] : 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final int zzd() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final void zze(byte[] arr_b, int v, int v1, int v2) {
        int v3 = this.zzf;
        if(v + v2 <= v3) {
            this.zzd.zze(arr_b, v, v1, v2);
            return;
        }
        if(v >= v3) {
            this.zze.zze(arr_b, v - v3, v1, v2);
            return;
        }
        int v4 = v3 - v;
        this.zzd.zze(arr_b, v, v1, v4);
        this.zze.zze(arr_b, 0, v1 + v4, v2 - v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final int zzf() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final boolean zzh() {
        int v = zzgts.zzc(this.zzg);
        return this.zzc >= v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final int zzi(int v, int v1, int v2) {
        int v3 = this.zzf;
        if(v1 + v2 <= v3) {
            return this.zzd.zzi(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.zze.zzi(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.zzd.zzi(v, v1, v4);
        return this.zze.zzi(v5, 0, v2 - v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final int zzj(int v, int v1, int v2) {
        int v3 = this.zzf;
        if(v1 + v2 <= v3) {
            return this.zzd.zzj(v, v1, v2);
        }
        if(v1 >= v3) {
            return this.zze.zzj(v, v1 - v3, v2);
        }
        int v4 = v3 - v1;
        int v5 = this.zzd.zzj(v, v1, v4);
        return this.zze.zzj(v5, 0, v2 - v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final zzgqi zzk(int v, int v1) {
        int v2 = zzgqi.zzq(v, v1, this.zzc);
        if(v2 == 0) {
            return zzgqi.zzb;
        }
        if(v2 == this.zzc) {
            return this;
        }
        int v3 = this.zzf;
        if(v1 <= v3) {
            return this.zzd.zzk(v, v1);
        }
        if(v >= v3) {
            return this.zze.zzk(v - v3, v1 - v3);
        }
        int v4 = this.zzd.zzd();
        return new zzgts(this.zzd.zzk(v, v4), this.zze.zzk(0, v1 - this.zzf));
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final zzgqq zzl() {
        ArrayList arrayList0 = new ArrayList();
        zzgtq zzgtq0 = new zzgtq(this, null);
        while(zzgtq0.hasNext()) {
            arrayList0.add(zzgtq0.zza().zzn());
        }
        int v = 0;
        int v1 = 0;
        for(Object object0: arrayList0) {
            ByteBuffer byteBuffer0 = (ByteBuffer)object0;
            v1 += byteBuffer0.remaining();
            if(byteBuffer0.hasArray()) {
                v |= 1;
            }
            else {
                v |= (byteBuffer0.isDirect() ? 2 : 4);
            }
        }
        return v == 2 ? new zzgqm(arrayList0, v1, true, null) : zzgqq.zzH(new zzgsd(arrayList0), 0x1000);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    protected final String zzm(Charset charset0) {
        return new String(this.zzA(), charset0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    final void zzo(zzgpx zzgpx0) {
        this.zzd.zzo(zzgpx0);
        this.zze.zzo(zzgpx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final boolean zzp() {
        int v = this.zzd.zzj(0, 0, this.zzf);
        int v1 = this.zze.zzd();
        return this.zze.zzj(v, 0, v1) == 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgqi
    public final zzgqc zzs() {
        return new zzgtm(this);
    }
}

