package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdum implements zzo, zzcgt {
    private final Context zza;
    private final zzcag zzb;
    private zzdue zzc;
    private zzcfi zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private zzda zzh;
    private boolean zzi;

    zzdum(Context context0, zzcag zzcag0) {
        this.zza = context0;
        this.zzb = zzcag0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgt
    public final void zza(boolean z, int v, String s, String s1) {
        synchronized(this) {
            if(z) {
                zze.zza("Ad inspector loaded.");
                this.zze = true;
                this.zzk("");
                return;
            }
            zzcaa.zzj("Ad inspector failed to load.");
            try {
                zzt.zzo().zzu(new Exception("Failed to load UI. Error code: " + v + ", Description: " + s + ", Failing URL: " + s1), "InspectorUi.onAdWebViewFinishedLoading 0");
                zzda zzda0 = this.zzh;
                if(zzda0 != null) {
                    zzda0.zze(zzfdb.zzd(17, null, null));
                }
            }
            catch(RemoteException remoteException0) {
                zzt.zzo().zzu(remoteException0, "InspectorUi.onAdWebViewFinishedLoading 1");
            }
            this.zzi = true;
            this.zzd.destroy();
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        synchronized(this) {
            this.zzf = true;
            this.zzk("");
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int v) {
        synchronized(this) {
            this.zzd.destroy();
            if(!this.zzi) {
                zze.zza("Inspector closed.");
                zzda zzda0 = this.zzh;
                if(zzda0 != null) {
                    try {
                        zzda0.zze(null);
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
            }
            this.zzf = false;
            this.zze = false;
            this.zzg = 0L;
            this.zzi = false;
            this.zzh = null;
        }
    }

    public final Activity zzg() {
        return this.zzd == null || this.zzd.zzaz() ? null : this.zzd.zzi();
    }

    public final void zzh(zzdue zzdue0) {
        this.zzc = zzdue0;
    }

    // 检测为 Lambda 实现
    final void zzi(String s) [...]

    public final void zzj(zzda zzda0, zzbjk zzbjk0, zzbjd zzbjd0) {
        zzcfi zzcfi0;
        synchronized(this) {
            if(!this.zzl(zzda0)) {
                return;
            }
            try {
                zzcgx zzcgx0 = zzcgx.zza();
                zzaxe zzaxe0 = zzaxe.zza();
                zzcfi0 = zzcfu.zza(this.zza, zzcgx0, "", false, false, null, null, this.zzb, null, null, null, zzaxe0, null, null, null);
                this.zzd = zzcfi0;
            }
            catch(zzcft zzcft0) {
                zzcaa.zzk("Failed to obtain a web view for the ad inspector", zzcft0);
                try {
                    zzt.zzo().zzu(zzcft0, "InspectorUi.openInspector 0");
                    zzda0.zze(zzfdb.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                }
                catch(RemoteException remoteException0) {
                    zzt.zzo().zzu(remoteException0, "InspectorUi.openInspector 1");
                }
                return;
            }
            zzcgv zzcgv0 = zzcfi0.zzN();
            if(zzcgv0 == null) {
                zzcaa.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    zzt.zzo().zzu(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzda0.zze(zzfdb.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                }
                catch(RemoteException remoteException1) {
                    zzt.zzo().zzu(remoteException1, "InspectorUi.openInspector 3");
                }
                return;
            }
            this.zzh = zzda0;
            zzcgv0.zzM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbjk0, null, new zzbjj(this.zza), zzbjd0, null);
            zzcgv0.zzA(this);
            this.zzd.loadUrl(((String)zzba.zzc().zzb(zzbbr.zziA)));
            AdOverlayInfoParcel adOverlayInfoParcel0 = new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb);
            zzm.zza(this.zza, adOverlayInfoParcel0, true);
            this.zzg = zzt.zzB().currentTimeMillis();
        }
    }

    public final void zzk(String s) {
        synchronized(this) {
            if(this.zze && this.zzf) {
                zzdul zzdul0 = () -> {
                    JSONObject jSONObject0 = this.zzc.zze();
                    if(!TextUtils.isEmpty(s)) {
                        try {
                            jSONObject0.put("redirectUrl", s);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    this.zzd.zzb("window.inspectorInfo", jSONObject0.toString());
                };
                zzcan.zze.execute(zzdul0);
            }
        }
    }

    private final boolean zzl(zzda zzda0) {
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
                zzcaa.zzj("Ad inspector had an internal error.");
                try {
                    zzda0.zze(zzfdb.zzd(16, null, null));
                }
                catch(RemoteException unused_ex) {
                }
                return false;
            }
            if(this.zzc == null) {
                zzcaa.zzj("Ad inspector had an internal error.");
                try {
                    zzt.zzo().zzu(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                    zzda0.zze(zzfdb.zzd(16, null, null));
                }
                catch(RemoteException unused_ex) {
                }
                return false;
            }
            if(!this.zze && !this.zzf && zzt.zzB().currentTimeMillis() >= this.zzg + ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zziC))))))) {
                return true;
            }
            zzcaa.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzda0.zze(zzfdb.zzd(19, null, null));
            }
            catch(RemoteException unused_ex) {
            }
            return false;
        }
    }
}

