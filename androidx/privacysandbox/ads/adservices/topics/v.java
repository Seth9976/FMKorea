package androidx.privacysandbox.ads.adservices.topics;

import I3.m;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import androidx.core.os.t;
import java.util.ArrayList;
import l3.o;
import r3.d;
import r3.h;
import z3.k;

public abstract class v extends f {
    private final TopicsManager b;

    public v(TopicsManager topicsManager0) {
        k.e(topicsManager0, "mTopicsManager");
        super();
        this.b = topicsManager0;
    }

    @Override  // androidx.privacysandbox.ads.adservices.topics.f
    public Object a(b b0, p3.f f0) {
        return v.e(this, b0, f0);
    }

    public GetTopicsRequest c(b b0) {
        k.e(b0, "request");
        GetTopicsRequest getTopicsRequest0 = j.a().setAdsSdkName(b0.a()).build();
        k.d(getTopicsRequest0, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequest0;
    }

    public final c d(GetTopicsResponse getTopicsResponse0) {
        k.e(getTopicsResponse0, "response");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: getTopicsResponse0.getTopics()) {
            Topic topic0 = (Topic)object0;
            arrayList0.add(new e(topic0.getTaxonomyVersion(), topic0.getModelVersion(), topic0.getTopicId()));
        }
        return new c(arrayList0);
    }

    static Object e(v v0, b b0, p3.f f0) {
        static final class a extends d {
            Object i;
            Object j;
            final v k;
            int l;

            a(v v0, p3.f f0) {
                this.k = v0;
                super(f0);
            }

            @Override  // r3.a
            public final Object t(Object object0) {
                this.j = object0;
                this.l |= 0x80000000;
                return v.e(this.k, null, this);
            }
        }

        a v$a0;
        if(f0 instanceof a) {
            v$a0 = (a)f0;
            int v1 = v$a0.l;
            if((v1 & 0x80000000) == 0) {
                v$a0 = new a(v0, f0);
            }
            else {
                v$a0.l = v1 ^ 0x80000000;
            }
        }
        else {
            v$a0 = new a(v0, f0);
        }
        Object object0 = v$a0.j;
        Object object1 = q3.b.c();
        switch(v$a0.l) {
            case 0: {
                o.b(object0);
                GetTopicsRequest getTopicsRequest0 = v0.c(b0);
                v$a0.i = v0;
                v$a0.l = 1;
                object0 = v0.f(getTopicsRequest0, v$a0);
                return object0 == object1 ? object1 : v0.d(((GetTopicsResponse)object0));
            }
            case 1: {
                v0 = (v)v$a0.i;
                o.b(object0);
                return v0.d(((GetTopicsResponse)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final Object f(GetTopicsRequest getTopicsRequest0, p3.f f0) {
        m m0 = new m(q3.b.b(f0), 1);
        m0.B();
        this.b.getTopics(getTopicsRequest0, new e0.m(), t.a(m0));
        Object object0 = m0.y();
        if(object0 == q3.b.c()) {
            h.c(f0);
        }
        return object0;
    }
}

