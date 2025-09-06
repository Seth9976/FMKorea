package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzja extends zzhg implements zzjd, zzkv, RandomAccess {
    private static final zzja zza;
    private int[] zzb;
    private int zzc;

    static {
        zzja.zza = new zzja(new int[0], 0, false);
    }

    zzja() {
        this(new int[10], 0, true);
    }

    private zzja(int[] arr_v, int v, boolean z) {
        super(z);
        this.zzb = arr_v;
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final void add(int v, Object object0) {
        int v1 = (int)(((Integer)object0));
        this.zza();
        if(v >= 0) {
            int v2 = this.zzc;
            if(v <= v2) {
                int[] arr_v = this.zzb;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[v2 * 3 / 2 + 1];
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
        throw new IndexOutOfBoundsException(this.zze(v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean add(Object object0) {
        this.zzd(((int)(((Integer)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean addAll(Collection collection0) {
        this.zza();
        zziz.zza(collection0);
        if(!(collection0 instanceof zzja)) {
            return super.addAll(collection0);
        }
        int v = ((zzja)collection0).zzc;
        if(v == 0) {
            return false;
        }
        int v1 = this.zzc;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        int[] arr_v = this.zzb;
        if(v2 > arr_v.length) {
            this.zzb = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((zzja)collection0).zzb, 0, this.zzb, this.zzc, ((zzja)collection0).zzc);
        this.zzc = v2;
        ++this.modCount;
        return true;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzja)) {
            return super.equals(object0);
        }
        if(this.zzc != ((zzja)object0).zzc) {
            return false;
        }
        int[] arr_v = ((zzja)object0).zzb;
        for(int v = 0; v < this.zzc; ++v) {
            if(this.zzb[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int v) {
        return this.zzb(v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.zzc; ++v1) {
            v = v * 0x1F + this.zzb[v1];
        }
        return v;
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Integer)) {
            return -1;
        }
        int v = (int)(((Integer)object0));
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.zzb[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final Object remove(int v) {
        this.zza();
        this.zzf(v);
        int[] arr_v = this.zzb;
        int v1 = arr_v[v];
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
        this.zza();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.zzb, v1, this.zzb, v, this.zzc - v1);
        this.zzc -= v1 - v;
        ++this.modCount;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhg
    public final Object set(int v, Object object0) {
        this.zza();
        this.zzf(v);
        int[] arr_v = this.zzb;
        int v1 = arr_v[v];
        arr_v[v] = (int)(((Integer)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjf
    public final zzjf zza(int v) {
        return this.zzc(v);
    }

    public final int zzb(int v) {
        this.zzf(v);
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzjd
    public final zzjd zzc(int v) {
        if(v < this.zzc) {
            throw new IllegalArgumentException();
        }
        return new zzja(Arrays.copyOf(this.zzb, v), this.zzc, true);
    }

    public static zzja zzd() {
        return zzja.zza;
    }

    public final void zzd(int v) {
        this.zza();
        int v1 = this.zzc;
        int[] arr_v = this.zzb;
        if(v1 == arr_v.length) {
            int[] arr_v1 = new int[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.zzb = arr_v1;
        }
        int v2 = this.zzc;
        this.zzc = v2 + 1;
        this.zzb[v2] = v;
    }

    private final String zze(int v) {
        return "Index:" + v + ", Size:" + this.zzc;
    }

    private final void zzf(int v) {
        if(v < 0 || v >= this.zzc) {
            throw new IndexOutOfBoundsException(this.zze(v));
        }
    }
}

