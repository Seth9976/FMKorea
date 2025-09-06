package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

final class zzccg implements SensorEventListener {
    private final SensorManager zza;
    private final Object zzb;
    private final Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private Handler zzg;
    private zzccf zzh;

    zzccg(Context context0) {
        this.zza = (SensorManager)context0.getSystemService("sensor");
        this.zzc = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new Object();
    }

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        float[] arr_f = sensorEvent0.values;
        if(Float.compare(arr_f[0], 0.0f) != 0 || arr_f[1] != 0.0f || arr_f[2] != 0.0f) {
            synchronized(this.zzb) {
                if(this.zzf == null) {
                    this.zzf = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzd, arr_f);
            int v = this.zzc.getRotation();
            if(v == 1) {
                SensorManager.remapCoordinateSystem(this.zzd, 2, 0x81, this.zze);
            }
            else {
                switch(v) {
                    case 2: {
                        SensorManager.remapCoordinateSystem(this.zzd, 0x81, 130, this.zze);
                        break;
                    }
                    case 3: {
                        SensorManager.remapCoordinateSystem(this.zzd, 130, 1, this.zze);
                        break;
                    }
                    default: {
                        System.arraycopy(this.zzd, 0, this.zze, 0, 9);
                    }
                }
            }
            float f = this.zze[1];
            this.zze[1] = this.zze[3];
            this.zze[3] = f;
            float f1 = this.zze[2];
            this.zze[2] = this.zze[6];
            this.zze[6] = f1;
            float f2 = this.zze[5];
            this.zze[5] = this.zze[7];
            this.zze[7] = f2;
            synchronized(this.zzb) {
                System.arraycopy(this.zze, 0, this.zzf, 0, 9);
            }
            zzccf zzccf0 = this.zzh;
            if(zzccf0 != null) {
                zzccf0.zza();
            }
        }
    }

    final void zza(zzccf zzccf0) {
        this.zzh = zzccf0;
    }

    final void zzb() {
        if(this.zzg != null) {
            return;
        }
        Sensor sensor0 = this.zza.getDefaultSensor(11);
        if(sensor0 == null) {
            zzcaa.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread0 = new HandlerThread("OrientationMonitor");
        handlerThread0.start();
        zzfoe zzfoe0 = new zzfoe(handlerThread0.getLooper());
        this.zzg = zzfoe0;
        if(!this.zza.registerListener(this, sensor0, 0, zzfoe0)) {
            zzcaa.zzg("SensorManager.registerListener failed.");
            this.zzc();
        }
    }

    final void zzc() {
        if(this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new zzcce(this));
        this.zzg = null;
    }

    final boolean zzd(float[] arr_f) {
        synchronized(this.zzb) {
            float[] arr_f1 = this.zzf;
            if(arr_f1 == null) {
                return false;
            }
            System.arraycopy(arr_f1, 0, arr_f, 0, 9);
            return true;
        }
    }
}

