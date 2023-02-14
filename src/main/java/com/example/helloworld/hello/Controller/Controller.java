package com.example.helloworld.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {


    private Services services;
    @Autowired
    public Controller(Services services) {
        this.services = services;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/data")
    public Iterable<Data> get() {
        return services.get();
    }

    @RequestMapping(value = "/data/srcs", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Data> getAllById(@RequestParam(value = "search_id") String search_id) {
        return services.getAllByID(search_id);
    }

    @RequestMapping(value = "/data/src", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Data> getAll(@RequestParam(value = "search_id") String search_id, @RequestParam(value= "request_type") String request_type) {
        return services.getAll(search_id, request_type);
    }
}

class Test{
    String search_id;
    String request_xml;

    public String getSearch_id() {
        return search_id;
    }

    public void setSearch_id(String id) {
        this.search_id = search_id;
    }

    public String getRequest_xml() {
        return request_xml;
    }

    public void setRequest_xml(String request_xml) {
        this.request_xml = request_xml;
    }
}

