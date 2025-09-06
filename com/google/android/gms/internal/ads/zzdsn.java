package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzdsn extends zzbjr {
    private final zzdsq zza;
    private final zzdsl zzb;
    private final Map zzc;

    zzdsn(zzdsq zzdsq0, zzdsl zzdsl0) {
        this.zzc = new HashMap();
        this.zza = zzdsq0;
        this.zzb = zzdsl0;
    }

    // This method was un-flattened
    private static zzl zzc(Map map0) {
        zzm zzm0 = new zzm();
        String s = (String)map0.get("ad_request");
        if(s == null) {
            return zzm0.zza();
        }
        JsonReader jsonReader0 = new JsonReader(new StringReader(Uri.decode(s)));
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                switch(jsonReader0.nextName()) {
                    case "extras": {
                        goto label_10;
                    }
                    case "httpTimeoutMillis": {
                        zzm0.zzc(jsonReader0.nextInt());
                        continue;
                    }
                    case "isTestDevice": {
                        zzm0.zzd(jsonReader0.nextBoolean());
                        continue;
                    }
                    case "keywords": {
                        goto label_27;
                    }
                    case "maxAdContentRating": {
                        goto label_35;
                    }
                    case "tagForChildDirectedTreatment": {
                        goto label_39;
                    }
                    case "tagForUnderAgeOfConsent": {
                        goto label_20;
                    }
                }
                jsonReader0.skipValue();
                continue;
            label_10:
                jsonReader0.beginObject();
                Bundle bundle0 = new Bundle();
                while(jsonReader0.hasNext()) {
                    bundle0.putString(jsonReader0.nextName(), jsonReader0.nextString());
                }
                jsonReader0.endObject();
                zzm0.zzb(bundle0);
                continue;
            label_20:
                if(jsonReader0.nextBoolean()) {
                    zzm0.zzh(1);
                }
                else {
                    zzm0.zzh(0);
                }
                continue;
            label_27:
                jsonReader0.beginArray();
                ArrayList arrayList0 = new ArrayList();
                while(jsonReader0.hasNext()) {
                    arrayList0.add(jsonReader0.nextString());
                }
                jsonReader0.endArray();
                zzm0.zze(arrayList0);
                continue;
            label_35:
                String s1 = jsonReader0.nextString();
                if(RequestConfiguration.zza.contains(s1)) {
                    zzm0.zzf(s1);
                    continue;
                label_39:
                    if(jsonReader0.nextBoolean()) {
                        zzm0.zzg(1);
                    }
                    else {
                        zzm0.zzg(0);
                    }
                }
            }
            jsonReader0.endObject();
        }
        catch(IOException unused_ex) {
            zzcaa.zze("Ad Request json was malformed, parsing ended early.");
        }
        zzl zzl0 = zzm0.zza();
        Bundle bundle1 = zzl0.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle1 == null) {
            bundle1 = zzl0.zzc;
            zzl0.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle1);
        }
        return new zzl(zzl0.zza, zzl0.zzb, bundle1, zzl0.zzd, zzl0.zze, zzl0.zzf, zzl0.zzg, zzl0.zzh, zzl0.zzi, zzl0.zzj, zzl0.zzk, zzl0.zzl, zzl0.zzm, zzl0.zzn, zzl0.zzo, zzl0.zzp, zzl0.zzq, zzl0.zzr, zzl0.zzs, zzl0.zzt, zzl0.zzu, zzl0.zzv, zzl0.zzw, zzl0.zzx);
    }

    @Override  // com.google.android.gms.internal.ads.zzbjs
    public final void zze() {
        this.zzc.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjs
    public final void zzf(String s) {
        long v;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzji)).booleanValue()) {
            return;
        }
        zze.zza(("Received H5 gmsg: " + s));
        Map map0 = zzs.zzM(Uri.parse(s));
        String s1 = (String)map0.get("action");
        if(TextUtils.isEmpty(s1)) {
            zzcaa.zze("H5 gmsg did not contain an action");
            return;
        }
        switch(s1) {
            case "dispose_all": {
                for(Object object0: this.zzc.values()) {
                    ((zzdsg)object0).zza();
                }
                this.zzc.clear();
                return;
            }
            case "initialize": {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            default: {
                String s2 = (String)map0.get("obj_id");
                try {
                    s2.getClass();
                    v = Long.parseLong(s2);
                    switch(s1) {
                        case "create_interstitial_ad": {
                            goto label_39;
                        }
                        case "create_rewarded_ad": {
                            goto label_78;
                        }
                        case "dispose": {
                            goto label_69;
                        }
                        case "load_interstitial_ad": {
                            goto label_62;
                        }
                        case "load_rewarded_ad": {
                            goto label_32;
                        }
                        case "show_interstitial_ad": {
                            goto label_18;
                        }
                        case "show_rewarded_ad": {
                            goto label_25;
                        }
                    }
                }
                catch(NumberFormatException | NullPointerException unused_ex) {
                    zzcaa.zze(("H5 gmsg did not contain a valid object id: " + s2));
                    return;
                }
                zzcaa.zze(("H5 gmsg contained invalid action: " + s1));
                return;
            label_18:
                zzdsg zzdsg0 = (zzdsg)this.zzc.get(v);
                if(zzdsg0 == null) {
                    zzcaa.zze("Could not show H5 ad, object ID does not exist");
                    this.zzb.zzf(v);
                    return;
                }
                zzdsg0.zzc();
                return;
            label_25:
                zzdsg zzdsg1 = (zzdsg)this.zzc.get(v);
                if(zzdsg1 == null) {
                    zzcaa.zze("Could not show H5 ad, object ID does not exist");
                    this.zzb.zzq(v);
                    return;
                }
                zzdsg1.zzc();
                return;
            label_32:
                zzdsg zzdsg2 = (zzdsg)this.zzc.get(v);
                if(zzdsg2 == null) {
                    zzcaa.zze("Could not load H5 ad, object ID does not exist");
                    this.zzb.zzq(v);
                    return;
                }
                zzdsg2.zzb(zzdsn.zzc(map0));
                return;
            label_39:
                int v1 = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzjj)));
                if(this.zzc.size() >= v1) {
                    zzcaa.zzj("Could not create H5 ad, too many existing objects");
                    this.zzb.zzi(v);
                    return;
                }
                Long long0 = v;
                if(this.zzc.containsKey(long0)) {
                    zzcaa.zze("Could not create H5 ad, object ID already exists");
                    this.zzb.zzi(v);
                    return;
                }
                String s3 = (String)map0.get("ad_unit");
                if(TextUtils.isEmpty(s3)) {
                    zzcaa.zzj("Could not create H5 ad, missing ad unit id");
                    this.zzb.zzi(v);
                    return;
                }
                zzdsh zzdsh0 = this.zza.zzb();
                zzdsh0.zzb(v);
                zzdsh0.zza(s3);
                zzdss zzdss0 = zzdsh0.zzc().zza();
                this.zzc.put(long0, zzdss0);
                this.zzb.zzh(v);
                zze.zza(("Created H5 interstitial #" + v + " with ad unit " + s3));
                return;
            label_62:
                zzdsg zzdsg3 = (zzdsg)this.zzc.get(v);
                if(zzdsg3 == null) {
                    zzcaa.zze("Could not load H5 ad, object ID does not exist");
                    this.zzb.zzf(v);
                    return;
                }
                zzdsg3.zzb(zzdsn.zzc(map0));
                return;
            label_69:
                Long long1 = v;
                zzdsg zzdsg4 = (zzdsg)this.zzc.get(long1);
                if(zzdsg4 == null) {
                    zzcaa.zze("Could not dispose H5 ad, object ID does not exist");
                    return;
                }
                zzdsg4.zza();
                this.zzc.remove(long1);
                zze.zza(("Disposed H5 ad #" + v));
                return;
            label_78:
                int v2 = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzjj)));
                if(this.zzc.size() >= v2) {
                    zzcaa.zzj("Could not create H5 ad, too many existing objects");
                    this.zzb.zzi(v);
                    return;
                }
                Long long2 = v;
                if(this.zzc.containsKey(long2)) {
                    zzcaa.zze("Could not create H5 ad, object ID already exists");
                    this.zzb.zzi(v);
                    return;
                }
                String s4 = (String)map0.get("ad_unit");
                if(TextUtils.isEmpty(s4)) {
                    zzcaa.zzj("Could not create H5 ad, missing ad unit id");
                    this.zzb.zzi(v);
                    return;
                }
                zzdsh zzdsh1 = this.zza.zzb();
                zzdsh1.zzb(v);
                zzdsh1.zza(s4);
                zzdsw zzdsw0 = zzdsh1.zzc().zzb();
                this.zzc.put(long2, zzdsw0);
                this.zzb.zzh(v);
                zze.zza(("Created H5 rewarded #" + v + " with ad unit " + s4));
            }
        }
    }
}

