package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.ImageView.ScaleType;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfrv;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbx {
    public static Point zza(MotionEvent motionEvent0, View view0) {
        int[] arr_v = zzbx.zzj(view0);
        return new Point(((int)motionEvent0.getRawX()) - arr_v[0], ((int)motionEvent0.getRawY()) - arr_v[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        windowManager$LayoutParams0.flags = (int)(((Integer)zzba.zzc().zzb(zzbbr.zzhI)));
        windowManager$LayoutParams0.type = 2;
        windowManager$LayoutParams0.gravity = 0x800033;
        return windowManager$LayoutParams0;
    }

    public static JSONObject zzc(String s, Context context0, Point point0, Point point1) {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = null;
        try {
            jSONObject1 = new JSONObject();
        }
        catch(Exception exception0) {
            zzcaa.zzh("Error occurred while grabbing click signals.", exception0);
            return jSONObject0;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("x", zzay.zzb().zzb(context0, point1.x));
                jSONObject2.put("y", zzay.zzb().zzb(context0, point1.y));
                jSONObject2.put("start_x", zzay.zzb().zzb(context0, point0.x));
                jSONObject2.put("start_y", zzay.zzb().zzb(context0, point0.y));
                jSONObject0 = jSONObject2;
            }
            catch(JSONException jSONException0) {
                zzcaa.zzh("Error occurred while putting signals into JSON object.", jSONException0);
            }
            jSONObject1.put("click_point", jSONObject0);
            jSONObject1.put("asset_id", s);
            return jSONObject1;
        }
        catch(Exception exception0) {
            jSONObject0 = jSONObject1;
        }
        zzcaa.zzh("Error occurred while grabbing click signals.", exception0);
        return jSONObject0;
    }

    public static JSONObject zzd(Context context0, Map map0, Map map1, View view0, ImageView.ScaleType imageView$ScaleType0) {
        String s;
        JSONObject jSONObject5;
        JSONObject jSONObject4;
        JSONObject jSONObject3;
        int v;
        JSONObject jSONObject0 = new JSONObject();
        if(map0 == null || view0 == null) {
            return jSONObject0;
        }
        int[] arr_v = zzbx.zzj(view0);
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            View view1 = (View)((WeakReference)map$Entry0.getValue()).get();
            if(view1 != null) {
                int[] arr_v1 = zzbx.zzj(view1);
                JSONObject jSONObject1 = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    v = view1.getMeasuredWidth();
                    jSONObject3 = jSONObject0;
                }
                catch(JSONException unused_ex) {
                    jSONObject4 = jSONObject0;
                    goto label_65;
                }
                try {
                    jSONObject2.put("width", zzay.zzb().zzb(context0, v));
                    jSONObject2.put("height", zzay.zzb().zzb(context0, view1.getMeasuredHeight()));
                    jSONObject2.put("x", zzay.zzb().zzb(context0, arr_v1[0] - arr_v[0]));
                    jSONObject2.put("y", zzay.zzb().zzb(context0, arr_v1[1] - arr_v[1]));
                    jSONObject2.put("relative_to", "ad_view");
                    jSONObject1.put("frame", jSONObject2);
                    Rect rect0 = new Rect();
                    if(view1.getLocalVisibleRect(rect0)) {
                        jSONObject5 = zzbx.zzk(context0, rect0);
                    }
                    else {
                        jSONObject5 = new JSONObject();
                        jSONObject5.put("width", 0);
                        jSONObject5.put("height", 0);
                        jSONObject5.put("x", zzay.zzb().zzb(context0, arr_v1[0] - arr_v[0]));
                        jSONObject5.put("y", zzay.zzb().zzb(context0, arr_v1[1] - arr_v[1]));
                        jSONObject5.put("relative_to", "ad_view");
                    }
                    jSONObject1.put("visible_bounds", jSONObject5);
                    if(((String)map$Entry0.getKey()).equals("3010")) {
                        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhC)).booleanValue()) {
                            jSONObject1.put("mediaview_graphics_matrix", view1.getMatrix().toShortString());
                        }
                        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhD)).booleanValue()) {
                            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
                            jSONObject1.put("view_width_layout_type", zzbx.zzl(viewGroup$LayoutParams0.width) - 1);
                            jSONObject1.put("view_height_layout_type", zzbx.zzl(viewGroup$LayoutParams0.height) - 1);
                        }
                        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhE)).booleanValue()) {
                            ArrayList arrayList0 = new ArrayList();
                            arrayList0.add(view1.getId());
                            for(ViewParent viewParent0 = view1.getParent(); viewParent0 instanceof View; viewParent0 = viewParent0.getParent()) {
                                arrayList0.add(((View)viewParent0).getId());
                            }
                            jSONObject1.put("view_path", TextUtils.join("/", arrayList0));
                        }
                        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhF)).booleanValue() && imageView$ScaleType0 != null) {
                            jSONObject1.put("mediaview_scale_type", imageView$ScaleType0.ordinal());
                        }
                    }
                    if(view1 instanceof TextView) {
                        jSONObject1.put("text_color", ((TextView)view1).getCurrentTextColor());
                        jSONObject1.put("font_size", ((double)((TextView)view1).getTextSize()));
                        jSONObject1.put("text", ((TextView)view1).getText());
                    }
                    jSONObject1.put("is_clickable", map1 != null && map1.containsKey(map$Entry0.getKey()) && view1.isClickable());
                    s = (String)map$Entry0.getKey();
                    jSONObject4 = jSONObject3;
                    goto label_63;
                }
                catch(JSONException unused_ex) {
                }
                jSONObject4 = jSONObject3;
                goto label_65;
                try {
                label_63:
                    jSONObject4.put(s, jSONObject1);
                }
                catch(JSONException unused_ex) {
                label_65:
                    zzcaa.zzj("Unable to get asset views information");
                }
                jSONObject0 = jSONObject4;
            }
        }
        return jSONObject0;
    }

    public static JSONObject zze(Context context0, View view0) {
        JSONObject jSONObject0 = new JSONObject();
        if(view0 == null) {
            return jSONObject0;
        }
        try {
            jSONObject0.put("can_show_on_lock_screen", zzs.zzl(view0));
            jSONObject0.put("is_keyguard_locked", zzs.zzA(context0));
        }
        catch(JSONException unused_ex) {
            zzcaa.zzj("Unable to get lock screen information");
        }
        return jSONObject0;
    }

    public static JSONObject zzf(View view0) {
        boolean z = true;
        JSONObject jSONObject0 = new JSONObject();
        if(view0 == null) {
            return jSONObject0;
        }
        try {
            if(((Boolean)zzba.zzc().zzb(zzbbr.zzhB)).booleanValue()) {
                ViewParent viewParent0;
                for(viewParent0 = view0.getParent(); viewParent0 != null && !(viewParent0 instanceof ScrollView); viewParent0 = viewParent0.getParent()) {
                }
                if(viewParent0 == null) {
                    z = false;
                }
                jSONObject0.put("contained_in_scroll_view", z);
                return jSONObject0;
            }
            ViewParent viewParent1;
            for(viewParent1 = view0.getParent(); viewParent1 != null && !(viewParent1 instanceof AdapterView); viewParent1 = viewParent1.getParent()) {
            }
            if((viewParent1 == null ? -1 : ((AdapterView)viewParent1).getPositionForView(view0)) == -1) {
                z = false;
            }
            jSONObject0.put("contained_in_scroll_view", z);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static JSONObject zzg(Context context0, View view0) {
        String s;
        JSONObject jSONObject2;
        JSONObject jSONObject0 = new JSONObject();
        if(view0 == null) {
            return jSONObject0;
        }
        try {
            int[] arr_v = zzbx.zzj(view0);
            new int[]{view0.getMeasuredWidth(), view0.getMeasuredHeight()};
            int v = view0.getMeasuredWidth();
            int v1 = view0.getMeasuredHeight();
            for(ViewParent viewParent0 = view0.getParent(); viewParent0 instanceof ViewGroup; viewParent0 = viewParent0.getParent()) {
                v = Math.min(((ViewGroup)viewParent0).getMeasuredWidth(), v);
                v1 = Math.min(((ViewGroup)viewParent0).getMeasuredHeight(), v1);
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("width", zzay.zzb().zzb(context0, view0.getMeasuredWidth()));
            jSONObject1.put("height", zzay.zzb().zzb(context0, view0.getMeasuredHeight()));
            jSONObject1.put("x", zzay.zzb().zzb(context0, arr_v[0]));
            jSONObject1.put("y", zzay.zzb().zzb(context0, arr_v[1]));
            jSONObject1.put("maximum_visible_width", zzay.zzb().zzb(context0, v));
            jSONObject1.put("maximum_visible_height", zzay.zzb().zzb(context0, v1));
            jSONObject1.put("relative_to", "window");
            jSONObject0.put("frame", jSONObject1);
            Rect rect0 = new Rect();
            if(view0.getGlobalVisibleRect(rect0)) {
                jSONObject2 = zzbx.zzk(context0, rect0);
            }
            else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", 0);
                jSONObject3.put("height", 0);
                jSONObject3.put("x", zzay.zzb().zzb(context0, arr_v[0]));
                jSONObject3.put("y", zzay.zzb().zzb(context0, arr_v[1]));
                jSONObject3.put("relative_to", "window");
                jSONObject2 = jSONObject3;
            }
            jSONObject0.put("visible_bounds", jSONObject2);
        }
        catch(Exception unused_ex) {
            zzcaa.zzj("Unable to get native ad view bounding box");
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzgd)).booleanValue()) {
            ViewParent viewParent1 = view0.getParent();
            if(viewParent1 == null) {
            label_43:
                s = "";
            }
            else {
                try {
                    s = (String)viewParent1.getClass().getMethod("getTemplateTypeName", null).invoke(viewParent1, null);
                    goto label_44;
                }
                catch(NoSuchMethodException unused_ex) {
                    goto label_43;
                }
                catch(SecurityException | IllegalAccessException | InvocationTargetException securityException0) {
                }
                zzcaa.zzh("Cannot access method getTemplateTypeName: ", securityException0);
                goto label_43;
            }
            try {
            label_44:
                switch(s) {
                    case "medium_template": {
                        jSONObject0.put("native_template_type", 2);
                        goto label_53;
                    }
                    case "small_template": {
                        jSONObject0.put("native_template_type", 1);
                        goto label_53;
                    }
                    default: {
                        jSONObject0.put("native_template_type", 0);
                        goto label_53;
                    }
                }
            }
            catch(JSONException jSONException0) {
            }
            zzcaa.zzh("Could not log native template signal to JSON", jSONException0);
        }
    label_53:
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhD)).booleanValue()) {
            try {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                jSONObject0.put("view_width_layout_type", zzbx.zzl(viewGroup$LayoutParams0.width) - 1);
                jSONObject0.put("view_height_layout_type", zzbx.zzl(viewGroup$LayoutParams0.height) - 1);
                return jSONObject0;
            }
            catch(Exception unused_ex) {
                zze.zza("Unable to get native ad view layout types");
            }
        }
        return jSONObject0;
    }

    public static boolean zzh(Context context0, zzfbe zzfbe0) {
        if(!zzfbe0.zzO) {
            return false;
        }
        if(((Boolean)zzba.zzc().zzb(zzbbr.zzhG)).booleanValue()) {
            return ((Boolean)zzba.zzc().zzb(zzbbr.zzhJ)).booleanValue();
        }
        String s = (String)zzba.zzc().zzb(zzbbr.zzhH);
        if(!s.isEmpty() && context0 != null) {
            for(Object object0: zzfrv.zzc(zzfqt.zzc(';')).zzd(s)) {
                if(((String)object0).equals("com.fmkorea.m.fmk")) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean zzi(int v) {
        return !((Boolean)zzba.zzc().zzb(zzbbr.zzdj)).booleanValue() || ((Boolean)zzba.zzc().zzb(zzbbr.zzdk)).booleanValue() || v <= 0xE9759F;
    }

    public static int[] zzj(View view0) {
        int[] arr_v = new int[2];
        if(view0 != null) {
            view0.getLocationOnScreen(arr_v);
        }
        return arr_v;
    }

    private static JSONObject zzk(Context context0, Rect rect0) {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("width", zzay.zzb().zzb(context0, rect0.right - rect0.left));
        jSONObject0.put("height", zzay.zzb().zzb(context0, rect0.bottom - rect0.top));
        jSONObject0.put("x", zzay.zzb().zzb(context0, rect0.left));
        jSONObject0.put("y", zzay.zzb().zzb(context0, rect0.top));
        jSONObject0.put("relative_to", "self");
        return jSONObject0;
    }

    private static int zzl(int v) {
        switch(v) {
            case -2: {
                return 4;
            }
            case -1: {
                return 3;
            }
            default: {
                return 2;
            }
        }
    }
}

