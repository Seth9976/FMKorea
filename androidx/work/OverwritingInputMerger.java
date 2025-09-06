package androidx.work;

import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends h {
    @Override  // androidx.work.h
    public d b(List list0) {
        a d$a0 = new a();
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.putAll(((d)object0).j());
        }
        d$a0.d(hashMap0);
        return d$a0.a();
    }
}

