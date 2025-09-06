package co.median.android;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

public final class i implements DialogInterface.OnClickListener {
    public final JsResult f;

    public i(JsResult jsResult0) {
        this.f = jsResult0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        k.f(this.f, dialogInterface0, v);
    }
}

