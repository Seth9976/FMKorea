package S1;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {
    private final float a;

    public i(float f) {
        this.a = f;
    }

    @Override  // S1.c
    public float a(RectF rectF0) {
        float f = i.b(rectF0);
        return this.a * f;
    }

    private static float b(RectF rectF0) {
        return Math.min(rectF0.width(), rectF0.height());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i ? this.a == ((i)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

