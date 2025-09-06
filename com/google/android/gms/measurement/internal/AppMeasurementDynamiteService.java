package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzct;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import java.util.Map;

@DynamiteApi
public class AppMeasurementDynamiteService extends zzct {
    final class zza implements zzim {
        private zzda zza;
        private final AppMeasurementDynamiteService zzb;

        zza(zzda zzda0) {
            this.zza = zzda0;
        }

        @Override  // com.google.android.gms.measurement.internal.zzim
        public final void interceptEvent(String s, String s1, Bundle bundle0, long v) {
            try {
                this.zza.zza(s, s1, bundle0, v);
            }
            catch(RemoteException remoteException0) {
                zzhf zzhf0 = AppMeasurementDynamiteService.this.zza;
                if(zzhf0 != null) {
                    zzhf0.zzj().zzu().zza("Event interceptor threw exception", remoteException0);
                }
            }
        }
    }

    final class zzb implements zzil {
        private zzda zza;
        private final AppMeasurementDynamiteService zzb;

        zzb(zzda zzda0) {
            this.zza = zzda0;
        }

        @Override  // com.google.android.gms.measurement.internal.zzil
        public final void onEvent(String s, String s1, Bundle bundle0, long v) {
            try {
                this.zza.zza(s, s1, bundle0, v);
            }
            catch(RemoteException remoteException0) {
                zzhf zzhf0 = AppMeasurementDynamiteService.this.zza;
                if(zzhf0 != null) {
                    zzhf0.zzj().zzu().zza("Event listener threw exception", remoteException0);
                }
            }
        }
    }

    zzhf zza;
    private final Map zzb;

