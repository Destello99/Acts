import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        //setting up root null

        t.insert(50);
        t.insert(20);
        t.insert(60);
        t.insert(10);
        t.insert(30);
        t.insert(90);
        t.insert(80);
        t.insert(100);
        t.insert(70);
        t.insert(40);

        System.out.println("PRE-ORDER-");
        t.preOrderPrint();

        System.out.println("POST-ORDER-");
        t.postOrderPrint();

        System.out.println("IN-ORDER-");
        t.inOrderPrint();

        //TODO problem count number of nodes in tree including root

        System.out.println("______________");
        int i = t.RCounter();
        int j = t.lCounter();
        System.out.println("left "+j);
        System.out.println("right "+ i);
    }

}
