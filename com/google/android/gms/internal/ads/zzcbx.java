package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

public final class zzcbx extends FrameLayout implements zzcbo {
    final zzccl zza;
    private final zzccj zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbcj zze;
    private final long zzf;
    private final zzcbp zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbx(Context context0, zzccj zzccj0, int v, boolean z, zzbcj zzbcj0, zzcci zzcci0) {
        super(context0);
        this.zzb = zzccj0;
        this.zze = zzbcj0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        this.zzc = frameLayout0;
        this.addView(frameLayout0, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzccj0.zzj());
        zzccj0.zzj();
        zzcck zzcck0 = new zzcck(context0, zzccj0.zzn(), zzccj0.zzbm(), zzbcj0, zzccj0.zzk());
        zzcdb zzcdb0 = v == 2 ? new zzcdb(context0, zzcck0, zzccj0, z, zzcbq.zza(zzccj0), zzcci0) : new zzcbn(context0, zzccj0, z, zzcbq.zza(zzccj0), zzcci0, new zzcck(context0, zzccj0.zzn(), zzccj0.zzbm(), zzbcj0, zzccj0.zzk()));
        this.zzg = zzcdb0;
        View view0 = new View(context0);
        this.zzd = view0;
        view0.setBackgroundColor(0);
        frameLayout0.addView(zzcdb0, new FrameLayout.LayoutParams(-1, -1, 17));
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzF)).booleanValue()) {
            frameLayout0.addView(view0, new FrameLayout.LayoutParams(-1, -1));
            frameLayout0.bringChildToFront(view0);
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzC)).booleanValue()) {
            this.zzn();
        }
        this.zzq = new ImageView(context0);
        this.zzf = (long)(((Long)zzba.zzc().zzb(zzbbr.zzI)));
        boolean z1 = ((Boolean)zzba.zzc().zzb(zzbbr.zzE)).booleanValue();
        this.zzk = z1;
        if(zzbcj0 != null) {
            zzbcj0.zzd("spinner_used", (z1 ? "1" : "0"));
        }
        this.zza = new zzccl(this);
        zzcdb0.zzr(this);
    }

    @Override
    public final void finalize() {
        try {
            this.zza.zza();
            zzcbp zzcbp0 = this.zzg;
            if(zzcbp0 != null) {
                zzcbr zzcbr0 = new zzcbr(zzcbp0);
                zzcan.zze.execute(zzcbr0);
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            this.zza.zzb();
        }
        else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzcbs zzcbs0 = () -> this.zzK("windowFocusChanged", new String[]{"hasWindowFocus", String.valueOf(z)});
        zzs.zza.post(zzcbs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo, android.view.View
    public final void onWindowVisibilityChanged(int v) {
        boolean z;
        super.onWindowVisibilityChanged(v);
        if(v == 0) {
            this.zza.zzb();
            z = true;
        }
        else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        zzcbw zzcbw0 = new zzcbw(this, z);
        zzs.zza.post(zzcbw0);
    }

    public final void zzA(int v) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzz(v);
    }

    public final void zzB(int v) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzA(v);
    }

    public final void zzC(int v) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(v);
            this.zzd.setBackgroundColor(v);
        }
    }

    public final void zzD(int v) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzB(v);
    }

    public final void zzE(String s, String[] arr_s) {
        this.zzn = s;
        this.zzo = arr_s;
    }

    public final void zzF(int v, int v1, int v2, int v3) {
        if(zze.zzc()) {
            zze.zza(("Set video bounds to x:" + v + ";y:" + v1 + ";w:" + v2 + ";h:" + v3));
        }
        if(v2 != 0 && v3 != 0) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v2, v3);
            frameLayout$LayoutParams0.setMargins(v, v1, 0, 0);
            this.zzc.setLayoutParams(frameLayout$LayoutParams0);
            this.requestLayout();
        }
    }

    public final void zzG(float f) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzb.zze(f);
        zzcbp0.zzn();
    }

    public final void zzH(float f, float f1) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 != null) {
            zzcbp0.zzu(f, f1);
        }
    }

    public final void zzI() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzb.zzd(false);
        zzcbp0.zzn();
    }

    private final void zzJ() {
        if(this.zzb.zzi() == null) {
            return;
        }
        if(this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(0x80);
            this.zzi = false;
        }
    }

    private final void zzK(String s, String[] arr_s) {
        HashMap hashMap0 = new HashMap();
        Integer integer0 = this.zzl();
        if(integer0 != null) {
            hashMap0.put("playerId", integer0.toString());
        }
        hashMap0.put("event", s);
        String s1 = null;
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(s1 == null) {
                s1 = s2;
            }
            else {
                hashMap0.put(s1, s2);
                s1 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap0);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbP)).booleanValue()) {
            this.zza.zza();
        }
        this.zzK("ended", new String[0]);
        this.zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzb(String s, String s1) {
        this.zzK("error", new String[]{"what", s, "extra", s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzc(String s, String s1) {
        this.zzK("exception", new String[]{"what", "ExoPlayerAdapter exception", "extra", s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzd() {
        this.zzK("pause", new String[0]);
        this.zzJ();
        this.zzh = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zze() {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbP)).booleanValue()) {
            this.zza.zzb();
        }
        if(this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 0x80) != 0;
            this.zzj = z;
            if(!z) {
                this.zzb.zzi().getWindow().addFlags(0x80);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzf() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        if(this.zzm == 0L) {
            this.zzK("canplaythrough", new String[]{"duration", String.valueOf(((float)zzcbp0.zzc()) / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd())});
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzg() {
        this.zzd.setVisibility(4);
        zzcbt zzcbt0 = () -> this.zzK("firstFrameRendered", new String[0]);
        zzs.zza.post(zzcbt0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzh() {
        this.zza.zzb();
        zzcbu zzcbu0 = new zzcbu(this);
        zzs.zza.post(zzcbu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzi() {
        if(this.zzr && this.zzp != null && !this.zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            this.zzc.addView(this.zzq, frameLayout$LayoutParams0);
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzcbv zzcbv0 = new zzcbv(this);
        zzs.zza.post(zzcbv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzj(int v, int v1) {
        if(this.zzk) {
            int v2 = Math.max(v / ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzH)))), 1);
            int v3 = Math.max(v1 / ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzH)))), 1);
            if(this.zzp == null || this.zzp.getWidth() != v2 || this.zzp.getHeight() != v3) {
                this.zzp = Bitmap.createBitmap(v2, v3, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zzk() {
        if(this.zzh && this.zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if(this.zzg != null && this.zzp != null) {
            long v = zzt.zzB().elapsedRealtime();
            if(this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long v1 = zzt.zzB().elapsedRealtime() - v;
            if(zze.zzc()) {
                zze.zza(("Spinner frame grab took " + v1 + "ms"));
            }
            if(v1 > this.zzf) {
                zzcaa.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbcj zzbcj0 = this.zze;
                if(zzbcj0 != null) {
                    zzbcj0.zzd("spinner_jank", Long.toString(v1));
                }
            }
        }
    }

    public final Integer zzl() {
        return this.zzg == null ? null : this.zzg.zzw();
    }

    static void zzm(zzcbx zzcbx0, String s, String[] arr_s) {
        zzcbx0.zzK(s, arr_s);
    }

    public final void zzn() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        TextView textView0 = new TextView(zzcbp0.getContext());
        Resources resources0 = zzt.zzo().zzd();
        textView0.setText((resources0 == null ? "AdMob - " : resources0.getString(string.watermark_label_prefix)) + this.zzg.zzj());
        textView0.setTextColor(0xFFFF0000);
        textView0.setBackgroundColor(0xFFFFFF00);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2, 17);
        this.zzc.addView(textView0, frameLayout$LayoutParams0);
        this.zzc.bringChildToFront(textView0);
    }

    public final void zzo() {
        this.zza.zza();
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 != null) {
            zzcbp0.zzt();
        }
        this.zzJ();
    }

    // 检测为 Lambda 实现
    final void zzp() [...]

    // 检测为 Lambda 实现
    final void zzq(boolean z) [...]

    public final void zzr(Integer integer0) {
        if(this.zzg == null) {
            return;
        }
        if(!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, integer0);
            return;
        }
        this.zzK("no_src", new String[0]);
    }

    public final void zzs() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzb.zzd(true);
        zzcbp0.zzn();
    }

    final void zzt() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        long v = (long)zzcbp0.zza();
        if(this.zzl != v && v > 0L) {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzbN)).booleanValue()) {
                this.zzK("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(zzt.zzB().currentTimeMillis())});
            }
            else {
                this.zzK("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f)});
            }
            this.zzl = v;
        }
    }

    public final void zzu() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzo();
    }

    public final void zzv() {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzp();
    }

    public final void zzw(int v) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzq(v);
    }

    public final void zzx(MotionEvent motionEvent0) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.dispatchTouchEvent(motionEvent0);
    }

    public final void zzy(int v) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzx(v);
    }

    public final void zzz(int v) {
        zzcbp zzcbp0 = this.zzg;
        if(zzcbp0 == null) {
            return;
        }
        zzcbp0.zzy(v);
    }
}

