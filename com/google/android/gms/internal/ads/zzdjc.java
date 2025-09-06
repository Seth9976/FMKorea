package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

public final class zzdjc {
    static final ImageView.ScaleType zza;
    private final zzg zzb;
    private final zzfca zzc;
    private final zzdih zzd;
    private final zzdic zze;
    private final zzdjo zzf;
    private final zzdjw zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbek zzj;
    private final zzdhz zzk;

    static {
        zzdjc.zza = ImageView.ScaleType.CENTER_INSIDE;
    }

    public zzdjc(zzg zzg0, zzfca zzfca0, zzdih zzdih0, zzdic zzdic0, zzdjo zzdjo0, zzdjw zzdjw0, Executor executor0, Executor executor1, zzdhz zzdhz0) {
        this.zzb = zzg0;
        this.zzc = zzfca0;
        this.zzj = zzfca0.zzi;
        this.zzd = zzdih0;
        this.zze = zzdic0;
        this.zzf = zzdjo0;
        this.zzg = zzdjw0;
        this.zzh = executor0;
        this.zzi = executor1;
        this.zzk = zzdhz0;
    }

    // 检测为 Lambda 实现
    final void zza(ViewGroup viewGroup0) [...]

    // 检测为 Lambda 实现
    final void zzb(zzdjy zzdjy0) [...]

    public final void zzc(zzdjy zzdjy0) {
        if(zzdjy0 == null || this.zzf == null || zzdjy0.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdjy0.zzh().addView(this.zzf.zza());
        }
        catch(zzcft zzcft0) {
            zze.zzb("web view can not be obtained", zzcft0);
        }
    }

    public final void zzd(zzdjy zzdjy0) {
        if(zzdjy0 == null) {
            return;
        }
        Context context0 = zzdjy0.zzf().getContext();
        if(!zzbx.zzh(context0, this.zzd.zza)) {
            return;
        }
        if(!(context0 instanceof Activity)) {
            zzcaa.zze("Activity context is needed for policy validator.");
            return;
        }
        if(this.zzg != null && zzdjy0.zzh() != null) {
            try {
                WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                FrameLayout frameLayout0 = zzdjy0.zzh();
                windowManager0.addView(this.zzg.zza(frameLayout0, windowManager0), zzbx.zzb());
            }
            catch(zzcft zzcft0) {
                zze.zzb("web view can not be obtained", zzcft0);
            }
        }
    }

