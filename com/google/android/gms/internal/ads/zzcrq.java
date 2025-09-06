package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

public final class zzcrq extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private final Context zza;
    private View zzb;

    private zzcrq(Context context0) {
        super(context0);
        this.zza = context0;
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        this.zzb.setY(((float)(-arr_v[1])));
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        this.zzb.setY(((float)(-arr_v[1])));
    }

    public static zzcrq zza(Context context0, View view0, zzfbe zzfbe0) {
        zzcrq zzcrq0 = new zzcrq(context0);
        if(!zzfbe0.zzv.isEmpty()) {
            Resources resources0 = zzcrq0.zza.getResources();
            if(resources0 != null) {
                DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                if(displayMetrics0 != null) {
                    zzfbf zzfbf0 = (zzfbf)zzfbe0.zzv.get(0);
                    zzcrq0.setLayoutParams(new FrameLayout.LayoutParams(((int)(((float)zzfbf0.zza) * displayMetrics0.density)), ((int)(((float)zzfbf0.zzb) * displayMetrics0.density))));
                }
            }
        }
        zzcrq0.zzb = view0;
        zzcrq0.addView(view0);
        zzcba.zzb(zzcrq0, zzcrq0);
        zzcba.zza(zzcrq0, zzcrq0);
        JSONObject jSONObject0 = zzfbe0.zzai;
        RelativeLayout relativeLayout0 = new RelativeLayout(zzcrq0.zza);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("header");
        if(jSONObject1 != null) {
            zzcrq0.zzc(jSONObject1, relativeLayout0, 10);
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("footer");
        if(jSONObject2 != null) {
            zzcrq0.zzc(jSONObject2, relativeLayout0, 12);
        }
        zzcrq0.addView(relativeLayout0);
        return zzcrq0;
    }

    private final int zzb(double f) {
        return zzbzt.zzx(this.zza, ((int)f));
    }

    private final void zzc(JSONObject jSONObject0, RelativeLayout relativeLayout0, int v) {
        TextView textView0 = new TextView(this.zza);
        textView0.setTextColor(-1);
        textView0.setBackgroundColor(0xFF000000);
        textView0.setGravity(17);
        textView0.setText(jSONObject0.optString("text", ""));
        textView0.setTextSize(((float)jSONObject0.optDouble("text_size", 11.0)));
        int v1 = this.zzb(jSONObject0.optDouble("padding", 0.0));
        textView0.setPadding(0, v1, 0, v1);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, this.zzb(jSONObject0.optDouble("height", 15.0)));
        relativeLayout$LayoutParams0.addRule(v);
        relativeLayout0.addView(textView0, relativeLayout$LayoutParams0);
    }
}

