package com.google.android.gms.internal.ads;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;

public final class zzdje implements GestureDetector.OnGestureListener {
    private final zzdhx zza;
    private final zzdiy zzb;

    zzdje(zzdhx zzdhx0, zzdiy zzdiy0) {
        this.zza = zzdhx0;
        this.zzb = zzdiy0;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        int v2;
        int v = -1;
        synchronized(this) {
            if(this.zza == null) {
                return false;
            }
            if(Float.compare(Math.abs(f), Math.abs(f1)) <= 0) {
                if(f1 > 0.0f) {
                    v2 = (int)((motionEvent1.getY() - motionEvent0.getY()) / f1 * 1000.0f);
                    v = 8;
                }
                else if(f1 < 0.0f) {
                    v2 = (int)((motionEvent1.getY() - motionEvent0.getY()) / f1 * 1000.0f);
                    v = 4;
                }
                else {
                    v2 = 0;
                }
            }
            else if(f > 0.0f) {
                v2 = (int)((motionEvent1.getX() - motionEvent0.getX()) / f * 1000.0f);
                v = 1;
            }
            else if(f < 0.0f) {
                v2 = (int)((motionEvent1.getX() - motionEvent0.getX()) / f * 1000.0f);
                v = 2;
            }
            else {
                v2 = 0;
            }
            if(v != this.zza.zza()) {
                return false;
            }
            this.zza.zzC(this.zzb.zzr(), v2);
            return false;
        }
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        return false;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onShowPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent0) {
        synchronized(this) {
        }
        return false;
    }
}

