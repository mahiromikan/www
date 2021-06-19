import java.time.*;


public class Task2 {

	public static void main(String[] args) {
		//1
		String greeting = "HelloWorld";
		System.out.println(greeting);
		//2
		int a = 0;
		for (int i = 1; i < 11; i++) {
			a += i;
		}
		System.out.println(a);
		//3
		LocalDateTime t1 = LocalDateTime.now();
		LocalDateTime t2 = t1.plusYears(3);
		DayOfWeek t3
    		= DayOfWeek.from(t2);
		System.out.println(t3);
		//4
		System.out.println("引数が０なら偽。引数が１なら真");
		int name = new java.util.Random().nextInt(2);
		if (name == 1) {
		} else if (name == 0) {
		} else {
		}
		//5
		List<String> vivibas = new ArrayList<String>();
		vivibas.addAll(Arrays.asList("小豆沢こはね",
				"白石杏", "東雲彰人", "青柳冬弥"));
		for (String v : vivibas) {
			System.out.println(v);
		}
	}
}
