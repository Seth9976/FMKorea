package com.onesignal;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class d implements DialogInterface.OnClickListener {
    public final a f;

    public d(a e$a0) {
        this.f = e$a0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        e.a(this.f, dialogInterface0, v);
    }
}

