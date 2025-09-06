package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class zzgv extends zzgc implements zzhf {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhe zzf;
    private final zzhe zzg;
    private zzgn zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzgv() {
        this(null, 8000, 8000, false, null, null, false);
    }

    private zzgv(String s, int v, int v1, boolean z, zzhe zzhe0, zzfrj zzfrj0, boolean z1) {
        super(true);
        this.zze = s;
        this.zzc = v;
        this.zzd = v1;
        this.zzb = z;
        this.zzf = zzhe0;
        this.zzg = new zzhe();
    }

    zzgv(String s, int v, int v1, boolean z, zzhe zzhe0, zzfrj zzfrj0, boolean z1, zzgu zzgu0) {
        this(s, v, v1, z, zzhe0, null, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        try {
            long v2 = this.zzm;
            if(Long.compare(v2, -1L) == 0) {
            label_7:
                int v4 = this.zzj.read(arr_b, v, v1);
                if(v4 != -1) {
                    this.zzn += (long)v4;
                    this.zzg(v4);
                    return v4;
                }
            }
            else {
                long v3 = v2 - this.zzn;
                if(v3 != 0L) {
                    v1 = (int)Math.min(v1, v3);
                    goto label_7;
                }
            }
            return -1;
        }
        catch(IOException iOException0) {
        }
        throw zzhb.zza(iOException0, this.zzh, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        byte[] arr_b1;
        String s2;
        long v5;
        String s1;
        long v4;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        this.zzh = zzgn0;
        this.zzn = 0L;
        this.zzm = 0L;
        this.zzi(zzgn0);
        try {
            URL uRL0 = new URL(zzgn0.zza.toString());
            long v = zzgn0.zzf;
            long v1 = zzgn0.zzg;
            boolean z = zzgn0.zza(1);
            if(this.zzb) {
                URL uRL1 = uRL0;
                int v2 = 0;
            alab1:
                while(true) {
                    if(v2 > 20) {
                        throw new zzhb(new NoRouteToHostException("Too many redirects: " + (v2 + 1)), zzgn0, 2001, 1);
                    }
                    httpURLConnection0 = this.zzk(uRL1, 1, null, v, v1, z, false, zzgn0.zzd);
                    int v3 = httpURLConnection0.getResponseCode();
                    String s = httpURLConnection0.getHeaderField("Location");
                    switch(v3) {
                        case 300: 
                        case 301: 
                        case 302: 
                        case 303: 
                        case 307: 
                        case 308: {
                            httpURLConnection0.disconnect();
                            uRL1 = this.zzl(uRL1, s, zzgn0);
                            ++v2;
                            break;
                        }
                        default: {
                            break alab1;
                        }
                    }
                }
                httpURLConnection1 = httpURLConnection0;
            }
            else {
                httpURLConnection1 = this.zzk(uRL0, 1, null, v, v1, z, true, zzgn0.zzd);
            }
            v4 = -1L;
            this.zzi = httpURLConnection1;
            this.zzl = httpURLConnection1.getResponseCode();
            s1 = httpURLConnection1.getResponseMessage();
        }
        catch(IOException iOException0) {
            this.zzm();
            throw zzhb.zza(iOException0, zzgn0, 1);
        }
        if(this.zzl >= 200 && this.zzl <= 299) {
            httpURLConnection1.getContentType();
            if(this.zzl == 200) {
                v5 = zzgn0.zzf;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            boolean z1 = "gzip".equalsIgnoreCase(httpURLConnection1.getHeaderField("Content-Encoding"));
            if(z1) {
                this.zzm = zzgn0.zzg;
            }
            else {
                long v6 = zzgn0.zzg;
                if(v6 == -1L) {
                    long v7 = zzhg.zza(httpURLConnection1.getHeaderField("Content-Length"), httpURLConnection1.getHeaderField("Content-Range"));
                    if(v7 != -1L) {
                        v4 = v7 - v5;
                    }
                    this.zzm = v4;
                }
                else {
                    this.zzm = v6;
                }
            }
            try {
                this.zzj = httpURLConnection1.getInputStream();
                if(z1) {
                    this.zzj = new GZIPInputStream(this.zzj);
                }
            }
            catch(IOException iOException1) {
                this.zzm();
                throw new zzhb(iOException1, zzgn0, 2000, 1);
            }
            this.zzk = true;
            this.zzj(zzgn0);
            if(v5 == 0L) {
                return this.zzm;
            }
            else {
                try {
                    while(v5 > 0L) {
                        int v8 = this.zzj.read(new byte[0x1000], 0, ((int)Math.min(v5, 0x1000L)));
                        if(Thread.currentThread().isInterrupted()) {
                            throw new zzhb(new InterruptedIOException(), zzgn0, 2000, 1);
                        }
                        if(v8 == -1) {
                            throw new zzhb(zzgn0, 2008, 1);
                        }
                        v5 -= (long)v8;
                        this.zzg(v8);
                    }
                    return this.zzm;
                }
                catch(IOException iOException2) {
                }
            }
            this.zzm();
            throw iOException2 instanceof zzhb ? ((zzhb)iOException2) : new zzhb(iOException2, zzgn0, 2000, 1);
        }
        Map map0 = httpURLConnection1.getHeaderFields();
        if(this.zzl == 0x1A0) {
            long v9 = zzhg.zzb(httpURLConnection1.getHeaderField("Content-Range"));
            s2 = s1;
            if(zzgn0.zzf == v9) {
                this.zzk = true;
                this.zzj(zzgn0);
                return zzgn0.zzg == -1L ? 0L : zzgn0.zzg;
            }
        }
        else {
            s2 = s1;
        }
        InputStream inputStream0 = httpURLConnection1.getErrorStream();
        try {
            if(inputStream0 == null) {
                arr_b1 = zzfk.zzf;
            }
            else {
                byte[] arr_b = new byte[0x1000];
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                int v10;
                while((v10 = inputStream0.read(arr_b)) != -1) {
                    byteArrayOutputStream0.write(arr_b, 0, v10);
                }
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
        }
        catch(IOException unused_ex) {
            arr_b1 = zzfk.zzf;
        }
        this.zzm();
        zzgj zzgj0 = this.zzl == 0x1A0 ? new zzgj(2008) : null;
        throw new zzhd(this.zzl, s2, zzgj0, map0, zzgn0, arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzi == null ? null : Uri.parse(this.zzi.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            InputStream inputStream0 = this.zzj;
            if(inputStream0 != null) {
                long v1 = this.zzm == -1L ? -1L : this.zzm - this.zzn;
                HttpURLConnection httpURLConnection0 = this.zzi;
                if(httpURLConnection0 != null && zzfk.zza <= 20) {
                    try {
                        InputStream inputStream1 = httpURLConnection0.getInputStream();
                        if(v1 != -1L) {
                            if(v1 > 0x800L) {
                            label_11:
                                String s = inputStream1.getClass().getName();
                                if("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(s) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(s)) {
                                    Class class0 = inputStream1.getClass().getSuperclass();
                                    if(class0 == null) {
                                        throw null;
                                    }
                                    Method method0 = class0.getDeclaredMethod("unexpectedEndOfInput", null);
                                    method0.setAccessible(true);
                                    method0.invoke(inputStream1, null);
                                }
                            }
                        }
                        else if(inputStream1.read() != -1) {
                            goto label_11;
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new zzhb(iOException0, this.zzh, 2000, 3);
                }
            }
        }
        finally {
            this.zzj = null;
            this.zzm();
            if(this.zzk) {
                this.zzk = false;
                this.zzh();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzhf
    public final Map zze() {
        HttpURLConnection httpURLConnection0 = this.zzi;
        return httpURLConnection0 == null ? zzfug.zzd() : new zzgt(httpURLConnection0.getHeaderFields());
    }

    private final HttpURLConnection zzk(URL uRL0, int v, byte[] arr_b, long v1, long v2, boolean z, boolean z1, Map map0) {
        String s;
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
        httpURLConnection0.setConnectTimeout(this.zzc);
        httpURLConnection0.setReadTimeout(this.zzd);
        HashMap hashMap0 = new HashMap();
        hashMap0.putAll(this.zzf.zza());
        hashMap0.putAll(this.zzg.zza());
        hashMap0.putAll(map0);
        for(Object object0: hashMap0.entrySet()) {
            httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        if(Long.compare(v1, 0L) != 0) {
        label_17:
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("bytes=");
            stringBuilder0.append(v1);
            stringBuilder0.append("-");
            if(v2 != -1L) {
                stringBuilder0.append(v1 + v2 - 1L);
            }
            s = stringBuilder0.toString();
        }
        else if(v2 == -1L) {
            s = null;
        }
        else {
            v1 = 0L;
            goto label_17;
        }
        if(s != null) {
            httpURLConnection0.setRequestProperty("Range", s);
        }
        String s1 = this.zze;
        if(s1 != null) {
            httpURLConnection0.setRequestProperty("User-Agent", s1);
        }
        httpURLConnection0.setRequestProperty("Accept-Encoding", (z ? "gzip" : "identity"));
        httpURLConnection0.setInstanceFollowRedirects(z1);
        httpURLConnection0.setDoOutput(false);
        httpURLConnection0.setRequestMethod("GET");
        httpURLConnection0.connect();
        return httpURLConnection0;
    }

    private final URL zzl(URL uRL0, String s, zzgn zzgn0) {
        URL uRL1;
        if(s == null) {
            throw new zzhb("Null location redirect", zzgn0, 2001, 1);
        }
        try {
            uRL1 = new URL(uRL0, s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new zzhb(malformedURLException0, zzgn0, 2001, 1);
        }
        String s1 = uRL1.getProtocol();
        if(!"https".equals(s1) && !"http".equals(s1)) {
            throw new zzhb("Unsupported protocol redirect: " + s1, zzgn0, 2001, 1);
        }
        if(!this.zzb && !s1.equals(uRL0.getProtocol())) {
            throw new zzhb("Disallowed cross-protocol redirect (" + uRL0.getProtocol() + " to " + s1 + ")", zzgn0, 2001, 1);
        }
        return uRL1;
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection0 = this.zzi;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzes.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", exception0);
            }
            this.zzi = null;
        }
    }
}

