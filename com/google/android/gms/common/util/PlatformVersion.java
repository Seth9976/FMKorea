package com.google.android.gms.common.util;

import android.os.Build.VERSION;
import androidx.core.os.a;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class PlatformVersion {
    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBean() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastKitKat() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastLollipop() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @KeepForSdk
    public static boolean isAtLeastM() [...] // Inlined contents

    @KeepForSdk
    public static boolean isAtLeastN() [...] // 潜在的解密器

    @KeepForSdk
    public static boolean isAtLeastO() [...] // 潜在的解密器

    @KeepForSdk
    public static boolean isAtLeastP() [...] // 潜在的解密器

    @KeepForSdk
    public static boolean isAtLeastQ() [...] // 潜在的解密器

    @KeepForSdk
    public static boolean isAtLeastR() [...] // 潜在的解密器

    @KeepForSdk
    public static boolean isAtLeastS() [...] // 潜在的解密器

    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 0x20;
    }

    @KeepForSdk
    public static boolean isAtLeastT() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    @KeepForSdk
    public static boolean isAtLeastU() {
        return a.b();
    }

    @KeepForSdk
    public static boolean isAtLeastV() {
        return PlatformVersion.isAtLeastU() ? a.c() : false;
    }
}

