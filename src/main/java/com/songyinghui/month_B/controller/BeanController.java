package com.songyinghui.month_B.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.songyinghui.month_B.bean.Condition;
import com.songyinghui.month_B.bean.JiaGong;
import com.songyinghui.month_B.bean.PeiJian;
import com.songyinghui.month_B.service.BeanService;

@Controller
public class BeanController {
	@Resource
	private BeanService service;

	@RequestMapping("list")
	public String list(Condition con, Model model, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "3") Integer pageSize) {
		PageInfo<JiaGong> info = service.list(con, page, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("con", con);
		return "list";

	}

	@RequestMapping("add")
	public String add() {
		return "add";
	}

	@RequestMapping("getAll")
	@ResponseBody
	public List<PeiJian> getAll() {
		return service.getAll();
	}

	@PostMapping("publish")
	@ResponseBody
	public boolean publish(JiaGong jiagong, MultipartFile file) throws IllegalStateException, IOException {
		if (null != file && !file.isEmpty()) {
			String path = "d:/pic/";
			// 文件原始名
			String originalFilename = file.getOriginalFilename();
			// 文件的新名字
			String newName = UUID.randomUUID().toString()
					+ originalFilename.substring(originalFilename.lastIndexOf("."));
			File f = new File(path, newName);
			file.transferTo(f);
			jiagong.setPicture(newName);
		}
		return service.insert(jiagong) > 0;
	}
	@RequestMapping("updateOne")
	@ResponseBody
	public boolean updateone(JiaGong jiagong) {
		return true;
	}

	@RequestMapping("update")
	public String update(Model model,Integer id) {
        JiaGong jiagong= service.selectOne(id);
		model.addAttribute("jiagong", jiagong);
		return "update";
	}
	
}
