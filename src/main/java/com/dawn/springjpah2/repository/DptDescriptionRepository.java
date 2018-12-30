package com.dawn.springjpah2.repository;

import com.dawn.springjpah2.entity.DptStatusDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DptDescriptionRepository extends JpaRepository<DptStatusDescription, Integer> {
    DptStatusDescription findByStatusCodeAndLanguageCode(int statusCode, int languageCode);
}
