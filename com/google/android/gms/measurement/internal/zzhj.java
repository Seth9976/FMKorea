package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zznp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzhj extends zzfj {
    private final zzmp zza;
    private Boolean zzb;
    private String zzc;

    public zzhj(zzmp zzmp0) {
        this(zzmp0, null);
    }

    private zzhj(zzmp zzmp0, String s) {
        Preconditions.checkNotNull(zzmp0);
        this.zza = zzmp0;
        this.zzc = null;
    }

    private final void zza(Runnable runnable0) {
        Preconditions.checkNotNull(runnable0);
        if(this.zza.zzl().zzg()) {
            runnable0.run();
            return;
        }
        this.zza.zzl().zzb(runnable0);
    }

    private final void zza(String s, boolean z) {
        if(!TextUtils.isEmpty(s)) {
            try {
                if(z) {
                    if(this.zzb == null) {
                        this.zzb = Boolean.valueOf("com.google.android.gms".equals(this.zzc) || UidVerifier.isGooglePlayServicesUid(this.zza.zza(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.zza.zza()).isUidGoogleSigned(Binder.getCallingUid()));
                    }
                    if(!this.zzb.booleanValue()) {
                        goto label_5;
                    }
                    return;
                }
            label_5:
                if(this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zza(), Binder.getCallingUid(), s)) {
                    this.zzc = s;
                }
                if(!s.equals(this.zzc)) {
                    throw new SecurityException(String.format("Unknown calling package name \'%s\'.", s));
                }
                return;
            }
            catch(SecurityException securityException0) {
            }
            this.zza.zzj().zzg().zza("Measurement Service called with invalid calling package. appId", zzfr.zza(s));
            throw securityException0;
        }
        this.zza.zzj().zzg().zza("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final zzam zza(zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotEmpty(zzo0.zza);
        if(zznp.zza()) {
            Future future0 = this.zza.zzl().zzb(new zzhu(this, zzo0));
            try {
                return (zzam)future0.get(10000L, TimeUnit.MILLISECONDS);
            }
            catch(TimeoutException | InterruptedException | ExecutionException timeoutException0) {
                this.zza.zzj().zzg().zza("Failed to get consent. appId", zzfr.zza(zzo0.zza), timeoutException0);
                return new zzam(null);
            }
        }
        return new zzam(null);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(zzo zzo0, Bundle bundle0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzib(this, zzo0, bundle0));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            this.zza.zzj().zzg().zza("Failed to get trigger URIs. appId", zzfr.zza(zzo0.zza), interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(zzo zzo0, boolean z) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzia(this, zzo0.zza));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                zzne zzne0 = (zzne)object0;
                if(z || !zznd.zzg(zzne0.zzc)) {
                    list1.add(new zznc(zzne0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to get user properties. appId", zzfr.zza(zzo0.zza), interruptedException0);
        return null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzhq(this, zzo0.zza, s, s1));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, String s2) {
        this.zza(s, true);
        Future future0 = this.zza.zzl().zza(new zzht(this, s, s1, s2));
        try {
            return (List)future0.get();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties as", interruptedException0);
            return Collections.emptyList();
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, String s2, boolean z) {
        this.zza(s, true);
        Future future0 = this.zza.zzl().zza(new zzhr(this, s, s1, s2));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                zzne zzne0 = (zzne)object0;
                if(z || !zznd.zzg(zzne0.zzc)) {
                    list1.add(new zznc(zzne0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to get user properties as. appId", zzfr.zza(s), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final List zza(String s, String s1, boolean z, zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        Future future0 = this.zza.zzl().zza(new zzho(this, zzo0.zza, s, s1));
        try {
            List list0 = (List)future0.get();
            List list1 = new ArrayList(list0.size());
            for(Object object0: list0) {
                zzne zzne0 = (zzne)object0;
                if(z || !zznd.zzg(zzne0.zzc)) {
                    list1.add(new zznc(zzne0));
                }
            }
            return list1;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to query user properties. appId", zzfr.zza(zzo0.zza), interruptedException0);
        return Collections.emptyList();
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(long v, String s, String s1, String s2) {
        this.zza(new zzhn(this, s1, s2, s, v));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(Bundle bundle0, zzo zzo0) {
        this.zzb(zzo0, false);
        Preconditions.checkNotNull(zzo0.zza);
        this.zza(() -> this.zza.zzf().zza(zzo0.zza, bundle0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzad zzad0) {
        Preconditions.checkNotNull(zzad0);
        Preconditions.checkNotNull(zzad0.zzc);
        Preconditions.checkNotEmpty(zzad0.zza);
        this.zza(zzad0.zza, true);
        this.zza(new zzhp(this, new zzad(zzad0)));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzad zzad0, zzo zzo0) {
        Preconditions.checkNotNull(zzad0);
        Preconditions.checkNotNull(zzad0.zzc);
        this.zzb(zzo0, false);
        zzad zzad1 = new zzad(zzad0);
        zzad1.zza = zzo0.zza;
        this.zza(new zzhm(this, zzad1, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzbg zzbg0, zzo zzo0) {
        Preconditions.checkNotNull(zzbg0);
        this.zzb(zzo0, false);
        this.zza(new zzhx(this, zzbg0, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zzbg zzbg0, String s, String s1) {
        Preconditions.checkNotNull(zzbg0);
        Preconditions.checkNotEmpty(s);
        this.zza(s, true);
        this.zza(new zzhw(this, zzbg0, s));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zza(zznc zznc0, zzo zzo0) {
        Preconditions.checkNotNull(zznc0);
        this.zzb(zzo0, false);
        this.zza(new zzhy(this, zznc0, zzo0));
    }

    // 检测为 Lambda 实现
    final void zza(String s, Bundle bundle0) [...]

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final byte[] zza(zzbg zzbg0, String s) {
        Preconditions.checkNotEmpty(s);
        Preconditions.checkNotNull(zzbg0);
        this.zza(s, true);
        this.zza.zzj().zzc().zza("Log and bundle. event", this.zza.zzg().zza(zzbg0.zza));
        long v = this.zza.zzb().nanoTime();
        Future future0 = this.zza.zzl().zzb(new zzhz(this, zzbg0, s));
        try {
            byte[] arr_b = (byte[])future0.get();
            if(arr_b == null) {
                this.zza.zzj().zzg().zza("Log and bundle returned null. appId", zzfr.zza(s));
                arr_b = new byte[0];
            }
            long v1 = this.zza.zzb().nanoTime();
            this.zza.zzj().zzc().zza("Log and bundle processed. event, size, time_ms", this.zza.zzg().zza(zzbg0.zza), ((int)arr_b.length), ((long)(v1 / 1000000L - v / 1000000L)));
            return arr_b;
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
        }
        this.zza.zzj().zzg().zza("Failed to log and bundle. appId, event, error", zzfr.zza(s), this.zza.zzg().zza(zzbg0.zza), interruptedException0);
        return null;
    }

    private final void zzb(zzo zzo0, boolean z) {
        Preconditions.checkNotNull(zzo0);
        Preconditions.checkNotEmpty(zzo0.zza);
        this.zza(zzo0.zza, false);
        this.zza.zzq().zza(zzo0.zzb, zzo0.zzp);
    }

    final zzbg zzb(zzbg zzbg0, zzo zzo0) {
        if("_cmp".equals(zzbg0.zza) && (zzbg0.zzb != null && zzbg0.zzb.zza() != 0)) {
            String s = zzbg0.zzb.zzd("_cis");
            if("referrer broadcast".equals(s) || "referrer API".equals(s)) {
                this.zza.zzj().zzn().zza("Event has been filtered ", zzbg0.toString());
                return new zzbg("_cmpx", zzbg0.zzb, zzbg0.zzc, zzbg0.zzd);
            }
        }
        return zzbg0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final String zzb(zzo zzo0) {
        this.zzb(zzo0, false);
        return this.zza.zzb(zzo0);
    }

    final void zzc(zzbg zzbg0, zzo zzo0) {
        boolean z;
        if(!this.zza.zzi().zzl(zzo0.zza)) {
            this.zzd(zzbg0, zzo0);
            return;
        }
        this.zza.zzj().zzp().zza("EES config found for", zzo0.zza);
        zzgp zzgp0 = this.zza.zzi();
        zzb zzb0 = TextUtils.isEmpty(zzo0.zza) ? null : ((zzb)zzgp0.zza.get(zzo0.zza));
        if(zzb0 == null) {
            this.zza.zzj().zzp().zza("EES not loaded for", zzo0.zza);
            this.zzd(zzbg0, zzo0);
            return;
        }
        try {
            Map map0 = this.zza.zzp().zza(zzbg0.zzb.zzb(), true);
            String s = zzii.zza(zzbg0.zza);
            if(s == null) {
                s = zzbg0.zza;
            }
            z = zzb0.zza(new com.google.android.gms.internal.measurement.zzad(s, zzbg0.zzd, map0));
        }
        catch(zzc unused_ex) {
            this.zza.zzj().zzg().zza("EES error. appId, eventName", zzo0.zzb, zzbg0.zza);
            z = false;
        }
        if(!z) {
            this.zza.zzj().zzp().zza("EES was not applied to event", zzbg0.zza);
            this.zzd(zzbg0, zzo0);
            return;
        }
        if(zzb0.zzd()) {
            this.zza.zzj().zzp().zza("EES edited event", zzbg0.zza);
            this.zzd(this.zza.zzp().zza(zzb0.zza().zzb()), zzo0);
        }
        else {
            this.zzd(zzbg0, zzo0);
        }
        if(zzb0.zzc()) {
            for(Object object0: zzb0.zza().zzc()) {
                this.zza.zzj().zzp().zza("EES logging created event", ((com.google.android.gms.internal.measurement.zzad)object0).zzb());
                this.zzd(this.zza.zzp().zza(((com.google.android.gms.internal.measurement.zzad)object0)), zzo0);
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zzc(zzo zzo0) {
        this.zzb(zzo0, false);
        this.zza(new zzhk(this, zzo0));
    }

    private final void zzd(zzbg zzbg0, zzo zzo0) {
        this.zza.zzr();
        this.zza.zza(zzbg0, zzo0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zzd(zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        this.zza(zzo0.zza, false);
        this.zza(new zzhs(this, zzo0));
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zze(zzo zzo0) {
        Preconditions.checkNotEmpty(zzo0.zza);
        Preconditions.checkNotNull(zzo0.zzt);
        zzhv zzhv0 = new zzhv(this, zzo0);
        Preconditions.checkNotNull(zzhv0);
        if(this.zza.zzl().zzg()) {
            zzhv0.run();
            return;
        }
        this.zza.zzl().zzc(zzhv0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzfk
    public final void zzf(zzo zzo0) {
        this.zzb(zzo0, false);
        this.zza(new zzhl(this, zzo0));
    }
}

