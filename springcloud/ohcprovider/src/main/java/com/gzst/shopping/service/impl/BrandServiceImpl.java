package com.gzst.shopping.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.gzst.shopping.dao.BrandDao;
import com.gzst.shopping.model.Brand;
import com.gzst.shopping.service.BrandService;
import com.gzst.shopping.utils.PageResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;
    @Override
    public List<Brand>  findAllBrands() {
        return brandDao.findAllBrands();
    }

    @Override
    public PageResult<Brand> findPageBrands(Integer pageNo, Integer pageSize){
        PageHelper.startPage(pageNo,pageSize);
        Page<Brand> page=(Page<Brand>)brandDao.findAllBrands();
        PageResult<Brand> pageResult=new PageResult<>(page.getTotal(),page.getResult());
        return pageResult;
    }

    @Override
    public void add(Brand brand) {
        brandDao.insert(brand);
    }


    @Override
    public void update(Brand brand) {
        brandDao.updateByPrimaryKey(brand);
    }

    @Override
    public Brand findOne(Long id) {
        return brandDao.selectByPrimaryKey(id);
    }

    @Override
    public void delete(Long[] ids) {
        for(Long id:ids){
            brandDao.deleteByPrimaryKey(id);
        }
    }
}
