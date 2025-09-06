package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.ArrayList;
import java.util.List;

public final class zzfce {
    public static zzq zza(Context context0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzfbf zzfbf0 = (zzfbf)object0;
            if(zzfbf0.zzc) {
                arrayList0.add(AdSize.FLUID);
            }
            else {
                arrayList0.add(new AdSize(zzfbf0.zza, zzfbf0.zzb));
            }
        }
        return new zzq(context0, ((AdSize[])arrayList0.toArray(new AdSize[arrayList0.size()])));
    }

    // 去混淆评级： 低(20)
    public static zzfbf zzb(zzq zzq0) {
        return zzq0.zzi ? new zzfbf(-3, 0, true) : new zzfbf(zzq0.zze, zzq0.zzb, false);
    }
}

