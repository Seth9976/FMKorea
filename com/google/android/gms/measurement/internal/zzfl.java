package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zznp;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.google.android.gms.internal.measurement.zzqe;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

public final class zzfl extends zze {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzfl(zzhf zzhf0, long v) {
        super(zzhf0);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = v;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    final zzo zza(String s) {
        String s10;
        long v8;
        int v;
        String s1;
        this.zzt();
        zzih zzih0 = this.zzk().zzm();
        if(!zznp.zza() || !this.zze().zza(zzbi.zzcl)) {
            s1 = "";
            v = 100;
        }
        else {
            s1 = this.zzk().zzh().zzf();
            v = zzih0.zza();
        }
        String s2 = this.zzad();
        String s3 = this.zzae();
        this.zzu();
        String s4 = this.zzb;
        long v1 = (long)this.zzab();
        this.zzu();
        Preconditions.checkNotNull(this.zzd);
        String s5 = this.zzd;
        this.zzu();
        this.zzt();
        if(this.zzf == 0L) {
            this.zzf = this.zzu.zzt().zza(this.zza(), "com.fmkorea.m.fmk");
        }
        long v2 = this.zzf;
        boolean z = this.zzu.zzac();
        int v3 = !this.zzk().zzm;
        this.zzt();
        String s6 = this.zzu.zzac() ? this.zzah() : null;
        long v4 = this.zzu.zzn().zzc.zza();
        long v5 = v4 == 0L ? this.zzu.zza : Math.min(this.zzu.zza, v4);
        int v6 = this.zzaa();
        boolean z1 = this.zze().zzp();
        zzgd zzgd0 = this.zzk();
        zzgd0.zzt();
        boolean z2 = zzgd0.zzc().getBoolean("deferred_analytics_collection", false);
        String s7 = this.zzac();
        Boolean boolean0 = this.zze().zzg("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolean1 = boolean0 == null ? null : Boolean.valueOf(!boolean0.booleanValue());
        long v7 = this.zzg;
        List list0 = this.zzh;
        String s8 = zzih0.zze();
        if(this.zzi == null) {
            this.zzi = this.zzq().zzp();
        }
        String s9 = this.zzi;
        if(!zzps.zza() || !this.zze().zza(zzbi.zzbs)) {
            v8 = v7;
            s10 = null;
        }
        else {
            this.zzt();
            if(this.zzn == 0L) {
                v8 = v7;
            }
            else {
                v8 = v7;
                long v9 = this.zzb().currentTimeMillis() - this.zzn;
                if(this.zzm != null && v9 > 86400000L && this.zzo == null) {
                    this.zzag();
                }
            }
            if(this.zzm == null) {
                this.zzag();
            }
            s10 = this.zzm;
        }
        Boolean boolean2 = this.zze().zzg("google_analytics_sgtm_upload_enabled");
        boolean z3 = boolean2 == null ? false : boolean2.booleanValue();
        long v10 = this.zzq().zzc(this.zzad());
        if(zzpg.zza() && this.zze().zza(zzbi.zzcg)) {
            this.zzq();
            int v11 = zznd.zzc();
            return !zzpg.zza() || !this.zze().zza(zzbi.zzcg) ? new zzo(s2, s3, s4, v1, s5, 82001L, v2, s, z, ((boolean)v3), s6, 0L, v5, v6, z1, z2, s7, boolean1, v8, list0, null, s8, s9, s10, z3, v10, v, s1, v11, 0L) : new zzo(s2, s3, s4, v1, s5, 82001L, v2, s, z, ((boolean)v3), s6, 0L, v5, v6, z1, z2, s7, boolean1, v8, list0, null, s8, s9, s10, z3, v10, v, s1, v11, this.zzq().zzh());
        }
        return !zzpg.zza() || !this.zze().zza(zzbi.zzcg) ? new zzo(s2, s3, s4, v1, s5, 82001L, v2, s, z, ((boolean)v3), s6, 0L, v5, v6, z1, z2, s7, boolean1, v8, list0, null, s8, s9, s10, z3, v10, v, s1, 0, 0L) : new zzo(s2, s3, s4, v1, s5, 82001L, v2, s, z, ((boolean)v3), s6, 0L, v5, v6, z1, z2, s7, boolean1, v8, list0, null, s8, s9, s10, z3, v10, v, s1, 0, this.zzq().zzh());
    }

    final int zzaa() {
        this.zzu();
        return this.zzj;
    }

    final int zzab() {
        this.zzu();
        return this.zzc;
    }

    final String zzac() {
        this.zzu();
        return this.zzl;
    }

    final String zzad() {
        this.zzu();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzae() {
        this.zzt();
        this.zzu();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    final List zzaf() {
        return this.zzh;
    }

    final void zzag() {
        String s;
        this.zzt();
        if(this.zzk().zzm().zza(zza.zzb)) {
            byte[] arr_b = new byte[16];
            this.zzq().zzv().nextBytes(arr_b);
            s = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        else {
            this.zzj().zzc().zza("Analytics Storage consent is not granted");
            s = null;
        }
        this.zzj().zzc().zza(String.format("Resetting session stitching token to %s", (s == null ? "null" : "not null")));
        this.zzm = s;
        this.zzn = this.zzb().currentTimeMillis();
    }

    private final String zzah() {
        Object object0;
        Class class0;
        if(zzqe.zza() && this.zze().zza(zzbi.zzbk)) {
            this.zzj().zzp().zza("Disabled IID for tests.");
            return null;
        }
        try {
            class0 = this.zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if(class0 == null) {
                return null;
            }
            goto label_6;
        }
        catch(ClassNotFoundException unused_ex) {
        }
        return null;
        try {
        label_6:
            object0 = class0.getDeclaredMethod("getInstance", Context.class).invoke(null, this.zza());
        }
        catch(Exception unused_ex) {
            this.zzj().zzw().zza("Failed to obtain Firebase Analytics instance");
            return null;
        }
        if(object0 == null) {
            return null;
        }
        try {
            return (String)class0.getDeclaredMethod("getFirebaseInstanceId", null).invoke(object0, null);
        }
        catch(Exception unused_ex) {
            this.zzj().zzv().zza("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    final boolean zzb(String s) {
        boolean z = this.zzo != null && !this.zzo.equals(s);
        this.zzo = s;
        return z;
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzb zzc() {
        return super.zzc();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzae zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzfl zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzfo zzh() {
        return super.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzfr zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final zzgy zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zziq zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzkh zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzkp zzo() {
        return super.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzlx zzp() {
        return super.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final void zzt() {
        super.zzt();
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    protected final void zzx() {
        String s3;
        PackageManager packageManager0 = this.zza().getPackageManager();
        String s = "";
        String s1 = "unknown";
        String s2 = "Unknown";
        int v = 0x80000000;
        if(packageManager0 == null) {
            this.zzj().zzg().zza("PackageManager is null, app identity information might be inaccurate. appId", zzfr.zza("com.fmkorea.m.fmk"));
            goto label_23;
        }
        else {
            try {
                s1 = packageManager0.getInstallerPackageName("com.fmkorea.m.fmk");
            }
            catch(IllegalArgumentException unused_ex) {
                this.zzj().zzg().zza("Error retrieving app installer package name. appId", zzfr.zza("com.fmkorea.m.fmk"));
            }
            if(s1 == null) {
                s1 = "manual_install";
            }
            else if("com.android.vending".equals(s1)) {
                s1 = "";
            }
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.fmkorea.m.fmk", 0);
                if(packageInfo0 == null) {
                label_23:
                    s3 = "Unknown";
                }
                else {
                    CharSequence charSequence0 = packageManager0.getApplicationLabel(packageInfo0.applicationInfo);
                    s3 = TextUtils.isEmpty(charSequence0) ? "Unknown" : charSequence0.toString();
                    s2 = packageInfo0.versionName;
                    v = packageInfo0.versionCode;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                this.zzj().zzg().zza("Error retrieving package info. appId, appName", zzfr.zza("com.fmkorea.m.fmk"), "Unknown");
                s3 = "Unknown";
            }
        }
        this.zza = "com.fmkorea.m.fmk";
        this.zzd = s1;
        this.zzb = s2;
        this.zzc = v;
        this.zze = s3;
        this.zzf = 0L;
        boolean z = true;
        boolean z1 = !TextUtils.isEmpty(this.zzu.zzu()) && "am".equals(this.zzu.zzv());
        int v1 = this.zzu.zzc();
        switch(v1) {
            case 0: {
                this.zzj().zzp().zza("App measurement collection enabled");
                break;
            }
            case 1: {
                this.zzj().zzn().zza("App measurement deactivated via the manifest");
                break;
            }
            case 2: {
                this.zzj().zzp().zza("App measurement deactivated via the init parameters");
                break;
            }
            case 3: {
                this.zzj().zzn().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            }
            case 4: {
                this.zzj().zzn().zza("App measurement disabled via the manifest");
                break;
            }
            case 5: {
                this.zzj().zzp().zza("App measurement disabled via the init parameters");
                break;
            }
            case 6: {
                this.zzj().zzv().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            }
            case 7: {
                this.zzj().zzn().zza("App measurement disabled via the global data collection setting");
                break;
            }
            case 8: {
                this.zzj().zzn().zza("App measurement disabled due to denied storage consent");
                break;
            }
            default: {
                this.zzj().zzn().zza("App measurement disabled");
                this.zzj().zzm().zza("Invalid scion state in identity");
            }
        }
        if(v1 != 0) {
            z = false;
        }
        this.zzk = "";
        this.zzl = "";
        if(z1) {
            this.zzl = this.zzu.zzu();
        }
        try {
            String s4 = new zzgz(this.zza(), this.zzu.zzx()).zza("google_app_id");
            if(!TextUtils.isEmpty(s4)) {
                s = s4;
            }
            this.zzk = s;
            if(!TextUtils.isEmpty(s4)) {
                this.zzl = new zzgz(this.zza(), this.zzu.zzx()).zza("admob_app_id");
            }
            if(z) {
                this.zzj().zzp().zza("App measurement enabled for app package, google app id", this.zza, (TextUtils.isEmpty(this.zzk) ? this.zzl : this.zzk));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            this.zzj().zzg().zza("Fetching Google App Id failed with exception. appId", zzfr.zza("com.fmkorea.m.fmk"), illegalStateException0);
        }
        this.zzh = null;
        List list0 = this.zze().zzi("analytics.safelisted_events");
        if(list0 == null) {
            this.zzh = null;
        }
        else if(list0.isEmpty()) {
            this.zzj().zzv().zza("Safelisted event list is empty. Ignoring");
        }
        else {
            for(Object object0: list0) {
                if(this.zzq().zzb("safelisted event", ((String)object0))) {
                    continue;
                }
                goto label_88;
            }
            this.zzh = list0;
        }
    label_88:
        if(packageManager0 != null) {
            this.zzj = InstantApps.isInstantApp(this.zza());
            return;
        }
        this.zzj = 0;
    }

    @Override  // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return true;
    }
}

