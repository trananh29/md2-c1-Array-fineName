import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String[] nameArray= {"hello","goodbye","sayhi","nevermind","holddoor"};
        String finename;
        System.out.println("Nhap ten ban muon tim");
        Scanner sc=new Scanner(System.in);
        finename=sc.nextLine();
        boolean check=false;
        for (int i=0;i<nameArray.length;i++) {
            if (nameArray[i].equals(finename)) {
                System.out.printf("Position of this Studen is %d ",i);
                check=true;
                break;

            }
        }
        if (!check) {
            System.out.println(" The studen is not exits");
        }
    }
}
