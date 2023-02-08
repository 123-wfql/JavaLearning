package exp2marry;

public class Person {
	public String name, gender, partnername;
	public int age, marryage;
	public Person partner = null;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.partnername = "无";
	}
	public void marry (Person p) {
		if (this.partner != null) {
			System.out.println("你已经有配偶了，不要太贪心！");
			return;
		}
		else if (p.partner != null) {
			System.out.println("人家已经有配偶了，下辈子吧！");
			return;
		}
		else if (this.gender == p.gender) {
			System.out.println("在这个国度，同性不可以结婚的哦！");
			return;
		}
		else if (this.age <= marryage || p.age <= p.marryage) {
			System.out.println("听叔的，你们还小，结婚的事你们把握不住！");
			return;
		}
		else {
			System.out.println(this.name + "&" + p.name + ":我内心知道，您将成为我终生的朋友、伴侣、我唯一的真爱。\r\n"
					+ "在这特别的日子里，在上帝面前，我将我的承诺给你，\n"
					+ "我承诺无论是顺境或是逆境、富裕或贫穷、\n"
					+ "健康或疾病、快乐或忧愁，我将永远在你身旁。\r\n"
					+ "我承诺，我将毫无保留的爱你、以你为荣、尊敬你，\n"
					+ "尽我所能供应你的需要，在危难中，保护你，在忧伤中安慰你，\n"
					+ "与你在身心灵上共同成长我承诺将对你永远忠实，疼惜你，直到永永远远。");
			this.partner = p;
			p.partner = this;
			this.partnername = p.name;
			p.partnername = this.name;
			return;
		}	
	}
}

class Male extends Person {
	public Male(String name, int age) {
		super(name, age);
		gender = "男";
		marryage = 22;
	}
}

class Female extends Person {
	public Female(String name, int age) {
		super(name, age);
		gender = "女";
		marryage = 20;
	}	
}
