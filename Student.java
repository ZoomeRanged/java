class Student extends Academician{ /*Buat class Student yang mewariskan class Academician dan memiliki  field grade*/
    String grade;

/*costructor student dengan super academician*/
    Student(String name, String age) {
        super(name, age);
    
    }
    void studentSubject(String subject) {
       
        System.out.println("Hello my name is " + name + "my level is" + age + ", My subject is " + subject + " Iam a student");   
    
    
    }
    }
