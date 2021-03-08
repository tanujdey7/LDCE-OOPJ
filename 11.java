/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) {
        int count;
        String str = args[0];
        for (char i = '0'; i < 'z'; i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    count++;
                }
            }
            if (count > 0)
                System.out.print("Occurance of " + i + " is " + count + " times\n");
        }
    }
}