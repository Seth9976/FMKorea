package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcl;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzewa implements Callable {
    public static final zzewa zza;

    static {
        zzewa.zza = new zzewa();
    }

    @Override
    public final Object call() {
        HashMap hashMap0 = new HashMap();
        String s = (String)zzba.zzc().zzb(zzbbr.zzL);
        if(s != null && !s.isEmpty() && Build.VERSION.SDK_INT >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzM))))) {
            String[] arr_s = s.split(",", -1);
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                hashMap0.put(s1, zzcl.zza(s1));
            }
        }
        return new zzewc(hashMap0);
    }
}

