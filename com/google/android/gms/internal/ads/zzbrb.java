package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

final class zzbrb implements DialogInterface.OnClickListener {
    final zzbrc zza;

    zzbrb(zzbrc zzbrc0) {
        this.zza = zzbrc0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzg("User canceled the download.");
    }
}

