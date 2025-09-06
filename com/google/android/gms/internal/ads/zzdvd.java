package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzdvd implements SensorEventListener {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdvc zzf;
    private boolean zzg;

    zzdvd(Context context0) {
        this.zza = context0;
    }

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zziD)).booleanValue()) {
            float[] arr_f = sensorEvent0.values;
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2] / 9.80665f;
            if(((float)Math.sqrt(f / 9.80665f * (f / 9.80665f) + f1 / 9.80665f * (f1 / 9.80665f) + f2 * f2)) < ((float)(((Float)zzba.zzc().zzb(zzbbr.zziE))))) {
                return;
            }
            long v = zzt.zzB().currentTimeMillis();
            if(this.zzd + ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zziF)))))) > v) {
                return;
            }
            if(this.zzd + ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zziG)))))) < v) {
                this.zze = 0;
            }
            zze.zza("Shake detected.");
            this.zzd = v;
            int v1 = this.zze + 1;
            this.zze = v1;
            zzdvc zzdvc0 = this.zzf;
            if(zzdvc0 != null && v1 == ((int)(((Integer)zzba.zzc().zzb(zzbbr.zziH))))) {
                ((zzdue)zzdvc0).zzh(new zzdub(((zzdue)zzdvc0)), zzdud.zzc);
            }
        }
    }

    public final void zza() {
        synchronized(this) {
            if(this.zzg) {
                SensorManager sensorManager0 = this.zzb;
                if(sensorManager0 != null) {
                    sensorManager0.unregisterListener(this, this.zzc);
                    zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zziD)).booleanValue()) {
                return;
            }
            if(this.zzb == null) {
                SensorManager sensorManager0 = (SensorManager)this.zza.getSystemService("sensor");
                this.zzb = sensorManager0;
                if(sensorManager0 == null) {
                    zzcaa.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                    return;
                }
                this.zzc = sensorManager0.getDefaultSensor(1);
            }
            if(!this.zzg) {
                SensorManager sensorManager1 = this.zzb;
                if(sensorManager1 != null) {
                    Sensor sensor0 = this.zzc;
                    if(sensor0 != null) {
                        sensorManager1.registerListener(this, sensor0, 2);
                        this.zzd = zzt.zzB().currentTimeMillis() - ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zziF))))));
                        this.zzg = true;
                        zze.zza("Listening for shake gestures.");
                    }
                }
            }
        }
    }

    public final void zzc(zzdvc zzdvc0) {
        this.zzf = zzdvc0;
    }
}

