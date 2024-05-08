package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {
    public static void main(String[] args) {

        Person person1=new Person("Andrei",78954623,28,"M");
        System.out.println(person1.getAge());

        Person person2=new Person();
        person2.name="Marcel";
        System.out.println(person2.getAge());

        Person person3=new Person("Raisa","F");
        System.out.println("Numele obiectului person3 este: " +person3.name);

        System.out.println(Person.nationality);
        Person.nationality="Moldovean";
        System.out.println(Person.nationality);

        System.out.println(person3.getGender());

        System.out.println(person3.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());

    }

}
