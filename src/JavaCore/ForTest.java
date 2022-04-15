package JavaCore;

public class ForTest {
    public static void main(String[] args) {
        String email = "ilyuno@ya.ru";
        String name = "ilya";
        int id = 12345;
        int result = 1;
        int result1 = 31 * result + ((email == null) ? 0 : email.hashCode());
        int result2 = 31 * result + (int) (id ^ (id >>> 32));
        int result3 = 31 * result + ((name == null) ? 0 : name.hashCode());
        System.out.println(Integer.toBinaryString(474 >>> 32));
//        System.out.println(result2);
//        System.out.println(result3);
    }
}
