package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class x {
    public final Map a;
    public View b;
    final ArrayList c;

    public x(View view0) {
        this.a = new HashMap();
        this.c = new ArrayList();
        this.b = view0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof x && this.b == ((x)object0).b && this.a.equals(((x)object0).a);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public String toString() {
        String s = "TransitionValues@" + Integer.toHexString(this.hashCode()) + ":\n" + "    view = " + this.b + "\n" + "    values:";
        for(Object object0: this.a.keySet()) {
            s = s + "    " + ((String)object0) + ": " + this.a.get(((String)object0)) + "\n";
        }
        return s;
    }
}

