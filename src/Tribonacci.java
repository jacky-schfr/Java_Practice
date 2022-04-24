/* Exercise by GiacomoSorbi from Codewars */

public class Tribonacci {
    public double[] tribonacci(double[] s, int n) {
        int count = 0;
        double[] list = new double[n];

        if(n<3){
            while(count<n){
                list[count] += s[count];
                count++;
            }
        }

        while(count<n){
            for(double i: s){
                if (count<=2){
                    list[count] += i;
                }
                else if(count<n){
                    list[count] += list[count-3]+list[count-2]+list[count-1];
                    System.out.println(list[count]);
                }
                count++;
            }
        }
        return list;
    }
}
