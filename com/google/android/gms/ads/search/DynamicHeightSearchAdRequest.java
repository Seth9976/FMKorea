package com.google.android.gms.ads.search;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class DynamicHeightSearchAdRequest {
    public static final class Builder {
        private final zzb zza;
        private final Bundle zzb;

        public Builder() {
            this.zza = new zzb();
            this.zzb = new Bundle();
        }

        public Builder addCustomEventExtrasBundle(Class class0, Bundle bundle0) {
            this.zza.zzb(class0, bundle0);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras0) {
            this.zza.zzc(networkExtras0);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class0, Bundle bundle0) {
            this.zza.zzd(class0, bundle0);
            return this;
        }

        public DynamicHeightSearchAdRequest build() {
            this.zza.zzd(AdMobAdapter.class, this.zzb);
            return new DynamicHeightSearchAdRequest(this, null);
        }

        public Builder setAdBorderSelectors(String s) {
            this.zzb.putString("csa_adBorderSelectors", s);
            return this;
        }

        public Builder setAdTest(boolean z) {
            this.zzb.putString("csa_adtest", (z ? "on" : "off"));
            return this;
        }

        public Builder setAdjustableLineHeight(int v) {
            this.zzb.putString("csa_adjustableLineHeight", Integer.toString(v));
            return this;
        }

        public Builder setAdvancedOptionValue(String s, String s1) {
            this.zzb.putString(s, s1);
            return this;
        }

        public Builder setAttributionSpacingBelow(int v) {
            this.zzb.putString("csa_attributionSpacingBelow", Integer.toString(v));
            return this;
        }

        public Builder setBorderSelections(String s) {
            this.zzb.putString("csa_borderSelections", s);
            return this;
        }

        public Builder setChannel(String s) {
            this.zzb.putString("csa_channel", s);
            return this;
        }

        public Builder setColorAdBorder(String s) {
            this.zzb.putString("csa_colorAdBorder", s);
            return this;
        }

        public Builder setColorAdSeparator(String s) {
            this.zzb.putString("csa_colorAdSeparator", s);
            return this;
        }

        public Builder setColorAnnotation(String s) {
            this.zzb.putString("csa_colorAnnotation", s);
            return this;
        }

        public Builder setColorAttribution(String s) {
            this.zzb.putString("csa_colorAttribution", s);
            return this;
        }

        public Builder setColorBackground(String s) {
            this.zzb.putString("csa_colorBackground", s);
            return this;
        }

        public Builder setColorBorder(String s) {
            this.zzb.putString("csa_colorBorder", s);
            return this;
        }

        public Builder setColorDomainLink(String s) {
            this.zzb.putString("csa_colorDomainLink", s);
            return this;
        }

        public Builder setColorText(String s) {
            this.zzb.putString("csa_colorText", s);
            return this;
        }

        public Builder setColorTitleLink(String s) {
            this.zzb.putString("csa_colorTitleLink", s);
            return this;
        }

        public Builder setCssWidth(int v) {
            this.zzb.putString("csa_width", Integer.toString(v));
            return this;
        }

        public Builder setDetailedAttribution(boolean z) {
            this.zzb.putString("csa_detailedAttribution", Boolean.toString(z));
            return this;
        }

        public Builder setFontFamily(String s) {
            this.zzb.putString("csa_fontFamily", s);
            return this;
        }

        public Builder setFontFamilyAttribution(String s) {
            this.zzb.putString("csa_fontFamilyAttribution", s);
            return this;
        }

        public Builder setFontSizeAnnotation(int v) {
            this.zzb.putString("csa_fontSizeAnnotation", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeAttribution(int v) {
            this.zzb.putString("csa_fontSizeAttribution", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeDescription(int v) {
            this.zzb.putString("csa_fontSizeDescription", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeDomainLink(int v) {
            this.zzb.putString("csa_fontSizeDomainLink", Integer.toString(v));
            return this;
        }

        public Builder setFontSizeTitle(int v) {
            this.zzb.putString("csa_fontSizeTitle", Integer.toString(v));
            return this;
        }

        public Builder setHostLanguage(String s) {
            this.zzb.putString("csa_hl", s);
            return this;
        }

        public Builder setIsClickToCallEnabled(boolean z) {
            this.zzb.putString("csa_clickToCall", Boolean.toString(z));
            return this;
        }

        public Builder setIsLocationEnabled(boolean z) {
            this.zzb.putString("csa_location", Boolean.toString(z));
            return this;
        }

        public Builder setIsPlusOnesEnabled(boolean z) {
            this.zzb.putString("csa_plusOnes", Boolean.toString(z));
            return this;
        }

        public Builder setIsSellerRatingsEnabled(boolean z) {
            this.zzb.putString("csa_sellerRatings", Boolean.toString(z));
            return this;
        }

        public Builder setIsSiteLinksEnabled(boolean z) {
            this.zzb.putString("csa_siteLinks", Boolean.toString(z));
            return this;
        }

        public Builder setIsTitleBold(boolean z) {
            this.zzb.putString("csa_titleBold", Boolean.toString(z));
            return this;
        }

        public Builder setIsTitleUnderlined(boolean z) {
            this.zzb.putString("csa_noTitleUnderline", Boolean.toString(!z));
            return this;
        }

        public Builder setLocationColor(String s) {
            this.zzb.putString("csa_colorLocation", s);
            return this;
        }

        public Builder setLocationFontSize(int v) {
            this.zzb.putString("csa_fontSizeLocation", Integer.toString(v));
            return this;
        }

        public Builder setLongerHeadlines(boolean z) {
            this.zzb.putString("csa_longerHeadlines", Boolean.toString(z));
            return this;
        }

        public Builder setNumber(int v) {
            this.zzb.putString("csa_number", Integer.toString(v));
            return this;
        }

        public Builder setPage(int v) {
            this.zzb.putString("csa_adPage", Integer.toString(v));
            return this;
        }

        public Builder setQuery(String s) {
            this.zza.zze(s);
            return this;
        }

        public Builder setStyleId(String s) {
            this.zzb.putString("csa_styleId", s);
            return this;
        }

        public Builder setVerticalSpacing(int v) {
            this.zzb.putString("csa_verticalSpacing", Integer.toString(v));
            return this;
        }

        static zzb zza(Builder dynamicHeightSearchAdRequest$Builder0) {
            return dynamicHeightSearchAdRequest$Builder0.zza;
        }
    }

    private final SearchAdRequest zza;

    DynamicHeightSearchAdRequest(Builder dynamicHeightSearchAdRequest$Builder0, zza zza0) {
        this.zza = new SearchAdRequest(Builder.zza(dynamicHeightSearchAdRequest$Builder0), null);
    }

    public Bundle getCustomEventExtrasBundle(Class class0) {
        return this.zza.getCustomEventExtrasBundle(class0);
    }

    public Bundle getNetworkExtrasBundle(Class class0) {
        return this.zza.getNetworkExtrasBundle(class0);
    }

    public String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(Context context0) {
        return this.zza.isTestDevice(context0);
    }

    final zzdx zza() {
        return this.zza.zza();
    }
}

