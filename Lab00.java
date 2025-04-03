public class Lab00
{
   public static void main(String[] args)
   {
      int x = 5;
      String y = "hello";
      float z = 9.8f;
      System.out.print("x = " + x + "y = " + y + "z = " + z);
      int[] nums = {3,6,-1,2};
      for(int i = 0; i<nums.length; i++) {
         System.out.println(nums[i]);
      }
      int numfound = char_count(y, 'l');
      System.out.println("Found:" + numfound);
      for(int i = 1; i < 11; i++){
         System.out.print(i + " ");
   }
      System.out.println();
   }



   public static int char_count(String s, char c){
      int count = 0;
      int i = 0;
      for(i = 0;i < s.length(); i++){
         if(s.charAt(i)==c) {
            count++;
         }
      }
      return count;
   }




   
   }

