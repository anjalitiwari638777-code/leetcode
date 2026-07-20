class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);

    
        int start = 0;
        for (int end = 0; end <= arr.length; end++) {
            if (end == arr.length || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }

    
        int i = 0, j = 0;
        int n = arr.length;

        while (j < n) {
        
            while (j < n && arr[j] == ' ') {
                j++;
            }


            while (j < n && arr[j] != ' ') {
                arr[i++] = arr[j++];
            }

            while (j < n && arr[j] == ' ') {
                j++;
            }

            if (j < n) {
                arr[i++] = ' ';
            }
        }

        return new String(arr, 0, i);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}