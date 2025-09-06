package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;
import jeb.synthetic.FIN;

public class zzame implements zzali {
    protected final zzamg zza;
    @Deprecated
    protected final zzamd zzb;
    private final zzamd zzc;

    public zzame(zzamd zzamd0) {
        zzamg zzamg0 = new zzamg(0x1000);
        super();
        this.zzc = zzamd0;
        this.zzb = zzamd0;
        this.zza = zzamg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzali
    public zzall zza(zzalp zzalp0) {
        zzamr zzamr0;
        byte[] arr_b2;
        byte[] arr_b1;
        int v6;
        zzams zzams0;
        zzamg zzamg0;
        InputStream inputStream0;
        List list0;
        int v4;
        zzamn zzamn0;
        int v3;
        HttpURLConnection httpURLConnection0;
        HashMap hashMap1;
        Map map0;
        boolean z = true;
        long v = SystemClock.elapsedRealtime();
        while(true) {
            Collections.emptyList();
            try {
                zzaky zzaky0 = zzalp0.zzd();
                if(zzaky0 == null) {
                    map0 = Collections.emptyMap();
                }
                else {
                    HashMap hashMap0 = new HashMap();
                    String s = zzaky0.zzb;
                    if(s != null) {
                        hashMap0.put("If-None-Match", s);
                    }
                    long v1 = zzaky0.zzd;
                    if(v1 > 0L) {
                        hashMap0.put("If-Modified-Since", zzamm.zzc(v1));
                    }
                    map0 = hashMap0;
                }
                hashMap1 = new HashMap();
                hashMap1.putAll(map0);
                hashMap1.putAll(zzalp0.zzl());
                URL uRL0 = new URL(zzalp0.zzk());
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection0.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int v2 = zzalp0.zzb();
                httpURLConnection0.setConnectTimeout(v2);
                httpURLConnection0.setReadTimeout(v2);
                httpURLConnection0.setUseCaches(false);
                httpURLConnection0.setDoInput(true);
                "https".equals(uRL0.getProtocol());
            }
            catch(IOException iOException0) {
                goto label_62;
            }
            try {
                for(Object object0: hashMap1.keySet()) {
                    httpURLConnection0.setRequestProperty(((String)object0), ((String)hashMap1.get(((String)object0))));
                }
                if(zzalp0.zza() == 0) {
                    httpURLConnection0.setRequestMethod("GET");
                }
                else {
                    httpURLConnection0.setRequestMethod("POST");
                    byte[] arr_b = zzalp0.zzx();
                    if(arr_b != null) {
                        httpURLConnection0.setDoOutput(true);
                        if(!httpURLConnection0.getRequestProperties().containsKey("Content-Type")) {
                            httpURLConnection0.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                        }
                        DataOutputStream dataOutputStream0 = new DataOutputStream(httpURLConnection0.getOutputStream());
                        dataOutputStream0.write(arr_b);
                        dataOutputStream0.close();
                    }
                }
                v3 = httpURLConnection0.getResponseCode();
                if(v3 == -1) {
                    throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                }
                if((v3 < 100 || v3 >= 200) && (v3 != 204 && v3 != 304)) {
                    goto label_55;
                }
                else {
                    zzamn0 = new zzamn(v3, zzamp.zza(httpURLConnection0.getHeaderFields()), -1, null);
                    goto label_53;
                }
                goto label_64;
            }
            catch(Throwable throwable0) {
                z = false;
                goto label_58;
            }
            try {
            label_53:
                httpURLConnection0.disconnect();
                goto label_64;
            }
            catch(IOException iOException0) {
                goto label_62;
            }
            try {
            label_55:
                zzamn0 = new zzamn(v3, zzamp.zza(httpURLConnection0.getHeaderFields()), httpURLConnection0.getContentLength(), new zzamo(httpURLConnection0));
                goto label_64;
            }
            catch(Throwable throwable0) {
            }
            try {
            label_58:
                if(!z) {
                    httpURLConnection0.disconnect();
                }
                throw throwable0;
            }
            catch(IOException iOException0) {
            label_62:
                zzamn0 = null;
                goto label_121;
            }
            try {
            label_64:
                v4 = zzamn0.zzb();
                list0 = zzamn0.zzd();
                if(v4 == 304) {
                    long v5 = SystemClock.elapsedRealtime() - v;
                    zzaky zzaky1 = zzalp0.zzd();
                    if(zzaky1 == null) {
                        return new zzall(304, null, true, v5, list0);
                    }
                    TreeSet treeSet0 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    if(!list0.isEmpty()) {
                        for(Object object1: list0) {
                            treeSet0.add(((zzalh)object1).zza());
                        }
                    }
                    ArrayList arrayList0 = new ArrayList(list0);
                    List list1 = zzaky1.zzh;
                    if(list1 != null) {
                        if(!list1.isEmpty()) {
                            for(Object object3: zzaky1.zzh) {
                                zzalh zzalh0 = (zzalh)object3;
                                if(!treeSet0.contains(zzalh0.zza())) {
                                    arrayList0.add(zzalh0);
                                }
                            }
                        }
                    }
                    else if(!zzaky1.zzg.isEmpty()) {
                        for(Object object2: zzaky1.zzg.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object2;
                            if(!treeSet0.contains(map$Entry0.getKey())) {
                                arrayList0.add(new zzalh(((String)map$Entry0.getKey()), ((String)map$Entry0.getValue())));
                            }
                        }
                    }
                    return new zzall(304, zzaky1.zza, true, v5, arrayList0);
                }
                inputStream0 = zzamn0.zzc();
                if(inputStream0 == null) {
                    goto label_118;
                }
                else {
                    zzamg0 = this.zza;
                    zzams0 = new zzams(zzamg0, zzamn0.zza());
                    v6 = FIN.finallyOpen$NT();
                    arr_b1 = zzamg0.zzb(0x400);
                    int v7;
                    while((v7 = inputStream0.read(arr_b1)) != -1) {
                        zzams0.write(arr_b1, 0, v7);
                    }
                    arr_b2 = zzams0.toByteArray();
                    goto label_110;
                }
                goto label_123;
            }
            catch(IOException iOException0) {
                goto label_121;
            }
            try {
            label_110:
                FIN.finallyCodeBegin$NT(v6);
                inputStream0.close();
                goto label_114;
            }
            catch(IOException unused_ex) {
                try {
                    zzamb.zzd("Error occurred when closing InputStream", new Object[0]);
                label_114:
                    zzamg0.zza(arr_b1);
                    zzams0.close();
                    FIN.finallyCodeEnd$NT(v6);
                    goto label_123;
                label_118:
                    arr_b2 = new byte[0];
                    goto label_123;
                }
                catch(IOException iOException0) {
                }
            }
        label_121:
            byte[] arr_b3 = null;
            goto label_136;
            try {
            label_123:
                long v8 = SystemClock.elapsedRealtime() - v;
                if(zzamb.zzb || v8 > 3000L) {
                    Long long0 = v8;
                    Integer integer0 = arr_b2 == null ? "null" : ((int)arr_b2.length);
                    zzamb.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[]{zzalp0, long0, integer0, v4, zzalp0.zzy().zza()});
                }
                if(v4 < 200 || v4 > 299) {
                    throw new IOException();
                }
                return new zzall(v4, arr_b2, false, SystemClock.elapsedRealtime() - v, list0);
            label_135:
                arr_b3 = arr_b2;
            }
            catch(IOException iOException0) {
                goto label_135;
            }
        label_136:
            if(iOException0 instanceof SocketTimeoutException) {
                zzamr0 = new zzamr("socket", new zzalx(), null);
            }
            else {
                if(iOException0 instanceof MalformedURLException) {
                    break;
                }
                if(zzamn0 == null) {
                    throw new zzalm(iOException0);
                }
                int v9 = zzamn0.zzb();
                zzamb.zzb("Unexpected response code %d for %s", new Object[]{v9, zzalp0.zzk()});
                if(arr_b3 == null) {
                    zzamr0 = new zzamr("network", new zzalk(), null);
                }
                else {
                    List list2 = zzamn0.zzd();
                    zzall zzall0 = new zzall(v9, arr_b3, false, SystemClock.elapsedRealtime() - v, list2);
                    if(v9 != 401 && v9 != 403) {
                        if(!(v9 >= 400 && v9 <= 0x1F3)) {
                            throw new zzalw(zzall0);
                        }
                        throw new zzalc(zzall0);
                    }
                    zzamr0 = new zzamr("auth", new zzakx(zzall0), null);
                }
            }
            zzald zzald0 = zzalp0.zzy();
            int v10 = zzalp0.zzb();
            try {
                zzald0.zzc(zzamr.zza(zzamr0));
            }
            catch(zzaly zzaly0) {
                zzalp0.zzm(String.format("%s-timeout-giveup [timeout=%s]", zzamr.zzb(zzamr0), v10));
                throw zzaly0;
            }
            zzalp0.zzm(String.format("%s-retry [timeout=%s]", zzamr.zzb(zzamr0), v10));
            z = true;
        }
        throw new RuntimeException("Bad URL " + zzalp0.zzk(), iOException0);
    }
}

