package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzerk implements zzesj {
    final String zza;
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final zzejt zzd;
    private final Context zze;
    private final zzfca zzf;
    private final zzejp zzg;
    private final zzdpc zzh;
    private final zzdtl zzi;

    zzerk(zzfyo zzfyo0, ScheduledExecutorService scheduledExecutorService0, String s, zzejt zzejt0, Context context0, zzfca zzfca0, zzejp zzejp0, zzdpc zzdpc0, zzdtl zzdtl0) {
        this.zzb = zzfyo0;
        this.zzc = scheduledExecutorService0;
        this.zza = s;
        this.zzd = zzejt0;
        this.zze = context0;
        this.zzf = zzfca0;
        this.zzg = zzejp0;
        this.zzh = zzdpc0;
        this.zzi = zzdtl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 0x20;
    }

    @Override  // com.google.android.gms.internal.ads.zzesj
    public final d zzb() {
        zzfca zzfca0 = this.zzf;
        if(zzfca0.zzq) {
            String s = zzf.zza(zzf.zzb(zzfca0.zzd));
            return Arrays.asList(((String)zzba.zzc().zzb(zzbbr.zzbC)).split(",")).contains(s) ? zzfye.zzk(() -> {
                String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzjO)).booleanValue() ? this.zzf.zzf.toLowerCase(Locale.ROOT) : this.zzf.zzf;
                Bundle bundle0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzbA)).booleanValue() ? this.zzi.zzg() : new Bundle();
                ArrayList arrayList0 = new ArrayList();
                if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbJ)).booleanValue()) {
                    for(Object object0: ((zzfug)this.zzd.zzb(this.zza, s)).zzh()) {
                        Object object1 = ((Map.Entry)object0).getKey();
                        arrayList0.add(this.zzg(((String)object1), ((List)((Map.Entry)object0).getValue()), this.zzf(((String)object1)), true, true));
                    }
                    this.zzi(arrayList0, this.zzd.zzc());
                    return zzfye.zzb(arrayList0).zza(new zzerj(arrayList0, bundle0), this.zzb);
                }
                this.zzi(arrayList0, this.zzd.zza(this.zza, s));
                return zzfye.zzb(arrayList0).zza(new zzerj(arrayList0, bundle0), this.zzb);
            }, this.zzb) : zzfye.zzh(new zzerl("[]", new Bundle()));
        }
        return zzfye.zzk(() -> {
            String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzjO)).booleanValue() ? this.zzf.zzf.toLowerCase(Locale.ROOT) : this.zzf.zzf;
            Bundle bundle0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzbA)).booleanValue() ? this.zzi.zzg() : new Bundle();
            ArrayList arrayList0 = new ArrayList();
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbJ)).booleanValue()) {
                for(Object object0: ((zzfug)this.zzd.zzb(this.zza, s)).zzh()) {
                    Object object1 = ((Map.Entry)object0).getKey();
                    arrayList0.add(this.zzg(((String)object1), ((List)((Map.Entry)object0).getValue()), this.zzf(((String)object1)), true, true));
                }
                this.zzi(arrayList0, this.zzd.zzc());
                return zzfye.zzb(arrayList0).zza(new zzerj(arrayList0, bundle0), this.zzb);
            }
            this.zzi(arrayList0, this.zzd.zza(this.zza, s));
            return zzfye.zzb(arrayList0).zza(new zzerj(arrayList0, bundle0), this.zzb);
        }, this.zzb);
    }

    // 检测为 Lambda 实现
    public static d zzc(zzerk zzerk0) [...]

    // 检测为 Lambda 实现
    final d zzd(String s, List list0, Bundle bundle0, boolean z, boolean z1) [...]

    // 检测为 Lambda 实现
    final void zze(zzbqc zzbqc0, Bundle bundle0, List list0, zzejw zzejw0, zzcas zzcas0) [...]

    private final Bundle zzf(String s) {
        Bundle bundle0 = this.zzf.zzd.zzm;
        return bundle0 == null ? null : bundle0.getBundle(s);
    }

    private final zzfxv zzg(String s, List list0, Bundle bundle0, boolean z, boolean z1) {
        zzfxv zzfxv0 = zzfxv.zzu(zzfye.zzk(() -> {
            zzbqc zzbqc0;
            d d0 = new zzcas();
            if(!z1 || ((Boolean)zzba.zzc().zzb(zzbbr.zzbB)).booleanValue()) {
                try {
                    zzbqc0 = this.zzh.zzb(s);
                }
                catch(RemoteException remoteException0) {
                    zzcaa.zzh("Couldn\'t create RTB adapter : ", remoteException0);
                    zzbqc0 = null;
                }
            }
            else {
                this.zzg.zzb(s);
                zzbqc0 = this.zzg.zza(s);
            }
            if(zzbqc0 == null) {
                if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbr)).booleanValue()) {
                    throw null;
                }
                zzejw.zzb(s, ((zzcas)d0));
                return d0;
            }
            zzejw zzejw0 = new zzejw(s, zzbqc0, ((zzcas)d0), zzt.zzB().elapsedRealtime());
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbw)).booleanValue()) {
                zzerf zzerf0 = new zzerf(zzejw0);
                long v = (long)(((Long)zzba.zzc().zzb(zzbbr.zzbp)));
                this.zzc.schedule(zzerf0, v, TimeUnit.MILLISECONDS);
            }
            if(z) {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzbD)).booleanValue()) {
                    zzerg zzerg0 = () -> try {
                        this.zzh(zzbqc0, bundle0, list0, zzejw0);
                    }
                    catch(RemoteException remoteException0) {
                        ((zzcas)d0).zzd(remoteException0);
                    };
                    this.zzb.zza(zzerg0);
                    return d0;
                }
                this.zzh(zzbqc0, bundle0, list0, zzejw0);
                return d0;
            }
            zzejw0.zzd();
            return d0;
        }, this.zzb));
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzbw)).booleanValue()) {
            zzfxv0 = (zzfxv)zzfye.zzo(zzfxv0, ((long)(((Long)zzba.zzc().zzb(zzbbr.zzbp)))), TimeUnit.MILLISECONDS, this.zzc);
        }
        zzeri zzeri0 = new zzeri(s);
        return (zzfxv)zzfye.zze(zzfxv0, Throwable.class, zzeri0, this.zzb);
    }

    private final void zzh(zzbqc zzbqc0, Bundle bundle0, List list0, zzejw zzejw0) {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zze);
        Object object0 = list0.get(0);
        zzbqc0.zzh(iObjectWrapper0, this.zza, bundle0, ((Bundle)object0), this.zzf.zze, zzejw0);
    }

    private final void zzi(List list0, Map map0) {
        for(Object object0: map0.entrySet()) {
            zzejx zzejx0 = (zzejx)((Map.Entry)object0).getValue();
            Bundle bundle0 = this.zzf(zzejx0.zza);
            List list1 = Collections.singletonList(zzejx0.zze);
            list0.add(this.zzg(zzejx0.zza, list1, bundle0, zzejx0.zzb, zzejx0.zzc));
        }
    }
}

