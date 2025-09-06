package com.google.android.gms.ads.internal.util;

import Z1.d;
import android.app.Activity;
import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdud;
import com.google.android.gms.internal.ads.zzdue;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzaw {
    protected String zza;
    private final Object zzb;
    private String zzc;
    private String zzd;
    private boolean zze;
    private boolean zzf;
    private zzdue zzg;

    public zzaw() {
        this.zzb = new Object();
        this.zzc = "";
        this.zzd = "";
        this.zze = false;
        this.zzf = false;
        this.zza = "";
    }

    public final zzdue zza() {
        return this.zzg;
    }

    public final String zzb() [...] // 潜在的解密器

    public final void zzc(Context context0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
            zzdue zzdue0 = this.zzg;
            if(zzdue0 != null) {
                zzdue0.zzh(new zzat(this, context0), zzdud.zzd);
            }
        }
    }

    public final void zzd(Context context0, String s, String s1) {
        zzs.zzR(context0, this.zzp(context0, ((String)zzba.zzc().zzb(zzbbr.zzez)), s, s1));
    }

    public final void zze(Context context0, String s, String s1, String s2) {
        Uri.Builder uri$Builder0 = this.zzp(context0, ((String)zzba.zzc().zzb(zzbbr.zzeC)), s2, s).buildUpon();
        uri$Builder0.appendQueryParameter("debugData", s1);
        zzs.zzI(context0, s, uri$Builder0.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized(this.zzb) {
            this.zzf = z;
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
                zzt.zzo().zzh().zzB(z);
                zzdue zzdue0 = this.zzg;
                if(zzdue0 != null) {
                    zzdue0.zzk(z);
                }
            }
        }
    }

    public final void zzg(zzdue zzdue0) {
        this.zzg = zzdue0;
    }

    public final void zzh(boolean z) {
        synchronized(this.zzb) {
            this.zze = z;
        }
    }

    protected final void zzi(Context context0, String s, boolean z, boolean z1) {
        if(!(context0 instanceof Activity)) {
            zzcaa.zzi("Can not create dialog without Activity Context");
            return;
        }
        zzav zzav0 = new zzav(this, context0, s, z, z1);
        zzs.zza.post(zzav0);
    }

    public final boolean zzj(Context context0, String s, String s1) {
        String s4;
        String s2 = zzaw.zzo(context0, this.zzp(context0, ((String)zzba.zzc().zzb(zzbbr.zzeB)), s, s1).toString(), s1);
        if(TextUtils.isEmpty(s2)) {
            zzcaa.zze("Not linked for debug signals.");
            return false;
        }
        String s3 = s2.trim();
        try {
            s4 = new JSONObject(s3).optString("debug_mode");
        }
        catch(JSONException jSONException0) {
            zzcaa.zzk("Fail to get debug mode response json.", jSONException0);
            return false;
        }
        boolean z = "1".equals(s4);
        this.zzf(z);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
            zzg zzg0 = zzt.zzo().zzh();
            if(!z) {
                s = "";
            }
            zzg0.zzA(s);
        }
        return z;
    }

    final boolean zzk(Context context0, String s, String s1) {
        String s4;
        String s2 = zzaw.zzo(context0, this.zzp(context0, ((String)zzba.zzc().zzb(zzbbr.zzeA)), s, s1).toString(), s1);
        if(TextUtils.isEmpty(s2)) {
            zzcaa.zze("Not linked for in app preview.");
            return false;
        }
        String s3 = s2.trim();
        try {
            JSONObject jSONObject0 = new JSONObject(s3);
            s4 = jSONObject0.optString("gct");
            this.zza = jSONObject0.optString("status");
            if(((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
                boolean z = "0".equals(this.zza) || "2".equals(this.zza);
                this.zzf(z);
                zzg zzg0 = zzt.zzo().zzh();
                if(!z) {
                    s = "";
                }
                zzg0.zzA(s);
            }
        }
        catch(JSONException jSONException0) {
            zzcaa.zzk("Fail to get in app preview response json.", jSONException0);
            return false;
        }
        synchronized(this.zzb) {
            this.zzd = s4;
        }
        return true;
    }

    public final boolean zzl() {
        synchronized(this.zzb) {
        }
        return this.zzf;
    }

    public final boolean zzm() {
        synchronized(this.zzb) {
        }
        return this.zze;
    }

    public final boolean zzn(Context context0, String s, String s1, String s2) {
        if(!TextUtils.isEmpty(s1) && this.zzm()) {
            zzcaa.zze("Sending troubleshooting signals to the server.");
            this.zze(context0, s, s1, s2);
            return true;
        }
        return false;
    }

    protected static final String zzo(Context context0, String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("User-Agent", zzt.zzp().zzc(context0, s1));
        d d0 = new zzbo(context0).zzb(0, s, hashMap0, null);
        try {
            return (String)d0.get(((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzeD)))))), TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException timeoutException0) {
            zzcaa.zzh(("Timeout while retrieving a response from: " + s), timeoutException0);
            d0.cancel(true);
            return null;
        }
        catch(InterruptedException interruptedException0) {
            zzcaa.zzh(("Interrupted while retrieving a response from: " + s), interruptedException0);
            d0.cancel(true);
            return null;
        }
        catch(Exception exception0) {
            zzcaa.zzh(("Error retrieving a response from: " + s), exception0);
            return null;
        }
    }

    private final Uri zzp(Context context0, String s, String s1, String s2) {
        String s3;
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        synchronized(this.zzb) {
            if(TextUtils.isEmpty(this.zzc)) {
                try {
                    s3 = new String(IOUtils.readInputStreamFully(context0.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                }
                catch(IOException unused_ex) {
                    zzcaa.zze("Error reading from internal storage.");
                    s3 = "";
                }
                this.zzc = s3;
                if(TextUtils.isEmpty(s3)) {
                    try {
                        this.zzc = "1dc6649b-5b88-4d92-925c-934f287ba3b2";
                        FileOutputStream fileOutputStream0 = context0.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStream0.write("1dc6649b-5b88-4d92-925c-934f287ba3b2".getBytes("UTF-8"));
                        fileOutputStream0.close();
                    }
                    catch(Exception exception0) {
                        zzcaa.zzh("Error writing to file in internal storage.", exception0);
                    }
                }
            }
        }
        uri$Builder0.appendQueryParameter("linkedDeviceId", this.zzc);
        uri$Builder0.appendQueryParameter("adSlotPath", s1);
        uri$Builder0.appendQueryParameter("afmaVersion", s2);
        return uri$Builder0.build();
    }
}

