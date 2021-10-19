package dao;

import dto.UserDTO;

public class UserDAO {
	public void changeName(UserDTO dto) {
		dto.setName("★" + dto.getName() + "★");
	}
	
	public void changeAge(UserDTO dto) {
		dto.setAge(1);
	}
	public void changeGenderMan(UserDTO dto) {
		dto.setGender("여자"); 
	}
	public void changeGenderGirl(UserDTO dto) {
		dto.setGender("남자");
	}
}
