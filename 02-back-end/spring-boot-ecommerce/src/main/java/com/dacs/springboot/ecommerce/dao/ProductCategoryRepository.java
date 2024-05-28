package com.dacs.springboot.ecommerce.dao;

import com.dacs.springboot.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
//Spring Data REST sẽ tự động tạo các endpoint RESTful cho ProductCategory mà không cần phải viết controller riêng.
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
