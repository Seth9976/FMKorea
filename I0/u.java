package I0;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class u {
    public static class a {
        String a;
        Pattern b;

        public a(String s, Pattern pattern0) {
            this.a = s;
            this.b = pattern0;
        }
    }

    private List a;

    public u() {
        this.a = new ArrayList();
    }

    public void a(int v, a u$a0) {
        this.a.add(v, u$a0);
    }

    public void b(a u$a0) {
        this.a.add(u$a0);
    }

    public void c() {
        this.a.clear();
    }

    public String d(String s) {
        if(this.f()) {
            return "internal";
        }
        for(Object object0: this.a) {
            a u$a0 = (a)object0;
            if(u$a0.b.matcher(s).matches()) {
                return u$a0.a;
            }
            if(false) {
                break;
            }
        }
        return "internal";
    }

    public List e() {
        return this.a;
    }

    public boolean f() {
        return this.a == null || this.a.isEmpty();
    }

    public void g(List list0) {
        this.a = list0;
    }
}

