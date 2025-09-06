package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzix extends zzhd {
    public static final class zza extends zzhh {
        private final zzix zza;

        public zza(zzix zzix0) {
            this.zza = zzix0;
        }
    }

    public static class zzb extends zzhf {
        protected zzix zza;
        private final zzix zzb;

        protected zzb(zzix zzix0) {
            this.zzb = zzix0;
            if(zzix0.zzcj()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = zzix0.zzbz();
        }

        @Override  // com.google.android.gms.internal.measurement.zzhf
        public Object clone() {
            zzb zzix$zzb0 = (zzb)this.zzb.zza(zze.zze, null, null);
            zzix$zzb0.zza = (zzix)this.zzac();
            return zzix$zzb0;
        }

        private static void zza(Object object0, Object object1) {
            zzkx.zza().zza(object0).zza(object0, object1);
        }

        @Override  // com.google.android.gms.internal.measurement.zzhf
        public final zzhf zza(zzib zzib0, zzik zzik0) {
            return (zzb)this.zzb(zzib0, zzik0);
        }

        @Override  // com.google.android.gms.internal.measurement.zzhf
        public final zzhf zza(byte[] arr_b, int v, int v1) {
            return this.zzb(arr_b, 0, v1, zzik.zza);
        }

        @Override  // com.google.android.gms.internal.measurement.zzhf
        public final zzhf zza(byte[] arr_b, int v, int v1, zzik zzik0) {
            return this.zzb(arr_b, 0, v1, zzik0);
        }

        public final zzb zza(zzix zzix0) {
            if(this.zzb.equals(zzix0)) {
                return this;
            }
            if(!this.zza.zzcj()) {
                this.zzae();
            }
            zzb.zza(this.zza, zzix0);
            return this;
        }

        public zzix zzaa() {
            if(!this.zza.zzcj()) {
                return this.zza;
            }
            this.zza.zzcg();
            return this.zza;
        }

        @Override  // com.google.android.gms.internal.measurement.zzkm
        public zzkj zzab() {
            return this.zzz();
        }

        @Override  // com.google.android.gms.internal.measurement.zzkm
        public zzkj zzac() {
            return this.zzaa();
        }

        protected final void zzad() {
            if(!this.zza.zzcj()) {
                this.zzae();
            }
        }

        protected void zzae() {
            zzix zzix0 = this.zzb.zzbz();
            zzb.zza(zzix0, this.zza);
            this.zza = zzix0;
        }

        private final zzb zzb(byte[] arr_b, int v, int v1, zzik zzik0) {
            if(!this.zza.zzcj()) {
                this.zzae();
            }
            try {
                zzkx.zza().zza(this.zza).zza(this.zza, arr_b, 0, v1, new zzhl(zzik0));
                return this;
            }
            catch(zzji zzji0) {
                throw zzji0;
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw zzji.zzh();
            }
            catch(IOException iOException0) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzhf
        public final zzkm zzb(zzib zzib0, zzik zzik0) {
            return this.zzc(zzib0, zzik0);
        }

        private final zzb zzc(zzib zzib0, zzik zzik0) {
            if(!this.zza.zzcj()) {
                this.zzae();
            }
            try {
                zzkx.zza().zza(this.zza).zza(this.zza, zzif.zza(zzib0), zzik0);
                return this;
            }
            catch(RuntimeException runtimeException0) {
                if(runtimeException0.getCause() instanceof IOException) {
                    throw (IOException)runtimeException0.getCause();
                }
                throw runtimeException0;
            }
        }

        @Override  // com.google.android.gms.internal.measurement.zzkl
        public final zzkj zzcf() {
            return this.zzb;
        }

        @Override  // com.google.android.gms.internal.measurement.zzkl
        public final boolean zzci() {
            return zzix.zza(this.zza, false);
        }

        @Override  // com.google.android.gms.internal.measurement.zzhf
        public final zzhf zzy() {
            return (zzb)this.clone();
        }

        public final zzix zzz() {
            zzix zzix0 = (zzix)this.zzac();
            if(!zzix0.zzci()) {
                throw new zzlx(zzix0);
            }
            return zzix0;
        }
    }

    static final class zzc implements zzis {
        @Override
        public final int compareTo(Object object0) {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final zzkm zza(zzkm zzkm0, zzkj zzkj0) {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final zzks zza(zzks zzks0, zzks zzks1) {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final zzmn zzb() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final zzmx zzc() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override  // com.google.android.gms.internal.measurement.zzis
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    public static abstract class zzd extends zzix implements zzkl {
        protected zziq zzc;

        public zzd() {
            this.zzc = zziq.zzb();
        }

        final zziq zza() {
            if(this.zzc.zzf()) {
                this.zzc = (zziq)this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static final class zze {
        public static final enum int zza = 1;
        public static final enum int zzb = 2;
        public static final enum int zzc = 3;
        public static final enum int zzd = 4;
        public static final enum int zze = 5;
        public static final enum int zzf = 6;
        public static final enum int zzg = 7;
        private static final int[] zzh;

        static {
            zze.zzh = new int[]{1, 2, 3, 4, 5, 6, 7};
        }

        public static int[] zza() {
            return (int[])zze.zzh.clone();
        }
    }

    public static final class zzf extends zzil {
    }

    protected zzlz zzb;
    private static Map zzc;
    private int zzd;

    static {
        zzix.zzc = new ConcurrentHashMap();
    }

    public zzix() {
        this.zzd = -1;
        this.zzb = zzlz.zzc();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? zzkx.zza().zza(this).zzb(this, ((zzix)object0)) : false;
    }

    @Override
    public int hashCode() {
        if(this.zzcj()) {
            return this.zza();
        }
        if(this.zza == 0) {
            this.zza = this.zza();
        }
        return this.zza;
    }

    @Override
    public String toString() {
        return zzko.zza(this, super.toString());
    }

    private final int zza() {
        return zzkx.zza().zza(this).zzb(this);
    }

    static zzix zza(Class class0) {
        zzix zzix0 = (zzix)zzix.zzc.get(class0);
        if(zzix0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzix0 = (zzix)zzix.zzc.get(class0);
        }
        if(zzix0 == null) {
            zzix0 = (zzix)((zzix)zzmg.zza(class0)).zza(zze.zzf, null, null);
            if(zzix0 == null) {
                throw new IllegalStateException();
            }
            zzix.zzc.put(class0, zzix0);
            return zzix0;
        }
        return zzix0;
    }

    protected static zzjf zza(zzjf zzjf0) {
        int v = zzjf0.size();
        return v == 0 ? zzjf0.zza(10) : zzjf0.zza(v << 1);
    }

    protected static zzjg zza(zzjg zzjg0) {
        int v = zzjg0.size();
        return v == 0 ? zzjg0.zzc(10) : zzjg0.zzc(v << 1);
    }

    protected static Object zza(zzkj zzkj0, String s, Object[] arr_object) {
        return new zzkz(zzkj0, s, arr_object);
    }

    static Object zza(Method method0, Object object0, Object[] arr_object) {
        try {
            return method0.invoke(object0, arr_object);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Couldn\'t use Java reflection to implement protocol message reflection.", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 instanceof Error) {
                throw (Error)throwable0;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable0);
        }
    }

    protected static void zza(Class class0, zzix zzix0) {
        zzix0.zzch();
        zzix.zzc.put(class0, zzix0);
    }

    protected static final boolean zza(zzix zzix0, boolean z) {
        int v = (byte)(((Byte)zzix0.zza(zze.zza, null, null)));
        if(v == 1) {
            return true;
        }
        if(v == 0) {
            return false;
        }
        boolean z1 = zzkx.zza().zza(zzix0).zzd(zzix0);
        if(z) {
            zzix0.zza(2, (z1 ? zzix0 : null), null);
        }
        return z1;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhd
    final int zza(zzlb zzlb0) {
        if(this.zzcj()) {
            int v = this.zzb(zzlb0);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        if(this.zzbt() != 0x7FFFFFFF) {
            return this.zzbt();
        }
        int v1 = this.zzb(zzlb0);
        this.zzc(v1);
        return v1;
    }

    protected abstract Object zza(int arg1, Object arg2, Object arg3);

    @Override  // com.google.android.gms.internal.measurement.zzkj
    public final void zza(zzig zzig0) {
        zzkx.zza().zza(this).zza(this, zzij.zza(zzig0));
    }

    private final int zzb(zzlb zzlb0) {
        return zzlb0 == null ? zzkx.zza().zza(this).zza(this) : zzlb0.zza(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhd
    final int zzbt() {
        return this.zzd & 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkj
    public final int zzbw() {
        return this.zza(null);
    }

    protected final zzb zzbx() {
        return (zzb)this.zza(zze.zze, null, null);
    }

    public final zzb zzby() {
        return ((zzb)this.zza(zze.zze, null, null)).zza(this);
    }

    final zzix zzbz() {
        return (zzix)this.zza(zze.zzd, null, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzhd
    final void zzc(int v) {
        if(v < 0) {
            throw new IllegalStateException("serialized size must be non-negative, was " + v);
        }
        this.zzd = v & 0x7FFFFFFF | this.zzd & 0x80000000;
    }

    protected static zzjd zzca() {
        return zzja.zzd();
    }

    protected static zzjg zzcb() {
        return zzjy.zzd();
    }

    protected static zzjf zzcc() {
        return zzla.zzd();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkj
    public final zzkm zzcd() {
        return (zzb)this.zza(zze.zze, null, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkj
    public final zzkm zzce() {
        return ((zzb)this.zza(zze.zze, null, null)).zza(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkl
    public final zzkj zzcf() {
        return (zzix)this.zza(zze.zzf, null, null);
    }

    protected final void zzcg() {
        zzkx.zza().zza(this).zzc(this);
        this.zzch();
    }

    final void zzch() {
        this.zzd &= 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkl
    public final boolean zzci() {
        return zzix.zza(this, true);
    }

    final boolean zzcj() {
        return (this.zzd & 0x80000000) != 0;
    }
}

