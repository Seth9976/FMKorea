package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdjw {
    private final zzdom zza;
    private final zzdnb zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc;

    public zzdjw(zzdom zzdom0, zzdnb zzdnb0) {
        this.zza = zzdom0;
        this.zzb = zzdnb0;
        this.zzc = null;
    }

    public final View zza(View view0, WindowManager windowManager0) {
        zzq zzq0 = zzq.zzc();
        zzcfi zzcfi0 = this.zza.zza(zzq0, null, null);
        ((View)zzcfi0).setVisibility(4);
        ((View)zzcfi0).setContentDescription("policy_validator");
        zzcfi0.zzad("/sendMessageToSdk", (zzcfi zzcfi0, Map map0) -> this.zzb.zzg("sendMessageToNativeJs", map0));
        zzcfi0.zzad("/hideValidatorOverlay", (zzcfi zzcfi0, Map map0) -> {
            zzcaa.zze("Hide native ad policy validator overlay.");
            zzcfi0.zzF().setVisibility(8);
            if(zzcfi0.zzF().getWindowToken() != null) {
                windowManager0.removeView(zzcfi0.zzF());
            }
            zzcfi0.destroy();
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(this.zzc != null && viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeOnScrollChangedListener(this.zzc);
            }
        });
        zzcfi0.zzad("/open", new zzbjc(null, null, null, null, null, null));
        WeakReference weakReference0 = new WeakReference(zzcfi0);
        zzdju zzdju0 = (zzcfi zzcfi0, Map map0) -> {
            zzcfi0.zzN().zzA((boolean z, int v, String s, String s1) -> {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("messageType", "validatorHtmlLoaded");
                hashMap0.put("id", ((String)map0.get("id")));
                this.zzb.zzg("sendMessageToNativeJs", hashMap0);
            });
            if(map0 == null) {
                return;
            }
            Context context0 = view0.getContext();
            int v = zzdjw.zzf(context0, ((String)map0.get("validator_width")), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhK)))));
            int v1 = zzdjw.zzf(context0, ((String)map0.get("validator_height")), ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhL)))));
            int v2 = zzdjw.zzf(context0, ((String)map0.get("validator_x")), 0);
            int v3 = zzdjw.zzf(context0, ((String)map0.get("validator_y")), 0);
            zzcfi0.zzag(zzcgx.zzb(v, v1));
            try {
                zzcfi0.zzG().getSettings().setUseWideViewPort(((Boolean)zzba.zzc().zzb(zzbbr.zzhM)).booleanValue());
                zzcfi0.zzG().getSettings().setLoadWithOverviewMode(((Boolean)zzba.zzc().zzb(zzbbr.zzhN)).booleanValue());
            }
            catch(NullPointerException unused_ex) {
            }
            WindowManager.LayoutParams windowManager$LayoutParams0 = zzbx.zzb();
            windowManager$LayoutParams0.x = v2;
            windowManager$LayoutParams0.y = v3;
            windowManager0.updateViewLayout(zzcfi0.zzF(), windowManager$LayoutParams0);
            Object object0 = map0.get("orientation");
            Rect rect0 = new Rect();
            if(view0.getGlobalVisibleRect(rect0)) {
                this.zzc = new zzdjr(view0, zzcfi0, ((String)object0), windowManager$LayoutParams0, ("1".equals(((String)object0)) || "2".equals(((String)object0)) ? rect0.bottom : rect0.top) - v3, windowManager0);
                ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.addOnScrollChangedListener(this.zzc);
                }
            }
            String s = (String)map0.get("overlay_url");
            if(!TextUtils.isEmpty(s)) {
                zzcfi0.loadUrl(s);
            }
        };
        this.zzb.zzj(weakReference0, "/loadNativeAdPolicyViolations", zzdju0);
        WeakReference weakReference1 = new WeakReference(zzcfi0);
        this.zzb.zzj(weakReference1, "/showValidatorOverlay", zzdjv.zza);
        return (View)zzcfi0;
    }

    // 检测为 Lambda 实现
    final void zzb(zzcfi zzcfi0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzc(WindowManager windowManager0, View view0, zzcfi zzcfi0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzd(Map map0, boolean z, int v, String s, String s1) [...]

    // 检测为 Lambda 实现
    final void zze(View view0, WindowManager windowManager0, zzcfi zzcfi0, Map map0) [...]

    private static final int zzf(Context context0, String s, int v) {
        try {
            v = Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return zzbzt.zzx(context0, v);
    }
}

