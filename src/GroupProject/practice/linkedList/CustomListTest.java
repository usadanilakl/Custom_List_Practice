package GroupProject.practice.linkedList;

public class CustomListTest {
    public static void main(String[] args) {

        System.out.println("---------Empty list------------------");
        CustomLinkedList names = new CustomLinkedList();
        System.out.println("names.isEmpty() = " + names.isEmpty());

        System.out.println("------------Adding element---------------------");
        names.addElement("Tamara");
        System.out.println("names = " + names);

        names.addElement("Danil");
        System.out.println("names = " + names);

        names.addElement("Jessica");
        System.out.println("names = " + names);

        names.addElement("Traisy");
        System.out.println("names = " + names);

        names.addElement("Jason");
        System.out.println("names = " + names);

        names.addElement("David");
        System.out.println("names = " + names);

        names.addElement("John");
        System.out.println("names = " + names);

        names.addElement("Jack");
        System.out.println("names = " + names);



        System.out.println("-------------------------------------------------------");
        names.addTail("Jennifer");
        System.out.println("names = " + names);
        names.addTail("Victoria");
        System.out.println("names = " + names);
        names.addTail("Konstantin");
        System.out.println("names = " + names);


        System.out.println("-------------------------------");
        System.out.println("names.size() = " + names.size());
        System.out.println("names.getHead() = " + names.getHead());
        System.out.println("names.getTail() = " + names.getTail());


    }
}
