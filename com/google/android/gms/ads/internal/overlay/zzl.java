package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzect;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzfip;
import java.util.Collections;

public class zzl extends zzbsb implements zzad {
    static final int zza;
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcfi zzd;
    zzh zze;
    zzr zzf;
    boolean zzg;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    boolean zzj;
    boolean zzk;
    zzg zzl;
    boolean zzm;
    int zzn;
    private final Object zzo;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;

    static {
        zzl.zza = 0;
    }

    public zzl(Activity activity0) {
        this.zzg = false;
        this.zzj = false;
        this.zzk = false;
        this.zzm = false;
        this.zzn = 1;
        this.zzo = new Object();
        this.zzs = false;
        this.zzt = false;
        this.zzu = true;
        this.zzb = activity0;
    }

    public final void zzA(int v) {
        if(35 >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfQ)))) && 35 <= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfR))))) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfS)))) && v1 <= ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzfT))))) {
                return;
            }
        }
        try {
            this.zzb.setRequestedOrientation(v);
        }
        catch(Throwable throwable0) {
            zzt.zzo().zzt(throwable0, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if(z) {
            this.zzl.setBackgroundColor(0);
            return;
        }
        this.zzl.setBackgroundColor(0xFF000000);
    }

    public final void zzC(View view0, WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0) {
        FrameLayout frameLayout0 = new FrameLayout(this.zzb);
        this.zzh = frameLayout0;
        frameLayout0.setBackgroundColor(0xFF000000);
        this.zzh.addView(view0, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = webChromeClient$CustomViewCallback0;
        this.zzg = true;
    }

    protected final void zzD(boolean z) {
        zzcfi zzcfi4;
        if(!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window0 = this.zzb.getWindow();
        if(window0 != null) {
            zzcfi zzcfi0 = this.zzc.zzd;
            zzb zzb0 = null;
            zzcgv zzcgv0 = zzcfi0 == null ? null : zzcfi0.zzN();
            boolean z1 = false;
            boolean z2 = zzcgv0 != null && zzcgv0.zzK();
            this.zzm = false;
            if(z2) {
                int v = this.zzc.zzj;
                if(v == 6) {
                    if(this.zzb.getResources().getConfiguration().orientation == 1) {
                        z1 = true;
                    }
                    this.zzm = z1;
                }
                else if(v == 7) {
                    if(this.zzb.getResources().getConfiguration().orientation == 2) {
                        z1 = true;
                    }
                    this.zzm = z1;
                }
            }
            zzcaa.zze(("Delay onShow to next orientation change: " + z1));
            this.zzA(this.zzc.zzj);
            window0.setFlags(0x1000000, 0x1000000);
            zzcaa.zze("Hardware acceleration on the AdActivity window enabled.");
            if(this.zzk) {
                this.zzl.setBackgroundColor(zzl.zza);
            }
            else {
                this.zzl.setBackgroundColor(0xFF000000);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if(z) {
                try {
                    zzcfi zzcfi1 = this.zzc.zzd;
                    zzcgx zzcgx0 = zzcfi1 == null ? null : zzcfi1.zzO();
                    zzcfi zzcfi2 = this.zzc.zzd;
                    String s = zzcfi2 == null ? null : zzcfi2.zzS();
                    zzcfi zzcfi3 = this.zzc.zzd;
                    zzcfi4 = zzcfu.zza(this.zzb, zzcgx0, s, true, z2, null, null, this.zzc.zzm, null, null, (zzcfi3 == null ? null : zzcfi3.zzj()), zzaxe.zza(), null, null, null);
                    this.zzd = zzcfi4;
                }
                catch(Exception exception0) {
                    zzcaa.zzh("Error obtaining webview.", exception0);
                    throw new zzf("Could not obtain webview for the overlay.", exception0);
                }
                zzcgv zzcgv1 = zzcfi4.zzN();
                zzbhh zzbhh0 = this.zzc.zzp;
                zzbhj zzbhj0 = this.zzc.zze;
                zzz zzz0 = this.zzc.zzi;
                zzcfi zzcfi5 = this.zzc.zzd;
                if(zzcfi5 != null) {
                    zzb0 = zzcfi5.zzN().zzd();
                }
                zzcgv1.zzM(null, zzbhh0, null, zzbhj0, zzz0, true, null, zzb0, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzA(new zzd(this));
                AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
                String s1 = adOverlayInfoParcel0.zzl;
                if(s1 == null) {
                    String s2 = adOverlayInfoParcel0.zzh;
                    if(s2 == null) {
                        throw new zzf("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel0.zzf, s2, "text/html", "UTF-8", null);
                }
                else {
                    this.zzd.loadUrl(s1);
                }
                zzcfi zzcfi6 = this.zzc.zzd;
                if(zzcfi6 != null) {
                    zzcfi6.zzar(this);
                }
            }
            else {
                zzcfi zzcfi7 = this.zzc.zzd;
                this.zzd = zzcfi7;
                zzcfi7.zzak(this.zzb);
            }
            this.zzd.zzaf(this);
            zzcfi zzcfi8 = this.zzc.zzd;
            if(zzcfi8 != null) {
                zzl.zzJ(zzcfi8.zzQ(), this.zzl);
            }
            if(this.zzc.zzk != 5) {
                ViewParent viewParent0 = this.zzd.getParent();
                if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(this.zzd.zzF());
                }
                if(this.zzk) {
                    this.zzd.zzaj();
                }
                this.zzl.addView(this.zzd.zzF(), -1, -1);
            }
            if(!z && !this.zzm) {
                this.zze();
            }
            if(this.zzc.zzk != 5) {
                this.zzw(z2);
                if(this.zzd.zzaw()) {
                    this.zzy(z2, true);
                }
                return;
            }
            zzect zzect0 = zzecu.zze();
            zzect0.zza(this.zzb);
            zzect0.zzb(this);
            zzect0.zzc(this.zzc.zzq);
            zzect0.zzd(this.zzc.zzr);
            zzecu zzecu0 = zzect0.zze();
            try {
                this.zzf(zzecu0);
                return;
            }
            catch(zzf | RemoteException zzf0) {
                throw new zzf(zzf0.getMessage(), zzf0);
            }
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzE() {
        synchronized(this.zzo) {
            this.zzq = true;
            Runnable runnable0 = this.zzp;
            if(runnable0 != null) {
                zzs.zza.removeCallbacks(runnable0);
                zzs.zza.post(this.zzp);
            }
        }
    }

    protected final void zzF() {
        if(this.zzb.isFinishing() && !this.zzs) {
            this.zzs = true;
            zzcfi zzcfi0 = this.zzd;
            if(zzcfi0 != null) {
                zzcfi0.zzW(this.zzn - 1);
                Object object0 = this.zzo;
                synchronized(object0) {
                    if(!this.zzq && this.zzd.zzax()) {
                        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeF)).booleanValue() && !this.zzt) {
                            AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
                            if(adOverlayInfoParcel0 != null) {
                                zzo zzo0 = adOverlayInfoParcel0.zzc;
                                if(zzo0 != null) {
                                    zzo0.zzbu();
                                }
                            }
                        }
                        zze zze0 = new zze(this);
                        this.zzp = zze0;
                        long v1 = (long)(((Long)zzba.zzc().zzb(zzbbr.zzaV)));
                        zzs.zza.postDelayed(zze0, v1);
                        return;
                    }
                }
            }
            this.zzc();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final boolean zzG() {
        this.zzn = 1;
        if(this.zzd == null) {
            return true;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean z = this.zzd.zzaC();
        if(!z) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return z;
    }

    private final void zzI(Configuration configuration0) {
        int v;
        boolean z = true;
        boolean z1 = false;
        boolean z2 = this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzb);
        boolean z3 = zzt.zzq().zze(this.zzb, configuration0);
        if(this.zzk && !z2) {
            z = false;
        }
        else if(z3) {
            z = false;
        }
        else if(this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzg)) {
            z1 = true;
        }
        Window window0 = this.zzb.getWindow();
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbc)).booleanValue()) {
            View view0 = window0.getDecorView();
            if(!z) {
                v = 0x100;
            }
            else if(z1) {
                v = 0x1706;
            }
            else {
                v = 5380;
            }
            view0.setSystemUiVisibility(v);
            return;
        }
        if(z) {
            window0.addFlags(0x400);
            window0.clearFlags(0x800);
            if(z1) {
                window0.getDecorView().setSystemUiVisibility(0x1002);
            }
            return;
        }
        window0.addFlags(0x800);
        window0.clearFlags(0x400);
    }

    private static final void zzJ(zzfip zzfip0, View view0) {
        if(zzfip0 != null && view0 != null) {
            zzt.zzA().zzh(zzfip0, view0);
        }
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        if(this.zzc != null && this.zzc.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    final void zzc() {
        if(this.zzt) {
            return;
        }
        this.zzt = true;
        zzcfi zzcfi0 = this.zzd;
        if(zzcfi0 != null) {
            this.zzl.removeView(zzcfi0.zzF());
            zzh zzh0 = this.zze;
            if(zzh0 != null) {
                this.zzd.zzak(zzh0.zzd);
                this.zzd.zzan(false);
                this.zze.zzc.addView(this.zzd.zzF(), this.zze.zza, this.zze.zzb);
                this.zze = null;
            }
            else if(this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzby(this.zzn);
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel1 = this.zzc;
        if(adOverlayInfoParcel1 != null) {
            zzcfi zzcfi1 = adOverlayInfoParcel1.zzd;
            if(zzcfi1 != null) {
                zzl.zzJ(zzcfi1.zzQ(), this.zzc.zzd.zzF());
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzX();
    }

    public final void zzf(zzecu zzecu0) {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzbrv zzbrv0 = adOverlayInfoParcel0.zzv;
            if(zzbrv0 != null) {
                zzbrv0.zzg(ObjectWrapper.wrap(zzecu0));
                return;
            }
        }
        throw new zzf("noioou");
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null && this.zzg) {
            this.zzA(adOverlayInfoParcel0.zzj);
        }
        if(this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback webChromeClient$CustomViewCallback0 = this.zzi;
        if(webChromeClient$CustomViewCallback0 != null) {
            webChromeClient$CustomViewCallback0.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzh(int v, int v1, Intent intent0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzi() {
        this.zzn = 1;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        this.zzI(((Configuration)ObjectWrapper.unwrap(iObjectWrapper0)));
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public void zzl(Bundle bundle0) {
        if(!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            this.zzj = z;
            AdOverlayInfoParcel adOverlayInfoParcel0 = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcel0;
            if(adOverlayInfoParcel0 != null) {
                if(adOverlayInfoParcel0.zzm.zzc > 7500000) {
                    this.zzn = 4;
                }
                if(this.zzb.getIntent() != null) {
                    this.zzu = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
                }
                AdOverlayInfoParcel adOverlayInfoParcel1 = this.zzc;
                zzj zzj0 = adOverlayInfoParcel1.zzo;
                if(zzj0 != null) {
                    this.zzk = zzj0.zza;
                    if(zzj0.zza) {
                        goto label_19;
                    }
                }
                else if(adOverlayInfoParcel1.zzk == 5) {
                    this.zzk = true;
                label_19:
                    if(adOverlayInfoParcel1.zzk != 5 && zzj0.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
                else {
                    this.zzk = false;
                }
                if(bundle0 == null) {
                    if(this.zzu) {
                        zzcwv zzcwv0 = this.zzc.zzt;
                        if(zzcwv0 != null) {
                            zzcwv0.zze();
                        }
                        zzo zzo0 = this.zzc.zzc;
                        if(zzo0 != null) {
                            zzo0.zzbv();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    if(adOverlayInfoParcel2.zzk != 1) {
                        zza zza0 = adOverlayInfoParcel2.zzb;
                        if(zza0 != null) {
                            zza0.onAdClicked();
                        }
                        zzddw zzddw0 = this.zzc.zzu;
                        if(zzddw0 != null) {
                            zzddw0.zzbK();
                        }
                    }
                }
                zzg zzg0 = new zzg(this.zzb, this.zzc.zzn, this.zzc.zzm.zza, this.zzc.zzs);
                this.zzl = zzg0;
                zzg0.setId(1000);
                zzt.zzq().zzl(this.zzb);
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                switch(adOverlayInfoParcel3.zzk) {
                    case 1: {
                        this.zzD(false);
                        return;
                    }
                    case 2: {
                        this.zze = new zzh(adOverlayInfoParcel3.zzd);
                        this.zzD(false);
                        return;
                    }
                    case 3: {
                        this.zzD(true);
                        return;
                    }
                    case 5: {
                        this.zzD(false);
                        return;
                    }
                    default: {
                        throw new zzf("Could not determine ad overlay type.");
                    }
                }
            }
            throw new zzf("Could not get info for ad overlay.");
        }
        catch(zzf zzf0) {
        }
        zzcaa.zzj(zzf0.getMessage());
        this.zzn = 4;
        this.zzb.finish();
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzm() {
        zzcfi zzcfi0 = this.zzd;
        if(zzcfi0 != null) {
            try {
                this.zzl.removeView(zzcfi0.zzF());
            }
            catch(NullPointerException unused_ex) {
            }
        }
        this.zzF();
    }

    public final void zzn() {
        if(this.zzm) {
            this.zzm = false;
            this.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzo() {
        this.zzg();
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzbo();
            }
        }
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzeH)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        this.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzp(int v, String[] arr_s, int[] arr_v) {
        if(v == 0x3039) {
            zzect zzect0 = zzecu.zze();
            zzect0.zza(this.zzb);
            zzect0.zzb((this.zzc.zzk == 5 ? this : null));
            zzecu zzecu0 = zzect0.zze();
            try {
                this.zzc.zzv.zzf(arr_s, arr_v, ObjectWrapper.wrap(zzecu0));
            }
            catch(RemoteException unused_ex) {
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzr() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzbL();
            }
        }
        this.zzI(this.zzb.getResources().getConfiguration());
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zzeH)).booleanValue()) {
            if(this.zzd != null && !this.zzd.zzaz()) {
                this.zzd.onResume();
                return;
            }
            zzcaa.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzs(Bundle bundle0) {
        bundle0.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzt() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeH)).booleanValue()) {
            if(this.zzd != null && !this.zzd.zzaz()) {
                this.zzd.onResume();
                return;
            }
            zzcaa.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzu() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzeH)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        this.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzv() {
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zzc;
        if(adOverlayInfoParcel0 != null) {
            zzo zzo0 = adOverlayInfoParcel0.zzc;
            if(zzo0 != null) {
                zzo0.zzbx();
            }
        }
    }

    public final void zzw(boolean z) {
        int v = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzeK)));
        int v1 = 0;
        int v2 = !((Boolean)zzba.zzc().zzb(zzbbr.zzaY)).booleanValue() && !z ? 0 : 1;
        zzq zzq0 = new zzq();
        zzq0.zzd = 50;
        zzq0.zza = 1 == v2 ? v : 0;
        if(1 != v2) {
            v1 = v;
        }
        zzq0.zzb = v1;
        zzq0.zzc = v;
        this.zzf = new zzr(this.zzb, zzq0, this);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(10);
        relativeLayout$LayoutParams0.addRule((1 == v2 ? 11 : 9));
        this.zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, relativeLayout$LayoutParams0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsc
    public final void zzx() {
        this.zzr = true;
    }

    public final void zzy(boolean z, boolean z1) {
        boolean z2 = true;
        boolean z3 = ((Boolean)zzba.zzc().zzb(zzbbr.zzaW)).booleanValue() && (this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzh));
        boolean z4 = ((Boolean)zzba.zzc().zzb(zzbbr.zzaX)).booleanValue() && (this.zzc != null && (this.zzc.zzo != null && this.zzc.zzo.zzi));
        if(z && z1 && z3 && !z4) {
            new zzbrf(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzr0 = this.zzf;
        if(zzr0 != null) {
            if(!z4 && (!z1 || z3)) {
                z2 = false;
            }
            zzr0.zzb(z2);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        this.zzw(true);
    }
}

