//Write a program for job sequencing
import java.util.*;

public class JobSequencing {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            this.deadline = d;
            this.id = i;
            this.profit = p;
        }
    }

    public static void main(String args[]) {
        int jobsinfo[][] = {{4, 20}, {1, 10}, {1, 30}, {1, 40}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsinfo.length; i++) {
            jobs.add(new Job(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println(seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.println(seq.get(i));
        }
    }
}
