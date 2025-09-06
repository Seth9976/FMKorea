package com.google.android.gms.internal.ads;

import Z1.d;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.p;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbjc implements zzbir {
    private final zzb zza;
    private final zzdrh zzb;
    private final zzfgo zzc;
    private final zzcaf zzd;
    private final zzbqz zze;
    private final zzech zzf;
    private final zzcob zzg;
    private zzx zzh;
    private final zzfyo zzi;

    public zzbjc(zzb zzb0, zzbqz zzbqz0, zzech zzech0, zzdrh zzdrh0, zzfgo zzfgo0, zzcob zzcob0) {
        this.zzh = null;
        this.zzi = zzcan.zzf;
        this.zza = zzb0;
        this.zze = zzbqz0;
        this.zzf = zzech0;
        this.zzb = zzdrh0;
        this.zzc = zzfgo0;
        this.zzd = new zzcaf(null);
        this.zzg = zzcob0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object object0, Map map0) {
        d d0;
        String s = zzbyh.zzc(((String)map0.get("u")), ((zzcfi)(((zza)object0))).getContext(), true);
        String s1 = (String)map0.get("a");
        if(s1 == null) {
            zzcaa.zzj("Action missing from an open GMSG.");
            return;
        }
        if(this.zza != null && !this.zza.zzc()) {
            this.zza.zzb(s);
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzjo)).booleanValue()) {
            zzcob zzcob0 = this.zzg;
            d0 = zzcob0 == null ? zzfye.zzh(s) : zzcob0.zzc(s, zzay.zze());
        }
        else {
            d0 = zzfye.zzh(s);
        }
        zzfye.zzr(d0, new zzbiy(this, ((zza)object0), map0, s1), this.zzi);
    }

    public static int zzb(Map map0) {
        String s = (String)map0.get("o");
        if(s != null) {
            if("p".equalsIgnoreCase(s)) {
                return 7;
            }
            if("l".equalsIgnoreCase(s)) {
                return 6;
            }
            return "c".equalsIgnoreCase(s) ? 14 : -1;
        }
        return -1;
    }

    static Uri zzc(Context context0, zzaqx zzaqx0, Uri uri0, View view0, Activity activity0) {
        if(zzaqx0 == null) {
            return uri0;
        }
        try {
            if(zzaqx0.zze(uri0)) {
                return zzaqx0.zza(uri0, context0, view0, activity0);
            }
        }
        catch(zzaqy exception0) {
            zzt.zzo().zzu(exception0, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        catch(Exception unused_ex) {
        }
        return uri0;
    }

    static Uri zzd(Uri uri0) {
        try {
            if(uri0.getQueryParameter("aclk_ms") != null) {
                return uri0.buildUpon().appendQueryParameter("aclk_upms", "27731588").build();
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            zzcaa.zzh(("Error adding click uptime parameter to url: " + uri0.toString()), unsupportedOperationException0);
        }
        return uri0;
    }

    static void zze(zzbjc zzbjc0, String s, zza zza0, Map map0, String s1) {
        zzbjc0.zzh(s, zza0, map0, s1);
    }

    public static boolean zzf(Map map0) {
        return "1".equals(map0.get("custom_close"));
    }

    static void zzg(zzbjc zzbjc0, int v) {
        zzbjc0.zzm(v);
    }

    private final void zzh(String s, zza zza0, Map map0, String s1) {
        String s6;
        HashMap hashMap1;
        String s2;
        boolean z1;
        zzcfi zzcfi0 = (zzcfi)zza0;
        zzfbe zzfbe0 = zzcfi0.zzD();
        zzfbi zzfbi0 = zzcfi0.zzP();
        boolean z = false;
        if(zzfbe0 == null || zzfbi0 == null) {
            s2 = "";
            z1 = false;
        }
        else {
            z1 = zzfbe0.zzaj;
            s2 = zzfbi0.zzb;
        }
        boolean z2 = !((Boolean)zzba.zzc().zzb(zzbbr.zzjJ)).booleanValue() || !map0.containsKey("sc") || !((String)map0.get("sc")).equals("0");
        if("expand".equalsIgnoreCase(s1)) {
            if(zzcfi0.zzaA()) {
                zzcaa.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            this.zzk(false);
            ((zzcgn)zza0).zzaF(zzbjc.zzf(map0), zzbjc.zzb(map0), z2);
            return;
        }
        if("webapp".equalsIgnoreCase(s1)) {
            this.zzk(false);
            if(s != null) {
                ((zzcgn)zza0).zzaG(zzbjc.zzf(map0), zzbjc.zzb(map0), s, z2);
                return;
            }
            ((zzcgn)zza0).zzaH(zzbjc.zzf(map0), zzbjc.zzb(map0), ((String)map0.get("html")), ((String)map0.get("baseurl")), z2);
            return;
        }
        if("chrome_custom_tab".equalsIgnoreCase(s1)) {
            Context context0 = zzcfi0.getContext();
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzer)).booleanValue()) {
                if(((Boolean)zzba.zzc().zzb(zzbbr.zzex)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                }
                else if(((Boolean)zzba.zzc().zzb(zzbbr.zzev)).booleanValue()) {
                    String s3 = (String)zzba.zzc().zzb(zzbbr.zzew);
                    if(!s3.isEmpty() && context0 != null) {
                        for(Object object0: zzfrv.zzc(zzfqt.zzc(';')).zzd(s3)) {
                            if(((String)object0).equals("com.fmkorea.m.fmk")) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                else {
                    z = true;
                }
            }
            boolean z3 = zzbcs.zzg(zzcfi0.getContext());
            if(z) {
                if(!z3) {
                    this.zzm(4);
                    map0.put("use_first_package", "true");
                    map0.put("use_running_process", "true");
                    this.zzj(zza0, map0, z1, s2, z2);
                    return;
                }
                this.zzk(true);
                if(TextUtils.isEmpty(s)) {
                    zzcaa.zzj("Cannot open browser with null or empty url");
                    this.zzm(7);
                    return;
                }
                Uri uri0 = Uri.parse(s);
                Uri uri1 = zzbjc.zzd(zzbjc.zzc(zzcfi0.getContext(), zzcfi0.zzI(), uri0, zzcfi0.zzF(), zzcfi0.zzi()));
                if(z1 && this.zzf != null && this.zzl(zza0, zzcfi0.getContext(), uri1.toString(), s2)) {
                    return;
                }
                this.zzh = new zzbiz(this);
                ((zzcgn)zza0).zzaD(new zzc(null, uri1.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z2);
                return;
            }
            map0.put("use_first_package", "true");
            map0.put("use_running_process", "true");
            this.zzj(zza0, map0, z1, s2, z2);
            return;
        }
        if("app".equalsIgnoreCase(s1) && "true".equalsIgnoreCase(((String)map0.get("system_browser")))) {
            this.zzj(zza0, map0, z1, s2, z2);
            return;
        }
        if("open_app".equalsIgnoreCase(s1)) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zzhS)).booleanValue()) {
                return;
            }
            this.zzk(true);
            String s4 = (String)map0.get("p");
            if(s4 == null) {
                zzcaa.zzj("Package name missing from open app action.");
                return;
            }
            if(z1 && this.zzf != null && this.zzl(zza0, zzcfi0.getContext(), s4, s2)) {
                return;
            }
            PackageManager packageManager0 = zzcfi0.getContext().getPackageManager();
            if(packageManager0 == null) {
                zzcaa.zzj("Cannot get package manager from open app action.");
                return;
            }
            Intent intent0 = packageManager0.getLaunchIntentForPackage(s4);
            if(intent0 != null) {
                ((zzcgn)zza0).zzaD(new zzc(intent0, this.zzh), z2);
            }
            return;
        }
        this.zzk(true);
        String s5 = (String)map0.get("intent_url");
        Intent intent1 = null;
        if(!TextUtils.isEmpty(s5)) {
            try {
                intent1 = Intent.parseUri(s5, 0);
            }
            catch(URISyntaxException uRISyntaxException0) {
                zzcaa.zzh(("Error parsing the url: " + s5), uRISyntaxException0);
            }
        }
        if(intent1 != null && intent1.getData() != null) {
            Uri uri2 = intent1.getData();
            if(!Uri.EMPTY.equals(uri2)) {
                Uri uri3 = zzbjc.zzd(zzbjc.zzc(zzcfi0.getContext(), zzcfi0.zzI(), uri2, zzcfi0.zzF(), zzcfi0.zzi()));
                if(TextUtils.isEmpty(intent1.getType()) || !((Boolean)zzba.zzc().zzb(zzbbr.zzhT)).booleanValue()) {
                    intent1.setData(uri3);
                }
                else {
                    intent1.setDataAndType(uri3, intent1.getType());
                }
            }
        }
        boolean z4 = ((Boolean)zzba.zzc().zzb(zzbbr.zzih)).booleanValue() && "intent_async".equalsIgnoreCase(s1) && map0.containsKey("event_id");
        HashMap hashMap0 = new HashMap();
        if(z4) {
            hashMap1 = hashMap0;
            this.zzh = new zzbja(this, z2, zza0, hashMap0, map0);
            z2 = false;
        }
        else {
            hashMap1 = hashMap0;
        }
        if(intent1 != null) {
            if(z1 && this.zzf != null && this.zzl(zza0, zzcfi0.getContext(), intent1.getData().toString(), s2)) {
                if(z4) {
                    hashMap1.put(((String)map0.get("event_id")), Boolean.TRUE);
                    ((zzbll)zza0).zzd("openIntentAsync", hashMap1);
                }
                return;
            }
            ((zzcgn)zza0).zzaD(new zzc(intent1, this.zzh), z2);
            return;
        }
        if(TextUtils.isEmpty(s)) {
            s6 = s;
        }
        else {
            Uri uri4 = Uri.parse(s);
            s6 = zzbjc.zzd(zzbjc.zzc(zzcfi0.getContext(), zzcfi0.zzI(), uri4, zzcfi0.zzF(), zzcfi0.zzi())).toString();
        }
        if(z1 && this.zzf != null && this.zzl(zza0, zzcfi0.getContext(), s6, s2)) {
            if(z4) {
                hashMap1.put(((String)map0.get("event_id")), Boolean.TRUE);
                ((zzbll)zza0).zzd("openIntentAsync", hashMap1);
            }
            return;
        }
        ((zzcgn)zza0).zzaD(new zzc(((String)map0.get("i")), s6, ((String)map0.get("m")), ((String)map0.get("p")), ((String)map0.get("c")), ((String)map0.get("f")), ((String)map0.get("e")), this.zzh), z2);
    }

    private final void zzi(Context context0, String s, String s1) {
        this.zzf.zzc(s);
        zzdrh zzdrh0 = this.zzb;
        if(zzdrh0 != null) {
            zzfug zzfug0 = zzfug.zze("dialog_not_shown_reason", s1);
            zzecs.zzc(context0, zzdrh0, this.zzc, this.zzf, s, "dialog_not_shown", zzfug0);
        }
    }

    private final void zzj(zza zza0, Map map0, boolean z, String s, boolean z1) {
        boolean z2 = true;
        this.zzk(true);
        Context context0 = ((zzcfi)zza0).getContext();
        zzaqx zzaqx0 = ((zzcfi)zza0).zzI();
        View view0 = ((zzcfi)zza0).zzF();
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        String s1 = (String)map0.get("u");
        Intent intent0 = null;
        if(!TextUtils.isEmpty(s1)) {
            Uri uri0 = zzbjc.zzd(zzbjc.zzc(context0, zzaqx0, Uri.parse(s1), view0, null));
            boolean z3 = Boolean.parseBoolean(((String)map0.get("use_first_package")));
            boolean z4 = Boolean.parseBoolean(((String)map0.get("use_running_process")));
            if(!Boolean.parseBoolean(((String)map0.get("use_custom_tabs"))) && !((Boolean)zzba.zzc().zzb(zzbbr.zzep)).booleanValue()) {
                z2 = false;
            }
            if("http".equalsIgnoreCase(uri0.getScheme())) {
                intent0 = uri0.buildUpon().scheme("https").build();
            }
            else if("https".equalsIgnoreCase(uri0.getScheme())) {
                intent0 = uri0.buildUpon().scheme("http").build();
            }
            ArrayList arrayList0 = new ArrayList();
            Intent intent1 = zzbjb.zza(uri0, context0, zzaqx0, view0);
            Intent intent2 = zzbjb.zza(((Uri)intent0), context0, zzaqx0, view0);
            if(z2) {
                zzs.zzm(context0, intent1);
                zzs.zzm(context0, intent2);
            }
            ResolveInfo resolveInfo0 = zzbjb.zzd(intent1, arrayList0, context0, zzaqx0, view0);
            if(resolveInfo0 != null) {
                intent0 = zzbjb.zzb(intent1, resolveInfo0, context0, zzaqx0, view0);
            }
            else if(intent2 == null) {
            label_34:
                if(arrayList0.isEmpty()) {
                    intent0 = intent1;
                }
                else {
                    if(z4 && activityManager0 != null) {
                        List list0 = activityManager0.getRunningAppProcesses();
                        if(list0 != null) {
                            int v = arrayList0.size();
                            int v1 = 0;
                            while(v1 < v) {
                                ResolveInfo resolveInfo2 = (ResolveInfo)arrayList0.get(v1);
                                for(Object object0: list0) {
                                    if(!((ActivityManager.RunningAppProcessInfo)object0).processName.equals(resolveInfo2.activityInfo.packageName)) {
                                        continue;
                                    }
                                    intent0 = zzbjb.zzb(intent1, resolveInfo2, context0, zzaqx0, view0);
                                    goto label_56;
                                }
                                ++v1;
                            }
                        }
                    }
                    intent0 = z3 ? zzbjb.zzb(intent1, ((ResolveInfo)arrayList0.get(0)), context0, zzaqx0, view0) : intent1;
                }
            }
            else {
                ResolveInfo resolveInfo1 = zzbjb.zzc(intent2, context0, zzaqx0, view0);
                if(resolveInfo1 == null) {
                    goto label_34;
                }
                else {
                    intent0 = zzbjb.zzb(intent1, resolveInfo1, context0, zzaqx0, view0);
                    if(zzbjb.zzc(intent0, context0, zzaqx0, view0) == null) {
                        goto label_34;
                    }
                }
            }
        }
    label_56:
        if(z && this.zzf != null && intent0 != null && this.zzl(zza0, ((zzcfi)zza0).getContext(), intent0.getData().toString(), s)) {
            return;
        }
        try {
            ((zzcgn)zza0).zzaD(new zzc(intent0, this.zzh), z1);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzcaa.zzj(activityNotFoundException0.getMessage());
        }
    }

    private final void zzk(boolean z) {
        zzbqz zzbqz0 = this.zze;
        if(zzbqz0 != null) {
            zzbqz0.zza(z);
        }
    }

    private final boolean zzl(zza zza0, Context context0, String s, String s1) {
        zzdrh zzdrh0 = this.zzb;
        if(zzdrh0 != null) {
            HashMap hashMap0 = new HashMap();
            zzecs.zzc(context0, zzdrh0, this.zzc, this.zzf, s1, "offline_open", hashMap0);
        }
        if(zzt.zzo().zzx(context0)) {
            this.zzf.zzh(this.zzd, s1);
            return false;
        }
        zzbr zzbr0 = zzs.zzw(context0);
        boolean z = p.d(context0).a();
        boolean z1 = zzt.zzq().zzi(context0, "offline_notification_channel");
        zzcfi zzcfi0 = (zzcfi)zza0;
        boolean z2 = zzcfi0.zzL() != null && zzcfi0.zzi() == null;
        if(!z && (p.d(context0).a() || !(Build.VERSION.SDK_INT >= 33 ? ((Boolean)zzba.zzc().zzb(zzbbr.zzic)).booleanValue() : ((Boolean)zzba.zzc().zzb(zzbbr.zzid)).booleanValue()))) {
            this.zzi(context0, s1, "notifications_disabled");
            return false;
        }
        if(z1) {
            this.zzi(context0, s1, "notification_channel_disabled");
            return false;
        }
        if(zzbr0 == null) {
            this.zzi(context0, s1, "work_manager_unavailable");
            return false;
        }
        if(z2) {
            this.zzi(context0, s1, "ad_no_activity");
            return false;
        }
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzia)).booleanValue()) {
            this.zzi(context0, s1, "notification_flow_disabled");
            return false;
        }
        if(zzcfi0.zzL() == null) {
            ((zzcgn)zza0).zzaE(s1, s, 14);
        }
        else {
            zzect zzect0 = zzecu.zze();
            zzect0.zza(zzcfi0.zzi());
            zzect0.zzb(null);
            zzect0.zzc(s1);
            zzect0.zzd(s);
            zzecu zzecu0 = zzect0.zze();
            try {
                zzcfi0.zzL().zzf(zzecu0);
            }
            catch(Exception exception0) {
                this.zzi(context0, s1, exception0.getMessage());
                return false;
            }
        }
        zza0.onAdClicked();
        return true;
    }

    private final void zzm(int v) {
        if(this.zzb == null) {
            return;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgn zzfgn0 = zzfgn.zzb("cct_action");
            zzfgn0.zza("cct_open_status", zzbcr.zza(v));
            this.zzc.zzb(zzfgn0);
            return;
        }
        zzdrg zzdrg0 = this.zzb.zza();
        zzdrg0.zzb("action", "cct_action");
        zzdrg0.zzb("cct_open_status", zzbcr.zza(v));
        zzdrg0.zzg();
    }
}

