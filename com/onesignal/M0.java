package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import z3.k;

public abstract class m0 extends Activity {
    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        l0.g(this, this.getIntent());
        this.finish();
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        k.e(intent0, "intent");
        super.onNewIntent(intent0);
        l0.g(this, this.getIntent());
        this.finish();
    }
}

