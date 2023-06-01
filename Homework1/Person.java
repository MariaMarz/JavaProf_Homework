package homework.Homework1;

public class Person {

        String fullName;
        int age;

        public Person() {
                this.fullName = "Maria Marz";
                this.age = 31;
        }

        public Person(String fullName, int age) {
                this.fullName = fullName;
                this.age = age;
        }


        public void move(){
                System.out.println(fullName + " is moving");
        }
         public void talk(){
                System.out.println(fullName + " is talking");
        }
}


