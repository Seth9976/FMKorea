package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzgrq extends zzgpr {
    private static final Map zzb;
    protected zzgul zzc;
    private int zzd;

    static {
        zzgrq.zzb = new ConcurrentHashMap();
    }

    public zzgrq() {
        this.zzd = -1;
        this.zzc = zzgul.zzc();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return this.getClass() == object0.getClass() ? zzgti.zza().zzb(this.getClass()).zzj(this, ((zzgrq)object0)) : false;
    }

    @Override
    public final int hashCode() {
        if(!this.zzaY()) {
            int v = this.zza;
            if(v == 0) {
                v = this.zzay();
                this.zza = v;
            }
            return v;
        }
        return this.zzay();
    }

    @Override
    public final String toString() {
        return zzgtc.zza(this, super.toString());
    }

    private final int zza(zzgtt zzgtt0) {
        return zzgti.zza().zzb(this.getClass()).zza(this);
    }

    protected final zzgrm zzaA() {
        return (zzgrm)this.zzb(5, null, null);
    }

    public final zzgrm zzaB() {
        zzgrm zzgrm0 = (zzgrm)this.zzb(5, null, null);
        zzgrm0.zzaj(this);
        return zzgrm0;
    }

    static zzgrq zzaC(Class class0) {
        Map map0 = zzgrq.zzb;
        zzgrq zzgrq0 = (zzgrq)map0.get(class0);
        if(zzgrq0 == null) {
            try {
                Class.forName(class0.getName(), true, class0.getClassLoader());
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new IllegalStateException("Class initialization cannot fail.", classNotFoundException0);
            }
            zzgrq0 = (zzgrq)map0.get(class0);
        }
        if(zzgrq0 == null) {
            zzgrq0 = (zzgrq)((zzgrq)zzguu.zzg(class0)).zzb(6, null, null);
            if(zzgrq0 == null) {
                throw new IllegalStateException();
            }
            map0.put(class0, zzgrq0);
            return zzgrq0;
        }
        return zzgrq0;
    }

    final zzgrq zzaD() {
        return (zzgrq)this.zzb(4, null, null);
    }

    protected static zzgrq zzaE(zzgrq zzgrq0, zzgqi zzgqi0) {
        zzgqq zzgqq0 = zzgqi0.zzl();
        zzgrq zzgrq1 = zzgrq0.zzaD();
        try {
            zzgtt zzgtt0 = zzgti.zza().zzb(zzgrq1.getClass());
            zzgtt0.zzh(zzgrq1, zzgqr.zzq(zzgqq0), zzgrc.zza);
            zzgtt0.zzf(zzgrq1);
        }
        catch(zzgsc zzgsc0) {
            if(zzgsc0.zzl()) {
                zzgsc0 = new zzgsc(zzgsc0);
            }
            zzgsc0.zzh(zzgrq1);
            throw zzgsc0;
        }
        catch(zzguj zzguj0) {
            zzgsc zzgsc1 = zzguj0.zza();
            zzgsc1.zzh(zzgrq1);
            throw zzgsc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzgsc) {
                throw (zzgsc)iOException0.getCause();
            }
            zzgsc zzgsc2 = new zzgsc(iOException0);
            zzgsc2.zzh(zzgrq1);
            throw zzgsc2;
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof zzgsc) {
                throw (zzgsc)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            zzgqq0.zzz(0);
        }
        catch(zzgsc zzgsc3) {
            zzgsc3.zzh(zzgrq1);
            throw zzgsc3;
        }
        zzgrq.zzc(zzgrq1);
        zzgrq.zzc(zzgrq1);
        return zzgrq1;
    }

    protected static zzgrq zzaF(zzgrq zzgrq0, byte[] arr_b) {
        zzgrq zzgrq1 = zzgrq.zzd(zzgrq0, arr_b, 0, arr_b.length, zzgrc.zza);
        zzgrq.zzc(zzgrq1);
        return zzgrq1;
    }

    protected static zzgrq zzaG(zzgrq zzgrq0, zzgqi zzgqi0, zzgrc zzgrc0) {
        zzgqq zzgqq0 = zzgqi0.zzl();
        zzgrq zzgrq1 = zzgrq0.zzaD();
        try {
            zzgtt zzgtt0 = zzgti.zza().zzb(zzgrq1.getClass());
            zzgtt0.zzh(zzgrq1, zzgqr.zzq(zzgqq0), zzgrc0);
            zzgtt0.zzf(zzgrq1);
        }
        catch(zzgsc zzgsc0) {
            if(zzgsc0.zzl()) {
                zzgsc0 = new zzgsc(zzgsc0);
            }
            zzgsc0.zzh(zzgrq1);
            throw zzgsc0;
        }
        catch(zzguj zzguj0) {
            zzgsc zzgsc1 = zzguj0.zza();
            zzgsc1.zzh(zzgrq1);
            throw zzgsc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzgsc) {
                throw (zzgsc)iOException0.getCause();
            }
            zzgsc zzgsc2 = new zzgsc(iOException0);
            zzgsc2.zzh(zzgrq1);
            throw zzgsc2;
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof zzgsc) {
                throw (zzgsc)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        try {
            zzgqq0.zzz(0);
        }
        catch(zzgsc zzgsc3) {
            zzgsc3.zzh(zzgrq1);
            throw zzgsc3;
        }
        zzgrq.zzc(zzgrq1);
        return zzgrq1;
    }

    protected static zzgrq zzaH(zzgrq zzgrq0, InputStream inputStream0, zzgrc zzgrc0) {
        zzgqq zzgqq0 = zzgqq.zzH(inputStream0, 0x1000);
        zzgrq zzgrq1 = zzgrq0.zzaD();
        try {
            zzgtt zzgtt0 = zzgti.zza().zzb(zzgrq1.getClass());
            zzgtt0.zzh(zzgrq1, zzgqr.zzq(zzgqq0), zzgrc0);
            zzgtt0.zzf(zzgrq1);
        }
        catch(zzgsc zzgsc0) {
            if(zzgsc0.zzl()) {
                zzgsc0 = new zzgsc(zzgsc0);
            }
            zzgsc0.zzh(zzgrq1);
            throw zzgsc0;
        }
        catch(zzguj zzguj0) {
            zzgsc zzgsc1 = zzguj0.zza();
            zzgsc1.zzh(zzgrq1);
            throw zzgsc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzgsc) {
                throw (zzgsc)iOException0.getCause();
            }
            zzgsc zzgsc2 = new zzgsc(iOException0);
            zzgsc2.zzh(zzgrq1);
            throw zzgsc2;
        }
        catch(RuntimeException runtimeException0) {
            if(runtimeException0.getCause() instanceof zzgsc) {
                throw (zzgsc)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        zzgrq.zzc(zzgrq1);
        return zzgrq1;
    }

    protected static zzgrq zzaI(zzgrq zzgrq0, byte[] arr_b, zzgrc zzgrc0) {
        zzgrq zzgrq1 = zzgrq.zzd(zzgrq0, arr_b, 0, arr_b.length, zzgrc0);
        zzgrq.zzc(zzgrq1);
        return zzgrq1;
    }

    protected static zzgrv zzaJ() {
        return zzgrr.zzf();
    }

    protected static zzgrv zzaK(zzgrv zzgrv0) {
        int v = zzgrv0.size();
        return v == 0 ? zzgrv0.zzg(10) : zzgrv0.zzg(v + v);
    }

    protected static zzgry zzaL() {
        return zzgsp.zzf();
    }

    protected static zzgry zzaM(zzgry zzgry0) {
        int v = zzgry0.size();
        return v == 0 ? zzgry0.zza(10) : zzgry0.zza(v + v);
    }

    protected static zzgrz zzaN() {
        return zzgtj.zze();
    }

    protected static zzgrz zzaO(zzgrz zzgrz0) {
        int v = zzgrz0.size();
        return v == 0 ? zzgrz0.zzd(10) : zzgrz0.zzd(v + v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgta
    public final zzgsz zzaP() {
        return (zzgrm)this.zzb(5, null, null);
    }

    static Object zzaQ(Method method0, Object object0, Object[] arr_object) {
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

    protected static Object zzaR(zzgta zzgta0, String s, Object[] arr_object) {
        return new zzgtk(zzgta0, s, arr_object);
    }

    protected final void zzaS() {
        zzgti.zza().zzb(this.getClass()).zzf(this);
        this.zzaT();
    }

    final void zzaT() {
        this.zzd &= 0x7FFFFFFF;
    }

    protected static void zzaU(Class class0, zzgrq zzgrq0) {
        zzgrq0.zzaT();
        zzgrq.zzb.put(class0, zzgrq0);
    }

    // 去混淆评级： 低(25)
    final void zzaV(int v) {
        this.zzd |= 0x7FFFFFFF;
    }

    @Override  // com.google.android.gms.internal.ads.zzgta
    public final void zzaW(zzgqx zzgqx0) {
        zzgti.zza().zzb(this.getClass()).zzm(this, zzgqy.zza(zzgqx0));
    }

    public final boolean zzaX() {
        switch(((byte)(((Byte)this.zzb(1, null, null))))) {
            case 0: {
                return false;
            }
            case 1: {
                return true;
            }
            default: {
                boolean z = zzgti.zza().zzb(this.getClass()).zzk(this);
                this.zzb(2, (z ? this : null), null);
                return z;
            }
        }
    }

    final boolean zzaY() {
        return (this.zzd & 0x80000000) != 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgpr
    final int zzat(zzgtt zzgtt0) {
        if(this.zzaY()) {
            int v = zzgtt0.zza(this);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
            return v;
        }
        int v1 = this.zzd & 0x7FFFFFFF;
        if(v1 == 0x7FFFFFFF) {
            int v2 = zzgtt0.zza(this);
            if(v2 < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v2);
            }
            this.zzd = this.zzd & 0x80000000 | v2;
            return v2;
        }
        return v1;
    }

    final int zzay() {
        return zzgti.zza().zzb(this.getClass()).zzb(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgta
    public final int zzaz() {
        int v;
        if(this.zzaY()) {
            v = this.zza(null);
            if(v < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + v);
            }
        }
        else {
            v = this.zzd & 0x7FFFFFFF;
            if(v == 0x7FFFFFFF) {
                v = this.zza(null);
                if(v < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + v);
                }
                this.zzd = this.zzd & 0x80000000 | v;
                return v;
            }
        }
        return v;
    }

    protected abstract Object zzb(int arg1, Object arg2, Object arg3);

    @Override  // com.google.android.gms.internal.ads.zzgtb
    public final zzgta zzbf() {
        return (zzgrq)this.zzb(6, null, null);
    }

    private static zzgrq zzc(zzgrq zzgrq0) {
        if(zzgrq0 != null && !zzgrq0.zzaX()) {
            zzgsc zzgsc0 = new zzguj(zzgrq0).zza();
            zzgsc0.zzh(zzgrq0);
            throw zzgsc0;
        }
        return zzgrq0;
    }

    private static zzgrq zzd(zzgrq zzgrq0, byte[] arr_b, int v, int v1, zzgrc zzgrc0) {
        zzgrq zzgrq1 = zzgrq0.zzaD();
        try {
            zzgtt zzgtt0 = zzgti.zza().zzb(zzgrq1.getClass());
            zzgtt0.zzi(zzgrq1, arr_b, 0, v1, new zzgpu(zzgrc0));
            zzgtt0.zzf(zzgrq1);
            return zzgrq1;
        }
        catch(zzgsc zzgsc0) {
            if(zzgsc0.zzl()) {
                zzgsc0 = new zzgsc(zzgsc0);
            }
            zzgsc0.zzh(zzgrq1);
            throw zzgsc0;
        }
        catch(zzguj zzguj0) {
            zzgsc zzgsc1 = zzguj0.zza();
            zzgsc1.zzh(zzgrq1);
            throw zzgsc1;
        }
        catch(IOException iOException0) {
            if(iOException0.getCause() instanceof zzgsc) {
                throw (zzgsc)iOException0.getCause();
            }
            zzgsc zzgsc2 = new zzgsc(iOException0);
            zzgsc2.zzh(zzgrq1);
            throw zzgsc2;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            zzgsc zzgsc3 = zzgsc.zzj();
            zzgsc3.zzh(zzgrq1);
            throw zzgsc3;
        }
    }
}

