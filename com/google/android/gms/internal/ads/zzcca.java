package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzcca {
    private static final AtomicInteger zza;
    private static final AtomicInteger zzb;

    static {
        zzcca.zza = new AtomicInteger(0);
        zzcca.zzb = new AtomicInteger(0);
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract Integer zzC();

    protected static AtomicInteger zzD() {
        return zzcca.zza;
    }

    protected static AtomicInteger zzE() {
        return zzcca.zzb;
    }

    public abstract void zzF(Uri[] arg1, String arg2);

    public abstract void zzG(Uri[] arg1, String arg2, ByteBuffer arg3, boolean arg4);

    public abstract void zzH();

    public abstract void zzI(long arg1);

    public abstract void zzJ(int arg1);

    public abstract void zzK(int arg1);

    public abstract void zzL(zzcbz arg1);

    public abstract void zzM(int arg1);

    public abstract void zzN(int arg1);

    public abstract void zzO(boolean arg1);

    public abstract void zzP(Integer arg1);

    public abstract void zzQ(boolean arg1);

    public abstract void zzR(int arg1);

    public abstract void zzS(Surface arg1, boolean arg2);

    public abstract void zzT(float arg1, boolean arg2);

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public static int zzs() {
        return zzcca.zza.get();
    }

    public abstract int zzt();

    public static int zzu() {
        return zzcca.zzb.get();
    }

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}

