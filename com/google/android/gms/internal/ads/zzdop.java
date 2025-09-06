package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.ArrayList;

public final class zzdop extends FrameLayout {
    private final zzas zza;

    public zzdop(Context context0, View view0, zzas zzas0) {
        super(context0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.addView(view0);
        this.zza = zzas0;
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        this.zza.zzm(motionEvent0);
        return false;
    }

    @Override  // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < this.getChildCount(); ++v1) {
            View view0 = this.getChildAt(v1);
            if(view0 != null && view0 instanceof zzcfi) {
                arrayList0.add(((zzcfi)view0));
            }
        }
        super.removeAllViews();
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            ((zzcfi)arrayList0.get(v)).destroy();
        }
    }
}

