package com.facebook;

public class j extends e {
    private final FacebookRequestError f;
    private static final long serialVersionUID = 1L;

    public j(FacebookRequestError facebookRequestError0, String s) {
        super(s);
        this.f = facebookRequestError0;
    }

    public final FacebookRequestError a() {
        return this.f;
    }

    // 去混淆评级： 低(20)
    @Override  // com.facebook.e
    public final String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.f.g() + ", facebookErrorCode: " + this.f.c() + ", facebookErrorType: " + this.f.e() + ", message: " + this.f.d() + "}";
    }
}

