package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcd;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map.Entry;
import java.util.Map;

final class zzgc implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzfx zzc;
    private final String zzd;
    private final Map zze;
    private final zzfy zzf;

    public zzgc(zzfy zzfy0, String s, URL uRL0, byte[] arr_b, Map map0, zzfx zzfx0) {
        this.zzf = zzfy0;
        super();
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(uRL0);
        Preconditions.checkNotNull(zzfx0);
        this.zza = uRL0;
        this.zzb = arr_b;
        this.zzc = zzfx0;
        this.zzd = s;
        this.zze = map0;
    }

    @Override
    public final void run() {
        byte[] arr_b1;
        Map map3;
        int v2;
        Throwable throwable2;
        int v1;
        IOException iOException2;
        int v;
        OutputStream outputStream1;
        byte[] arr_b;
        Map map1;
        Map map0;
        HttpURLConnection httpURLConnection0;
        this.zzf.zzr();
        OutputStream outputStream0 = null;
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
            goto label_76;
        }
        catch(Throwable throwable0) {
            httpURLConnection0 = null;
            map1 = null;
            v1 = 0;
            throwable2 = throwable0;
            goto label_91;
        }
        try {
            Map map2 = this.zze;
            if(map2 != null) {
                for(Object object0: map2.entrySet()) {
                    httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
            }
            if(this.zzb != null) {
                arr_b = this.zzf.g_().zzb(this.zzb);
                this.zzf.zzj().zzp().zza("Uploading data. size", ((int)arr_b.length));
                httpURLConnection0.setDoOutput(true);
                httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
                httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
                httpURLConnection0.connect();
                outputStream1 = httpURLConnection0.getOutputStream();
                goto label_35;
            }
            goto label_50;
        }
        catch(IOException iOException0) {
            goto label_75;
        }
        catch(Throwable throwable0) {
            map1 = null;
            v1 = 0;
            throwable2 = throwable0;
            goto label_91;
        }
        try {
        label_35:
            outputStream1.write(arr_b);
            outputStream1.close();
        }
        catch(IOException iOException1) {
            map0 = null;
            v = 0;
            outputStream0 = outputStream1;
            iOException2 = iOException1;
            goto label_78;
        }
        catch(Throwable throwable1) {
            map1 = null;
            v1 = 0;
            outputStream0 = outputStream1;
            throwable2 = throwable1;
            goto label_91;
        }
        try {
        label_50:
            v2 = httpURLConnection0.getResponseCode();
        }
        catch(IOException iOException0) {
            goto label_75;
        }
        catch(Throwable throwable0) {
            map1 = null;
            v1 = 0;
            throwable2 = throwable0;
            goto label_91;
        }
        try {
            map3 = httpURLConnection0.getHeaderFields();
        }
        catch(IOException iOException0) {
            map0 = null;
            v = v2;
            goto label_67;
        }
        catch(Throwable throwable3) {
            map1 = null;
            throwable2 = throwable3;
            v1 = v2;
            goto label_91;
        }
        try {
            arr_b1 = zzfy.zza(this.zzf, httpURLConnection0);
            goto label_100;
        }
        catch(IOException iOException0) {
            v = v2;
            map0 = map3;
            try {
                while(true) {
                label_67:
                    iOException2 = iOException0;
                    break;
                label_75:
                    map0 = null;
                label_76:
                    v = 0;
                }
            }
            catch(IOException iOException0) {
                goto label_75;
            }
            catch(Throwable throwable0) {
                map1 = null;
                v1 = 0;
                throwable2 = throwable0;
                goto label_91;
            }
        label_78:
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(IOException iOException3) {
                    this.zzf.zzj().zzg().zza("Error closing HTTP compressed POST connection output stream. appId", zzfr.zza(this.zzd), iOException3);
                }
            }
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            this.zzf.zzl().zzb(new zzga(this.zzd, this.zzc, v, iOException2, null, map0, null));
            return;
        }
        catch(Throwable throwable4) {
            throwable2 = throwable4;
            v1 = v2;
            map1 = map3;
        }
    label_91:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException4) {
                this.zzf.zzj().zzg().zza("Error closing HTTP compressed POST connection output stream. appId", zzfr.zza(this.zzd), iOException4);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.zzf.zzl().zzb(new zzga(this.zzd, this.zzc, v1, null, null, map1, null));
        throw throwable2;
    label_100:
        httpURLConnection0.disconnect();
        this.zzf.zzl().zzb(new zzga(this.zzd, this.zzc, v2, null, arr_b1, map3, null));
    }
}

