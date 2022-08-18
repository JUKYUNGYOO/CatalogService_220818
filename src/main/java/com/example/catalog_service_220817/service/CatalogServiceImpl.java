package com.example.catalog_service_220817.service;


import com.example.catalog_service_220817.jpa.CatalogEntity;
import com.example.catalog_service_220817.jpa.CatalogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Data
@Service
@Slf4j
public class CatalogServiceImpl implements CatalogService{


    CatalogRepository catalogRepository;


    @Autowired
    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public Iterable<CatalogEntity> getAllCatalogs(){
        return catalogRepository.findAll();
    }


}
