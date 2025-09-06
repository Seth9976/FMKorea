package C;

import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;

public abstract class c {
    public interface a {
        void onTouchExplorationStateChanged(boolean arg1);
    }

    static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {
        final a a;

        b(a c$a0) {
            this.a = c$a0;
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.a.onTouchExplorationStateChanged(z);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager0, a c$a0) {
        return accessibilityManager0.addTouchExplorationStateChangeListener(new b(c$a0));
    }

    public static boolean b(AccessibilityManager accessibilityManager0, a c$a0) {
        return accessibilityManager0.removeTouchExplorationStateChangeListener(new b(c$a0));
    }
}

