package com.google.android.gms.internal.ads;

import Z1.d;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class zzbkn implements zzali {
    private volatile zzbka zza;
    private final Context zzb;

    public zzbkn(Context context0) {
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzali
    public final zzall zza(zzalp zzalp0) {
        ParcelFileDescriptor parcelFileDescriptor0;
        Map map0 = zzalp0.zzl();
        int v = map0.size();
        String[] arr_s = new String[v];
        String[] arr_s1 = new String[v];
        int v2 = 0;
        for(Object object0: map0.entrySet()) {
            arr_s[v2] = (String)((Map.Entry)object0).getKey();
            arr_s1[v2] = (String)((Map.Entry)object0).getValue();
            ++v2;
        }
        zzbkb zzbkb0 = new zzbkb(zzalp0.zzk(), arr_s, arr_s1);
        long v3 = zzt.zzB().elapsedRealtime();
        try {
            zzcas zzcas0 = new zzcas();
            zzbkl zzbkl0 = new zzbkl(this, zzcas0);
            zzbkm zzbkm0 = new zzbkm(this, zzcas0);
            Looper looper0 = zzt.zzt().zzb();
            this.zza = new zzbka(this.zzb, looper0, zzbkl0, zzbkm0);
            this.zza.checkAvailabilityAndConnect();
            d d0 = zzfye.zzo(zzfye.zzn(zzcas0, new zzbkj(this, zzbkb0), zzcan.zza), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzeo)))))), TimeUnit.MILLISECONDS, zzcan.zzd);
            d0.addListener(new zzbkk(this), zzcan.zza);
            parcelFileDescriptor0 = (ParcelFileDescriptor)d0.get();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return null;
        }
        finally {
            zze.zza(("Http assets remote cache took " + (zzt.zzB().elapsedRealtime() - v3) + "ms"));
        }
        zzbkd zzbkd0 = (zzbkd)new zzbul(parcelFileDescriptor0).zza(zzbkd.CREATOR);
        if(zzbkd0 == null) {
            return null;
        }
        if(zzbkd0.zza) {
            throw new zzaly(zzbkd0.zzb);
        }
        if(zzbkd0.zze.length == zzbkd0.zzf.length) {
            HashMap hashMap0 = new HashMap();
            for(int v1 = 0; true; ++v1) {
                String[] arr_s2 = zzbkd0.zze;
                if(v1 >= arr_s2.length) {
                    break;
                }
                hashMap0.put(arr_s2[v1], zzbkd0.zzf[v1]);
            }
            return new zzall(zzbkd0.zzc, zzbkd0.zzd, hashMap0, zzbkd0.zzg, zzbkd0.zzh);
        }
        return null;
    }

    static zzbka zzb(zzbkn zzbkn0) {
        return zzbkn0.zza;
    }

    static void zzc(zzbkn zzbkn0) {
        if(zzbkn0.zza == null) {
            return;
        }
        zzbkn0.zza.disconnect();
        Binder.flushPendingCommands();
    }
}

