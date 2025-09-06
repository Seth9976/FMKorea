package U2;

final class m extends c {
    @Override  // U2.c
    int c(char c, StringBuilder stringBuilder0) {
        if(c == 0x20) {
            stringBuilder0.append('\u0003');
            return 1;
        }
        if(c >= 0x30 && c <= 57) {
            stringBuilder0.append(((char)(c - 44)));
            return 1;
        }
        if(c >= 97 && c <= 0x7A) {
            stringBuilder0.append(((char)(c - 83)));
            return 1;
        }
        if(c < 0x20) {
            stringBuilder0.append('\u0000');
            stringBuilder0.append(c);
            return 2;
        }
        if(c >= 33 && c <= 0x2F) {
            stringBuilder0.append('\u0001');
            stringBuilder0.append(((char)(c - 33)));
            return 2;
        }
        if(c >= 58 && c <= 0x40) {
            stringBuilder0.append('\u0001');
            stringBuilder0.append(((char)(c - 43)));
            return 2;
        }
        if(c >= 91 && c <= 0x5F) {
            stringBuilder0.append('\u0001');
            stringBuilder0.append(((char)(c - 69)));
            return 2;
        }
        if(c == 0x60) {
            stringBuilder0.append('\u0002');
            stringBuilder0.append('\u0000');
            return 2;
        }
        if(c >= 65 && c <= 90) {
            stringBuilder0.append('\u0002');
            stringBuilder0.append(((char)(c - 0x40)));
            return 2;
        }
        if(c >= 0x7B && c <= 0x7F) {
            stringBuilder0.append('\u0002');
            stringBuilder0.append(((char)(c - 0x60)));
            return 2;
        }
        stringBuilder0.append("\u0001\u001E");
        return this.c(((char)(c - 0x80)), stringBuilder0) + 2;
    }

    @Override  // U2.c
    public int e() {
        return 2;
    }
}

