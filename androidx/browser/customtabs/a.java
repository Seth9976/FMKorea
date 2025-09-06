package androidx.browser.customtabs;

import android.os.Bundle;

public final class a {
    public static final class androidx.browser.customtabs.a.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        public a a() {
            return new a(this.a, this.b, this.c, this.d);
        }

        public androidx.browser.customtabs.a.a b(int v) {
            this.b = v;
            return this;
        }

        public androidx.browser.customtabs.a.a c(int v) {
            this.a = (int)(v | 0xFF000000);
            return this;
        }
    }

    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    a(Integer integer0, Integer integer1, Integer integer2, Integer integer3) {
        this.a = integer0;
        this.b = integer1;
        this.c = integer2;
        this.d = integer3;
    }

    Bundle a() {
        Bundle bundle0 = new Bundle();
        Integer integer0 = this.a;
        if(integer0 != null) {
            bundle0.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", ((int)integer0));
        }
        Integer integer1 = this.b;
        if(integer1 != null) {
            bundle0.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", ((int)integer1));
        }
        Integer integer2 = this.c;
        if(integer2 != null) {
            bundle0.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", ((int)integer2));
        }
        Integer integer3 = this.d;
        if(integer3 != null) {
            bundle0.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", ((int)integer3));
        }
        return bundle0;
    }
}

