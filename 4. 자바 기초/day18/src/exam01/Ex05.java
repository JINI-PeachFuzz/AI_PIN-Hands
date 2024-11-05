package exam01;

import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        int sum = nums.stream().reduce(0, (acc,num)-> acc+num);
        // reduce는 박싱과 언박싱을 반복하기 때문에 비효율적임
        System.out.println(sum);
    }
}
