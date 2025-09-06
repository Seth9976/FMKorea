package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.net.Uri;

final class zzau implements DialogInterface.OnClickListener {
    final zzav zza;

    zzau(zzav zzav0) {
        this.zza = zzav0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Uri uri0 = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");
        zzs.zzR(this.zza.zza, uri0);
    }
}

