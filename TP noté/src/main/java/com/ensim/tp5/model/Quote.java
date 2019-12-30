package com.ensim.tp5.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Quote {
	@Id
    private String type;
    private String version;
    ArrayList<Features> features = new ArrayList<Features> ();
    private String attribution;
    private String licence;
    private String query;
    private int limit;



    
    public String getAttribution() {
		return attribution;
	}

	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

	public ArrayList<Features> getFeatures() {
		return features;
	}

	public void setFeatures(ArrayList<Features> features) {
		this.features = features;
	}

	public void setVersion(String version) {
		this.version = version;
	}

    
   
}