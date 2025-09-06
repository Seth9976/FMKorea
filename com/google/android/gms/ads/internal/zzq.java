package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzq extends AsyncTask {
    final zzs zza;

    zzq(zzs zzs0, zzp zzp0) {
        this.zza = zzs0;
        super();
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        return this.zza(((Void[])arr_object));
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        zzs zzs0 = this.zza;
        if(zzs.zze(zzs0) != null && ((String)object0) != null) {
            zzs.zze(zzs0).loadUrl(((String)object0));
        }
    }

    protected final String zza(Void[] arr_void) {
        try {
            zzaqx zzaqx0 = (zzaqx)this.zza.zzc.get(1000L, TimeUnit.MILLISECONDS);
            this.zza.zzh = zzaqx0;
            return this.zza.zzp();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            zzcaa.zzk("", interruptedException0);
            return this.zza.zzp();
        }
        catch(TimeoutException timeoutException0) {
            zzcaa.zzk("", timeoutException0);
            return this.zza.zzp();
        }
    }
}

