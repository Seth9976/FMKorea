package androidx.media;

import android.util.SparseIntArray;
import q0.a;

public class AudioAttributesCompat implements a {
    AudioAttributesImpl a;
    private static final SparseIntArray b;
    private static final int[] c;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        AudioAttributesCompat.b = sparseIntArray0;
        sparseIntArray0.put(5, 1);
        sparseIntArray0.put(6, 2);
        sparseIntArray0.put(7, 2);
        sparseIntArray0.put(8, 1);
        sparseIntArray0.put(9, 1);
        sparseIntArray0.put(10, 1);
        AudioAttributesCompat.c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    static int a(boolean z, int v, int v1) {
        if((v & 1) == 1) {
            return z ? 1 : 7;
        }
        if((v & 4) == 4) {
            return z ? 0 : 6;
        }
        switch(v1) {
            case 0: {
                return z ? 0x80000000 : 3;
            }
            case 2: {
                return 0;
            }
            case 3: {
                return z ? 0 : 8;
            }
            case 4: {
                return 4;
            }
            case 6: {
                return 2;
            }
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return 5;
            }
            case 11: {
                return 10;
            }
            case 13: {
                return 1;
            }
            case 1: 
            case 12: 
            case 14: 
            case 16: {
                return 3;
            }
            default: {
                if(z) {
                    throw new IllegalArgumentException("Unknown usage value " + v1 + " in audio attributes");
                }
                return 3;
            }
        }
    }

    static String b(int v) {
        switch(v) {
            case 0: {
                return "USAGE_UNKNOWN";
            }
            case 1: {
                return "USAGE_MEDIA";
            }
            case 2: {
                return "USAGE_VOICE_COMMUNICATION";
            }
            case 3: {
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            }
            case 4: {
                return "USAGE_ALARM";
            }
            case 5: {
                return "USAGE_NOTIFICATION";
            }
            case 6: {
                return "USAGE_NOTIFICATION_RINGTONE";
            }
            case 7: {
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            }
            case 8: {
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            }
            case 9: {
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            }
            case 10: {
                return "USAGE_NOTIFICATION_EVENT";
            }
            case 11: {
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            }
            case 12: {
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            }
            case 13: {
                return "USAGE_ASSISTANCE_SONIFICATION";
            }
            case 14: {
                return "USAGE_GAME";
            }
            case 16: {
                return "USAGE_ASSISTANT";
            }
            default: {
                return "unknown usage " + v;
            }
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof AudioAttributesCompat)) {
            return false;
        }
        return this.a == null ? ((AudioAttributesCompat)object0).a == null : this.a.equals(((AudioAttributesCompat)object0).a);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

