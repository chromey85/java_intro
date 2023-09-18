enum Status {
    Running, Failed, Pending, Success
}

class Enums {
    public static void main(String[] args) {

        // Status s = Status.Running;
        // Status[] ss = Status.values();

        // System.out.println(s);
        // System.out.println(ss[3]);

        // for (Status s1 : ss) {
        // System.out.println(s1 + " : " + s1.ordinal());
        // }

        Status s = Status.Pending;

        // if (s == Status.Running) {
        // System.out.println("All Good");
        // } else if (s == Status.Failed) {
        // System.out.println("Try Again");
        // } else if (s == Status.Pending) {
        // System.out.println("Please Wait");
        // } else {
        // System.out.println("Done");
        // }

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            default:
                System.err.println("Done");
                break;
        }
    }
}