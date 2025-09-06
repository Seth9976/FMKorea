package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzhm implements Serializable, Iterable {
    public static final zzhm zza;
    private static final zzht zzb;
    private static final Comparator zzc;
    private int zzd;

    static {
        zzhm.zza = new zzhw(zziz.zzb);
        zzhm.zzb = new zzhz(null);
        zzhm.zzc = new zzho();
    }

    zzhm() {
        this.zzd = 0;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.zzd;
        if(v == 0) {
            int v1 = this.zzb();
            v = this.zzb(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.zzd = v;
        }
        return v;
    }

    @Override
    public Iterator iterator() {
        return new zzhp(this);
    }

    @Override
    public final String toString() {
        Locale locale0 = Locale.ROOT;
        String s = Integer.toHexString(System.identityHashCode(this));
        Integer integer0 = this.zzb();
        return this.zzb() > 50 ? String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzlw.zza(this.zza(0, 0x2F)) + "...") : String.format(locale0, "<ByteString@%s size=%d contents=\"%s\">", s, integer0, zzlw.zza(this));
    }

    static int zza(byte b) {
        return b & 0xFF;
    }

    static int zza(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    public static zzhm zza(String s) {
        return new zzhw(s.getBytes(zziz.zza));
    }

    static zzhm zza(byte[] arr_b) {
        return new zzhw(arr_b);
    }

    public static zzhm zza(byte[] arr_b, int v, int v1) {
        zzhm.zza(v, v + v1, arr_b.length);
        return new zzhw(zzhm.zzb.zza(arr_b, v, v1));
    }

    public abstract byte zza(int arg1);

    protected final int zza() {
        return this.zzd;
    }

    public abstract zzhm zza(int arg1, int arg2);

    protected abstract String zza(Charset arg1);

    abstract void zza(zzhn arg1);

    abstract byte zzb(int arg1);

    public abstract int zzb();

    protected abstract int zzb(int arg1, int arg2, int arg3);

    static zzhv zzc(int v) {
        return new zzhv(v, null);
    }

    public final String zzc() {
        return this.zzb() == 0 ? "" : this.zza(zziz.zza);
    }

    public abstract boolean zzd();
}

