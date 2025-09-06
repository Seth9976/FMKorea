package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import z3.g;
import z3.k;

public final class e extends a {
    public static final class d.e.a {
        private d.e.a() {
        }

        public d.e.a(g g0) {
        }
    }

    public static final d.e.a a;

    static {
        e.a = new d.e.a(null);
    }

    @Override  // d.a
    public Intent a(Context context0, Object object0) {
        return this.d(context0, ((IntentSenderRequest)object0));
    }

    @Override  // d.a
    public Object c(int v, Intent intent0) {
        return this.e(v, intent0);
    }

    public Intent d(Context context0, IntentSenderRequest intentSenderRequest0) {
        k.e(context0, "context");
        k.e(intentSenderRequest0, "input");
        Intent intent0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
        k.d(intent0, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return intent0;
    }

    public ActivityResult e(int v, Intent intent0) {
        return new ActivityResult(v, intent0);
    }
}

