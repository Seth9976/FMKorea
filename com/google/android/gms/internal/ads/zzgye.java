package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzgye implements zzanc, Closeable, Iterator {
    private static final zzanb zza;
    private static final zzgyl zzb;
    protected zzamy zzc;
    protected zzgyf zzd;
    zzanb zze;
    long zzf;
    long zzg;
    private final List zzh;

    static {
        zzgye.zza = new zzgyd("eof ");
        zzgye.zzb = zzgyl.zzb(zzgye.class);
    }

    public zzgye() {
        this.zze = null;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzh = new ArrayList();
    }

    @Override
    public void close() {
    }

    @Override
    public final boolean hasNext() {
        zzanb zzanb0 = this.zze;
        if(zzanb0 == zzgye.zza) {
            return false;
        }
        if(zzanb0 != null) {
            return true;
        }
        try {
            this.zze = this.zzd();
            return true;
        }
        catch(NoSuchElementException unused_ex) {
            this.zze = zzgye.zza;
            return false;
        }
    }

    @Override
    public final Object next() {
        return this.zzd();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("[");
        for(int v = 0; v < this.zzh.size(); ++v) {
            if(v > 0) {
                stringBuilder0.append(";");
            }
            stringBuilder0.append(((zzanb)this.zzh.get(v)).toString());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final zzanb zzd() {
        zzanb zzanb0 = this.zze;
        if(zzanb0 != null && zzanb0 != zzgye.zza) {
            this.zze = null;
            return zzanb0;
        }
        zzgyf zzgyf0 = this.zzd;
        if(zzgyf0 != null && this.zzf < this.zzg) {
            try {
                synchronized(zzgyf0) {
                    this.zzd.zze(this.zzf);
                    zzanb zzanb1 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                    return zzanb1;
                }
            }
            catch(EOFException unused_ex) {
                throw new NoSuchElementException();
            }
            catch(IOException unused_ex) {
                throw new NoSuchElementException();
            }
        }
        this.zze = zzgye.zza;
        throw new NoSuchElementException();
    }

    public final List zze() {
        return this.zzd != null && this.zze != zzgye.zza ? new zzgyk(this.zzh, this) : this.zzh;
    }

    public final void zzf(zzgyf zzgyf0, long v, zzamy zzamy0) {
        this.zzd = zzgyf0;
        this.zzf = zzgyf0.zzb();
        zzgyf0.zze(zzgyf0.zzb() + v);
        this.zzg = zzgyf0.zzb();
        this.zzc = zzamy0;
    }
}

