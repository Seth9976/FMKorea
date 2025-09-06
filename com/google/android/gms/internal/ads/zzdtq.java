package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzdtq implements SensorEventListener {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzdtp zzi;
    private boolean zzj;

    zzdtq(Context context0) {
        this.zzc = 0.0f;
        this.zzd = 0.0f;
        this.zze = zzt.zzB().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager0 = (SensorManager)context0.getSystemService("sensor");
        this.zza = sensorManager0;
        if(sensorManager0 != null) {
            this.zzb = sensorManager0.getDefaultSensor(4);
            return;
        }
        this.zzb = null;
    }

    @Override  // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor0, int v) {
    }

    @Override  // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent0) {
        if(!((Boolean)zzba.zzc().zzb(zzbbr.zziI)).booleanValue()) {
            return;
        }
        long v = zzt.zzB().currentTimeMillis();
        if(Long.compare(this.zze + ((long)(((int)(((Integer)zzba.zzc().zzb(zzbbr.zziK)))))), v) < 0) {
            this.zzf = 0;
            this.zze = v;
            this.zzg = false;
            this.zzh = false;
            this.zzc = (float)this.zzd;
        }
        Float float0 = (float)(((float)this.zzd) + sensorEvent0.values[1] * 4.0f);
        this.zzd = float0;
        zzbbj zzbbj0 = zzbbr.zziJ;
        if(((float)float0) > this.zzc + ((float)(((Float)zzba.zzc().zzb(zzbbj0))))) {
            this.zzc = (float)this.zzd;
            this.zzh = true;
        }
        else if(((float)this.zzd) < this.zzc - ((float)(((Float)zzba.zzc().zzb(zzbbj0))))) {
            this.zzc = (float)this.zzd;
            this.zzg = true;
        }
        if(this.zzd.isInfinite()) {
            this.zzd = 0.0f;
            this.zzc = 0.0f;
        }
        if(this.zzg && this.zzh) {
            zze.zza("Flick detected.");
            this.zze = v;
            int v1 = this.zzf + 1;
            this.zzf = v1;
            this.zzg = false;
            this.zzh = false;
            zzdtp zzdtp0 = this.zzi;
            if(zzdtp0 != null && v1 == ((int)(((Integer)zzba.zzc().zzb(zzbbr.zziL))))) {
                ((zzdue)zzdtp0).zzh(new zzduc(((zzdue)zzdtp0)), zzdud.zzc);
            }
        }
    }

    public final void zza() {
        synchronized(this) {
            if(this.zzj) {
                SensorManager sensorManager0 = this.zza;
                if(sensorManager0 != null) {
                    Sensor sensor0 = this.zzb;
                    if(sensor0 != null) {
                        sensorManager0.unregisterListener(this, sensor0);
                        this.zzj = false;
                        zze.zza("Stopped listening for flick gestures.");
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!((Boolean)zzba.zzc().zzb(zzbbr.zziI)).booleanValue()) {
                return;
            }
            if(!this.zzj) {
                SensorManager sensorManager0 = this.zza;
                if(sensorManager0 != null) {
                    Sensor sensor0 = this.zzb;
                    if(sensor0 != null) {
                        sensorManager0.registerListener(this, sensor0, 2);
                        this.zzj = true;
                        zze.zza("Listening for flick gestures.");
                    }
                }
            }
        }
        if(this.zza != null && this.zzb != null) {
            return;
        }
        zzcaa.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
    }

    public final void zzc(zzdtp zzdtp0) {
        this.zzi = zzdtp0;
    }
}

