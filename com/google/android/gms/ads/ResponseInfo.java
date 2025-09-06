package com.google.android.gms.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ResponseInfo {
    private final zzdn zza;
    private final List zzb;
    private AdapterResponseInfo zzc;

    private ResponseInfo(zzdn zzdn0) {
        zzu zzu0;
        this.zza = zzdn0;
        this.zzb = new ArrayList();
        if(zzdn0 != null) {
            try {
                List list0 = zzdn0.zzj();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", remoteException0);
                goto label_17;
            }
            if(list0 != null) {
                for(Object object0: list0) {
                    AdapterResponseInfo adapterResponseInfo0 = AdapterResponseInfo.zza(((zzu)object0));
                    if(adapterResponseInfo0 != null) {
                        this.zzb.add(adapterResponseInfo0);
                    }
                }
            }
        }
    label_17:
        zzdn zzdn1 = this.zza;
        if(zzdn1 != null) {
            try {
                zzu0 = zzdn1.zzf();
            }
            catch(RemoteException remoteException1) {
                zzcaa.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", remoteException1);
                return;
            }
            if(zzu0 != null) {
                this.zzc = AdapterResponseInfo.zza(zzu0);
            }
        }
    }

    public List getAdapterResponses() {
        return this.zzb;
    }

    public AdapterResponseInfo getLoadedAdapterResponseInfo() {
        return this.zzc;
    }

    public String getMediationAdapterClassName() {
        zzdn zzdn0 = this.zza;
        if(zzdn0 != null) {
            try {
                return zzdn0.zzg();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", remoteException0);
            }
        }
        return null;
    }

    public Bundle getResponseExtras() {
        zzdn zzdn0 = this.zza;
        if(zzdn0 != null) {
            try {
                return zzdn0.zze();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Could not forward getResponseExtras to ResponseInfo.", remoteException0);
            }
        }
        return new Bundle();
    }

    public String getResponseId() {
        zzdn zzdn0 = this.zza;
        if(zzdn0 != null) {
            try {
                return zzdn0.zzi();
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("Could not forward getResponseId to ResponseInfo.", remoteException0);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        try {
            return this.zzd().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    public static ResponseInfo zza(zzdn zzdn0) {
        return zzdn0 == null ? null : new ResponseInfo(zzdn0);
    }

    public static ResponseInfo zzb(zzdn zzdn0) {
        return new ResponseInfo(zzdn0);
    }

    public final zzdn zzc() {
        return this.zza;
    }

    public final JSONObject zzd() {
        JSONObject jSONObject0 = new JSONObject();
        String s = this.getResponseId();
        if(s == null) {
            jSONObject0.put("Response ID", "null");
        }
        else {
            jSONObject0.put("Response ID", s);
        }
        String s1 = this.getMediationAdapterClassName();
        if(s1 == null) {
            jSONObject0.put("Mediation Adapter Class Name", "null");
        }
        else {
            jSONObject0.put("Mediation Adapter Class Name", s1);
        }
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.zzb) {
            jSONArray0.put(((AdapterResponseInfo)object0).zzb());
        }
        jSONObject0.put("Adapter Responses", jSONArray0);
        AdapterResponseInfo adapterResponseInfo0 = this.zzc;
        if(adapterResponseInfo0 != null) {
            jSONObject0.put("Loaded Adapter Response", adapterResponseInfo0.zzb());
        }
        Bundle bundle0 = this.getResponseExtras();
        if(bundle0 != null) {
            jSONObject0.put("Response Extras", zzay.zzb().zzh(bundle0));
        }
        return jSONObject0;
    }
}

