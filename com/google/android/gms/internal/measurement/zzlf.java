package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class zzlf extends zzlg {
    zzlf(int v) {
        super(v, null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlg
    public final void zza() {
        if(!this.zze()) {
            for(int v = 0; v < this.zzb(); ++v) {
                Map.Entry map$Entry0 = this.zzb(v);
                if(((zzis)map$Entry0.getKey()).zze()) {
                    map$Entry0.setValue(Collections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: this.zzc()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((zzis)map$Entry1.getKey()).zze()) {
                    map$Entry1.setValue(Collections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        super.zza();
    }
}

