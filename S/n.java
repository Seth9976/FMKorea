package S;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import z3.k;

public final class n extends m {
    private final ViewGroup g;

    public n(Fragment fragment0, ViewGroup viewGroup0) {
        k.e(fragment0, "fragment");
        k.e(viewGroup0, "container");
        super(fragment0, "Attempting to add fragment " + fragment0 + " to container " + viewGroup0 + " which is not a FragmentContainerView");
        this.g = viewGroup0;
    }
}

