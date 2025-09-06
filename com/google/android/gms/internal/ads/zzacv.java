package com.google.android.gms.internal.ads;

final class zzacv implements zzacn {
    public final zzfud zza;
    private final int zzb;

    private zzacv(int v, zzfud zzfud0) {
        this.zzb = v;
        this.zza = zzfud0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zza() {
        return this.zzb;
    }

    public final zzacn zzb(Class class0) {
        zzfud zzfud0 = this.zza;
        int v = zzfud0.size();
        int v1 = 0;
        while(v1 < v) {
            zzacn zzacn0 = (zzacn)zzfud0.get(v1);
            ++v1;
            if(zzacn0.getClass() == class0) {
                return zzacn0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    // This method was un-flattened
    public static zzacv zzc(int v, zzfb zzfb0) {
        String s1;
        String s;
        zzacv zzacv0;
        zzfua zzfua0 = new zzfua();
        int v1 = zzfb0.zzd();
        int v2 = -2;
        while(zzfb0.zza() > 8) {
            int v3 = zzfb0.zzh();
            int v4 = zzfb0.zzc() + zzfb0.zzh();
            zzfb0.zzF(v4);
            if(v3 == 0x5453494C) {
                zzacv0 = zzacv.zzc(zzfb0.zzh(), zzfb0);
            }
            else {
                zzacv zzacv1 = null;
            alab2:
                switch(v3) {
                    case 0x66727473: {
                    alab1:
                        switch(v2) {
                            case 1: {
                                int v5 = zzfb0.zzj();
                                switch(v5) {
                                    case 1: {
                                        break;
                                    }
                                    case 85: {
                                        s = "audio/mpeg";
                                        break;
                                    }
                                    case 0xFF: {
                                        s = "audio/mp4a-latm";
                                        break;
                                    }
                                    case 0x2000: {
                                        s = "audio/ac3";
                                        break;
                                    }
                                    case 0x2001: {
                                        s = "audio/vnd.dts";
                                        break;
                                    }
                                    default: {
                                        s = null;
                                        zzes.zzf("StreamFormatChunk", "Ignoring track with unsupported format tag " + v5);
                                        break alab1;
                                    }
                                }
                                int v6 = zzfb0.zzj();
                                int v7 = zzfb0.zzh();
                                zzfb0.zzH(6);
                                int v8 = zzfk.zzk(zzfb0.zzp());
                                int v9 = zzfb0.zzj();
                                byte[] arr_b = new byte[v9];
                                zzfb0.zzC(arr_b, 0, v9);
                                zzak zzak0 = new zzak();
                                zzak0.zzS(s);
                                zzak0.zzw(v6);
                                zzak0.zzT(v7);
                                if("audio/raw".equals(s) && v8 != 0) {
                                    zzak0.zzN(v8);
                                }
                                if("audio/mp4a-latm".equals(s) && v9 > 0) {
                                    zzak0.zzI(zzfud.zzm(arr_b));
                                }
                                zzacv0 = new zzacw(zzak0.zzY());
                                break alab2;
                            }
                            case 2: {
                                zzfb0.zzH(4);
                                int v10 = zzfb0.zzh();
                                int v11 = zzfb0.zzh();
                                zzfb0.zzH(4);
                                int v12 = zzfb0.zzh();
                                switch(v12) {
                                    case 0x3234504D: {
                                        s1 = "video/mp42";
                                        goto label_62;
                                    }
                                    case 0x3334504D: {
                                        s1 = "video/mp43";
                                        goto label_62;
                                    }
                                    case 0x31435641: 
                                    case 828601953: 
                                    case 875967048: {
                                        s1 = "video/avc";
                                        goto label_62;
                                    }
                                    case 0x47504A4D: 
                                    case 0x67706A6D: {
                                        s1 = "video/mjpeg";
                                        goto label_62;
                                    }
                                    case 808802372: 
                                    case 0x34504D46: 
                                    case 0x44495633: 
                                    case 1145656920: 
                                    case 1482049860: 
                                    case 1684633208: 
                                    case 2021026148: {
                                    label_62:
                                        zzak zzak1 = new zzak();
                                        zzak1.zzX(v10);
                                        zzak1.zzF(v11);
                                        zzak1.zzS(s1);
                                        zzacv1 = new zzacw(zzak1.zzY());
                                        break alab1;
                                    }
                                    default: {
                                        s1 = null;
                                        zzes.zzf("StreamFormatChunk", "Ignoring track with unsupported compression " + v12);
                                        break alab1;
                                    }
                                }
                            }
                            default: {
                                zzes.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + zzfk.zzz(v2));
                            }
                        }
                        zzacv0 = zzacv1;
                        break;
                    }
                    case 1751742049: {
                        zzacv0 = zzacs.zzb(zzfb0);
                        break;
                    }
                    case 0x68727473: {
                        zzacv0 = zzact.zzb(zzfb0);
                        break;
                    }
                    case 0x6E727473: {
                        zzacv0 = zzacx.zzb(zzfb0);
                        break;
                    }
                    default: {
                        zzacv0 = null;
                    }
                }
            }
            if(zzacv0 != null) {
                if(zzacv0.zza() == 0x68727473) {
                    int v13 = ((zzact)zzacv0).zza;
                    switch(v13) {
                        case 1935960438: {
                            v2 = 2;
                            break;
                        }
                        case 0x73647561: {
                            v2 = 1;
                            break;
                        }
                        case 1937012852: {
                            v2 = 3;
                            break;
                        }
                        default: {
                            zzes.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(v13));
                            v2 = -1;
                        }
                    }
                }
                zzfua0.zzf(zzacv0);
            }
            zzfb0.zzG(v4);
            zzfb0.zzF(v1);
        }
        return new zzacv(v, zzfua0.zzi());
    }
}

