package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzfna {
    private static final HashMap zza;
    private final Context zzb;
    private final zzfnb zzc;
    private final zzflc zzd;
    private final zzfkx zze;
    private zzfmp zzf;
    private final Object zzg;

    static {
        zzfna.zza = new HashMap();
    }

    public zzfna(Context context0, zzfnb zzfnb0, zzflc zzflc0, zzfkx zzfkx0) {
        this.zzg = new Object();
        this.zzb = context0;
        this.zzc = zzfnb0;
        this.zzd = zzflc0;
        this.zze = zzfkx0;
    }

    public final zzflf zza() {
        synchronized(this.zzg) {
        }
        return this.zzf;
    }

    public final zzfmq zzb() {
        synchronized(this.zzg) {
            zzfmp zzfmp0 = this.zzf;
            if(zzfmp0 != null) {
                return zzfmp0.zzf();
            }
        }
        return null;
    }

    public final boolean zzc(zzfmq zzfmq0) {
        Object object0;
        long v;
        try {
            v = System.currentTimeMillis();
            Class class0 = this.zzd(zzfmq0);
            try {
                Constructor constructor0 = class0.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
                byte[] arr_b = zzfmq0.zze();
                Bundle bundle0 = new Bundle();
                object0 = constructor0.newInstance(this.zzb, "msa-r", arr_b, null, bundle0, 2);
            }
            catch(Exception exception1) {
                throw new zzfmz(2004, exception1);
            }
            zzfmp zzfmp0 = new zzfmp(object0, zzfmq0, this.zzc, this.zzd);
            if(!zzfmp0.zzh()) {
                throw new zzfmz(4000, "init failed");
            }
            int v1 = zzfmp0.zze();
            if(v1 != 0) {
                throw new zzfmz(4001, "ci: " + v1);
            }
            synchronized(this.zzg) {
                zzfmp zzfmp1 = this.zzf;
                if(zzfmp1 != null) {
                    try {
                        zzfmp1.zzg();
                    }
                    catch(zzfmz zzfmz1) {
                        this.zzd.zzc(zzfmz1.zza(), -1L, zzfmz1);
                    }
                }
                this.zzf = zzfmp0;
            }
            this.zzd.zzd(3000, System.currentTimeMillis() - v);
            return true;
        }
        catch(zzfmz zzfmz0) {
            this.zzd.zzc(zzfmz0.zza(), System.currentTimeMillis() - v, zzfmz0);
            return false;
        }
        catch(Exception exception0) {
            this.zzd.zzc(4010, System.currentTimeMillis() - v, exception0);
            return false;
        }
    }

    private final Class zzd(zzfmq zzfmq0) {
        Class class1;
        synchronized(this) {
            HashMap hashMap0 = zzfna.zza;
            Class class0 = (Class)hashMap0.get("");
            if(class0 != null) {
                return class0;
            }
            try {
                if(!this.zze.zza(zzfmq0.zzc())) {
                    throw new zzfmz(2026, "VM did not pass signature verification");
                }
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new zzfmz(2026, generalSecurityException0);
            }
            try {
                File file0 = zzfmq0.zzb();
                if(!file0.exists()) {
                    file0.mkdirs();
                }
                class1 = new DexClassLoader(zzfmq0.zzc().getAbsolutePath(), file0.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
            }
            catch(ClassNotFoundException | SecurityException | IllegalArgumentException classNotFoundException0) {
                throw new zzfmz(2008, classNotFoundException0);
            }
            hashMap0.put("", class1);
            return class1;
        }
    }
}

