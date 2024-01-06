// 1 : 
/*
class HelloWorld {
    public static void main(String[] args) {
      int n = 5;
      for(int i = 0;i<n;i++){
          for(int j = 0;j<n;j++){
              System.out.print("*");
          }
          System.out.println();
      }
      
       
     }
}
*/

// 2: 

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n = 5;
         
         for(int i = 1;i<=n;i++)
         {
           
             for(int j = 1;j<=i;j++ ){
                 System.out.print("*");
             }
             System.out.println();
         }
         
    }
}
*/

// 3:

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n = 5;
         
         for(int i = 1;i<=n;i++)
         {
           
             for(int j = 1;j<=i;j++ ){
                 System.out.print(j+ " ");
             }
             System.out.println();
         }
         
    }
}
*/

// 4:

/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n = 5;
         
         for(int i = 1;i<=n;i++)
         {
           
             for(int j = 1;j<=i;j++ ){
                 System.out.print(i+ " ");
             }
             System.out.println();
         }
         
    }
}
*/ 


//5:
/*

class HelloWorld {
    public static void main(String[] args) {
  
        int n = 5;
         int k = n;
         for(int i = 1;i<=n;i++){
             for(int j = i;j<=n;j++ ){
                 System.out.print("*");
             }
             System.out.println();
             
         }
         
    }
}
*/



//6 : 
/*
 

class HelloWorld {
    public static void main(String[] args) {
  
        int n = 5;
         int k = n;
         for(int i = 1;i<=n;i++){
             for(int j = 1;j<=k;j++ ){
                 System.out.print(j);
             }
             k--;
             System.out.println();
             
         }
         
    }
}
*/

//7: full pyramid 
/*
 

class HelloWorld {
    public static void main(String[] args) {
  
        int n = 5;int k = n-1;  int m = 1; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=k;j++){
                System.out.print(" ");
            }
            
            for(int l = 1;l<=m;l++ ){
                System.out.print("*");
            }
            k = k-1;
            m = m+2;
            System.out.println();
             
        } 
         
    }
}
*/

// 8  : full pyramid inverted 
/*

class HelloWorld {
    public static void main(String[] args) {
  
        int n = 5;int k = 0; int m = n*2-1; 
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=k;j++){
                System.out.print(" ");
            }
            
            for(int l = 1;l<=m;l++ ){
                System.out.print("*");
            }
            k = k+1;
            m = m-2;
            System.out.println();
             
        } 
         
    }
}
*/

// complete pyramid (upper + lower) : 9
/*
class HelloWorld {
    public static void main(String[] args) {
        upperHalf(5);
        lowerhalf(4);
    }
    public static void upperHalf(int z) {
        int n = z;
        int k = n - 1;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= m; l++) {
                System.out.print("*");
            }
            k = k - 1;
            m = m + 2;
            System.out.println();
        }
    }
    public static void lowerhalf(int z) {
        int n = z;
        int k = 1;
        int m = n * 2 - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= m; l++) {
                System.out.print("*");
            }
            k = k + 1;
            m = m - 2;
            System.out.println();

        }
    }
}

*/ 

// : 10 > 
/*

class HelloWorld {
    public static void main(String[] args) {
      int n = 5; 
      int k = n-1;
       
        for(int i = 1;i<=n;i++){
            // int k = i;
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=n-1;i++){
            for(int j = 1;j<=k;j++){
                System.out.print("*");
            }
            k--;
            System.out.println();
        }
      
 
 
    }
} 
*/

// : 11

/*

class HelloWorld {
    public static void main(String[] args) {
      int n = 5; 
      int k = 1;
       
        for(int i = 1;i<=n;i++){
              
              if(i%2==0){
                  k = 0;
              }else{
                  k =1;
              }
            for(int j = 1;j<=i;j++){
               System.out.print(k+" ");
                if(k == 0 ){
                    k =1 ;
                }else{k=0;}
            }
            System.out.println();
            
        }
      
 
 
    }
} 

*/

// : 12 

/*

class HelloWorld {
    public static void main(String[] args) {
      int n = 5; 
      int k = 1;
       
        for(int i = 1;i<=n;i++){
               k = (i%2==0)?0:1;
              
            for(int j = 1;j<=i;j++){
               System.out.print(k+" ");
               k = (k==1)?0:1;
            }
            System.out.println();
            
        }
      
 
 
    }
} 
*/

// 13: 

/*
1________1
12______21
123____321
1234__4321
1234554321

*/
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 5; 
        int z = 2*(n-1);
        
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++ ){
                System.out.print(j);
            }
            for(int j = 1;j<=z;j++){
                System.out.print("_");
            }
            z = z-2;
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            
             
        }
        
    }
}

*/
// 14: 
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 5; 
        int k =1;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
        
    }
}
*/

// 15: 

/*

class HelloWorld {
    public static void main(String[] args) {
      
     char a = 65;
     int n = 5;
     for(int i = 1;i<=n;i++){
         for(int j = 1;j<=i;j++){
             System.out.print(a+" ");
            a++;
         }
         a = 65;
         System.out.println();
     }
     
     
    } 
}
*/
// 16: 
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      
     char a = 65;
     int n = 5;
     int k = n;
     for(int i = 1;i<=n;i++){
         for(int j = 1;j<=k;j++){
             System.out.print(a+" ");
            a++;
         }
         a = 65;
         k--;
         System.out.println();
     }
     
     
    } 
}

*/

// 17: 
/*

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
      
     char a = 65;
     int n = 5;
     for(int i = 1;i<=n;i++){
         for(int j = 1;j<=i;j++){
             System.out.print(a+" ");
             
         }
         a++;
         System.out.println();
     }
     
     
    } 
}
*/

// 18:

// 20:

/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       int n = 5;
        up(n);
      
    }
    public static void up(int n){
        int x = n;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k + 2;
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        int m = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= m; j++) {
                System.err.print(" ");
            }
            m = m - 2;
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
   
    
}
*/

// 21:

/*

*________*
**______**
***____***
****__****
**********
****__****
***____***
**______**
*________*

*/
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       
       int n = 5;
       int k = 2*(n-1);
       int l = 2;
       for(int i = 1;i<=n;i++){
           for(int j = 1;j<=i;j++){
              System.out.print("*"); 
           }
           for(int j = 1;j<=k;j++){
               System.out.print("_");
           }
           k = k-2;
               for(int j = i;j>=1;j--){
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i = 1;i<=n-1;i++){
           for(int j = n-i;j>=1;j--){
               System.out.print("*");
           }
           for(int j = 1;j<=l;j++){
               System.out.print("_");
           }
           l=l+2;
           for(int j = n-i;j>=1;j--){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
*/

// 22:
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        
        
        for(int i = 1;i<=n;i++ ){
           for(int j = 1;j<=n;j++){
               if(i==1|| i==n  || j == 1 || j==n  ){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           } 
        System.out.println();   
              
        }
     
     
    } 
}
*/
