package view;

import dao.UserDAO;
import dto.UserDTO;

public class ChangeGenderGirl {
	public ChangeGenderGirl() {
		Joinview join = new Joinview();
		UserDAO dao = new UserDAO();
		UserDTO dto = join.getHash().get("1번");
		if (dto.getGender().equals("남자")) {
			System.out.println("이미 남자이십니다.");
		} else {
			dao.changeGenderGirl(dto);
			System.out.println("성별정보 남자로 변경!");
		}
	}
}
