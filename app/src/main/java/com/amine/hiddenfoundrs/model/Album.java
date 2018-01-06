package com.amine.hiddenfoundrs.model;

import java.io.Serializable;

/**
 * Created by AMINE on 28/11/2017.
 */

public class Album implements Serializable {
    private String id,source;

    public Album(String id, String source) {
        this.id = id;
        this.source = source;
    }

    public Album() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
