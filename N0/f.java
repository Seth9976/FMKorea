package N0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class f implements SensorEventListener {
    public interface a {
        void a();
    }

    private a a;

    public void a(a f$a0) {
        if(b1.a.d(this)) {
            return;
        }
        this.a = f$a0;
    }

    @Override  // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor0, int v) {
        b1.a.d(this);
    }

    @Override  // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent0) {
        if(b1.a.d(this)) {
            return;
        }
        try {
            if(this.a != null) {
                float[] arr_f = sensorEvent0.values;
                double f = (double)(arr_f[0] / 9.80665f);
                double f1 = (double)(arr_f[1] / 9.80665f);
                double f2 = (double)(arr_f[2] / 9.80665f);
                if(Math.sqrt(f * f + f1 * f1 + f2 * f2) > 2.3) {
                    this.a.a();
                }
            }
        }
        catch(Throwable throwable0) {
            b1.a.b(throwable0, this);
        }
    }
}

