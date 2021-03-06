class Scientist implements Comparable<Scientist>{
    private String name;
    private int yearOfBirth;
    private String fieldOfStudy;
    private Scientist[] collaborators;

    // Q1
    public Scientist(String name, int yearOfBirth, String fieldOfStudy){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Scientist(String name, int yearOfBirth, String fieldOfStudy, Scientist[] collaborators){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.fieldOfStudy = fieldOfStudy;
        this.collaborators = collaborators;
    }

    // Q3
    // public int compareTo(Scientist s){
    //     return s.yearOfBirth - this.yearOfBirth;
    // }

    // Q4
    public int compareTo(Scientist s){
        if(this.fieldOfStudy == s.fieldOfStudy){
            return this.name.compareTo(s.name);
        }
        return this.fieldOfStudy.compareTo(s.fieldOfStudy);
    }

    // Q5
    public static boolean colleague(Scientist[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length - 1; i++){
                if(a[i].yearOfBirth == a[j].yearOfBirth && a[i].fieldOfStudy == a[j].fieldOfStudy){
                    return true;
                }
            }
        }
        return false;
    }

    // Q6
    public boolean hasCollaborator(Scientist[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < this.collaborators.length; j++){
                if(a[i] == this.collaborators[j]){
                    return true;
                }
            }
        }
        return false;
    }
}