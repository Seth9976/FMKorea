package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public interface zzcu extends IInterface {
    void beginAdUnitExposure(String arg1, long arg2);

    void clearConditionalUserProperty(String arg1, String arg2, Bundle arg3);

    void clearMeasurementEnabled(long arg1);

    void endAdUnitExposure(String arg1, long arg2);

    void generateEventId(zzcv arg1);

    void getAppInstanceId(zzcv arg1);

    void getCachedAppInstanceId(zzcv arg1);

    void getConditionalUserProperties(String arg1, String arg2, zzcv arg3);

    void getCurrentScreenClass(zzcv arg1);

    void getCurrentScreenName(zzcv arg1);

    void getGmpAppId(zzcv arg1);

    void getMaxUserProperties(String arg1, zzcv arg2);

    void getSessionId(zzcv arg1);

    void getTestFlag(zzcv arg1, int arg2);

    void getUserProperties(String arg1, String arg2, boolean arg3, zzcv arg4);

    void initForTests(Map arg1);

    void initialize(IObjectWrapper arg1, zzdd arg2, long arg3);

    void isDataCollectionEnabled(zzcv arg1);

    void logEvent(String arg1, String arg2, Bundle arg3, boolean arg4, boolean arg5, long arg6);

    void logEventAndBundle(String arg1, String arg2, Bundle arg3, zzcv arg4, long arg5);

    void logHealthData(int arg1, String arg2, IObjectWrapper arg3, IObjectWrapper arg4, IObjectWrapper arg5);

    void onActivityCreated(IObjectWrapper arg1, Bundle arg2, long arg3);

    void onActivityDestroyed(IObjectWrapper arg1, long arg2);

    void onActivityPaused(IObjectWrapper arg1, long arg2);

    void onActivityResumed(IObjectWrapper arg1, long arg2);

    void onActivitySaveInstanceState(IObjectWrapper arg1, zzcv arg2, long arg3);

    void onActivityStarted(IObjectWrapper arg1, long arg2);

    void onActivityStopped(IObjectWrapper arg1, long arg2);

    void performAction(Bundle arg1, zzcv arg2, long arg3);

    void registerOnMeasurementEventListener(zzda arg1);

    void resetAnalyticsData(long arg1);

    void setConditionalUserProperty(Bundle arg1, long arg2);

    void setConsent(Bundle arg1, long arg2);

    void setConsentThirdParty(Bundle arg1, long arg2);

    void setCurrentScreen(IObjectWrapper arg1, String arg2, String arg3, long arg4);

    void setDataCollectionEnabled(boolean arg1);

    void setDefaultEventParameters(Bundle arg1);

    void setEventInterceptor(zzda arg1);

    void setInstanceIdProvider(zzdb arg1);

    void setMeasurementEnabled(boolean arg1, long arg2);

    void setMinimumSessionDuration(long arg1);

    void setSessionTimeoutDuration(long arg1);

    void setUserId(String arg1, long arg2);

    void setUserProperty(String arg1, String arg2, IObjectWrapper arg3, boolean arg4, long arg5);

    void unregisterOnMeasurementEventListener(zzda arg1);
}

