package com.gzst.shopping.controller;

import com.gzst.shopping.model.Brand;
import com.gzst.shopping.service.BrandService;
import com.gzst.shopping.utils.PageResult;
import com.gzst.shopping.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Resource
    private BrandService brandService;

    @RequestMapping("/showAllBrands")
    public List<Brand> showAllBrands() {
        return brandService.findAllBrands();
    }

    @RequestMapping("/findPage")
    public PageResult<Brand> findPage(Integer pageNo, Integer pageSize) {
        if (pageSize <= 0) pageSize = 10;
        if (pageNo <= 0) pageNo = 1;
        PageResult<Brand> pageResult = brandService.findPageBrands(pageNo, pageSize);
        return pageResult;
    }

    @RequestMapping("/add.do")
    public Result add(@RequestBody Brand brand){
        try {
            brandService.add(brand);
            return new Result(true,"增加成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"增加失败");

        }
    }

    @RequestMapping("/update.do")
    public Result update(@RequestBody Brand brand){
        try {
            brandService.update(brand);
            return new Result(true, "修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "修改失败");
        }
    }

    /**
     * 获取实体
     * @param id
     * @return
     */
    @RequestMapping("/findOne.do")
    public Brand findOne(Long id){
        return brandService.findOne(id);
    }


    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("/delete.do")
    public Result delete(Long [] ids){
        try {
            brandService.delete(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }
}