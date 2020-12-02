import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("No of Processes: ");

        int n = scan.nextInt();
        int pid[] = new int[n];
        int ar[] = new int[n];
        int br[] = new int[n];
        int ct[] = new int[n];
        int ta[] = new int[n];
        int wt[] = new int[n];

        int temp;
        float avgta = 0, avgwt = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("enter process: " + (i + 1) + " arrival time: ");
            ar[i] = scan.nextInt();
            System.out.println("enter process: " + (i + 1) + " burst time: ");
            br[i] = scan.nextInt();
            pid[i] = i + 1;

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - (i + 1); i++) {

                if (ar[j] > ar[j + 1]) {

                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;

                    temp = br[j];
                    br[j] = br[j + 1];
                    br[j + 1] = temp;

                    temp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < n; i++) {

            if (i == 0) {

                ct[i] = ar[i] + br[i];

            } else {

                if (ar[i] > ct[i - 1]) {

                    ct[i] = ar[i] + br[i];

                } else {

                    ct[i] = ct[i - 1] + br[i];

                }

            }

            ta[i] = ct[i] - ar[i];
            wt[i] = ta[i] - br[i];
            avgta += ta[i];
            avgwt += wt[i];

        }

        System.out.println("\npid arrival burst completion turnaround waiting");

        for (int i = 0; i < n; i++) {

            System.out.println(pid[i] + " \t " + ar[i] + "\t" + br[i] + "\t" + ct[i] + "\t" + ta[i] + "\t" + wt[i] + "\t");

        }

        scan.close();
        System.out.println("Average turnaroundtime: " + (avgta / n));
        System.out.println("Average waitingtime: " + (avgwt / n));
            
    }
}
