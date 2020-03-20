public class ExamManagementSystem {
    public static void main(String[] args) {
        // TODO code application logic here
       
        paper E1 = new paper("computer Science", "789", "CS703", "Sir Ali Zeb", 2, "BSCS",new Date(2,3,2020),new Time(8,30,00), "final Exam", "Sir Roman", "Floor : room 3", "50", false);
	    paper E2 = new paper("Islamyat", "456", "CS12", "Sir asif", 3, "BSCS",new Date(2,3,2020),new Time(8,30,00), "final Exam", "Sir Ilyas", "Floor : room 4", "42", false);
        paper E3 = new paper("Study skill", "487", "CS12", "sana ullah", 4, "BSCS",new Date(2,3,2020),new Time(8,30,00), "final Exam", "Sir Ilyas", "Floor : room 4", "42", false);
		Course objE1=new Course("java",123,"BSCS","Sir Ali");
		Course objE2=new Course("java",321,"MCS","Sir fahad");
		Course objE3=new Course("java",243,"BSSE","Sir khatak");
		System.out.println(E1.toString()+objE1.toString());
		System.out.println(E2.toString()+objE2.toString());
		System.out.println(E3.toString()+objE3.toString());
		
        
    }
    
}