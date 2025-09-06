package A1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class e {
    private long a;
    private long b;
    private TimeInterpolator c;
    private int d;
    private int e;

    public e(long v, long v1) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = v;
        this.b = v1;
    }

    public e(long v, long v1, TimeInterpolator timeInterpolator0) {
        this.d = 0;
        this.e = 1;
        this.a = v;
        this.b = v1;
        this.c = timeInterpolator0;
    }

    static e a(ValueAnimator valueAnimator0) {
        e e0 = new e(valueAnimator0.getStartDelay(), valueAnimator0.getDuration(), e.e(valueAnimator0));
        e0.d = valueAnimator0.getRepeatCount();
        e0.e = valueAnimator0.getRepeatMode();
        return e0;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public TimeInterpolator d() {
        return this.c == null ? a.b : this.c;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator0) {
        TimeInterpolator timeInterpolator0 = valueAnimator0.getInterpolator();
        if(!(timeInterpolator0 instanceof AccelerateDecelerateInterpolator) && timeInterpolator0 != null) {
            if(timeInterpolator0 instanceof AccelerateInterpolator) {
                return a.c;
            }
            return timeInterpolator0 instanceof DecelerateInterpolator ? a.d : timeInterpolator0;
        }
        return a.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(this.b() != ((e)object0).b()) {
            return false;
        }
        if(this.c() != ((e)object0).c()) {
            return false;
        }
        if(this.f() != ((e)object0).f()) {
            return false;
        }
        return this.g() == ((e)object0).g() ? this.d().getClass().equals(((e)object0).d().getClass()) : false;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return (((((int)(this.b() ^ this.b() >>> 0x20)) * 0x1F + ((int)(this.c() ^ this.c() >>> 0x20))) * 0x1F + this.d().getClass().hashCode()) * 0x1F + this.f()) * 0x1F + this.g();
    }

    @Override
    public String toString() {
        return '\n' + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.b() + " duration: " + this.c() + " interpolator: " + this.d().getClass() + " repeatCount: " + this.f() + " repeatMode: " + this.g() + "}\n";
    }
}

