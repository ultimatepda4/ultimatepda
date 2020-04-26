
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
    "query-input",
    "target"
})
public class Searchaction {

    @JsonProperty("query-input")
    private String queryInput;
    @JsonProperty("target")
    private String target;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("query-input")
    public String getQueryInput() {
        return queryInput;
    }

    @JsonProperty("query-input")
    public void setQueryInput(String queryInput) {
        this.queryInput = queryInput;
    }

    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
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
