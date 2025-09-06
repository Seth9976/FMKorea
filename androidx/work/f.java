package androidx.work;

import android.app.Notification;

public final class f {
    private final int a;
    private final int b;
    private final Notification c;

    public f(int v, Notification notification0, int v1) {
        this.a = v;
        this.c = notification0;
        this.b = v1;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(f.class != class0 || this.a != ((f)object0).a) {
                return false;
            }
            return this.b == ((f)object0).b ? this.c.equals(((f)object0).c) : false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + this.b) * 0x1F + this.c.hashCode();
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}

