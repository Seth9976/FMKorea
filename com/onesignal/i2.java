package com.onesignal;

import java.io.File;

abstract class i2 {
    static boolean a() {
        int v = 0;
        while(v < 8) {
            try {
                if(new File(new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"}[v] + "su").exists()) {
                    return true;
                }
                ++v;
                continue;
            }
            catch(Throwable unused_ex) {
            }
            break;
        }
        return false;
    }
}

