package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjianshenxiangmuDao;
import com.entity.DiscussjianshenxiangmuEntity;
import com.service.DiscussjianshenxiangmuService;
import com.entity.vo.DiscussjianshenxiangmuVO;
import com.entity.view.DiscussjianshenxiangmuView;

@Service("discussjianshenxiangmuService")
public class DiscussjianshenxiangmuServiceImpl extends ServiceImpl<DiscussjianshenxiangmuDao, DiscussjianshenxiangmuEntity> implements DiscussjianshenxiangmuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjianshenxiangmuEntity> page = this.selectPage(
                new Query<DiscussjianshenxiangmuEntity>(params).getPage(),
                new EntityWrapper<DiscussjianshenxiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjianshenxiangmuEntity> wrapper) {
		  Page<DiscussjianshenxiangmuView> page =new Query<DiscussjianshenxiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjianshenxiangmuVO> selectListVO(Wrapper<DiscussjianshenxiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjianshenxiangmuVO selectVO(Wrapper<DiscussjianshenxiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjianshenxiangmuView> selectListView(Wrapper<DiscussjianshenxiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjianshenxiangmuView selectView(Wrapper<DiscussjianshenxiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
