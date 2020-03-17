package com.songyinghui.month_B.dao;

import java.util.List;

import com.songyinghui.month_B.bean.Condition;
import com.songyinghui.month_B.bean.JiaGong;
import com.songyinghui.month_B.bean.PeiJian;

public interface BeanDao {
	/**
	 * 
	 * @Title: selects
	 * @Description: TODO 查询所有
	 * @return
	 * @return: List<JiaGong>
	 */
	public List<JiaGong> selects(Condition con);

	public List<PeiJian> getAll();

	public int insert(JiaGong jiagong);

	public JiaGong selectOne(Integer id);
}
