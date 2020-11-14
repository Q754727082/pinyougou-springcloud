package com.gzst.shopping.service;


import com.gzst.shopping.model.Brand;
import com.gzst.shopping.utils.PageResult;

import java.util.List;

public interface BrandService {
    public List<Brand> findAllBrands();
    public PageResult<Brand> findPageBrands(Integer pageNo, Integer pageSize);
    public void add(Brand brand);
    public void update(Brand brand);
    public Brand findOne(Long id);
    public void delete(Long []ids);
}
