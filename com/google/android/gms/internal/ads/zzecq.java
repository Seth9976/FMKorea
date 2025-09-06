package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;

public final class zzecq implements DialogInterface.OnCancelListener {
    public final zzecs zza;
    public final zzl zzb;

    public zzecq(zzecs zzecs0, zzl zzl0) {
        this.zza = zzecs0;
        this.zzb = zzl0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.zza.zzn(this.zzb, dialogInterface0);
    }
}