    public AppMeasurementDynamiteService() {
        this.zza = null;
        this.zzb = new a();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void beginAdUnitExposure(String s, long v) {
        this.zza();
        this.zza.zze().zza(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void clearConditionalUserProperty(String s, String s1, Bundle bundle0) {
        this.zza();
        this.zza.zzp().zza(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void clearMeasurementEnabled(long v) {
        this.zza();
        this.zza.zzp().zza(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void endAdUnitExposure(String s, long v) {
        this.zza();
        this.zza.zze().zzb(s, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void generateEventId(zzcv zzcv0) {
        this.zza();
        long v = this.zza.zzt().zzm();
        this.zza();
        this.zza.zzt().zza(zzcv0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getAppInstanceId(zzcv zzcv0) {
        this.zza();
        this.zza.zzl().zzb(new zzi(this, zzcv0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getCachedAppInstanceId(zzcv zzcv0) {
        this.zza();
        this.zza(zzcv0, this.zza.zzp().zzae());
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getConditionalUserProperties(String s, String s1, zzcv zzcv0) {
        this.zza();
        this.zza.zzl().zzb(new zzl(this, zzcv0, s, s1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenClass(zzcv zzcv0) {
        this.zza();
        this.zza(zzcv0, this.zza.zzp().zzaf());
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getCurrentScreenName(zzcv zzcv0) {
        this.zza();
        this.zza(zzcv0, this.zza.zzp().zzag());
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getGmpAppId(zzcv zzcv0) {
        this.zza();
        this.zza(zzcv0, this.zza.zzp().zzah());
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getMaxUserProperties(String s, zzcv zzcv0) {
        this.zza();
        this.zza.zzp();
        Preconditions.checkNotEmpty(s);
        this.zza();
        this.zza.zzt().zza(zzcv0, 25);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getSessionId(zzcv zzcv0) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        zziq0.zzl().zzb(new zzjq(zziq0, zzcv0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getTestFlag(zzcv zzcv0, int v) {
        this.zza();
        switch(v) {
            case 0: {
                this.zza.zzt().zza(zzcv0, this.zza.zzp().zzai());
                return;
            }
            case 1: {
                this.zza.zzt().zza(zzcv0, ((long)this.zza.zzp().zzad()));
                return;
            }
            case 2: {
                zznd zznd0 = this.zza.zzt();
                double f = (double)this.zza.zzp().zzab();
                Bundle bundle0 = new Bundle();
                bundle0.putDouble("r", f);
                try {
                    zzcv0.zza(bundle0);
                }
                catch(RemoteException remoteException0) {
                    zznd0.zzu.zzj().zzu().zza("Error returning double value to wrapper", remoteException0);
                }
                return;
            }
            case 3: {
                this.zza.zzt().zza(zzcv0, ((int)this.zza.zzp().zzac()));
                return;
            }
            case 4: {
                this.zza.zzt().zza(zzcv0, this.zza.zzp().zzaa().booleanValue());
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void getUserProperties(String s, String s1, boolean z, zzcv zzcv0) {
        this.zza();
        this.zza.zzl().zzb(new zzj(this, zzcv0, s, s1, z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void initForTests(Map map0) {
        this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void initialize(IObjectWrapper iObjectWrapper0, zzdd zzdd0, long v) {
        zzhf zzhf0 = this.zza;
        if(zzhf0 == null) {
            this.zza = zzhf.zza(((Context)Preconditions.checkNotNull(((Context)ObjectWrapper.unwrap(iObjectWrapper0)))), zzdd0, v);
            return;
        }
        zzhf0.zzj().zzu().zza("Attempting to initialize multiple times");
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void isDataCollectionEnabled(zzcv zzcv0) {
        this.zza();
        this.zza.zzl().zzb(new zzn(this, zzcv0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void logEvent(String s, String s1, Bundle bundle0, boolean z, boolean z1, long v) {
        this.zza();
        this.zza.zzp().zza(s, s1, bundle0, z, z1, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void logEventAndBundle(String s, String s1, Bundle bundle0, zzcv zzcv0, long v) {
        this.zza();
        Preconditions.checkNotEmpty(s1);
        (bundle0 == null ? new Bundle() : new Bundle(bundle0)).putString("_o", "app");
        zzbg zzbg0 = new zzbg(s1, new zzbb(bundle0), "app", v);
        this.zza.zzl().zzb(new zzk(this, zzcv0, zzbg0, s));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void logHealthData(int v, String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) {
        this.zza();
        Object object0 = null;
        Object object1 = iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
        Object object2 = iObjectWrapper1 == null ? null : ObjectWrapper.unwrap(iObjectWrapper1);
        if(iObjectWrapper2 != null) {
            object0 = ObjectWrapper.unwrap(iObjectWrapper2);
        }
        this.zza.zzj().zza(v, true, false, s, object1, object2, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivityCreated(IObjectWrapper iObjectWrapper0, Bundle bundle0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivityCreated(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivityDestroyed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivityPaused(IObjectWrapper iObjectWrapper0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivityPaused(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivityResumed(IObjectWrapper iObjectWrapper0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivityResumed(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper0, zzcv zzcv0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        Bundle bundle0 = new Bundle();
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivitySaveInstanceState(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), bundle0);
        }
        try {
            zzcv0.zza(bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zza.zzj().zzu().zza("Error returning bundle value to wrapper", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStarted(IObjectWrapper iObjectWrapper0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivityStarted(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void onActivityStopped(IObjectWrapper iObjectWrapper0, long v) {
        this.zza();
        zzjx zzjx0 = this.zza.zzp().zza;
        if(zzjx0 != null) {
            this.zza.zzp().zzak();
            zzjx0.onActivityStopped(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void performAction(Bundle bundle0, zzcv zzcv0, long v) {
        this.zza();
        zzcv0.zza(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void registerOnMeasurementEventListener(zzda zzda0) {
        zzil zzil0;
        this.zza();
        synchronized(this.zzb) {
            Integer integer0 = zzda0.zza();
            zzil0 = (zzil)this.zzb.get(integer0);
            if(zzil0 == null) {
                zzil0 = new zzb(this, zzda0);
                Integer integer1 = zzda0.zza();
                this.zzb.put(integer1, zzil0);
            }
        }
        this.zza.zzp().zza(zzil0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void resetAnalyticsData(long v) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        zziq0.zza(null);
        zziq0.zzl().zzb(new zzjk(zziq0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setConditionalUserProperty(Bundle bundle0, long v) {
        this.zza();
        if(bundle0 == null) {
            this.zza.zzj().zzg().zza("Conditional user property must not be null");
            return;
        }
        this.zza.zzp().zza(bundle0, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setConsent(Bundle bundle0, long v) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        zziq0.zzl().zzc(new zziw(zziq0, bundle0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setConsentThirdParty(Bundle bundle0, long v) {
        this.zza();
        this.zza.zzp().zza(bundle0, -20, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setCurrentScreen(IObjectWrapper iObjectWrapper0, String s, String s1, long v) {
        this.zza();
        this.zza.zzq().zza(((Activity)ObjectWrapper.unwrap(iObjectWrapper0)), s, s1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setDataCollectionEnabled(boolean z) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        zziq0.zzu();
        zziq0.zzl().zzb(new zzjb(zziq0, z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setDefaultEventParameters(Bundle bundle0) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        Bundle bundle1 = bundle0 == null ? null : new Bundle(bundle0);
        zziq0.zzl().zzb(new zzit(zziq0, bundle1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setEventInterceptor(zzda zzda0) {
        this.zza();
        zza appMeasurementDynamiteService$zza0 = new zza(this, zzda0);
        if(this.zza.zzl().zzg()) {
            this.zza.zzp().zza(appMeasurementDynamiteService$zza0);
            return;
        }
        this.zza.zzl().zzb(new zzm(this, appMeasurementDynamiteService$zza0));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setInstanceIdProvider(zzdb zzdb0) {
        this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setMeasurementEnabled(boolean z, long v) {
        this.zza();
        this.zza.zzp().zza(Boolean.valueOf(z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setMinimumSessionDuration(long v) {
        this.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setSessionTimeoutDuration(long v) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        zziq0.zzl().zzb(new zzjd(zziq0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setUserId(String s, long v) {
        this.zza();
        zziq zziq0 = this.zza.zzp();
        if(s != null && TextUtils.isEmpty(s)) {
            zziq0.zzu.zzj().zzu().zza("User ID must be non-empty or null");
            return;
        }
        zziq0.zzl().zzb(new zziy(zziq0, s));
        zziq0.zza(null, "_id", s, true, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void setUserProperty(String s, String s1, IObjectWrapper iObjectWrapper0, boolean z, long v) {
        this.zza();
        Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
        this.zza.zzp().zza(s, s1, object0, z, v);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcu
    public void unregisterOnMeasurementEventListener(zzda zzda0) {
        zzil zzil0;
        this.zza();
        synchronized(this.zzb) {
            Integer integer0 = zzda0.zza();
            zzil0 = (zzil)this.zzb.remove(integer0);
        }
        if(zzil0 == null) {
            zzil0 = new zzb(this, zzda0);
        }
        this.zza.zzp().zzb(zzil0);
    }

    private final void zza() {
        if(this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zza(zzcv zzcv0, String s) {
        this.zza();
        this.zza.zzt().zza(zzcv0, s);
    }
}

