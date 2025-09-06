package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class zzad implements DialogInterface.OnClickListener {
    public final zzas zza;
    public final String zzb;

    public zzad(zzas zzas0, String s) {
        this.zza = zzas0;
        this.zzb = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzi(this.zzb, dialogInterface0, v);
    }
}

