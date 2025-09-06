package com.onesignal;

import e3.a;
import java.util.HashMap;
import java.util.List;

class y0 {
    private final HashMap a;

    public y0() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.put("com.onesignal.t$d", new d());
        hashMap0.put("com.onesignal.t$b", new b());
    }

    // 去混淆评级： 低(20)
    private c a() {
        return (c)this.a.get("com.onesignal.t$b");
    }

    c b() {
        c t$c0 = this.a();
        for(Object object0: t$c0.j()) {
            if(((a)object0).d().f()) {
                return t$c0;
            }
            if(false) {
                break;
            }
        }
        return this.d();
    }

    c c(List list0) {
        for(Object object0: list0) {
            if(((a)object0).d().f()) {
                return this.a();
            }
            if(false) {
                break;
            }
        }
        return this.d();
    }

    // 去混淆评级： 低(20)
    private c d() {
        return (c)this.a.get("com.onesignal.t$d");
    }
}

