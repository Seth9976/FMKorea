package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.res.k;

public final class PreferenceScreen extends PreferenceGroup {
    private boolean d0;

    public PreferenceScreen(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, k.a(context0, m.g, 0x101008B));
        this.d0 = true;
    }

    @Override  // androidx.preference.PreferenceGroup
    protected boolean N0() {
        return false;
    }

    public boolean S0() {
        return this.d0;
    }

    @Override  // androidx.preference.Preference
    protected void U() {
        if(this.r() == null && this.p() == null && this.M0() != 0) {
            b j$b0 = this.B().h();
            if(j$b0 != null) {
                j$b0.c(this);
            }
        }
    }
}

