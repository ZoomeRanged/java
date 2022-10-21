class Academician {
    protected final String subject = null;
    String name; /*field*/
    String age;/*field*/

    Academician(String name, String age) {      /*constructor*/
        this.name = name;  /*parameter*/
        this.age = age;  /*parameter*/

    }

/*method studentSubject*/ 
    void studentSubject(String subject) {
        System.out.println("Hello my name is " + name + " my age is " + age + ", My subject is " + subject);
        }
        
}
    


    
    