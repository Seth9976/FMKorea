package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

public final class zzbnv extends zzcgy {
    private final AppMeasurementSdk zza;

    zzbnv(AppMeasurementSdk appMeasurementSdk0) {
        this.zza = appMeasurementSdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final int zzb(String s) {
        return this.zza.getMaxUserProperties(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final long zzc() {
        return this.zza.generateEventId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final Bundle zzd(Bundle bundle0) {
        return this.zza.performActionWithResponse(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final String zze() {
        return this.zza.getAppIdOrigin();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final String zzf() {
        return this.zza.getAppInstanceId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final String zzg() {
        return this.zza.getCurrentScreenClass();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final String zzh() {
        return this.zza.getCurrentScreenName();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final String zzi() {
        return this.zza.getGmpAppId();
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final List zzj(String s, String s1) {
        return this.zza.getConditionalUserProperties(s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final Map zzk(String s, String s1, boolean z) {
        return this.zza.getUserProperties(s, s1, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzl(String s) {
        this.zza.beginAdUnitExposure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzm(String s, String s1, Bundle bundle0) {
        this.zza.clearConditionalUserProperty(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzn(String s) {
        this.zza.endAdUnitExposure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzo(String s, String s1, Bundle bundle0) {
        this.zza.logEvent(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzp(Bundle bundle0) {
        this.zza.performAction(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzq(Bundle bundle0) {
        this.zza.setConditionalUserProperty(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzr(Bundle bundle0) {
        this.zza.setConsent(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzs(IObjectWrapper iObjectWrapper0, String s, String s1) {
        Activity activity0 = iObjectWrapper0 == null ? null : ((Activity)ObjectWrapper.unwrap(iObjectWrapper0));
        this.zza.setCurrentScreen(activity0, s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcgz
    public final void zzt(String s, String s1, IObjectWrapper iObjectWrapper0) {
        Object object0 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.setUserProperty(s, s1, object0);
    }
}

