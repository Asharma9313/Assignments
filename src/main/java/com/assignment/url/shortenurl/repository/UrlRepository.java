package com.assignment.url.shortenurl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.url.shortenurl.model.Url;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long>{

}
