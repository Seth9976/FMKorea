package G1;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public final class b implements CompoundButton.OnCheckedChangeListener {
    public final Chip a;

    public b(Chip chip0) {
        this.a = chip0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        Chip.b(this.a, compoundButton0, z);
    }
}

