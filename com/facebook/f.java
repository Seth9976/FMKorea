package com.facebook;

public class f extends e {
    private final n f;

    public f(n n0, String s) {
        super(s);
        this.f = n0;
    }

    @Override  // com.facebook.e
    public final String toString() {
        FacebookRequestError facebookRequestError0 = this.f == null ? null : this.f.g();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("{FacebookGraphResponseException: ");
        String s = this.getMessage();
        if(s != null) {
            stringBuilder0.append(s);
            stringBuilder0.append(" ");
        }
        if(facebookRequestError0 != null) {
            stringBuilder0.append("httpResponseCode: ");
            stringBuilder0.append(facebookRequestError0.g());
            stringBuilder0.append(", facebookErrorCode: ");
            stringBuilder0.append(facebookRequestError0.c());
            stringBuilder0.append(", facebookErrorType: ");
            stringBuilder0.append(facebookRequestError0.e());
            stringBuilder0.append(", message: ");
            stringBuilder0.append(facebookRequestError0.d());
            stringBuilder0.append("}");
        }
        return stringBuilder0.toString();
    }
}

