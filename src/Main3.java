import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= new int[20];

        System.out.println("3.1");
        System.out.print("개수, 값 입력> ");

        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i =0; i<num;i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("3.2");
        System.out.print("교환할 index번호 2개 입력 >  ");

        int index1= sc.nextInt();
        int index2= sc.nextInt();

        int temp;
        temp=arr[index1]; // [ 10 4 9 3 8 5 ]
        arr[index1]=arr[index2]; // [8 4 9 3 8 5]
        arr[index2]=temp;  // 8 4 9 3 10 5

        // [ 10 4 9 3 8 5 ]
        // [ 8 4 9 3 10 5 ]
        // [ 10 10 10 10 10 10 ]

        for(int i=0; i<num;i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("3.3");
        System.out.print("검색할 값 입력> ");

//         [ 8 4 10 3 10 5 ]
//        8 4 9 3 10 5
        int number = sc.nextInt();
        for(int i=0; i<num;i++) {
            if(number == arr[i]) {
                System.out.println(number +"(이) 처음 나오는 index번호는  "+i);
                break;
            }
        }
        sc.close();
    }
}
