class Solution {
    public String reverseVowels(String s) {
        
        char arr[] = s.toCharArray();
        int i=0;
       int j= arr.length-1;
        while(i<j){
            if(!isvol(arr[i])){
                i++;
            }
            else if(!isvol(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        String str = new String(arr);
        return str;
    }
    public static boolean isvol(char ch){
        if(ch=='a'|| ch=='A'|| ch=='e'|| ch=='E'|| ch=='I'|| ch=='i'|| ch=='o'|| ch=='O'|| ch=='u'||
        ch=='U'){
            return true;
        }
        else
          return false;
    }
}