class InterviewPrepSitesTips {

	//Overloading
	void coreSubjects(String sub1){
		System.out.println("Revise the subject => " + sub1);
	}

	void coreSubjects(String sub1, String sub2){
		System.out.println("Revise the subjects: " + sub1 + " and " + sub2);
	}

	//Overridden method
	void otherTopics() {
		System.out.println("Focus more on HR questions!!");
	}
}

//Abstract class
//Inheritance
abstract class ShashiSirTips extends InterviewPrepSitesTips{

	//Overriding method
	void otherTopics() {
		System.out.println("Focus more on DS and Algo.!!");
	}

	abstract void programmingLanguage();
}

//Inheritance
class PythonBatchStudents extends ShashiSirTips {

	void programmingLanguage() {
		System.out.println("Studied python!");
	}
}


//Interface
interface FixedStrategy {

	void oneLanguage();
	void numOfDays(int num);
	void dailyStudyTime(int time);
}

class OtherStudents implements FixedStrategy {

	public void oneLanguage(){
		System.out.println("Study Java for interviews");
	}
	public void numOfDays(int num) {
		System.out.println(num + " days left for interview");
	}

	public void dailyStudyTime(int time) {
		System.out.println("Study for " + time + " hrs daily!");
	}
}

//Main program
class Prog5 {

	public static void main(String[] args) {
		
		PythonBatchStudents obj1 = new PythonBatchStudents();
		obj1.coreSubjects("OS", "DBMS");
		obj1.otherTopics();
		obj1.programmingLanguage();

		System.out.println("-------------------------------------");
		
		PythonBatchStudents obj2 = new PythonBatchStudents();
		obj2.coreSubjects("DBMS");
		obj2.otherTopics();
		obj2.programmingLanguage();

		System.out.println("-------------------------------------");
		
		OtherStudents obj3 = new OtherStudents();
		obj3.oneLanguage();
		obj3.numOfDays(15);
		obj3.dailyStudyTime(6);

		System.out.println("-------------------------------------");
		
		OtherStudents obj4 = new OtherStudents();
		obj4.oneLanguage();
		obj4.numOfDays(7);
		obj4.dailyStudyTime(8);
	}
}