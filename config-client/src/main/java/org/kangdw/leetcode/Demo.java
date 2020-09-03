package org.kangdw.leetcode;

public class Demo {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flag=0;
        if(n==0){
            return true;
        }
        if(flowerbed.length==1){
            if(flowerbed[0]==0&&n==1){
                return true;
            }else{
                return false;
            }
        }
        if(flowerbed.length==2){
            if(flowerbed[0]==0&&flowerbed[1]==0&&n==1){
                return true;
            }else{
                return false;
            }
        }

        for(int i=1;i<flowerbed.length-1;i++){
            // if(flowerbed[i]==1){
            //     if(flowerbed[i+1]!=1&&flowerbed[i+2]!=1){
            //         flag=flag+1;
            //     }
            //     if(flag>=n){
            //         return true;
            //     }

            // }

            if(flowerbed[i]==0){
                if(flowerbed[i-1]==0&&i==1){
                    flag=flag+1;
                    continue;
                }
                if(flowerbed.length-1!=i) {
                    if (flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                        flag = flag + 1;
                        i = i + 1;
                    }
                }else if(flowerbed[i+1]==0&&flowerbed[i]==0){
                    flag=flag+1;
                }
//                if(flag>=n){
//                    return true;
//                }

            }
        }
        // if(flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0&&flowerbed[flowerbed.length-3]==1){
        //       flag=flag+1;
        // }

//        if(flag>=n){
//            return true;
//        }else{
//            return false;
//        }
        System.out.println(flag);
        return false;
    }


    public static void main(String[] args) {
        int a []={1,0,0,0,1};
        boolean b = canPlaceFlowers(a, 2);
        int c =123;
        System.out.println(-13%10);
        System.out.println(reverse(c));
    }
    public static  int reverse(int x) {
        int reverse=0;
        while(x!=0){
            int b=x%10;
            if(x>0 && reverse > (Integer.MAX_VALUE-b)/10){
                return 0;
            }
            if(x<0 && reverse < (Integer.MIN_VALUE-b)/10){
                return 0;
            }
            reverse=reverse*10 + b;
            x=x/10;

        }
        return reverse;
    }
}
