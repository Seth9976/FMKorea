package androidx.preference;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.content.res.k;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context0) {
        this(context0, null);
    }

    public PreferenceCategory(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, k.a(context0, m.e, 0x101008C));
    }

    public PreferenceCategory(Context context0, AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, 0);
    }

    public PreferenceCategory(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    @Override  // androidx.preference.Preference
    public boolean C0() {
        return !super.J();
    }

    @Override  // androidx.preference.Preference
    public boolean J() {
        return false;
    }

    @Override  // androidx.preference.Preference
    public void T(l l0) {
        super.T(l0);
        if(Build.VERSION.SDK_INT >= 28) {
            l0.a.setAccessibilityHeading(true);
        }
    }
}

