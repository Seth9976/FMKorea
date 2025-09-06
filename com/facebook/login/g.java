package com.facebook.login;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class g {
    private static final Set a;

    static {
        g.a = g.a();
    }

    private static Set a() {
        static final class a extends HashSet {
            a() {
                this.add("ads_management");
                this.add("create_event");
                this.add("rsvp_event");
            }
        }

        return Collections.unmodifiableSet(new a());
    }

    // 去混淆评级： 低(30)
    static boolean b(String s) {
        return s != null && (s.startsWith("publish") || s.startsWith("manage") || g.a.contains(s));
    }
}

