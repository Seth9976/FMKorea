package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    static class a {
        int a;
        ArrayList b;
        int c;
        e d;

        public a(Context context0, XmlPullParser xmlPullParser0) {
            this.b = new ArrayList();
            this.c = -1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), i.R4);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == i.S4) {
                    this.a = typedArray0.getResourceId(v2, this.a);
                }
                else if(v2 == i.T4) {
                    this.c = typedArray0.getResourceId(v2, this.c);
                    String s = context0.getResources().getResourceTypeName(this.c);
                    context0.getResources().getResourceName(this.c);
                    if("layout".equals(s)) {
                        e e0 = new e();
                        this.d = e0;
                        e0.e(context0, this.c);
                    }
                }
            }
            typedArray0.recycle();
        }

        void a(b d$b0) {
            this.b.add(d$b0);
        }
    }

    static class b {
        float a;
        float b;
        float c;
        float d;
        int e;
        e f;

        public b(Context context0, XmlPullParser xmlPullParser0) {
            this.a = NaNf;
            this.b = NaNf;
            this.c = NaNf;
            this.d = NaNf;
            this.e = -1;
            TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), i.n5);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == i.o5) {
                    this.e = typedArray0.getResourceId(v2, this.e);
                    String s = context0.getResources().getResourceTypeName(this.e);
                    context0.getResources().getResourceName(this.e);
                    if("layout".equals(s)) {
                        e e0 = new e();
                        this.f = e0;
                        e0.e(context0, this.e);
                    }
                }
                else if(v2 == i.p5) {
                    this.d = typedArray0.getDimension(v2, this.d);
                }
                else if(v2 == i.q5) {
                    this.b = typedArray0.getDimension(v2, this.b);
                }
                else if(v2 == i.r5) {
                    this.c = typedArray0.getDimension(v2, this.c);
                }
                else if(v2 == i.s5) {
                    this.a = typedArray0.getDimension(v2, this.a);
                }
                else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArray0.recycle();
        }
    }

    private final ConstraintLayout a;
    int b;
    int c;
    private SparseArray d;
    private SparseArray e;

    d(Context context0, ConstraintLayout constraintLayout0, int v) {
        this.b = -1;
        this.c = -1;
        this.d = new SparseArray();
        this.e = new SparseArray();
        this.a = constraintLayout0;
        this.a(context0, v);
    }

    // This method was un-flattened
    private void a(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            a d$a0 = null;
            while(true) {
                switch(v1) {
                    case 0: {
                        xmlResourceParser0.getName();
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    case 1: {
                        return;
                    }
                    default: {
                        if(v1 == 2) {
                            String s = xmlResourceParser0.getName();
                            switch(s) {
                                case "ConstraintSet": {
                                    this.b(context0, xmlResourceParser0);
                                    break;
                                }
                                case "State": {
                                    d$a0 = new a(context0, xmlResourceParser0);
                                    this.d.put(d$a0.a, d$a0);
                                    break;
                                }
                                case "StateSet": {
                                    break;
                                }
                                case "Variant": {
                                    b d$b0 = new b(context0, xmlResourceParser0);
                                    if(d$a0 != null) {
                                        d$a0.a(d$b0);
                                    }
                                    break;
                                }
                                case "layoutDescription": {
                                    break;
                                }
                                default: {
                                    Log.v("ConstraintLayoutStates", "unknown tag " + s);
                                }
                            }
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_28;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_28;
        }
        xmlPullParserException0.printStackTrace();
        return;
    label_28:
        iOException0.printStackTrace();
    }

    private void b(Context context0, XmlPullParser xmlPullParser0) {
        e e0 = new e();
        int v = xmlPullParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if("id".equals(xmlPullParser0.getAttributeName(v1))) {
                String s = xmlPullParser0.getAttributeValue(v1);
                int v2 = s.contains("/") ? context0.getResources().getIdentifier(s.substring(s.indexOf(0x2F) + 1), "id", "com.fmkorea.m.fmk") : -1;
                if(v2 == -1) {
                    if(s.length() > 1) {
                        v2 = Integer.parseInt(s.substring(1));
                    }
                    else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                e0.l(context0, xmlPullParser0);
                this.e.put(v2, e0);
                return;
            }
        }
    }

    public void c(f f0) {
    }
}

