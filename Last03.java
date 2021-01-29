import java.util.*;

public class Last03 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int count = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = ran.nextInt(99) + 1;
                System.out.print(num + " ");//要素を100作る
                numbers.add(num);
                count++;
            }
            System.out.println("\n");
        }
        System.out.println("抽出する下限と上限を入力してください");//範囲を指定
        System.out.println("下限");
        int low = sc.nextInt();
        System.out.println("上限");
        int high = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();

        Collections.sort(numbers);
        for (int i : numbers) {
            if (i >= low && i <= high) {
                System.out.print(i + " ");//指定範囲内の場合numsに格納する
                nums.add(i);
            }
        }

        int counta = eliminateDuplicates(nums);
        System.out.printf("の%d件です", counta);
    }

    static int eliminateDuplicates(ArrayList<Integer> numbers) {// 抽出された配列の重複を除く

        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();

        for (int i : numbers) {
            System.out.print(i + " ");
            linkedHashSet.add(i);
        }
        System.out.println("\n");

        Object[] numbers_after = linkedHashSet.toArray();

        System.out.println("重複を排除すると");
        System.out.println(Arrays.toString(numbers_after));
        return numbers_after.length;
    }

}