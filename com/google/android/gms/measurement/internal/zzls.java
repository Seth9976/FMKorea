package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class zzls extends zzmo {
    public final zzgi zza;
    public final zzgi zzb;
    public final zzgi zzc;
    public final zzgi zzd;
    public final zzgi zze;
    private final Map zzg;

    zzls(zzmp zzmp0) {
        super(zzmp0);
        this.zzg = new HashMap();
        zzgd zzgd0 = this.zzk();
        zzgd0.getClass();
        this.zza = new zzgi(zzgd0, "last_delete_stale", 0L);
        zzgd zzgd1 = this.zzk();
        zzgd1.getClass();
        this.zzb = new zzgi(zzgd1, "backoff", 0L);
        zzgd zzgd2 = this.zzk();
        zzgd2.getClass();
        this.zzc = new zzgi(zzgd2, "last_upload", 0L);
        zzgd zzgd3 = this.zzk();
        zzgd3.getClass();
        this.zzd = new zzgi(zzgd3, "last_upload_attempt", 0L);
        zzgd zzgd4 = this.zzk();
        zzgd4.getClass();
        this.zze = new zzgi(zzgd4, "midnight_offset", 0L);
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmz g_() {
        return super.g_();
    }

    @Deprecated
    private final Pair zza(String s) {
        zzlr zzlr1;
        Info advertisingIdClient$Info0;
        this.zzt();
        long v = this.zzb().elapsedRealtime();
        zzlr zzlr0 = (zzlr)this.zzg.get(s);
        if(zzlr0 != null && v < zzlr0.zzc) {
            return new Pair(zzlr0.zza, Boolean.valueOf(zzlr0.zzb));
        }
        long v1 = this.zze().zzf(s) + v;
        try {
            long v2 = this.zze().zzc(s, zzbi.zzb);
            if(v2 <= 0L) {
                advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza());
            }
            else {
                try {
                    advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.zza());
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    if(zzlr0 != null && v < zzlr0.zzc + v2) {
                        return new Pair(zzlr0.zza, Boolean.valueOf(zzlr0.zzb));
                    }
                    advertisingIdClient$Info0 = null;
                }
            }
            if(advertisingIdClient$Info0 == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String s1 = advertisingIdClient$Info0.getId();
            zzlr1 = s1 == null ? new zzlr("", advertisingIdClient$Info0.isLimitAdTrackingEnabled(), v1) : new zzlr(s1, advertisingIdClient$Info0.isLimitAdTrackingEnabled(), v1);
        }
        catch(Exception exception0) {
            this.zzj().zzc().zza("Unable to get advertising id", exception0);
            zzlr1 = new zzlr("", false, v1);
        }
        this.zzg.put(s, zzlr1);
        return new Pair(zzlr1.zza, Boolean.valueOf(zzlr1.zzb));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Context zza() {
        return super.zza();
    }

    // 去混淆评级： 低(20)
    final Pair zza(String s, zzih zzih0) {
        return zzih0.zzg() ? this.zza(s) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    final String zza(String s, boolean z) {
        this.zzt();
        String s1 = z ? ((String)this.zza(s).first) : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigest0 = zznd.zzu();
        return messageDigest0 == null ? null : String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest(s1.getBytes())));
    }

    @Override  // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final Clock zzb() {
        return super.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzmo
    protected final boolean zzc() {
        return false;
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

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzt zzg() {
        return super.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzao zzh() {
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

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzgp zzm() {
        return super.zzm();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzls zzn() {
        return super.zzn();
    }

    @Override  // com.google.android.gms.measurement.internal.zzml
    public final zzmn zzo() {
        return super.zzo();
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
}

