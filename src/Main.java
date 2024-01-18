public class Main {
   public static void main(String[] args) {
      task1();
      task2();
      task3();
   }
public static String data (){
   String firstName = "Иванов";
   String middleName = "Иван";
   String lastName = "Иванович";
   String fullName = firstName +" "+ middleName +" "+ lastName;
    return fullName;
}
public static String dataTwo (){
   String firstName = "Иванов";
   String middleName = "Семён";
   String lastName = "Семёнович";
   String fullName = firstName +" "+ middleName +" "+ lastName;
   return fullName;
}
   public static void task1(){
      String fullName = data();
      System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
   }
   public static void task2(){
      String fullName = data();
      System.out.println("Данные Ф. И. О. сотрудника — "+ fullName.toUpperCase());
   }
   public static void task3 (){
      String fullName = dataTwo();
      fullName = fullName.replace("ё", "е");
      System.out.println("Данные Ф. И. О. сотрудника — " + fullName.toUpperCase());
   }

}