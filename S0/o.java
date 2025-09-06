package s0;

import T3.a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class o implements n {
    final WebViewProviderFactoryBoundaryInterface a;

    public o(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface0) {
        this.a = webViewProviderFactoryBoundaryInterface0;
    }

    @Override  // s0.n
    public String[] a() {
        return this.a.getSupportedFeatures();
    }

    @Override  // s0.n
    public StaticsBoundaryInterface getStatics() {
        InvocationHandler invocationHandler0 = this.a.getStatics();
        return (StaticsBoundaryInterface)a.a(StaticsBoundaryInterface.class, invocationHandler0);
    }

    @Override  // s0.n
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        InvocationHandler invocationHandler0 = this.a.getWebkitToCompatConverter();
        return (WebkitToCompatConverterBoundaryInterface)a.a(WebkitToCompatConverterBoundaryInterface.class, invocationHandler0);
    }
}

