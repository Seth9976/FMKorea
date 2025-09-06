package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdpc {
    private final zzfcu zza;
    private final zzdoz zzb;

    zzdpc(zzfcu zzfcu0, zzdoz zzdoz0) {
        this.zza = zzfcu0;
        this.zzb = zzdoz0;
    }

    final zzbof zza() {
        zzbof zzbof0 = this.zza.zzb();
        if(zzbof0 != null) {
            return zzbof0;
        }
        zzcaa.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqc zzb(String s) {
        zzbqc zzbqc0 = this.zza().zzc(s);
        this.zzb.zze(s, zzbqc0);
        return zzbqc0;
    }

    public final zzfcw zzc(String s, JSONObject jSONObject0) {
        zzfcw zzfcw0;
        zzboi zzboi0;
        try {
            if("com.google.ads.mediation.admob.AdMobAdapter".equals(s)) {
                zzboi0 = new zzbpf(new AdMobAdapter());
            }
            else if("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(s)) {
                zzboi0 = new zzbpf(new zzbqu());
            }
            else {
                zzbof zzbof0 = this.zza();
                if(!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s) && !"com.google.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
                    zzboi0 = zzbof0.zzb(s);
                }
                else {
                    try {
                        String s1 = jSONObject0.getString("class_name");
                        if(zzbof0.zze(s1)) {
                            zzboi0 = zzbof0.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        }
                        else if(zzbof0.zzd(s1)) {
                            zzboi0 = zzbof0.zzb(s1);
                        }
                        else {
                            zzboi0 = zzbof0.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                        zzfcw0 = new zzfcw(zzboi0);
                        goto label_26;
                    }
                    catch(JSONException jSONException0) {
                    }
                    zzcaa.zzh("Invalid custom event.", jSONException0);
                    zzboi0 = zzbof0.zzb(s);
                    zzfcw0 = new zzfcw(zzboi0);
                    goto label_26;
                }
            }
            zzfcw0 = new zzfcw(zzboi0);
            goto label_26;
        }
        catch(Throwable throwable0) {
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
            this.zzb.zzd(s, null);
        }
        throw new zzfcf(throwable0);
    label_26:
        this.zzb.zzd(s, zzfcw0);
        return zzfcw0;
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}

