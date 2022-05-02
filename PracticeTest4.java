package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeTest4 {

	public static void main(String args[]) {

		System.out.println("問題1");
		List<String> animals = new ArrayList<String>();

		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");

		System.out.println(animals);

		String animal = "猫";

		if(animals.contains(animal)) {
			System.out.println(animal + "はリストに含まれています。");
		} else {
			System.out.println(animal + "はリストに含まれていません。");
		}



		System.out.println("問題2");
		int myBirth = 10;

		switch(myBirth) {
		case 1:
			System.out.println("1月　元旦,成人の日");
			break;

		case 2:
			System.out.println("2月　建国記念日の日,天皇誕生日");
			break;

		case 3:
			System.out.println("3月　春分の日");
			break;

		case 4:
			System.out.println("4月　昭和の日");
			break;

		case 5:
			System.out.println("5月　憲法記念日,みどりの日,こどもの日");
			break;

		case 6:
			System.out.println("6月　なし");
			break;

		case 7:
			System.out.println("7月　海の日,スポーツの日");
			break;

		case 8:
			System.out.println("8月　山の日");
			break;

		case 9:
			System.out.println("9月　敬老の日,秋分の日");
			break;

		case 10:
			System.out.println("10月　なし");
			break;

		case 11:
			System.out.println("11月　文化の日,勤労感謝の日");
			break;

		case 12:
			System.out.println("12月　なし");
			break;
		}

	}

}
