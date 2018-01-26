// Bailey Waldorf
// ACM Contest Scoring
// 1/22/18

import java.util.*;

public class ACMContestScoring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long totalTime = 0, totalRight = 0;
        int[] time = new int[101];
        String[] question = new String[101];
        String[] result = new String[101];

        for(int i = 0; i < 101; i++) {

            String line = sc.nextLine();

            if (line.equals("-1")) {
                System.out.print(totalRight + " " + totalTime);
                return;
            }
            else {

                String s[] = line.split(" ");

                time[i] = Integer.parseInt(s[0].trim());
                question[i] = s[1];
                result[i] = s[2];

                //System.out.println(result[i]);

                if (result[i].equals("right")) {

                    totalRight += 1;
                    totalTime += time[i];

                    for (int j = 0; j < i; j++) {

                        if (question[j].equals(question[i]))
                            totalTime += 20;

                    }
                }
            }
        }
    }
}