package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzebl implements zzfya {
    final boolean zza;
    final zzebm zzb;

    zzebl(zzebm zzebm0, boolean z) {
        this.zzb = zzebm0;
        this.zza = z;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        zzcaa.zzg("Failed to get signals bundle");
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        zzayc zzayc0;
        List list1;
        Iterator iterator0;
        ArrayList arrayList0;
        if(this.zzb.zzf()) {
            return;
        }
        Object object1 = ((Bundle)object0).get("ad_types");
        if(object1 instanceof List) {
            arrayList0 = new ArrayList(((List)object1).size());
            iterator0 = ((List)object1).iterator();
            goto label_11;
        }
        else if(object1 instanceof String[]) {
            List list0 = Arrays.asList(((String[])object1));
            arrayList0 = new ArrayList(list0.size());
            iterator0 = list0.iterator();
        label_11:
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                if(object2 instanceof String) {
                    arrayList0.add(((String)object2));
                }
            }
            list1 = Collections.unmodifiableList(arrayList0);
        }
        else {
            list1 = Collections.emptyList();
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object3: list1) {
            switch(((String)object3)) {
                case "banner": {
                    zzayc0 = zzayc.zzb;
                    break;
                }
                case "interstitial": {
                    zzayc0 = zzayc.zzc;
                    break;
                }
                case "native": {
                    zzayc0 = zzayc.zzf;
                    break;
                }
                case "rewarded": {
                    zzayc0 = zzayc.zzj;
                    break;
                }
                default: {
                    zzayc0 = zzayc.zza;
                }
            }
            arrayList1.add(zzayc0);
        }
        zzazr zzazr0 = zzebm.zzb(this.zzb, ((Bundle)object0));
        zzazi zzazi0 = zzebm.zza(this.zzb, ((Bundle)object0));
        zzebk zzebk0 = new zzebk(this, this.zza, arrayList1, zzazi0, zzazr0);
        this.zzb.zza.zza(zzebk0);
    }
}

