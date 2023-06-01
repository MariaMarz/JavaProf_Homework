package homework.Homework1;

import homework.Homework1.Phone;

public class Phone1 {
    public static void main(String[] args) {
        Phone phone1 = new Phone(5345, "Nokia", 109);
        System.out.println("Model is " + phone1.model);
        System.out.println("Weight is " + phone1.weight);
        System.out.println("Number is " + phone1.number);

        System.out.println();

        Phone phone2 = new Phone(93847, "Iphone", 96);
        System.out.println("Model is " + phone2.model);
        System.out.println("Weight is " + phone2.weight);
        System.out.println("Number is " + phone2.number);

        System.out.println();

        Phone phone3 = new Phone(12321, "Xiomi", 120 );
        System.out.println("Model is " + phone3.model);
        System.out.println("Weight is " + phone3.weight);
        System.out.println("Number is " + phone3.number);

        System.out.println();

        System.out.println("Phone 1 - Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.weight);
        System.out.println("Phone 2 - Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.weight);
        System.out.println("Phone 3 - Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.weight);

        phone1.receiveCall("Maria");
        phone2.receiveCall("Alex");
        phone3.receiveCall("Catalina");

    }
}
