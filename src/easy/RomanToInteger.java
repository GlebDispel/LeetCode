package easy;

public class RomanToInteger {
    public int romanToInt(String s) {

        int sum = 0;
        s = s.replace("IV", "IIII"); //MCMXCIV
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        char[] chars = s.toCharArray();
      for (char charik : chars){
          switch (charik){
              case 'I' -> sum += 1;
              case 'V' -> sum += 5;
              case 'X' -> sum += 10;
              case 'L' -> sum += 50;
              case 'C' -> sum += 100;
              case 'D' -> sum += 500;
              case 'M' -> sum += 1000;
          }
      }
        return sum;
    }
}
    
            
