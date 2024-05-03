package com.entity.view;

import com.entity.DiscussjianshenxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健身项目评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-17 11:45:26
 */
@TableName("discussjianshenxiangmu")
public class DiscussjianshenxiangmuView  extends DiscussjianshenxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjianshenxiangmuView(){
	}
 
 	public DiscussjianshenxiangmuView(DiscussjianshenxiangmuEntity discussjianshenxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, discussjianshenxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
