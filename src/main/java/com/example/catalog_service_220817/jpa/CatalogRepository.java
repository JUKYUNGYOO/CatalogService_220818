package com.example.catalog_service_220817.jpa;

import org.springframework.data.repository.CrudRepository;


public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {

        CatalogEntity findByProductId(String productId);




}

//데이터 중간 단계에서 변환, 반환 시킬 때 변환 작성 중
