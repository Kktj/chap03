package class26.exam04;

public class StudentMain {
	public static void main(String[] args) {
		
	
	
	Student[] arrStd = new Student[5];
	arrStd[0] = new Student("김홍철" , 23 , '남' , "010-2340-1233" , 85);
	arrStd[1] = new Student("정순미" , 24 , '여' , "010-9857-7532" , 70);
	arrStd[2] = new Student("이만섭" , 22 , '남' , "010-6548-4687" , 96);
	arrStd[3] = new Student("최주호" , 20 , '남' , "010-2528-9368" , 85);
	arrStd[4] = new Student("고미림" , 26 , '여' , "010-1068-2549" , 77);
	
	int sum = 0;
	double avg = 0.0;
	System.out.println("================================================");
	System.out.println(" name   age   gender     phone    score");
	System.out.println("------------------------------------------------");
	for (int i = 0; i < arrStd.length; i++) {
		System.out.println(arrStd[i].name + "\t" + arrStd[i].age + "\t" + arrStd[i].gender + "\t" + arrStd[i].phone + "\t" + arrStd[i].score);
		sum = sum + arrStd[i].score;
	}
	System.out.println("=================================================");
	
	avg = (sum * 1.0) / arrStd.length;
	System.out.println("총 인원 : " + arrStd.length);
	System.out.printf("평균 점수 : %.2f \n" , avg);
	
	int max = 0;
	String maxName = "";
	for (int i = 0; i < arrStd.length; i++) {
		if (arrStd[i].score > max) {
			max = arrStd[i].score;
			maxName = arrStd[i].name;
			
		}
	}
	System.out.println("최고 점수는 : " + max + "점 이며 최고점의 학생은 : " + maxName + "님 입니다.");
	System.out.println();
	
	sum = 0;
	avg = 0.0;
	max = 0;
	maxName = "";
	System.out.println("================================================");
	System.out.println(" name   age   gender     phone    score");
	System.out.println("------------------------------------------------");
	for (Student std : arrStd) {
		System.out.println(std.showStudentInfo());
		sum = sum + std.score;
		if (std.score > max) {
			max = std.score;
			maxName = std.name;
			
			
			
		}
	}
	System.out.println("=================================================");
	avg = (sum * 1.0) / arrStd.length;
	System.out.println("총 인원 : " + arrStd.length);
	System.out.printf("평균 점수 : %.2f \n" , avg);
	System.out.println("최고 점수는 : " + max + "점 이며 최고점의 학생은 : " + maxName + "님 입니다.");
	
	}

}
