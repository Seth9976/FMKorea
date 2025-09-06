package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

final class zzcfc implements DialogInterface.OnClickListener {
    final JsResult zza;

    zzcfc(JsResult jsResult0) {
        this.zza = jsResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.confirm();
    }
}

