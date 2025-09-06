package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class zzam implements DialogInterface.OnCancelListener {
    public final zzas zza;

    public zzam(zzas zzas0) {
        this.zza = zzas0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.zza.zzr();
    }
}

