package d;

import android.content.Context;
import android.content.Intent;
import z3.k;

public final class c extends a {
    @Override  // d.a
    public Intent a(Context context0, Object object0) {
        return this.d(context0, ((String)object0));
    }

    @Override  // d.a
    public d.a.a b(Context context0, Object object0) {
        return this.e(context0, ((String)object0));
    }

    @Override  // d.a
    public Object c(int v, Intent intent0) {
        return this.f(v, intent0);
    }

    public Intent d(Context context0, String s) {
        k.e(context0, "context");
        k.e(s, "input");
        return b.a.a(new String[]{s});
    }

    public d.a.a e(Context context0, String s) {
        k.e(context0, "context");
        k.e(s, "input");
        return androidx.core.content.a.checkSelfPermission(context0, s) == 0 ? new d.a.a(Boolean.TRUE) : null;
    }

    public Boolean f(int v, Intent intent0) {
        if(intent0 != null && v == -1) {
            int[] arr_v = intent0.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if(arr_v != null) {
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    if(arr_v[v1] == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
}

