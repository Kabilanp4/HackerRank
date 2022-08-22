

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for (int i=0;i<=s.length()-k;i++){
            String a =s.substring(i,k+i);
            if(smallest.compareTo(a)>0){
                smallest=a;
            }   
            if(largest.compareTo(a)<0){
                largest=a;
            } 
        }
        
        
        return smallest + "\n" + largest;
    }

