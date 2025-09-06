package androidx.datastore.preferences.protobuf;

abstract class j0 {
    interface b {
        byte a(int arg1);

        int size();
    }

    static String a(g g0) {
        static final class a implements b {
            final g a;

            a(g g0) {
                this.a = g0;
                super();
            }

            @Override  // androidx.datastore.preferences.protobuf.j0$b
            public byte a(int v) {
                return this.a.c(v);
            }

            @Override  // androidx.datastore.preferences.protobuf.j0$b
            public int size() {
                return this.a.size();
            }
        }

        return j0.b(new a(g0));
    }

    static String b(b j0$b0) {
        StringBuilder stringBuilder0 = new StringBuilder(j0$b0.size());
        for(int v = 0; v < j0$b0.size(); ++v) {
            int v1 = j0$b0.a(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    static String c(String s) {
        return j0.a(g.k(s));
    }
}

