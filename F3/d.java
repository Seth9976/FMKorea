package f3;

import java.util.Locale;

public class d implements b {
    @Override  // f3.b
    public String a() {
        String s = Locale.getDefault().getLanguage();
        s.hashCode();
        switch(s) {
            case "in": {
                return "id";
            }
            case "iw": {
                return "he";
            }
            case "ji": {
                return "yi";
            }
            case "zh": {
                return s + "-" + Locale.getDefault().getCountry();
            }
            default: {
                return s;
            }
        }
    }
}

