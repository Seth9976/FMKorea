package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzoo;
import com.google.android.gms.internal.measurement.zzot;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class zzaf extends zzid {
    private Boolean zza;
    private zzah zzb;
    private Boolean zzc;

    zzaf(zzhf zzhf0) {
        super(zzhf0);
        this.zzb = (String s, String s1) -> null;
    }

    private final String zza(String s, String s1) {
        try {
            String s2 = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, s1);
            Preconditions.checkNotNull(s2);
            return s2;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            this.zzj().zzg().zza("Could not find SystemProperties class", classNotFoundException0);
            return s1;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            this.zzj().zzg().zza("Could not find SystemProperties.get() method", noSuchMethodException0);
            return s1;
        }
        catch(IllegalAccessException illegalAccessException0) {
            this.zzj().zzg().zza("Could not access SystemProperties.get()", illegalAccessException0);
            return s1;
        }
        catch(InvocationTargetException invocationTargetException0) {
            this.zzj().zzg().zza("SystemProperties.get() threw an exception", invocationTargetException0);
            return s1;
        }
    }

    public final double zza(String s, zzfi zzfi0) {
        if(s == null) {
            return (double)(((Double)zzfi0.zza(null)));
        }
        String s1 = this.zzb.zza(s, zzfi0.zza());
        if(TextUtils.isEmpty(s1)) {
            return (double)(((Double)zzfi0.zza(null)));
        }
        try {
            return (double)(((Double)zzfi0.zza(Double.parseDouble(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (double)(((Double)zzfi0.zza(null)));
        }
    }

    final int zza(String s) {
        return this.zza(s, zzbi.zzah, 500, 2000);
    }

    public final int zza(String s, zzfi zzfi0, int v, int v1) {
        return Math.max(Math.min(this.zzb(s, zzfi0), v1), v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Context zza() {
        return super.zza();
    }

    final void zza(zzah zzah0) {
        this.zzb = zzah0;
    }

    public final boolean zza(zzfi zzfi0) {
        return this.zzf(null, zzfi0);
    }

    // 去混淆评级： 低(20)
    final int zzb(String s) {
        return !zzoo.zza() || !this.zze().zzf(null, zzbi.zzcu) ? 100 : 500;
    }

    public final int zzb(String s, zzfi zzfi0) {
        if(s == null) {
            return (int)(((Integer)zzfi0.zza(null)));
        }
        String s1 = this.zzb.zza(s, zzfi0.zza());
        if(TextUtils.isEmpty(s1)) {
            return (int)(((Integer)zzfi0.zza(null)));
        }
        try {
            return (int)(((Integer)zzfi0.zza(Integer.parseInt(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (int)(((Integer)zzfi0.zza(null)));
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final Clock zzb() {
        return super.zzb();
    }

    // 去混淆评级： 低(30)
    final int zzc() {
        return !zzot.zza() || !this.zze().zzf(null, zzbi.zzcc) || !this.zzq().zza(231100000, true) ? 0 : 35;
    }

    final int zzc(String s) {
        return Math.max(this.zzb(s), 0x100);
    }

    public final long zzc(String s, zzfi zzfi0) {
        if(s == null) {
            return (long)(((Long)zzfi0.zza(null)));
        }
        String s1 = this.zzb.zza(s, zzfi0.zza());
        if(TextUtils.isEmpty(s1)) {
            return (long)(((Long)zzfi0.zza(null)));
        }
        try {
            return (long)(((Long)zzfi0.zza(Long.parseLong(s1))));
        }
        catch(NumberFormatException unused_ex) {
            return (long)(((Long)zzfi0.zza(null)));
        }
    }

    public final int zzd(String s) {
        return this.zza(s, zzbi.zzai, 25, 100);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzae zzd() {
        return super.zzd();
    }

    public final String zzd(String s, zzfi zzfi0) {
        return s == null ? ((String)zzfi0.zza(null)) : ((String)zzfi0.zza(this.zzb.zza(s, zzfi0.zza())));
    }

    public final int zze(String s) {
        return this.zzb(s, zzbi.zzo);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzaf zze() {
        return super.zze();
    }

    public final boolean zze(String s, zzfi zzfi0) {
        return this.zzf(s, zzfi0);
    }

    final long zzf(String s) {
        return this.zzc(s, zzbi.zza);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzba zzf() {
        return super.zzf();
    }

    public final boolean zzf(String s, zzfi zzfi0) {
        if(s == null) {
            return ((Boolean)zzfi0.zza(null)).booleanValue();
        }
        String s1 = this.zzb.zza(s, zzfi0.zza());
        return TextUtils.isEmpty(s1) ? ((Boolean)zzfi0.zza(null)).booleanValue() : ((Boolean)zzfi0.zza(Boolean.valueOf("1".equals(s1)))).booleanValue();
    }

    // 去混淆评级： 低(20)
    public final int zzg() {
        return this.zzq().zza(201500000, true) ? 100 : 25;
    }

    final Boolean zzg(String s) {
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.zzy();
        if(bundle0 == null) {
            this.zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        return bundle0.containsKey(s) ? Boolean.valueOf(bundle0.getBoolean(s)) : null;
    }

    public static long zzh() {
        return (long)(((Long)zzbi.zzd.zza(null)));
    }

    final String zzh(String s) {
        return this.zzd(s, zzbi.zzal);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfq zzi() {
        return super.zzi();
    }

    final List zzi(String s) {
        Integer integer0;
        Preconditions.checkNotEmpty(s);
        Bundle bundle0 = this.zzy();
        if(bundle0 == null) {
            this.zzj().zzg().zza("Failed to load metadata: Metadata bundle is null");
            integer0 = null;
        }
        else {
            integer0 = bundle0.containsKey(s) ? bundle0.getInt(s) : null;
        }
        if(integer0 == null) {
            return null;
        }
        try {
            String[] arr_s = this.zza().getResources().getStringArray(((int)integer0));
            return arr_s == null ? null : Arrays.asList(arr_s);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            this.zzj().zzg().zza("Failed to load string array from metadata: resource not found", resources$NotFoundException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzfr zzj() {
        return super.zzj();
    }

    final boolean zzj(String s) {
        return this.zzf(s, zzbi.zzak);
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgd zzk() {
        return super.zzk();
    }

    public final boolean zzk(String s) {
        return "1".equals(this.zzb.zza(s, "gaia_collection_enabled"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zzgy zzl() {
        return super.zzl();
    }

    public final boolean zzl(String s) {
        return "1".equals(this.zzb.zza(s, "measurement.event_sampling_enabled"));
    }

    public static long zzm() {
        return (long)(((Long)zzbi.zzad.zza(null)));
    }

    public final String zzn() {
        return this.zza("debug.firebase.analytics.app", "");
    }

    public final String zzo() {
        return this.zza("debug.deferred.deeplink", "");
    }

    public final boolean zzp() {
        Boolean boolean0 = this.zzg("google_analytics_adid_collection_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final zznd zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzr() {
        super.zzr();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzid
    public final void zzt() {
        super.zzt();
    }

    public final boolean zzu() {
        Boolean boolean0 = this.zzg("google_analytics_automatic_screen_reporting_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolean0 = this.zzg("firebase_analytics_collection_deactivated");
        return boolean0 != null && boolean0.booleanValue();
    }

    final boolean zzw() {
        if(this.zza == null) {
            Boolean boolean0 = this.zzg("app_measurement_lite");
            this.zza = boolean0;
            if(boolean0 == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzag();
    }

    public final boolean zzx() {
        if(this.zzc == null) {
            synchronized(this) {
                if(this.zzc == null) {
                    ApplicationInfo applicationInfo0 = this.zza().getApplicationInfo();
                    String s = ProcessUtils.getMyProcessName();
                    if(applicationInfo0 != null) {
                        this.zzc = Boolean.valueOf(applicationInfo0.processName != null && applicationInfo0.processName.equals(s));
                    }
                    if(this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzj().zzg().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }

    private final Bundle zzy() {
        try {
            if(this.zza().getPackageManager() == null) {
                this.zzj().zzg().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo0 = Wrappers.packageManager(this.zza()).getApplicationInfo("com.fmkorea.m.fmk", 0x80);
            if(applicationInfo0 == null) {
                this.zzj().zzg().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo0.metaData;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
        }
        this.zzj().zzg().zza("Failed to load metadata: Package name not found", packageManager$NameNotFoundException0);
        return null;
    }
}

