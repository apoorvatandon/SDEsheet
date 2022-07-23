public class Main {
     private static void Zarr(String str, int[] Z) { 
          int n = str.length(); 
            int l = 0, q = 0; 
  
        for(int i = 1; i < n; ++i) { 
            if(i > q){ 
  
                l = q = i; 
                while(q < n && str.charAt(q - l) == str.charAt(q)) 
                    q++; 
                  
                Z[i] = q - l; 
                q--; 
  
            } 
            else{ 
                  int k = i - l; 
                  if(Z[k] < q - i + 1) 
                    Z[i] = Z[k]; 
                  else{ 
                      l = i; 
                    while(q < n && str.charAt(q - l) == str.charAt(q)) 
                        q++; 
                      
                    Z[i] = q - l; 
                    q--; 
                } 
            } 
        } 
    }
  public static void search(String text, String pattern) 
    { 
        String concat = pattern + "$" + text; 
        int l = concat.length(); 
        int Z[] = new int[l]; 
        Zarr(concat, Z); 
        for(int i = 0; i < l; ++i){ 
           if(Z[i] == pattern.length()){ 
                System.out.println("Pattern at : "
                              + ((i+1) - pattern.length() - 1)); 
            } 
        } 
    }
}
