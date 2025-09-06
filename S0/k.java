package s0;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

public class k {
    private final WebSettingsBoundaryInterface a;

    public k(WebSettingsBoundaryInterface webSettingsBoundaryInterface0) {
        this.a = webSettingsBoundaryInterface0;
    }

    public void a(int v) {
        this.a.setForceDark(v);
    }

    public void b(int v) {
        this.a.setForceDarkBehavior(v);
    }
}

