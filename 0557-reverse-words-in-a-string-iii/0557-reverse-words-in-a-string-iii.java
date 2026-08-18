class Solution {
    public String reverseWords(String s) {
        String[]  words= s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word:words){
            char[] arr = word.toCharArray();
            int left = 0;
            int right = arr.length-1;
            while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        result.append(arr);
        result.append(" ");
        
    }
    return result.toString().trim();

}
}