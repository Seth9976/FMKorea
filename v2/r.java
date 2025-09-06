package V2;

public abstract class r extends p {
    private static final int[] f;
    static final int[][] g;

    static {
        r.f = new int[]{1, 1, 1, 1, 1, 1};
        r.g = new int[][]{new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    }

    public static String c(String s) {
        char[] arr_c = new char[6];
        s.getChars(1, 7, arr_c, 0);
        StringBuilder stringBuilder0 = new StringBuilder(12);
        stringBuilder0.append(s.charAt(0));
        int v = arr_c[5];
        switch(v) {
            case 0x30: 
            case 49: 
            case 50: {
                stringBuilder0.append(arr_c, 0, 2);
                stringBuilder0.append(((char)v));
                stringBuilder0.append("0000");
                stringBuilder0.append(arr_c, 2, 3);
                break;
            }
            case 51: {
                stringBuilder0.append(arr_c, 0, 3);
                stringBuilder0.append("00000");
                stringBuilder0.append(arr_c, 3, 2);
                break;
            }
            case 52: {
                stringBuilder0.append(arr_c, 0, 4);
                stringBuilder0.append("00000");
                stringBuilder0.append(arr_c[4]);
                break;
            }
            default: {
                stringBuilder0.append(arr_c, 0, 5);
                stringBuilder0.append("0000");
                stringBuilder0.append(((char)v));
            }
        }
        if(s.length() >= 8) {
            stringBuilder0.append(s.charAt(7));
        }
        return stringBuilder0.toString();
    }
}

