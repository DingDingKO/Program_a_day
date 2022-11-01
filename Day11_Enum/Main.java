package Day11_Enum;
/*DAY 11:
* A quick play around with Enum plus some code my dad sent me about the different types of ways to go through a list
* */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        enum Week {Mon, Tue, Wed, Thu, Fri, Sat, Sun};
        Week holiday;
        holiday = Week.Fri;
        System.out.println(holiday.ordinal());
        System.out.println(Arrays.toString(Week.values()));
        System.out.println(holiday.compareTo(Week.Sat)); // Shows the difference between them - pretty cool
        System.out.println(holiday.toString());

        ////////////////////////////////////////////////////////
        // CODE MY DAD SENT ME ABOUT DIFFERENT WAYS TO GO THROUGH A LIST

        final Vector<Person> people = new Vector<>();
        people.add(new Person("Bob"));
        people.add(new Person("Mary"));
        people.add(new Person("Steve"));
        people.add(new Person("Anna"));

        // For example, I want to print the contents of the Vector.
        // Using Enumeration

        final Enumeration<Person> elements = people.elements();
        System.out.println("\nEnumeration: ");
        while (((Enumeration<?>) elements).hasMoreElements()) {
            System.out.println(elements.nextElement().getName());
        }

        // Using for loop from earlier version
        System.out.println("\nFor Loop: ");
        for (int i = 0; i < people.size(); i += 1) {
            System.out.println(people.elementAt(i).getName());
        }

        // From version 1.5 Enhanced For loop
        System.out.println("\nEnhanced For Loop: ");
        for (Person p : people) {
            System.out.println(p.getName());
        }

        // From version 1.8 Stream
        System.out.println("\nStream: ");
        people.forEach(p -> System.out.println(p.getName()));

        //Enumeration no longer recommends it, preferring to use Iterator instead, as introduced from version 1.2 onwards.
        //They don't want you to use enumeration so badly that they added the asIterator() method to the interface since version 1.9.

        System.out.println("\nIterator: ");
        // With Iterator
        List<Person> peopleList = List.of(new Person("Bob"), new Person("Mary"), new Person("Steve"),new Person("Anna"));
        final Iterator<Person> iterator = peopleList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }

        //I tend to use enhanced for loop or stream.


        System.out.println("\nEnum:");
        //ENUM was introduce from version 1.5
        enum Level {
            BEGINNER,
            INTERMEDIATE,
            ADVANCE
        }

        Level myLevel = Level.BEGINNER;
        System.out.println(myLevel);               // BEGINNER
        // The most effective use of an Enum is when you want to enforce a class to instantiate only one within a JVM.
        //Also known as the Singleton pattern
    }
}
