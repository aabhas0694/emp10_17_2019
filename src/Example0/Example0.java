package Example0;

/**
 * In this example, we will try to enhance our understanding of class design.
 *
 * We need to create class "Person" with 2 instance variables: age and name.
 * Another class "University" with 3 instance variables: universityName, noOfStudents, noOfProfs.
 * Another class "Student" with 3 instance variables: age, studentName and university (of type University).
 * Create all the relevant parameterized constructors, getters and setters.
 * In addition, create a public method "ageInTenYears" in Student class which returns the age 10 years from now.
 *
 * 1. Did you keep all instance variables private?
 * 2. Think of a scenario where instance variable "university" can be made "static". Will it be smart to make
 *    it "final"? Why/ why not?
 * 3. Can I inherit some instance variables from other classes? Which ones? Use them then!
 * 4. Lets try to use the keyword super() in the constructor definition of class Student.
 * 5. Now lets create two Student instance objects "s1" and "s2" in the main() method of Example0.Example0 class.
 *    Have Student reference type for s1 and Person reference type for s2.
 * 6. Lets access method "ageInTenYears" for both the instance objects. What could explain the output?
 * 7. Now lets create instances s3  and s4 from s1 using a copy constructor and .clone() method respectively.
 * 8. Lets modify age of s1 and see what happens to s3 and s4. Why do you think that happened?
 */
public class Example0 {
    public static void main(String[] unused) {

    }
}
