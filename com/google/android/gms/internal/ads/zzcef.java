package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

final class zzcef extends zzgc implements zzhf {
    private static final Pattern zzb;
    private static final AtomicReference zzc;
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzhe zzh;
    private zzgn zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    static {
        zzcef.zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
        zzcef.zzc = new AtomicReference();
    }

    zzcef(String s, zzhk zzhk0, int v, int v1, int v2) {
        super(true);
        this.zzd = new zzcee(this);
        this.zzs = new HashSet();
        zzdy.zzc(s);
        this.zzg = s;
        this.zzh = new zzhe();
        this.zze = v;
        this.zzf = v1;
        this.zzr = v2;
        if(zzhk0 != null) {
            this.zzf(zzhk0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        try {
            int v2 = 0;
            if(Long.compare(this.zzp, this.zzn) != 0) {
                byte[] arr_b1 = (byte[])zzcef.zzc.getAndSet(null);
                if(arr_b1 == null) {
                    arr_b1 = new byte[0x1000];
                }
                while(true) {
                    long v3 = this.zzp;
                    long v4 = this.zzn;
                    if(v3 == v4) {
                        break;
                    }
                    int v5 = this.zzk.read(arr_b1, 0, ((int)Math.min(v4 - v3, arr_b1.length)));
                    if(Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if(v5 == -1) {
                        throw new EOFException();
                    }
                    this.zzp += (long)v5;
                    this.zzg(v5);
                }
                zzcef.zzc.set(arr_b1);
            }
            if(v1 != 0) {
                long v6 = this.zzo;
                if(v6 != -1L) {
                    long v7 = v6 - this.zzq;
                    if(v7 == 0L) {
                        return -1;
                    }
                    v1 = (int)Math.min(v1, v7);
                }
                v2 = this.zzk.read(arr_b, v, v1);
                if(v2 == -1) {
                    if(this.zzo != -1L) {
                        throw new EOFException();
                    }
                    return -1;
                }
                this.zzq += (long)v2;
                this.zzg(v2);
            }
            return v2;
        }
        catch(IOException iOException0) {
        }
        throw new zzhb(iOException0, this.zzi, 2000, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        long v7;
        long v5;
        long v3;
        HttpURLConnection httpURLConnection0;
        try {
            this.zzi = zzgn0;
            this.zzq = 0L;
            this.zzp = 0L;
            URL uRL0 = new URL(zzgn0.zza.toString());
            long v = zzgn0.zzf;
            long v1 = zzgn0.zzg;
            boolean z = zzgn0.zza(1);
            int v2 = 0;
        alab1:
            while(true) {
                if(v2 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + (v2 + 1));
                }
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                if(httpURLConnection0 instanceof HttpsURLConnection) {
                    ((HttpsURLConnection)httpURLConnection0).setSSLSocketFactory(this.zzd);
                }
                httpURLConnection0.setConnectTimeout(this.zze);
                httpURLConnection0.setReadTimeout(this.zzf);
                Iterator iterator0 = this.zzh.zza().entrySet().iterator();
                while(true) {
                    v3 = -1L;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                if(Long.compare(v, 0L) != 0) {
                    httpURLConnection0.setRequestProperty("Range", (v1 == -1L ? "bytes=" + v + "-" : "bytes=" + v + "-" + (v + v1 - 1L)));
                }
                else if(v1 != -1L) {
                    httpURLConnection0.setRequestProperty("Range", (v1 == -1L ? "bytes=" + 0L + "-" : "bytes=" + 0L + "-" + (v1 - 1L)));
                }
                httpURLConnection0.setRequestProperty("User-Agent", this.zzg);
                if(!z) {
                    httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection0.setInstanceFollowRedirects(false);
                httpURLConnection0.setDoOutput(false);
                httpURLConnection0.connect();
                switch(httpURLConnection0.getResponseCode()) {
                    case 300: 
                    case 301: 
                    case 302: 
                    case 303: 
                    case 307: 
                    case 308: {
                        String s = httpURLConnection0.getHeaderField("Location");
                        httpURLConnection0.disconnect();
                        if(s == null) {
                            throw new ProtocolException("Null location redirect");
                        }
                        URL uRL1 = new URL(uRL0, s);
                        String s1 = uRL1.getProtocol();
                        if(!"https".equals(s1) && !"http".equals(s1)) {
                            throw new ProtocolException("Unsupported protocol redirect: " + s1);
                        }
                        uRL0 = uRL1;
                        ++v2;
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
            this.zzj = httpURLConnection0;
        }
        catch(IOException iOException0) {
            throw new zzhb("Unable to connect to " + zzgn0.zza.toString(), iOException0, zzgn0, 2000, 1);
        }
        try {
            int v4 = httpURLConnection0.getResponseCode();
            this.zzm = v4;
        }
        catch(IOException iOException1) {
            this.zzn();
            throw new zzhb("Unable to connect to " + zzgn0.zza.toString(), iOException1, zzgn0, 2000, 1);
        }
        if(v4 >= 200 && v4 <= 299) {
            if(v4 == 200) {
                v5 = zzgn0.zzf;
                if(v5 == 0L) {
                    v5 = 0L;
                }
            }
            else {
                v5 = 0L;
            }
            this.zzn = v5;
            if(zzgn0.zza(1)) {
                this.zzo = zzgn0.zzg;
            }
            else {
                long v6 = zzgn0.zzg;
                if(v6 == -1L) {
                    HttpURLConnection httpURLConnection1 = this.zzj;
                    String s2 = httpURLConnection1.getHeaderField("Content-Length");
                    if(TextUtils.isEmpty(s2)) {
                        v7 = -1L;
                    }
                    else {
                        try {
                            v7 = Long.parseLong(s2);
                        }
                        catch(NumberFormatException unused_ex) {
                            zzcaa.zzg(("Unexpected Content-Length [" + s2 + "]"));
                            v7 = -1L;
                        }
                    }
                    String s3 = httpURLConnection1.getHeaderField("Content-Range");
                    if(!TextUtils.isEmpty(s3)) {
                        Matcher matcher0 = zzcef.zzb.matcher(s3);
                        if(matcher0.find()) {
                            try {
                                long v8 = Long.parseLong(matcher0.group(2)) - Long.parseLong(matcher0.group(1)) + 1L;
                                if(Long.compare(v7, 0L) < 0) {
                                    v7 = v8;
                                }
                                else if(v7 != v8) {
                                    zzcaa.zzj(("Inconsistent headers [" + s2 + "] [" + s3 + "]"));
                                    v7 = Math.max(v7, v8);
                                }
                            }
                            catch(NumberFormatException unused_ex) {
                                zzcaa.zzg(("Unexpected Content-Range [" + s3 + "]"));
                            }
                        }
                    }
                    if(v7 != -1L) {
                        v3 = v7 - this.zzn;
                    }
                    this.zzo = v3;
                }
                else {
                    this.zzo = v6;
                }
            }
            try {
                this.zzk = this.zzj.getInputStream();
            }
            catch(IOException iOException2) {
                this.zzn();
                throw new zzhb(iOException2, zzgn0, 2000, 1);
            }
            this.zzl = true;
            this.zzj(zzgn0);
            return this.zzo;
        }
        Map map0 = this.zzj.getHeaderFields();
        this.zzn();
        zzhd zzhd0 = new zzhd(this.zzm, null, null, map0, zzgn0, zzfk.zzf);
        if(this.zzm == 0x1A0) {
            zzhd0.initCause(new zzgj(2008));
        }
        throw zzhd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzj == null ? null : Uri.parse(this.zzj.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            if(this.zzk != null) {
                HttpURLConnection httpURLConnection0 = this.zzj;
                long v1 = this.zzo == -1L ? this.zzo : this.zzo - this.zzq;
                if(zzfk.zza == 19 || zzfk.zza == 20) {
                    try {
                        InputStream inputStream0 = httpURLConnection0.getInputStream();
                        if(v1 != -1L) {
                            if(v1 > 0x800L) {
                            label_10:
                                String s = inputStream0.getClass().getName();
                                if(s.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || s.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                                    Method method0 = inputStream0.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                                    method0.setAccessible(true);
                                    method0.invoke(inputStream0, null);
                                }
                            }
                        }
                        else if(inputStream0.read() != -1) {
                            goto label_10;
                        }
                    }
                    catch(Exception unused_ex) {
                    }
                }
                try {
                    this.zzk.close();
                }
                catch(IOException iOException0) {
                    throw new zzhb(iOException0, this.zzi, 2000, 3);
                }
            }
        }
        finally {
            this.zzk = null;
            this.zzn();
            if(this.zzl) {
                this.zzl = false;
                this.zzh();
            }
            this.zzs.clear();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzhf
    public final Map zze() {
        return this.zzj == null ? null : this.zzj.getHeaderFields();
    }

    static int zzk(zzcef zzcef0) {
        return zzcef0.zzr;
    }

    static void zzl(zzcef zzcef0, Socket socket0) {
        zzcef0.zzs.add(socket0);
    }

    final void zzm(int v) {
        this.zzr = v;
        for(Object object0: this.zzs) {
            Socket socket0 = (Socket)object0;
            if(!socket0.isClosed()) {
                try {
                    socket0.setReceiveBufferSize(this.zzr);
                }
                catch(SocketException socketException0) {
                    zzcaa.zzk("Failed to update receive buffer size.", socketException0);
                }
            }
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection0 = this.zzj;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzcaa.zzh("Unexpected error while disconnecting", exception0);
            }
            this.zzj = null;
        }
    }
}

