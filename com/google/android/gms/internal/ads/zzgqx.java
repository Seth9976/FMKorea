package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgqx extends zzgpx {
    private static final Logger zza;
    private static final boolean zzb;
    zzgqy zze;
    public static final int zzf;

    static {
        zzgqx.zza = Logger.getLogger("com.google.android.gms.internal.ads.zzgqx");
        zzgqx.zzb = zzguu.zzA();
    }

    private zzgqx() {
    }

    zzgqx(zzgqw zzgqw0) {
    }

    public static int zzA(int v) [...] // 潜在的解密器

    public static int zzB(long v) {
        int v1;
        if(Long.compare(0xFFFFFFFFFFFFFF80L & v, 0L) == 0) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v >>>= 14;
            v1 += 2;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public static zzgqx zzC(byte[] arr_b, int v, int v1) {
        return new zzgqt(arr_b, 0, v1);
    }

    public final void zzD() {
        if(this.zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzE(String s, zzguy zzguy0) {
        zzgqx.zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzguy0);
        byte[] arr_b = s.getBytes(zzgsa.zzb);
        try {
            this.zzs(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgqu(indexOutOfBoundsException0);
        }
    }

    public abstract void zzI();

    public abstract void zzJ(byte arg1);

    public abstract void zzK(int arg1, boolean arg2);

    public abstract void zzL(int arg1, zzgqi arg2);

    @Override  // com.google.android.gms.internal.ads.zzgpx
    public abstract void zza(byte[] arg1, int arg2, int arg3);

    public abstract int zzb();

    public abstract void zzh(int arg1, int arg2);

    public abstract void zzi(int arg1);

    public abstract void zzj(int arg1, long arg2);

    public abstract void zzk(long arg1);

    public abstract void zzl(int arg1, int arg2);

    public abstract void zzm(int arg1);

    abstract void zzn(int arg1, zzgta arg2, zzgtt arg3);

    public abstract void zzo(int arg1, String arg2);

    public abstract void zzq(int arg1, int arg2);

    public abstract void zzr(int arg1, int arg2);

    public abstract void zzs(int arg1);

    public abstract void zzt(int arg1, long arg2);

    public abstract void zzu(long arg1);

    @Deprecated
    static int zzw(int v, zzgta zzgta0, zzgtt zzgtt0) {
        int v1 = zzgqx.zzA(v << 3);
        return v1 + v1 + ((zzgpr)zzgta0).zzat(zzgtt0);
    }

    public static int zzx(int v) {
        return v < 0 ? 10 : zzgqx.zzA(v);
    }

    static int zzy(zzgta zzgta0, zzgtt zzgtt0) {
        int v = ((zzgpr)zzgta0).zzat(zzgtt0);
        return zzgqx.zzA(v) + v;
    }

    public static int zzz(String s) {
        int v;
        try {
            v = zzguz.zze(s);
            return zzgqx.zzA(v) + v;
        }
        catch(zzguy unused_ex) {
            v = s.getBytes(zzgsa.zzb).length;
            return zzgqx.zzA(v) + v;
        }
    }
}

