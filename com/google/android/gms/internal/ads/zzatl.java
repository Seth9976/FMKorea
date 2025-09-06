package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class zzatl {
    protected static final String zza = "zzatl";
    private final zzary zzb;
    private final String zzc;
    private final String zzd;
    private volatile Method zze;
    private final Class[] zzf;
    private final CountDownLatch zzg;

    static {
    }

    public zzatl(zzary zzary0, String s, String s1, Class[] arr_class) {
        this.zze = null;
        this.zzg = new CountDownLatch(1);
        this.zzb = zzary0;
        this.zzc = s;
        this.zzd = s1;
        this.zzf = arr_class;
        zzary0.zzk().submit(new zzatk(this));
    }

    public final Method zza() {
        if(this.zze != null) {
            return this.zze;
        }
        try {
            return this.zzg.await(2L, TimeUnit.SECONDS) ? this.zze : null;
        }
        catch(InterruptedException unused_ex) {
            return null;
        }
    }

    static void zzb(zzatl zzatl0) {
        CountDownLatch countDownLatch0;
        try {
            Class class0 = zzatl0.zzb.zzi().loadClass(zzatl0.zzc(zzatl0.zzb.zzu(), zzatl0.zzc));
            if(class0 == null) {
                countDownLatch0 = zzatl0.zzg;
            }
            else {
                zzatl0.zze = class0.getMethod(zzatl0.zzc(zzatl0.zzb.zzu(), zzatl0.zzd), zzatl0.zzf);
                if(zzatl0.zze == null) {
                    countDownLatch0 = zzatl0.zzg;
                }
                else {
                    goto label_8;
                }
            }
        }
        catch(zzarc | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused_ex) {
        label_8:
            countDownLatch0 = zzatl0.zzg;
        }
        catch(NullPointerException unused_ex) {
            countDownLatch0 = zzatl0.zzg;
        }
        catch(Throwable throwable0) {
            zzatl0.zzg.countDown();
            throw throwable0;
        }
        countDownLatch0.countDown();
    }

    private final String zzc(byte[] arr_b, String s) {
        return new String(this.zzb.zze().zzb(arr_b, s), "UTF-8");
    }
}

