package view;

import dao.UserDAO;

public class ChangeNameView {
	public ChangeNameView() {
		Joinview join = new Joinview();
		UserDAO dao = new UserDAO();
		dao.changeName(join.getHash().get("1번"));
		System.out.println(join.getHash().get("1번").getName() + "으로 변경되었습니다.");
	}
}
