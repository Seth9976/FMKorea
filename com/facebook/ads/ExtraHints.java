package com.facebook.ads;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@Deprecated
public class ExtraHints {
    @Keep
    @Deprecated
    public static class Builder {
        private HashMap mHints;
        private String mMediationData;

        public Builder() {
            this.mHints = new HashMap();
        }

        public ExtraHints build() {
            return new ExtraHints(this.mHints, this.mMediationData, null);
        }

        public Builder contentUrl(String s) {
            if(s == null) {
                return this;
            }
            this.mHints.put(HintType.CONTENT_URL, s);
            return this;
        }

        public Builder extraData(String s) {
            if(s == null) {
                return this;
            }
            this.mHints.put(HintType.EXTRA_DATA, s);
            return this;
        }

        @Deprecated
        public Builder keywords(List list0) {
            return this;
        }

        public Builder mediationData(String s) {
            if(TextUtils.isEmpty(s)) {
                return this;
            }
            this.mMediationData = s;
            return this;
        }
    }

    public static enum HintType {
        @Deprecated
        KEYWORDS("keywords"),
        CONTENT_URL("content_url"),
        EXTRA_DATA("extra_data");

        private String f;

        private HintType(String s1) {
            this.f = s1;
        }
    }

    @Keep
    @Deprecated
    public static enum Keyword {
        ACCESSORIES("accessories"),
        ART_HISTORY("art_history"),
        AUTOMOTIVE("automotive"),
        BEAUTY("beauty"),
        BIOLOGY("biology"),
        BOARD_GAMES("board_games"),
        BUSINESS_SOFTWARE("business_software"),
        BUYING_SELLING_HOMES("buying_selling_homes"),
        CATS("cats"),
        CELEBRITIES("celebrities"),
        CLOTHING("clothing"),
        COMIC_BOOKS("comic_books"),
        DESKTOP_VIDEO("desktop_video"),
        DOGS("dogs"),
        EDUCATION("education"),
        EMAIL("email"),
        ENTERTAINMENT("entertainment"),
        FAMILY_PARENTING("family_parenting"),
        FASHION("fashion"),
        FINE_ART("fine_art"),
        FOOD_DRINK("food_drink"),
        FRENCH_CUISINE("french_cuisine"),
        GOVERNMENT("government"),
        HEALTH_FITNESS("health_fitness"),
        HOBBIES("hobbies"),
        HOME_GARDEN("home_garden"),
        HUMOR("humor"),
        INTERNET_TECHNOLOGY("internet_technology"),
        LARGE_ANIMALS("large_animals"),
        LAW("law"),
        LEGAL_ISSUES("legal_issues"),
        LITERATURE("literature"),
        MARKETING("marketing"),
        MOVIES("movies"),
        MUSIC("music"),
        NEWS("news"),
        PERSONAL_FINANCE("personal_finance"),
        PETS("pets"),
        PHOTOGRAPHY("photography"),
        POLITICS("politics"),
        REAL_ESTATE("real_estate"),
        ROLEPLAYING_GAMES("roleplaying_games"),
        SCIENCE("science"),
        SHOPPING("shopping"),
        SOCIETY("society"),
        SPORTS("sports"),
        TECHNOLOGY("technology"),
        TELEVISION("television"),
        TRAVEL("travel"),
        VIDEO_COMPUTER_GAMES("video_computer_games");

        private String mKeyword;

        private Keyword(String s1) {
            this.mKeyword = s1;
        }
    }

    static abstract class a {
    }

    private static final String HINTS_JSON_KEY = "hints";
    private static final int KEYWORDS_MAX_COUNT = 5;
    private static final String KEYWORD_SEPARATOR = ";";
    private final String mHintsSerialized;
    private final String mMediationData;

    private ExtraHints(HashMap hashMap0, String s) {
        this.mMediationData = s;
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            try {
                jSONObject1.put(((HintType)map$Entry0.getKey()).f, map$Entry0.getValue());
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
            jSONObject0.put("hints", jSONObject1);
        }
        catch(JSONException unused_ex) {
        }
        this.mHintsSerialized = jSONObject0.toString();
    }

    ExtraHints(HashMap hashMap0, String s, a extraHints$a0) {
        this(hashMap0, s);
    }

    public String getHints() {
        return this.mHintsSerialized;
    }

    public String getMediationData() {
        return this.mMediationData;
    }

    private static String join(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: list0) {
            stringBuilder0.append(((String)object0));
            stringBuilder0.append(";");
        }
        return stringBuilder0.toString();
    }
}

