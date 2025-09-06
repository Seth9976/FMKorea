package com.google.android.gms.ads.rewarded;

public class ServerSideVerificationOptions {
    public static final class Builder {
        private String zza;
        private String zzb;

        public Builder() {
            this.zza = "";
            this.zzb = "";
        }

        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        public Builder setCustomData(String s) {
            this.zzb = s;
            return this;
        }

        public Builder setUserId(String s) {
            this.zza = s;
            return this;
        }

        static String zza(Builder serverSideVerificationOptions$Builder0) {
            return serverSideVerificationOptions$Builder0.zzb;
        }

        static String zzb(Builder serverSideVerificationOptions$Builder0) {
            return serverSideVerificationOptions$Builder0.zza;
        }
    }

    private final String zza;
    private final String zzb;

    ServerSideVerificationOptions(Builder serverSideVerificationOptions$Builder0, zzd zzd0) {
        this.zza = Builder.zzb(serverSideVerificationOptions$Builder0);
        this.zzb = Builder.zza(serverSideVerificationOptions$Builder0);
    }

    public String getCustomData() {
        return this.zzb;
    }

    public String getUserId() {
        return this.zza;
    }
}

