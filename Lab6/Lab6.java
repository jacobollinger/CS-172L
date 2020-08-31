class Lab6{
    // Problems 1, 2, and 3 are due today.

    // Let a and b be two arrays of characters.

    // 1. Write a function indexOf that returns the index of the first occurence of a characters ch in a. The value -1 is returned if ch is not in a.
    static int indexOf(char[] a, char ch){
        for(int i = 0; i < a.length; i++){
            if(a[i] == ch){
                return i;
            }
        }
        return -1;
    }

    // 2. Write a function substring that returns an array b which corresponds to the portion of a that starts at the index beginIndex (inclusive), and ends at the index endIndex (exclusive).
    static char[] substring(char[] a, int beginIndex, int endIndex){
        char[] b = new char[endIndex - beginIndex];

        for(int i = 0; i < b.length; i++){
            b[i] = a[i + beginIndex];
        }
        return b;
    }

    // 3. Write a function equals that determines if a and b are equal, i.e. they have exactly the same characters at the same position.
    static boolean equals(char[] a, char[] b){
        if(a.length == b.length){
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        char[] a = {'a', 'b', 'c', '1', '2', '3', 'x', 'y', 'z', 'x'};
        char[] b = {'a', 'b', 'c', '1', '2', '3', 'x', 'y', 'z', 'y'};

        System.out.println(indexOf(a, '1'));
        System.out.println(substring(a, 2, 7));
        System.out.println(equals(a, b));
    }
}