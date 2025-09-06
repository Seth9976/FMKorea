package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzcw extends zzbu implements zzcu {
    zzcw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void beginAdUnitExposure(String s, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.zzb(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void clearConditionalUserProperty(String s, String s1, Bundle bundle0) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        this.zzb(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void clearMeasurementEnabled(long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(43, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void endAdUnitExposure(String s, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.zzb(24, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void generateEventId(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(22, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getAppInstanceId(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(20, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getCachedAppInstanceId(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(19, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getConditionalUserProperties(String s, String s1, zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, zzcv0);
        this.zzb(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenClass(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(17, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getCurrentScreenName(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(16, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getGmpAppId(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getMaxUserProperties(String s, zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        zzbw.zza(parcel0, zzcv0);
        this.zzb(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getSessionId(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(46, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getTestFlag(zzcv zzcv0, int v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        parcel0.writeInt(v);
        this.zzb(38, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void getUserProperties(String s, String s1, boolean z, zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, z);
        zzbw.zza(parcel0, zzcv0);
        this.zzb(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void initForTests(Map map0) {
        Parcel parcel0 = this.a_();
        parcel0.writeMap(map0);
        this.zzb(37, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void initialize(IObjectWrapper iObjectWrapper0, zzdd zzdd0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, zzdd0);
        parcel0.writeLong(v);
        this.zzb(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void isDataCollectionEnabled(zzcv zzcv0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzcv0);
        this.zzb(40, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void logEvent(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, z);
        zzbw.zza(parcel0, z1);
        parcel0.writeLong(v);
        this.zzb(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void logEventAndBundle(String s, String s1, Bundle bundle0, zzcv zzcv0, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, zzcv0);
        parcel0.writeLong(v);
        this.zzb(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void logHealthData(int v, String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        Parcel parcel0 = this.a_();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, iObjectWrapper1);
        zzbw.zza(parcel0, iObjectWrapper2);
        this.zzb(33, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityCreated(IObjectWrapper iObjectWrapper0, Bundle bundle0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(27, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(28, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityPaused(IObjectWrapper iObjectWrapper0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(29, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityResumed(IObjectWrapper iObjectWrapper0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(30, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzcv zzcv0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, zzcv0);
        parcel0.writeLong(v);
        this.zzb(0x1F, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStarted(IObjectWrapper iObjectWrapper0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(25, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void onActivityStopped(IObjectWrapper iObjectWrapper0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeLong(v);
        this.zzb(26, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void performAction(Bundle bundle0, zzcv zzcv0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        zzbw.zza(parcel0, zzcv0);
        parcel0.writeLong(v);
        this.zzb(0x20, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void registerOnMeasurementEventListener(zzda zzda0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzda0);
        this.zzb(35, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void resetAnalyticsData(long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(12, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setConditionalUserProperty(Bundle bundle0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setConsent(Bundle bundle0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(44, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setConsentThirdParty(Bundle bundle0, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        parcel0.writeLong(v);
        this.zzb(45, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper0, String s, String s1, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        parcel0.writeLong(v);
        this.zzb(15, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setDataCollectionEnabled(boolean z) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, z);
        this.zzb(39, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setDefaultEventParameters(Bundle bundle0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        this.zzb(42, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setEventInterceptor(zzda zzda0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzda0);
        this.zzb(34, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setInstanceIdProvider(zzdb zzdb0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzdb0);
        this.zzb(18, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setMeasurementEnabled(boolean z, long v) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, z);
        parcel0.writeLong(v);
        this.zzb(11, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setMinimumSessionDuration(long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setSessionTimeoutDuration(long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeLong(v);
        this.zzb(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setUserId(String s, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeLong(v);
        this.zzb(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void setUserProperty(String s, String s1, IObjectWrapper iObjectWrapper0, boolean z, long v) {
        Parcel parcel0 = this.a_();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzbw.zza(parcel0, iObjectWrapper0);
        zzbw.zza(parcel0, z);
        parcel0.writeLong(v);
        this.zzb(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public final void unregisterOnMeasurementEventListener(zzda zzda0) {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, zzda0);
        this.zzb(36, parcel0);
    }
}

