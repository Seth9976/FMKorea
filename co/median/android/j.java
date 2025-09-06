package co.median.android;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

public final class j implements DialogInterface.OnDismissListener {
    public final JsResult f;

    public j(JsResult jsResult0) {
        this.f = jsResult0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        k.g(this.f, dialogInterface0);
    }
}

