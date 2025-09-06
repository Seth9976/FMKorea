package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcd;
import com.google.android.gms.ads.internal.util.zzd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzc;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public abstract class zzchd implements zzcmp {
    private static zzchd zza;

    public abstract zzfyo zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    private static zzchd zzD(Context context0, zzbof zzbof0, int v, boolean z, int v1, zzcih zzcih0) {
        synchronized(zzchd.class) {
            zzchd zzchd0 = zzchd.zza;
            if(zzchd0 != null) {
                return zzchd0;
            }
            zzbbr.zza(context0);
            zzfcu zzfcu0 = zzfcu.zzd(context0);
            zzcag zzcag0 = zzfcu0.zzc(233012000, false, v1);
            zzfcu0.zzf(zzbof0);
            zzcjv zzcjv0 = new zzcjv(null);
            zzche zzche0 = new zzche();
            zzche0.zzd(zzcag0);
            zzche0.zzc(context0);
            zzcjv0.zzb(new zzchg(zzche0, null));
            zzcjv0.zzc(new zzcli(zzcih0));
            zzchd zzchd1 = zzcjv0.zza();
            zzt.zzo().zzs(context0, zzcag0);
            zzt.zzc().zzi(context0);
            zzt.zzp().zzj(context0);
            zzt.zzp().zzi(context0);
            zzd.zza(context0);
            zzt.zzb().zzd(context0);
            zzt.zzv().zzb(context0);
            zzchd1.zza().zzc();
            zzbyg.zzd(context0);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzgb)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzav)).booleanValue()) {
                new zzebw(context0, zzcag0, new zzaxe(new zzaxk(context0)), new zzeba(new zzeaw(context0), zzchd1.zzA()), "cac56e27-df9a-4244-be78-d330f6967529", zzchd1.zzy()).zzb(zzt.zzo().zzh().zzQ());
            }
            zzchd.zza = zzchd1;
            return zzchd1;
        }
    }

    public abstract zzcd zza();

    public static zzchd zzb(Context context0, zzbof zzbof0, int v) {
        return zzchd.zzD(context0, zzbof0, 233012000, false, v, new zzcih());
    }

    public abstract zzcls zzc();

    public abstract zzcpp zzd();

    public abstract zzcqy zze();

    public abstract zzcyx zzf();

    public abstract zzdfp zzg();

    public abstract zzdgl zzh();

    public abstract zzdnu zzi();

    public abstract zzdsp zzj();

    public abstract zzdue zzk();

    public abstract zzduy zzl();

    public abstract zzecs zzm();

    public abstract zzc zzn();

    public abstract zzg zzo();

    public abstract zzaa zzp();

    @Override  // com.google.android.gms.internal.ads.zzcmp
    public final zzeth zzq(zzbun zzbun0, int v) {
        return this.zzr(new zzevj(zzbun0, v));
    }

    protected abstract zzeth zzr(zzevj arg1);

    public abstract zzewe zzs();

    public abstract zzexs zzt();

    public abstract zzezj zzu();

    public abstract zzfax zzv();

    public abstract zzfcn zzw();

    public abstract zzfcx zzx();

    public abstract zzfgo zzy();

    public abstract zzfhu zzz();
}

