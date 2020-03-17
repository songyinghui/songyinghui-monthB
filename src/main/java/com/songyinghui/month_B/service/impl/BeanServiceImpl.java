package com.songyinghui.month_B.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.songyinghui.month_B.bean.Condition;
import com.songyinghui.month_B.bean.JiaGong;
import com.songyinghui.month_B.bean.PeiJian;
import com.songyinghui.month_B.dao.BeanDao;
import com.songyinghui.month_B.service.BeanService;
@Service
public class BeanServiceImpl implements BeanService{
 @Autowired
   private BeanDao dao;

@Override
public PageInfo<JiaGong> list(Condition con, Integer page, Integer pageSize) {
	// TODO Auto-generated method stub
	PageHelper.startPage(page, pageSize);
	List<JiaGong> list = dao.selects(con);
	return new PageInfo<JiaGong>(list);
}

@Override
public List<PeiJian> getAll() {
	// TODO Auto-generated method stub
	return dao.getAll();
}

@Override
public int insert(JiaGong jiagong) {
	// TODO Auto-generated method stub
	return dao.insert(jiagong);
}

@Override
public JiaGong selectOne(Integer id) {
	// TODO Auto-generated method stub
	return dao.selectOne(id);
}
 
}
