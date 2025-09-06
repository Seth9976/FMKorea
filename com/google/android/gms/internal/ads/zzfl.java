package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

public final class zzfl {
    public static String zza(XmlPullParser xmlPullParser0, String s) {
        int v = xmlPullParser0.getAttributeCount();
        for(int v1 = 0; v1 < v; ++v1) {
            if(xmlPullParser0.getAttributeName(v1).equals(s)) {
                return xmlPullParser0.getAttributeValue(v1);
            }
        }
        return null;
    }

    public static boolean zzb(XmlPullParser xmlPullParser0, String s) {
        return xmlPullParser0.getEventType() == 3 && xmlPullParser0.getName().equals(s);
    }

    public static boolean zzc(XmlPullParser xmlPullParser0, String s) {
        return xmlPullParser0.getEventType() == 2 && xmlPullParser0.getName().equals(s);
    }
}

