package com.tts.weatherApp.repository;


import com.tts.weatherApp.model.ZipCode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ZipCodeRepository extends CrudRepository<ZipCode, Long> {
    List<ZipCode> findAll();
//    ZipCode findById(long id);

}
