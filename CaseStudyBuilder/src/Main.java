public class Main {
    static void main(String[] args) {

        ACBuilder acBuilder = new SplitACBuilder();
        ACDirector director = new ACDirector(acBuilder);
        director.build();
        AC ac = acBuilder.getAC();
        System.out.println(ac);


        acBuilder = new WindowACBuilder();
        director = new ACDirector(acBuilder);
        director.build();
        ac = acBuilder.getAC();
        System.out.println(ac);
    }
}
