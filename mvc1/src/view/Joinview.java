package view;

import java.util.HashMap;
import java.util.Scanner;

import dto.UserDTO;

public class Joinview {
	private static HashMap<String, UserDTO> hash = new HashMap<>();
	
	public HashMap<String, UserDTO> getHash() {
		return hash;
	}

	public static void setHash(HashMap<String, UserDTO> hash) {
		Joinview.hash = hash;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("해보자 코딩에 어서오세요");
		System.out.println("이름을 입력하여 주세요");
		String name = sc.next();
		System.out.println("나이를 입력하여 주세요");
		int age = sc.nextInt();
		while (true) {
			System.out.println("성별을 입력하여 주세요");
			String gender = sc.next();
			if (!gender.equals("남자") && !gender.equals("여자")) {
				continue;
			} else {
				UserDTO dto = new UserDTO(name, age, gender);
				hash.put("1번", dto);
				break;
			}
		}

		System.out.println("사용자에 대한 정보를 입력받았습니다.");
		while (true) {
			System.out
					.println("어떠한 기능을 원하십니까?\n1. 사용자의 이름을 멋있게 수정한다.\n2. 나이를 1살로 만든다.\n3. 나는 사실 남자이다.\n4. 나는 사실 여자이다.");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				new ChangeNameView();
				break;
			case 2:
				new ChangeAgeView();
				break;
			case 3:
				new ChangeGenderGirl();
				break;
			case 4:
				new ChangeGenderMan();
				break;
			default:
				break;
			}
		}

	}
}
