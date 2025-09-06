package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import z3.k;

public final class c {
    private final List a;

    public c(List list0) {
        k.e(list0, "topics");
        super();
        this.a = list0;
    }

    public final List a() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return this.a.size() == ((c)object0).a.size() ? k.a(new HashSet(this.a), new HashSet(((c)object0).a)) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    @Override
    public String toString() {
        return "Topics=" + this.a;
    }
}

