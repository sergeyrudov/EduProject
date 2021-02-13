public class tst4 {

    public static void main(String[] args) {
        int s = 1;
        for(int i = 5; i>0; i--){
            s+=i;
            if(i!=0){
                break;
            }
        }
        System.out.println(s);
    }

}
