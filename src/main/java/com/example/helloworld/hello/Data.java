package com.example.helloworld.hello;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "yatra", name = "fare_rule")
public class Data{

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "search_id")
    private String search_id;

    @Column(name = "cache_key")
    private String cache_key;

    @Column(name = "request_xml")
    private String request_xml;

    @Column(name = "request_type")
    private String request_type;

    public Data() {
    }

    public Data(String search_id, String cache_key, String request_xml, String request_type) {
        this.search_id = search_id;
        this.cache_key = cache_key;
        this.request_xml = request_xml;
        this.request_type = request_type;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSearch_id() {
        return search_id;
    }
    public void setSearch_id(String search_id) {
        this.search_id = search_id;
    }
    public String getRequest_xml() {
        return request_xml;
    }
    public void setRequest_xml(String request_xml) {
        this.request_xml = request_xml;
    }
    public String getRequest_type() {
        return request_type;
    }
    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }
    public String getCache_key() {
        return cache_key;
    }
    public void setCache_key(String cache_key) {
        this.cache_key = cache_key;
    }
}
