import java.util.*;

public class Tictactoe {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        

        int num1=0;
        do{
        
        System.out.println("__0__|__1__|__2__");
        System.out.println("__3__|__4__|__5__");
        System.out.println("__6__|__7__|__8__");
        System.out.println("Enter the position and value");
        int p=s.nextInt();
        String v=s.nextLine();
        switch (p) {
            case 0:position0(v);
            break;
            case 1:position0(v);
            break;
            case 2:position0(v);
            break;
            case 3:position0(v);
            break;
            case 4:position0(v);
            break;
            case 5:position0(v);
            break;
            case 6:position0(v);
            break;
            case 7:position0(v);
            break;
            case 8:position0(v);
            break;
            default:System.out.println("enter the correct number");
                break;
        }
        }while(num1!=0);

    }
    public static void position0(String v)
    {int num[][]={{1,2,3},{4,5,6},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position1(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j+1]==1)
            {
                System.out.println("O");
            }
         }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position2(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j+2]==2)
            {
                System.out.println("O");
            }
         }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position3(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position4(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position5(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }   for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position6(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }   for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
        
    }
    public static void position7(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }   for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }
    public static void position8(String v)
    {int num[][]={{},{},{}};
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<3;j++){
            if(num[i][j]==0)
            {
                System.out.println("O");
            }
         }
        }
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }System.out.println();
        }
    }


}
