package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzave extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzauv zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzave() {
        zzauv zzauv0 = new zzauv();
        super();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzauv0;
        this.zzc = new Object();
        this.zzf = ((Long)zzbdc.zzd.zze()).intValue();
        this.zzg = ((Long)zzbdc.zza.zze()).intValue();
        this.zzh = ((Long)zzbdc.zze.zze()).intValue();
        this.zzi = ((Long)zzbdc.zzc.zze()).intValue();
        this.zzj = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzT)));
        this.zzk = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzU)));
        this.zzl = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzV)));
        this.zze = ((Long)zzbdc.zzf.zze()).intValue();
        this.zzm = (String)zzba.zzc().zzb(zzbbr.zzX);
        this.zzn = ((Boolean)zzba.zzc().zzb(zzbbr.zzY)).booleanValue();
        this.zzo = ((Boolean)zzba.zzc().zzb(zzbbr.zzZ)).booleanValue();
        this.zzp = ((Boolean)zzba.zzc().zzb(zzbbr.zzaa)).booleanValue();
        this.setName("ContentFetchTask");
    }

    @Override
    public final void run() {
        Activity activity0;
        View view0;
        while(true) {
            try {
                Context context0 = zzt.zzb().zzb();
                if(context0 != null) {
                    ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
                    KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
                    if(activityManager0 != null && keyguardManager0 != null) {
                        List list0 = activityManager0.getRunningAppProcesses();
                        if(list0 != null) {
                            Iterator iterator0 = list0.iterator();
                            while(true) {
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object0 = iterator0.next();
                                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                                if(Process.myPid() == activityManager$RunningAppProcessInfo0.pid) {
                                    if(activityManager$RunningAppProcessInfo0.importance == 100 && !keyguardManager0.inKeyguardRestrictedInputMode()) {
                                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                                        if(powerManager0 != null && powerManager0.isScreenOn()) {
                                            goto label_21;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    zzt.zzo().zzu(throwable0, "ContentFetchTask.isInForeground");
                label_18:
                    zzcaa.zze("ContentFetchTask: sleeping");
                    this.zzf();
                    goto label_35;
                label_21:
                    view0 = null;
                    activity0 = zzt.zzb().zza();
                    if(activity0 == null) {
                        zzcaa.zze("ContentFetchThread: no activity. Sleeping.");
                        this.zzf();
                        goto label_35;
                    }
                }
                catch(InterruptedException interruptedException0) {
                    zzcaa.zzh("Error in ContentFetchTask", interruptedException0);
                    goto label_43;
                }
                catch(Exception exception0) {
                    goto label_41;
                }
            }
            try {
                if(activity0.getWindow() != null && activity0.getWindow().getDecorView() != null) {
                    view0 = activity0.getWindow().getDecorView().findViewById(0x1020002);
                }
                goto label_33;
            }
            catch(Exception exception1) {
                try {
                    zzt.zzo().zzu(exception1, "ContentFetchTask.extractContent");
                    zzcaa.zze("Failed getting root view of activity. Content not extracted.");
                label_33:
                    if(view0 != null) {
                        view0.post(new zzava(this, view0));
                    }
                label_35:
                    Thread.sleep(this.zze * 1000);
                    goto label_43;
                }
                catch(InterruptedException interruptedException0) {
                }
                catch(Exception exception0) {
                    goto label_41;
                }
            }
            zzcaa.zzh("Error in ContentFetchTask", interruptedException0);
            goto label_43;
        label_41:
            zzcaa.zzh("Error in ContentFetchTask", exception0);
            zzt.zzo().zzu(exception0, "ContentFetchTask.run");
        label_43:
            synchronized(this.zzc) {
                while(this.zzb) {
                    try {
                        zzcaa.zze("ContentFetchTask: waiting");
                        this.zzc.wait();
                    }
                    catch(InterruptedException unused_ex) {
                    }
                }
            }
        }
    }

    public final zzauu zza() {
        return this.zzd.zza(this.zzp);
    }

    final zzavd zzb(View view0, zzauu zzauu0) {
        if(view0 == null) {
            return new zzavd(this, 0, 0);
        }
        boolean z = view0.getGlobalVisibleRect(new Rect());
        if(view0 instanceof TextView && !(view0 instanceof EditText)) {
            CharSequence charSequence0 = ((TextView)view0).getText();
            if(!TextUtils.isEmpty(charSequence0)) {
                zzauu0.zzk(charSequence0.toString(), z, view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
                return new zzavd(this, 1, 0);
            }
            return new zzavd(this, 0, 0);
        }
        if(view0 instanceof WebView && !(view0 instanceof zzcfi)) {
            zzauu0.zzh();
            ((WebView)view0).post(new zzavc(this, zzauu0, ((WebView)view0), z));
            return new zzavd(this, 0, 1);
        }
        if(view0 instanceof ViewGroup) {
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                zzavd zzavd0 = this.zzb(((ViewGroup)view0).getChildAt(v), zzauu0);
                v1 += zzavd0.zza;
                v2 += zzavd0.zzb;
            }
            return new zzavd(this, v1, v2);
        }
        return new zzavd(this, 0, 0);
    }

    final void zzc(View view0) {
        try {
            zzauu zzauu0 = new zzauu(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context context0 = zzt.zzb().zzb();
            if(context0 != null && !TextUtils.isEmpty(this.zzm)) {
                String s = (String)view0.getTag(context0.getResources().getIdentifier(((String)zzba.zzc().zzb(zzbbr.zzW)), "id", "com.fmkorea.m.fmk"));
                if(s != null && s.equals(this.zzm)) {
                    return;
                }
            }
            zzavd zzavd0 = this.zzb(view0, zzauu0);
            zzauu0.zzm();
            if(zzavd0.zza == 0 && zzavd0.zzb == 0) {
                return;
            }
            if(zzavd0.zzb == 0) {
                if(zzauu0.zzc() == 0) {
                    return;
                }
                if(this.zzd.zzd(zzauu0)) {
                    return;
                }
            }
            this.zzd.zzb(zzauu0);
            return;
        }
        catch(Exception exception0) {
        }
        zzcaa.zzh("Exception in fetchContentOnUIThread", exception0);
        zzt.zzo().zzu(exception0, "ContentFetchTask.fetchContent");
    }

    final void zzd(zzauu zzauu0, WebView webView0, String s, boolean z) {
        zzauu0.zzg();
        try {
            if(!TextUtils.isEmpty(s)) {
                String s1 = new JSONObject(s).optString("text");
                if(this.zzn || TextUtils.isEmpty(webView0.getTitle())) {
                    zzauu0.zzl(s1, z, webView0.getX(), webView0.getY(), ((float)webView0.getWidth()), ((float)webView0.getHeight()));
                }
                else {
                    zzauu0.zzl(webView0.getTitle() + "\n" + s1, z, webView0.getX(), webView0.getY(), ((float)webView0.getWidth()), ((float)webView0.getHeight()));
                }
            }
            if(zzauu0.zzo()) {
                this.zzd.zzc(zzauu0);
            }
            return;
        }
        catch(JSONException unused_ex) {
        }
        catch(Throwable throwable0) {
            zzcaa.zzf("Failed to get webview content.", throwable0);
            zzt.zzo().zzu(throwable0, "ContentFetchTask.processWebViewContent");
            return;
        }
        zzcaa.zze("Json string may be malformed.");
    }

    public final void zze() {
        synchronized(this.zzc) {
            if(this.zza) {
                zzcaa.zze("Content hash thread already started, quitting...");
                return;
            }
            this.zza = true;
        }
        this.start();
    }

    public final void zzf() {
        synchronized(this.zzc) {
            this.zzb = true;
            zzcaa.zze(("ContentFetchThread: paused, pause = " + true));
        }
    }

    public final void zzg() {
        synchronized(this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            zzcaa.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}

