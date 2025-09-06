package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

final class zzbqw implements DialogInterface.OnClickListener {
    final zzbqx zza;

    zzbqw(zzbqx zzbqx0) {
        this.zza = zzbqx0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzg("Operation denied by user.");
    }
}

