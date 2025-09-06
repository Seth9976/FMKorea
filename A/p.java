package A;

import android.window.SplashScreen.OnExitAnimationListener;
import android.window.SplashScreenView;

public final class p implements SplashScreen.OnExitAnimationListener {
    public final c a;
    public final e b;

    public p(c g$c0, e g$e0) {
        this.a = g$c0;
        this.b = g$e0;
    }

    @Override  // android.window.SplashScreen$OnExitAnimationListener
    public final void onSplashScreenExit(SplashScreenView splashScreenView0) {
        c.t(this.a, this.b, splashScreenView0);
    }
}

