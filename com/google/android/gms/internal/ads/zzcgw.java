package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public final class zzcgw extends MutableContextWrapper {
    private Activity zza;
    private Context zzb;
    private Context zzc;

    public zzcgw(Context context0) {
        super(context0);
        this.setBaseContext(context0);
    }

    @Override  // android.content.ContextWrapper
    public final Object getSystemService(String s) {
        return this.zzc.getSystemService(s);
    }

    @Override  // android.content.MutableContextWrapper
    public final void setBaseContext(Context context0) {
        Context context1 = context0.getApplicationContext();
        this.zzb = context1;
        this.zza = context0 instanceof Activity ? ((Activity)context0) : null;
        this.zzc = context0;
        super.setBaseContext(context1);
    }

    @Override  // android.content.ContextWrapper
    public final void startActivity(Intent intent0) {
        Activity activity0 = this.zza;
        if(activity0 != null) {
            activity0.startActivity(intent0);
            return;
        }
        intent0.setFlags(0x10000000);
        this.zzb.startActivity(intent0);
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }
}

