package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import java.util.Locale;

@TargetApi(28)
public class zzx extends zzv {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzk(AudioManager audioManager0) {
        return audioManager0.getStreamMinVolume(3);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final void zzl(Activity activity0) {
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzbd)).booleanValue() && zzt.zzo().zzh().zzm() == null && !activity0.isInMultiWindowMode()) {
            zzx.zzp(true, activity0);
            activity0.getWindow().getDecorView().setOnApplyWindowInsetsListener((View view0, WindowInsets windowInsets0) -> {
                if(zzt.zzo().zzh().zzm() == null) {
                    DisplayCutout displayCutout0 = windowInsets0.getDisplayCutout();
                    String s = "";
                    if(displayCutout0 == null) {
                        zzt.zzo().zzh().zzC("");
                    }
                    else {
                        zzg zzg0 = zzt.zzo().zzh();
                        for(Object object0: displayCutout0.getBoundingRects()) {
                            String s1 = String.format(Locale.US, "%d,%d,%d,%d", ((Rect)object0).left, ((Rect)object0).top, ((Rect)object0).right, ((Rect)object0).bottom);
                            if(!TextUtils.isEmpty(s)) {
                                s = s + "|";
                            }
                            s = s + s1;
                        }
                        zzg0.zzC(s);
                    }
                }
                zzx.zzp(false, activity0);
                return view0.onApplyWindowInsets(windowInsets0);
            });
        }
    }

    // 检测为 Lambda 实现
    static final WindowInsets zzm(Activity activity0, View view0, WindowInsets windowInsets0) [...]

    private static final void zzp(boolean z, Activity activity0) {
        Window window0 = activity0.getWindow();
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        if((z ? 1 : 2) != windowManager$LayoutParams0.layoutInDisplayCutoutMode) {
            windowManager$LayoutParams0.layoutInDisplayCutoutMode = z ? 1 : 2;
            window0.setAttributes(windowManager$LayoutParams0);
        }
    }
}

