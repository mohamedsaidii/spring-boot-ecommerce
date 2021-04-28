package com.luv2code.springbootecommerce.dao;

import com.luv2code.springbootecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
// nrak7o isem json=productCategory w path bch nacceder lil path how path=product-category
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
