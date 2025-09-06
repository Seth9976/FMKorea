package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzcaa;

@KeepForSdk
public final class AdActivity extends Activity {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbsc zza;

    @Override  // android.app.Activity
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        zzbsc zzbsc0 = this.zza;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzh(v, v1, intent0);
            }
            catch(Exception exception0) {
                zzcaa.zzl("#007 Could not call remote method.", exception0);
            }
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // android.app.Activity
    public final void onBackPressed() {
        try {
            if(this.zza == null || this.zza.zzG()) {
                goto label_4;
            }
            return;
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    label_4:
        super.onBackPressed();
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzi();
            }
        }
        catch(RemoteException remoteException1) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException1);
        }
    }

    @Override  // android.app.Activity
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzk(ObjectWrapper.wrap(configuration0));
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        zzbsc zzbsc0 = zzay.zza().zzo(this);
        this.zza = zzbsc0;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzl(bundle0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
            return;
        }
        zzcaa.zzl("#007 Could not call remote method.", null);
        this.finish();
    }

    @Override  // android.app.Activity
    protected final void onDestroy() {
        zzbsc zzbsc0 = this.zza;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzm();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    protected final void onPause() {
        zzbsc zzbsc0 = this.zza;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzo();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onPause();
    }

    @Override  // android.app.Activity
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzp(v, arr_s, arr_v);
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzq();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzr();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle0) {
        zzbsc zzbsc0 = this.zza;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzs(bundle0);
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onSaveInstanceState(bundle0);
    }

    @Override  // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzt();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            this.finish();
        }
    }

    @Override  // android.app.Activity
    protected final void onStop() {
        zzbsc zzbsc0 = this.zza;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzu();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
                this.finish();
            }
        }
        super.onStop();
    }

    @Override  // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsc zzbsc0 = this.zza;
            if(zzbsc0 != null) {
                zzbsc0.zzv();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // android.app.Activity
    public final void setContentView(int v) {
        super.setContentView(v);
        this.zza();
    }

    @Override  // android.app.Activity
    public final void setContentView(View view0) {
        super.setContentView(view0);
        this.zza();
    }

    @Override  // android.app.Activity
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setContentView(view0, viewGroup$LayoutParams0);
        this.zza();
    }

    private final void zza() {
        zzbsc zzbsc0 = this.zza;
        if(zzbsc0 != null) {
            try {
                zzbsc0.zzx();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

