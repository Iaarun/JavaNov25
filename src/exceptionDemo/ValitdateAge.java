package exceptionDemo;

//run time exception example
public class ValitdateAge {
    public void validateAge(int age){
        if(age<18 ){
            try{
                throw new InValidAgeException("Age is not valid to vote: " + age);
            }catch (InValidAgeException e){
                e.printStackTrace();
            }
        }else {
            System.out.println("Valid age to vote: " + age);
        }
    }

    //compile time exception example
    public void validateMyAge(int age) throws InValidAgeException  {
        if(age<18){
            throw new InValidAgeException("Age is not valid to vote: " + age);
        }
    }
}
