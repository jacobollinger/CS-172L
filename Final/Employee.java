class Employee implements Comparable<Employee>{
    private String name;
    private int yob;
    private String phone;

    public Employee(String name, int yob, String phone){
        this.name = name;
        this.yob = yob;
        this.phone = phone;
    }

    public int compareTo(Employee e){
        return e.yob - this.yob;
    }

    public String areaCode(){
        String ac = "";
        for(int i = 1; i < 4; i++){
            ac += this.phone.charAt(i);
        }

        return ac;
    }

    public boolean area901(Employee[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(!arr[i].areaCode().equals("901")){
                return false;
            }
        }
        return true;
    }

    public Employee youngestEmployee(Employee[] arr){
        int ndx = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(arr[ndx]) < 0){
                ndx = i;
            }
        }
        return arr[ndx];
    }   
}