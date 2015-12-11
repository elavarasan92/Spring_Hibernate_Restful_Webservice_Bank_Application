package com.elaq.test;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "modelid",
    "display",
    "value",
    "amount"
})
public class Value {

    @JsonProperty("modelid")
    private Integer modelid;
    @JsonProperty("display")
    private String display;
    @JsonProperty("value")
    private String value;
    @JsonProperty("amount")
    private String amount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The modelid
     */
    @JsonProperty("modelid")
    public Integer getModelid() {
        return modelid;
    }

    /**
     * 
     * @param modelid
     *     The modelid
     */
    @JsonProperty("modelid")
    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    /**
     * 
     * @return
     *     The display
     */
    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    /**
     * 
     * @param display
     *     The display
     */
    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(modelid).append(display).append(value).append(amount).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Value) == false) {
            return false;
        }
        Value rhs = ((Value) other);
        return new EqualsBuilder().append(modelid, rhs.modelid).append(display, rhs.display).append(value, rhs.value).append(amount, rhs.amount).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

