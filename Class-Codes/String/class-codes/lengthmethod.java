class lengthmethod{
public static void main(String[] args) {
    String str = "Core2web";

    // Calculate the length of the string
    int length = 0;
    while (true) {
        try {
            str.charAt(length);
        } catch (IndexOutOfBoundsException exception) {
            break;
        }
        length++;
    }
    System.out.println("Length of the string: " + length);
}
}
