package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

public abstract class zzfkq extends AsyncTask {
    private zzfkr zza;
    protected final zzfki zzd;

    public zzfkq(zzfki zzfki0) {
        this.zzd = zzfki0;
    }

    @Override  // android.os.AsyncTask
    protected void onPostExecute(Object object0) {
        this.zza(((String)object0));
    }

    protected void zza(String s) {
        zzfkr zzfkr0 = this.zza;
        if(zzfkr0 != null) {
            zzfkr0.zza(this);
        }
    }

    public final void zzb(zzfkr zzfkr0) {
        this.zza = zzfkr0;
    }
}

