package g3;

import com.onesignal.Q0;
import h3.b;
import h3.c;
import java.util.List;
import java.util.Set;
import z3.k;

public abstract class d implements c {
    private final Q0 a;
    private final a b;
    private final j c;

    public d(Q0 q00, a a0, j j0) {
        k.e(q00, "logger");
        k.e(a0, "outcomeEventsCache");
        k.e(j0, "outcomeEventsService");
        super();
        this.a = q00;
        this.b = a0;
        this.c = j0;
    }

    @Override  // h3.c
    public List a(String s, List list0) {
        k.e(s, "name");
        k.e(list0, "influences");
        List list1 = this.b.g(s, list0);
        this.a.d("OneSignal getNotCachedUniqueOutcome influences: " + list1);
        return list1;
    }

    @Override  // h3.c
    public List b() {
        return this.b.e();
    }

    @Override  // h3.c
    public void c(Set set0) {
        k.e(set0, "unattributedUniqueOutcomeEvents");
        this.a.d("OneSignal save unattributedUniqueOutcomeEvents: " + set0);
        this.b.l(set0);
    }

    @Override  // h3.c
    public void d(b b0) {
        k.e(b0, "outcomeEvent");
        this.b.d(b0);
    }

    @Override  // h3.c
    public void e(String s, String s1) {
        k.e(s, "notificationTableName");
        k.e(s1, "notificationIdColumnName");
        this.b.c(s, s1);
    }

    @Override  // h3.c
    public void f(b b0) {
        k.e(b0, "eventParams");
        this.b.m(b0);
    }

    @Override  // h3.c
    public void g(b b0) {
        k.e(b0, "event");
        this.b.k(b0);
    }

    @Override  // h3.c
    public Set i() {
        Set set0 = this.b.i();
        this.a.d("OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: " + set0);
        return set0;
    }

    protected final Q0 j() {
        return this.a;
    }

    public final j k() {
        return this.c;
    }
}

