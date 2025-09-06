package A1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.g;
import java.util.ArrayList;
import java.util.List;

public class d {
    private final g a;
    private final g b;

    public d() {
        this.a = new g();
        this.b = new g();
    }

    private static void a(d d0, Animator animator0) {
        if(!(animator0 instanceof ObjectAnimator)) {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator0);
        }
        d0.e(((ObjectAnimator)animator0).getPropertyName(), ((ObjectAnimator)animator0).getValues());
        d0.f(((ObjectAnimator)animator0).getPropertyName(), e.a(((ObjectAnimator)animator0)));
    }

    public static d b(Context context0, TypedArray typedArray0, int v) {
        if(typedArray0.hasValue(v)) {
            int v1 = typedArray0.getResourceId(v, 0);
            return v1 == 0 ? null : d.c(context0, v1);
        }
        return null;
    }

    public static d c(Context context0, int v) {
        try {
            Animator animator0 = AnimatorInflater.loadAnimator(context0, v);
            if(animator0 instanceof AnimatorSet) {
                return d.d(((AnimatorSet)animator0).getChildAnimations());
            }
            if(animator0 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(animator0);
                return d.d(arrayList0);
            }
            return null;
        }
        catch(Exception exception0) {
        }
        Log.w("MotionSpec", "Can\'t load animation resource ID #0x" + Integer.toHexString(v), exception0);
        return null;
    }

    private static d d(List list0) {
        d d0 = new d();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            d.a(d0, ((Animator)list0.get(v1)));
        }
        return d0;
    }

    public void e(String s, PropertyValuesHolder[] arr_propertyValuesHolder) {
        this.b.put(s, arr_propertyValuesHolder);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d ? this.a.equals(((d)object0).a) : false;
    }

    public void f(String s, e e0) {
        this.a.put(s, e0);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return '\n' + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}

