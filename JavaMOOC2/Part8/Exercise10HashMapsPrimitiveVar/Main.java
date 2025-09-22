package JavaMOOC2.Part8.Exercise10HashMapsPrimitiveVar;

public class Main {

    public static void main(String[] args) {
        // Test your program here provided from UoH

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}

