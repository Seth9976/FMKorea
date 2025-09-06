package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;

public final class zzfdb {
    public static zze zza(Throwable throwable0) {
        if(throwable0 instanceof zzedr) {
            return zzfdb.zzc(((zzedr)throwable0).zza(), ((zzedr)throwable0).zzb());
        }
        if(throwable0 instanceof zzdve) {
            return throwable0.getMessage() == null ? zzfdb.zzd(((zzdve)throwable0).zza(), null, null) : zzfdb.zzd(((zzdve)throwable0).zza(), throwable0.getMessage(), null);
        }
        return throwable0 instanceof zzay ? new zze(((zzay)throwable0).zza(), zzfrx.zzc(((zzay)throwable0).getMessage()), "com.google.android.gms.ads", null, null) : zzfdb.zzd(1, null, null);
    }

    public static zze zzb(Throwable throwable0, zzeds zzeds0) {
        zze zze0 = zzfdb.zza(throwable0);
        if((zze0.zza == 0 || zze0.zza == 3) && (zze0.zzd != null && !zze0.zzd.zzc.equals("com.google.android.gms.ads"))) {
            zze0.zzd = null;
        }
        if(zzeds0 != null) {
            zze0.zze = zzeds0.zzb();
        }
        return zze0;
    }

    public static zze zzc(int v, zze zze0) {
        switch(v) {
            case 0: {
                throw null;
            }
            case 8: {
                return ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhU)))) > 0 ? zze0 : zzfdb.zzd(8, null, zze0);
            }
            default: {
                return zzfdb.zzd(v, null, zze0);
            }
        }
    }

    public static zze zzd(int v, String s, zze zze0) {
        String s2;
        String s1;
        if(s == null) {
            if(v == 0) {
                throw null;
            }
            switch(v - 1) {
                case 1: {
                    s1 = "Invalid request.";
                    break;
                }
                case 2: {
                    s1 = "No fill.";
                    break;
                }
                case 3: {
                    s1 = "App ID missing.";
                    break;
                }
                case 4: {
                    s1 = "Network error.";
                    break;
                }
                case 5: {
                    s1 = "Invalid request: Invalid ad unit ID.";
                    break;
                }
                case 6: {
                    s1 = "Invalid request: Invalid ad size.";
                    break;
                }
                case 7: {
                    s1 = "A mediation adapter failed to show the ad.";
                    break;
                }
                case 8: {
                    s1 = "The ad is not ready.";
                    break;
                }
                case 9: {
                    s1 = "The ad has already been shown.";
                    break;
                }
                case 10: {
                    s1 = "The ad can not be shown when app is not in foreground.";
                    break;
                }
                case 12: {
                    s1 = ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhX)))) <= 0 ? "The mediation adapter did not return an ad." : "No fill.";
                    break;
                }
                case 13: {
                    s1 = "Mismatch request IDs.";
                    break;
                }
                case 14: {
                    s1 = "Invalid ad string.";
                    break;
                }
                case 15: {
                    s1 = "Ad inspector had an internal error.";
                    break;
                }
                case 16: {
                    s1 = "Ad inspector failed to load.";
                    break;
                }
                case 17: {
                    s1 = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                }
                case 18: {
                    s1 = "Ad inspector cannot be opened because it is already open.";
                    break;
                }
                default: {
                    s1 = "Internal error.";
                }
            }
        }
        else {
            s1 = s;
        }
        if(v != 0) {
            switch(v - 1) {
                case 3: {
                    return new zze(8, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 7: {
                    return new zze(4, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 12: {
                    return ((int)(((Integer)zzba.zzc().zzb(zzbbr.zzhX)))) > 0 ? new zze(3, s1, "com.google.android.gms.ads", zze0, null) : new zze(9, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 13: {
                    return new zze(10, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 14: {
                    return new zze(11, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 0: 
                case 11: 
                case 15: {
                    return new zze(0, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 1: 
                case 5: 
                case 6: 
                case 9: 
                case 16: {
                    return new zze(1, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 4: 
                case 8: 
                case 17: {
                    return new zze(2, s1, "com.google.android.gms.ads", zze0, null);
                }
                case 2: 
                case 10: 
                case 18: {
                    return new zze(3, s1, "com.google.android.gms.ads", zze0, null);
                }
                default: {
                    switch(v) {
                        case 1: {
                            s2 = "INTERNAL_ERROR";
                            break;
                        }
                        case 2: {
                            s2 = "INVALID_REQUEST";
                            break;
                        }
                        case 3: {
                            s2 = "NO_FILL";
                            break;
                        }
                        case 4: {
                            s2 = "APP_ID_MISSING";
                            break;
                        }
                        case 5: {
                            s2 = "NETWORK_ERROR";
                            break;
                        }
                        case 6: {
                            s2 = "INVALID_AD_UNIT_ID";
                            break;
                        }
                        case 7: {
                            s2 = "INVALID_AD_SIZE";
                            break;
                        }
                        case 8: {
                            s2 = "MEDIATION_SHOW_ERROR";
                            break;
                        }
                        case 9: {
                            s2 = "NOT_READY";
                            break;
                        }
                        case 10: {
                            s2 = "AD_REUSED";
                            break;
                        }
                        case 11: {
                            s2 = "APP_NOT_FOREGROUND";
                            break;
                        }
                        case 12: {
                            s2 = "INTERNAL_SHOW_ERROR";
                            break;
                        }
                        case 13: {
                            s2 = "MEDIATION_NO_FILL";
                            break;
                        }
                        case 14: {
                            s2 = "REQUEST_ID_MISMATCH";
                            break;
                        }
                        case 15: {
                            s2 = "INVALID_AD_STRING";
                            break;
                        }
                        case 16: {
                            s2 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        }
                        case 17: {
                            s2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        }
                        case 18: {
                            s2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        }
                        default: {
                            s2 = "AD_INSPECTOR_ALREADY_OPEN";
                        }
                    }
                    throw new AssertionError("Unknown SdkError: " + s2);
                }
            }
        }
        throw null;
    }
}

