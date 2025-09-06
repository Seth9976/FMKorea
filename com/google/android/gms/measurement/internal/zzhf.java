package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzpg;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class zzhf implements zzif {
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private AtomicInteger zzai;
    private static volatile zzhf zzb;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzae zzh;
    private final zzaf zzi;
    private final zzgd zzj;
    private final zzfr zzk;
    private final zzgy zzl;
    private final zzlx zzm;
    private final zznd zzn;
    private final zzfq zzo;
    private final Clock zzp;
    private final zzkh zzq;
    private final zziq zzr;
    private final zzb zzs;
    private final zzkc zzt;
    private final String zzu;
    private zzfo zzv;
    private zzkp zzw;
    private zzba zzx;
    private zzfl zzy;
    private boolean zzz;

    private zzhf(zzio zzio0) {
        boolean z = false;
        this.zzz = false;
        this.zzai = new AtomicInteger(0);
        Preconditions.checkNotNull(zzio0);
        zzae zzae0 = new zzae(zzio0.zza);
        this.zzh = zzae0;
        zzff.zza = zzae0;
        Context context0 = zzio0.zza;
        this.zzc = context0;
        this.zzd = zzio0.zzb;
        this.zze = zzio0.zzc;
        this.zzf = zzio0.zzd;
        this.zzg = zzio0.zzh;
        this.zzac = zzio0.zze;
        this.zzu = zzio0.zzj;
        this.zzaf = true;
        zzdd zzdd0 = zzio0.zzg;
        if(zzdd0 != null) {
            Bundle bundle0 = zzdd0.zzg;
            if(bundle0 != null) {
                Object object0 = bundle0.get("measurementEnabled");
                if(object0 instanceof Boolean) {
                    this.zzad = (Boolean)object0;
                }
                Object object1 = zzdd0.zzg.get("measurementDeactivated");
                if(object1 instanceof Boolean) {
                    this.zzae = (Boolean)object1;
                }
            }
        }
        zzgn.zzb(context0);
        Clock clock0 = DefaultClock.getInstance();
        this.zzp = clock0;
        Long long0 = zzio0.zzi;
        this.zza = long0 == null ? clock0.currentTimeMillis() : ((long)long0);
        this.zzi = new zzaf(this);
        zzgd zzgd0 = new zzgd(this);
        zzgd0.zzac();
        this.zzj = zzgd0;
        zzfr zzfr0 = new zzfr(this);
        zzfr0.zzac();
        this.zzk = zzfr0;
        zznd zznd0 = new zznd(this);
        zznd0.zzac();
        this.zzn = zznd0;
        this.zzo = new zzfq(new zzin(zzio0, this));
        this.zzs = new zzb(this);
        zzkh zzkh0 = new zzkh(this);
        zzkh0.zzv();
        this.zzq = zzkh0;
        zziq zziq0 = new zziq(this);
        zziq0.zzv();
        this.zzr = zziq0;
        zzlx zzlx0 = new zzlx(this);
        zzlx0.zzv();
        this.zzm = zzlx0;
        zzkc zzkc0 = new zzkc(this);
        zzkc0.zzac();
        this.zzt = zzkc0;
        zzgy zzgy0 = new zzgy(this);
        zzgy0.zzac();
        this.zzl = zzgy0;
        if(zzio0.zzg != null && zzio0.zzg.zzb != 0L) {
            z = true;
        }
        if(context0.getApplicationContext() instanceof Application) {
            zziq zziq1 = this.zzp();
            if(zziq1.zza().getApplicationContext() instanceof Application) {
                Application application0 = (Application)zziq1.zza().getApplicationContext();
                if(zziq1.zza == null) {
                    zziq1.zza = new zzjx(zziq1);
                }
                if(!z) {
                    application0.unregisterActivityLifecycleCallbacks(zziq1.zza);
                    application0.registerActivityLifecycleCallbacks(zziq1.zza);
                    zziq1.zzj().zzp().zza("Registered activity lifecycle callback");
                }
            }
        }
        else {
            this.zzj().zzu().zza("Application context is not an Application");
        }
        zzgy0.zzb(new zzhg(this, zzio0));
    }

    public static zzhf zza(Context context0, zzdd zzdd0, Long long0) {
        if(zzdd0 != null && (zzdd0.zze == null || zzdd0.zzf == null)) {
            zzdd0 = new zzdd(zzdd0.zza, zzdd0.zzb, zzdd0.zzc, zzdd0.zzd, null, null, zzdd0.zzg, null);
        }
        Preconditions.checkNotNull(context0);
        Preconditions.checkNotNull(context0.getApplicationContext());
        if(zzhf.zzb == null) {
            synchronized(zzhf.class) {
                if(zzhf.zzb == null) {
                    zzhf.zzb = new zzhf(new zzio(context0, zzdd0, long0));
                }
            }
        }
        else if(zzdd0 != null && (zzdd0.zzg != null && zzdd0.zzg.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(zzhf.zzb);
            zzhf.zzb.zza(zzdd0.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzhf.zzb);
        return zzhf.zzb;
    }

    private static void zza(zze zze0) {
        if(zze0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!zze0.zzy()) {
            throw new IllegalStateException("Component not initialized: " + zze0.getClass());
        }
    }

    static void zza(zzhf zzhf0, zzio zzio0) {
        zzhf0.zzl().zzt();
        zzba zzba0 = new zzba(zzhf0);
        zzba0.zzac();
        zzhf0.zzx = zzba0;
        zzfl zzfl0 = new zzfl(zzhf0, zzio0.zzf);
        zzfl0.zzv();
        zzhf0.zzy = zzfl0;
        zzfo zzfo0 = new zzfo(zzhf0);
        zzfo0.zzv();
        zzhf0.zzv = zzfo0;
        zzkp zzkp0 = new zzkp(zzhf0);
        zzkp0.zzv();
        zzhf0.zzw = zzkp0;
        zzhf0.zzn.zzad();
        zzhf0.zzj.zzad();
        zzhf0.zzy.zzw();
        zzhf0.zzj().zzn().zza("App measurement initialized, version", 82001L);
        zzhf0.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = zzfl0.zzad();
        if(TextUtils.isEmpty(zzhf0.zzd)) {
            if(zzhf0.zzt().zzf(s)) {
                zzhf0.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            }
            else {
                zzhf0.zzj().zzn().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + s);
            }
        }
        zzhf0.zzj().zzc().zza("Debug-level message logging enabled");
        if(zzhf0.zzag != zzhf0.zzai.get()) {
            zzhf0.zzj().zzg().zza("Not all components initialized", zzhf0.zzag, zzhf0.zzai.get());
        }
        zzhf0.zzz = true;
    }

    private static void zza(zzic zzic0) {
        if(zzic0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if(!zzic0.zzae()) {
            throw new IllegalStateException("Component not initialized: " + zzic0.getClass());
        }
    }

    private static void zza(zzid zzid0) {
        if(zzid0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return this.zzc;
    }

    protected final void zza(zzdd zzdd0) {
        zzih zzih1;
        this.zzl().zzt();
        if(zzpg.zza() && this.zzi.zza(zzbi.zzcg) && this.zzt().zzw()) {
            zznd zznd0 = this.zzt();
            zznd0.zzt();
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            zzp zzp0 = new zzp(zznd0.zzu);
            a.registerReceiver(zznd0.zza(), zzp0, intentFilter0, 2);
            zznd0.zzj().zzc().zza("Registered app receiver");
        }
        zzih zzih0 = this.zzn().zzm();
        int v = zzih0.zza();
        Boolean boolean0 = this.zzi.zzg("google_analytics_default_allow_ad_storage");
        Boolean boolean1 = this.zzi.zzg("google_analytics_default_allow_analytics_storage");
        if((boolean0 != null || boolean1 != null) && this.zzn().zza(-10)) {
            zzih1 = new zzih(boolean0, boolean1, -10);
        }
        else if(!TextUtils.isEmpty(this.zzh().zzae()) && (v == 0 || v == 30 || (v == 10 || v == 30) || v == 40)) {
            this.zzp().zza(new zzih(null, null, -10), this.zza);
            zzih1 = null;
        }
        else if(!TextUtils.isEmpty(this.zzh().zzae()) || zzdd0 == null || zzdd0.zzg == null || !this.zzn().zza(30)) {
            zzih1 = null;
        }
        else {
            zzih1 = zzih.zza(zzdd0.zzg, 30);
            if(!zzih1.zzi()) {
                zzih1 = null;
            }
        }
        if(zzih1 != null) {
            this.zzp().zza(zzih1, this.zza);
            zzih0 = zzih1;
        }
        this.zzp().zza(zzih0);
        if(zznp.zza() && this.zzi.zza(zzbi.zzcl)) {
            int v1 = this.zzn().zzh().zza();
            Boolean boolean2 = this.zzi.zzg("google_analytics_default_allow_ad_user_data");
            if(boolean2 != null && zzih.zza(-10, v1)) {
                this.zzp().zza(new zzay(boolean2, -10));
            }
            else if(TextUtils.isEmpty(this.zzh().zzae()) || v1 != 0 && v1 != 30) {
                if(TextUtils.isEmpty(this.zzh().zzae()) && zzdd0 != null && zzdd0.zzg != null && zzih.zza(30, v1)) {
                    zzay zzay0 = zzay.zza(zzdd0.zzg, 30);
                    if(zzay0.zzg()) {
                        this.zzp().zza(zzay0);
                    }
                }
                if(TextUtils.isEmpty(this.zzh().zzae()) && zzdd0 != null && zzdd0.zzg != null && this.zzn().zzh.zza() == null) {
                    Boolean boolean3 = zzay.zza(zzdd0.zzg);
                    if(boolean3 != null) {
                        this.zzp().zza(zzdd0.zze, "allow_personalized_ads", boolean3.toString(), false);
                    }
                }
            }
            else {
                this.zzp().zza(new zzay(null, -10));
            }
        }
        if(this.zzn().zzc.zza() == 0L) {
            this.zzj().zzp().zza("Persisting first open", this.zza);
            this.zzn().zzc.zza(this.zza);
        }
        this.zzp().zzb.zzb();
        if(this.zzaf()) {
            if(!TextUtils.isEmpty(this.zzh().zzae()) || !TextUtils.isEmpty(this.zzh().zzac())) {
                this.zzt();
                if(zznd.zza(this.zzh().zzae(), this.zzn().zzx(), this.zzh().zzac(), this.zzn().zzw())) {
                    this.zzj().zzn().zza("Rechecking which service to use due to a GMP App Id change");
                    this.zzn().zzy();
                    this.zzi().zzaa();
                    this.zzw.zzae();
                    this.zzw.zzad();
                    this.zzn().zzc.zza(this.zza);
                    this.zzn().zze.zza(null);
                }
                this.zzn().zzc(this.zzh().zzae());
                this.zzn().zzb(this.zzh().zzac());
            }
            if(!this.zzn().zzm().zza(zza.zzb)) {
                this.zzn().zze.zza(null);
            }
            this.zzp().zza(this.zzn().zze.zza());
            if(zznv.zza() && this.zzi.zza(zzbi.zzbm) && !this.zzt().zzx() && !TextUtils.isEmpty(this.zzn().zzq.zza())) {
                this.zzj().zzu().zza("Remote config removed with active feature rollouts");
                this.zzn().zzq.zza(null);
            }
            if(!TextUtils.isEmpty(this.zzh().zzae()) || !TextUtils.isEmpty(this.zzh().zzac())) {
                boolean z = this.zzac();
                if(!this.zzn().zzaa() && !this.zzi.zzv()) {
                    this.zzn().zzb(!z);
                }
                if(z) {
                    this.zzp().zzaj();
                }
                this.zzs().zza.zza();
                this.zzr().zza(new AtomicReference());
                this.zzr().zza(this.zzn().zzt.zza());
            }
        }
        else if(this.zzac()) {
            if(!this.zzt().zze("android.permission.INTERNET")) {
                this.zzj().zzg().zza("App is missing INTERNET permission");
            }
            if(!this.zzt().zze("android.permission.ACCESS_NETWORK_STATE")) {
                this.zzj().zzg().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if(!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzw()) {
                if(!zznd.zza(this.zzc)) {
                    this.zzj().zzg().zza("AppMeasurementReceiver not registered/enabled");
                }
                if(!zznd.zza(this.zzc, false)) {
                    this.zzj().zzg().zza("AppMeasurementService not registered/enabled");
                }
            }
            this.zzj().zzg().zza("Uploading is not possible. App measurement disabled");
        }
        if(zzpg.zza() && this.zzi.zza(zzbi.zzcg) && this.zzt().zzw()) {
            zziq zziq0 = this.zzp();
            zziq0.getClass();
            new Thread(new zzhe(zziq0)).start();
        }
        this.zzn().zzj.zza(true);
    }

    // 检测为 Lambda 实现
    final void zza(String s, int v, Throwable throwable0, byte[] arr_b, Map map0) [...]

    final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    final void zzaa() {
        ++this.zzag;
    }

    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzac() {
        return this.zzc() == 0;
    }

    public final boolean zzad() {
        this.zzl().zzt();
        return this.zzaf;
    }

    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    protected final boolean zzaf() {
        if(!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        this.zzl().zzt();
        if(this.zzaa == null || this.zzab == 0L || this.zzaa != null && !this.zzaa.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000L) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean boolean0 = Boolean.valueOf(this.zzt().zze("android.permission.INTERNET") && this.zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzw() || zznd.zza(this.zzc) && zznd.zza(this.zzc, false)));
            this.zzaa = boolean0;
            if(boolean0.booleanValue()) {
                if(!this.zzt().zza(this.zzh().zzae(), this.zzh().zzac()) && TextUtils.isEmpty(this.zzh().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() {
        this.zzl().zzt();
        zzhf.zza(this.zzai());
        String s = this.zzh().zzad();
        Pair pair0 = this.zzn().zza(s);
        boolean z = false;
        if(this.zzi.zzp() && !((Boolean)pair0.second).booleanValue() && !TextUtils.isEmpty(((CharSequence)pair0.first))) {
            if(!this.zzai().zzc()) {
                this.zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
                return false;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if(zznp.zza() && this.zzi.zza(zzbi.zzcn)) {
                zziq zziq0 = this.zzp();
                zziq0.zzt();
                zzam zzam0 = zziq0.zzo().zzaa();
                Bundle bundle0 = zzam0 == null ? null : zzam0.zza;
                int v = 1;
                if(bundle0 == null) {
                    int v1 = this.zzah;
                    this.zzah = v1 + 1;
                    if(v1 < 10) {
                        z = true;
                    }
                    this.zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", this.zzah);
                    return z;
                }
                zzih zzih0 = zzih.zza(bundle0, 100);
                stringBuilder0.append("&gcs=");
                stringBuilder0.append(zzih0.zzf());
                zzay zzay0 = zzay.zza(bundle0, 100);
                stringBuilder0.append("&dma=");
                stringBuilder0.append((zzay0.zzd() == Boolean.FALSE ? 0 : 1));
                if(!TextUtils.isEmpty(zzay0.zze())) {
                    stringBuilder0.append("&dma_cps=");
                    stringBuilder0.append(zzay0.zze());
                }
                if(zzay.zza(bundle0) == Boolean.TRUE) {
                    v = 0;
                }
                stringBuilder0.append("&npa=");
                stringBuilder0.append(v);
                this.zzj().zzp().zza("Consent query parameters to Bow", stringBuilder0);
            }
            zznd zznd0 = this.zzt();
            this.zzh();
            URL uRL0 = zznd0.zza(82001L, s, ((String)pair0.first), this.zzn().zzp.zza() - 1L, stringBuilder0.toString());
            if(uRL0 != null) {
                zzkc zzkc0 = this.zzai();
                zzhh zzhh0 = (String s, int v, Throwable throwable0, byte[] arr_b, Map map0) -> {
                    if((v == 200 || v == 204 || v == 304) && throwable0 == null) {
                        this.zzn().zzo.zza(true);
                        if(arr_b != null && arr_b.length != 0) {
                            try {
                                JSONObject jSONObject0 = new JSONObject(new String(arr_b));
                                String s1 = jSONObject0.optString("deeplink", "");
                                String s2 = jSONObject0.optString("gclid", "");
                                String s3 = jSONObject0.optString("gbraid", "");
                                double f = jSONObject0.optDouble("timestamp", 0.0);
                                if(TextUtils.isEmpty(s1)) {
                                    this.zzj().zzc().zza("Deferred Deep Link is empty.");
                                    return;
                                }
                                Bundle bundle0 = new Bundle();
                                if(zzoi.zza() && this.zzi.zza(zzbi.zzcs)) {
                                    if(!this.zzt().zzi(s1)) {
                                        this.zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", s2, s3, s1);
                                        return;
                                    }
                                    bundle0.putString("gbraid", s3);
                                }
                                else if(!this.zzt().zzi(s1)) {
                                    this.zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", s2, s1);
                                    return;
                                }
                                bundle0.putString("gclid", s2);
                                bundle0.putString("_cis", "ddp");
                                this.zzr.zzc("auto", "_cmp", bundle0);
                                zznd zznd0 = this.zzt();
                                if(!TextUtils.isEmpty(s1) && zznd0.zza(s1, f)) {
                                    Intent intent0 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    zznd0.zza().sendBroadcast(intent0);
                                }
                                return;
                            }
                            catch(JSONException jSONException0) {
                            }
                            this.zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", jSONException0);
                            return;
                        }
                        this.zzj().zzc().zza("Deferred Deep Link response empty.");
                        return;
                    }
                    this.zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", v, throwable0);
                };
                zzkc0.zzt();
                zzkc0.zzab();
                Preconditions.checkNotNull(uRL0);
                Preconditions.checkNotNull(zzhh0);
                zzkc0.zzl().zza(new zzke(zzkc0, s, uRL0, null, null, zzhh0));
            }
            return false;
        }
        this.zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        return false;
    }

    private final zzkc zzai() {
        zzhf.zza(this.zzt);
        return this.zzt;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return this.zzp;
    }

    public final void zzb(boolean z) {
        this.zzl().zzt();
        this.zzaf = z;
    }

    public final int zzc() {
        this.zzl().zzt();
        if(this.zzi.zzv()) {
            return 1;
        }
        if(this.zzae != null && this.zzae.booleanValue()) {
            return 2;
        }
        if(!this.zzad()) {
            return 8;
        }
        Boolean boolean0 = this.zzn().zzu();
        if(boolean0 != null) {
            return boolean0.booleanValue() ? 0 : 3;
        }
        Boolean boolean1 = this.zzi.zzg("firebase_analytics_collection_enabled");
        if(boolean1 != null) {
            return boolean1.booleanValue() ? 0 : 4;
        }
        Boolean boolean2 = this.zzad;
        if(boolean2 != null) {
            return boolean2.booleanValue() ? 0 : 5;
        }
        return this.zzac != null && !this.zzac.booleanValue() ? 7 : 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return this.zzh;
    }

    public final zzb zze() {
        zzb zzb0 = this.zzs;
        if(zzb0 == null) {
            throw new IllegalStateException("Component not created");
        }
        return zzb0;
    }

    public final zzaf zzf() {
        return this.zzi;
    }

    public final zzba zzg() {
        zzhf.zza(this.zzx);
        return this.zzx;
    }

    public final zzfl zzh() {
        zzhf.zza(this.zzy);
        return this.zzy;
    }

    public final zzfo zzi() {
        zzhf.zza(this.zzv);
        return this.zzv;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        zzhf.zza(this.zzk);
        return this.zzk;
    }

    public final zzfq zzk() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        zzhf.zza(this.zzl);
        return this.zzl;
    }

    public final zzfr zzm() {
        return this.zzk == null || !this.zzk.zzae() ? null : this.zzk;
    }

    public final zzgd zzn() {
        zzhf.zza(this.zzj);
        return this.zzj;
    }

    final zzgy zzo() {
        return this.zzl;
    }

    public final zziq zzp() {
        zzhf.zza(this.zzr);
        return this.zzr;
    }

    public final zzkh zzq() {
        zzhf.zza(this.zzq);
        return this.zzq;
    }

    public final zzkp zzr() {
        zzhf.zza(this.zzw);
        return this.zzw;
    }

    public final zzlx zzs() {
        zzhf.zza(this.zzm);
        return this.zzm;
    }

    public final zznd zzt() {
        zzhf.zza(this.zzn);
        return this.zzn;
    }

    public final String zzu() {
        return this.zzd;
    }

    public final String zzv() {
        return this.zze;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzu;
    }

    final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }
}

