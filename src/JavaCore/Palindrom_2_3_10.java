package JavaCore;

/**
 * 2.3.10
 *
 * Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.
 * Для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]".Найдите в классе String метод, выполняющий замену по регулярному выражению и воспользуйтесь им.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Пример ввода 1: Was it a cat I saw?
 * Пример вывода 1: true
 * Пример ввода 2: A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
 * Пример вывода 2: false
 * Требования:
 * 1. Должен быть доступный статический метод boolean isPalindrome(String text)
 * 2. Работа метода должна удовлетворять условию
 */

public class Palindrom_2_3_10 {

    public static void main(String[] args) {

        String[] phrases = {
                "Don’t nod.",
                "Evil olive.",
                "Amore, Roma.",
                "Yo, banana boy!",
                "Dammit, I’m mad!",
                "Borrow or rob?",
                "I did, did I?",
                "Draw, O coward!",
                "Wonton? Not now!",
                "Never odd or even.",
                "Step on no pets.",
                "Live not on evil.",
                "Rise to vote, sir!",
                "Stella won no wallets.",
                "Won’t lovers revolt now?",
                "Delia saw I was ailed.",
                "Too bad I hid a boot.",
                "Red rum, sir, is murder.",
                "Nate bit a Tibetan.",
                "Ah. Satan sees Natasha.",
                "As I pee, sir, I see Pisa!",
                "Sit on a potato pan, Otis.",
                "A man, a plan, a canal: Panama.",
                "Amy? Must I jujitsu my ma?",
                "A nut for a jar of tuna.",
                "Murder for a jar of red rum.",
                "l lets Della call Ed \"Stella.\"",
                "Oh, who was it I saw? Oh, who?",
                "Cigar? Toss it in a can. It is so tragic.",
                "Pull up, Eva! we’re here! Wave! Pull up!",
                "Anne, I vote more cars race Rome to Vienna.",
                "Ed, I saw Harpo Marx ram Oprah W. aside.",
                "Was it a car or a cat I saw?",
                "Oozy rat in a sanitary zoo.",
                "Poor Dan is in a droop.",
                "Madam, in Eden, I’m Adam.",
                "Eva, can I see bees in a cave?",
                "Ma is a nun, as I am.",
                "Ma is as selfless as I am.",
                "Did Hannah see bees? Hannah did.",
                "Doc, note I dissent: a fast never prevents a fatness. I diet on cod.",
                "Are we not drawn onward, we few, drawn onward to new era?"
        };

        for (int i = 0; i < phrases.length; i++) {

            System.out.println(isPalindrome(phrases[i]));
        }
    }

    public static boolean isPalindrome(String text) {
//        return text.replaceAll("\\W", "")
//                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
//                        .reverse().toString());
        return text.equals((new StringBuilder(text)).reverse().toString());
    }
}
