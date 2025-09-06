package e1;

import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import z3.k;

public final class d {
    public static final d a;

    static {
        d.a = new d();
    }

    private final String a(int v) {
        return "#" + Integer.toHexString(v);
    }

    public static final String b(Resources resources0, int v) {
        String s1;
        String s;
        if(resources0 == null) {
            return d.a.a(v);
        }
        if((v >>> 24 & 0xFF) == 0x7F) {
            s = "";
            s1 = "";
        }
        else {
            s = resources0.getResourcePackageName(v);
            k.d(s, "r.getResourcePackageName(resourceId)");
            s1 = ":";
        }
        String s2 = "@" + s + s1 + resources0.getResourceTypeName(v) + "/" + resources0.getResourceEntryName(v);
        k.d(s2, "sb.toString()");
        return s2;
    }

    public static final String c(Resources resources0, int v) {
        try {
            return d.b(resources0, v);
        }
        catch(Resources.NotFoundException unused_ex) {
            return d.a.a(v);
        }
    }

    private final int d(int v) [...] // Inlined contents
}

