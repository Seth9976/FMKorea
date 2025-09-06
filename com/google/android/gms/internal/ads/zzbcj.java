package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

@Deprecated
public final class zzbcj {
    private final List zza;
    private final Map zzb;
    private final Object zzc;

    public zzbcj(boolean z, String s, String s1) {
        this.zza = new LinkedList();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.zzb = linkedHashMap0;
        this.zzc = new Object();
        linkedHashMap0.put("action", "make_wv");
        linkedHashMap0.put("ad_format", s1);
    }

    public final zzbci zza() {
        String s1;
        boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue();
        StringBuilder stringBuilder0 = new StringBuilder();
        HashMap hashMap0 = new HashMap();
        synchronized(this.zzc) {
            for(Object object1: this.zza) {
                long v1 = ((zzbcg)object1).zza();
                String s = ((zzbcg)object1).zzc();
                zzbcg zzbcg0 = ((zzbcg)object1).zzb();
                if(zzbcg0 != null && v1 > 0L) {
                    stringBuilder0.append(s);
                    stringBuilder0.append('.');
                    stringBuilder0.append(v1 - zzbcg0.zza());
                    stringBuilder0.append(',');
                    if(!z) {
                    }
                    else if(hashMap0.containsKey(zzbcg0.zza())) {
                        StringBuilder stringBuilder1 = (StringBuilder)hashMap0.get(zzbcg0.zza());
                        stringBuilder1.append('+');
                        stringBuilder1.append(s);
                    }
                    else {
                        hashMap0.put(zzbcg0.zza(), new StringBuilder(s));
                    }
                }
            }
            this.zza.clear();
            s1 = null;
            if(!TextUtils.isEmpty(null)) {
                stringBuilder0.append(null);
            }
            else if(stringBuilder0.length() > 0) {
                stringBuilder0.setLength(stringBuilder0.length() - 1);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            if(z) {
                for(Object object2: hashMap0.entrySet()) {
                    stringBuilder2.append(((CharSequence)((Map.Entry)object2).getValue()));
                    stringBuilder2.append('.');
                    long v2 = (long)(((Long)((Map.Entry)object2).getKey()));
                    stringBuilder2.append(zzt.zzB().currentTimeMillis() + (v2 - zzt.zzB().elapsedRealtime()));
                    stringBuilder2.append(',');
                }
                if(stringBuilder2.length() > 0) {
                    stringBuilder2.setLength(stringBuilder2.length() - 1);
                }
                s1 = stringBuilder2.toString();
            }
        }
        return new zzbci(stringBuilder0.toString(), s1);
    }

    public final Map zzb() {
        synchronized(this.zzc) {
        }
        return this.zzb;
    }

    public final void zzc(zzbcj zzbcj0) {
        synchronized(this.zzc) {
        }
    }

    public final void zzd(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        zzbbz zzbbz0 = zzt.zzo().zzf();
        if(zzbbz0 == null) {
            return;
        }
        synchronized(this.zzc) {
            String s2 = zzbbz0.zza(s).zza(((String)this.zzb.get(s)), s1);
            this.zzb.put(s, s2);
        }
    }

    public final boolean zze(zzbcg zzbcg0, long v, String[] arr_s) {
        synchronized(this.zzc) {
            for(int v2 = 0; v2 <= 0; ++v2) {
                zzbcg zzbcg1 = new zzbcg(v, arr_s[v2], zzbcg0);
                this.zza.add(zzbcg1);
            }
            return true;
        }
    }

    public static final zzbcg zzf() {
        return new zzbcg(zzt.zzB().elapsedRealtime(), null, null);
    }
}

