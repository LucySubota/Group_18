package perizat_task_solutions;

public class ConCatTask {
    public static void main(String[] args) {

    }


    public static void conCat(String a, String b) {

        String temp = "";

        if (b.length() == 0) {
            temp = a;
        } else {
            temp = b;
        }

        if (a.length() > 0 && b.length() > 0) {

            if (a.charAt(a.length() - 1) == b.charAt(0)) {
                temp = a + b.substring(1);
            } else {
                temp = a + b;
            }
        }


        System.out.println(temp);

    }
}