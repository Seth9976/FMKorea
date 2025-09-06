package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzboc;

@KeepForSdk
public final class OutOfContextTestingActivity extends Activity {
    @KeepForSdk
    public static final String AD_UNIT_KEY = "adUnit";
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override  // android.app.Activity
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        zzdj zzdj0 = zzay.zza().zzf(this, new zzboc());
        if(zzdj0 == null) {
            this.finish();
            return;
        }
        this.setContentView(layout.admob_empty_layout);
        LinearLayout linearLayout0 = (LinearLayout)this.findViewById(id.layout);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            this.finish();
            return;
        }
        String s = intent0.getStringExtra("adUnit");
        if(s == null) {
            this.finish();
            return;
        }
        try {
            zzdj0.zze(s, ObjectWrapper.wrap(this), ObjectWrapper.wrap(linearLayout0));
        }
        catch(RemoteException unused_ex) {
            this.finish();
        }
    }
}

