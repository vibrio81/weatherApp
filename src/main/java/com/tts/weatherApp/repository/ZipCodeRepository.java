package com.tts.weatherApp.repository;


import com.tts.weatherApp.model.ZipCode;

import org.springframework.data.repository.PagingAndSortingRepository;





public interface ZipCodeRepository extends PagingAndSortingRepository<ZipCode, Long> {

}
