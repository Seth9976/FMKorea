package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbds;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

abstract class zzax {
    private static final zzce zza;

    static {
        zzce zzce0 = null;
        try {
            Object object0 = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if(!(object0 instanceof IBinder)) {
                zzcaa.zzj("ClientApi class is not an instance of IBinder.");
            }
            else if(((IBinder)object0) != null) {
                IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzce zzce1 = iInterface0 instanceof zzce ? ((zzce)iInterface0) : new zzcc(((IBinder)object0));
                zzce0 = zzce1;
            }
        }
        catch(Exception unused_ex) {
            zzcaa.zzj("Failed to instantiate ClientApi class.");
        }
        zzax.zza = zzce0;
    }

    protected abstract Object zza();

    protected abstract Object zzb(zzce arg1);

    protected abstract Object zzc();

    public final Object zzd(Context context0, boolean z) {
        Object object0;
        boolean z1;
        if(!z && !zzbzt.zzs(context0, 12451000)) {
            zzcaa.zze("Google Play Services is not available.");
            z = true;
        }
        int v = 0;
        int v1 = DynamiteModule.getLocalVersion(context0, "com.google.android.gms.ads.dynamite") <= DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite") ? 1 : 0;
        zzbbr.zza(context0);
        if(((Boolean)zzbdf.zza.zze()).booleanValue()) {
            z1 = false;
        }
        else if(((Boolean)zzbdf.zzb.zze()).booleanValue()) {
            z1 = true;
            v = 1;
        }
        else {
            v = z | v1 ^ 1;
            z1 = false;
        }
        if(v == 0) {
            Object object1 = this.zzf();
            if(object1 == null && zzay.zze().nextInt(((Long)zzbds.zza.zze()).intValue()) == 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("action", "dynamite_load");
                bundle0.putInt("is_missing", 1);
                zzay.zzb().zzn(context0, zzay.zzc().zza, "gmob-apps", bundle0, true);
            }
            object0 = object1 == null ? this.zze() : object1;
        }
        else {
            object0 = this.zze();
            if(object0 == null && !z1) {
                object0 = this.zzf();
                return object0 == null ? this.zza() : object0;
            }
        }
        return object0 == null ? this.zza() : object0;
    }

    private final Object zze() {
        zzce zzce0 = zzax.zza;
        if(zzce0 != null) {
            try {
                return this.zzb(zzce0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzk("Cannot invoke local loader using ClientApi class.", remoteException0);
                return null;
            }
        }
        zzcaa.zzj("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object zzf() {
        try {
            return this.zzc();
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzk("Cannot invoke remote loader.", remoteException0);
            return null;
        }
    }
}

