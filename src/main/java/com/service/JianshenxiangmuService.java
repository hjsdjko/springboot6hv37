package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianshenxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianshenxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianshenxiangmuView;


/**
 * 健身项目
 *
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
public interface JianshenxiangmuService extends IService<JianshenxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianshenxiangmuVO> selectListVO(Wrapper<JianshenxiangmuEntity> wrapper);
   	
   	JianshenxiangmuVO selectVO(@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);
   	
   	List<JianshenxiangmuView> selectListView(Wrapper<JianshenxiangmuEntity> wrapper);
   	
   	JianshenxiangmuView selectView(@Param("ew") Wrapper<JianshenxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianshenxiangmuEntity> wrapper);
   	

}

