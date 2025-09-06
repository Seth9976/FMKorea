package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzkh extends zze {
    protected zzki zza;
    private volatile zzki zzb;
    private volatile zzki zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzki zzg;
    private zzki zzh;
    private boolean zzi;
    private final Object zzj;

    public zzkh(zzhf zzhf0) {
        super(zzhf0);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final String zza(Class class0, String s) {
        String s1 = class0.getCanonicalName();
        if(s1 == null) {
            return s;
        }
        String[] arr_s = s1.split("\\.");
        String s2 = arr_s.length <= 0 ? "" : arr_s[arr_s.length - 1];
        return s2.length() <= this.zze().zzb(null) ? s2 : s2.substring(0, this.zze().zzb(null));
    }

    private final void zza(Activity activity0, zzki zzki0, boolean z) {
        zzki zzki2;
        zzki zzki1 = this.zzb == null ? this.zzc : this.zzb;
        if(zzki0.zzb == null) {
            String s = activity0 == null ? null : this.zza(activity0.getClass(), "Activity");
            zzki2 = new zzki(zzki0.zza, s, zzki0.zzc, zzki0.zze, zzki0.zzf);
        }
        else {
            zzki2 = zzki0;
        }
        this.zzc = this.zzb;
        this.zzb = zzki2;
        long v = this.zzb().elapsedRealtime();
        this.zzl().zzb(new zzkm(this, zzki2, zzki1, v, z));
    }

    static void zza(zzkh zzkh0, Bundle bundle0, zzki zzki0, zzki zzki1, long v) {
        if(bundle0 != null) {
            bundle0.remove("screen_name");
            bundle0.remove("screen_class");
        }
        zzkh0.zza(zzki0, zzki1, v, true, zzkh0.zzq().zza(null, "screen_view", bundle0, null, false));
    }

    static void zza(zzkh zzkh0, zzki zzki0) {
        zzkh0.zzh = null;
    }

    static void zza(zzkh zzkh0, zzki zzki0, zzki zzki1, long v, boolean z, Bundle bundle0) {
        zzkh0.zza(zzki0, zzki1, v, z, null);
    }

    static void zza(zzkh zzkh0, zzki zzki0, boolean z, long v) {
        zzkh0.zza(zzki0, false, v);
    }

    private final void zza(zzki zzki0, zzki zzki1, long v, boolean z, Bundle bundle0) {
        long v4;
        this.zzt();
        boolean z1 = false;
        boolean z2 = zzki1 == null || zzki1.zzc != zzki0.zzc || !zzkk.zza(zzki1.zzb, zzki0.zzb) || !zzkk.zza(zzki1.zza, zzki0.zza);
        if(z && this.zza != null) {
            z1 = true;
        }
        if(z2) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            zznd.zza(zzki0, bundle1, true);
            if(zzki1 != null) {
                String s = zzki1.zza;
                if(s != null) {
                    bundle1.putString("_pn", s);
                }
                String s1 = zzki1.zzb;
                if(s1 != null) {
                    bundle1.putString("_pc", s1);
                }
                bundle1.putLong("_pi", zzki1.zzc);
            }
            if(z1) {
                long v1 = this.zzp().zzb.zza(v);
                if(v1 > 0L) {
                    this.zzq().zza(bundle1, v1);
                }
            }
            if(!this.zze().zzu()) {
                bundle1.putLong("_mst", 1L);
            }
            String s2 = zzki0.zze ? "app" : "auto";
            long v2 = this.zzb().currentTimeMillis();
            if(zzki0.zze) {
                long v3 = zzki0.zzf;
                v4 = v3 == 0L ? v2 : v3;
            }
            else {
                v4 = v2;
            }
            this.zzm().zza(s2, "_vs", v4, bundle1);
        }
        if(z1) {
            this.zza(this.zza, true, v);
        }
        this.zza = zzki0;
        if(zzki0.zze) {
            this.zzh = zzki0;
        }
        this.zzo().zza(zzki0);
    }

    private final void zza(zzki zzki0, boolean z, long v) {
        this.zzc().zza(this.zzb().elapsedRealtime());
        boolean z1 = zzki0 != null && zzki0.zzd;
        if(this.zzp().zza(z1, z, v) && zzki0 != null) {
            zzki0.zzd = false;
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    public final zzki zza(boolean z) {
        this.zzu();
        this.zzt();
        if(!z) {
            return this.zza;
        }
        return this.zza == null ? this.zzh : this.zza;
    }

    public final void zza(Activity activity0) {
        synchronized(this.zzj) {
            if(activity0 == this.zze) {
                this.zze = null;
            }
        }
        if(!this.zze().zzu()) {
            return;
        }
        this.zzd.remove(activity0);
    }

    public final void zza(Activity activity0, Bundle bundle0) {
        if(!this.zze().zzu()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        Bundle bundle1 = bundle0.getBundle("com.google.app_measurement.screen_service");
        if(bundle1 == null) {
            return;
        }
        zzki zzki0 = new zzki(bundle1.getString("name"), bundle1.getString("referrer_name"), bundle1.getLong("id"));
        this.zzd.put(activity0, zzki0);
    }

    @Deprecated
    public final void zza(Activity activity0, String s, String s1) {
        if(!this.zze().zzu()) {
            this.zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzki zzki0 = this.zzb;
        if(zzki0 == null) {
            this.zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if(this.zzd.get(activity0) == null) {
            this.zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if(s1 == null) {
            s1 = this.zza(activity0.getClass(), "Activity");
        }
        if(zzkk.zza(zzki0.zzb, s1) && zzkk.zza(zzki0.zza, s)) {
            this.zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if(s != null && (s.length() <= 0 || s.length() > this.zze().zzb(null))) {
            this.zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", s.length());
            return;
        }
        if(s1 != null && (s1.length() <= 0 || s1.length() > this.zze().zzb(null))) {
            this.zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", s1.length());
            return;
        }
        this.zzj().zzp().zza("Setting current screen to name, class", (s == null ? "null" : s), s1);
        zzki zzki1 = new zzki(s, s1, this.zzq().zzm());
        this.zzd.put(activity0, zzki1);
        this.zza(activity0, zzki1, true);
    }

    public final void zza(Bundle bundle0, long v) {
        String s3;
        String s = null;
        synchronized(this.zzj) {
            if(!this.zzi) {
                this.zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            if(bundle0 == null) {
                s3 = null;
            }
            else {
                String s1 = bundle0.getString("screen_name");
                if(s1 != null && (s1.length() <= 0 || s1.length() > this.zze().zzb(null))) {
                    this.zzj().zzv().zza("Invalid screen name length for screen view. Length", s1.length());
                    return;
                }
                String s2 = bundle0.getString("screen_class");
                if(s2 != null && (s2.length() <= 0 || s2.length() > this.zze().zzb(null))) {
                    this.zzj().zzv().zza("Invalid screen class length for screen view. Length", s2.length());
                    return;
                }
                s = s2;
                s3 = s1;
            }
            if(s == null) {
                s = this.zze == null ? "Activity" : this.zza(this.zze.getClass(), "Activity");
            }
            zzki zzki0 = this.zzb;
            if(this.zzf && zzki0 != null) {
                this.zzf = false;
                if(zzkk.zza(zzki0.zzb, s) && zzkk.zza(zzki0.zza, s3)) {
                    this.zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
        }
        this.zzj().zzp().zza("Logging screen view with name, class", (s3 == null ? "null" : s3), (s == null ? "null" : s));
        zzki zzki1 = this.zzb == null ? this.zzc : this.zzb;
        zzki zzki2 = new zzki(s3, s, this.zzq().zzm(), true, v);
        this.zzb = zzki2;
        this.zzc = zzki1;
        this.zzg = zzki2;
        long v2 = this.zzb().elapsedRealtime();
        this.zzl().zzb(new zzkj(this, bundle0, zzki2, zzki1, v2));
    }

    public final zzki zzaa() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    public final void zzb(Activity activity0) {
        synchronized(this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long v = this.zzb().elapsedRealtime();
        if(!this.zze().zzu()) {
            this.zzb = null;
            this.zzl().zzb(new zzko(this, v));
            return;
        }
        zzki zzki0 = this.zzd(activity0);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzl().zzb(new zzkn(this, zzki0, v));
    }

    public final void zzb(Activity activity0, Bundle bundle0) {
        if(!this.zze().zzu()) {
            return;
        }
        if(bundle0 == null) {
            return;
        }
        zzki zzki0 = (zzki)this.zzd.get(activity0);
        if(zzki0 == null) {
            return;
        }
        Bundle bundle1 = new Bundle();
        bundle1.putLong("id", zzki0.zzc);
        bundle1.putString("name", zzki0.zza);
        bundle1.putString("referrer_name", zzki0.zzb);
        bundle0.putBundle("com.google.app_measurement.screen_service", bundle1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzf
    public final zzb zzc() {
        return super.zzc();
    }

    public final void zzc(Activity activity0) {
        synchronized(this.zzj) {
            this.zzi = true;
            if(activity0 != this.zze) {
                synchronized(this.zzj) {
                    this.zze = activity0;
                    this.zzf = false;
                }
                if(this.zze().zzu()) {
                    this.zzg = null;
                    this.zzl().zzb(new zzkq(this));
                }
            }
        }
        if(!this.zze().zzu()) {
            this.zzb = this.zzg;
            this.zzl().zzb(new zzkl(this));
            return;
        }
        this.zza(activity0, this.zzd(activity0), false);
        zzb zzb0 = this.zzc();
        long v1 = zzb0.zzb().elapsedRealtime();
        zzb0.zzl().zzb(new zzc(zzb0, v1));
    }

    private final zzki zzd(Activity activity0) {
        Preconditions.checkNotNull(activity0);
        zzki zzki0 = (zzki)this.zzd.get(activity0);
        if(zzki0 == null) {
            zzki zzki1 = new zzki(null, this.zza(activity0.getClass(), "Activity"), this.zzq().zzm());
            this.zzd.put(activity0, zzki1);
            zzki0 = zzki1;
        }
        return this.zzg == null ? zzki0 : this.zzg;
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
    protected final boolean zzz() {
        return false;
    }
}

