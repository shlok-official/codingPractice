import java.util.*;
import java.io.*;

public class minGates {  
 public static void main(String args[])  
 {  
 //  arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}  
   //  dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}  
    int counter=0; 
  int arr[] = {900, 910, 920};  
  int dep[] = {930, 915, 925};  
  System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep,3));  
  
 }  
    
 static int findPlatformsRequiredForStation(int arr[], int dep[], int n)  
 {  
    int platform_needed = 0, maxPlatforms = 0;  
    int i = 0, j = 0;  
     
    // Similar to merge in merge sort  
    while (i < n && j < n)  
    {  
       if (arr[i] < dep[j])  
       {  
        platform_needed++;  
           i++;  
           if (platform_needed > maxPlatforms)   
            maxPlatforms = platform_needed;  
       }  
       else   
       {  
        platform_needed--;  
           j++;  
       }  
    }  
     
    return maxPlatforms;  
 }  
}  



// public int minMeetingRoomsWithConstantSpace(Interval[] intervals) {
//     if (null == intervals || intervals.length == 0) {
//         return 0;
//     }
//     Arrays.sort(intervals, new Comparator<Interval>() {
//         @Override
//         public int compare(Interval o1, Interval o2) {
//             return o1.start - o2.start;
//         }
//     });
//     PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
//     int minRoom = 1;
//     queue.offer(intervals[0].end);
//     for (int i = 1; i < intervals.length; i++) {
//         if (intervals[i].start < queue.peek()) {
//             minRoom++;
//         } else {
//             queue.poll();
//         }
//         queue.offer(intervals[i].end);
//     }
//     return minRoom;
// }


// // Definition for an interval.
// public class Interval {
//     int start;
//     int end;
//     Interval() { 
//         start = 0; end = 0;
//          }
//     Interval(int s, int e) {
//          start = s; end = e; 
//          }
// }

// public class minGates {  
//   public static void main(String args[])  
//   {  

// Interval[] arr = [[0, 30],[5, 10],[15, 20]];
// System.out.println(minMeetingRoomsWithConstantSpace(arr));
// }