package S1;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {
    private final float a;

    public a(float f) {
        this.a = f;
    }

    @Override  // S1.c
    public float a(RectF rectF0) {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? this.a == ((a)object0).a : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}

