package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzfne {
    final zzfnh zza;
    final boolean zzb;

    private zzfne(zzfnh zzfnh0) {
        this.zza = zzfnh0;
        this.zzb = zzfnh0 != null;
    }

    public final zzfnd zza(byte[] arr_b) {
        return new zzfnd(this, arr_b, null);
    }

    public static zzfne zzb(Context context0, String s, String s1) {
        zzfnh zzfnh0;
        try {
            IBinder iBinder0 = DynamiteModule.load(context0, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            if(iBinder0 == null) {
                zzfnh0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfnh0 = iInterface0 instanceof zzfnh ? ((zzfnh)iInterface0) : new zzfnf(iBinder0);
            }
        }
        catch(Exception unused_ex) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfne(new zzfni());
        }
        try {
            zzfnh0.zze(ObjectWrapper.wrap(context0), s, null);
            Log.i("GASS", "GassClearcutLogger Initialized.");
            return new zzfne(zzfnh0);
        }
        catch(zzfmg | RemoteException | NullPointerException | SecurityException unused_ex) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfne(new zzfni());
        }
    }

    public static zzfne zzc() {
        zzfni zzfni0 = new zzfni();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfne(zzfni0);
    }
}

