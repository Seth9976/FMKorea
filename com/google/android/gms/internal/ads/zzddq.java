package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzddq extends zzdbs implements zzauf {
    private final Map zzb;
    private final Context zzc;
    private final zzfbe zzd;

    public zzddq(Context context0, Set set0, zzfbe zzfbe0) {
        super(set0);
        this.zzb = new WeakHashMap(1);
        this.zzc = context0;
        this.zzd = zzfbe0;
    }

    public final void zza(View view0) {
        synchronized(this) {
            zzaug zzaug0 = (zzaug)this.zzb.get(view0);
            if(zzaug0 == null) {
                zzaug0 = new zzaug(this.zzc, view0);
                zzaug0.zzc(this);
                this.zzb.put(view0, zzaug0);
            }
            if(this.zzd.zzY && ((Boolean)zzba.zzc().zzb(zzbbr.zzbl)).booleanValue()) {
                zzaug0.zzg(((long)(((Long)zzba.zzc().zzb(zzbbr.zzbk)))));
                return;
            }
            zzaug0.zzf();
        }
    }

    public final void zzb(View view0) {
        synchronized(this) {
            if(this.zzb.containsKey(view0)) {
                ((zzaug)this.zzb.get(view0)).zze(this);
                this.zzb.remove(view0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaue0) {
        synchronized(this) {
            this.zzt(new zzddp(zzaue0));
        }
    }
}

