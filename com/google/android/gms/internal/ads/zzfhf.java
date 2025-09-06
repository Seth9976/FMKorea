package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzfhf {
    public static zzfhg zza(Context context0, int v) {
        boolean z;
        if(zzfhu.zza()) {
            if(v - 2 == 20 || v - 2 == 21) {
                z = ((Boolean)zzbdd.zze.zze()).booleanValue();
            }
            else {
                switch(v - 2) {
                    case 5: {
                        z = ((Boolean)zzbdd.zzb.zze()).booleanValue();
                        break;
                    }
                    case 2: 
                    case 3: 
                    case 6: 
                    case 7: 
                    case 8: {
                        z = ((Boolean)zzbdd.zzc.zze()).booleanValue();
                        break;
                    }
                    case 4: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: {
                        z = ((Boolean)zzbdd.zzd.zze()).booleanValue();
                        break;
                    }
                    default: {
                        return new zzfid();
                    }
                }
            }
            if(z) {
                return new zzfhi(context0, v);
            }
        }
        return new zzfid();
    }

    public static zzfhg zzb(Context context0, int v, int v1, zzl zzl0) {
        zzfhg zzfhg0 = zzfhf.zza(context0, v);
        if(!(zzfhg0 instanceof zzfhi)) {
            return zzfhg0;
        }
        zzfhg0.zzh();
        zzfhg0.zzm(v1);
        if(zzfhq.zze(zzl0.zzp)) {
            zzfhg0.zze(zzl0.zzp);
        }
        return zzfhg0;
    }
}

