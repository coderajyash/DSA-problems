import java.util.*;

import javax.print.event.PrintEvent;

class program{
    public int findMinArrowShots(int[][] points) {
        int numberofballoons = points.length;
        int[] start = new int[numberofballoons];
        int[] end = new int[numberofballoons];
        for(int i=0;i<numberofballoons;i++){
            start[i] = points[0][i];
        }
        for(int i=0;i<numberofballoons;i++){
            end[i] = points[1][i];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        
        int pointer = start[0];
        LinkedHashMap<Integer, Integer> pairs = new LinkedHashMap<>();
        for(int i=0;i<numberofballoons;i++){
            if(pairs.containsKey(points[0][i])){
                int max_value = pairs.get(points[0][i])>points[1][i] ? pairs.get(points[0][i]): points[1][i];
                pairs.put(points[0][i], max_value);
            }
            else{
                pairs.put(points[0][i], points[1][i]);
            }
        }
        int endIndex=pairs.get(pointer),burst=1;
        while(pointer<=end[numberofballoons-1]){
            if(burst==numberofballoons)
                break;
            else{
                while(pointer<endIndex){
                    if(pairs.containsKey(pointer)){
                        endIndex = pairs.get(pointer);
                        burst+=1;
                        pointer++;
                    }
                    else{
                        pointer++;
                    }
                }
            }       
        }
    }



    public static void main(String[] args){
        System.out.println("Hello World");
    }
}