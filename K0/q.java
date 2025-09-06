package K0;

import androidx.privacysandbox.ads.adservices.topics.d;
import org.json.JSONObject;
import z3.g;
import z3.k;

public final class q {
    private final long a;
    private final long b;
    private final long c;
    private boolean d;
    private boolean e;
    private long f;
    private boolean g;

    public q(long v, long v1, long v2, boolean z, boolean z1, long v3, boolean z2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = z1;
        this.f = v3;
        this.g = z2;
    }

    public q(long v, long v1, long v2, boolean z, boolean z1, long v3, boolean z2, int v4, g g0) {
        this(((v4 & 1) == 0 ? v : -1L), ((v4 & 2) == 0 ? v1 : -1L), ((v4 & 4) == 0 ? v2 : -1L), ((v4 & 8) == 0 ? z : false), ((v4 & 16) == 0 ? z1 : false), ((v4 & 0x20) == 0 ? v3 : 0L), ((v4 & 0x40) == 0 ? z2 : false));
    }

    public q(JSONObject jSONObject0) {
        k.e(jSONObject0, "params");
        this(jSONObject0.optLong("delayedTimeInMs", -1L), jSONObject0.optLong("jsBridgeIntervalTimeInMs", -1L), jSONObject0.optLong("autoCloseTimeInMs", -1L), false, false, 0L, false, 120, null);
    }

    public final boolean a() {
        return this.e;
    }

    public final long b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final long e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(this.a != ((q)object0).a) {
            return false;
        }
        if(this.b != ((q)object0).b) {
            return false;
        }
        if(this.c != ((q)object0).c) {
            return false;
        }
        if(this.d != ((q)object0).d) {
            return false;
        }
        if(this.e != ((q)object0).e) {
            return false;
        }
        return this.f == ((q)object0).f ? this.g == ((q)object0).g : false;
    }

    public final long f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final void h(boolean z) {
        this.e = z;
    }

    @Override
    public int hashCode() {
        int v = d.a(this.a);
        int v1 = d.a(this.b);
        int v2 = d.a(this.c);
        int v3 = this.d;
        int v4 = 1;
        if(v3) {
            v3 = 1;
        }
        int v5 = this.e;
        if(v5) {
            v5 = 1;
        }
        int v6 = d.a(this.f);
        if(!this.g) {
            v4 = false;
        }
        return (v6 + (((v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + v3) * 0x1F + v5) * 0x1F) * 0x1F + v4;
    }

    public final void i(boolean z) {
        this.d = z;
    }

    public final void j(long v) {
        this.f = v;
    }

    public final void k(boolean z) {
        this.g = z;
    }

    @Override
    public String toString() {
        return "WidgetConfig(delayedTimeInMs=" + this.a + ", jsBridgeIntervalTimeInMs=" + this.b + ", autoCloseTimeInMs=" + this.c + ", hasCalledShowOnLaunch=" + this.d + ", alreadyShownOnLaunch=" + this.e + ", widgetLastShown=" + this.f + ", isWidgetShowing=" + this.g + ")";
    }
}

