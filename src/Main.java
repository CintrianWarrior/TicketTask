public class Main {
    public static void stringSplit(String text) {
        int halfText = text.length()/2;
        String[] half = {text.substring(0, halfText), text.substring(halfText)};
        if (text.length() % 2 != 0) {
            System.out.println("Can not be split in half");
        } else {
            System.out.println(half[0] + " " + half[1]);
        }
    }
    public static void main(String[] args) {

        System.out.println("Задача из билета номер 3. Усов Никита");
        //Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
        String text = "афвафывфыв2";
        int halfText = text.length()/2;
        String[] half = {text.substring(0, halfText), text.substring(halfText)};
        if (text.length() % 2 != 0) {
            System.out.println("Can not be split in half");
        } else {
            System.out.println(half[0] + " " + half[1]);
        }
        stringSplit(text);
    }
}