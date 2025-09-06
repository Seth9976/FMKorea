package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdgz implements zzdik {
    private zzcs zzA;
    private final Context zza;
    private final zzdin zzb;
    private final JSONObject zzc;
    private final zzdnb zzd;
    private final zzdic zze;
    private final zzaqx zzf;
    private final zzcxa zzg;
    private final zzcwg zzh;
    private final zzddu zzi;
    private final zzfbe zzj;
    private final zzcag zzk;
    private final zzfca zzl;
    private final zzcoy zzm;
    private final zzdjg zzn;
    private final Clock zzo;
    private final zzddq zzp;
    private final zzfik zzq;
    private final zzfhr zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Point zzw;
    private Point zzx;
    private long zzy;
    private long zzz;

    public zzdgz(Context context0, zzdin zzdin0, JSONObject jSONObject0, zzdnb zzdnb0, zzdic zzdic0, zzaqx zzaqx0, zzcxa zzcxa0, zzcwg zzcwg0, zzddu zzddu0, zzfbe zzfbe0, zzcag zzcag0, zzfca zzfca0, zzcoy zzcoy0, zzdjg zzdjg0, Clock clock0, zzddq zzddq0, zzfik zzfik0, zzfhr zzfhr0) {
        this.zzs = false;
        this.zzu = false;
        this.zzv = false;
        this.zzw = new Point();
        this.zzx = new Point();
        this.zzy = 0L;
        this.zzz = 0L;
        this.zza = context0;
        this.zzb = zzdin0;
        this.zzc = jSONObject0;
        this.zzd = zzdnb0;
        this.zze = zzdic0;
        this.zzf = zzaqx0;
        this.zzg = zzcxa0;
        this.zzh = zzcwg0;
        this.zzi = zzddu0;
        this.zzj = zzfbe0;
        this.zzk = zzcag0;
        this.zzl = zzfca0;
        this.zzm = zzcoy0;
        this.zzn = zzdjg0;
        this.zzo = clock0;
        this.zzp = zzddq0;
        this.zzq = zzfik0;
        this.zzr = zzfhr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzA() {
        return this.zza() == 0 || !((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue() ? true : this.zzl.zzi.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzB() {
        return this.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzC(Bundle bundle0) {
        if(!this.zzE("impression_reporting")) {
            zzcaa.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return this.zzG(null, null, null, null, null, zzay.zzb().zzj(bundle0, null), false);
    }

    private final String zzD(View view0, Map map0) {
        if(map0 != null && view0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(view0.equals(((View)((WeakReference)map$Entry0.getValue()).get()))) {
                    return (String)map$Entry0.getKey();
                }
                if(false) {
                    break;
                }
            }
        }
        switch(this.zze.zzc()) {
            case 1: {
                return "1099";
            }
            case 2: {
                return "2099";
            }
            case 6: {
                return "3099";
            }
            default: {
                return null;
            }
        }
    }

    private final boolean zzE(String s) {
        JSONObject jSONObject0 = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObject0 != null && jSONObject0.optBoolean(s, false);
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzG(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, JSONObject jSONObject3, String s, JSONObject jSONObject4, boolean z) {
        DisplayMetrics displayMetrics0;
        JSONObject jSONObject6;
        JSONObject jSONObject5;
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.zzc);
            jSONObject5.put("asset_view_signal", jSONObject1);
            jSONObject5.put("ad_view_signal", jSONObject0);
            jSONObject5.put("scroll_view_signal", jSONObject2);
            jSONObject5.put("lock_screen_signal", jSONObject3);
            jSONObject5.put("provided_signals", jSONObject4);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdl)).booleanValue()) {
                jSONObject5.put("view_signals", s);
            }
            jSONObject5.put("policy_validator_enabled", z);
            jSONObject6 = new JSONObject();
            displayMetrics0 = zzs.zzq(((WindowManager)this.zza.getSystemService("window")));
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("Unable to create impression JSON.", jSONException0);
            return false;
        }
        try {
            jSONObject6.put("width", zzay.zzb().zzb(this.zza, displayMetrics0.widthPixels));
            jSONObject6.put("height", zzay.zzb().zzb(this.zza, displayMetrics0.heightPixels));
        }
        catch(JSONException unused_ex) {
            jSONObject6 = null;
        }
        try {
            jSONObject5.put("screen", jSONObject6);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzif)).booleanValue()) {
                zzdgw zzdgw0 = new zzdgw(this, null);
                this.zzd.zzi("/clickRecorded", zzdgw0);
            }
            else {
                zzdgu zzdgu0 = new zzdgu(this, null);
                this.zzd.zzi("/logScionEvent", zzdgu0);
            }
            zzdgy zzdgy0 = new zzdgy(this, null);
            this.zzd.zzi("/nativeImpression", zzdgy0);
            zzcaq.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject5), "Error during performing handleImpression");
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("Unable to create impression JSON.", jSONException0);
            return false;
        }
        if(!this.zzs) {
            this.zzs = zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final int zza() {
        return this.zzl.zzi == null || !((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue() ? 0 : this.zzl.zzi.zzi;
    }

    static zzcwg zzb(zzdgz zzdgz0) {
        return zzdgz0.zzh;
    }

    static zzcxa zzc(zzdgz zzdgz0) {
        return zzdgz0.zzg;
    }

    static zzddu zzd(zzdgz zzdgz0) {
        return zzdgz0.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zze(View view0, Map map0, Map map1, ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = zzbx.zzd(this.zza, map0, map1, view0, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbx.zzg(this.zza, view0);
        JSONObject jSONObject2 = zzbx.zzf(view0);
        JSONObject jSONObject3 = zzbx.zze(this.zza, view0);
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset_view_signal", jSONObject0);
            jSONObject4.put("ad_view_signal", jSONObject1);
            jSONObject4.put("scroll_view_signal", jSONObject2);
            jSONObject4.put("lock_screen_signal", jSONObject3);
            return jSONObject4;
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("Unable to create native ad view signals JSON.", jSONException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zzf(View view0, Map map0, Map map1, ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = this.zze(view0, map0, map1, imageView$ScaleType0);
        JSONObject jSONObject1 = new JSONObject();
        try {
            if(this.zzv && this.zzF()) {
                jSONObject1.put("custom_click_gesture_eligible", true);
            }
            if(jSONObject0 != null) {
                jSONObject1.put("nas", jSONObject0);
                return jSONObject1;
            }
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("Unable to create native click meta data JSON.", jSONException0);
        }
        return jSONObject1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzg() {
        try {
            zzcs zzcs0 = this.zzA;
            if(zzcs0 != null) {
                zzcs0.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzcaa.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzh() {
        if(!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.zzn.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzi() {
        this.zzd.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzj(zzcw zzcw0) {
        try {
            if(this.zzu) {
                return;
            }
            if(zzcw0 == null) {
                zzdic zzdic0 = this.zze;
                if(zzdic0.zzk() != null) {
                    this.zzu = true;
                    String s = zzdic0.zzk().zzf();
                    this.zzq.zzc(s, this.zzr);
                    this.zzg();
                    return;
                }
            }
            this.zzu = true;
            String s1 = zzcw0.zzf();
            this.zzq.zzc(s1, this.zzr);
            this.zzg();
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcaa.zzl("#007 Could not call remote method.", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzk(View view0, View view1, Map map0, Map map1, boolean z, ImageView.ScaleType imageView$ScaleType0) {
        JSONObject jSONObject0 = zzbx.zzd(this.zza, map0, map1, view1, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbx.zzg(this.zza, view1);
        JSONObject jSONObject2 = zzbx.zzf(view1);
        JSONObject jSONObject3 = zzbx.zze(this.zza, view1);
        String s = this.zzD(view0, map0);
        JSONObject jSONObject4 = zzbx.zzc(s, this.zza, this.zzx, this.zzw);
        this.zzn((((Boolean)zzba.zzc().zzb(zzbbr.zzds)).booleanValue() ? view1 : view0), jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, jSONObject4, null, z, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzl(String s) {
        this.zzn(null, null, null, null, null, s, null, null, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzm(Bundle bundle0) {
        if(bundle0 == null) {
            zzcaa.zze("Click data is null. No click is reported.");
            return;
        }
        if(!this.zzE("click_reporting")) {
            zzcaa.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle1 = bundle0.getBundle("click_signal");
        this.zzn(null, null, null, null, null, (bundle1 == null ? null : bundle1.getString("asset_id")), null, zzay.zzb().zzj(bundle0, null), false, false);
    }

    protected final void zzn(View view0, JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, JSONObject jSONObject3, String s, JSONObject jSONObject4, JSONObject jSONObject5, boolean z, boolean z1) {
        String s4;
        JSONObject jSONObject7;
        JSONObject jSONObject6;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject1);
            jSONObject6.put("ad_view_signal", jSONObject0);
            jSONObject6.put("click_signal", jSONObject4);
            jSONObject6.put("scroll_view_signal", jSONObject2);
            jSONObject6.put("lock_screen_signal", jSONObject3);
            String s1 = this.zze.zzA();
            boolean z2 = false;
            jSONObject6.put("has_custom_click_handler", this.zzb.zzc(s1) != null);
            jSONObject6.put("provided_signals", jSONObject5);
            jSONObject7 = new JSONObject();
            jSONObject7.put("asset_id", s);
            jSONObject7.put("template", this.zze.zzc());
            jSONObject7.put("view_aware_api_used", z);
            zzbek zzbek0 = this.zzl.zzi;
            jSONObject7.put("custom_mute_requested", zzbek0 != null && zzbek0.zzg);
            jSONObject7.put("custom_mute_enabled", !this.zze.zzH().isEmpty() && this.zze.zzk() != null);
            if(this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject7.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject7.put("timestamp", this.zzo.currentTimeMillis());
            if(this.zzv && this.zzF()) {
                jSONObject7.put("custom_click_gesture_eligible", true);
            }
            if(z1) {
                jSONObject7.put("is_custom_click_gesture", true);
            }
            String s2 = this.zze.zzA();
            if(this.zzb.zzc(s2) != null) {
                z2 = true;
            }
            jSONObject7.put("has_custom_click_handler", z2);
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("Unable to create click JSON.", jSONException0);
            return;
        }
        try {
            JSONObject jSONObject8 = this.zzc.optJSONObject("tracking_urls_and_actions");
            if(jSONObject8 == null) {
                jSONObject8 = new JSONObject();
            }
            String s3 = jSONObject8.optString("click_string");
            s4 = this.zzf.zzc().zze(this.zza, s3, view0);
            goto label_39;
        }
        catch(Exception exception0) {
        }
        try {
            zzcaa.zzh("Exception obtaining click signals", exception0);
            s4 = null;
        label_39:
            jSONObject7.put("click_signals", s4);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzeu)).booleanValue()) {
                jSONObject7.put("open_chrome_custom_tab", true);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzij)).booleanValue()) {
                jSONObject7.put("try_fallback_for_deep_link", true);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzik)).booleanValue()) {
                jSONObject7.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject6.put("click", jSONObject7);
            JSONObject jSONObject9 = new JSONObject();
            long v = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", v - this.zzy);
            jSONObject9.put("time_from_last_touch", v - this.zzz);
            jSONObject6.put("touch_signal", jSONObject9);
            zzcaq.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject6), "Error during performing handleClick");
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzcaa.zzh("Unable to create click JSON.", jSONException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzo(View view0, View view1, Map map0, Map map1, boolean z, ImageView.ScaleType imageView$ScaleType0, int v) {
        if(!this.zzc.optBoolean("allow_sdk_custom_click_gesture", false) || !((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
            if(!this.zzv) {
                zzcaa.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            }
            if(!this.zzF()) {
                zzcaa.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObject0 = zzbx.zzd(this.zza, map0, map1, view1, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbx.zzg(this.zza, view1);
        JSONObject jSONObject2 = zzbx.zzf(view1);
        JSONObject jSONObject3 = zzbx.zze(this.zza, view1);
        String s = this.zzD(view0, map0);
        this.zzn(view1, jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, zzbx.zzc(s, this.zza, this.zzx, this.zzw), null, z, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("ad", this.zzc);
            zzcaq.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject0), "Error during performing handleDownloadedImpression");
        }
        catch(JSONException jSONException0) {
            zzcaa.zzh("", jSONException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzq(View view0, Map map0, Map map1, ImageView.ScaleType imageView$ScaleType0) {
        String s;
        JSONObject jSONObject0 = zzbx.zzd(this.zza, map0, map1, view0, imageView$ScaleType0);
        JSONObject jSONObject1 = zzbx.zzg(this.zza, view0);
        JSONObject jSONObject2 = zzbx.zzf(view0);
        JSONObject jSONObject3 = zzbx.zze(this.zza, view0);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzdl)).booleanValue()) {
            try {
                s = this.zzf.zzc().zzh(this.zza, view0, null);
            }
            catch(Exception unused_ex) {
                zzcaa.zzg("Exception getting data.");
                s = null;
            }
        }
        else {
            s = null;
        }
        this.zzG(jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, null, zzbx.zzh(this.zza, this.zzj));
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzr() {
        this.zzG(null, null, null, null, null, null, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzs(View view0, MotionEvent motionEvent0, View view1) {
        this.zzw = zzbx.zza(motionEvent0, view1);
        long v = this.zzo.currentTimeMillis();
        this.zzz = v;
        if(motionEvent0.getAction() == 0) {
            this.zzy = v;
            this.zzx = this.zzw;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setLocation(((float)this.zzw.x), ((float)this.zzw.y));
        this.zzf.zzd(motionEvent1);
        motionEvent1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzt(Bundle bundle0) {
        if(bundle0 == null) {
            zzcaa.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if(!this.zzE("touch_reporting")) {
            zzcaa.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        int v = (int)bundle0.getFloat("x");
        int v1 = (int)bundle0.getFloat("y");
        int v2 = bundle0.getInt("duration_ms");
        this.zzf.zzc().zzl(v, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzu(View view0) {
        if(!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcaa.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjg zzdjg0 = this.zzn;
        if(view0 == null) {
            return;
        }
        view0.setOnClickListener(zzdjg0);
        view0.setClickable(true);
        zzdjg0.zzc = new WeakReference(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzv() {
        this.zzv = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzw(zzcs zzcs0) {
        this.zzA = zzcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzx(zzbgq zzbgq0) {
        if(!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcaa.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.zzn.zzc(zzbgq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzy(View view0, Map map0, Map map1, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        this.zzw = new Point();
        this.zzx = new Point();
        if(!this.zzt) {
            this.zzp.zza(view0);
            this.zzt = true;
        }
        view0.setOnTouchListener(view$OnTouchListener0);
        view0.setClickable(true);
        view0.setOnClickListener(view$OnClickListener0);
        this.zzm.zzi(this);
        boolean z = zzbx.zzi(this.zzk.zzc);
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                View view1 = (View)((WeakReference)((Map.Entry)object0).getValue()).get();
                if(view1 != null) {
                    if(z) {
                        view1.setOnTouchListener(view$OnTouchListener0);
                    }
                    view1.setClickable(true);
                    view1.setOnClickListener(view$OnClickListener0);
                }
            }
        }
        if(map1 != null) {
            for(Object object1: map1.entrySet()) {
                View view2 = (View)((WeakReference)((Map.Entry)object1).getValue()).get();
                if(view2 != null) {
                    if(z) {
                        view2.setOnTouchListener(view$OnTouchListener0);
                    }
                    view2.setClickable(false);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final void zzz(View view0, Map map0) {
        this.zzw = new Point();
        this.zzx = new Point();
        if(view0 != null) {
            this.zzp.zzb(view0);
        }
        this.zzt = false;
    }
}

