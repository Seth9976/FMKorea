package com.google.android.gms.internal.ads;

final class zzagy {
    static final String[] zza;
    public static final int zzb;

    static {
        zzagy.zza = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    }

    public static zzby zza(zzfb zzfb0) {
        zzby zzby23;
        zzby zzby22;
        zzby zzby21;
        zzby zzby20;
        zzby zzby19;
        zzby zzby18;
        zzby zzby17;
        zzby zzby16;
        zzby zzby15;
        zzby zzby14;
        zzby zzby13;
        zzby zzby12;
        zzby zzby11;
        zzby zzby10;
        zzby zzby9;
        zzby zzby8;
        zzby zzby7;
        zzby zzby6;
        zzby zzby5;
        String s1;
        zzby zzby4;
        zzby zzby3;
        zzby zzby2;
        zzby zzby1;
        int v = zzfb0.zzc() + zzfb0.zzf();
        int v1 = zzfb0.zzf();
        zzby zzby0 = null;
        try {
            if((v1 >> 24 & 0xFF) == 0xA9 || (v1 >> 24 & 0xFF) == 0xFD) {
                goto label_105;
            }
            else {
                switch(v1) {
                    case 757935405: {
                        goto label_77;
                    }
                    case 1631670868: {
                        goto label_47;
                    }
                    case 0x636F7672: {
                        goto label_26;
                    }
                    case 0x6370696C: {
                        goto label_23;
                    }
                    case 0x6469736B: {
                        goto label_14;
                    }
                    case 0x676E7265: {
                        int v2 = zzagy.zzb(zzfb0);
                        String s = v2 <= 0 || v2 > 0xC0 ? null : zzagy.zza[v2 - 1];
                        if(s == null) {
                            zzes.zzf("MetadataUtil", "Failed to parse standard genre code");
                        }
                        else {
                            zzby0 = new zzafa("TCON", null, zzfud.zzm(s));
                        }
                        goto label_12;
                    }
                    case 0x70676170: {
                        goto label_68;
                    }
                    case 1920233063: {
                        goto label_65;
                    }
                    case 0x736F6161: {
                        goto label_59;
                    }
                    case 0x736F616C: {
                        goto label_53;
                    }
                    case 0x736F6172: {
                        goto label_56;
                    }
                    case 0x736F636F: {
                        goto label_62;
                    }
                    case 0x736F6E6D: {
                        goto label_50;
                    }
                    case 0x736F736E: {
                        goto label_71;
                    }
                    case 0x746D706F: {
                        goto label_20;
                    }
                    case 0x74726B6E: {
                        goto label_17;
                    }
                    case 0x74767368: {
                        goto label_74;
                    }
                }
            }
            goto label_143;
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
    label_12:
        zzfb0.zzG(v);
        return zzby0;
        try {
        label_14:
            zzby1 = zzagy.zzd(0x6469736B, "TPOS", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby1;
        try {
        label_17:
            zzby2 = zzagy.zzd(0x74726B6E, "TRCK", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby2;
        try {
        label_20:
            zzby3 = zzagy.zzc(0x746D706F, "TBPM", zzfb0, true, false);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby3;
        try {
        label_23:
            zzby4 = zzagy.zzc(0x6370696C, "TCMP", zzfb0, true, true);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby4;
        try {
        label_26:
            int v3 = zzfb0.zzf();
            if(zzfb0.zzf() == 1684108385) {
                int v4 = zzfb0.zzf() & 0xFFFFFF;
                switch(v4) {
                    case 13: {
                        s1 = "image/jpeg";
                        break;
                    }
                    case 14: {
                        s1 = "image/png";
                        v4 = 14;
                        break;
                    }
                    default: {
                        s1 = null;
                    }
                }
                if(s1 == null) {
                    zzes.zzf("MetadataUtil", "Unrecognized cover art flags: " + v4);
                }
                else {
                    zzfb0.zzH(4);
                    byte[] arr_b = new byte[v3 - 16];
                    zzfb0.zzC(arr_b, 0, v3 - 16);
                    zzby0 = new zzaed(s1, null, 3, arr_b);
                }
            }
            else {
                zzes.zzf("MetadataUtil", "Failed to parse cover art attribute");
            }
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby0;
        try {
        label_47:
            zzby5 = zzagy.zze(1631670868, "TPE2", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby5;
        try {
        label_50:
            zzby6 = zzagy.zze(0x736F6E6D, "TSOT", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby6;
        try {
        label_53:
            zzby7 = zzagy.zze(0x736F616C, "TSO2", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby7;
        try {
        label_56:
            zzby8 = zzagy.zze(0x736F6172, "TSOA", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby8;
        try {
        label_59:
            zzby9 = zzagy.zze(0x736F6161, "TSOP", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby9;
        try {
        label_62:
            zzby10 = zzagy.zze(0x736F636F, "TSOC", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby10;
        try {
        label_65:
            zzby11 = zzagy.zzc(1920233063, "ITUNESADVISORY", zzfb0, false, false);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby11;
        try {
        label_68:
            zzby12 = zzagy.zzc(0x70676170, "ITUNESGAPLESS", zzfb0, false, true);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby12;
        try {
        label_71:
            zzby13 = zzagy.zze(0x736F736E, "TVSHOWSORT", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby13;
        try {
        label_74:
            zzby14 = zzagy.zze(0x74767368, "TVSHOW", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby14;
    label_77:
        int v5 = -1;
        int v6 = -1;
        String s2 = null;
        String s3 = null;
        try {
            while(zzfb0.zzc() < v) {
                int v7 = zzfb0.zzc();
                int v8 = zzfb0.zzf();
                int v9 = zzfb0.zzf();
                zzfb0.zzH(4);
                if(v9 == 1835360622) {
                    s2 = zzfb0.zzx(v8 - 12);
                }
                else {
                    switch(v9) {
                        case 1684108385: {
                            v6 = v8;
                        label_90:
                            if(v9 == 1684108385) {
                                v5 = v7;
                            }
                            zzfb0.zzH(v8 - 12);
                            break;
                        }
                        case 0x6E616D65: {
                            s3 = zzfb0.zzx(v8 - 12);
                            break;
                        }
                        default: {
                            goto label_90;
                        }
                    }
                }
            }
            if(s2 != null && s3 != null && v5 != -1) {
                zzfb0.zzG(v5);
                zzfb0.zzH(16);
                zzby0 = new zzaeu(s2, s3, zzfb0.zzx(v6 - 16));
            }
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby0;
        try {
        label_105:
            switch(v1 & 0xFFFFFF) {
                case 4280916: {
                    zzby15 = zzagy.zze(v1, "TPE1", zzfb0);
                    break;
                }
                case 0x616C62: {
                    goto label_110;
                }
                case 6516084: {
                    goto label_113;
                }
                case 0x646179: {
                    goto label_125;
                }
                case 0x67656E: {
                    goto label_128;
                }
                case 0x677270: {
                    goto label_131;
                }
                case 7108978: {
                    goto label_134;
                }
                case 0x746F6F: {
                    goto label_140;
                }
                case 7233901: 
                case 0x74726B: {
                    goto label_137;
                }
                case 0x636F6D: 
                case 7828084: {
                    goto label_122;
                }
                default: {
                    goto label_143;
                }
            }
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby15;
        try {
        label_110:
            zzby16 = zzagy.zze(v1, "TALB", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby16;
        try {
        label_113:
            int v10 = zzfb0.zzf();
            if(zzfb0.zzf() == 1684108385) {
                zzfb0.zzH(8);
                String s4 = zzfb0.zzx(v10 - 16);
                zzby0 = new zzael("und", s4, s4);
            }
            else {
                zzes.zzf("MetadataUtil", "Failed to parse comment attribute: " + zzagj.zzf(v1));
            }
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby0;
        try {
        label_122:
            zzby17 = zzagy.zze(v1, "TCOM", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby17;
        try {
        label_125:
            zzby18 = zzagy.zze(v1, "TDRC", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby18;
        try {
        label_128:
            zzby19 = zzagy.zze(v1, "TCON", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby19;
        try {
        label_131:
            zzby20 = zzagy.zze(v1, "TIT1", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby20;
        try {
        label_134:
            zzby21 = zzagy.zze(v1, "USLT", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby21;
        try {
        label_137:
            zzby22 = zzagy.zze(v1, "TIT2", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby22;
        try {
        label_140:
            zzby23 = zzagy.zze(v1, "TSSE", zzfb0);
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return zzby23;
        try {
        label_143:
            zzes.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzagj.zzf(v1));
        }
        catch(Throwable throwable0) {
            zzfb0.zzG(v);
            throw throwable0;
        }
        zzfb0.zzG(v);
        return null;
    }

    private static int zzb(zzfb zzfb0) {
        zzfb0.zzH(4);
        if(zzfb0.zzf() == 1684108385) {
            zzfb0.zzH(8);
            return zzfb0.zzl();
        }
        zzes.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzaes zzc(int v, String s, zzfb zzfb0, boolean z, boolean z1) {
        int v1 = zzagy.zzb(zzfb0);
        if(z1) {
            v1 = Math.min(1, v1);
        }
        if(v1 >= 0) {
            return z ? new zzafa(s, null, zzfud.zzm(Integer.toString(v1))) : new zzael("und", s, Integer.toString(v1));
        }
        zzes.zzf("MetadataUtil", "Failed to parse uint8 attribute: " + zzagj.zzf(v));
        return null;
    }

    private static zzafa zzd(int v, String s, zzfb zzfb0) {
        int v1 = zzfb0.zzf();
        if(zzfb0.zzf() == 1684108385 && v1 >= 22) {
            zzfb0.zzH(10);
            int v2 = zzfb0.zzp();
            if(v2 > 0) {
                String s1 = v2;
                int v3 = zzfb0.zzp();
                if(v3 > 0) {
                    s1 = s1 + "/" + v3;
                }
                return new zzafa(s, null, zzfud.zzm(s1));
            }
        }
        zzes.zzf("MetadataUtil", "Failed to parse index/count attribute: " + zzagj.zzf(v));
        return null;
    }

    private static zzafa zze(int v, String s, zzfb zzfb0) {
        int v1 = zzfb0.zzf();
        if(zzfb0.zzf() == 1684108385) {
            zzfb0.zzH(8);
            return new zzafa(s, null, zzfud.zzm(zzfb0.zzx(v1 - 16)));
        }
        zzes.zzf("MetadataUtil", "Failed to parse text attribute: " + zzagj.zzf(v));
        return null;
    }
}

