package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzcaf implements zzbzs {
    private final String zza;

    public zzcaf() {
        this.zza = null;
    }

    public zzcaf(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbzs
    public final boolean zza(String s) {
        boolean z;
        try {
            try {
                z = false;
                zzcaa.zze(("Pinging URL: " + s));
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
                try {
                    String s1 = this.zza;
                    httpURLConnection0.setConnectTimeout(60000);
                    httpURLConnection0.setInstanceFollowRedirects(true);
                    httpURLConnection0.setReadTimeout(60000);
                    if(s1 != null) {
                        httpURLConnection0.setRequestProperty("User-Agent", s1);
                    }
                    httpURLConnection0.setUseCaches(false);
                    zzbzz zzbzz0 = new zzbzz(null);
                    zzbzz0.zzc(httpURLConnection0, null);
                    int v1 = httpURLConnection0.getResponseCode();
                    zzbzz0.zze(httpURLConnection0, v1);
                    if(v1 < 200 || v1 >= 300) {
                        zzcaa.zzj(("Received non-success response code " + v1 + " from pinging URL: " + s));
                    }
                    else {
                        z = true;
                    }
                }
                finally {
                    httpURLConnection0.disconnect();
                }
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                zzcaa.zzj(("Error while parsing ping URL: " + s + ". " + indexOutOfBoundsException0.getMessage()));
            }
            catch(IOException | RuntimeException iOException0) {
                zzcaa.zzj(("Error while pinging URL: " + s + ". " + iOException0.getMessage()));
            }
            return z;
        }
        catch(Throwable throwable0) {
        }
        throw throwable0;
    }
}

