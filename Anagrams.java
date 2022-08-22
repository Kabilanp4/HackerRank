

    static boolean isAnagram(String a, String b) {
        String c=a.toLowerCase();
        String d=b.toLowerCase();
        int count=0;
        int count1=0;
        if(c.length()!=d.length()){
            return false;
        }
        for(int i=0;i<c.length();i++){
            char ch=c.charAt(i);
            for(int j=0;j<c.length();j++){
                if(c.charAt(i)==ch){}
                count++;
                if(d.charAt(i)==ch)
                count1++;
            }
             if(count!=count1){
                return false;
              }
        }
        
         return true;
        
    }


