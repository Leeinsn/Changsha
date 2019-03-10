public class bubbleSort_8number {
    public static void main(String[] args){
        int[] num=new int[8];
        System.out.print("使用随机数生成的数顺序：");
        for(int i=0;i<=7;i++){
            num[i]=(int)(Math.random()*100);//使用一个数组去储存random()函数生成的随机数
            System.out.print(" "+num[i]);
        }
        System.out.println(" ");
        int c;
        for(int k=0;k+1<=num.length-1;k++){
            for(int i=0;i+1<=num.length-1;i++){
                if(num[i]>num[i+1]){
        c=num[i];
        num[i]=num[i+1];
        num[i+1]=c; //使用一个中间变量c来接受顺序的交换
        }
        }
        }
        System.out.print("通过冒泡排序后的顺序：");
        for(int i=0;i<=num.length-1;i++){
        System.out.print(" "+num[i]);
        }
        }
        }