package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzdiy extends zzbez implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdjy {
    public static final zzfud zza;
    private final String zzb;
    private Map zzc;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzfyo zzf;
    private View zzg;
    private final int zzh;
    private zzdhx zzi;
    private zzaug zzj;
    private IObjectWrapper zzk;
    private zzbet zzl;
    private boolean zzm;
    private boolean zzn;
    private GestureDetector zzo;

    static {
        zzdiy.zza = zzfud.zzo("2011", "1009", "3010");
    }

    public zzdiy(FrameLayout frameLayout0, FrameLayout frameLayout1, int v) {
        String s1;
        this.zzc = new HashMap();
        this.zzk = null;
        this.zzn = false;
        this.zzd = frameLayout0;
        this.zze = frameLayout1;
        this.zzh = 233012000;
        String s = frameLayout0.getClass().getCanonicalName();
        if("com.google.android.gms.ads.formats.NativeContentAdView".equals(s)) {
            s1 = "1007";
        }
        else if("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(s)) {
            s1 = "2009";
        }
        else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(s);
            s1 = "3012";
        }
        this.zzb = s1;
        zzcba.zza(frameLayout0, this);
        zzcba.zzb(frameLayout0, this);
        this.zzf = zzcan.zze;
        this.zzj = new zzaug(this.zzd.getContext(), this.zzd);
        frameLayout0.setOnTouchListener(this);
        frameLayout0.setOnClickListener(this);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        synchronized(this) {
            if(this.zzi != null && this.zzi.zzS()) {
                this.zzi.zzt();
                this.zzi.zzB(view0, this.zzd, this.zzl(), this.zzm(), false);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized(this) {
            zzdhx zzdhx0 = this.zzi;
            if(zzdhx0 != null) {
                FrameLayout frameLayout0 = this.zzd;
                zzdhx0.zzz(frameLayout0, this.zzl(), this.zzm(), zzdhx.zzV(frameLayout0));
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized(this) {
            zzdhx zzdhx0 = this.zzi;
            if(zzdhx0 != null) {
                FrameLayout frameLayout0 = this.zzd;
                zzdhx0.zzz(frameLayout0, this.zzl(), this.zzm(), zzdhx.zzV(frameLayout0));
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        synchronized(this) {
            zzdhx zzdhx0 = this.zzi;
            if(zzdhx0 == null) {
                return false;
            }
            zzdhx0.zzI(view0, motionEvent0, this.zzd);
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue() && this.zzo != null && this.zzi.zza() != 0) {
                this.zzo.onTouchEvent(motionEvent0);
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final IObjectWrapper zzb(String s) {
        synchronized(this) {
            return ObjectWrapper.wrap(this.zzg(s));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbA(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.zzi.zzK(((View)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbB(zzbet zzbet0) {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            this.zzm = true;
            this.zzl = zzbet0;
            zzdhx zzdhx0 = this.zzi;
            if(zzdhx0 != null) {
                zzdhx0.zzc().zzb(zzbet0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbC(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            this.zzk = iObjectWrapper0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbD(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(!(object0 instanceof zzdhx)) {
                zzcaa.zzj("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            zzdhx zzdhx0 = this.zzi;
            if(zzdhx0 != null) {
                zzdhx0.zzQ(this);
            }
            this.zzu();
            this.zzi = (zzdhx)object0;
            ((zzdhx)object0).zzP(this);
            this.zzi.zzH(this.zzd);
            this.zzi.zzs(this.zze);
            if(this.zzm) {
                this.zzi.zzc().zzb(this.zzl);
            }
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzdK)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzg())) {
                this.zzt(this.zzi.zzg());
            }
            this.zzv();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzbz(String s, IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.zzq(s, ((View)ObjectWrapper.unwrap(iObjectWrapper0)), true);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzc() {
        synchronized(this) {
            if(this.zzn) {
                return;
            }
            zzdhx zzdhx0 = this.zzi;
            if(zzdhx0 != null) {
                zzdhx0.zzQ(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        MotionEvent motionEvent0 = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper0);
        this.onTouch(this.zzd, motionEvent0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbfa
    public final void zze(IObjectWrapper iObjectWrapper0, int v) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final View zzf() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final View zzg(String s) {
        synchronized(this) {
            if(this.zzn) {
                return null;
            }
            WeakReference weakReference0 = (WeakReference)this.zzc.get(s);
            return weakReference0 == null ? null : ((View)weakReference0.get());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final zzaug zzi() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final String zzk() {
        synchronized(this) {
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final Map zzl() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final Map zzm() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final Map zzn() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final JSONObject zzo() {
        synchronized(this) {
            zzdhx zzdhx0 = this.zzi;
            return zzdhx0 != null ? zzdhx0.zzi(this.zzd, this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final JSONObject zzp() {
        synchronized(this) {
            zzdhx zzdhx0 = this.zzi;
            return zzdhx0 != null ? zzdhx0.zzk(this.zzd, this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjy
    public final void zzq(String s, View view0, boolean z) {
        synchronized(this) {
            if(!this.zzn) {
                if(view0 == null) {
                    this.zzc.remove(s);
                    return;
                }
                goto label_6;
            }
            return;
        }
        return;
    label_6:
        this.zzc.put(s, new WeakReference(view0));
        if(!"1098".equals(s) && !"3011".equals(s)) {
            if(zzbx.zzi(this.zzh)) {
                view0.setOnTouchListener(this);
            }
            view0.setClickable(true);
            view0.setOnClickListener(this);
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    // 检测为 Lambda 实现
    final void zzs() [...]

    private final void zzt(String s) {
        byte[] arr_b;
        synchronized(this) {
            FrameLayout frameLayout0 = new FrameLayout(this.zze.getContext());
            frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context0 = this.zze.getContext();
            frameLayout0.setClickable(false);
            frameLayout0.setFocusable(false);
            if(!TextUtils.isEmpty(s)) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                Resources resources0 = context0.getResources();
                if(resources0 != null) {
                    DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                    if(displayMetrics0 != null) {
                        try {
                            arr_b = Base64.decode(s, 0);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            zzcaa.zzk("Encountered invalid base64 watermark.", illegalArgumentException0);
                            this.zze.addView(frameLayout0);
                            return;
                        }
                        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
                        bitmapDrawable0.setTargetDensity(displayMetrics0.densityDpi);
                        bitmapDrawable0.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                        frameLayout0.setBackground(bitmapDrawable0);
                    }
                }
            }
            this.zze.addView(frameLayout0);
        }
    }

    private final void zzu() {
        synchronized(this) {
            zzdix zzdix0 = () -> {
                if(this.zzg == null) {
                    View view0 = new View(this.zzd.getContext());
                    this.zzg = view0;
                    view0.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if(this.zzd != this.zzg.getParent()) {
                    this.zzd.addView(this.zzg);
                }
            };
            this.zzf.execute(zzdix0);
        }
    }

    private final void zzv() {
        synchronized(this) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzkm)).booleanValue() && this.zzi.zza() != 0) {
                this.zzo = new GestureDetector(this.zzd.getContext(), new zzdje(this.zzi, this));
            }
        }
    }
}

