package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcd;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

final class zzke implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzkb zzc;
    private final String zzd;
    private final Map zze;
    private final zzkc zzf;

    public zzke(zzkc zzkc0, String s, URL uRL0, byte[] arr_b, Map map0, zzkb zzkb0) {
        this.zzf = zzkc0;
        super();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(zzkb0);
        this.zza = uRL0;
        this.zzb = null;
        this.zzc = zzkb0;
        this.zzd = s;
        this.zze = null;
    }

    @Override
    public final void run() {
        byte[] arr_b;
        Map map0;
        HttpURLConnection httpURLConnection0;
        this.zzf.zzr();
        int v = 0;
        try {
            URLConnection uRLConnection0 = zzcd.zza().zza(this.zza, "client-measurement");
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection0 = (HttpURLConnection)uRLConnection0;
            httpURLConnection0.setDefaultUseCaches(false);
            httpURLConnection0.setConnectTimeout(60000);
            httpURLConnection0.setReadTimeout(61000);
            httpURLConnection0.setInstanceFollowRedirects(false);
            httpURLConnection0.setDoInput(true);
        }
        catch(IOException iOException0) {
            httpURLConnection0 = null;
            map0 = null;
            goto label_30;
        }
        catch(Throwable throwable0) {
            httpURLConnection0 = null;
            map0 = null;
            goto label_35;
        }
        try {
            v = httpURLConnection0.getResponseCode();
            map0 = null;
            map0 = httpURLConnection0.getHeaderFields();
            arr_b = zzkc.zza(this.zzf, httpURLConnection0);
            goto label_39;
        }
        catch(IOException iOException0) {
            map0 = null;
            goto label_30;
            try {
                arr_b = zzkc.zza(this.zzf, httpURLConnection0);
                goto label_39;
            }
            catch(IOException iOException0) {
            }
            catch(Throwable throwable0) {
                goto label_35;
            }
        label_30:
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            this.zzb(v, iOException0, null, map0);
            return;
        }
        catch(Throwable throwable0) {
        }
    label_35:
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.zzb(v, null, null, map0);
        throw throwable0;
    label_39:
        httpURLConnection0.disconnect();
        this.zzb(v, null, arr_b, map0);
    }

    // 检测为 Lambda 实现
    final void zza(int v, Exception exception0, byte[] arr_b, Map map0) [...]

    private final void zzb(int v, Exception exception0, byte[] arr_b, Map map0) {
        this.zzf.zzl().zzb(() -> this.zzc.zza(this.zzd, v, exception0, arr_b, map0));
    }
}

