package C2;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.UUID;

public class g {
    private static final byte a;
    private static final byte b;

    static {
        g.a = 0x70;
        g.b = 15;
    }

    // 去混淆评级： 中等(50)
    public String a() [...] // 潜在的解密器

    private static String b(byte[] arr_b) {
        return new String(Base64.encode(arr_b, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uUID0, byte[] arr_b) [...] // 潜在的解密器
}

