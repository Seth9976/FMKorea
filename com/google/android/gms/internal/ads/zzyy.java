package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class zzyy {
    private final zzzk zza;
    private final zzyz zzb;
    private final ArrayDeque zzc;
    private final ArrayDeque zzd;
    private final zzdj zze;
    private Handler zzf;
    private zzdl zzg;
    private CopyOnWriteArrayList zzh;
    private zzdz zzi;
    private Pair zzj;
    private boolean zzk;
    private final zzdn zzl;

    public zzyy(zzdj zzdj0, zzzk zzzk0, zzyz zzyz0) {
        this.zze = zzdj0;
        this.zza = zzzk0;
        this.zzb = zzyz0;
        this.zzc = new ArrayDeque();
        this.zzd = new ArrayDeque();
        this.zzk = true;
        this.zzl = zzdn.zza;
    }

    public final void zza(String s) {
        Context context0 = zzyz.zzah(this.zzb);
        if(zzfk.zza >= 29) {
            context0.getApplicationContext().getApplicationInfo();
        }
    }

    public final void zzb(Surface surface0, zzfc zzfc0) {
        if(this.zzj != null && ((Surface)this.zzj.first).equals(surface0) && ((zzfc)this.zzj.second).equals(zzfc0)) {
            return;
        }
        this.zzj = Pair.create(surface0, zzfc0);
    }

    public final void zzc(List list0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.zzh;
        if(copyOnWriteArrayList0 == null) {
            this.zzh = new CopyOnWriteArrayList(list0);
            return;
        }
        copyOnWriteArrayList0.clear();
        this.zzh.addAll(list0);
    }

    public final boolean zzd(zzam zzam0, long v, zzdz zzdz0) {
        Pair pair0;
        if(!this.zzk) {
            return false;
        }
        if(this.zzh == null) {
            this.zzk = false;
            return false;
        }
        this.zzf = zzfk.zzu(null);
        this.zzi = zzdz0;
        zzs zzs0 = zzam0.zzy;
        if(zzs0 == null) {
            pair0 = Pair.create(zzs.zza, zzs.zza);
        }
        else {
            switch(zzs0.zzf) {
                case 6: {
                    pair0 = Pair.create(zzs0, zzs0);
                    break;
                }
                case 7: {
                    zzr zzr0 = zzs0.zzc();
                    zzr0.zzc(6);
                    pair0 = Pair.create(zzs0, zzr0.zzd());
                    break;
                }
                default: {
                    pair0 = Pair.create(zzs.zza, zzs.zza);
                }
            }
        }
        try {
            if(!zzyz.zzaM()) {
                int v1 = zzam0.zzu;
                if(v1 != 0) {
                    this.zzh.add(0, zzyx.zza(v1));
                }
            }
            zzs zzs1 = (zzs)pair0.first;
            zzs zzs2 = (zzs)pair0.second;
            Handler handler0 = this.zzf;
            handler0.getClass();
            zzyv zzyv0 = new zzyv(handler0);
            zzyw zzyw0 = new zzyw(this, zzam0);
            this.zzg = this.zze.zza(zzyz.zzah(this.zzb), zzv.zzb, zzs1, zzs2, false, zzyv0, zzyw0);
            throw null;
        }
        catch(Exception exception0) {
        }
        throw zzyz.zzaF(this.zzb, exception0, zzam0, 7000);
    }
}

