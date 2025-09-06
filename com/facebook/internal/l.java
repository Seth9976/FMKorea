package com.facebook.internal;

import com.facebook.h;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import z3.g;
import z3.k;

public final class l {
    public interface a {
        void a(boolean arg1);
    }

    public static enum b {
        public static final class com.facebook.internal.l.b.a {
            private com.facebook.internal.l.b.a() {
            }

            public com.facebook.internal.l.b.a(g g0) {
            }

            public final b a(int v) {
                b[] arr_l$b = b.values();
                for(int v1 = 0; v1 < arr_l$b.length; ++v1) {
                    b l$b0 = arr_l$b[v1];
                    if(l$b0.f == v) {
                        return l$b0;
                    }
                }
                return b.g;
            }
        }

        Unknown(-1),
        Core(0),
        AppEvents(0x10000),
        CodelessEvents(0x10100),
        RestrictiveDataFiltering(0x10200),
        AAM(0x10300),
        PrivacyProtection(0x10400),
        SuggestedEvents(0x10401),
        IntelligentIntegrity(0x10402),
        ModelRequest(0x10403),
        EventDeactivation(0x10500),
        OnDeviceEventProcessing(0x10600),
        OnDevicePostInstallEventProcessing(0x10601),
        IapLogging(0x10700),
        IapLoggingLib2(0x10701),
        Instrument(0x20000),
        CrashReport(0x20100),
        CrashShield(0x20101),
        ThreadCheck(0x20102),
        ErrorReport(0x20200),
        Monitoring(0x30000),
        Login(0x1000000),
        ChromeCustomTabsPrefetching(0x1010000),
        IgnoreAppSwitchToLoggedOut(0x1020000),
        Share(0x2000000),
        Places(0x3000000);

        public static final com.facebook.internal.l.b.a H;
        private final int f;

        static {
            b.H = new com.facebook.internal.l.b.a(null);
        }

        private b(int v1) {
            this.f = v1;
        }

        public final b f() {
            int v = this.f;
            if((v & 0xFF) > 0) {
                return b.H.a(v & 0xFFFFFF00);
            }
            if((0xFF00 & v) > 0) {
                return b.H.a(v & 0xFFFF0000);
            }
            return (0xFF0000 & v) <= 0 ? b.H.a(0) : b.H.a(v & 0xFF000000);
        }

        public final String g() [...] // Inlined contents

        @Override
        public String toString() {
            switch(m.a[this.ordinal()]) {
                case 1: {
                    return "CoreKit";
                }
                case 2: {
                    return "AppEvents";
                }
                case 3: {
                    return "CodelessEvents";
                }
                case 4: {
                    return "RestrictiveDataFiltering";
                }
                case 5: {
                    return "Instrument";
                }
                case 6: {
                    return "CrashReport";
                }
                case 7: {
                    return "CrashShield";
                }
                case 8: {
                    return "ThreadCheck";
                }
                case 9: {
                    return "ErrorReport";
                }
                case 10: {
                    return "AAM";
                }
                case 11: {
                    return "PrivacyProtection";
                }
                case 12: {
                    return "SuggestedEvents";
                }
                case 13: {
                    return "IntelligentIntegrity";
                }
                case 14: {
                    return "ModelRequest";
                }
                case 15: {
                    return "EventDeactivation";
                }
                case 16: {
                    return "OnDeviceEventProcessing";
                }
                case 17: {
                    return "OnDevicePostInstallEventProcessing";
                }
                case 18: {
                    return "IAPLogging";
                }
                case 19: {
                    return "IAPLoggingLib2";
                }
                case 20: {
                    return "Monitoring";
                }
                case 21: {
                    return "LoginKit";
                }
                case 22: {
                    return "ChromeCustomTabsPrefetching";
                }
                case 23: {
                    return "IgnoreAppSwitchToLoggedOut";
                }
                case 24: {
                    return "ShareKit";
                }
                case 25: {
                    return "PlacesKit";
                }
                default: {
                    return "unknown";
                }
            }
        }
    }

    private static final Map a;
    public static final l b;

    static {
        l.b = new l();
        l.a = new HashMap();
    }

    public static final void a(b l$b0, a l$a0) {
        public static final class c implements com.facebook.internal.o.a {
            final a a;
            final b b;

            c(a l$a0, b l$b0) {
                this.a = l$a0;
                this.b = l$b0;
                super();
            }

            @Override  // com.facebook.internal.o$a
            public void a() {
                boolean z = l.g(this.b);
                this.a.a(z);
            }
        }

        k.e(l$b0, "feature");
        k.e(l$a0, "callback");
        o.j(new c(l$a0, l$b0));
    }

    private final boolean b(b l$b0) {
        switch(l$b0) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    public static final void c(b l$b0) {
        k.e(l$b0, "feature");
        h.e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + l$b0, "9.1.1").apply();
    }

    public static final b d(String s) {
        k.e(s, "className");
        l.b.f();
        for(Object object0: l.a.entrySet()) {
            b l$b0 = (b)((Map.Entry)object0).getKey();
            String[] arr_s = (String[])((Map.Entry)object0).getValue();
            for(int v = 0; v < arr_s.length; ++v) {
                if(G3.h.u(s, arr_s[v], false, 2, null)) {
                    return l$b0;
                }
            }
        }
        return b.g;
    }

    private final boolean e(b l$b0) {
        boolean z = this.b(l$b0);
        return o.f(("FBSDKFeature" + l$b0), h.f(), z);
    }

    private final void f() {
        synchronized(this) {
            Map map0 = l.a;
            if(!map0.isEmpty()) {
                return;
            }
            map0.put(b.l, new String[]{"com.facebook.appevents.aam."});
            map0.put(b.j, new String[]{"com.facebook.appevents.codeless."});
            map0.put(b.z, new String[]{"com.facebook.internal.instrument.errorreport."});
            map0.put(b.m, new String[]{"com.facebook.appevents.ml."});
            map0.put(b.n, new String[]{"com.facebook.appevents.suggestedevents."});
            map0.put(b.k, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map0.put(b.o, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map0.put(b.q, new String[]{"com.facebook.appevents.eventdeactivation."});
            map0.put(b.r, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map0.put(b.t, new String[]{"com.facebook.appevents.iap."});
            map0.put(b.A, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    public static final boolean g(b l$b0) {
        k.e(l$b0, "feature");
        if(b.g == l$b0) {
            return false;
        }
        if(b.h == l$b0) {
            return true;
        }
        String s = h.e().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + l$b0, null);
        if(s != null && k.a(s, "9.1.1")) {
            return false;
        }
        b l$b1 = l$b0.f();
        return l$b1 == l$b0 ? l.b.e(l$b0) : l.g(l$b1) && l.b.e(l$b0);
    }
}

