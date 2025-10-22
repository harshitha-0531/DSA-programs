class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Map<String,Double>> adjlist=new HashMap<>();
        for (int i=0;i<equations.size();i++){
            String u=equations.get(i).get(0);
            String v=equations.get(i).get(1);
            double val=values[i];
            adjlist.put(u,adjlist.getOrDefault(u,new HashMap<>()));
            adjlist.put(v,adjlist.getOrDefault(v,new  HashMap<>()));
            adjlist.get(u).put(v,val);
            adjlist.get(v).put(u,1.0/val);

        } 
        double[] res= new double[queries.size()] ; 

        for(int i=0;i<queries.size();i++){
            String src=queries.get(i).get(0);
            String des=queries.get(i).get(1);
            Set<String>vis=new HashSet<>();
            double value=dfs(adjlist,src,des,vis);
            res[i]=value;
        }
        return res;
    }

    public  static double dfs(Map<String,Map<String,Double>>adjlist, String src,String des,Set<String> vis){
            if (!adjlist.containsKey(src)||!adjlist.containsKey(des)){
                return -1.0;
            }
            if(adjlist.get(src).containsKey(des)){
                return adjlist.get(src).get(des);
            }
            vis.add(src);
            for (Map.Entry<String,Double>nei:adjlist.get(src).entrySet()){
                String nxtNode=nei.getKey();
                if (!vis.contains(nxtNode)){
                    double temp=dfs(adjlist,nxtNode,des,vis);
                    if (temp!=1.0){
                        return temp*nei.getValue();
                    }
                }
            }
            return -1.0;
        }

    
}
