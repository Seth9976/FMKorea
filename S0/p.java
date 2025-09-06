package s0;

import T3.a;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class p {
    private final WebkitToCompatConverterBoundaryInterface a;

    public p(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface0) {
        this.a = webkitToCompatConverterBoundaryInterface0;
    }

    public k a(WebSettings webSettings0) {
        InvocationHandler invocationHandler0 = this.a.convertSettings(webSettings0);
        return new k(((WebSettingsBoundaryInterface)a.a(WebSettingsBoundaryInterface.class, invocationHandler0)));
    }
}

