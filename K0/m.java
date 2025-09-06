package K0;

import org.json.JSONObject;
import z3.g;
import z3.k;

public final class m {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public m() {
        this(false, false, false, false, false, false, 0x3F, null);
    }

    public m(JSONObject jSONObject0) {
        k.e(jSONObject0, "params");
        this(jSONObject0.optBoolean("usesGeolocation", false), jSONObject0.optBoolean("androidDownloadToPublicStorage", false), jSONObject0.optBoolean("androidExtDirLegacyEnabled", false), jSONObject0.optBoolean("enableWebRTCBluetoothAudio", false), jSONObject0.optBoolean("enableWebRTCCamera", false), jSONObject0.optBoolean("enableWebRTCMicrophone", false));
    }

    public m(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public m(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v, g g0) {
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? z2 : false), ((v & 8) == 0 ? z3 : false), ((v & 16) == 0 ? z4 : false), ((v & 0x20) == 0 ? z5 : false));
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        if(this.a != ((m)object0).a) {
            return false;
        }
        if(this.b != ((m)object0).b) {
            return false;
        }
        if(this.c != ((m)object0).c) {
            return false;
        }
        if(this.d != ((m)object0).d) {
            return false;
        }
        return this.e == ((m)object0).e ? this.f == ((m)object0).f : false;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 1;
        if(v) {
            v = 1;
        }
        int v2 = this.b;
        if(v2) {
            v2 = 1;
        }
        int v3 = this.c;
        if(v3) {
            v3 = 1;
        }
        int v4 = this.d;
        if(v4) {
            v4 = 1;
        }
        int v5 = this.e;
        if(v5) {
            v5 = 1;
        }
        if(!this.f) {
            v1 = false;
        }
        return ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    public String toString() {
        return "PermissionsConfig(usesGeolocation=" + this.a + ", downloadToPublicStorage=" + this.b + ", extDirLegacyEnabled=" + this.c + ", enableWebRTCBluetoothAudio=" + this.d + ", enableWebRTCCamera=" + this.e + ", enableWebRTCMicrophone=" + this.f + ")";
    }
}

