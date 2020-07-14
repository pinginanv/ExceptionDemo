public class Main {
    public static void main(String[] args) {

        try{
            Person person = new Person();
            person.setAge(500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
