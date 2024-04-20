package com.easynotes.model.service;

import com.easynotes.model.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mightyloot
 * */
@Service
public class UrlService {
    private UrlRepository urlRepository;

    @Autowired
    private void setDependencies(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }
}
