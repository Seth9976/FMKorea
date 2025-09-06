package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.PriorityQueue;

public final class zzavj {
    private final int zza;
    private final zzavg zzb;

    public zzavj(int v) {
        this.zzb = new zzavl();
        this.zza = v;
    }

    public final String zza(ArrayList arrayList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(((String)arrayList0.get(v1)).toLowerCase(Locale.US));
            stringBuilder0.append('\n');
        }
        String[] arr_s = stringBuilder0.toString().split("\n");
        if(arr_s.length == 0) {
            return "";
        }
        zzavi zzavi0 = new zzavi();
        zzavh zzavh0 = new zzavh(this);
        PriorityQueue priorityQueue0 = new PriorityQueue(this.zza, zzavh0);
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            String[] arr_s1 = zzavk.zzb(arr_s[v2], false);
            if(arr_s1.length != 0) {
                zzavo.zzc(arr_s1, this.zza, 6, priorityQueue0);
            }
        }
        for(Object object0: priorityQueue0) {
            zzavn zzavn0 = (zzavn)object0;
            try {
                byte[] arr_b = this.zzb.zzb(zzavn0.zzb);
                zzavi0.zzb.write(arr_b);
            }
            catch(IOException iOException0) {
                zzcaa.zzh("Error while writing hash to byteStream", iOException0);
                if(true) {
                    break;
                }
            }
        }
        return zzavi0.toString();
    }
}

