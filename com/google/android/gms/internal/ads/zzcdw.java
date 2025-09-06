package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzcdw implements zzfny {
    public final String zza;

    public zzcdw(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfny
    public final URLConnection zza() {
        int v = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzz)));
        URL uRL0 = new URL(this.zza);
        int v1 = 0;
        while(true) {
            ++v1;
            if(v1 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnection0 = uRL0.openConnection();
            uRLConnection0.setConnectTimeout(v);
            uRLConnection0.setReadTimeout(v);
            if(!(uRLConnection0 instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            zzbzz zzbzz0 = new zzbzz(null);
            zzbzz0.zzc(((HttpURLConnection)uRLConnection0), null);
            ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
            int v2 = ((HttpURLConnection)uRLConnection0).getResponseCode();
            zzbzz0.zze(((HttpURLConnection)uRLConnection0), v2);
            if(v2 / 100 != 3) {
                return (HttpURLConnection)uRLConnection0;
            }
            String s = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
            if(s == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL uRL1 = new URL(uRL0, s);
            String s1 = uRL1.getProtocol();
            if(s1 == null) {
                break;
            }
            if(!s1.equals("http") && !s1.equals("https")) {
                throw new IOException("Unsupported scheme: " + s1);
            }
            zzcaa.zze(("Redirecting to " + s));
            ((HttpURLConnection)uRLConnection0).disconnect();
            uRL0 = uRL1;
        }
        throw new IOException("Protocol is null");
    }
}

