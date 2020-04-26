
package com.ultimatepda.engine.model.Google.CustomSearch;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "viewport",
    "twitter:card",
    "twitter:title",
    "twitter:description",
    "twitter:image",
    "twitter:site",
    "twitter:creator",
    "og:locale",
    "og:type",
    "og:title",
    "og:description",
    "og:url",
    "og:site_name",
    "article:publisher",
    "article:tag",
    "article:section",
    "article:published_time",
    "article:modified_time",
    "og:updated_time",
    "og:image",
    "og:image:secure_url",
    "og:image:width",
    "og:image:height",
    "og:image:alt",
    "msapplication-tileimage"
})
public class Metatag {

    @JsonProperty("viewport")
    private String viewport;
    @JsonProperty("twitter:card")
    private String twitterCard;
    @JsonProperty("twitter:title")
    private String twitterTitle;
    @JsonProperty("twitter:description")
    private String twitterDescription;
    @JsonProperty("twitter:image")
    private String twitterImage;
    @JsonProperty("twitter:site")
    private String twitterSite;
    @JsonProperty("twitter:creator")
    private String twitterCreator;
    @JsonProperty("og:locale")
    private String ogLocale;
    @JsonProperty("og:type")
    private String ogType;
    @JsonProperty("og:title")
    private String ogTitle;
    @JsonProperty("og:description")
    private String ogDescription;
    @JsonProperty("og:url")
    private String ogUrl;
    @JsonProperty("og:site_name")
    private String ogSiteName;
    @JsonProperty("article:publisher")
    private String articlePublisher;
    @JsonProperty("article:tag")
    private String articleTag;
    @JsonProperty("article:section")
    private String articleSection;
    @JsonProperty("article:published_time")
    private String articlePublishedTime;
    @JsonProperty("article:modified_time")
    private String articleModifiedTime;
    @JsonProperty("og:updated_time")
    private String ogUpdatedTime;
    @JsonProperty("og:image")
    private String ogImage;
    @JsonProperty("og:image:secure_url")
    private String ogImageSecureUrl;
    @JsonProperty("og:image:width")
    private String ogImageWidth;
    @JsonProperty("og:image:height")
    private String ogImageHeight;
    @JsonProperty("og:image:alt")
    private String ogImageAlt;
    @JsonProperty("msapplication-tileimage")
    private String msapplicationTileimage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("viewport")
    public String getViewport() {
        return viewport;
    }

    @JsonProperty("viewport")
    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    @JsonProperty("twitter:card")
    public String getTwitterCard() {
        return twitterCard;
    }

    @JsonProperty("twitter:card")
    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    @JsonProperty("twitter:title")
    public String getTwitterTitle() {
        return twitterTitle;
    }

    @JsonProperty("twitter:title")
    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    @JsonProperty("twitter:description")
    public String getTwitterDescription() {
        return twitterDescription;
    }

    @JsonProperty("twitter:description")
    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    @JsonProperty("twitter:image")
    public String getTwitterImage() {
        return twitterImage;
    }

    @JsonProperty("twitter:image")
    public void setTwitterImage(String twitterImage) {
        this.twitterImage = twitterImage;
    }

    @JsonProperty("twitter:site")
    public String getTwitterSite() {
        return twitterSite;
    }

    @JsonProperty("twitter:site")
    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    @JsonProperty("twitter:creator")
    public String getTwitterCreator() {
        return twitterCreator;
    }

    @JsonProperty("twitter:creator")
    public void setTwitterCreator(String twitterCreator) {
        this.twitterCreator = twitterCreator;
    }

    @JsonProperty("og:locale")
    public String getOgLocale() {
        return ogLocale;
    }

    @JsonProperty("og:locale")
    public void setOgLocale(String ogLocale) {
        this.ogLocale = ogLocale;
    }

    @JsonProperty("og:type")
    public String getOgType() {
        return ogType;
    }

    @JsonProperty("og:type")
    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    @JsonProperty("og:title")
    public String getOgTitle() {
        return ogTitle;
    }

    @JsonProperty("og:title")
    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    @JsonProperty("og:description")
    public String getOgDescription() {
        return ogDescription;
    }

    @JsonProperty("og:description")
    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    @JsonProperty("og:url")
    public String getOgUrl() {
        return ogUrl;
    }

    @JsonProperty("og:url")
    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    @JsonProperty("og:site_name")
    public String getOgSiteName() {
        return ogSiteName;
    }

    @JsonProperty("og:site_name")
    public void setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName;
    }

    @JsonProperty("article:publisher")
    public String getArticlePublisher() {
        return articlePublisher;
    }

    @JsonProperty("article:publisher")
    public void setArticlePublisher(String articlePublisher) {
        this.articlePublisher = articlePublisher;
    }

    @JsonProperty("article:tag")
    public String getArticleTag() {
        return articleTag;
    }

    @JsonProperty("article:tag")
    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
    }

    @JsonProperty("article:section")
    public String getArticleSection() {
        return articleSection;
    }

    @JsonProperty("article:section")
    public void setArticleSection(String articleSection) {
        this.articleSection = articleSection;
    }

    @JsonProperty("article:published_time")
    public String getArticlePublishedTime() {
        return articlePublishedTime;
    }

    @JsonProperty("article:published_time")
    public void setArticlePublishedTime(String articlePublishedTime) {
        this.articlePublishedTime = articlePublishedTime;
    }

    @JsonProperty("article:modified_time")
    public String getArticleModifiedTime() {
        return articleModifiedTime;
    }

    @JsonProperty("article:modified_time")
    public void setArticleModifiedTime(String articleModifiedTime) {
        this.articleModifiedTime = articleModifiedTime;
    }

    @JsonProperty("og:updated_time")
    public String getOgUpdatedTime() {
        return ogUpdatedTime;
    }

    @JsonProperty("og:updated_time")
    public void setOgUpdatedTime(String ogUpdatedTime) {
        this.ogUpdatedTime = ogUpdatedTime;
    }

    @JsonProperty("og:image")
    public String getOgImage() {
        return ogImage;
    }

    @JsonProperty("og:image")
    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    @JsonProperty("og:image:secure_url")
    public String getOgImageSecureUrl() {
        return ogImageSecureUrl;
    }

    @JsonProperty("og:image:secure_url")
    public void setOgImageSecureUrl(String ogImageSecureUrl) {
        this.ogImageSecureUrl = ogImageSecureUrl;
    }

    @JsonProperty("og:image:width")
    public String getOgImageWidth() {
        return ogImageWidth;
    }

    @JsonProperty("og:image:width")
    public void setOgImageWidth(String ogImageWidth) {
        this.ogImageWidth = ogImageWidth;
    }

    @JsonProperty("og:image:height")
    public String getOgImageHeight() {
        return ogImageHeight;
    }

    @JsonProperty("og:image:height")
    public void setOgImageHeight(String ogImageHeight) {
        this.ogImageHeight = ogImageHeight;
    }

    @JsonProperty("og:image:alt")
    public String getOgImageAlt() {
        return ogImageAlt;
    }

    @JsonProperty("og:image:alt")
    public void setOgImageAlt(String ogImageAlt) {
        this.ogImageAlt = ogImageAlt;
    }

    @JsonProperty("msapplication-tileimage")
    public String getMsapplicationTileimage() {
        return msapplicationTileimage;
    }

    @JsonProperty("msapplication-tileimage")
    public void setMsapplicationTileimage(String msapplicationTileimage) {
        this.msapplicationTileimage = msapplicationTileimage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
