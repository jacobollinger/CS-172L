class Lab6HW{
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

    // Homework due Friday 2/28 at 9am.

    // 4. Write a function endsWith that returns true if a ends with b. It returns false otherwise.
    static boolean endsWith(char[] a, char[] b){
        for(int i = 0; i < b.length; i++){
            if(a[a.length - b.length + i] != b[i]){
                return false;
            }
        }
        return true;
    }

    // 5. Write a function contains that returns true if a contains b, i.e. the characters of b appear in a contiguously and in the same order. It returns false otherwise.
    static boolean contains(char[] a, char[] b){
        for(int i = 0; i <= a.length - b.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i + j] != b[j]){
                    break;
                }else if(j == b.length - 1){
                    return true;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args){

        char[] a = {'a', 'b', 'c', '1', '2', 'x', 'y', 'z', 'x', 'x'};
        char[] b = {'x', 'y', 'z', 'x'};

        System.out.println(endsWith(a, b));
        System.out.println(contains(a, b));
    }
}