package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

class a extends InstallReferrerClient {
    static abstract class com.android.installreferrer.api.a.a {
    }

    final class b implements ServiceConnection {
        private final InstallReferrerStateListener f;
        final a g;

        private b(InstallReferrerStateListener installReferrerStateListener0) {
            if(installReferrerStateListener0 == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f = installReferrerStateListener0;
        }

        b(InstallReferrerStateListener installReferrerStateListener0, com.android.installreferrer.api.a.a a$a0) {
            this(installReferrerStateListener0);
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            L0.a.a("InstallReferrerClient", "Install Referrer service connected.");
            y1.a a0 = y1.a.a.v(iBinder0);
            a.this.c = a0;
            a.this.a = 2;
            this.f.a(0);
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
            L0.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            a.this.c = null;
            a.this.a = 0;
            this.f.b();
        }
    }

    private int a;
    private final Context b;
    private y1.a c;
    private ServiceConnection d;

    public a(Context context0) {
        this.a = 0;
        this.b = context0.getApplicationContext();
    }

    @Override  // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails a() {
        if(this.g()) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("package_name", "com.fmkorea.m.fmk");
            try {
                return new ReferrerDetails(this.c.g(bundle0));
            }
            catch(RemoteException remoteException0) {
                L0.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw remoteException0;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override  // com.android.installreferrer.api.InstallReferrerClient
    public void c(InstallReferrerStateListener installReferrerStateListener0) {
        if(this.g()) {
            L0.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener0.a(0);
            return;
        }
        int v = this.a;
        if(v == 1) {
            L0.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener0.a(3);
            return;
        }
        if(v == 3) {
            L0.a.b("InstallReferrerClient", "Client was already closed and can\'t be reused. Please create another instance.");
            installReferrerStateListener0.a(3);
            return;
        }
        L0.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        this.d = new b(this, installReferrerStateListener0, null);
        Intent intent0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List list0 = this.b.getPackageManager().queryIntentServices(intent0, 0);
        if(list0 != null && !list0.isEmpty()) {
            ServiceInfo serviceInfo0 = ((ResolveInfo)list0.get(0)).serviceInfo;
            if(serviceInfo0 != null) {
                if("com.android.vending".equals(serviceInfo0.packageName) && serviceInfo0.name != null && this.f()) {
                    Intent intent1 = new Intent(intent0);
                    if(this.b.bindService(intent1, this.d, 1)) {
                        L0.a.a("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    L0.a.b("InstallReferrerClient", "Connection to service is blocked.");
                    this.a = 0;
                    installReferrerStateListener0.a(1);
                    return;
                }
                L0.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.a = 0;
                installReferrerStateListener0.a(2);
                return;
            }
        }
        this.a = 0;
        L0.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener0.a(2);
    }

    private boolean f() {
        PackageManager packageManager0 = this.b.getPackageManager();
        try {
            if(packageManager0.getPackageInfo("com.android.vending", 0x80).versionCode >= 80837300) {
                return true;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    public boolean g() {
        return this.a == 2 && this.c != null && this.d != null;
    }
}

