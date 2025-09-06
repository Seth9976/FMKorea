package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NotificationOpenedActivityHMS extends Activity {
    private void a() {
        this.b(this.getIntent());
        this.finish();
    }

    private void b(Intent intent0) {
        n0.b(this, intent0);
    }

    @Override  // android.app.Activity
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.a();
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.a();
    }
}

