package reflect.entity;

public class User extends Person{
    private String userName;
    public int userAge;
    private String userInfo;

    public void showUserInformation(){
        System.out.println("user name is: " + userName);
        System.out.println("user age is: " + userAge);
    }
    private void privateMethod(String str, int num){
        System.out.println(str + num);
    }
    private String getUserName() {
        return userName;
    }
    private void setUserName(String mUserName) {
        this.userName = mUserName;
    }
    private int getUserAge() {
        return userAge;
    }
    private void setUserAge(int mUserAge) {
        this.userAge = mUserAge;
    }
}
