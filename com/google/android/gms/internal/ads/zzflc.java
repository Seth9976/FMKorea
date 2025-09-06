package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzflc {
    public static final int zza = 0;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;
    private static volatile int zzf = 1;

    static {
    }

    zzflc(Context context0, Executor executor0, Task task0, boolean z) {
        this.zzb = context0;
        this.zzc = executor0;
        this.zzd = task0;
        this.zze = z;
    }

    public static zzflc zza(Context context0, Executor executor0, boolean z) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        if(z) {
            executor0.execute(new zzfky(context0, taskCompletionSource0));
            return new zzflc(context0, executor0, taskCompletionSource0.getTask(), true);
        }
        executor0.execute(new zzfkz(taskCompletionSource0));
        return new zzflc(context0, executor0, taskCompletionSource0.getTask(), false);
    }

    public final Task zzb(int v, String s) {
        return this.zzh(v, 0L, null, null, null, s);
    }

    public final Task zzc(int v, long v1, Exception exception0) {
        return this.zzh(v, v1, exception0, null, null, null);
    }

    public final Task zzd(int v, long v1) {
        return this.zzh(v, v1, null, null, null, null);
    }

    public final Task zze(int v, long v1, String s) {
        return this.zzh(v, v1, null, null, null, s);
    }

    public final Task zzf(int v, long v1, String s, Map map0) {
        return this.zzh(v, v1, null, s, null, null);
    }

    static void zzg(int v) {
        zzflc.zzf = v;
    }

    private final Task zzh(int v, long v1, Exception exception0, String s, Map map0, String s1) {
        if(!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfla.zza);
        }
        zzanh zzanh0 = zzanl.zza();
        zzanh0.zza("com.fmkorea.m.fmk");
        zzanh0.zze(v1);
        zzanh0.zzg(zzflc.zzf);
        if(exception0 != null) {
            StringWriter stringWriter0 = new StringWriter();
            exception0.printStackTrace(new PrintWriter(stringWriter0));
            zzanh0.zzf(stringWriter0.toString());
            zzanh0.zzd(exception0.getClass().getName());
        }
        if(s1 != null) {
            zzanh0.zzb(s1);
        }
        if(s != null) {
            zzanh0.zzc(s);
        }
        zzflb zzflb0 = new zzflb(zzanh0, v);
        return this.zzd.continueWith(this.zzc, zzflb0);
    }
}

