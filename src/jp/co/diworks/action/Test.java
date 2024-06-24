package jp.co.diworks.action;

public class Test {

	public static void main(String[] args) {

		Person taro = new Person();
		taro.name = "山田　太郎";
		taro.age = 20;
		taro.phoneNumber = "010-1111-1111";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println(" ");

		Person jiro = new Person();
		jiro.name = "木村　次郎";
		jiro.age = 18;
		jiro.phoneNumber = "020-2222-2222";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		jiro.talk();
		jiro.walk();
		jiro.run();

		System.out.println(" ");

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "030-3333-3333";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		hanako.talk();
		hanako.walk();
		hanako.run();

		System.out.println(" ");

		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		System.out.println(" ");

		Robot asimo = new Robot();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		System.out.println(" ");

		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
