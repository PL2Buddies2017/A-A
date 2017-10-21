
package register;

public class account {
    int username;
    int password;
    
    public int login(int dUn, int dPwd){
        if(username == dUn && password == dPwd) return 1;
        else return 0;
    }
}
