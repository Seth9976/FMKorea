package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

public final class zzatj extends zzatm {
    private final View zzi;

    public zzatj(zzary zzary0, String s, String s1, zzanv zzanv0, int v, int v1, View view0) {
        super(zzary0, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", zzanv0, v, 57);
        this.zzi = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatm
    protected final void zza() {
        if(this.zzi != null) {
            Boolean boolean0 = (Boolean)zzba.zzc().zzb(zzbbr.zzdg);
            Boolean boolean1 = (Boolean)zzba.zzc().zzb(zzbbr.zzjR);
            DisplayMetrics displayMetrics0 = this.zzb.zzb().getResources().getDisplayMetrics();
            zzasc zzasc0 = new zzasc(((String)this.zzf.invoke(null, this.zzi, displayMetrics0, boolean0, boolean1)));
            zzaoq zzaoq0 = zzaor.zza();
            zzaoq0.zzb(((long)zzasc0.zza));
            zzaoq0.zzd(((long)zzasc0.zzb));
            zzaoq0.zze(((long)zzasc0.zzc));
            if(boolean1.booleanValue()) {
                zzaoq0.zzc(((long)zzasc0.zze));
            }
            if(boolean0.booleanValue()) {
                zzaoq0.zza(((long)zzasc0.zzd));
            }
            zzaor zzaor0 = (zzaor)zzaoq0.zzal();
            this.zze.zzY(zzaor0);
        }
    }
}

