package S1;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {
    private final c a;
    private final float b;

    public b(float f, c c0) {
        while(c0 instanceof b) {
            c0 = ((b)c0).a;
            f += ((b)c0).b;
        }
        this.a = c0;
        this.b = f;
    }

    @Override  // S1.c
    public float a(RectF rectF0) {
        return Math.max(0.0f, this.a.a(rectF0) + this.b);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? this.a.equals(((b)object0).a) && this.b == ((b)object0).b : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

