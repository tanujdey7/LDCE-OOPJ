/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) {
        String str = "   Hello World  ";
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.isEmpty());
        System.out.println(str.contains("o"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.substring(5, 10));
        System.out.println(str.indexOf("W"));
    }
}