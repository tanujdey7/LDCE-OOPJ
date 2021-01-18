/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + " Student Name: " + args[i]);
        }
    }
}