package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class zzeds {
    private final List zza;
    private final Map zzb;
    private final String zzc;
    private zzfbi zzd;
    private zzfbe zze;
    private zzu zzf;

    public zzeds(String s) {
        this.zzd = null;
        this.zze = null;
        this.zzf = null;
        this.zzb = Collections.synchronizedMap(new HashMap());
        this.zza = Collections.synchronizedList(new ArrayList());
        this.zzc = s;
    }

    public final zzu zza() {
        return this.zzf;
    }

    public final zzcwb zzb() {
        return new zzcwb(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbe zzfbe0) {
        this.zzi(zzfbe0, this.zza.size());
    }

    public final void zze(zzfbe zzfbe0, long v, zze zze0) {
        this.zzj(zzfbe0, v, zze0, false);
    }

    public final void zzf(zzfbe zzfbe0, long v, zze zze0) {
        this.zzj(zzfbe0, v, null, true);
    }

    public final void zzg(String s, List list0) {
        synchronized(this) {
            if(!this.zzb.containsKey(s)) {
                return;
            }
            zzu zzu0 = (zzu)this.zzb.get(s);
            int v1 = this.zza.indexOf(zzu0);
            try {
                this.zza.remove(v1);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                zzt.zzo().zzu(indexOutOfBoundsException0, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(s);
            for(Object object0: list0) {
                this.zzi(((zzfbe)object0), v1);
                ++v1;
            }
        }
    }

    public final void zzh(zzfbi zzfbi0) {
        this.zzd = zzfbi0;
    }

    private final void zzi(zzfbe zzfbe0, int v) {
        String s5;
        String s4;
        String s3;
        String s2;
        synchronized(this) {
            String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue() ? zzfbe0.zzaq : zzfbe0.zzx;
            if(this.zzb.containsKey(s)) {
                return;
            }
            Bundle bundle0 = new Bundle();
            Iterator iterator0 = zzfbe0.zzw.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                try {
                    bundle0.putString(s1, zzfbe0.zzw.getString(s1));
                }
                catch(JSONException unused_ex) {
                }
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzgG)).booleanValue()) {
                s2 = zzfbe0.zzG;
                s3 = zzfbe0.zzH;
                s4 = zzfbe0.zzI;
                s5 = zzfbe0.zzJ;
            }
            else {
                s2 = "";
                s3 = "";
                s4 = "";
                s5 = "";
            }
            zzu zzu0 = new zzu(zzfbe0.zzF, 0L, null, bundle0, s2, s3, s4, s5);
            try {
                this.zza.add(v, zzu0);
            }
            catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
                zzt.zzo().zzu(indexOutOfBoundsException0, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
            }
            this.zzb.put(s, zzu0);
        }
    }

    private final void zzj(zzfbe zzfbe0, long v, zze zze0, boolean z) {
        String s = ((Boolean)zzba.zzc().zzb(zzbbr.zzdo)).booleanValue() ? zzfbe0.zzaq : zzfbe0.zzx;
        if(!this.zzb.containsKey(s)) {
            return;
        }
        if(this.zze == null) {
            this.zze = zzfbe0;
        }
        zzu zzu0 = (zzu)this.zzb.get(s);
        zzu0.zzb = v;
        zzu0.zzc = zze0;
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgH)).booleanValue() && z) {
            this.zzf = zzu0;
        }
    }
}

