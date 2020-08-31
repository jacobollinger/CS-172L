class Lect21{
    // String objects
    // method === function   
    public static void main(String[] args){
        String s = "abcd1234";
        /**
         * .indexOf('d') => 3
         *   s.indexOf('m') => -1
         *   s.charAt(0) => 'a'
         *   s.charAt(6) => '3'
         *   s.length()
         * 
         * s.replace('b', '!') => "a!cd1234" // new string
         * System.out.println(s) => "abcd1234"
         * 
         * // Strings are immutable
         *  
         * s = s.replace('b', '!');
         * System.out.println(s) => "a!cd1234"
         *  
         * s = s + "xyz"; => "a!cd1234xyz"  
         */
        // Very inefficient
        for(int i = 0; i < 1000; i++){
            s = s + String.valueOf(1);
        }

        /**
         * String s1, s2
         * 
         * s1.equals(s2) // true or false
         * 
         * s1 == s2 does not compare s1 to s2 character by character. Compares references.
         * 
         * s1.compareTo(s2) // returns 1 if s1 > s2, -1 if s1 > s2, and 0 if s1 == s2
         * 
         * s1.compareTo(s2) < 0 // s1 < s2
         * s1.compareTo(s2) >= 0 // s1 >= s2
         * // s.indexOf('p') > 0 // 'p' in s
         */

        /** primative types
         * int
         * double
         * char
         * float
         * boolean
         * ...
         * 
         * ==
         * !=
         * >
         * <
         * >=
         * <=
         */

        /** object types
         * String
         * ...
        */ 
    }
}