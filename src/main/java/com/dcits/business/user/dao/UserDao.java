package com.dcits.business.user.dao;

import java.util.List;

import com.dcits.business.base.dao.BaseDao;
import com.dcits.business.user.bean.User;

public interface UserDao extends BaseDao<User>{
	
	 User login(String userName,String passWord);
	
	 void resetPasswd(Integer userId,String passwd);
	
	 void lockUser(Integer userId,String status);
	
	 User validateUsername(String username);
	
	 User validateUsername(String username,Integer userId);
	
	 void updateRealName(String realName,Integer userId);
	
	 List<User> findByRealName(String realName);
	
	
}