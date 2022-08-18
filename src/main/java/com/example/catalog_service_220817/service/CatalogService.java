package com.example.catalog_service_220817.service;

import com.example.catalog_service_220817.jpa.CatalogEntity;

public interface CatalogService{

    Iterable<CatalogEntity> getAllCatalogs();
//    실제 구현체는 CatalogServiceImpl클래스에 구현되어 있음.

}
