package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzgsp extends zzgps implements zzgry, zzgth, RandomAccess {
    private static final zzgsp zza;
    private long[] zzb;
    private int zzc;

    static {
        zzgsp.zza = new zzgsp(new long[0], 0, false);
    }

    zzgsp() {
        this(new long[10], 0, true);
    }

    private zzgsp(long[] arr_v, int v, boolean z) {
        super(z);
        this.zzb = arr_v;
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final void add(int v, Object object0) {
        long v1 = (long)(((Long)object0));
        this.zzbM();
        if(v >= 0) {
            int v2 = this.zzc;
            if(v <= v2) {
                long[] arr_v = this.zzb;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    long[] arr_v1 = new long[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.zzb, v, arr_v1, v + 1, this.zzc - v);
                    this.zzb = arr_v1;
                }
                this.zzb[v] = v1;
                ++this.zzc;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(this.zzh(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final boolean add(Object object0) {
        this.zzg(((long)(((Long)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final boolean addAll(Collection collection0) {
        this.zzbM();
        collection0.getClass();
        if(!(collection0 instanceof zzgsp)) {
            return super.addAll(collection0);
        }
        int v = ((zzgsp)collection0).zzc;
        if(v == 0) {
            return false;
        }
        int v1 = this.zzc;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        long[] arr_v = this.zzb;
        if(v2 > arr_v.length) {
            this.zzb = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((zzgsp)collection0).zzb, 0, this.zzb, this.zzc, ((zzgsp)collection0).zzc);
        this.zzc = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzgsp)) {
            return super.equals(object0);
        }
        if(this.zzc != ((zzgsp)object0).zzc) {
            return false;
        }
        long[] arr_v = ((zzgsp)object0).zzb;
        for(int v = 0; v < this.zzc; ++v) {
            if(this.zzb[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        this.zzi(v);
        return (long)this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final int hashCode() {
        int v1 = 1;
        for(int v = 0; v < this.zzc; ++v) {
            long v2 = this.zzb[v];
            v1 = v1 * 0x1F + ((int)(v2 ^ v2 >>> 0x20));
        }
        return v1;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Long)) {
            return -1;
        }
        long v = (long)(((Long)object0));
        int v1 = this.zzc;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.zzb[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final Object remove(int v) {
        this.zzbM();
        this.zzi(v);
        long[] arr_v = this.zzb;
        long v1 = arr_v[v];
        int v2 = this.zzc;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.zzc;
        ++this.modCount;
        return v1;
    }

    @Override
    protected final void removeRange(int v, int v1) {
        this.zzbM();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzb, v1, this.zzb, v, this.zzc - v1);
        this.zzc -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.ads.zzgps
    public final Object set(int v, Object object0) {
        this.zzbM();
        this.zzi(v);
        long[] arr_v = this.zzb;
        long v1 = arr_v[v];
        arr_v[v] = (long)(((Long)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzgry
    public final zzgry zza(int v) {
        if(v < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzgsp(Arrays.copyOf(this.zzb, v), this.zzc, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzgrz
    public final zzgrz zzd(int v) {
        return this.zza(v);
    }

    public final long zze(int v) {
        this.zzi(v);
        return this.zzb[v];
    }

    public static zzgsp zzf() {
        return zzgsp.zza;
    }

    public final void zzg(long v) {
        this.zzbM();
        int v1 = this.zzc;
        long[] arr_v = this.zzb;
        if(v1 == arr_v.length) {
            long[] arr_v1 = new long[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.zzb = arr_v1;
        }
        int v2 = this.zzc;
        this.zzc = v2 + 1;
        this.zzb[v2] = v;
    }

    private final String zzh(int v) {
        return "Index:" + v + ", Size:" + this.zzc;
    }

    private final void zzi(int v) {
        if(v < 0 || v >= this.zzc) {
            throw new IndexOutOfBoundsException(this.zzh(v));
        }
    }
}

