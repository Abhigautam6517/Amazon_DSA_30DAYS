package Day11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class MakeConnection {


  public int  makeConnected(int n, int[][] connections) {
        if (connections.length+1<n) return -1;

        Map<Integer, Set<Integer>> provs= new HashMap<>();
        Set<Integer> inProvs = new HashSet<>();
        inProvs.add(0);
        provs.put(0, new HashSet<Integer>(inProvs));
        int zxc  = 1;
        for (int[] connection : connections) {
            int i = connection[0];
            int j = connection[1];
            if (inProvs.contains(i)) {
                if (inProvs.contains(j)) {
                    int iCont = 0;
                    int jCont = 0;
                    for (Map.Entry<Integer, Set<Integer>> entry : provs.entrySet()) {
                        
                            if (entry.getValue().contains(i)) iCont = entry.getKey();
                            if (entry.getValue().contains(j)) jCont = entry.getKey();
                        
                    }
                    if (iCont != jCont) {
                        provs.get(iCont).addAll(provs.get(jCont));
                        provs.remove(jCont);
                    }
                } else {
                    int iCont = 0;
                    for (Map.Entry<Integer, Set<Integer>> entry : provs.entrySet()) {
                        if (entry.getValue().contains(i)) iCont = entry.getKey();
                    }
                    provs.get(iCont).add(j);
                    inProvs.add(j);
                }
            } else {
                if (inProvs.contains(j)) {
                    int jCont = 0;
                    for (Map.Entry<Integer, Set<Integer>> entry : provs.entrySet()) {
                        if (entry.getValue().contains(j)) jCont = entry.getKey();

                    }
                    provs.get(jCont).add(i);
                    inProvs.add(i);
                } else {
                    Set<Integer> temp = new HashSet<>();
                    temp.add(i);
                    temp.add(j);
                    provs.put(zxc, temp);
                    zxc++;
                    inProvs.add(i);
                    inProvs.add(j);
                }
            }

        }
   return provs.size() - 1 + n - inProvs.size();
    }
}
    

