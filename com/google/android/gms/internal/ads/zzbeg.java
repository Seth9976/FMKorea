package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzbeg extends RelativeLayout {
    private static final float[] zza;
    private AnimationDrawable zzb;

    static {
        zzbeg.zza = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    }

    public zzbeg(Context context0, zzbef zzbef0, RelativeLayout.LayoutParams relativeLayout$LayoutParams0) {
        super(context0);
        Preconditions.checkNotNull(zzbef0);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(zzbeg.zza, null, null));
        shapeDrawable0.getPaint().setColor(zzbef0.zzd());
        this.setLayoutParams(relativeLayout$LayoutParams0);
        this.setBackground(shapeDrawable0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        if(!TextUtils.isEmpty(zzbef0.zzg())) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView0 = new TextView(context0);
            textView0.setLayoutParams(relativeLayout$LayoutParams2);
            textView0.setId(0x47470001);
            textView0.setTypeface(Typeface.DEFAULT);
            textView0.setText(zzbef0.zzg());
            textView0.setTextColor(zzbef0.zze());
            textView0.setTextSize(((float)zzbef0.zzf()));
            textView0.setPadding(zzbzt.zzx(context0, 4), 0, zzbzt.zzx(context0, 4), 0);
            this.addView(textView0);
            relativeLayout$LayoutParams1.addRule(1, textView0.getId());
        }
        ImageView imageView0 = new ImageView(context0);
        imageView0.setLayoutParams(relativeLayout$LayoutParams1);
        imageView0.setId(0x47470002);
        List list0 = zzbef0.zzi();
        if(list0 != null && list0.size() > 1) {
            this.zzb = new AnimationDrawable();
            for(Object object0: list0) {
                zzbei zzbei0 = (zzbei)object0;
                try {
                    Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(zzbei0.zzf());
                    this.zzb.addFrame(drawable0, zzbef0.zzb());
                }
                catch(Exception exception0) {
                    zzcaa.zzh("Error while getting drawable.", exception0);
                }
            }
            imageView0.setBackground(this.zzb);
        }
        else if(list0.size() == 1) {
            try {
                imageView0.setImageDrawable(((Drawable)ObjectWrapper.unwrap(((zzbei)list0.get(0)).zzf())));
            }
            catch(Exception exception1) {
                zzcaa.zzh("Error while getting drawable.", exception1);
            }
        }
        this.addView(imageView0);
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable0 = this.zzb;
        if(animationDrawable0 != null) {
            animationDrawable0.start();
        }
        super.onAttachedToWindow();
    }
}

