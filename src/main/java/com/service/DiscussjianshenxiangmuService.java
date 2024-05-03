package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjianshenxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjianshenxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjianshenxiangmuView;


/**
 * 健身项目评论表
 *
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
public interface DiscussjianshenxiangmuService extends IService<DiscussjianshenxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjianshenxiangmuVO> selectListVO(Wrapper<DiscussjianshenxiangmuEntity> wrapper);
   	
   	DiscussjianshenxiangmuVO selectVO(@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);
   	
   	List<DiscussjianshenxiangmuView> selectListView(Wrapper<DiscussjianshenxiangmuEntity> wrapper);
   	
   	DiscussjianshenxiangmuView selectView(@Param("ew") Wrapper<DiscussjianshenxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjianshenxiangmuEntity> wrapper);
   	

}

