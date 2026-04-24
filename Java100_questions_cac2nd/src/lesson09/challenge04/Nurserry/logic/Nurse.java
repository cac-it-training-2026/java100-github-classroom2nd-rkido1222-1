package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void takeTemperature(NurserySchoolChild child) throws CriticalConditionException {//ここでエラーを拾って投げてる

		if (child.getTemperature() < 38) {
			System.out.println(child.getName() + "の体温は" + child.getTemperature() + "度です。\n");
		} else {
			System.out.println(child.getName() + "は重体です。\n\nすぐに病院に行ってください");
			throw new CriticalConditionException();//エラーの発生元

		}

	}

}
