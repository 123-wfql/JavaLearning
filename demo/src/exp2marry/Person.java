package exp2marry;

public class Person {
	public String name, gender, partnername;
	public int age, marryage;
	public Person partner = null;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.partnername = "��";
	}
	public void marry (Person p) {
		if (this.partner != null) {
			System.out.println("���Ѿ�����ż�ˣ���Ҫ̫̰�ģ�");
			return;
		}
		else if (p.partner != null) {
			System.out.println("�˼��Ѿ�����ż�ˣ��±��Ӱɣ�");
			return;
		}
		else if (this.gender == p.gender) {
			System.out.println("��������ȣ�ͬ�Բ����Խ���Ŷ��");
			return;
		}
		else if (this.age <= marryage || p.age <= p.marryage) {
			System.out.println("����ģ����ǻ�С�����������ǰ��ղ�ס��");
			return;
		}
		else {
			System.out.println(this.name + "&" + p.name + ":������֪����������Ϊ�����������ѡ����¡���Ψһ���氮��\r\n"
					+ "�����ر����������ϵ���ǰ���ҽ��ҵĳ�ŵ���㣬\n"
					+ "�ҳ�ŵ������˳�������澳����ԣ��ƶ�\n"
					+ "�����򼲲������ֻ��ǳ�ҽ���Զ�������ԡ�\r\n"
					+ "�ҳ�ŵ���ҽ����ޱ����İ��㡢����Ϊ�١����㣬\n"
					+ "�������ܹ�Ӧ�����Ҫ����Σ���У������㣬�������а�ο�㣬\n"
					+ "�������������Ϲ�ͬ�ɳ��ҳ�ŵ��������Զ��ʵ����ϧ�㣬ֱ������ԶԶ��");
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
		gender = "��";
		marryage = 22;
	}
}

class Female extends Person {
	public Female(String name, int age) {
		super(name, age);
		gender = "Ů";
		marryage = 20;
	}	
}
