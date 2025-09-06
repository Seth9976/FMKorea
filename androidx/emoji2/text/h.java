package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.text.EmojiConsistency;
import java.util.Collections;
import java.util.Set;

abstract class h {
    static abstract class a {
        static Set a() {
            return b.a();
        }
    }

    static abstract class b {
        static Set a() {
            Set set0 = EmojiConsistency.getEmojiConsistencySet();
            if(set0 == null) {
                return Collections.emptySet();
            }
            for(Object object0: set0) {
                if(!(object0 instanceof int[])) {
                    return Collections.emptySet();
                }
                if(false) {
                    break;
                }
            }
            return set0;
        }
    }

    static Set a() {
        return Build.VERSION.SDK_INT < 34 ? b.a() : a.a();
    }
}

