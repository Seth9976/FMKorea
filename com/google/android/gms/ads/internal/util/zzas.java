package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzfyo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzas {
    private final Context zza;
    private final zzdue zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzas(Context context0) {
        this.zzg = 0;
        this.zzl = () -> {
            this.zzg = 4;
            this.zzr();
        };
        this.zza = context0;
        this.zzh = ViewConfiguration.get(context0).getScaledTouchSlop();
        zzt.zzt().zzb();
        this.zzk = zzt.zzt().zza();
        this.zzb = zzt.zzs().zza();
    }

    public zzas(Context context0, String s) {
        this(context0);
        this.zzc = s;
    }

    @Override
    public final String toString() {
        return "{Dialog: " + this.zzc + ",DebugSignal: " + this.zzf + ",AFMA Version: " + this.zze + ",Ad Unit ID: " + this.zzd + "}";
    }

    // 检测为 Lambda 实现
    final void zza() [...]

    // 检测为 Lambda 实现
    final void zzb() [...]

    // 检测为 Lambda 实现
    final void zzc(zzfyo zzfyo0) [...]

    // 检测为 Lambda 实现
    final void zzd(zzfyo zzfyo0) [...]

    // 检测为 Lambda 实现
    final void zze() [...]

    // 检测为 Lambda 实现
    final void zzf() [...]

    // 检测为 Lambda 实现
    final void zzg() [...]

    // 检测为 Lambda 实现
    final void zzh(AtomicInteger atomicInteger0, int v, int v1, int v2, DialogInterface dialogInterface0, int v3) [...]

    // 检测为 Lambda 实现
    final void zzi(String s, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzj(int v, int v1, int v2, int v3, int v4, DialogInterface dialogInterface0, int v5) [...]

    // 检测为 Lambda 实现
    final void zzk() [...]

    // 检测为 Lambda 实现
    final void zzl() [...]

    public final void zzm(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getHistorySize();
        int v2 = motionEvent0.getPointerCount();
        if(v == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent0.getX(0), motionEvent0.getY(0));
            return;
        }
        int v3 = this.zzg;
        if(v3 == -1) {
            return;
        }
        switch(v3) {
            case 0: {
                if(v == 5) {
                    this.zzg = 5;
                    this.zzj = new PointF(motionEvent0.getX(1), motionEvent0.getY(1));
                    this.zzk.postDelayed(this.zzl, ((long)(((Long)zzba.zzc().zzb(zzbbr.zzey)))));
                    return;
                }
                break;
            }
            case 5: {
                if(v2 != 2) {
                    this.zzg = -1;
                    this.zzk.removeCallbacks(this.zzl);
                }
                else if(v == 2) {
                    int v5 = 0;
                    for(int v4 = 0; v4 < v1; ++v4) {
                        v5 |= !this.zzt(motionEvent0.getHistoricalX(0, v4), motionEvent0.getHistoricalY(0, v4), motionEvent0.getHistoricalX(1, v4), motionEvent0.getHistoricalY(1, v4));
                    }
                    if(!this.zzt(motionEvent0.getX(), motionEvent0.getY(), motionEvent0.getX(1), motionEvent0.getY(1)) || v5 != 0) {
                        this.zzg = -1;
                        this.zzk.removeCallbacks(this.zzl);
                        return;
                    }
                }
                break;
            }
        }
    }

    public final void zzn(String s) {
        this.zzd = s;
    }

    public final void zzo(String s) {
        this.zze = s;
    }

    public final void zzp(String s) {
        this.zzc = s;
    }

    public final void zzq(String s) {
        this.zzf = s;
    }

    // 检测为 Lambda 实现
    public final void zzr() [...]

    private final void zzs(Context context0) {
        int v3;
        ArrayList arrayList0 = new ArrayList();
        int v = zzas.zzu(arrayList0, "None", true);
        int v1 = zzas.zzu(arrayList0, "Shake", true);
        int v2 = zzas.zzu(arrayList0, "Flick", true);
        switch(this.zzb.zza().ordinal()) {
            case 1: {
                v3 = v1;
                break;
            }
            case 2: {
                v3 = v2;
                break;
            }
            default: {
                v3 = v;
            }
        }
        AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(context0);
        AtomicInteger atomicInteger0 = new AtomicInteger(v3);
        alertDialog$Builder0.setTitle("Setup gesture");
        alertDialog$Builder0.setSingleChoiceItems(((CharSequence[])arrayList0.toArray(new String[0])), v3, new zzaj(atomicInteger0));
        alertDialog$Builder0.setNegativeButton("Dismiss", (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
            try {
                String s = "Troubleshooting (enabled)";
                if(!(this.zza instanceof Activity)) {
                    zzcaa.zzi("Can not create dialog without Activity Context");
                    return;
                }
                if(!zzt.zzs().zzm()) {
                    s = "Troubleshooting";
                }
                ArrayList arrayList0 = new ArrayList();
                int v = zzas.zzu(arrayList0, "Ad information", true);
                int v1 = zzas.zzu(arrayList0, "Creative preview", true);
                int v2 = zzas.zzu(arrayList0, s, true);
                boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue();
                int v3 = zzas.zzu(arrayList0, "Open ad inspector", z);
                int v4 = zzas.zzu(arrayList0, "Ad inspector settings", z);
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(this.zza);
                alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), (DialogInterface dialogInterface0, int v5) -> {
                    if(v5 == v) {
                        if(!(this.zza instanceof Activity)) {
                            zzcaa.zzi("Can not create dialog without Activity Context");
                            return;
                        }
                        String s = this.zzc;
                        String s1 = "No debug information";
                        if(!TextUtils.isEmpty(s)) {
                            Uri uri0 = new Uri.Builder().encodedQuery(s.replaceAll("\\+", "%20")).build();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            Map map0 = zzs.zzM(uri0);
                            for(Object object0: map0.keySet()) {
                                stringBuilder0.append(((String)object0));
                                stringBuilder0.append(" = ");
                                stringBuilder0.append(((String)map0.get(((String)object0))));
                                stringBuilder0.append("\n\n");
                            }
                            String s2 = stringBuilder0.toString().trim();
                            if(!TextUtils.isEmpty(s2)) {
                                s1 = s2;
                            }
                        }
                        AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(this.zza);
                        alertDialog$Builder0.setMessage(s1);
                        alertDialog$Builder0.setTitle("Ad Information");
                        alertDialog$Builder0.setPositiveButton("Share", (DialogInterface dialogInterface0, int v) -> {
                            Intent intent0 = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", s1), "Share via");
                            zzs.zzQ(this.zza, intent0);
                        });
                        alertDialog$Builder0.setNegativeButton("Close", zzae.zza);
                        alertDialog$Builder0.create().show();
                        return;
                    }
                    if(v5 == v1) {
                        zzcaa.zze("Debug mode [Creative Preview] selected.");
                        zzac zzac0 = () -> {
                            zzaw zzaw0 = zzt.zzs();
                            Context context0 = this.zza;
                            String s = this.zzd;
                            String s1 = this.zze;
                            if(!zzaw0.zzk(context0, s, s1)) {
                                zzaw0.zzi(context0, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                return;
                            }
                            if("2".equals(zzaw0.zza)) {
                                zzcaa.zze("Creative is not pushed for this device.");
                                zzaw0.zzi(context0, "There was no creative pushed from DFP to the device.", false, false);
                                return;
                            }
                            if("1".equals(zzaw0.zza)) {
                                zzcaa.zze("The app is not linked for creative preview.");
                                zzaw0.zzd(context0, s, s1);
                                return;
                            }
                            if("0".equals(zzaw0.zza)) {
                                zzcaa.zze("Device is linked for in app preview.");
                                zzaw0.zzi(context0, "The device is successfully linked for creative preview.", false, true);
                            }
                        };
                        zzcan.zza.execute(zzac0);
                        return;
                    }
                    if(v5 == v2) {
                        zzcaa.zze("Debug mode [Troubleshooting] selected.");
                        zzag zzag0 = () -> {
                            zzaw zzaw0 = zzt.zzs();
                            Context context0 = this.zza;
                            String s = this.zzd;
                            String s1 = this.zze;
                            String s2 = this.zzf;
                            boolean z = zzaw0.zzm();
                            zzaw0.zzh(zzaw0.zzj(context0, s, s1));
                            if(zzaw0.zzm()) {
                                if(!z && !TextUtils.isEmpty(s2)) {
                                    zzaw0.zze(context0, s1, s2, s);
                                }
                                zzcaa.zze("Device is linked for debug signals.");
                                zzaw0.zzi(context0, "The device is successfully linked for troubleshooting.", false, true);
                                return;
                            }
                            zzaw0.zzd(context0, s, s1);
                        };
                        zzcan.zza.execute(zzag0);
                        return;
                    }
                    if(v5 == v3) {
                        zzfyo zzfyo0 = zzcan.zze;
                        zzfyo zzfyo1 = zzcan.zza;
                        if(this.zzb.zzp()) {
                            zzfyo0.execute(() -> zzt.zzs().zzc(this.zza));
                            return;
                        }
                        zzfyo1.execute(() -> {
                            if(!zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
                                zzt.zzs().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzfyo0.execute(() -> zzt.zzs().zzc(this.zza));
                        });
                        return;
                    }
                    if(v5 == v4) {
                        zzfyo zzfyo2 = zzcan.zze;
                        zzfyo zzfyo3 = zzcan.zza;
                        if(this.zzb.zzp()) {
                            zzfyo2.execute(() -> this.zzs(this.zza));
                            return;
                        }
                        zzfyo3.execute(() -> {
                            if(!zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
                                zzt.zzs().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzfyo2.execute(() -> this.zzs(this.zza));
                        });
                    }
                });
                alertDialog$Builder0.create().show();
                return;
            }
            catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            }
            zze.zzb("", windowManager$BadTokenException0);
        });
        alertDialog$Builder0.setPositiveButton("Save", (DialogInterface dialogInterface0, int v3) -> {
            if(atomicInteger0.get() != v3) {
                if(atomicInteger0.get() == v1) {
                    this.zzb.zzl(zzdua.zzb);
                }
                else if(atomicInteger0.get() == v2) {
                    this.zzb.zzl(zzdua.zzc);
                }
                else {
                    this.zzb.zzl(zzdua.zza);
                }
            }
            this.zzr();
        });
        alertDialog$Builder0.setOnCancelListener((/* 缺少LAMBDA参数 */) -> {
            try {
                String s = "Troubleshooting (enabled)";
                if(!(this.zza instanceof Activity)) {
                    zzcaa.zzi("Can not create dialog without Activity Context");
                    return;
                }
                if(!zzt.zzs().zzm()) {
                    s = "Troubleshooting";
                }
                ArrayList arrayList0 = new ArrayList();
                int v = zzas.zzu(arrayList0, "Ad information", true);
                int v1 = zzas.zzu(arrayList0, "Creative preview", true);
                int v2 = zzas.zzu(arrayList0, s, true);
                boolean z = ((Boolean)zzba.zzc().zzb(zzbbr.zziO)).booleanValue();
                int v3 = zzas.zzu(arrayList0, "Open ad inspector", z);
                int v4 = zzas.zzu(arrayList0, "Ad inspector settings", z);
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(this.zza);
                alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), (DialogInterface dialogInterface0, int v5) -> {
                    if(v5 == v) {
                        if(!(this.zza instanceof Activity)) {
                            zzcaa.zzi("Can not create dialog without Activity Context");
                            return;
                        }
                        String s = this.zzc;
                        String s1 = "No debug information";
                        if(!TextUtils.isEmpty(s)) {
                            Uri uri0 = new Uri.Builder().encodedQuery(s.replaceAll("\\+", "%20")).build();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            Map map0 = zzs.zzM(uri0);
                            for(Object object0: map0.keySet()) {
                                stringBuilder0.append(((String)object0));
                                stringBuilder0.append(" = ");
                                stringBuilder0.append(((String)map0.get(((String)object0))));
                                stringBuilder0.append("\n\n");
                            }
                            String s2 = stringBuilder0.toString().trim();
                            if(!TextUtils.isEmpty(s2)) {
                                s1 = s2;
                            }
                        }
                        AlertDialog.Builder alertDialog$Builder0 = zzs.zzH(this.zza);
                        alertDialog$Builder0.setMessage(s1);
                        alertDialog$Builder0.setTitle("Ad Information");
                        alertDialog$Builder0.setPositiveButton("Share", (DialogInterface dialogInterface0, int v) -> {
                            Intent intent0 = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", s1), "Share via");
                            zzs.zzQ(this.zza, intent0);
                        });
                        alertDialog$Builder0.setNegativeButton("Close", zzae.zza);
                        alertDialog$Builder0.create().show();
                        return;
                    }
                    if(v5 == v1) {
                        zzcaa.zze("Debug mode [Creative Preview] selected.");
                        zzac zzac0 = () -> {
                            zzaw zzaw0 = zzt.zzs();
                            Context context0 = this.zza;
                            String s = this.zzd;
                            String s1 = this.zze;
                            if(!zzaw0.zzk(context0, s, s1)) {
                                zzaw0.zzi(context0, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                return;
                            }
                            if("2".equals(zzaw0.zza)) {
                                zzcaa.zze("Creative is not pushed for this device.");
                                zzaw0.zzi(context0, "There was no creative pushed from DFP to the device.", false, false);
                                return;
                            }
                            if("1".equals(zzaw0.zza)) {
                                zzcaa.zze("The app is not linked for creative preview.");
                                zzaw0.zzd(context0, s, s1);
                                return;
                            }
                            if("0".equals(zzaw0.zza)) {
                                zzcaa.zze("Device is linked for in app preview.");
                                zzaw0.zzi(context0, "The device is successfully linked for creative preview.", false, true);
                            }
                        };
                        zzcan.zza.execute(zzac0);
                        return;
                    }
                    if(v5 == v2) {
                        zzcaa.zze("Debug mode [Troubleshooting] selected.");
                        zzag zzag0 = () -> {
                            zzaw zzaw0 = zzt.zzs();
                            Context context0 = this.zza;
                            String s = this.zzd;
                            String s1 = this.zze;
                            String s2 = this.zzf;
                            boolean z = zzaw0.zzm();
                            zzaw0.zzh(zzaw0.zzj(context0, s, s1));
                            if(zzaw0.zzm()) {
                                if(!z && !TextUtils.isEmpty(s2)) {
                                    zzaw0.zze(context0, s1, s2, s);
                                }
                                zzcaa.zze("Device is linked for debug signals.");
                                zzaw0.zzi(context0, "The device is successfully linked for troubleshooting.", false, true);
                                return;
                            }
                            zzaw0.zzd(context0, s, s1);
                        };
                        zzcan.zza.execute(zzag0);
                        return;
                    }
                    if(v5 == v3) {
                        zzfyo zzfyo0 = zzcan.zze;
                        zzfyo zzfyo1 = zzcan.zza;
                        if(this.zzb.zzp()) {
                            zzfyo0.execute(() -> zzt.zzs().zzc(this.zza));
                            return;
                        }
                        zzfyo1.execute(() -> {
                            if(!zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
                                zzt.zzs().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzfyo0.execute(() -> zzt.zzs().zzc(this.zza));
                        });
                        return;
                    }
                    if(v5 == v4) {
                        zzfyo zzfyo2 = zzcan.zze;
                        zzfyo zzfyo3 = zzcan.zza;
                        if(this.zzb.zzp()) {
                            zzfyo2.execute(() -> this.zzs(this.zza));
                            return;
                        }
                        zzfyo3.execute(() -> {
                            if(!zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
                                zzt.zzs().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzfyo2.execute(() -> this.zzs(this.zza));
                        });
                    }
                });
                alertDialog$Builder0.create().show();
                return;
            }
            catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            }
            zze.zzb("", windowManager$BadTokenException0);
        });
        alertDialog$Builder0.create().show();
    }

    private final boolean zzt(float f, float f1, float f2, float f3) {
        return Math.abs(this.zzi.x - f) < ((float)this.zzh) && Math.abs(this.zzi.y - f1) < ((float)this.zzh) && Math.abs(this.zzj.x - f2) < ((float)this.zzh) && Math.abs(this.zzj.y - f3) < ((float)this.zzh);
    }

    private static final int zzu(List list0, String s, boolean z) {
        if(!z) {
            return -1;
        }
        list0.add(s);
        return list0.size() - 1;
    }
}

