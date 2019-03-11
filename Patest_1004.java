import java.util.Scanner;

/**
 * Author: samsung
 * Date: 03/12/2019
 * Email: sn_leeho@foxmail.com
 **/
public class Patest_1004 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();//输入录入成绩的总人数
        String[] str = new String[num];//声明一个数组储存这些字符串的数据
        String[] grade = new String[num];
        int[] GRADE = new int[num];
        int length;
        for (int i = 0; i <= num - 1; i++) {
            Scanner var = new Scanner(System.in);
            str[i] = var.nextLine();
            length = str[i].length();
            grade[i] = str[i].substring(length - 3, length);
            grade[i] = grade[i].trim();
            GRADE[i] = Integer.parseInt(grade[i]);//最后三位去空格后转为整型
        }
        int k, j, index_max = 0, index_min = 0, max = GRADE[0], min = GRADE[num - 1];
        for (k = 1; k <= num - 1; k++) {
            if (GRADE[k] > max) {
                max = GRADE[k];
                index_max = k;//找出最大值
            }
            for (j = num - 1; j >= 0; j--) {
                if (GRADE[j] < min) {
                    min = GRADE[j];
                    index_min = j;//找出最小值
                }
            }
            str[index_max] = str[index_max].substring(0, str[index_max].length() - 3);
            str[index_max] = str[index_max].trim();
            System.out.println(str[index_max]);
            str[index_min] = str[index_min].substring(0, str[index_min].length() - 3);
            str[index_min] = str[index_min].trim();
            System.out.print(str[index_min]);
        }
    }
}