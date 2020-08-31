class CS172Final{

    public static int[] repeatIntegers(int n, int k){
        int[] r = new int[n];
        int j = 1;
        for(int i = 1; i < r.length + 1; i++){
            if(j > k){
                j = 1;
            }
            r[i - 1] = j;
            j++;
        }
        return r;
    }

    public static int indexOfLongest(int[][] m){
        int ndx = 0;
        for(int i = 0; i < m.length; i++){
            if(m[i].length > m[ndx].length){
                ndx = i;
            }
        }
        return ndx;
    }

    public static void main(String[] args) {
        System.out.println(repeatIntegers(12, 3));

        int[][] m = {{1, 2}, {1}, {1, 2, 3}};
        System.out.println(indexOfLongest(m));

        Employee j = new Employee("Jacob", 2000, "(901) 489-6650");
        Employee e = new Employee("Emily", 2006, "(901) 489-6250");
        System.out.println(e.compareTo(j));
        j.areaCode();

        Employee[] list = {j, e, j};
        System.out.println(j.area901(list));
        System.out.println(j.youngestEmployee(list));
    } 
}