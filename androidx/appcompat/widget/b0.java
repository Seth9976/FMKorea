package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class b0 extends U {
    private final WeakReference b;

    public b0(Context context0, Resources resources0) {
        super(resources0);
        this.b = new WeakReference(context0);
    }

    @Override  // android.content.res.Resources
    public Drawable getDrawable(int v) {
        Drawable drawable0 = this.a(v);
        Context context0 = (Context)this.b.get();
        if(drawable0 != null && context0 != null) {
            T.h().x(context0, v, drawable0);
        }
        return drawable0;
    }
}

