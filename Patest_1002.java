import java.io.*;
/**
 * Author: samsung
 * Date: 03/10/2019
 * Email: sn_leeho@foxmail.com
 **/

public class Patest_1002 {
    public static void main(String[] args)throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String a=buf.readLine();
        char[] b=new char[a.length()];
        int[] c=new int[b.length];
        for(int i=0;i<=a.length()-1;i++){
            b[i]=a.charAt(i);
            }
        for(int i=0;i<=b.length-1;i++){
            if(Character.isDigit(b[i])){
                c[i]=b[i]-'0';
            }
        }
        int sum=0;
        for(int i=0;i<=c.length-1;i++){
            sum+=c[i];
        }
        String total=String.valueOf(sum);
        char[] d=new char[total.length()];
        for(int i=0;i<=total.length()-1;i++){
            d[i]=total.charAt(i);
        }
        String str="";
        for(int i=0;i<=total.length()-1;i++){
            if(d[i]=='0')str=str+"ling ";
            if(d[i]=='1')str=str+"yi ";
            if(d[i]=='2')str=str+"er ";
            if(d[i]=='3')str=str+"san ";
            if(d[i]=='4')str=str+"si ";
            if(d[i]=='5')str=str+"wu ";
            if(d[i]=='6')str=str+"liu ";
            if(d[i]=='7')str=str+"qi ";
            if(d[i]=='8')str=str+"ba ";
            if(d[i]=='9')str=str+"jiu ";
        }
        str=str.trim();
        System.out.print(str);
        }
}
