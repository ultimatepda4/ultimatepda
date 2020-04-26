
package com.ultimatepda.engine.model.Google.CustomSearch;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cse_thumbnail",
    "metatags",
    "creativework",
    "sitenavigationelement",
    "person",
    "comment",
    "cse_image",
    "wpheader",
    "searchaction"
})
public class Pagemap {

    @JsonProperty("cse_thumbnail")
    private List<CseThumbnail> cseThumbnail = null;
    @JsonProperty("metatags")
    private List<Metatag> metatags = null;
    @JsonProperty("creativework")
    private List<Creativework> creativework = null;
    @JsonProperty("sitenavigationelement")
    private List<Sitenavigationelement> sitenavigationelement = null;
    @JsonProperty("person")
    private List<Person> person = null;
    @JsonProperty("comment")
    private List<Comment> comment = null;
    @JsonProperty("cse_image")
    private List<CseImage> cseImage = null;
    @JsonProperty("wpheader")
    private List<Wpheader> wpheader = null;
    @JsonProperty("searchaction")
    private List<Searchaction> searchaction = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cse_thumbnail")
    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    @JsonProperty("cse_thumbnail")
    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    @JsonProperty("metatags")
    public List<Metatag> getMetatags() {
        return metatags;
    }

    @JsonProperty("metatags")
    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    @JsonProperty("creativework")
    public List<Creativework> getCreativework() {
        return creativework;
    }

    @JsonProperty("creativework")
    public void setCreativework(List<Creativework> creativework) {
        this.creativework = creativework;
    }

    @JsonProperty("sitenavigationelement")
    public List<Sitenavigationelement> getSitenavigationelement() {
        return sitenavigationelement;
    }

    @JsonProperty("sitenavigationelement")
    public void setSitenavigationelement(List<Sitenavigationelement> sitenavigationelement) {
        this.sitenavigationelement = sitenavigationelement;
    }

    @JsonProperty("person")
    public List<Person> getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(List<Person> person) {
        this.person = person;
    }

    @JsonProperty("comment")
    public List<Comment> getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    @JsonProperty("cse_image")
    public List<CseImage> getCseImage() {
        return cseImage;
    }

    @JsonProperty("cse_image")
    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    @JsonProperty("wpheader")
    public List<Wpheader> getWpheader() {
        return wpheader;
    }

    @JsonProperty("wpheader")
    public void setWpheader(List<Wpheader> wpheader) {
        this.wpheader = wpheader;
    }

    @JsonProperty("searchaction")
    public List<Searchaction> getSearchaction() {
        return searchaction;
    }

    @JsonProperty("searchaction")
    public void setSearchaction(List<Searchaction> searchaction) {
        this.searchaction = searchaction;
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
