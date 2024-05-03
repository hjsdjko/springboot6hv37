package com.dao;

import com.entity.DiscussjianshenxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjianshenxiangmuVO;
import com.entity.view.DiscussjianshenxiangmuView;


/**
 * 健身项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
public interface DiscussjianshenxiangmuDao extends BaseMapper<DiscussjianshenxiangmuEntity> {
	
	List<DiscussjianshenxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);
	
	DiscussjianshenxiangmuVO selectVO(@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);
	
	List<DiscussjianshenxiangmuView> selectListView(@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);

	List<DiscussjianshenxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);
	
	DiscussjianshenxiangmuView selectView(@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);
	

}
