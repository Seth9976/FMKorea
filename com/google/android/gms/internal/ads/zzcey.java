package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzcey extends zzgc implements zzhf {
    private static final Pattern zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhe zzf;
    private zzgn zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    static {
        zzcey.zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    }

    zzcey(String s, zzhk zzhk0, int v, int v1, long v2, long v3) {
        super(true);
        zzdy.zzc(s);
        this.zze = s;
        this.zzf = new zzhe();
        this.zzc = v;
        this.zzd = v1;
        this.zzi = new ArrayDeque();
        this.zzr = v2;
        this.zzs = v3;
        if(zzhk0 != null) {
            this.zzf(zzhk0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] arr_b, int v, int v1) {
        if(v1 == 0) {
            return 0;
        }
        try {
            long v2 = this.zzn;
            if(Long.compare(this.zzm - v2, 0L) == 0) {
                return -1;
            }
            long v3 = this.zzs;
            long v4 = this.zzq;
            if(this.zzo + v2 + ((long)v1) + v3 > v4 + 1L) {
                long v5 = this.zzp;
                if(v4 < v5) {
                    long v6 = Math.min(v5, Math.max(this.zzr + (v4 + 1L) - v3 - 1L, -1L + (v4 + 1L + ((long)v1))));
                    this.zzk(v4 + 1L, v6, 2);
                    this.zzq = v6;
                    v4 = v6;
                }
            }
            int v7 = this.zzj.read(arr_b, v, ((int)Math.min(v1, v4 + 1L - this.zzo - this.zzn)));
            if(v7 == -1) {
                throw new EOFException();
            }
            this.zzn += (long)v7;
            this.zzg(v7);
            return v7;
        }
        catch(IOException iOException0) {
        }
        throw new zzhb(iOException0, this.zzg, 2000, 2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final long zzb(zzgn zzgn0) {
        long v2;
        long v1;
        long v;
        this.zzg = zzgn0;
        this.zzn = 0L;
        this.zzo = zzgn0.zzf;
        HttpURLConnection httpURLConnection0 = this.zzk(zzgn0.zzf, (zzgn0.zzg == -1L ? this.zzr : Math.min(this.zzr, zzgn0.zzg)) + zzgn0.zzf - 1L, 1);
        this.zzh = httpURLConnection0;
        String s = httpURLConnection0.getHeaderField("Content-Range");
        if(!TextUtils.isEmpty(s)) {
            Matcher matcher0 = zzcey.zzb.matcher(s);
            if(matcher0.find()) {
                try {
                    Long.parseLong(matcher0.group(1));
                    v = Long.parseLong(matcher0.group(2));
                    v1 = Long.parseLong(matcher0.group(3));
                    v2 = zzgn0.zzg;
                }
                catch(NumberFormatException unused_ex) {
                    zzcaa.zzg(("Unexpected Content-Range [" + s + "]"));
                    throw new zzcew(s, zzgn0);
                }
                if(v2 == -1L) {
                    this.zzm = v1 - this.zzo;
                    this.zzp = v1 - 1L;
                }
                else {
                    this.zzm = v2;
                    this.zzp = Math.max(v, this.zzo + v2 - 1L);
                }
                this.zzq = v;
                this.zzk = true;
                this.zzj(zzgn0);
                return this.zzm;
            }
        }
        throw new zzcew(s, zzgn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final Uri zzc() {
        return this.zzh == null ? null : Uri.parse(this.zzh.getURL().toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzgi
    public final void zzd() {
        try {
            InputStream inputStream0 = this.zzj;
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new zzhb(iOException0, this.zzg, 2000, 3);
                }
            }
        }
        finally {
            this.zzj = null;
            this.zzl();
            if(this.zzk) {
                this.zzk = false;
                this.zzh();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzhf
    public final Map zze() {
        return this.zzh == null ? null : this.zzh.getHeaderFields();
    }

    final HttpURLConnection zzk(long v, long v1, int v2) {
        HttpURLConnection httpURLConnection0;
        String s = this.zzg.zza.toString();
        try {
            httpURLConnection0 = (HttpURLConnection)new URL(s).openConnection();
            httpURLConnection0.setConnectTimeout(this.zzc);
            httpURLConnection0.setReadTimeout(this.zzd);
            for(Object object0: this.zzf.zza().entrySet()) {
                httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpURLConnection0.setRequestProperty("Range", "bytes=" + v + "-" + v1);
            httpURLConnection0.setRequestProperty("User-Agent", this.zze);
            httpURLConnection0.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.connect();
            this.zzi.add(httpURLConnection0);
        }
        catch(IOException iOException0) {
            throw new zzhb("Unable to connect to " + s, iOException0, this.zzg, 2000, v2);
        }
        String s1 = this.zzg.zza.toString();
        try {
            int v3 = httpURLConnection0.getResponseCode();
            this.zzl = v3;
        }
        catch(IOException iOException1) {
            this.zzl();
            throw new zzhb("Unable to connect to " + s1, iOException1, this.zzg, 2000, v2);
        }
        if(v3 >= 200 && v3 <= 299) {
            try {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                if(this.zzj != null) {
                    inputStream0 = new SequenceInputStream(this.zzj, inputStream0);
                }
                this.zzj = inputStream0;
                return httpURLConnection0;
            }
            catch(IOException iOException2) {
            }
            this.zzl();
            throw new zzhb(iOException2, this.zzg, 2000, v2);
        }
        Map map0 = httpURLConnection0.getHeaderFields();
        this.zzl();
        throw new zzcex(this.zzl, map0, this.zzg, v2);
    }

    private final void zzl() {
        while(!this.zzi.isEmpty()) {
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)this.zzi.remove();
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                zzcaa.zzh("Unexpected error while disconnecting", exception0);
            }
        }
        this.zzh = null;
    }
}

