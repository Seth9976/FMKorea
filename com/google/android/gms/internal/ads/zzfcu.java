package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.zzs;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfcu {
    private static zzfcu zza;
    private final Context zzb;
    private final zzcl zzc;
    private final AtomicReference zzd;

    zzfcu(Context context0, zzcl zzcl0) {
        this.zzd = new AtomicReference();
        this.zzb = context0;
        this.zzc = zzcl0;
    }

    static zzcl zza(Context context0) {
        try {
            return zzck.asInterface(((IBinder)context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context0)));
        }
        catch(ClassCastException | ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException classCastException0) {
            zzcaa.zzh("Failed to retrieve lite SDK info.", classCastException0);
            return null;
        }
    }

    public final zzbof zzb() {
        return (zzbof)this.zzd.get();
    }

    public final zzcag zzc(int v, boolean z, int v1) {
        boolean z1 = zzs.zzB(this.zzb);
        zzcag zzcag0 = new zzcag(233012000, v1, true, z1);
        if(!((Boolean)zzbdm.zzc.zze()).booleanValue()) {
            return zzcag0;
        }
        zzen zzen0 = this.zzg();
        return zzen0 == null ? zzcag0 : new zzcag(233012000, zzen0.zza(), true, z1);
    }

    public static zzfcu zzd(Context context0) {
        synchronized(zzfcu.class) {
            zzfcu zzfcu0 = zzfcu.zza;
            if(zzfcu0 != null) {
                return zzfcu0;
            }
            Context context1 = context0.getApplicationContext();
            long v1 = (long)(((Long)zzbdm.zzb.zze()));
            zzfcu zzfcu1 = new zzfcu(context1, (Long.compare(v1, 0L) <= 0 || v1 > 233012802L ? null : zzfcu.zza(context1)));
            zzfcu.zza = zzfcu1;
            return zzfcu1;
        }
    }

    // 去混淆评级： 低(20)
    public final String zze() {
        return this.zzg() == null ? null : "22.4.0";
    }

    public final void zzf(zzbof zzbof0) {
        if(((Boolean)zzbdm.zza.zze()).booleanValue()) {
            zzcl zzcl0 = this.zzc;
            zzbof zzbof1 = null;
            if(zzcl0 != null) {
                try {
                    zzbof1 = zzcl0.getAdapterCreator();
                }
                catch(RemoteException unused_ex) {
                }
            }
            AtomicReference atomicReference0 = this.zzd;
            if(zzbof1 != null) {
                zzbof0 = zzbof1;
            }
            zzfct.zza(atomicReference0, null, zzbof0);
            return;
        }
        zzfct.zza(this.zzd, null, zzbof0);
    }

    private final zzen zzg() {
        zzcl zzcl0 = this.zzc;
        if(zzcl0 != null) {
            try {
                return zzcl0.getLiteSdkVersion();
            }
            catch(RemoteException unused_ex) {
            }
        }
        return null;
    }
}

