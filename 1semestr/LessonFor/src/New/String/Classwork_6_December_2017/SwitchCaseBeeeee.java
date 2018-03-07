package New.String.Classwork_6_December_2017;

public class SwitchCaseBeeeee {

    public static void main(String[] args) {
        String words[] = {"бээ!", "б", "", "бэээээ!", "бэ", "!"};
        for (int i = 0; i < words.length; i++) {
        }

    }

    public static boolean switchcase(char array[]) {

        boolean f = true;
        int
                state = 0,
                i = 0;

        while (f) {
            switch (state) {
                case 0:
                    if (array[i] == 'б') {
                        state++;
                        i++;
                    } else {
                        System.out.println("All bad");
                        f = false;
                    }
                    break;
                case 1:
                    if (array[i] == 'э') {
                        state++;
                        i++;
                    } else {
                        System.out.println("All bad");
                        f = false;
                    }
                    break;
                case 2:
                    if (array[i] == 'э') {
                        state++;
                        i++;
                    } else {
                        System.out.println("All bad");
                        f = false;
                    }
                    break;
                case 3:
                    if (array[i] == 'э') {
                        state++;
                        i++;
                    } else {
                        System.out.println("All bad");
                        f = false;
                    }
                    break;
                case 4:
                    if (array[4] == '!') {
                        f = false;
                        System.out.println("All right");
                    }
                    break;

            }
        }
        return f;
    }
}
