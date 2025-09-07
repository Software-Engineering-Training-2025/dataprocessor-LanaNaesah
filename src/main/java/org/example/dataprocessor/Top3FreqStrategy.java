package org.example.dataprocessor;

import java.util.*;

public class Top3FreqStrategy implements AnalysisMethodoligy{
    @Override
    public double analyze(List<Integer> list) {
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for (Integer i : list){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        List<Integer> Tops=new ArrayList<>(freq.values());
        Collections.sort(Tops,Collections.reverseOrder());
        double sum=0.0;
        for (int i =0 ; i<3 && i<Tops.size();i++){
            sum+=Tops.get(i);
        }
        return sum;
    }
}
