import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));


    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    //Задача 1
    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
    }

    //Задача 2
    public static void task2() {
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num + ", ");
                prevNum = num;
            }
        }
    }

    //Задача 3
    //Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
    //  Код должен работать с любой последовательностью и объемом списка слов.
    public static void task3(){
        Set<String> uniqeWords = new HashSet<>(words);
        System.out.println(uniqeWords);
    }

    //Задача 4
    //Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
    // Код должен работать с любой последовательностью и объемом списка слов.
    public static void task4(){

        Set<String> uniques = new HashSet<>();
        for (String word: words ){
          uniques.add(word);
        }
       // System.out.println(uniques.toString());
        //System.out.println(words.toString());

        for (String unique : uniques){
            int duplicates = 0;
            for (String word : words){
                if (word.equals(unique)){
                    duplicates = duplicates +1;
                }
            }
            System.out.print(duplicates + ", ");
        }
    }

}
