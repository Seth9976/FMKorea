package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class zzaqs {
    protected static volatile zzfne zza;
    protected volatile Boolean zzb;
    private static final ConditionVariable zzc;
    private static volatile Random zzd;
    private final zzary zze;

    static {
        zzaqs.zzc = new ConditionVariable();
        zzaqs.zza = null;
        zzaqs.zzd = null;
    }

    public zzaqs(zzary zzary0) {
        this.zze = zzary0;
        zzary0.zzk().execute(new zzaqr(this));
    }

    static ConditionVariable zza() {
        return zzaqs.zzc;
    }

    static zzary zzb(zzaqs zzaqs0) {
        return zzaqs0.zze;
    }

    public final void zzc(int v, int v1, long v2, String s, Exception exception0) {
        try {
            zzaqs.zzc.block();
            if(this.zzb.booleanValue() && zzaqs.zza != null) {
                zzanh zzanh0 = zzanl.zza();
                zzanh0.zza("com.fmkorea.m.fmk");
                zzanh0.zze(v2);
                if(s != null) {
                    zzanh0.zzb(s);
                }
                if(exception0 != null) {
                    StringWriter stringWriter0 = new StringWriter();
                    exception0.printStackTrace(new PrintWriter(stringWriter0));
                    zzanh0.zzf(stringWriter0.toString());
                    zzanh0.zzd(exception0.getClass().getName());
                }
                zzfnd zzfnd0 = zzaqs.zza.zza(((zzanl)zzanh0.zzal()).zzax());
                zzfnd0.zza(v);
                if(v1 != -1) {
                    zzfnd0.zzb(v1);
                }
                zzfnd0.zzc();
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        }
        catch(RuntimeException unused_ex) {
            return zzaqs.zze().nextInt();
        }
    }

    private static Random zze() {
        if(zzaqs.zzd == null) {
            Class class0 = zzaqs.class;
            synchronized(class0) {
                if(zzaqs.zzd == null) {
                    zzaqs.zzd = new Random();
                }
            }
        }
        return zzaqs.zzd;
    }
}

