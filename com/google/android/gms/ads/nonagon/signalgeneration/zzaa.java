package com.google.android.gms.ads.nonagon.signalgeneration;

import Z1.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcvq;
import com.google.android.gms.internal.ads.zzdbt;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfby;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzfyo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class zzaa extends zzbyq {
    private final zzcag zzA;
    private String zzB;
    private final String zzC;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    protected static final List zza;
    protected static final List zzb;
    protected static final List zzc;
    protected static final List zzd;
    public static final int zze;
    private final zzchd zzf;
    private Context zzg;
    private final zzaqx zzh;
    private final zzfcx zzi;
    private zzdrc zzj;
    private final zzfyo zzk;
    private final ScheduledExecutorService zzl;
    private zzbta zzm;
    private Point zzn;
    private Point zzo;
    private final Set zzp;
    private final zzc zzq;
    private final zzdrm zzr;
    private final zzfik zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final String zzx;
    private final String zzy;
    private final AtomicInteger zzz;

    static {
        zzaa.zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
        zzaa.zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
        zzaa.zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
        zzaa.zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    }

    public zzaa(zzchd zzchd0, Context context0, zzaqx zzaqx0, zzfcx zzfcx0, zzfyo zzfyo0, ScheduledExecutorService scheduledExecutorService0, zzdrm zzdrm0, zzfik zzfik0, zzcag zzcag0) {
        List list0;
        this.zzj = null;
        this.zzn = new Point();
        this.zzo = new Point();
        this.zzp = Collections.newSetFromMap(new WeakHashMap());
        this.zzz = new AtomicInteger(0);
        this.zzf = zzchd0;
        this.zzg = context0;
        this.zzh = zzaqx0;
        this.zzi = zzfcx0;
        this.zzk = zzfyo0;
        this.zzl = scheduledExecutorService0;
        this.zzq = zzchd0.zzn();
        this.zzr = zzdrm0;
        this.zzs = zzfik0;
        this.zzA = zzcag0;
        this.zzt = ((Boolean)zzba.zzc().zzb(zzbbr.zzhe)).booleanValue();
        this.zzu = ((Boolean)zzba.zzc().zzb(zzbbr.zzhd)).booleanValue();
        this.zzv = ((Boolean)zzba.zzc().zzb(zzbbr.zzhf)).booleanValue();
        this.zzw = ((Boolean)zzba.zzc().zzb(zzbbr.zzhh)).booleanValue();
        this.zzx = (String)zzba.zzc().zzb(zzbbr.zzhg);
        this.zzy = (String)zzba.zzc().zzb(zzbbr.zzhi);
        this.zzC = (String)zzba.zzc().zzb(zzbbr.zzhj);
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhk)).booleanValue()) {
            this.zzD = zzaa.zzX(((String)zzba.zzc().zzb(zzbbr.zzhl)));
            this.zzE = zzaa.zzX(((String)zzba.zzc().zzb(zzbbr.zzhm)));
            this.zzF = zzaa.zzX(((String)zzba.zzc().zzb(zzbbr.zzhn)));
            list0 = zzaa.zzX(((String)zzba.zzc().zzb(zzbbr.zzho)));
        }
        else {
            this.zzD = zzaa.zza;
            this.zzE = zzaa.zzb;
            this.zzF = zzaa.zzc;
            list0 = zzaa.zzd;
        }
        this.zzG = list0;
    }

    final ArrayList zzB(List list0, String s) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            Uri uri0 = (Uri)object0;
            if(this.zzO(uri0) && !TextUtils.isEmpty(s)) {
                arrayList0.add(zzaa.zzW(uri0, "nas", s));
            }
            else {
                arrayList0.add(uri0);
            }
        }
        return arrayList0;
    }

    final ArrayList zzC(List list0, IObjectWrapper iObjectWrapper0) {
        String s = this.zzh.zzc().zzh(this.zzg, ((View)ObjectWrapper.unwrap(iObjectWrapper0)), null);
        if(TextUtils.isEmpty(s)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            Uri uri0 = (Uri)object0;
            if(this.zzO(uri0)) {
                arrayList0.add(zzaa.zzW(uri0, "ms", s));
            }
            else {
                zzcaa.zzj(("Not a Google URL: " + uri0));
                arrayList0.add(uri0);
            }
        }
        if(arrayList0.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList0;
    }

    static void zzF(zzaa zzaa0, List list0) {
        for(Object object0: list0) {
            if(zzaa0.zzN(((Uri)object0))) {
                zzaa0.zzz.getAndIncrement();
                return;
            }
            if(false) {
                break;
            }
        }
    }

    static void zzG(zzaa zzaa0, String s, String s1, zzdrc zzdrc0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzgP)).booleanValue()) {
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgV)).booleanValue()) {
            zzi zzi0 = () -> zzaa0.zzq.zzd(s, s1, zzdrc0);
            zzcan.zza.execute(zzi0);
            return;
        }
        zzaa0.zzq.zzd(s, s1, zzdrc0);
    }

    // 检测为 Lambda 实现
    final void zzH(zzdnb[] arr_zzdnb) [...]

    // 检测为 Lambda 实现
    final void zzI(String s, String s1, zzdrc zzdrc0) [...]

    final boolean zzN(Uri uri0) {
        return zzaa.zzU(uri0, this.zzD, this.zzE);
    }

    final boolean zzO(Uri uri0) {
        return zzaa.zzU(uri0, this.zzF, this.zzG);
    }

    static final Uri zzP(Uri uri0, String s) {
        return TextUtils.isEmpty(s) ? uri0 : zzaa.zzW(uri0, "nas", s);
    }

    private final zzh zzQ(Context context0, String s, String s1, zzq zzq0, zzl zzl0) {
        zzfby zzfby0 = new zzfby();
        if("REWARDED".equals(s1)) {
            zzfby0.zzo().zza(2);
        }
        else if("REWARDED_INTERSTITIAL".equals(s1)) {
            zzfby0.zzo().zza(3);
        }
        zzg zzg0 = this.zzf.zzo();
        zzcvq zzcvq0 = new zzcvq();
        zzcvq0.zze(context0);
        if(s == null) {
            s = "adUnitId";
        }
        zzfby0.zzs(s);
        if(zzl0 == null) {
            zzl0 = new zzm().zza();
        }
        zzfby0.zzE(zzl0);
        if(zzq0 == null) {
            switch(s1) {
                case "APP_OPEN_AD": {
                    zzq0 = zzq.zzb();
                    break;
                }
                case "BANNER": {
                    zzq0 = new zzq(context0, AdSize.BANNER);
                    break;
                }
                case "NATIVE": {
                    zzq0 = zzq.zzc();
                    break;
                }
                case "REWARDED": {
                    zzq0 = zzq.zzd();
                    break;
                }
                case "REWARDED_INTERSTITIAL": {
                    zzq0 = zzq.zzd();
                    break;
                }
                default: {
                    zzq0 = new zzq();
                }
            }
        }
        zzfby0.zzr(zzq0);
        zzfby0.zzx(true);
        zzcvq0.zzi(zzfby0.zzG());
        zzg0.zza(zzcvq0.zzj());
        zzac zzac0 = new zzac();
        zzac0.zza(s1);
        zzg0.zzb(new zzae(zzac0, null));
        new zzdbt();
        zzh zzh0 = zzg0.zzc();
        this.zzj = zzh0.zza();
        return zzh0;
    }

    private final d zzR(String s) {
        zzdnb[] arr_zzdnb = new zzdnb[1];
        d d0 = zzfye.zzn(this.zzi.zza(), (zzdnb zzdnb0) -> {
            arr_zzdnb[0] = zzdnb0;
            Map map0 = this.zzm.zzb;
            JSONObject jSONObject0 = zzbx.zzd(this.zzg, map0, map0, this.zzm.zza, null);
            JSONObject jSONObject1 = zzbx.zzg(this.zzg, this.zzm.zza);
            JSONObject jSONObject2 = zzbx.zzf(this.zzm.zza);
            JSONObject jSONObject3 = zzbx.zze(this.zzg, this.zzm.zza);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset_view_signal", jSONObject0);
            jSONObject4.put("ad_view_signal", jSONObject1);
            jSONObject4.put("scroll_view_signal", jSONObject2);
            jSONObject4.put("lock_screen_signal", jSONObject3);
            if("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(s)) {
                jSONObject4.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
            }
            return zzdnb0.zzd(s, jSONObject4);
        }, this.zzk);
        d0.addListener(() -> {
            zzdnb zzdnb0 = arr_zzdnb[0];
            if(zzdnb0 != null) {
                d d0 = zzfye.zzh(zzdnb0);
                this.zzi.zzb(d0);
            }
        }, this.zzk);
        return zzfye.zze(zzfye.zzm(((zzfxv)zzfye.zzo(zzfxv.zzu(d0), ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhu)))))), TimeUnit.MILLISECONDS, this.zzl)), zzv.zza, this.zzk), Exception.class, zzj.zza, this.zzk);
    }

    private final void zzS(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0, boolean z) {
        d d0;
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            zzcaa.zzj("The updating URL feature is not enabled.");
            try {
                zzbsr0.zze("The updating URL feature is not enabled.");
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("", remoteException0);
            }
            return;
        }
        int v = 0;
        for(Object object0: list0) {
            if(this.zzN(((Uri)object0))) {
                ++v;
            }
        }
        if(v > 1) {
            zzcaa.zzj(("Multiple google urls found: " + list0));
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: list0) {
            Uri uri0 = (Uri)object1;
            if(this.zzN(uri0)) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzq0 = new com.google.android.gms.ads.nonagon.signalgeneration.zzq(this, uri0, iObjectWrapper0);
                d0 = this.zzk.zzb(zzq0);
                if(this.zzV()) {
                    d0 = zzfye.zzn(d0, new zzr(this), this.zzk);
                }
                else {
                    zzcaa.zzi("Asset view map is empty.");
                }
            }
            else {
                zzcaa.zzj(("Not a Google URL: " + uri0));
                d0 = zzfye.zzh(uri0);
            }
            arrayList0.add(d0);
        }
        zzfye.zzr(zzfye.zzd(arrayList0), new zzy(this, zzbsr0, z), this.zzf.zzB());
    }

    private final void zzT(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0, boolean z) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            try {
                zzbsr0.zze("The updating URL feature is not enabled.");
            }
            catch(RemoteException remoteException0) {
                zzcaa.zzh("", remoteException0);
            }
            return;
        }
        zzs zzs0 = new zzs(this, list0, iObjectWrapper0);
        d d0 = this.zzk.zzb(zzs0);
        if(this.zzV()) {
            d0 = zzfye.zzn(d0, new zzt(this), this.zzk);
        }
        else {
            zzcaa.zzi("Asset view map is empty.");
        }
        zzfye.zzr(d0, new zzx(this, zzbsr0, z), this.zzf.zzB());
    }

    private static boolean zzU(Uri uri0, List list0, List list1) {
        String s = uri0.getHost();
        String s1 = uri0.getPath();
        if(s != null && s1 != null) {
            for(Object object0: list0) {
                if(s1.contains(((String)object0))) {
                    for(Object object1: list1) {
                        if(s.endsWith(((String)object1))) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        return this.zzm != null && (this.zzm.zzb != null && !this.zzm.zzb.isEmpty());
    }

    private static final Uri zzW(Uri uri0, String s, String s1) {
        String s2 = uri0.toString();
        int v = s2.indexOf("&adurl=");
        if(v == -1) {
            v = s2.indexOf("?adurl=");
        }
        return v == -1 ? uri0.buildUpon().appendQueryParameter(s, s1).build() : Uri.parse((s2.substring(0, v + 1) + s + "=" + s1 + "&" + s2.substring(v + 1)));
    }

    private static final List zzX(String s) {
        String[] arr_s = TextUtils.split(s, ",");
        List list0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!zzfrx.zzd(s1)) {
                list0.add(s1);
            }
        }
        return list0;
    }

    static Uri zzd(zzaa zzaa0, Uri uri0, String s, String s1) {
        return zzaa.zzW(uri0, s, "1");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zze(IObjectWrapper iObjectWrapper0, zzbyv zzbyv0, zzbyo zzbyo0) {
        d d1;
        d d0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zzg = context0;
        zzfhg zzfhg0 = zzfhf.zza(context0, 22);
        zzfhg0.zzh();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjX)).booleanValue()) {
            zzo zzo0 = new zzo(this, zzbyv0);
            d0 = zzcan.zza.zzb(zzo0);
            d1 = zzfye.zzn(d0, zzp.zza, zzcan.zza);
        }
        else {
            zzh zzh0 = this.zzQ(this.zzg, zzbyv0.zza, zzbyv0.zzb, zzbyv0.zzc, zzbyv0.zzd);
            d0 = zzfye.zzh(zzh0);
            d1 = zzh0.zzc();
        }
        zzfye.zzr(d1, new zzw(this, d0, zzbyv0, zzbyo0, zzfhg0, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzB());
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(zzbta zzbta0) {
        this.zzm = zzbta0;
        this.zzi.zzc(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        this.zzS(list0, iObjectWrapper0, zzbsr0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        this.zzT(list0, iObjectWrapper0, zzbsr0, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzja)).booleanValue()) {
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjb)).booleanValue() && !((Boolean)zzba.zzc().zzb(zzbbr.zzje)).booleanValue()) {
            zzfye.zzr((((Boolean)zzba.zzc().zzb(zzbbr.zzjX)).booleanValue() ? zzfye.zzk(new zzu(this), zzcan.zza) : this.zzQ(this.zzg, null, "BANNER", null, null).zzc()), new zzz(this), this.zzf.zzB());
        }
        WebView webView0 = (WebView)ObjectWrapper.unwrap(iObjectWrapper0);
        if(webView0 == null) {
            zzcaa.zzg("The webView cannot be null.");
            return;
        }
        if(this.zzp.contains(webView0)) {
            zzcaa.zzi("This webview has already been registered.");
            return;
        }
        this.zzp.add(webView0);
        webView0.addJavascriptInterface(new TaggingLibraryJsInterface(webView0, this.zzh, this.zzr, this.zzs), "gmaSdk");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent0 = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper0);
        this.zzn = zzbx.zza(motionEvent0, (this.zzm == null ? null : this.zzm.zza));
        if(motionEvent0.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setLocation(((float)this.zzn.x), ((float)this.zzn.y));
        this.zzh.zzd(motionEvent1);
        motionEvent1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzk(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        this.zzS(list0, iObjectWrapper0, zzbsr0, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzl(List list0, IObjectWrapper iObjectWrapper0, zzbsr zzbsr0) {
        this.zzT(list0, iObjectWrapper0, zzbsr0, false);
    }

    final Uri zzm(Uri uri0, IObjectWrapper iObjectWrapper0) {
        try {
            Context context0 = this.zzg;
            View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
            uri0 = this.zzh.zza(uri0, context0, view0, null);
        }
        catch(zzaqy zzaqy0) {
            zzcaa.zzk("", zzaqy0);
        }
        if(uri0.getQueryParameter("ms") == null) {
            throw new Exception("Failed to append spam signals to click url.");
        }
        return uri0;
    }

    final zzh zzq(zzbyv zzbyv0) {
        return this.zzQ(this.zzg, zzbyv0.zza, zzbyv0.zzb, zzbyv0.zzc, zzbyv0.zzd);
    }

    static zzfhr zzr(d d0, zzbyv zzbyv0) {
        if(zzfhu.zza() && ((Boolean)zzbdd.zze.zze()).booleanValue()) {
            try {
                zzfhr zzfhr0 = ((zzh)zzfye.zzp(d0)).zzb();
                zzfhr0.zzd(new ArrayList(Collections.singletonList(zzbyv0.zzb)));
                zzfhr0.zzb((zzbyv0.zzd == null ? "" : zzbyv0.zzd.zzp));
                return zzfhr0;
            }
            catch(ExecutionException executionException0) {
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzu(executionException0, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
        }
        return null;
    }

    public static d zzt(zzaa zzaa0, Uri uri0) {
        return zzfye.zzm(zzaa0.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new com.google.android.gms.ads.nonagon.signalgeneration.zzm(zzaa0, uri0), zzaa0.zzk);
    }

    // 去混淆评级： 低(20)
    final d zzu() {
        return this.zzQ(this.zzg, null, "BANNER", null, null).zzc();
    }

    // 检测为 Lambda 实现
    final d zzv(zzdnb[] arr_zzdnb, String s, zzdnb zzdnb0) [...]

    final d zzw(ArrayList arrayList0) {
        return zzfye.zzm(this.zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzn(this, arrayList0), this.zzk);
    }
}

