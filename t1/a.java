package T1;

import C.C;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a implements C {
    public final SideSheetBehavior a;
    public final int b;

    public a(SideSheetBehavior sideSheetBehavior0, int v) {
        this.a = sideSheetBehavior0;
        this.b = v;
    }

    @Override  // C.C
    public final boolean a(View view0, C.C.a c$a0) {
        return SideSheetBehavior.I(this.a, this.b, view0, c$a0);
    }
}

