package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzeac implements zzffh {
    protected final Context zza;
    protected final String zzb;
    protected final zzbuz zzc;

    public zzeac(Context context0, String s, zzbuz zzbuz0, int v) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = zzbuz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffh
    public final Object zza(Object object0) {
        return this.zzb(((zzeaa)object0));
    }

    public final zzeab zzb(zzeaa zzeaa0) {
        String s4;
        InputStreamReader inputStreamReader0;
        URL uRL1;
        zzeab zzeab1;
        int v3;
        zzbzz zzbzz0;
        BufferedOutputStream bufferedOutputStream1;
        BufferedOutputStream bufferedOutputStream0;
        HttpURLConnection httpURLConnection2;
        String s2;
        String s1;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        int v2;
        HashMap hashMap0;
        URL uRL0;
        zzeab zzeab0;
        int v = zzeaa0.zzb;
        Map map0 = zzeaa0.zzc;
        byte[] arr_b = zzeaa0.zzd;
        String s = zzeaa0.zze;
        long v1 = zzt.zzB().elapsedRealtime();
        try {
            zzeab0 = new zzeab();
            zzcaa.zzi(("SDK version: " + this.zzb));
            zzcaa.zze(("AdRequestServiceImpl: Sending request: " + zzeaa0.zza));
            uRL0 = new URL(zzeaa0.zza);
            hashMap0 = new HashMap();
            v2 = 0;
            while(true) {
            label_11:
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
                httpURLConnection1 = httpURLConnection0;
                break;
            }
        }
        catch(IOException iOException0) {
            goto label_109;
        }
        try {
            zzt.zzp().zzf(this.zza, this.zzb, false, httpURLConnection0, false, v);
            Iterator iterator0 = map0.entrySet().iterator();
            while(true) {
            label_15:
                if(!iterator0.hasNext()) {
                    goto label_30;
                }
                Object object0 = iterator0.next();
                s1 = (String)((Map.Entry)object0).getKey();
                s2 = (String)((Map.Entry)object0).getValue();
                httpURLConnection2 = httpURLConnection1;
                goto label_27;
            }
        }
        catch(zzdve zzdve0) {
        }
        catch(Throwable throwable0) {
            httpURLConnection2 = httpURLConnection1;
            goto label_101;
        }
        try {
            httpURLConnection2 = httpURLConnection1;
            goto label_95;
        label_27:
            httpURLConnection2.addRequestProperty(s1, s2);
            httpURLConnection1 = httpURLConnection2;
            goto label_15;
        label_30:
            httpURLConnection2 = httpURLConnection1;
            if(!TextUtils.isEmpty(s)) {
                httpURLConnection2.setRequestProperty("Content-Type", s);
            }
            bufferedOutputStream0 = null;
            if(arr_b.length > 0) {
                httpURLConnection2.setDoOutput(((boolean)1));
                httpURLConnection2.setFixedLengthStreamingMode(arr_b.length);
                goto label_37;
            }
            goto label_48;
        }
        catch(zzdve zzdve0) {
            goto label_95;
        }
        catch(Throwable throwable0) {
            goto label_101;
        }
        try {
        label_37:
            bufferedOutputStream1 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
        }
        catch(Throwable throwable1) {
            try {
                goto label_45;
            }
            catch(zzdve zzdve0) {
                goto label_95;
            }
            catch(Throwable throwable0) {
                goto label_101;
            }
        }
        try {
            bufferedOutputStream1.write(arr_b);
            goto label_47;
        }
        catch(Throwable throwable1) {
            try {
                try {
                    bufferedOutputStream0 = bufferedOutputStream1;
                label_45:
                    IOUtils.closeQuietly(bufferedOutputStream0);
                    throw throwable1;
                label_47:
                    IOUtils.closeQuietly(bufferedOutputStream1);
                label_48:
                    zzbzz0 = new zzbzz(null);
                    zzbzz0.zzc(httpURLConnection2, arr_b);
                    v3 = httpURLConnection2.getResponseCode();
                    for(Object object1: httpURLConnection2.getHeaderFields().entrySet()) {
                        String s3 = (String)((Map.Entry)object1).getKey();
                        List list0 = (List)((Map.Entry)object1).getValue();
                        if(hashMap0.containsKey(s3)) {
                            ((List)hashMap0.get(s3)).addAll(list0);
                        }
                        else {
                            hashMap0.put(s3, new ArrayList(list0));
                        }
                    }
                    zzbzz0.zze(httpURLConnection2, v3);
                    zzeab1 = zzeab0;
                }
                catch(zzdve zzdve0) {
                    goto label_95;
                }
                try {
                    zzeab1.zza = v3;
                    zzeab1.zzb = hashMap0;
                    zzeab1.zzc = "";
                    if(v3 >= 200 && v3 < 300) {
                        try {
                            inputStreamReader0 = new InputStreamReader(httpURLConnection2.getInputStream());
                            s4 = zzs.zzK(inputStreamReader0);
                        }
                        finally {
                            IOUtils.closeQuietly(inputStreamReader0);
                        }
                        zzbzz0.zzg(s4);
                        zzeab1.zzc = s4;
                        if(TextUtils.isEmpty(s4) && !((Boolean)zzba.zzc().zzb(zzbbr.zzfo)).booleanValue()) {
                            throw new zzdve(3);
                        }
                        zzeab1.zzd = zzt.zzB().elapsedRealtime() - v1;
                        goto label_99;
                    }
                    if(v3 < 300 || v3 >= 400) {
                        zzcaa.zzj(("Received error HTTP response code: " + v3));
                        throw new zzdve(1, "Received error HTTP response code: " + v3);
                    }
                    String s5 = httpURLConnection2.getHeaderField("Location");
                    if(TextUtils.isEmpty(s5)) {
                        zzcaa.zzj("No location header to follow redirect.");
                        throw new zzdve(1, "No location header to follow redirect");
                    }
                    uRL1 = new URL(s5);
                    if(v2 + 1 > ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzeQ))))) {
                        zzcaa.zzj("Too many redirects.");
                        throw new zzdve(1, "Too many redirects");
                    }
                    goto label_103;
                }
                catch(zzdve zzdve0) {
                    goto label_96;
                }
                try {
                    goto label_101;
                label_95:
                    zzeab1 = zzeab0;
                }
                catch(zzdve zzdve0) {
                    goto label_95;
                }
            label_96:
                if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhW)).booleanValue()) {
                    throw zzdve0;
                }
                zzeab1.zzd = zzt.zzB().elapsedRealtime() - v1;
            }
            catch(Throwable throwable0) {
                goto label_101;
            }
        }
        try {
        label_99:
            httpURLConnection2.disconnect();
            return zzeab1;
        label_101:
            httpURLConnection2.disconnect();
            throw throwable0;
        label_103:
            httpURLConnection2.disconnect();
            ++v2;
            zzeab0 = zzeab1;
            uRL0 = uRL1;
            goto label_11;
        }
        catch(IOException iOException0) {
        label_109:
            String s6 = "Error while connecting to ad server: " + iOException0.getMessage();
            zzcaa.zzj(s6);
            throw new zzdve(1, s6, iOException0);
        }
    }
}

