package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zzcfe implements DialogInterface.OnClickListener {
    final JsPromptResult zza;

    zzcfe(JsPromptResult jsPromptResult0) {
        this.zza = jsPromptResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.cancel();
    }
}

