package com.dawn.springjpah2.service;

import com.dawn.springjpah2.entity.DptStatusDescription;
import com.dawn.springjpah2.repository.DptDescriptionRepository;
import org.springframework.stereotype.Service;

@Service
public class DptDescriptionImpl {

    private DptDescriptionRepository dptDescriptionRepository;

    public DptDescriptionImpl(DptDescriptionRepository dptDescriptionRepository) {
        this.dptDescriptionRepository = dptDescriptionRepository;
    }

    public String getDescription(int statusCode, int languageCode){
        DptStatusDescription dptStatusDescription = dptDescriptionRepository.findByStatusCodeAndLanguageCode(statusCode, languageCode);
        return dptStatusDescription.getDescription();
    }
}
