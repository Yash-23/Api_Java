package com.example.helloworld.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
    private static RepositoryClass repositoryClass;
    @Autowired
    public Services(RepositoryClass repositoryClass) {
        this.repositoryClass = repositoryClass;
    }
    public static Iterable<Data> get() {
        return repositoryClass.findAll();
    }
    public Iterable<Data> getAllByID(String search_id) {
        return repositoryClass.findAllBySearchId(search_id);
    }
    public Iterable<Data> getAll(String search_id, String request_type) {
        return repositoryClass.findAllByIdAndRequestType(search_id,request_type);
    }
}
