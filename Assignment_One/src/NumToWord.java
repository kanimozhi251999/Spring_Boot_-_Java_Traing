import java.util.Scanner;

public class NumToWord {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number  " );
        int n=in.nextInt();

        if(n<0||n>10000)
        {
            System.out.println("Not valid number");
        }
        else
        {
            String[] sw= new String[]{" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
            String[] tow = new String[] {" ","Ten","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            String tw = "Hundred ";
            if(n<20)
            {
                System.out.println(sw[n]);

            }
            else if(n<99)
            {
                int u=n%10;//s
                int tt=n/10;//f

                System.out.println(tow[tt]+" "+sw[u]);
            }
            else if(n<999)
            {
                int h1=n/100;//f
                int h4=n/10;//s
                int u1=h4%10;
                int tt1=n%10;//t
                System.out.println(sw[h1]+" "+tw+" "+tow[u1]+" "+sw[tt1]);
            }
            else if(n<9999)
            {
                int h2=n/1000;//f
                int u2=(n/100)%10;//s
                int h4=n/10;
                int tt2=h4%10;//T
                int tt3=n%10;//fo
                System.out.println(sw[h2] +" "+"Thousand"+" "+sw[u2] +" "+"Hunderd and" +" "+ tow[tt2]+" "+sw[tt3]);

            } else  {
                System.out.println("Out of range");

            }
        }



    }


}

