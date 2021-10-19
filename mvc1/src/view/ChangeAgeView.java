package view;

import dao.UserDAO;

public class ChangeAgeView {
	public ChangeAgeView() {
		Joinview join = new Joinview();
		UserDAO dao = new UserDAO();
		dao.changeAge(join.getHash().get("1번"));
		System.out.println("사용자의 나이가 " + join.getHash().get("1번").getAge() + "살로 변경되었습니다.");
	}
}
