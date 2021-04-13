package s01;

public class Task01
{
    public  static  void  main(String[] args)
    {
        double ookkk[]={4,5,6,7,3,1,8,55};
        for (int i=0; i<ookkk.length;i++){
            System.out.print(ookkk[i]+" ");
        }
        System.out.println();
        double ookkkSort[];
        ookkkSort=Sort(ookkk);
        for (int i=0; i<ookkkSort.length;i++){
            System.out.print(ookkkSort[i]+" ");
        }
        System.out.println();
        System.out.println("Hello Natasha");
    }
    public static   double[] Sort(double[] number)
    {
        return number;
    }
}