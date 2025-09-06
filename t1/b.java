package T1;

import com.google.android.material.sidesheet.SideSheetBehavior;

public final class b implements Runnable {
    public final SideSheetBehavior f;
    public final int g;

    public b(SideSheetBehavior sideSheetBehavior0, int v) {
        this.f = sideSheetBehavior0;
        this.g = v;
    }

    @Override
    public final void run() {
        SideSheetBehavior.J(this.f, this.g);
    }
}

