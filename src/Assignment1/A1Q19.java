package Assignment1;
import java.util.Scanner;
class Student {
        String name;
        int rn;
        int age;
        void set(String n,int r,int a ) {
            name=n;
            rn=r;
            age=a;
        }
        void get() {
            System.out.println("name:"+name);
            System.out.println("Rn:"+rn);
            System.out.println("age:"+age);
        }
    }
    public class A1Q19 {
        static void bubbleSort(Student arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j].rn > arr[j + 1].rn) {
                        Object temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = (Student) temp;
                    }
        }
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no of entry:");
            Student a[]=new Student[sc.nextInt()];
            for(int i=0;i<a.length;i++) {
                a[i]=new Student();
                System.out.println("Enter Name, Roll Number, Age");
                a[i].set(sc.next(), sc.nextInt(), sc.nextInt());
            }
            bubbleSort(a);
            for(int j=0;j<a.length;j++) {
                a[j].get();
            }
        }
    }
