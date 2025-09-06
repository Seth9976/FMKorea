package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.impl.R.drawable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context0, zzq zzq0, zzad zzad0) {
        super(context0);
        this.zzb = zzad0;
        this.setOnClickListener(this);
        ImageButton imageButton0 = new ImageButton(context0);
        this.zza = imageButton0;
        this.zzc();
        imageButton0.setBackgroundColor(0);
        imageButton0.setOnClickListener(this);
        imageButton0.setPadding(zzbzt.zzx(context0, zzq0.zza), zzbzt.zzx(context0, 0), zzbzt.zzx(context0, zzq0.zzb), zzbzt.zzx(context0, zzq0.zzc));
        imageButton0.setContentDescription("Interstitial close button");
        this.addView(imageButton0, new FrameLayout.LayoutParams(zzbzt.zzx(context0, zzq0.zzd + zzq0.zza + zzq0.zzb), zzbzt.zzx(context0, zzq0.zzd + zzq0.zzc), 17));
        long v = (long)(((Long)zzba.zzc().zzb(zzbbr.zzba)));
        if(v <= 0L) {
            return;
        }
        zzp zzp0 = ((Boolean)zzba.zzc().zzb(zzbbr.zzbb)).booleanValue() ? new zzp(this) : null;
        imageButton0.setAlpha(0.0f);
        imageButton0.animate().alpha(1.0f).setDuration(v).setListener(zzp0);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        zzad zzad0 = this.zzb;
        if(zzad0 != null) {
            zzad0.zzj();
        }
    }

    static ImageButton zza(zzr zzr0) {
        return zzr0.zza;
    }

    public final void zzb(boolean z) {
        if(z) {
            this.zza.setVisibility(8);
            if(((long)(((Long)zzba.zzc().zzb(zzbbr.zzba)))) > 0L) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
            }
            return;
        }
        this.zza.setVisibility(0);
    }

    private final void zzc() {
        String s = (String)zzba.zzc().zzb(zzbbr.zzaZ);
        if(!TextUtils.isEmpty(s) && !"default".equals(s)) {
            Drawable drawable0 = null;
            Resources resources0 = zzt.zzo().zzd();
            if(resources0 != null) {
                try {
                    if("white".equals(s)) {
                        drawable0 = resources0.getDrawable(drawable.admob_close_button_white_circle_black_cross);
                    }
                    else if("black".equals(s)) {
                        drawable0 = resources0.getDrawable(drawable.admob_close_button_black_circle_white_cross);
                    }
                }
                catch(Resources.NotFoundException unused_ex) {
                    zzcaa.zze("Close button resource not found, falling back to default.");
                }
                if(drawable0 == null) {
                    this.zza.setImageResource(0x1080017);
                    return;
                }
                this.zza.setImageDrawable(drawable0);
                this.zza.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.zza.setImageResource(0x1080017);
            return;
        }
        this.zza.setImageResource(0x1080017);
    }
}

