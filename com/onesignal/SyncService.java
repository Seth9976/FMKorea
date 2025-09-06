package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent0, int v, int v1) {
        q1.q().b(this, new a(this));
        return 1;
    }
}

