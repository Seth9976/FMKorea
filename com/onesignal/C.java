package com.onesignal;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class c implements DialogInterface.OnClickListener {
    public final a f;

    public c(a e$a0) {
        this.f = e$a0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        e.b(this.f, dialogInterface0, v);
    }
}

