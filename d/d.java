package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import z3.g;
import z3.k;

public final class d extends a {
    public static final class d.d.a {
        private d.d.a() {
        }

        public d.d.a(g g0) {
        }
    }

    public static final d.d.a a;

    static {
        d.a = new d.d.a(null);
    }

    @Override  // d.a
    public Intent a(Context context0, Object object0) {
        return this.d(context0, ((Intent)object0));
    }

    @Override  // d.a
    public Object c(int v, Intent intent0) {
        return this.e(v, intent0);
    }

    public Intent d(Context context0, Intent intent0) {
        k.e(context0, "context");
        k.e(intent0, "input");
        return intent0;
    }

    public ActivityResult e(int v, Intent intent0) {
        return new ActivityResult(v, intent0);
    }
}

