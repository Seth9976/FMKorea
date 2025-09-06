package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

final class b {
    public static final b a;

    static {
        b.a = new b();
    }

    public static final void a(Bundle bundle0, String s, Size size0) {
        bundle0.putSize(s, size0);
    }

    public static final void b(Bundle bundle0, String s, SizeF sizeF0) {
        bundle0.putSizeF(s, sizeF0);
    }
}

