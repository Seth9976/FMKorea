package q;

import android.view.View;

public abstract class a {
    public static String a(View view0) {
        try {
            return view0.getContext().getResources().getResourceEntryName(view0.getId());
        }
        catch(Exception unused_ex) {
            return "UNKNOWN";
        }
    }
}

