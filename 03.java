/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) {
        int num = 12321;
        int cnum = 12321;
        int rem = 0;
        int rev = 0;
        while(num!=0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(cnum == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}