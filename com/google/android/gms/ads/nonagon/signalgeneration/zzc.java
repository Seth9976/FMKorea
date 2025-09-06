package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzc {
    private final int zza;
    private final long zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final Map zze;
    private final ArrayDeque zzf;
    private final ArrayDeque zzg;
    private final zzdrm zzh;
    private Map zzi;

    public zzc(zzdrm zzdrm0) {
        this.zzf = new ArrayDeque();
        this.zzg = new ArrayDeque();
        this.zzh = zzdrm0;
        this.zza = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzgQ)));
        this.zzb = (long)(((Long)zzba.zzc().zzb(zzbbr.zzgR)));
        this.zzc = ((Boolean)zzba.zzc().zzb(zzbbr.zzgW)).booleanValue();
        this.zzd = ((Boolean)zzba.zzc().zzb(zzbbr.zzgU)).booleanValue();
        this.zze = Collections.synchronizedMap(new zzb(this));
    }

    static int zza(zzc zzc0) {
        return zzc0.zza;
    }

    public final String zzb(String s, zzdrc zzdrc0) {
        synchronized(this) {
            Pair pair0 = (Pair)this.zze.get(s);
            zzdrc0.zza().put("rid", s);
            if(pair0 != null) {
                String s1 = (String)pair0.second;
                this.zze.remove(s);
                zzdrc0.zza().put("mhit", "true");
                return s1;
            }
            zzdrc0.zza().put("mhit", "false");
            return null;
        }
    }

    static ArrayDeque zzc(zzc zzc0) {
        return zzc0.zzf;
    }

    public final void zzd(String s, String s1, zzdrc zzdrc0) {
        synchronized(this) {
            Pair pair0 = new Pair(zzt.zzB().currentTimeMillis(), s1);
            this.zze.put(s, pair0);
            this.zzi();
            this.zzg(zzdrc0);
        }
    }

    // 检测为 Lambda 实现
    final void zze(zzdrc zzdrc0, ArrayDeque arrayDeque0, ArrayDeque arrayDeque1) [...]

    public final void zzf(String s) {
        synchronized(this) {
            this.zze.remove(s);
        }
    }

    private final void zzg(zzdrc zzdrc0) {
        synchronized(this) {
            if(!this.zzc) {
                return;
            }
            ArrayDeque arrayDeque0 = this.zzg.clone();
            this.zzg.clear();
            ArrayDeque arrayDeque1 = this.zzf.clone();
            this.zzf.clear();
            zza zza0 = () -> {
                this.zzh(zzdrc0, arrayDeque0, "to");
                this.zzh(zzdrc0, arrayDeque1, "of");
            };
            zzcan.zza.execute(zza0);
        }
    }

    private final void zzh(zzdrc zzdrc0, ArrayDeque arrayDeque0, String s) {
        Pair pair1;
        while(!arrayDeque0.isEmpty()) {
            Pair pair0 = (Pair)arrayDeque0.poll();
            ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap(zzdrc0.zza());
            this.zzi = concurrentHashMap0;
            concurrentHashMap0.put("action", "ev");
            this.zzi.put("e_r", s);
            this.zzi.put("e_id", ((String)pair0.first));
            if(this.zzd) {
                String s1 = (String)pair0.second;
                try {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    String s2 = jSONObject0.getString("request_agent");
                    pair1 = new Pair(zzf.zza(jSONObject0.getJSONObject("extras").getString("query_info_type")), s2);
                }
                catch(JSONException unused_ex) {
                    pair1 = new Pair("", "");
                }
                zzc.zzj(this.zzi, "e_type", ((String)pair1.first));
                zzc.zzj(this.zzi, "e_agent", ((String)pair1.second));
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final void zzi() {
        synchronized(this) {
            long v1 = zzt.zzB().currentTimeMillis();
            Set set0 = this.zze.entrySet();
            try {
                Iterator iterator0 = set0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(v1 - ((long)(((Long)((Pair)((Map.Entry)object0).getValue()).first))) <= this.zzb) {
                        break;
                    }
                    Pair pair0 = new Pair(((String)((Map.Entry)object0).getKey()), ((String)((Pair)((Map.Entry)object0).getValue()).second));
                    this.zzg.add(pair0);
                    iterator0.remove();
                }
            }
            catch(ConcurrentModificationException concurrentModificationException0) {
                zzt.zzo().zzu(concurrentModificationException0, "QueryJsonMap.removeExpiredEntries");
            }
        }
    }

    private static final void zzj(Map map0, String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            map0.put(s, s1);
        }
    }
}

