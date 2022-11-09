import java.util.*;

public class Tasks1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Integer> box = new HashMap<>();
        List<String> colorsAndCount;
        while(!input.equals("End")){

            colorsAndCount = Arrays.asList(input.split(":"));
            String color = colorsAndCount.get(0);
            int count = Integer.parseInt(colorsAndCount.get(1));

            box.merge(color,count,Integer::sum);




            input= scanner.nextLine();
        }

        int sum=0;
        int max=Collections.max(box.values());
        for (int x: box.values()) {
            sum += x;
        }


        System.out.println(sum-=max);
    }
}
