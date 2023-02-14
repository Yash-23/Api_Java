package com.example.helloworld.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
@EnableJpaRepositories
public interface RepositoryClass extends JpaRepository<Data, String> {
    @Query("SELECT d FROM Data d WHERE d.search_id = (:search_id) AND d.request_type = (:request_type)")
    Iterable<Data> findAllByIdAndRequestType(String search_id, String request_type);

    @Query("SELECT d FROM Data d WHERE d.search_id = (:search_id)")
    Iterable<Data> findAllBySearchId(String search_id);
}
