package com.gzst.shopping.dao;

import com.gzst.shopping.model.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 品牌数据库操作
 */
@Mapper
public interface BrandDao {
    public List<Brand> findAllBrands();
    public void insert(Brand brand);
    public void updateByPrimaryKey(Brand brand);
    public Brand selectByPrimaryKey(Long id);
    public void deleteByPrimaryKey(Long id);
}
