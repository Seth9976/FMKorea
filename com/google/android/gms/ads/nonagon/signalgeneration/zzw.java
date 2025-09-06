package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfya;
import org.json.JSONException;
import org.json.JSONObject;

final class zzw implements zzfya {
    final d zza;
    final zzbyv zzb;
    final zzbyo zzc;
    final zzfhg zzd;
    final long zze;
    final zzaa zzf;

    zzw(zzaa zzaa0, d d0, zzbyv zzbyv0, zzbyo zzbyo0, zzfhg zzfhg0, long v) {
        this.zzf = zzaa0;
        this.zza = d0;
        this.zzb = zzbyv0;
        this.zzc = zzbyo0;
        this.zzd = zzfhg0;
        this.zze = v;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable throwable0) {
        long v = zzt.zzB().currentTimeMillis();
        String s = throwable0.getMessage();
        zzt.zzo().zzu(throwable0, "SignalGeneratorImpl.generateSignals");
        zzf.zzc(this.zzf.zzr, this.zzf.zzj, "sgf", new Pair[]{new Pair("sgf_reason", s), new Pair("tqgt", String.valueOf(v - this.zze))});
        zzfhr zzfhr0 = zzaa.zzr(this.zza, this.zzb);
        if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
            this.zzd.zzg(throwable0);
            this.zzd.zzf(false);
            zzfhr0.zza(this.zzd);
            zzfhr0.zzg();
        }
        try {
            this.zzc.zzb("Internal error. " + s);
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object object0) {
        JSONObject jSONObject0;
        zzam zzam0 = (zzam)object0;
        zzfhr zzfhr0 = zzaa.zzr(this.zza, this.zzb);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            long v = zzt.zzB().currentTimeMillis() - this.zze;
            if(zzam0 == null) {
                try {
                    this.zzc.zzc(null, null, null);
                    Pair[] arr_pair = {new Pair("rid", "-1")};
                    zzf.zzc(this.zzf.zzr, this.zzf.zzj, "sgs", arr_pair);
                    this.zzd.zzf(true);
                }
                catch(RemoteException remoteException1) {
                    goto label_75;
                }
                catch(Throwable throwable0) {
                    goto label_84;
                }
                if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                    zzfhr0.zza(this.zzd);
                    zzfhr0.zzg();
                }
            }
            else {
                try {
                    try {
                        jSONObject0 = new JSONObject(zzam0.zzb);
                        goto label_37;
                    }
                    catch(JSONException jSONException0) {
                    }
                    zzcaa.zzj("Failed to create JSON object from the request string.");
                    this.zzc.zzb("Internal error for request JSON: " + jSONException0.toString());
                    Pair[] arr_pair1 = {new Pair("sgf_reason", "request_invalid")};
                    zzf.zzc(this.zzf.zzr, this.zzf.zzj, "sgf", arr_pair1);
                    this.zzd.zzg(jSONException0);
                    this.zzd.zzf(false);
                    zzt.zzo().zzu(jSONException0, "SignalGeneratorImpl.generateSignals.onSuccess");
                }
                catch(RemoteException remoteException1) {
                    goto label_75;
                }
                catch(Throwable throwable0) {
                    goto label_84;
                }
                if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                    zzfhr0.zza(this.zzd);
                    zzfhr0.zzg();
                    return;
                    try {
                    label_37:
                        String s = jSONObject0.optString("request_id", "");
                        if(TextUtils.isEmpty(s)) {
                            goto label_67;
                        }
                        else {
                            zzaa.zzG(this.zzf, s, zzam0.zzb, this.zzf.zzj);
                            Bundle bundle0 = zzam0.zzc;
                            if(this.zzf.zzw && bundle0 != null && bundle0.getInt(this.zzf.zzy, -1) == -1) {
                                bundle0.putInt(this.zzf.zzy, this.zzf.zzz.get());
                            }
                            if(this.zzf.zzv && bundle0 != null && TextUtils.isEmpty(bundle0.getString(this.zzf.zzx))) {
                                if(TextUtils.isEmpty(this.zzf.zzB)) {
                                    String s1 = zzt.zzp().zzc(this.zzf.zzg, this.zzf.zzA.zza);
                                    this.zzf.zzB = s1;
                                }
                                bundle0.putString(this.zzf.zzx, this.zzf.zzB);
                            }
                            this.zzc.zzc(zzam0.zza, zzam0.zzb, bundle0);
                            zzdrm zzdrm0 = this.zzf.zzr;
                            zzdrc zzdrc0 = this.zzf.zzj;
                            Pair pair0 = new Pair("tqgt", String.valueOf(v));
                            String s2 = "na";
                            if(((Boolean)zzba.zzc().zzb(zzbbr.zzjg)).booleanValue()) {
                                try {
                                    s2 = jSONObject0.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    goto label_61;
                                }
                                catch(JSONException jSONException1) {
                                }
                                zzcaa.zzh("Error retrieving JSONObject from the requestJson, ", jSONException1);
                            }
                        label_61:
                            zzf.zzc(zzdrm0, zzdrc0, "sgs", new Pair[]{pair0, new Pair("tpc", s2)});
                            this.zzd.zzf(true);
                            goto label_63;
                        }
                        return;
                    }
                    catch(RemoteException remoteException1) {
                        goto label_75;
                    }
                    catch(Throwable throwable0) {
                        goto label_84;
                    }
                label_63:
                    if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                        zzfhr0.zza(this.zzd);
                        zzfhr0.zzg();
                        return;
                        try {
                            try {
                            label_67:
                                zzcaa.zzj("The request ID is empty in request JSON.");
                                this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                                Pair[] arr_pair2 = {new Pair("sgf_reason", "rid_missing")};
                                zzf.zzc(this.zzf.zzr, this.zzf.zzj, "sgf", arr_pair2);
                                this.zzd.zzc("Request ID empty");
                                this.zzd.zzf(false);
                                goto label_88;
                            }
                            catch(RemoteException remoteException1) {
                            }
                        label_75:
                            this.zzd.zzg(remoteException1);
                            this.zzd.zzf(false);
                            zzcaa.zzh("", remoteException1);
                            zzt.zzo().zzu(remoteException1, "SignalGeneratorImpl.generateSignals.onSuccess");
                        }
                        catch(Throwable throwable0) {
                            goto label_84;
                        }
                        if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                            zzfhr0.zza(this.zzd);
                            zzfhr0.zzg();
                            return;
                        label_84:
                            if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                                zzfhr0.zza(this.zzd);
                                zzfhr0.zzg();
                            }
                            throw throwable0;
                        label_88:
                            if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                                zzfhr0.zza(this.zzd);
                                zzfhr0.zzg();
                            }
                        }
                    }
                }
            }
        }
        else {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzg(("QueryInfo generation has been disabled." + remoteException0.toString()));
            }
            if(((Boolean)zzbdd.zze.zze()).booleanValue() && zzfhr0 != null) {
                this.zzd.zzc("QueryInfo generation has been disabled.");
                this.zzd.zzf(false);
                zzfhr0.zza(this.zzd);
                zzfhr0.zzg();
            }
        }
    }
}

