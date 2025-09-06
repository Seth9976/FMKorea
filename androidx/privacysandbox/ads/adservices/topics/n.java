package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import z3.k;

public final class n extends v {
    public n(Context context0) {
        k.e(context0, "context");
        Object object0 = context0.getSystemService(TopicsManager.class);
        k.d(object0, "context.getSystemService…opicsManager::class.java)");
        super(((TopicsManager)object0));
    }

    @Override  // androidx.privacysandbox.ads.adservices.topics.v
    public GetTopicsRequest c(b b0) {
        k.e(b0, "request");
        GetTopicsRequest getTopicsRequest0 = j.a().setAdsSdkName(b0.a()).setShouldRecordObservation(b0.b()).build();
        k.d(getTopicsRequest0, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequest0;
    }
}

