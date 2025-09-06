package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zzfws.zzj extends zzfws.zza {
    static final Unsafe zza;
    static final long zzb;
    static final long zzc;
    static final long zzd;
    static final long zze;
    static final long zzf;

    static {
        Unsafe unsafe0;
        Class class0;
        try {
            class0 = zzfws.zzk.class;
            unsafe0 = Unsafe.getUnsafe();
        }
        catch(SecurityException unused_ex) {
            try {
                unsafe0 = (Unsafe)AccessController.doPrivileged(new PrivilegedExceptionAction() {
                    @Override
                    public final Object run() {
                        Class class0 = Unsafe.class;
                        Field[] arr_field = class0.getDeclaredFields();
                        for(int v = 0; v < arr_field.length; ++v) {
                            Field field0 = arr_field[v];
                            field0.setAccessible(true);
                            Object object0 = field0.get(null);
                            if(class0.isInstance(object0)) {
                                return (Unsafe)class0.cast(object0);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            catch(PrivilegedActionException privilegedActionException0) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException0.getCause());
            }
        }
        try {
            zzfws.zzj.zzc = unsafe0.objectFieldOffset(zzfws.class.getDeclaredField("waiters"));
            zzfws.zzj.zzb = unsafe0.objectFieldOffset(zzfws.class.getDeclaredField("listeners"));
            zzfws.zzj.zzd = unsafe0.objectFieldOffset(zzfws.class.getDeclaredField("value"));
            zzfws.zzj.zze = unsafe0.objectFieldOffset(class0.getDeclaredField("thread"));
            zzfws.zzj.zzf = unsafe0.objectFieldOffset(class0.getDeclaredField("next"));
            zzfws.zzj.zza = unsafe0;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0);
        }
    }

    private zzfws.zzj() {
        super(null);
    }

    zzfws.zzj(zzfww zzfww0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final zzfws.zzd zza(zzfws zzfws0, zzfws.zzd zzfws$zzd0) {
        zzfws.zzd zzfws$zzd1;
        do {
            zzfws$zzd1 = zzfws0.listeners;
            if(zzfws$zzd0 == zzfws$zzd1) {
                return zzfws$zzd1;
            }
        }
        while(!this.zze(zzfws0, zzfws$zzd1, zzfws$zzd0));
        return zzfws$zzd1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final zzfws.zzk zzb(zzfws zzfws0, zzfws.zzk zzfws$zzk0) {
        zzfws.zzk zzfws$zzk1;
        do {
            zzfws$zzk1 = zzfws0.waiters;
            if(zzfws$zzk0 == zzfws$zzk1) {
                return zzfws$zzk1;
            }
        }
        while(!this.zzg(zzfws0, zzfws$zzk1, zzfws$zzk0));
        return zzfws$zzk1;
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final void zzc(zzfws.zzk zzfws$zzk0, zzfws.zzk zzfws$zzk1) {
        zzfws.zzj.zza.putObject(zzfws$zzk0, zzfws.zzj.zzf, zzfws$zzk1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final void zzd(zzfws.zzk zzfws$zzk0, Thread thread0) {
        zzfws.zzj.zza.putObject(zzfws$zzk0, zzfws.zzj.zze, thread0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zze(zzfws zzfws0, zzfws.zzd zzfws$zzd0, zzfws.zzd zzfws$zzd1) {
        return zzfwv.zza(zzfws.zzj.zza, zzfws0, zzfws.zzj.zzb, zzfws$zzd0, zzfws$zzd1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zzf(zzfws zzfws0, Object object0, Object object1) {
        return zzfwv.zza(zzfws.zzj.zza, zzfws0, zzfws.zzj.zzd, object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfws$zza
    final boolean zzg(zzfws zzfws0, zzfws.zzk zzfws$zzk0, zzfws.zzk zzfws$zzk1) {
        return zzfwv.zza(zzfws.zzj.zza, zzfws0, zzfws.zzj.zzc, zzfws$zzk0, zzfws$zzk1);
    }
}

