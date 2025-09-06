package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

public final class zzecn implements DialogInterface.OnCancelListener {
    public final zzl zza;

    public zzecn(zzl zzl0) {
        this.zza = zzl0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        zzl zzl0 = this.zza;
        if(zzl0 != null) {
            zzl0.zzb();
        }
    }
}

