public class SwitchCaseTest {
    public static void main(String[] args) {
         String day="Sunday";
         switch (day){
             case "Friday":
                 System.out.println("야구하기");
                 break;
             case "Monday":
                 System.out.println("농구하기");
                 break;

             case "Tuesday":
             case "Wednesday":
                 System.out.println("수영하기");
                 break;
             default:
                 System.out.println("휴식");


         }
    }
}
