package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO <String, UserDTO>{ //GENERIC떄꺼를 가져와라

	@Override
	public void insert(UserDTO v) {
	     System.out.println(v.getId()+"님이 저장되었습니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String k) {
		System.out.println(k+"님이 삭제 됩니다.");
		
	}

	@Override
	public void update(UserDTO v) {
		  System.out.println(v.getId()+"님의 정보가 수정되었습니다.");
		
	}  

}