    public final void zze(zzdjy zzdjy0) {
        zzdja zzdja0 = () -> {
            IObjectWrapper iObjectWrapper0;
            View view1;
            ViewGroup viewGroup0 = null;
            Context context0 = null;
            if(this.zzd.zzf() || this.zzd.zze()) {
                for(int v = 0; v < 2; ++v) {
                    View view0 = zzdjy0.zzg(new String[]{"1098", "3011"}[v]);
                    if(view0 != null && view0 instanceof ViewGroup) {
                        viewGroup0 = (ViewGroup)view0;
                        break;
                    }
                }
            }
            Context context1 = zzdjy0.zzf().getContext();
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            zzdic zzdic0 = this.zze;
            if(zzdic0.zze() != null) {
                view1 = zzdic0.zze();
                zzbek zzbek0 = this.zzj;
                if(zzbek0 != null && viewGroup0 == null) {
                    zzdjc.zzh(relativeLayout$LayoutParams0, zzbek0.zze);
                    view1.setLayoutParams(relativeLayout$LayoutParams0);
                }
            }
            else if(zzdic0.zzl() instanceof zzbef) {
                zzbef zzbef0 = (zzbef)zzdic0.zzl();
                if(viewGroup0 == null) {
                    zzdjc.zzh(relativeLayout$LayoutParams0, zzbef0.zzc());
                }
                zzbeg zzbeg0 = new zzbeg(context1, zzbef0, relativeLayout$LayoutParams0);
                zzbeg0.setContentDescription(((CharSequence)zzba.zzc().zzb(zzbbr.zzdD)));
                view1 = zzbeg0;
            }
            else {
                view1 = null;
            }
            if(view1 != null) {
                if(view1.getParent() instanceof ViewGroup) {
                    ((ViewGroup)view1.getParent()).removeView(view1);
                }
                if(viewGroup0 == null) {
                    zza zza0 = new zza(zzdjy0.zzf().getContext());
                    zza0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    zza0.addView(view1);
                    FrameLayout frameLayout0 = zzdjy0.zzh();
                    if(frameLayout0 != null) {
                        frameLayout0.addView(zza0);
                    }
                }
                else {
                    viewGroup0.removeAllViews();
                    viewGroup0.addView(view1);
                }
                zzdjy0.zzq(zzdjy0.zzk(), view1, true);
            }
            ViewGroup viewGroup1 = null;
            zzfud zzfud0 = zzdiy.zza;
            int v1 = zzfud0.size();
            int v2 = 0;
            while(v2 < v1) {
                View view2 = zzdjy0.zzg(((String)zzfud0.get(v2)));
                ++v2;
                if(view2 instanceof ViewGroup) {
                    viewGroup1 = (ViewGroup)view2;
                    break;
                }
            }
            zzdiz zzdiz0 = () -> {
                zzdic zzdic0 = this.zze;
                if(zzdic0.zzf() != null) {
                    switch(zzdic0.zzc()) {
                        case 1: 
                        case 2: {
                            String s = String.valueOf(zzdic0.zzc());
                            this.zzb.zzJ(this.zzc.zzf, s, viewGroup1 != null);
                            break;
                        }
                        case 6: {
                            this.zzb.zzJ(this.zzc.zzf, "2", viewGroup1 != null);
                            this.zzb.zzJ(this.zzc.zzf, "1", viewGroup1 != null);
                        }
                    }
                }
            };
            this.zzi.execute(zzdiz0);
            if(viewGroup1 != null) {
                if(this.zzi(viewGroup1, true)) {
                    zzdic zzdic1 = this.zze;
                    if(zzdic1.zzs() != null) {
                        zzdic1.zzs().zzao(new zzdjb(zzdjy0, viewGroup1));
                    }
                }
                else if(((Boolean)zzba.zzc().zzb(zzbbr.zzjn)).booleanValue() && this.zzi(viewGroup1, false)) {
                    zzdic zzdic2 = this.zze;
                    if(zzdic2.zzq() != null) {
                        zzdic2.zzq().zzao(new zzdjb(zzdjy0, viewGroup1));
                    }
                }
                else {
                    viewGroup1.removeAllViews();
                    View view3 = zzdjy0.zzf();
                    if(view3 != null) {
                        context0 = view3.getContext();
                    }
                    if(context0 != null) {
                        zzbet zzbet0 = this.zzk.zza();
                        if(zzbet0 != null) {
                            try {
                                iObjectWrapper0 = zzbet0.zzi();
                            }
                            catch(RemoteException unused_ex) {
                                zzcaa.zzj("Could not get main image drawable");
                                return;
                            }
                            if(iObjectWrapper0 != null) {
                                Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
                                if(drawable0 != null) {
                                    ImageView imageView0 = new ImageView(context0);
                                    imageView0.setImageDrawable(drawable0);
                                    IObjectWrapper iObjectWrapper1 = zzdjy0.zzj();
                                    if(iObjectWrapper1 == null || !((Boolean)zzba.zzc().zzb(zzbbr.zzga)).booleanValue()) {
                                        imageView0.setScaleType(zzdjc.zza);
                                    }
                                    else {
                                        imageView0.setScaleType(((ImageView.ScaleType)ObjectWrapper.unwrap(iObjectWrapper1)));
                                    }
                                    imageView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup1.addView(imageView0);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.zzh.execute(zzdja0);
    }

    public final boolean zzf(ViewGroup viewGroup0) {
        return this.zzi(viewGroup0, false);
    }

    public final boolean zzg(ViewGroup viewGroup0) {
        return this.zzi(viewGroup0, true);
    }

    private static void zzh(RelativeLayout.LayoutParams relativeLayout$LayoutParams0, int v) {
        switch(v) {
            case 0: {
                relativeLayout$LayoutParams0.addRule(10);
                relativeLayout$LayoutParams0.addRule(9);
                return;
            }
            case 2: {
                relativeLayout$LayoutParams0.addRule(12);
                relativeLayout$LayoutParams0.addRule(11);
                return;
            }
            case 3: {
                relativeLayout$LayoutParams0.addRule(12);
                relativeLayout$LayoutParams0.addRule(9);
                return;
            }
            default: {
                relativeLayout$LayoutParams0.addRule(10);
                relativeLayout$LayoutParams0.addRule(11);
            }
        }
    }

    private final boolean zzi(ViewGroup viewGroup0, boolean z) {
        View view0 = z ? this.zze.zzf() : this.zze.zzg();
        if(view0 == null) {
            return false;
        }
        viewGroup0.removeAllViews();
        if(view0.getParent() instanceof ViewGroup) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        viewGroup0.addView(view0, (((Boolean)zzba.zzc().zzb(zzbbr.zzdF)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17)));
        return true;
    }
}

