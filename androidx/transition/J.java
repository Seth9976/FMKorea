package androidx.transition;

import android.view.ViewGroup;
import androidx.appcompat.app.E;

public abstract class j {
    public static j a(ViewGroup viewGroup0) {
        E.a(viewGroup0.getTag(h.c));
        return null;
    }

    static void b(ViewGroup viewGroup0, j j0) {
        viewGroup0.setTag(h.c, j0);
    }
}

