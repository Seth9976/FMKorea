package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgqi implements Serializable, Iterable {
    private static final Comparator zza;
    public static final zzgqi zzb;
    private int zzc;
    private static final zzgqh zzd;

    static {
        zzgqi.zzb = new zzgqe(zzgsa.zzd);
        zzgqi.zzd = new zzgqh(null);
        zzgqi.zza = new zzgpz();
    }

    zzgqi() {
        this.zzc = 0;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.zzc;
        if(v == 0) {
            int v1 = this.zzd();
            v = this.zzi(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.zzc = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return this.zzs();
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = Integer.toHexString(System.identityHashCode(this));
        Integer integer0 = this.zzd();
        return this.zzd() > 50 ? String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzgui.zza(this.zzk(0, 0x2F)) + "...") : String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzgui.zza(this));
    }

    public final byte[] zzA() {
        int v = this.zzd();
        if(v == 0) {
            return zzgsa.zzd;
        }
        byte[] arr_b = new byte[v];
        this.zze(arr_b, 0, 0, v);
        return arr_b;
    }

    public abstract byte zza(int arg1);

    abstract byte zzb(int arg1);

    private static zzgqi zzc(Iterator iterator0, int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", v));
        }
        if(v == 1) {
            return iterator0.next();
        }
        zzgqi zzgqi0 = zzgqi.zzc(iterator0, v >>> 1);
        zzgqi zzgqi1 = zzgqi.zzc(iterator0, v - (v >>> 1));
        if(0x7FFFFFFF - zzgqi0.zzd() < zzgqi1.zzd()) {
            throw new IllegalArgumentException("ByteString would be too long: " + zzgqi0.zzd() + "+" + zzgqi1.zzd());
        }
        return zzgts.zzC(zzgqi0, zzgqi1);
    }

    public abstract int zzd();

    protected abstract void zze(byte[] arg1, int arg2, int arg3, int arg4);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int arg1, int arg2, int arg3);

    protected abstract int zzj(int arg1, int arg2, int arg3);

    public abstract zzgqi zzk(int arg1, int arg2);

    public abstract zzgqq zzl();

    protected abstract String zzm(Charset arg1);

    public abstract ByteBuffer zzn();

    abstract void zzo(zzgpx arg1);

    public abstract boolean zzp();

    static int zzq(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    protected final int zzr() {
        return this.zzc;
    }

    public zzgqc zzs() {
        return new zzgpy(this);
    }

    public static zzgqf zzt() {
        return new zzgqf(0x80);
    }

    public static zzgqi zzu(Iterable iterable0) {
        int v;
        if(!(iterable0 instanceof Collection)) {
            v = 0;
            Iterator iterator0 = iterable0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
            }
            return v == 0 ? zzgqi.zzb : zzgqi.zzc(iterable0.iterator(), v);
        }
        v = ((Collection)iterable0).size();
        return v == 0 ? zzgqi.zzb : zzgqi.zzc(iterable0.iterator(), v);
    }

    public static zzgqi zzv(byte[] arr_b, int v, int v1) {
        zzgqi.zzq(v, v + v1, arr_b.length);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new zzgqe(arr_b1);
    }

    public static zzgqi zzw(String s) {
        return new zzgqe(s.getBytes(zzgsa.zzb));
    }

    public final String zzx(Charset charset0) {
        return this.zzd() == 0 ? "" : this.zzm(charset0);
    }

    static void zzy(int v, int v1) {
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException("Index > length: " + v + ", " + v1) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
    }

    @Deprecated
    public final void zzz(byte[] arr_b, int v, int v1, int v2) {
        zzgqi.zzq(0, v2, this.zzd());
        zzgqi.zzq(v1, v1 + v2, arr_b.length);
        if(v2 > 0) {
            this.zze(arr_b, 0, v1, v2);
        }
    }
}

