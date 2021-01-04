interface Exam {
    public boolean pass(int mark);
}

interface Classify {
    public String Division(int average);
}

class Result implements Exam, Classify {
    public boolean pass(int mark) {
        if (mark >= 50)
            return true;
        else
            return false;
    }

    public String Division(int average) {
        if (average >= 60)
            return "First";
        else if (average >= 50 && average < 60)
            return "Second";
        else
            return "No Division";
    }

    public static void main(String[] args) {
        Exam e = new Result();
        System.out.println(e.pass(50));
        Classify c = new Result();
        System.out.println(c.Division(50));
    }
}