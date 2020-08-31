class Test3TestAs{
    static boolean search1(String[] a, String k){
    for(int i = 0; i < a.length && k.length() >= a[i].length(); i++){
        if(k == a[i]){
            return true;
        }
    }
    return false;
}

    static boolean search2(String[] a, String k){
        for(int i = 0; i < a.length && k.charAt(0) >= a[i].charAt(0); i++){
            if(k == a[i]){
                return true;
            }
        }
        return false;
    }

    static Point[] closest(Point[] pointArr){
        Point[] closestArr = {pointArr[0], pointArr[0]};
        for(int i = 0; i < pointArr.length; i++){
            for(int j = i + 1; j < pointArr.length; j++){
                if(pointArr[i].distance(pointArr[j]) > closestArr[0].distance(closestArr[1])){
                    closestArr[0] = pointArr[i];
                    closestArr[1] = pointArr[j];
                }
            }
        }
        return closestArr;
    }

    public static void main(String[] args) {
        String[] w = {"everybody", "me", "them", "you"};
        String k = "everybody";
        System.out.println(search2(w, k));

        Point a = new Point(2, 2);
        Point b = new Point(3, 2);
        Point c = new Point(1, 3);
        Point d = new Point(1, 0);
        Point e = new Point(4, 0);
        Point[] pointArr = {a, b, c, d, e};
    }
}