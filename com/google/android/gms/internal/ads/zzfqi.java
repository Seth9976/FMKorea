package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzfqi {
    private static final Map zza;
    private final Context zzb;
    private final zzfpx zzc;
    private final String zzd;
    private final List zze;
    private final Set zzf;
    private final Object zzg;
    private boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk;
    private final AtomicInteger zzl;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfpf zzo;

    static {
        zzfqi.zza = new HashMap();
    }

    public zzfqi(Context context0, zzfpx zzfpx0, String s, Intent intent0, zzfpf zzfpf0, zzfqd zzfqd0) {
        this.zze = new ArrayList();
        this.zzf = new HashSet();
        this.zzg = new Object();
        this.zzk = () -> {
            this.zzc.zzc("reportBinderDeath", new Object[0]);
            zzfqd zzfqd0 = (zzfqd)this.zzj.get();
            if(zzfqd0 == null) {
                this.zzc.zzc("%s : Binder has died.", new Object[]{this.zzd});
                for(Object object0: this.zze) {
                    ((zzfpy)object0).zzc(this.zzv());
                }
                this.zze.clear();
            }
            else {
                this.zzc.zzc("calling onBinderDied", new Object[0]);
                zzfqd0.zza();
            }
            synchronized(this.zzg) {
                this.zzw();
            }
        };
        this.zzl = new AtomicInteger(0);
        this.zzb = context0;
        this.zzc = zzfpx0;
        this.zzd = "OverlayDisplayService";
        this.zzi = intent0;
        this.zzo = zzfpf0;
        this.zzj = new WeakReference(null);
    }

    static Context zza(zzfqi zzfqi0) {
        return zzfqi0.zzb;
    }

    static ServiceConnection zzb(zzfqi zzfqi0) {
        return zzfqi0.zzm;
    }

    public final Handler zzc() {
        Map map0 = zzfqi.zza;
        synchronized(map0) {
            if(!map0.containsKey(this.zzd)) {
                HandlerThread handlerThread0 = new HandlerThread(this.zzd, 10);
                handlerThread0.start();
                Handler handler0 = new Handler(handlerThread0.getLooper());
                map0.put(this.zzd, handler0);
            }
        }
        return (Handler)map0.get(this.zzd);
    }

    static IInterface zzd(zzfqi zzfqi0) {
        return zzfqi0.zzn;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    static zzfpx zzf(zzfqi zzfqi0) {
        return zzfqi0.zzc;
    }

    static Object zzg(zzfqi zzfqi0) {
        return zzfqi0.zzg;
    }

    static List zzh(zzfqi zzfqi0) {
        return zzfqi0.zze;
    }

    static AtomicInteger zzi(zzfqi zzfqi0) {
        return zzfqi0.zzl;
    }

    // 检测为 Lambda 实现
    public static void zzj(zzfqi zzfqi0) [...]

    static void zzk(zzfqi zzfqi0, ServiceConnection serviceConnection0) {
        zzfqi0.zzm = null;
    }

    static void zzl(zzfqi zzfqi0, boolean z) {
        zzfqi0.zzh = false;
    }

    static void zzm(zzfqi zzfqi0, IInterface iInterface0) {
        zzfqi0.zzn = iInterface0;
    }

    static void zzn(zzfqi zzfqi0, TaskCompletionSource taskCompletionSource0) {
        zzfqi0.zzf.add(taskCompletionSource0);
        taskCompletionSource0.getTask().addOnCompleteListener((Task task0) -> synchronized(zzfqi0.zzg) {
            zzfqi0.zzf.remove(taskCompletionSource0);
        });
    }

    static void zzo(zzfqi zzfqi0) {
        zzfqi0.zzw();
    }

    static void zzp(zzfqi zzfqi0, zzfpy zzfpy0) {
        if(zzfqi0.zzn == null && !zzfqi0.zzh) {
            zzfqi0.zzc.zzc("Initiate binding to the service.", new Object[0]);
            zzfqi0.zze.add(zzfpy0);
            zzfqh zzfqh0 = new zzfqh(zzfqi0, null);
            zzfqi0.zzm = zzfqh0;
            zzfqi0.zzh = true;
            if(!zzfqi0.zzb.bindService(zzfqi0.zzi, zzfqh0, 1)) {
                zzfqi0.zzc.zzc("Failed to bind to the service.", new Object[0]);
                zzfqi0.zzh = false;
                for(Object object0: zzfqi0.zze) {
                    ((zzfpy)object0).zzc(new zzfqj());
                }
                zzfqi0.zze.clear();
            }
            return;
        }
        if(zzfqi0.zzh) {
            zzfqi0.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            zzfqi0.zze.add(zzfpy0);
            return;
        }
        zzfpy0.run();
    }

    static void zzq(zzfqi zzfqi0) {
        zzfqi0.zzc.zzc("linkToDeath", new Object[0]);
        try {
            zzfqi0.zzn.asBinder().linkToDeath(zzfqi0.zzk, 0);
        }
        catch(RemoteException remoteException0) {
            zzfqi0.zzc.zzb(remoteException0, "linkToDeath failed", new Object[0]);
        }
    }

    static void zzr(zzfqi zzfqi0) {
        zzfqi0.zzc.zzc("unlinkToDeath", new Object[0]);
        zzfqi0.zzn.asBinder().unlinkToDeath(zzfqi0.zzk, 0);
    }

    public final void zzs(zzfpy zzfpy0, TaskCompletionSource taskCompletionSource0) {
        zzfqb zzfqb0 = new zzfqb(this, zzfpy0.zzb(), taskCompletionSource0, zzfpy0);
        this.zzc().post(zzfqb0);
    }

    // 检测为 Lambda 实现
    final void zzt(TaskCompletionSource taskCompletionSource0, Task task0) [...]

    public final void zzu() {
        zzfqc zzfqc0 = new zzfqc(this);
        this.zzc().post(zzfqc0);
    }

    private final RemoteException zzv() {
        return new RemoteException(this.zzd + " : Binder has died.");
    }

    private final void zzw() {
        for(Object object0: this.zzf) {
            ((TaskCompletionSource)object0).trySetException(this.zzv());
        }
        this.zzf.clear();
    }
}

