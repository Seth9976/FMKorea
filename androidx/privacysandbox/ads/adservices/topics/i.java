package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.TopicsManager;
import android.content.Context;
import z3.k;

public final class i extends v {
    public i(Context context0) {
        k.e(context0, "context");
        Object object0 = context0.getSystemService(TopicsManager.class);
        k.d(object0, "context.getSystemService…opicsManager::class.java)");
        super(((TopicsManager)object0));
    }
}

