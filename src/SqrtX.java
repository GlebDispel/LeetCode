public class SqrtX {
    public int mySqrt(int x) {


        for (int i = 2; i < x; i++) {
            if(x % i == 0){
               return i ;}
            if(i * i > x ){
                return (int) x/i;

            }
        }

        return 0;
    }
}
