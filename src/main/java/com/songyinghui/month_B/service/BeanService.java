package com.songyinghui.month_B.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.songyinghui.month_B.bean.Condition;
import com.songyinghui.month_B.bean.JiaGong;
import com.songyinghui.month_B.bean.PeiJian;

public interface BeanService {

	PageInfo<JiaGong> list(Condition con, Integer page, Integer pageSize);

	List<PeiJian> getAll();

	int insert(JiaGong jiagong);

	JiaGong selectOne(Integer id);

}
