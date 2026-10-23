public class Stritterate {
    public static void main(String[] args) {
        String s="hello";
        int n=s.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev+=s.charAt(i);
        }
    }
}
