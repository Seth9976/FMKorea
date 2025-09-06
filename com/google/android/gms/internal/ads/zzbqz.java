package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

public final class zzbqz extends zzbrf {
    static final Set zza;
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcfi zzk;
    private final Activity zzl;
    private zzcgx zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbrg zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    static {
        zzbqz.zza = CollectionUtils.setOf(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    }

    public zzbqz(zzcfi zzcfi0, zzbrg zzbrg0) {
        super(zzcfi0, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcfi0;
        this.zzl = zzcfi0.zzi();
        this.zzp = zzbrg0;
    }

    public final void zza(boolean z) {
        synchronized(this.zzj) {
            PopupWindow popupWindow0 = this.zzq;
            if(popupWindow0 != null) {
                popupWindow0.dismiss();
                this.zzr.removeView(((View)this.zzk));
                ViewGroup viewGroup0 = this.zzs;
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.zzn);
                    this.zzs.addView(((View)this.zzk));
                    this.zzk.zzag(this.zzm);
                }
                if(z) {
                    this.zzk("default");
                    zzbrg zzbrg0 = this.zzp;
                    if(zzbrg0 != null) {
                        zzbrg0.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    public final void zzb(Map map0) {
        int v16;
        int v6;
        int v5;
        int[] arr_v2;
        synchronized(this.zzj) {
            if(this.zzl == null) {
                this.zzg("Not an activity context. Cannot resize.");
                return;
            }
            if(this.zzk.zzO() == null) {
                this.zzg("Webview is not yet available, size is not set.");
                return;
            }
            if(this.zzk.zzO().zzi()) {
                this.zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if(!this.zzk.zzaA()) {
                if(!TextUtils.isEmpty(((CharSequence)map0.get("width")))) {
                    this.zzi = zzs.zzL(((String)map0.get("width")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("height")))) {
                    this.zzf = zzs.zzL(((String)map0.get("height")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetX")))) {
                    this.zzg = zzs.zzL(((String)map0.get("offsetX")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetY")))) {
                    this.zzh = zzs.zzL(((String)map0.get("offsetY")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("allowOffscreen")))) {
                    this.zzc = Boolean.parseBoolean(((String)map0.get("allowOffscreen")));
                }
                String s = (String)map0.get("customClosePosition");
                if(!TextUtils.isEmpty(s)) {
                    this.zzb = s;
                }
                if(this.zzi >= 0 && this.zzf >= 0) {
                    Window window0 = this.zzl.getWindow();
                    if(window0 != null && window0.getDecorView() != null) {
                        int[] arr_v = zzs.zzS(this.zzl);
                        int[] arr_v1 = zzs.zzO(this.zzl);
                        int v1 = arr_v[0];
                        int v2 = arr_v[1];
                        int v3 = this.zzi;
                        if(v3 < 50 || v3 > v1) {
                            zzcaa.zzj("Width is too small or too large.");
                            arr_v2 = null;
                        }
                        else {
                            int v4 = this.zzf;
                            if(v4 < 50 || v4 > v2) {
                                zzcaa.zzj("Height is too small or too large.");
                                arr_v2 = null;
                            }
                            else if(v4 == v2 && v3 == v1) {
                                zzcaa.zzj("Cannot resize to a full-screen ad.");
                                arr_v2 = null;
                            }
                            else if(this.zzc) {
                                switch(this.zzb) {
                                    case "bottom-center": {
                                        v5 = this.zzd + this.zzg + (v3 >> 1) - 25;
                                        v6 = this.zze + this.zzh + v4 - 50;
                                        break;
                                    }
                                    case "bottom-left": {
                                        v5 = this.zzd + this.zzg;
                                        v6 = this.zze + this.zzh + v4 - 50;
                                        break;
                                    }
                                    case "bottom-right": {
                                        v5 = this.zzd + this.zzg + v3 - 50;
                                        v6 = this.zze + this.zzh + v4 - 50;
                                        break;
                                    }
                                    case "center": {
                                        v5 = this.zzd + this.zzg + (v3 >> 1) - 25;
                                        v6 = this.zze + this.zzh + (v4 >> 1) - 25;
                                        break;
                                    }
                                    case "top-center": {
                                        v5 = this.zzd + this.zzg + (v3 >> 1) - 25;
                                        v6 = this.zze + this.zzh;
                                        break;
                                    }
                                    case "top-left": {
                                        v5 = this.zzd + this.zzg;
                                        v6 = this.zze + this.zzh;
                                        break;
                                    }
                                    default: {
                                        v5 = this.zzd + this.zzg + v3 - 50;
                                        v6 = this.zze + this.zzh;
                                    }
                                }
                                arr_v2 = v5 < 0 || v5 + 50 > v1 || v6 < arr_v1[0] || v6 + 50 > arr_v1[1] ? null : new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                            }
                            else {
                                int[] arr_v3 = zzs.zzS(this.zzl);
                                int[] arr_v4 = zzs.zzO(this.zzl);
                                int v7 = arr_v3[0];
                                int v8 = this.zzd + this.zzg;
                                int v9 = this.zze + this.zzh;
                                if(v8 < 0) {
                                    v8 = 0;
                                }
                                else {
                                    int v10 = this.zzi;
                                    if(v8 + v10 > v7) {
                                        v8 = v7 - v10;
                                    }
                                }
                                int v11 = arr_v4[0];
                                if(v9 < v11) {
                                    v9 = v11;
                                }
                                else {
                                    int v12 = this.zzf;
                                    int v13 = arr_v4[1];
                                    if(v9 + v12 > v13) {
                                        v9 = v13 - v12;
                                    }
                                }
                                arr_v2 = new int[]{v8, v9};
                            }
                        }
                        if(arr_v2 == null) {
                            this.zzg("Resize location out of screen or close button is not visible.");
                            return;
                        }
                        int v14 = zzbzt.zzx(this.zzl, this.zzi);
                        int v15 = zzbzt.zzx(this.zzl, this.zzf);
                        ViewParent viewParent0 = ((View)this.zzk).getParent();
                        if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                            ((ViewGroup)viewParent0).removeView(((View)this.zzk));
                            PopupWindow popupWindow0 = this.zzq;
                            if(popupWindow0 == null) {
                                this.zzs = (ViewGroup)viewParent0;
                                ((View)this.zzk).setDrawingCacheEnabled(true);
                                Bitmap bitmap0 = Bitmap.createBitmap(((View)this.zzk).getDrawingCache());
                                ((View)this.zzk).setDrawingCacheEnabled(false);
                                ImageView imageView0 = new ImageView(this.zzl);
                                this.zzn = imageView0;
                                imageView0.setImageBitmap(bitmap0);
                                this.zzm = this.zzk.zzO();
                                this.zzs.addView(this.zzn);
                            }
                            else {
                                popupWindow0.dismiss();
                            }
                            RelativeLayout relativeLayout0 = new RelativeLayout(this.zzl);
                            this.zzr = relativeLayout0;
                            relativeLayout0.setBackgroundColor(0);
                            this.zzr.setLayoutParams(new ViewGroup.LayoutParams(v14, v15));
                            PopupWindow popupWindow1 = new PopupWindow(this.zzr, v14, v15, false);
                            this.zzq = popupWindow1;
                            popupWindow1.setOutsideTouchable(false);
                            this.zzq.setTouchable(true);
                            this.zzq.setClippingEnabled(!this.zzc);
                            this.zzr.addView(((View)this.zzk), -1, -1);
                            this.zzo = new LinearLayout(this.zzl);
                            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(zzbzt.zzx(this.zzl, 50), zzbzt.zzx(this.zzl, 50));
                            switch(this.zzb) {
                                case "bottom-center": {
                                    v16 = 4;
                                    goto label_148;
                                }
                                case "bottom-left": {
                                    v16 = 3;
                                    goto label_148;
                                }
                                case "bottom-right": {
                                    relativeLayout$LayoutParams0.addRule(12);
                                    relativeLayout$LayoutParams0.addRule(11);
                                    break;
                                }
                                case "center": {
                                    v16 = 2;
                                    goto label_148;
                                }
                                case "top-center": {
                                    v16 = 1;
                                label_148:
                                    if(v16 == 0) {
                                        relativeLayout$LayoutParams0.addRule(10);
                                        relativeLayout$LayoutParams0.addRule(9);
                                    }
                                    else {
                                        switch(v16) {
                                            case 1: {
                                                relativeLayout$LayoutParams0.addRule(10);
                                                relativeLayout$LayoutParams0.addRule(14);
                                                break;
                                            }
                                            case 2: {
                                                relativeLayout$LayoutParams0.addRule(13);
                                                break;
                                            }
                                            case 3: {
                                                relativeLayout$LayoutParams0.addRule(12);
                                                relativeLayout$LayoutParams0.addRule(9);
                                                break;
                                            }
                                            case 4: {
                                                relativeLayout$LayoutParams0.addRule(12);
                                                relativeLayout$LayoutParams0.addRule(14);
                                                break;
                                            }
                                            default: {
                                                relativeLayout$LayoutParams0.addRule(10);
                                                relativeLayout$LayoutParams0.addRule(11);
                                            }
                                        }
                                    }
                                    break;
                                }
                                case "top-left": {
                                    v16 = 0;
                                    goto label_148;
                                }
                                default: {
                                    v16 = -1;
                                    goto label_148;
                                }
                            }
                            this.zzo.setOnClickListener(new zzbqy(this));
                            this.zzo.setContentDescription("Close button");
                            this.zzr.addView(this.zzo, relativeLayout$LayoutParams0);
                            try {
                                this.zzq.showAtLocation(window0.getDecorView(), 0, zzbzt.zzx(this.zzl, arr_v2[0]), zzbzt.zzx(this.zzl, arr_v2[1]));
                            }
                            catch(RuntimeException runtimeException0) {
                                this.zzg("Cannot show popup window: " + runtimeException0.getMessage());
                                this.zzr.removeView(((View)this.zzk));
                                ViewGroup viewGroup0 = this.zzs;
                                if(viewGroup0 != null) {
                                    viewGroup0.removeView(this.zzn);
                                    this.zzs.addView(((View)this.zzk));
                                    this.zzk.zzag(this.zzm);
                                }
                                return;
                            }
                            int v17 = arr_v2[0];
                            int v18 = arr_v2[1];
                            zzbrg zzbrg0 = this.zzp;
                            if(zzbrg0 != null) {
                                zzbrg0.zza(v17, v18, this.zzi, this.zzf);
                            }
                            zzcgx zzcgx0 = zzcgx.zzb(v14, v15);
                            this.zzk.zzag(zzcgx0);
                            this.zzj(arr_v2[0], arr_v2[1] - zzs.zzO(this.zzl)[0], this.zzi, this.zzf);
                            this.zzk("resized");
                            return;
                        }
                        this.zzg("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    this.zzg("Activity context is not ready, cannot get window or decor view.");
                    return;
                }
                this.zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            this.zzg("Cannot resize an expanded banner.");
        }
    }

    public final void zzc(int v, int v1, boolean z) {
        synchronized(this.zzj) {
            this.zzd = v;
            this.zze = v1;
        }
    }

    public final void zzd(int v, int v1) {
        this.zzd = v;
        this.zze = v1;
    }

    public final boolean zze() {
        synchronized(this.zzj) {
        }
        return this.zzq != null;
    }
}

