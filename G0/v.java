package g0;

import z3.k;

public final class v {
    public static final v a;

    static {
        v.a = new v();
    }

    public static final String a(String s) {
        k.e(s, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'" + s + "\')";
    }
}

