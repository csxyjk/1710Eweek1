package com.bw.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author 作者:SYk
 * @version 创建时间：2019年12月29日 下午8:03:07 类功能说明
 */
@Controller
public class GoodsController {

	@Autowired
	private GoodsService gService;

	// 查找所有数据
	@RequestMapping("findAll.do")
	public ModelAndView findAll(@RequestParam(defaultValue = "1") int pageNow) {
		PageHelper.startPage(pageNow, 3);
		ModelAndView mv = new ModelAndView("show");
		List<Goods> list = gService.findAll();
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		mv.addObject("list", list);
		mv.addObject("page", page);
		return mv;

	}

	@RequestMapping("toAdd.do")
	public String toAdd() {
		return "add";
	}

	@RequestMapping("findBrand.do")
	@ResponseBody
	public List<Brand> findBrand() {
		List<Brand> list = gService.findBrand();
		return list;
	}

	@RequestMapping("findType.do")
	@ResponseBody
	public List<Type> findType() {
		List<Type> list = gService.findType();
		return list;
	}

	@RequestMapping("add.do")
	public void add(Goods goods, MultipartFile file) throws Exception {
		System.out.println(goods);
		if (null != file && !file.isEmpty()) {
			String path = "F:/upload/";
			String oldFileName = file.getOriginalFilename();
			String filename = UUID.randomUUID() + oldFileName.substring(oldFileName.lastIndexOf("."));
			File file2 = new File(path, filename);
			file.transferTo(file2);
			goods.setPic(filename);
		}
		gService.add(goods);
	}

}
