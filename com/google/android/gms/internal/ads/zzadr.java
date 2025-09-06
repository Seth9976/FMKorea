package com.google.android.gms.internal.ads;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

final class zzadr {
    private static final String[] zza;
    private static final String[] zzb;
    private static final String[] zzc;

    static {
        zzadr.zza = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
        zzadr.zzb = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
        zzadr.zzc = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    }

    public static zzadn zza(String s) {
        try {
            XmlPullParser xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParser0.setInput(new StringReader(s));
            xmlPullParser0.next();
            if(!zzfl.zzc(xmlPullParser0, "x:xmpmeta")) {
                throw zzcd.zza("Couldn\'t find xmp metadata", null);
            }
            zzfud zzfud0 = zzfud.zzl();
            long v = 0x8000000000000001L;
        alab1:
            while(true) {
                xmlPullParser0.next();
                if(zzfl.zzc(xmlPullParser0, "rdf:Description")) {
                    String[] arr_s = zzadr.zza;
                    int v1 = 0;
                    int v2 = 0;
                    while(true) {
                        if(v2 >= 4) {
                            break alab1;
                        }
                        String s1 = zzfl.zza(xmlPullParser0, arr_s[v2]);
                        if(s1 != null) {
                            if(Integer.parseInt(s1) != 1) {
                                break alab1;
                            }
                            long v3 = 0x8000000000000001L;
                            String[] arr_s1 = zzadr.zzb;
                            for(int v4 = 0; v4 < 4; ++v4) {
                                String s2 = zzfl.zza(xmlPullParser0, arr_s1[v4]);
                                if(s2 != null) {
                                    long v5 = Long.parseLong(s2);
                                    if(v5 == -1L) {
                                        break;
                                    }
                                    v3 = v5;
                                    break;
                                }
                            }
                            String[] arr_s2 = zzadr.zzc;
                            while(v1 < 2) {
                                String s3 = zzfl.zza(xmlPullParser0, arr_s2[v1]);
                                if(s3 == null) {
                                    ++v1;
                                    continue;
                                }
                                long v6 = Long.parseLong(s3);
                                zzfud0 = zzfud.zzn(new zzadm("image/jpeg", "Primary", 0L, 0L), new zzadm("video/mp4", "MotionPhoto", v6, 0L));
                                goto label_39;
                            }
                            zzfud0 = zzfud.zzl();
                        label_39:
                            v = v3;
                            break;
                        }
                        ++v2;
                    }
                }
                else if(zzfl.zzc(xmlPullParser0, "Container:Directory")) {
                    zzfud0 = zzadr.zzb(xmlPullParser0, "Container", "Item");
                }
                else if(zzfl.zzc(xmlPullParser0, "GContainer:Directory")) {
                    zzfud0 = zzadr.zzb(xmlPullParser0, "GContainer", "GContainerItem");
                }
                if(zzfl.zzb(xmlPullParser0, "x:xmpmeta")) {
                    return zzfud0.isEmpty() ? null : new zzadn(v, zzfud0);
                }
            }
        }
        catch(XmlPullParserException | zzcd | NumberFormatException unused_ex) {
            zzes.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
        }
        return null;
    }

    private static zzfud zzb(XmlPullParser xmlPullParser0, String s, String s1) {
        zzfua zzfua0 = new zzfua();
        do {
            xmlPullParser0.next();
            if(zzfl.zzc(xmlPullParser0, s + ":Item")) {
                String s2 = zzfl.zza(xmlPullParser0, s1 + ":Mime");
                String s3 = zzfl.zza(xmlPullParser0, s1 + ":Semantic");
                String s4 = zzfl.zza(xmlPullParser0, s1 + ":Length");
                String s5 = zzfl.zza(xmlPullParser0, s1 + ":Padding");
                if(s2 != null && s3 != null) {
                    zzfua0.zzf(new zzadm(s2, s3, (s4 == null ? 0L : Long.parseLong(s4)), (s5 == null ? 0L : Long.parseLong(s5))));
                    continue;
                }
                return zzfud.zzl();
            }
        }
        while(!zzfl.zzb(xmlPullParser0, s + ":Directory"));
        return zzfua0.zzi();
    }
}

