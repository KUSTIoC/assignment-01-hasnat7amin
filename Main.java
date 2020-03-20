public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
       
        paper E1 = new paper("computer Science", "123", "CS103", "Sir Ali Zeb", 2, "BSCS",new Date(2,3,2020),new Time(8,30,00), "final Exam", "Sir Roman", "Floor : room 3", "50", false);
	    paper E2 = new paper("Islamyat", "321", "CS12", "Sir Qayyum", 3, "BSCS",new Date(2,3,2020),new Time(8,30,00), "final Exam", "Sir Ilyas", "Floor : room 4", "42", false);
        paper E3 = new paper("Study skill", "321", "CS12", "Maam Sabahat", 4, "BSCS",new Date(2,3,2020),new Time(8,30,00), "final Exam", "Sir Ilyas", "Floor : room 4", "42", false);
		System.out.println(E1.toString()+new Course("java",123,"BSCS","Sir Ali Zeb"));
		System.out.println(E2.toString()+new Course("java",321,"MCS","Sir amin"));
		System.out.println(E3.toString()+new Course("java",243,"BSSE","Sir khan"));
		
        
    }
    
}