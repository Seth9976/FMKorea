package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.Typeface;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.e.c;
import androidx.core.content.res.e.d;
import java.io.IOException;
import z.h.b;

public class m extends n {
    @Override  // androidx.core.graphics.n
    public Typeface a(Context context0, c e$c0, Resources resources0, int v) {
        try {
            d[] arr_e$d = e$c0.a();
            FontFamily.Builder fontFamily$Builder0 = null;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= arr_e$d.length) {
                    if(fontFamily$Builder0 == null) {
                        return null;
                    }
                    FontFamily fontFamily0 = fontFamily$Builder0.build();
                    return new Typeface.CustomFallbackBuilder(fontFamily0).setStyle(this.h(fontFamily0, v).getStyle()).build();
                }
                d e$d0 = arr_e$d[v1];
                try {
                    Font font0 = new Font.Builder(resources0, e$d0.b()).setWeight(e$d0.e()).setSlant(((int)e$d0.f())).setTtcIndex(e$d0.c()).setFontVariationSettings(e$d0.d()).build();
                    if(fontFamily$Builder0 == null) {
                        fontFamily$Builder0 = new FontFamily.Builder(font0);
                    }
                    else {
                        fontFamily$Builder0.addFont(font0);
                    }
                }
                catch(IOException unused_ex) {
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // androidx.core.graphics.n
    public Typeface b(Context context0, CancellationSignal cancellationSignal0, b[] arr_h$b, int v) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        try {
            FontFamily.Builder fontFamily$Builder0 = null;
            for(int v1 = 0; true; ++v1) {
                if(v1 >= arr_h$b.length) {
                    if(fontFamily$Builder0 == null) {
                        return null;
                    }
                    FontFamily fontFamily0 = fontFamily$Builder0.build();
                    return new Typeface.CustomFallbackBuilder(fontFamily0).setStyle(this.h(fontFamily0, v).getStyle()).build();
                }
                b h$b0 = arr_h$b[v1];
                try(ParcelFileDescriptor parcelFileDescriptor0 = contentResolver0.openFileDescriptor(h$b0.d(), "r", cancellationSignal0)) {
                    if(parcelFileDescriptor0 != null) {
                        Font font0 = new Font.Builder(parcelFileDescriptor0).setWeight(h$b0.e()).setSlant(((int)h$b0.f())).setTtcIndex(h$b0.c()).build();
                        if(fontFamily$Builder0 == null) {
                            fontFamily$Builder0 = new FontFamily.Builder(font0);
                        }
                        else {
                            fontFamily$Builder0.addFont(font0);
                        }
                    }
                }
                catch(IOException unused_ex) {
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // androidx.core.graphics.n
    public Typeface d(Context context0, Resources resources0, int v, String s, int v1) {
        try {
            Font font0 = new Font.Builder(resources0, v).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(font0).build()).setStyle(font0.getStyle()).build();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // androidx.core.graphics.n
    protected b g(b[] arr_h$b, int v) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    private Font h(FontFamily fontFamily0, int v) {
        FontStyle fontStyle0 = new FontStyle(((v & 1) == 0 ? 400 : 700), ((v & 2) == 0 ? 0 : 1));
        Font font0 = fontFamily0.getFont(0);
        int v2 = m.i(fontStyle0, font0.getStyle());
        for(int v1 = 1; v1 < fontFamily0.getSize(); ++v1) {
            Font font1 = fontFamily0.getFont(v1);
            int v3 = m.i(fontStyle0, font1.getStyle());
            if(v3 < v2) {
                font0 = font1;
                v2 = v3;
            }
        }
        return font0;
    }

    private static int i(FontStyle fontStyle0, FontStyle fontStyle1) {
        int v = Math.abs(fontStyle0.getWeight() - fontStyle1.getWeight());
        return fontStyle0.getSlant() == fontStyle1.getSlant() ? v / 100 : v / 100 + 2;
    }
}

