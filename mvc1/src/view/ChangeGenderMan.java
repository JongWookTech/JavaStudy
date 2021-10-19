package view;

import dao.UserDAO;
import dto.UserDTO;

public class ChangeGenderMan {
	public ChangeGenderMan() {
		Joinview join = new Joinview();
		UserDAO dao = new UserDAO();
		UserDTO dto = join.getHash().get("1번");
		if(dto.getGender().equals("여자")) {
			System.out.println("이미 여자이십니다.");
		} else {
			dao.changeGenderMan(dto);
			System.out.println("성별정보 여자로 변경!");
		}
	}
}
