package com.hcl.apiautomationtest.models;

public class NaceDetailResponse {

    private  String id;

    private  String level;

    private  String code;

    private  String parent;

    private  String description;

    private  String thisItemInclude;

    private String thisItemAlsoIncludes;

    private String rulings;

    private String thisItemExcludes;

    private String reference;

    private  boolean ok;

    public void setId(String id) {
        this.id = id;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public String getId() {
        return id;
    }

    public boolean isOk() {
        return ok;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThisItemInclude() {
        return thisItemInclude;
    }

    public void setThisItemInclude(String thisItemInclude) {
        this.thisItemInclude = thisItemInclude;
    }

    public String getThisItemAlsoIncludes() {
        return thisItemAlsoIncludes;
    }

    public void setThisItemAlsoIncludes(String thisItemAlsoIncludes) {
        this.thisItemAlsoIncludes = thisItemAlsoIncludes;
    }

    public String getRulings() {
        return rulings;
    }

    public void setRulings(String rulings) {
        this.rulings = rulings;
    }

    public String getThisItemExcludes() {
        return thisItemExcludes;
    }

    public void setThisItemExcludes(String thisItemExcludes) {
        this.thisItemExcludes = thisItemExcludes;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
